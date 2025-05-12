
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BuyerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="IDType" use="required" type="{https://efi.tax.gov.me/fs/schema}IDTypeSType" />
 *       <attribute name="IDNum" use="required" type="{https://efi.tax.gov.me/fs/schema}String20SType" />
 *       <attribute name="Name" use="required" type="{https://efi.tax.gov.me/fs/schema}String400SType" />
 *       <attribute name="Address" type="{https://efi.tax.gov.me/fs/schema}String200SType" />
 *       <attribute name="Town" type="{https://efi.tax.gov.me/fs/schema}String100SType" />
 *       <attribute name="Country" type="{https://efi.tax.gov.me/fs/schema}CountryCodeSType" />
 *       <attribute name="TIC" type="{https://efi.tax.gov.me/fs/schema}String20SType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerType")
public class BuyerType {

    @XmlAttribute(name = "IDType", required = true)
    protected IDTypeSType idType;
    @XmlAttribute(name = "IDNum", required = true)
    protected String idNum;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Address")
    protected String address;
    @XmlAttribute(name = "Town")
    protected String town;
    @XmlAttribute(name = "Country")
    protected CountryCodeSType country;
    @XmlAttribute(name = "TIC")
    protected String tic;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link IDTypeSType }
     *     
     */
    public IDTypeSType getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDTypeSType }
     *     
     */
    public void setIDType(IDTypeSType value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNum() {
        return idNum;
    }

    /**
     * Sets the value of the idNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNum(String value) {
        this.idNum = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeSType }
     *     
     */
    public CountryCodeSType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeSType }
     *     
     */
    public void setCountry(CountryCodeSType value) {
        this.country = value;
    }

    /**
     * Gets the value of the tic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIC() {
        return tic;
    }

    /**
     * Sets the value of the tic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIC(String value) {
        this.tic = value;
    }

}
