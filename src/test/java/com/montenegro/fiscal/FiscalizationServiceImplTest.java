package com.montenegro.fiscal;

import com.montenegro.fiscal.model.CreateInvoiceRequest;
import com.montenegro.fiscal.model.FiscalizationResult;
import com.montenegro.fiscal.model.InvoiceItem;
import com.montenegro.fiscal.service.FiscalizationService;
import com.montenegro.fiscal.soap.BuyerType;
import com.montenegro.fiscal.soap.CountryCodeSType;
import com.montenegro.fiscal.soap.IDTypeSType;
import com.montenegro.fiscal.soap.InvoiceTSType;
import com.montenegro.fiscal.soap.PaymentMethodTypeSType;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test za metodu registerInvoice – simulira SOAP poziv i vraća fiktivni odgovor sa JIKR kodom.
 */
@SpringBootTest
class FiscalizationServiceImplTest {

  @Autowired
  private FiscalizationService fiscalizationService;

  @Test
  void testRegisterInvoice() {
    var request = new CreateInvoiceRequest();

    request.setNote("Molimo vas da platite racun u navedenom roku!");
    request.setOrderNumber(20);
    request.setPaymentMethod(PaymentMethodTypeSType.ACCOUNT); // BankTransfer
    request.setPaymentDeadline(LocalDate.now().plusDays(7));
    request.setInvoiceType(InvoiceTSType.INVOICE);

    var buyer = new BuyerType();
    buyer.setIDType(IDTypeSType.TIN);
    buyer.setIDNum("12345678");
    buyer.setName("DM Line doo");
    buyer.setCountry(CountryCodeSType.MNE);
    buyer.setAddress("9. Crnogorskog bataljona");
    buyer.setTown("Podgorica");

    request.setBuyer(buyer);

    var item1 = new InvoiceItem();
    item1.setCode("SN1");
    item1.setName("Test proizvod 1");
    item1.setUnit("kom");
    item1.setQuantity(2);
    item1.setUnitPrice(new BigDecimal("1.00"));

    var item2 = new InvoiceItem();
    item2.setCode("SN2");
    item2.setName("Test proizvod 2");
    item2.setUnit("kom");
    item2.setQuantity(1);
    item2.setUnitPrice(new BigDecimal("0.50"));

    request.setItems(Arrays.asList(item1, item2));

    FiscalizationResult result = fiscalizationService.registerInvoice(request);
    assertThat(result).isNotNull();
    System.out.println("URL: " + result.getVerificationUrl());
    System.out.println("JIKR: " + result.getJikr());
  }
}
