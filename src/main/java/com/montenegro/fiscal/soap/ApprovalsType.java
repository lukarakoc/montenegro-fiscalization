
package com.montenegro.fiscal.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ApprovalsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Approval" type="{https://efi.tax.gov.me/fs/schema}ApprovalType" maxOccurs="20"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalsType", propOrder = {
    "approval"
})
public class ApprovalsType {

    @XmlElement(name = "Approval", required = true)
    protected List<ApprovalType> approval;

    /**
     * Gets the value of the approval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the approval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovalType }
     * 
     * 
     * @return
     *     The value of the approval property.
     */
    public List<ApprovalType> getApproval() {
        if (approval == null) {
            approval = new ArrayList<>();
        }
        return this.approval;
    }

}
