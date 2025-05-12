
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubseqDelivTypeSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SubseqDelivTypeSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOINTERNET"/>
 *     <enumeration value="BOUNDBOOK"/>
 *     <enumeration value="SERVICE"/>
 *     <enumeration value="TECHNICALERROR"/>
 *     <enumeration value="BUSINESSNEEDS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SubseqDelivTypeSType")
@XmlEnum
public enum SubseqDelivTypeSType {


    /**
     * When TCR operates in the area where there is no Internet available.
     * 
     */
    NOINTERNET,

    /**
     * When TCR is not working and message cannot be created with TCR.
     * 
     */
    BOUNDBOOK,

    /**
     * When there is an issue with the fiscalization service that blocks fiscalization.
     * 
     */
    SERVICE,

    /**
     * When there is a temporary technical error at TCR side that prevents successful fiscalization.
     * 
     */
    TECHNICALERROR,

    /**
     * When there is a subsequent sending conditioned by the way of doing business that prevents successful fiscalization.
     * 
     */
    BUSINESSNEEDS;

    public String value() {
        return name();
    }

    public static SubseqDelivTypeSType fromValue(String v) {
        return valueOf(v);
    }

}
