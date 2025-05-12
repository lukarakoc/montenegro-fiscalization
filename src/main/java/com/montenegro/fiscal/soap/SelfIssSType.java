
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelfIssSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SelfIssSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGREEMENT"/>
 *     <enumeration value="DOMESTIC"/>
 *     <enumeration value="ABROAD"/>
 *     <enumeration value="SELF"/>
 *     <enumeration value="OTHER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SelfIssSType")
@XmlEnum
public enum SelfIssSType {


    /**
     * The previous agreement between the parties.
     * 
     */
    AGREEMENT,

    /**
     * Buying from domestic farmers.
     * 
     */
    DOMESTIC,

    /**
     * Buying services from abroad.
     * 
     */
    ABROAD,

    /**
     * Self-consumption.
     * 
     */
    SELF,

    /**
     * Other
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static SelfIssSType fromValue(String v) {
        return valueOf(v);
    }

}
