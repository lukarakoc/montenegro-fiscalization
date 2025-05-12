
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceTSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvoiceTSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVOICE"/>
 *     <enumeration value="CORRECTIVE"/>
 *     <enumeration value="SUMMARY"/>
 *     <enumeration value="PERIODICAL"/>
 *     <enumeration value="ADVANCE"/>
 *     <enumeration value="CREDIT_NOTE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvoiceTSType")
@XmlEnum
public enum InvoiceTSType {


    /**
     * Regular invoice.
     * 
     */
    INVOICE,

    /**
     * Corrective invoice.
     * 
     */
    CORRECTIVE,

    /**
     * Summary invoice.
     * 
     */
    SUMMARY,

    /**
     * Periodical invoice.
     * 
     */
    PERIODICAL,

    /**
     * Advance invoice.
     * 
     */
    ADVANCE,

    /**
     * Credit note.
     * 
     */
    CREDIT_NOTE;

    public String value() {
        return name();
    }

    public static InvoiceTSType fromValue(String v) {
        return valueOf(v);
    }

}
