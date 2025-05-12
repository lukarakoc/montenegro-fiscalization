
package com.montenegro.fiscal.soap;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SameTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SameTaxType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="NumOfItems" use="required" type="{https://efi.tax.gov.me/fs/schema}IntSType" />
 *       <attribute name="PriceBefVAT" use="required" type="{https://efi.tax.gov.me/fs/schema}Decimal4NegSType" />
 *       <attribute name="VATRate" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *       <attribute name="ExemptFromVAT" type="{https://efi.tax.gov.me/fs/schema}ExemptFromVATSType" />
 *       <attribute name="VATAmt" type="{https://efi.tax.gov.me/fs/schema}Decimal4NegSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SameTaxType")
public class SameTaxType {

    @XmlAttribute(name = "NumOfItems", required = true)
    protected int numOfItems;
    @XmlAttribute(name = "PriceBefVAT", required = true)
    protected BigDecimal priceBefVAT;
    @XmlAttribute(name = "VATRate")
    protected BigDecimal vatRate;
    @XmlAttribute(name = "ExemptFromVAT")
    protected ExemptFromVATSType exemptFromVAT;
    @XmlAttribute(name = "VATAmt")
    protected BigDecimal vatAmt;

    /**
     * Gets the value of the numOfItems property.
     * 
     */
    public int getNumOfItems() {
        return numOfItems;
    }

    /**
     * Sets the value of the numOfItems property.
     * 
     */
    public void setNumOfItems(int value) {
        this.numOfItems = value;
    }

    /**
     * Gets the value of the priceBefVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceBefVAT() {
        return priceBefVAT;
    }

    /**
     * Sets the value of the priceBefVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceBefVAT(BigDecimal value) {
        this.priceBefVAT = value;
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
     *     {@link ExemptFromVATSType }
     *     
     */
    public ExemptFromVATSType getExemptFromVAT() {
        return exemptFromVAT;
    }

    /**
     * Sets the value of the exemptFromVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptFromVATSType }
     *     
     */
    public void setExemptFromVAT(ExemptFromVATSType value) {
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

}
