
package com.montenegro.fiscal.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IICRefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IICRefsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IICRef" type="{https://efi.tax.gov.me/fs/schema}IICRefType" maxOccurs="1000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IICRefsType", propOrder = {
    "iicRef"
})
public class IICRefsType {

    @XmlElement(name = "IICRef", required = true)
    protected List<IICRefType> iicRef;

    /**
     * Gets the value of the iicRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the iicRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIICRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IICRefType }
     * 
     * 
     * @return
     *     The value of the iicRef property.
     */
    public List<IICRefType> getIICRef() {
        if (iicRef == null) {
            iicRef = new ArrayList<>();
        }
        return this.iicRef;
    }

}
