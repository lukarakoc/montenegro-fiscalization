
package com.montenegro.fiscal.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayMethodsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PayMethodsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PayMethod" type="{https://efi.tax.gov.me/fs/schema}PayMethodType" maxOccurs="10"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayMethodsType", propOrder = {
    "payMethod"
})
public class PayMethodsType {

    @XmlElement(name = "PayMethod", required = true)
    protected List<PayMethodType> payMethod;

    /**
     * Gets the value of the payMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the payMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayMethodType }
     * 
     * 
     * @return
     *     The value of the payMethod property.
     */
    public List<PayMethodType> getPayMethod() {
        if (payMethod == null) {
            payMethod = new ArrayList<>();
        }
        return this.payMethod;
    }

}
