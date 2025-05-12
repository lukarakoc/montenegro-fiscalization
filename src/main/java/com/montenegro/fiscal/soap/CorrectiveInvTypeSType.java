
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrectiveInvTypeSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorrectiveInvTypeSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CORRECTIVE"/>
 *     <enumeration value="ERROR_CORRECTIVE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorrectiveInvTypeSType")
@XmlEnum
public enum CorrectiveInvTypeSType {


    /**
     * Corrective invoice.
     * 
     */
    CORRECTIVE,

    /**
     * Corrective invoice for the original invoice that has been fiscalized but ended up in error after subsequent checks.
     * 
     */
    ERROR_CORRECTIVE;

    public String value() {
        return name();
    }

    public static CorrectiveInvTypeSType fromValue(String v) {
        return valueOf(v);
    }

}
