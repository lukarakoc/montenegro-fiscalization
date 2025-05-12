
package com.montenegro.fiscal.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TCRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TCRType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="IssuerTIN" use="required" type="{https://efi.tax.gov.me/fs/schema}TINSType" />
 *       <attribute name="BusinUnitCode" use="required" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType" />
 *       <attribute name="TCRIntID" use="required" type="{https://efi.tax.gov.me/fs/schema}String50SType" />
 *       <attribute name="SoftCode" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType" />
 *       <attribute name="MaintainerCode" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType" />
 *       <attribute name="ValidFrom" type="{https://efi.tax.gov.me/fs/schema}DateSType" />
 *       <attribute name="ValidTo" type="{https://efi.tax.gov.me/fs/schema}DateSType" />
 *       <attribute name="Type" type="{https://efi.tax.gov.me/fs/schema}TCRSType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCRType", propOrder = {
    "value"
})
public class TCRType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "IssuerTIN", required = true)
    protected String issuerTIN;
    @XmlAttribute(name = "BusinUnitCode", required = true)
    protected String businUnitCode;
    @XmlAttribute(name = "TCRIntID", required = true)
    protected String tcrIntID;
    @XmlAttribute(name = "SoftCode")
    protected String softCode;
    @XmlAttribute(name = "MaintainerCode")
    protected String maintainerCode;
    @XmlAttribute(name = "ValidFrom")
    protected XMLGregorianCalendar validFrom;
    @XmlAttribute(name = "ValidTo")
    protected XMLGregorianCalendar validTo;
    @XmlAttribute(name = "Type")
    protected TCRSType type;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the issuerTIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerTIN() {
        return issuerTIN;
    }

    /**
     * Sets the value of the issuerTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerTIN(String value) {
        this.issuerTIN = value;
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
     * Gets the value of the tcrIntID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRIntID() {
        return tcrIntID;
    }

    /**
     * Sets the value of the tcrIntID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCRIntID(String value) {
        this.tcrIntID = value;
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
     * Gets the value of the maintainerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintainerCode() {
        return maintainerCode;
    }

    /**
     * Sets the value of the maintainerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintainerCode(String value) {
        this.maintainerCode = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TCRSType }
     *     
     */
    public TCRSType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCRSType }
     *     
     */
    public void setType(TCRSType value) {
        this.type = value;
    }

}
