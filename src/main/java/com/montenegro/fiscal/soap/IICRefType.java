
package com.montenegro.fiscal.soap;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IICRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IICRefType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="IIC" use="required" type="{https://efi.tax.gov.me/fs/schema}Hex32SType" />
 *       <attribute name="IssueDateTime" use="required" type="{https://efi.tax.gov.me/fs/schema}UTCSType" />
 *       <attribute name="Amount" use="required" type="{https://efi.tax.gov.me/fs/schema}DecimalNegSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IICRefType")
public class IICRefType {

    @XmlAttribute(name = "IIC", required = true)
    protected String iic;
    @XmlAttribute(name = "IssueDateTime", required = true)
    protected XMLGregorianCalendar issueDateTime;
    @XmlAttribute(name = "Amount", required = true)
    protected BigDecimal amount;

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
