
package com.montenegro.fiscal.soap;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ApprovalType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="DiscountAmt" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="ReturnAmt" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="VATRate" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="ExemptFromVAT" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="VATAmt" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="TotalAmt" use="required" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalType")
public class ApprovalType {

    @XmlAttribute(name = "DiscountAmt")
    protected BigDecimal discountAmt;
    @XmlAttribute(name = "ReturnAmt")
    protected BigDecimal returnAmt;
    @XmlAttribute(name = "VATRate")
    protected BigDecimal vatRate;
    @XmlAttribute(name = "ExemptFromVAT")
    protected BigDecimal exemptFromVAT;
    @XmlAttribute(name = "VATAmt")
    protected BigDecimal vatAmt;
    @XmlAttribute(name = "TotalAmt", required = true)
    protected BigDecimal totalAmt;

    /**
     * Gets the value of the discountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Sets the value of the discountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmt(BigDecimal value) {
        this.discountAmt = value;
    }

    /**
     * Gets the value of the returnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnAmt() {
        return returnAmt;
    }

    /**
     * Sets the value of the returnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnAmt(BigDecimal value) {
        this.returnAmt = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATRate(BigDecimal value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the exemptFromVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExemptFromVAT() {
        return exemptFromVAT;
    }

    /**
     * Sets the value of the exemptFromVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExemptFromVAT(BigDecimal value) {
        this.exemptFromVAT = value;
    }

    /**
     * Gets the value of the vatAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATAmt() {
        return vatAmt;
    }

    /**
     * Sets the value of the vatAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATAmt(BigDecimal value) {
        this.vatAmt = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

}
