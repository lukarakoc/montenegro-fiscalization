
package com.montenegro.fiscal.soap;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="SupplyDateOrPeriod" type="{https://efi.tax.gov.me/fs/schema}SupplyDateOrPeriodType" minOccurs="0"/>
 *         <element name="CorrectiveInv" type="{https://efi.tax.gov.me/fs/schema}CorrectiveInvType" minOccurs="0"/>
 *         <element name="PayMethods" type="{https://efi.tax.gov.me/fs/schema}PayMethodsType"/>
 *         <element name="Currency" type="{https://efi.tax.gov.me/fs/schema}CurrencyType" minOccurs="0"/>
 *         <element name="Seller" type="{https://efi.tax.gov.me/fs/schema}SellerType"/>
 *         <element name="Buyer" type="{https://efi.tax.gov.me/fs/schema}BuyerType" minOccurs="0"/>
 *         <element name="Items" type="{https://efi.tax.gov.me/fs/schema}InvoiceItemsType" minOccurs="0"/>
 *         <element name="SameTaxes" type="{https://efi.tax.gov.me/fs/schema}SameTaxesType" minOccurs="0"/>
 *         <element name="Approvals" type="{https://efi.tax.gov.me/fs/schema}ApprovalsType" minOccurs="0"/>
 *         <element name="Fees" type="{https://efi.tax.gov.me/fs/schema}FeesType" minOccurs="0"/>
 *         <element name="IICRefs" type="{https://efi.tax.gov.me/fs/schema}IICRefsType" minOccurs="0"/>
 *         <element name="BadDebtInv" type="{https://efi.tax.gov.me/fs/schema}BadDebtInvType" minOccurs="0"/>
 *       </all>
 *       <attribute name="InvType" use="required" type="{https://efi.tax.gov.me/fs/schema}InvoiceTSType" />
 *       <attribute name="TypeOfInv" use="required" type="{https://efi.tax.gov.me/fs/schema}InvoiceSType" />
 *       <attribute name="TypeOfSelfIss" type="{https://efi.tax.gov.me/fs/schema}SelfIssSType" />
 *       <attribute name="IssueDateTime" use="required" type="{https://efi.tax.gov.me/fs/schema}UTCSType" />
 *       <attribute name="InvNum" use="required" type="{https://efi.tax.gov.me/fs/schema}InvNumSType" />
 *       <attribute name="InvOrdNum" use="required" type="{https://efi.tax.gov.me/fs/schema}IntSType" />
 *       <attribute name="TCRCode" use="required" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType" />
 *       <attribute name="IsIssuerInVAT" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TaxFreeAmt" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="MarkUpAmt" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="GoodsExAmt" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="TotPriceWoVAT" use="required" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="TotVATAmt" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="TotPrice" use="required" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="TotPriceToPay" type="{https://efi.tax.gov.me/fs/schema}DecimalSType" />
 *       <attribute name="OperatorCode" use="required" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType" />
 *       <attribute name="BusinUnitCode" use="required" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType" />
 *       <attribute name="SoftCode" use="required" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType" />
 *       <attribute name="IIC" use="required" type="{https://efi.tax.gov.me/fs/schema}Hex32SType" />
 *       <attribute name="IICSignature" use="required" type="{https://efi.tax.gov.me/fs/schema}Hex512SType" />
 *       <attribute name="IsReverseCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PayDeadline" type="{https://efi.tax.gov.me/fs/schema}DateSType" />
 *       <attribute name="ParagonBlockNum" type="{https://efi.tax.gov.me/fs/schema}String20SType" />
 *       <attribute name="TaxPeriod" type="{https://efi.tax.gov.me/fs/schema}TaxPeriodSType" />
 *       <attribute name="BankAccNum" type="{https://efi.tax.gov.me/fs/schema}String50SType" />
 *       <attribute name="Note" type="{https://efi.tax.gov.me/fs/schema}String200SType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceType", propOrder = {

})
public class InvoiceType {

    @XmlElement(name = "SupplyDateOrPeriod")
    protected SupplyDateOrPeriodType supplyDateOrPeriod;
    @XmlElement(name = "CorrectiveInv")
    protected CorrectiveInvType correctiveInv;
    @XmlElement(name = "PayMethods", required = true)
    protected PayMethodsType payMethods;
    @XmlElement(name = "Currency")
    protected CurrencyType currency;
    @XmlElement(name = "Seller", required = true)
    protected SellerType seller;
    @XmlElement(name = "Buyer")
    protected BuyerType buyer;
    @XmlElement(name = "Items")
    protected InvoiceItemsType items;
    @XmlElement(name = "SameTaxes")
    protected SameTaxesType sameTaxes;
    @XmlElement(name = "Approvals")
    protected ApprovalsType approvals;
    @XmlElement(name = "Fees")
    protected FeesType fees;
    @XmlElement(name = "IICRefs")
    protected IICRefsType iicRefs;
    @XmlElement(name = "BadDebtInv")
    protected BadDebtInvType badDebtInv;
    @XmlAttribute(name = "InvType", required = true)
    protected InvoiceTSType invType;
    @XmlAttribute(name = "TypeOfInv", required = true)
    protected InvoiceSType typeOfInv;
    @XmlAttribute(name = "TypeOfSelfIss")
    protected SelfIssSType typeOfSelfIss;
    @XmlAttribute(name = "IssueDateTime", required = true)
    protected XMLGregorianCalendar issueDateTime;
    @XmlAttribute(name = "InvNum", required = true)
    protected String invNum;
    @XmlAttribute(name = "InvOrdNum", required = true)
    protected int invOrdNum;
    @XmlAttribute(name = "TCRCode", required = true)
    protected String tcrCode;
    @XmlAttribute(name = "IsIssuerInVAT", required = true)
    protected boolean isIssuerInVAT;
    @XmlAttribute(name = "TaxFreeAmt")
    protected BigDecimal taxFreeAmt;
    @XmlAttribute(name = "MarkUpAmt")
    protected BigDecimal markUpAmt;
    @XmlAttribute(name = "GoodsExAmt")
    protected BigDecimal goodsExAmt;
    @XmlAttribute(name = "TotPriceWoVAT", required = true)
    protected BigDecimal totPriceWoVAT;
    @XmlAttribute(name = "TotVATAmt")
    protected BigDecimal totVATAmt;
    @XmlAttribute(name = "TotPrice", required = true)
    protected BigDecimal totPrice;
    @XmlAttribute(name = "TotPriceToPay")
    protected BigDecimal totPriceToPay;
    @XmlAttribute(name = "OperatorCode", required = true)
    protected String operatorCode;
    @XmlAttribute(name = "BusinUnitCode", required = true)
    protected String businUnitCode;
    @XmlAttribute(name = "SoftCode", required = true)
    protected String softCode;
    @XmlAttribute(name = "IIC", required = true)
    protected String iic;
    @XmlAttribute(name = "IICSignature", required = true)
    protected String iicSignature;
    @XmlAttribute(name = "IsReverseCharge")
    protected Boolean isReverseCharge;
    @XmlAttribute(name = "PayDeadline")
    protected XMLGregorianCalendar payDeadline;
    @XmlAttribute(name = "ParagonBlockNum")
    protected String paragonBlockNum;
    @XmlAttribute(name = "TaxPeriod")
    protected String taxPeriod;
    @XmlAttribute(name = "BankAccNum")
    protected String bankAccNum;
    @XmlAttribute(name = "Note")
    protected String note;

    /**
     * Gets the value of the supplyDateOrPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyDateOrPeriodType }
     *     
     */
    public SupplyDateOrPeriodType getSupplyDateOrPeriod() {
        return supplyDateOrPeriod;
    }

    /**
     * Sets the value of the supplyDateOrPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyDateOrPeriodType }
     *     
     */
    public void setSupplyDateOrPeriod(SupplyDateOrPeriodType value) {
        this.supplyDateOrPeriod = value;
    }

    /**
     * Gets the value of the correctiveInv property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveInvType }
     *     
     */
    public CorrectiveInvType getCorrectiveInv() {
        return correctiveInv;
    }

    /**
     * Sets the value of the correctiveInv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveInvType }
     *     
     */
    public void setCorrectiveInv(CorrectiveInvType value) {
        this.correctiveInv = value;
    }

    /**
     * Gets the value of the payMethods property.
     * 
     * @return
     *     possible object is
     *     {@link PayMethodsType }
     *     
     */
    public PayMethodsType getPayMethods() {
        return payMethods;
    }

    /**
     * Sets the value of the payMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayMethodsType }
     *     
     */
    public void setPayMethods(PayMethodsType value) {
        this.payMethods = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link SellerType }
     *     
     */
    public SellerType getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerType }
     *     
     */
    public void setSeller(SellerType value) {
        this.seller = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerType }
     *     
     */
    public BuyerType getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerType }
     *     
     */
    public void setBuyer(BuyerType value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceItemsType }
     *     
     */
    public InvoiceItemsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceItemsType }
     *     
     */
    public void setItems(InvoiceItemsType value) {
        this.items = value;
    }

    /**
     * Gets the value of the sameTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link SameTaxesType }
     *     
     */
    public SameTaxesType getSameTaxes() {
        return sameTaxes;
    }

    /**
     * Sets the value of the sameTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameTaxesType }
     *     
     */
    public void setSameTaxes(SameTaxesType value) {
        this.sameTaxes = value;
    }

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalsType }
     *     
     */
    public ApprovalsType getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalsType }
     *     
     */
    public void setApprovals(ApprovalsType value) {
        this.approvals = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the iicRefs property.
     * 
     * @return
     *     possible object is
     *     {@link IICRefsType }
     *     
     */
    public IICRefsType getIICRefs() {
        return iicRefs;
    }

    /**
     * Sets the value of the iicRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IICRefsType }
     *     
     */
    public void setIICRefs(IICRefsType value) {
        this.iicRefs = value;
    }

    /**
     * Gets the value of the badDebtInv property.
     * 
     * @return
     *     possible object is
     *     {@link BadDebtInvType }
     *     
     */
    public BadDebtInvType getBadDebtInv() {
        return badDebtInv;
    }

    /**
     * Sets the value of the badDebtInv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BadDebtInvType }
     *     
     */
    public void setBadDebtInv(BadDebtInvType value) {
        this.badDebtInv = value;
    }

    /**
     * Gets the value of the invType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTSType }
     *     
     */
    public InvoiceTSType getInvType() {
        return invType;
    }

    /**
     * Sets the value of the invType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTSType }
     *     
     */
    public void setInvType(InvoiceTSType value) {
        this.invType = value;
    }

    /**
     * Gets the value of the typeOfInv property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSType }
     *     
     */
    public InvoiceSType getTypeOfInv() {
        return typeOfInv;
    }

    /**
     * Sets the value of the typeOfInv property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSType }
     *     
     */
    public void setTypeOfInv(InvoiceSType value) {
        this.typeOfInv = value;
    }

    /**
     * Gets the value of the typeOfSelfIss property.
     * 
     * @return
     *     possible object is
     *     {@link SelfIssSType }
     *     
     */
    public SelfIssSType getTypeOfSelfIss() {
        return typeOfSelfIss;
    }

    /**
     * Sets the value of the typeOfSelfIss property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelfIssSType }
     *     
     */
    public void setTypeOfSelfIss(SelfIssSType value) {
        this.typeOfSelfIss = value;
    }

    /**
     * Gets the value of the issueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * Sets the value of the issueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDateTime(XMLGregorianCalendar value) {
        this.issueDateTime = value;
    }

    /**
     * Gets the value of the invNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvNum() {
        return invNum;
    }

    /**
     * Sets the value of the invNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvNum(String value) {
        this.invNum = value;
    }

    /**
     * Gets the value of the invOrdNum property.
     * 
     */
    public int getInvOrdNum() {
        return invOrdNum;
    }

    /**
     * Sets the value of the invOrdNum property.
     * 
     */
    public void setInvOrdNum(int value) {
        this.invOrdNum = value;
    }

    /**
     * Gets the value of the tcrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRCode() {
        return tcrCode;
    }

    /**
     * Sets the value of the tcrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCRCode(String value) {
        this.tcrCode = value;
    }

    /**
     * Gets the value of the isIssuerInVAT property.
     * 
     */
    public boolean isIsIssuerInVAT() {
        return isIssuerInVAT;
    }

    /**
     * Sets the value of the isIssuerInVAT property.
     * 
     */
    public void setIsIssuerInVAT(boolean value) {
        this.isIssuerInVAT = value;
    }

    /**
     * Gets the value of the taxFreeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxFreeAmt() {
        return taxFreeAmt;
    }

    /**
     * Sets the value of the taxFreeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxFreeAmt(BigDecimal value) {
        this.taxFreeAmt = value;
    }

    /**
     * Gets the value of the markUpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkUpAmt() {
        return markUpAmt;
    }

    /**
     * Sets the value of the markUpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkUpAmt(BigDecimal value) {
        this.markUpAmt = value;
    }

    /**
     * Gets the value of the goodsExAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGoodsExAmt() {
        return goodsExAmt;
    }

    /**
     * Sets the value of the goodsExAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGoodsExAmt(BigDecimal value) {
        this.goodsExAmt = value;
    }

    /**
     * Gets the value of the totPriceWoVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotPriceWoVAT() {
        return totPriceWoVAT;
    }

    /**
     * Sets the value of the totPriceWoVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotPriceWoVAT(BigDecimal value) {
        this.totPriceWoVAT = value;
    }

    /**
     * Gets the value of the totVATAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotVATAmt() {
        return totVATAmt;
    }

    /**
     * Sets the value of the totVATAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotVATAmt(BigDecimal value) {
        this.totVATAmt = value;
    }

    /**
     * Gets the value of the totPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotPrice() {
        return totPrice;
    }

    /**
     * Sets the value of the totPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotPrice(BigDecimal value) {
        this.totPrice = value;
    }

    /**
     * Gets the value of the totPriceToPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotPriceToPay() {
        return totPriceToPay;
    }

    /**
     * Sets the value of the totPriceToPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotPriceToPay(BigDecimal value) {
        this.totPriceToPay = value;
    }

    /**
     * Gets the value of the operatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Sets the value of the operatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Gets the value of the businUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinUnitCode() {
        return businUnitCode;
    }

    /**
     * Sets the value of the businUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinUnitCode(String value) {
        this.businUnitCode = value;
    }

    /**
     * Gets the value of the softCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftCode() {
        return softCode;
    }

    /**
     * Sets the value of the softCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftCode(String value) {
        this.softCode = value;
    }

    /**
     * Gets the value of the iic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIIC() {
        return iic;
    }

    /**
     * Sets the value of the iic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIIC(String value) {
        this.iic = value;
    }

    /**
     * Gets the value of the iicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIICSignature() {
        return iicSignature;
    }

    /**
     * Sets the value of the iicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIICSignature(String value) {
        this.iicSignature = value;
    }

    /**
     * Gets the value of the isReverseCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReverseCharge() {
        return isReverseCharge;
    }

    /**
     * Sets the value of the isReverseCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReverseCharge(Boolean value) {
        this.isReverseCharge = value;
    }

    /**
     * Gets the value of the payDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDeadline() {
        return payDeadline;
    }

    /**
     * Sets the value of the payDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDeadline(XMLGregorianCalendar value) {
        this.payDeadline = value;
    }

    /**
     * Gets the value of the paragonBlockNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParagonBlockNum() {
        return paragonBlockNum;
    }

    /**
     * Sets the value of the paragonBlockNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParagonBlockNum(String value) {
        this.paragonBlockNum = value;
    }

    /**
     * Gets the value of the taxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Sets the value of the taxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPeriod(String value) {
        this.taxPeriod = value;
    }

    /**
     * Gets the value of the bankAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccNum() {
        return bankAccNum;
    }

    /**
     * Sets the value of the bankAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccNum(String value) {
        this.bankAccNum = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
