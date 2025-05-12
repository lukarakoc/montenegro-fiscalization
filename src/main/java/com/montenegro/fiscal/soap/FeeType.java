
package com.montenegro.fiscal.soap;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FeeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Type" use="required" type="{https://efi.tax.gov.me/fs/schema}FeeTypeSType" />
 *       <attribute name="Amt" use="required" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType")
public class FeeType {

    @XmlAttribute(name = "Type", required = true)
    protected FeeTypeSType type;
    @XmlAttribute(name = "Amt", required = true)
    protected BigDecimal amt;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FeeTypeSType }
     *     
     */
    public FeeTypeSType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeTypeSType }
     *     
     */
    public void setType(FeeTypeSType value) {
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

}
