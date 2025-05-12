package com.montenegro.fiscal.service;

import com.montenegro.fiscal.config.FiscalizationProperties;
import com.montenegro.fiscal.exception.InvalidInvoiceException;
import com.montenegro.fiscal.exception.ServiceCommunicationException;
import com.montenegro.fiscal.model.CashDeposit;
import com.montenegro.fiscal.model.CreateInvoiceRequest;
import com.montenegro.fiscal.model.FiscalizationResult;
import com.montenegro.fiscal.model.InvoiceItem;
import com.montenegro.fiscal.model.TcrInfo;
import com.montenegro.fiscal.model.Vat;
import com.montenegro.fiscal.soap.CorrectiveInvType;
import com.montenegro.fiscal.soap.CorrectiveInvTypeSType;
import com.montenegro.fiscal.soap.CountryCodeSType;
import com.montenegro.fiscal.soap.ExemptFromVATSType;
import com.montenegro.fiscal.soap.IDTypeSType;
import com.montenegro.fiscal.soap.InvoiceItemType;
import com.montenegro.fiscal.soap.InvoiceItemsType;
import com.montenegro.fiscal.soap.InvoiceSType;
import com.montenegro.fiscal.soap.InvoiceTSType;
import com.montenegro.fiscal.soap.InvoiceType;
import com.montenegro.fiscal.soap.PayMethodType;
import com.montenegro.fiscal.soap.PayMethodsType;
import com.montenegro.fiscal.soap.PaymentMethodTypeSType;
import com.montenegro.fiscal.soap.RegisterCashDepositRequest;
import com.montenegro.fiscal.soap.RegisterInvoiceRequest;
import com.montenegro.fiscal.soap.RegisterInvoiceRequestHeaderType;
import com.montenegro.fiscal.soap.RegisterInvoiceResponse;
import com.montenegro.fiscal.soap.RegisterTCRRequest;
import com.montenegro.fiscal.soap.RegisterTCRResponse;
import com.montenegro.fiscal.soap.SameTaxType;
import com.montenegro.fiscal.soap.SameTaxesType;
import com.montenegro.fiscal.soap.SellerType;
import com.montenegro.fiscal.util.DateTimeUtil;
import com.montenegro.fiscal.util.IICGenerator;
import com.montenegro.fiscal.util.KeyStoreLoader;
import com.montenegro.fiscal.util.XSDValidator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.PrivateKey;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import java.util.UUID;
import org.w3c.dom.Document;

/**
 * Implementation of the FiscalizationService interface that handles communication with the fiscal
 * service for invoice registration, TCR registration, and cash deposit operations. This service is
 * responsible for creating, signing, and sending SOAP requests to the fiscal service.
 */
@Service
@RequiredArgsConstructor
public class FiscalizationServiceImpl implements FiscalizationService {

  private final FiscalizationProperties props;
  private final WebServiceTemplate wsTemplate;
  private final Jaxb2Marshaller marshaller;
  private final PrivateKey privateKey;
  private final XmlSignatureService xmlSignatureService;

  /**
   * Constructor for FiscalizationServiceImpl.
   *
   * @param props               The fiscalization properties containing configuration settings
   * @param wsTemplate          The web service template used for SOAP communication
   * @param marshaller          The JAXB marshaller used for XML serialization/deserialization
   * @param xmlSignatureService The service used for signing XML documents
   */
  @Autowired
  public FiscalizationServiceImpl(FiscalizationProperties props,
      WebServiceTemplate wsTemplate,
      Jaxb2Marshaller marshaller,
      XmlSignatureService xmlSignatureService) {
    this.props = props;
    this.wsTemplate = wsTemplate;
    this.marshaller = marshaller;
    this.privateKey = KeyStoreLoader.getPrivateKey(props);
    this.xmlSignatureService = xmlSignatureService;
  }

  /**
   * Registers an invoice with the fiscal service. This method creates a SOAP request with the
   * invoice data, signs it, and sends it to the fiscal service. It then processes the response and
   * returns a FiscalizationResult containing the FIC code and timestamp.
   *
   * @param request The CreateInvoiceRequest containing all necessary invoice data
   * @return FiscalizationResult containing the FIC code (JIKR) and timestamp from the response
   * @throws InvalidInvoiceException       if the request does not contain any items
   * @throws ServiceCommunicationException if there is an error communicating with the fiscal
   *                                       service
   */
  @Override
  public FiscalizationResult registerInvoice(CreateInvoiceRequest request) {
    if (request.getItems() == null || request.getItems().isEmpty()) {
      throw new InvalidInvoiceException("Invoice does not contain items");
    }

    var currentDateTime = LocalDateTime.now();

    // Invoice items and price calculations
    var invoiceItems = mapInvoiceItems(request.getItems());
    var totalPrice = invoiceItems.getI().stream().map(InvoiceItemType::getPA)
        .reduce(BigDecimal.ZERO, BigDecimal::add)
        .setScale(2, RoundingMode.HALF_UP);
    var totalVatAmount = invoiceItems.getI().stream().map(InvoiceItemType::getVA)
        .reduce(BigDecimal.ZERO, BigDecimal::add)
        .setScale(2, RoundingMode.HALF_UP);
    var totalPriceWithoutVat = invoiceItems.getI().stream().map(InvoiceItemType::getPB)
        .reduce(BigDecimal.ZERO, BigDecimal::add)
        .setScale(2, RoundingMode.HALF_UP);

    // IIC data (IKOF)
    var iicData = IICGenerator.generate(request.getOrderNumber(), currentDateTime, props,
        totalPrice, privateKey);

    // Fiscalization request
    var fiscalizationRequest = new RegisterInvoiceRequest();
    fiscalizationRequest.setId("Request");
    fiscalizationRequest.setVersion(1);

    // Fiscalization request header
    var header = new RegisterInvoiceRequestHeaderType();
    header.setUUID(UUID.randomUUID().toString());
    header.setSendDateTime(DateTimeUtil.toXMLGregorianCalendarNoMiliSeconds(currentDateTime));
    fiscalizationRequest.setHeader(header);

    // Fiscalization request invoice
    var invoice = new InvoiceType();
    invoice.setInvType(request.getInvoiceType());
    invoice.setTypeOfInv(InvoiceSType.NONCASH);
    invoice.setIssueDateTime(DateTimeUtil.toXMLGregorianCalendarNoMiliSeconds(currentDateTime));
    invoice.setInvNum(generateInvoiceNumber(request, currentDateTime));
    invoice.setInvOrdNum(request.getOrderNumber());
    invoice.setTCRCode(props.getTcrCode()); // ENU code
    invoice.setIsIssuerInVAT(true);
    invoice.setTotPriceWoVAT(totalPriceWithoutVat);
    invoice.setTotVATAmt(totalVatAmount);
    invoice.setTotPrice(totalPrice);
    invoice.setOperatorCode(props.getOperatorCode());
    invoice.setBusinUnitCode(props.getBusinessUnitCode());
    invoice.setSoftCode(props.getSoftCode());
    invoice.setIIC(iicData.getIicHex());
    invoice.setIICSignature(iicData.getSignatureHex());
    invoice.setTaxPeriod(String.format("%02d/%d", currentDateTime.getMonth().getValue(),
        currentDateTime.getYear()));
    invoice.setNote(request.getNote());
    invoice.setBankAccNum(props.getBankAccountNumber());
    invoice.setPayDeadline(
        DateTimeUtil.parseLocalDateToXMLGregorianCalendar(request.getPaymentDeadline()));
    invoice.setTotPriceToPay(totalPrice);
    invoice.setPayMethods(generatePayMethods(request.getPaymentMethod(), totalPrice));
    invoice.setSeller(getSellerInformation());
    invoice.setBuyer(request.getBuyer());
    invoice.setItems(invoiceItems);
    invoice.setSameTaxes(calculateSameTaxes(invoiceItems.getI()));
    invoice.setCorrectiveInv(getCorrectiveInvoice(request));

    fiscalizationRequest.setInvoice(invoice);

    DOMResult domReq = new DOMResult();
    marshaller.marshal(fiscalizationRequest, domReq);
    Document doc = (Document) domReq.getNode();

    Document signedDoc = xmlSignatureService.signDocument(doc);

    if (props.isValidateXml()) {
      XSDValidator.validate(new DOMSource(signedDoc), "wsdl/eficg-fiscalization-service.xsd");
    }

    DOMResult domResp = new DOMResult();
    wsTemplate.sendSourceAndReceiveToResult(
        new DOMSource(signedDoc),
        domResp
    );

    Document respDoc = (Document) domResp.getNode();
    try {

      RegisterInvoiceResponse fiscalizationResponse = (RegisterInvoiceResponse)
          marshaller.createUnmarshaller().unmarshal(respDoc);

      var result = new FiscalizationResult();
      result.setJikr(fiscalizationResponse.getFIC());
      result.setTimestamp(DateTimeUtil.toOffsetDateTime(
          fiscalizationResponse.getHeader().getSendDateTime()
      ));
      result.setVerificationUrl(prepareVerificationUrl(props,
          iicData.getIicHex(),
          currentDateTime,
          request.getOrderNumber(),
          totalPrice
      ));
      return result;
    } catch (Exception e) {
      throw new ServiceCommunicationException(
          "An error occurred while communicating with EFI service", e);
    }
  }

  /**
   * Prepares the verification URL for the fiscalization result. This method constructs a URL with
   * query parameters containing the necessary information for verifying the invoice.
   *
   * @param props           The fiscalization properties containing configuration settings
   * @param iic             The IIC (IKOF) code generated for the invoice
   * @param currentDateTime The current date and time used for generating the URL
   * @param orderNumber     The order number associated with the invoice
   * @param totalPrice      The total price of the invoice
   * @return String containing the verification URL with query parameters
   */
  private String prepareVerificationUrl(FiscalizationProperties props, String iic,
      LocalDateTime currentDateTime, Integer orderNumber, BigDecimal totalPrice) {
    var queryParams = Map.of(
        "tin", props.getPib(),
        "iic", iic,
        "crtd", DateTimeUtil.toXMLGregorianCalendarNoMiliSeconds(currentDateTime),
        "ord", orderNumber,
        "bu", props.getBusinessUnitCode(),
        "cr", props.getTcrCode(),
        "sw", props.getSoftCode(),
        "prc", totalPrice

    );
    var queryString = queryParams.entrySet().stream()
        .map(entry -> entry.getKey() + "=" + entry.getValue())
        .collect(Collectors.joining("&"));

    return props.getVerificationUrl() + "ic/#/verify?" + queryString;
  }

  /**
   * Creates a CorrectiveInvType object for corrective invoices. This method is used when the
   * invoice type is CORRECTIVE to include information about the original invoice.
   *
   * @param request The CreateInvoiceRequest containing information about the original invoice
   * @return CorrectiveInvType object with reference to the original invoice, or null if not a
   * corrective invoice
   */
  private CorrectiveInvType getCorrectiveInvoice(CreateInvoiceRequest request) {
    if (request.getInvoiceType().equals(InvoiceTSType.CORRECTIVE)) {
      var correctiveInv = new CorrectiveInvType();
      correctiveInv.setIICRef(request.getOriginal().id());
      correctiveInv.setType(CorrectiveInvTypeSType.CORRECTIVE);
      correctiveInv.setIssueDateTime(
          DateTimeUtil.toXMLGregorianCalendarNoMiliSeconds(request.getOriginal().issuedAt()));
      return correctiveInv;
    } else {
      return null;
    }
  }

  /**
   * Calculates the same tax groups for invoice items. This method groups invoice items by VAT rate
   * and exemption reason, then calculates the total VAT amount, total price before VAT, and number
   * of items for each group.
   *
   * @param invoiceItems List of invoice items to group and calculate taxes for
   * @return SameTaxesType object containing tax groups with their respective totals
   */
  public SameTaxesType calculateSameTaxes(List<InvoiceItemType> invoiceItems) {
    var sameTaxes = new SameTaxesType();
    var sameTax = invoiceItems.stream()
        .collect(Collectors.groupingBy(item -> new Vat(
            item.getVR(),
            item.getEX()
        )))
        .entrySet()
        .stream()
        .map(entry -> {
          var key = entry.getKey();
          var groupItems = entry.getValue();

          var vatAmount = groupItems.stream()
              .map(InvoiceItemType::getVA)
              .reduce(BigDecimal.ZERO, BigDecimal::add)
              .setScale(2, RoundingMode.HALF_UP);

          var priceBeforeVat = groupItems.stream()
              .map(InvoiceItemType::getPB)
              .reduce(BigDecimal.ZERO, BigDecimal::add)
              .setScale(2, RoundingMode.HALF_UP);

          int totalItems = groupItems.size();

          var sameTaxType = new SameTaxType();
          sameTaxType.setExemptFromVAT(key.getVatExemptionReason());
          sameTaxType.setVATAmt(vatAmount);
          sameTaxType.setPriceBefVAT(priceBeforeVat);
          sameTaxType.setNumOfItems(totalItems);
          sameTaxType.setVATRate(key.getVatPercentage());

          return sameTaxType;
        })
        .toList();
    sameTaxes.getSameTax().addAll(sameTax);
    return sameTaxes;
  }

  /**
   * Creates a SellerType object with the seller's information. This method uses the configuration
   * properties to populate the seller's details such as name, address, tax ID, etc.
   *
   * @return SellerType object containing the seller's information
   */
  private SellerType getSellerInformation() {
    var seller = new SellerType();
    seller.setIDType(IDTypeSType.TIN);
    seller.setName(props.getCompanyName());
    seller.setAddress(props.getCompanyAddress());
    seller.setIDNum(props.getPib());
    seller.setTown(props.getCompanyCity());
    seller.setCountry(CountryCodeSType.MNE);
    return seller;
  }

  /**
   * Generates a formatted invoice number. The invoice number is created by joining the business
   * unit code, order number, current year, and TCR code with forward slashes.
   *
   * @param request         The CreateInvoiceRequest containing the order number
   * @param currentDateTime The current date and time used to extract the year
   * @return String containing the formatted invoice number
   */
  private String generateInvoiceNumber(CreateInvoiceRequest request,
      LocalDateTime currentDateTime) {
    return String.join("/",
        props.getBusinessUnitCode(),
        request.getOrderNumber().toString(),
        String.valueOf(currentDateTime.getYear()),
        props.getTcrCode()
    );
  }

  /**
   * Generates a PayMethodsType object with payment method information. This method creates a
   * payment method with the specified type and total price.
   *
   * @param method     The payment method type (e.g., CASH, CARD, ACCOUNT)
   * @param totalPrice The total price to be paid using this payment method
   * @return PayMethodsType object containing the payment method information
   */
  private PayMethodsType generatePayMethods(PaymentMethodTypeSType method, BigDecimal totalPrice) {
    var payMethod = new PayMethodType();
    payMethod.setType(method);
    payMethod.setAmt(totalPrice);
    var payMethods = new PayMethodsType();
    payMethods.getPayMethod().add(payMethod);
    return payMethods;
  }

  /**
   * Maps a list of InvoiceItem objects to an InvoiceItemsType object. This method converts the
   * application's internal invoice item representation to the SOAP service's XML representation,
   * calculating various price fields in the process.
   *
   * @param requestItems List of InvoiceItem objects to be mapped
   * @return InvoiceItemsType object containing the mapped invoice items
   */
  private InvoiceItemsType mapInvoiceItems(List<InvoiceItem> requestItems) {
    var defaultVatPercentage = new BigDecimal("21.00");
    var items = requestItems.stream()
        .map(item -> {
          InvoiceItemType xmlItem = new InvoiceItemType();
          xmlItem.setC(item.getCode()); // code
          xmlItem.setN(item.getName()); // name
          xmlItem.setQ(item.getQuantity()); // quantity
          xmlItem.setU(item.getUnit()); // unit
          xmlItem.setUPB(item.getUnitPrice()); // unit price
          xmlItem.setVR(item.getVatRate() != null ? item.getVatRate()
              : defaultVatPercentage); // vat percentage
          xmlItem.setEX(item.getVatExemptionReason() != null ? ExemptFromVATSType.valueOf(
              item.getVatExemptionReason()) : null);

          xmlItem.setUPA(calculateUnitPriceAfterVat(item.getUnitPrice(),
              xmlItem.getVR())); // unit price after vat
          xmlItem.setPB(item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity()))
              .setScale(2, RoundingMode.HALF_UP)); // total price before vat
          xmlItem.setPA(xmlItem.getUPA()
              .multiply(BigDecimal.valueOf(item.getQuantity()))
              .setScale(2, RoundingMode.HALF_UP)); // total price after vat
          xmlItem.setVA(xmlItem.getPA().subtract(xmlItem.getPB())); // total vat amount

          return xmlItem;
        })
        .toList();
    var invoiceItems = new InvoiceItemsType();
    invoiceItems.getI().addAll(items);
    return invoiceItems;
  }

  /**
   * Calculates the unit price after VAT is applied. This method takes a unit price before VAT and a
   * VAT percentage, calculates the VAT amount, and adds it to the original price.
   *
   * @param upb        The unit price before VAT
   * @param percentage The VAT percentage to apply
   * @return BigDecimal representing the unit price after VAT, scaled to 2 decimal places
   */
  private BigDecimal calculateUnitPriceAfterVat(BigDecimal upb, BigDecimal percentage) {
    var increase = upb.multiply(percentage)
        .divide(new BigDecimal("100"), RoundingMode.HALF_UP);

    return upb.add(increase).setScale(2, RoundingMode.HALF_UP);
  }

  /**
   * Registers a Tax Cash Register (TCR) with the fiscal service. This method creates a SOAP request
   * with the TCR information, sends it to the fiscal service, and returns the TCR code from the
   * response.
   *
   * @param info The TcrInfo object containing all necessary TCR registration data
   * @return String containing the TCR code from the response
   * @throws ServiceCommunicationException if there is an error communicating with the fiscal
   *                                       service
   */
  @Override
  public String registerTCR(TcrInfo info) {
    try {
      var req = new RegisterTCRRequest();
      req.setId("Request");
      req.setVersion(1);
      var resp =
          (RegisterTCRResponse) wsTemplate.marshalSendAndReceive(req);
      return resp.getTCRCode();
    } catch (Exception e) {
      throw new ServiceCommunicationException("Greška pri registraciji ENU", e);
    }
  }

  /**
   * Registers a cash deposit with the fiscal service. This method creates a SOAP request with the
   * cash deposit information and sends it to the fiscal service. It can be used for both initial
   * deposits and withdrawals.
   *
   * @param cd The CashDeposit object containing all necessary cash deposit data
   * @throws ServiceCommunicationException if there is an error communicating with the fiscal
   *                                       service
   */
  @Override
  public void registerCashDeposit(CashDeposit cd) {
    try {
      var req = new RegisterCashDepositRequest();
      req.setId("Request");
      req.setVersion(1);
      // popuniti Header i CashDeposit element prema cd
      // ...
      wsTemplate.marshalSendAndReceive(req);
    } catch (Exception e) {
      throw new ServiceCommunicationException("Greška pri registraciji depozita", e);
    }
  }
}
