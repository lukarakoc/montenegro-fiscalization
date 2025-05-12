
package com.montenegro.fiscal.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceItemsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="I" type="{https://efi.tax.gov.me/fs/schema}InvoiceItemType" maxOccurs="1000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItemsType", propOrder = {
    "i"
})
public class InvoiceItemsType {

    @XmlElement(name = "I", required = true)
    protected List<InvoiceItemType> i;

    /**
     * Gets the value of the i property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the i property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceItemType }
     * 
     * 
     * @return
     *     The value of the i property.
     */
    public List<InvoiceItemType> getI() {
        if (i == null) {
            i = new ArrayList<>();
        }
        return this.i;
    }

}
