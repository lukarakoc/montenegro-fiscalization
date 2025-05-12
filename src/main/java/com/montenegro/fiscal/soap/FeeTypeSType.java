
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeTypeSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FeeTypeSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="COMMISSION"/>
 *     <enumeration value="OTHER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FeeTypeSType")
@XmlEnum
public enum FeeTypeSType {


    /**
     * Packaging fee.
     * 
     */
    PACK,

    /**
     * Commission for currency exchange activities.
     * 
     */
    COMMISSION,

    /**
     * Other fees that are not listed here.
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static FeeTypeSType fromValue(String v) {
        return valueOf(v);
    }

}
