
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCRSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TCRSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REGULAR"/>
 *     <enumeration value="VENDING"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TCRSType")
@XmlEnum
public enum TCRSType {


    /**
     * Regular TCR.
     * 
     */
    REGULAR,

    /**
     * Self-vending machine.
     * 
     */
    VENDING;

    public String value() {
        return name();
    }

    public static TCRSType fromValue(String v) {
        return valueOf(v);
    }

}
