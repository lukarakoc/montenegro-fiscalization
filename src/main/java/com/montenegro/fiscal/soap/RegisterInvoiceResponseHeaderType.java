
package com.montenegro.fiscal.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterInvoiceResponseHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegisterInvoiceResponseHeaderType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="UUID" use="required" type="{https://efi.tax.gov.me/fs/schema}UUIDSType" />
 *       <attribute name="RequestUUID" use="required" type="{https://efi.tax.gov.me/fs/schema}UUIDSType" />
 *       <attribute name="SendDateTime" use="required" type="{https://efi.tax.gov.me/fs/schema}UTCSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterInvoiceResponseHeaderType")
public class RegisterInvoiceResponseHeaderType {

    @XmlAttribute(name = "UUID", required = true)
    protected String uuid;
    @XmlAttribute(name = "RequestUUID", required = true)
    protected String requestUUID;
    @XmlAttribute(name = "SendDateTime", required = true)
    protected XMLGregorianCalendar sendDateTime;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the requestUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestUUID() {
        return requestUUID;
    }

    /**
     * Sets the value of the requestUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestUUID(String value) {
        this.requestUUID = value;
    }

    /**
     * Gets the value of the sendDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDateTime() {
        return sendDateTime;
    }

    /**
     * Sets the value of the sendDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDateTime(XMLGregorianCalendar value) {
        this.sendDateTime = value;
    }

}
