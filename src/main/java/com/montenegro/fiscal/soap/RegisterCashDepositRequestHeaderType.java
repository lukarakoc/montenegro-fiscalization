
package com.montenegro.fiscal.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterCashDepositRequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegisterCashDepositRequestHeaderType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="UUID" use="required" type="{https://efi.tax.gov.me/fs/schema}UUIDSType" />
 *       <attribute name="SendDateTime" use="required" type="{https://efi.tax.gov.me/fs/schema}UTCSType" />
 *       <attribute name="SubseqDelivType" type="{https://efi.tax.gov.me/fs/schema}SubseqDelivTypeSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterCashDepositRequestHeaderType")
public class RegisterCashDepositRequestHeaderType {

    @XmlAttribute(name = "UUID", required = true)
    protected String uuid;
    @XmlAttribute(name = "SendDateTime", required = true)
    protected XMLGregorianCalendar sendDateTime;
    @XmlAttribute(name = "SubseqDelivType")
    protected SubseqDelivTypeSType subseqDelivType;

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

    /**
     * Gets the value of the subseqDelivType property.
     * 
     * @return
     *     possible object is
     *     {@link SubseqDelivTypeSType }
     *     
     */
    public SubseqDelivTypeSType getSubseqDelivType() {
        return subseqDelivType;
    }

    /**
     * Sets the value of the subseqDelivType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubseqDelivTypeSType }
     *     
     */
    public void setSubseqDelivType(SubseqDelivTypeSType value) {
        this.subseqDelivType = value;
    }

}
