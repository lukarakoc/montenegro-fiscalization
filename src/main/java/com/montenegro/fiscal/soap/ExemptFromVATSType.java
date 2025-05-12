
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExemptFromVATSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExemptFromVATSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VAT_CL3"/>
 *     <enumeration value="VAT_CL4"/>
 *     <enumeration value="VAT_CL14"/>
 *     <enumeration value="VAT_CL15"/>
 *     <enumeration value="VAT_CL17"/>
 *     <enumeration value="VAT_CL20"/>
 *     <enumeration value="VAT_CL26"/>
 *     <enumeration value="VAT_CL27"/>
 *     <enumeration value="VAT_CL28"/>
 *     <enumeration value="VAT_CL29"/>
 *     <enumeration value="VAT_CL30"/>
 *     <enumeration value="VAT_CL44"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExemptFromVATSType")
@XmlEnum
public enum ExemptFromVATSType {


    /**
     * Examination for subject of VAT taxation.
     * 
     */
    @XmlEnumValue("VAT_CL3")
    VAT_CL_3("VAT_CL3"),

    /**
     * Product turnover exemption.
     * 
     */
    @XmlEnumValue("VAT_CL4")
    VAT_CL_4("VAT_CL4"),

    /**
     * Place of taxation.
     * 
     */
    @XmlEnumValue("VAT_CL14")
    VAT_CL_14("VAT_CL14"),

    /**
     * Product traffic location.
     * 
     */
    @XmlEnumValue("VAT_CL15")
    VAT_CL_15("VAT_CL15"),

    /**
     * Place of service traffic.
     * 
     */
    @XmlEnumValue("VAT_CL17")
    VAT_CL_17("VAT_CL17"),

    /**
     * Tax base and correction of the tax base.
     * 
     */
    @XmlEnumValue("VAT_CL20")
    VAT_CL_20("VAT_CL20"),

    /**
     * Exemptions from the public interest.
     * 
     */
    @XmlEnumValue("VAT_CL26")
    VAT_CL_26("VAT_CL26"),

    /**
     * Other exemptions.
     * 
     */
    @XmlEnumValue("VAT_CL27")
    VAT_CL_27("VAT_CL27"),

    /**
     * Exemptions on imports of products.
     * 
     */
    @XmlEnumValue("VAT_CL28")
    VAT_CL_28("VAT_CL28"),

    /**
     * Exemptions for temporary importation of products.
     * 
     */
    @XmlEnumValue("VAT_CL29")
    VAT_CL_29("VAT_CL29"),

    /**
     * Special exemptions.
     * 
     */
    @XmlEnumValue("VAT_CL30")
    VAT_CL_30("VAT_CL30"),

    /**
     * Special taxation procedure.
     * 
     */
    @XmlEnumValue("VAT_CL44")
    VAT_CL_44("VAT_CL44");
    private final String value;

    ExemptFromVATSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExemptFromVATSType fromValue(String v) {
        for (ExemptFromVATSType c: ExemptFromVATSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
