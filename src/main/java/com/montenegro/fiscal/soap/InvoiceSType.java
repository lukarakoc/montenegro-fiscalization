
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvoiceSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="NONCASH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvoiceSType")
@XmlEnum
public enum InvoiceSType {


    /**
     * Cash invoice.
     * 
     */
    CASH,

    /**
     * Non-cash invoice.
     * 
     */
    NONCASH;

    public String value() {
        return name();
    }

    public static InvoiceSType fromValue(String v) {
        return valueOf(v);
    }

}
