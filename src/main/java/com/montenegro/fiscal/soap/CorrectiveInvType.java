
package com.montenegro.fiscal.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrectiveInvType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorrectiveInvType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="IICRef" use="required" type="{https://efi.tax.gov.me/fs/schema}Hex32SType" />
 *       <attribute name="IssueDateTime" use="required" type="{https://efi.tax.gov.me/fs/schema}UTCSType" />
 *       <attribute name="Type" use="required" type="{https://efi.tax.gov.me/fs/schema}CorrectiveInvTypeSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectiveInvType")
public class CorrectiveInvType {

    @XmlAttribute(name = "IICRef", required = true)
    protected String iicRef;
    @XmlAttribute(name = "IssueDateTime", required = true)
    protected XMLGregorianCalendar issueDateTime;
    @XmlAttribute(name = "Type", required = true)
    protected CorrectiveInvTypeSType type;

    /**
     * Gets the value of the iicRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIICRef() {
        return iicRef;
    }

    /**
     * Sets the value of the iicRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIICRef(String value) {
        this.iicRef = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveInvTypeSType }
     *     
     */
    public CorrectiveInvTypeSType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveInvTypeSType }
     *     
     */
    public void setType(CorrectiveInvTypeSType value) {
        this.type = value;
    }

}
