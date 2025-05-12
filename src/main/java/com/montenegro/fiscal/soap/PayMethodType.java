
package com.montenegro.fiscal.soap;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PayMethodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vouchers" type="{https://efi.tax.gov.me/fs/schema}VouchersType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Type" use="required" type="{https://efi.tax.gov.me/fs/schema}PaymentMethodTypeSType" />
 *       <attribute name="Amt" use="required" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="CompCard" type="{https://efi.tax.gov.me/fs/schema}String50SType" />
 *       <attribute name="AdvIIC" type="{https://efi.tax.gov.me/fs/schema}Hex32SType" />
 *       <attribute name="BankAcc" type="{https://efi.tax.gov.me/fs/schema}String50SType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayMethodType", propOrder = {
    "vouchers"
})
public class PayMethodType {

    @XmlElement(name = "Vouchers")
    protected VouchersType vouchers;
    @XmlAttribute(name = "Type", required = true)
    protected PaymentMethodTypeSType type;
    @XmlAttribute(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlAttribute(name = "CompCard")
    protected String compCard;
    @XmlAttribute(name = "AdvIIC")
    protected String advIIC;
    @XmlAttribute(name = "BankAcc")
    protected String bankAcc;

    /**
     * Gets the value of the vouchers property.
     * 
     * @return
     *     possible object is
     *     {@link VouchersType }
     *     
     */
    public VouchersType getVouchers() {
        return vouchers;
    }

    /**
     * Sets the value of the vouchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link VouchersType }
     *     
     */
    public void setVouchers(VouchersType value) {
        this.vouchers = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodTypeSType }
     *     
     */
    public PaymentMethodTypeSType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodTypeSType }
     *     
     */
    public void setType(PaymentMethodTypeSType value) {
        this.type = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the compCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompCard() {
        return compCard;
    }

    /**
     * Sets the value of the compCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompCard(String value) {
        this.compCard = value;
    }

    /**
     * Gets the value of the advIIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvIIC() {
        return advIIC;
    }

    /**
     * Sets the value of the advIIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvIIC(String value) {
        this.advIIC = value;
    }

    /**
     * Gets the value of the bankAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcc() {
        return bankAcc;
    }

    /**
     * Sets the value of the bankAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcc(String value) {
        this.bankAcc = value;
    }

}
