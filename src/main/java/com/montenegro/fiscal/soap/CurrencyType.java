
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Code" use="required" type="{https://efi.tax.gov.me/fs/schema}CurrencyCodeSType" />
 *       <attribute name="ExRate" use="required" type="{https://efi.tax.gov.me/fs/schema}DoubleSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyType")
public class CurrencyType {

    @XmlAttribute(name = "Code", required = true)
    protected CurrencyCodeSType code;
    @XmlAttribute(name = "ExRate", required = true)
    protected double exRate;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeSType }
     *     
     */
    public CurrencyCodeSType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeSType }
     *     
     */
    public void setCode(CurrencyCodeSType value) {
        this.code = value;
    }

    /**
     * Gets the value of the exRate property.
     * 
     */
    public double getExRate() {
        return exRate;
    }

    /**
     * Sets the value of the exRate property.
     * 
     */
    public void setExRate(double value) {
        this.exRate = value;
    }

}
