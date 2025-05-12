
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="Header" type="{https://efi.tax.gov.me/fs/schema}RegisterTCRResponseHeaderType"/>
 *         <element name="TCRCode" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       </all>
 *       <attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Response" />
 *       <attribute name="Version" use="required" type="{https://efi.tax.gov.me/fs/schema}IntSType" fixed="1" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "RegisterTCRResponse")
public class RegisterTCRResponse {

    @XmlElement(name = "Header", required = true)
    protected RegisterTCRResponseHeaderType header;
    @XmlElement(name = "TCRCode", required = true)
    protected String tcrCode;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Version", required = true)
    protected int version;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterTCRResponseHeaderType }
     *     
     */
    public RegisterTCRResponseHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterTCRResponseHeaderType }
     *     
     */
    public void setHeader(RegisterTCRResponseHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the tcrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRCode() {
        return tcrCode;
    }

    /**
     * Sets the value of the tcrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCRCode(String value) {
        this.tcrCode = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        if (id == null) {
            return "Response";
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

}
