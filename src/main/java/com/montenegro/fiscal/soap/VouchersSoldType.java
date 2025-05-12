
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VouchersSoldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VouchersSoldType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="VD" type="{https://efi.tax.gov.me/fs/schema}VoucherSoldDataType"/>
 *         <element name="VN" type="{https://efi.tax.gov.me/fs/schema}VouchersSoldNumType"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VouchersSoldType", propOrder = {

})
public class VouchersSoldType {

    @XmlElement(name = "VD", required = true)
    protected VoucherSoldDataType vd;
    @XmlElement(name = "VN", required = true)
    protected VouchersSoldNumType vn;

    /**
     * Gets the value of the vd property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherSoldDataType }
     *     
     */
    public VoucherSoldDataType getVD() {
        return vd;
    }

    /**
     * Sets the value of the vd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherSoldDataType }
     *     
     */
    public void setVD(VoucherSoldDataType value) {
        this.vd = value;
    }

    /**
     * Gets the value of the vn property.
     * 
     * @return
     *     possible object is
     *     {@link VouchersSoldNumType }
     *     
     */
    public VouchersSoldNumType getVN() {
        return vn;
    }

    /**
     * Sets the value of the vn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VouchersSoldNumType }
     *     
     */
    public void setVN(VouchersSoldNumType value) {
        this.vn = value;
    }

}
