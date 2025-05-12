
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDTypeSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IDTypeSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TIN"/>
 *     <enumeration value="ID"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="VAT"/>
 *     <enumeration value="TAX"/>
 *     <enumeration value="SOC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IDTypeSType")
@XmlEnum
public enum IDTypeSType {


    /**
     * JMB/PIB number.
     * 
     */
    TIN,

    /**
     * Personal ID number.
     * 
     */
    ID,

    /**
     * Passport number.
     * 
     */
    PASS,

    /**
     * VAT number.
     * 
     */
    VAT,

    /**
     * TAX number.
     * 
     */
    TAX,

    /**
     * Social security number.
     * 
     */
    SOC;

    public String value() {
        return name();
    }

    public static IDTypeSType fromValue(String v) {
        return valueOf(v);
    }

}
