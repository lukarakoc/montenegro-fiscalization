
package com.montenegro.fiscal.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SameTaxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SameTaxesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SameTax" type="{https://efi.tax.gov.me/fs/schema}SameTaxType" maxOccurs="20"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SameTaxesType", propOrder = {
    "sameTax"
})
public class SameTaxesType {

    @XmlElement(name = "SameTax", required = true)
    protected List<SameTaxType> sameTax;

    /**
     * Gets the value of the sameTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sameTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSameTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SameTaxType }
     * 
     * 
     * @return
     *     The value of the sameTax property.
     */
    public List<SameTaxType> getSameTax() {
        if (sameTax == null) {
            sameTax = new ArrayList<>();
        }
        return this.sameTax;
    }

}
