
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashDepositOperationSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashDepositOperationSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INITIAL"/>
 *     <enumeration value="WITHDRAW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CashDepositOperationSType")
@XmlEnum
public enum CashDepositOperationSType {


    /**
     * Initial deposit in the TCR.
     * 
     */
    INITIAL,

    /**
     * Amount of cash withdrawn from the TCR.
     * 
     */
    WITHDRAW;

    public String value() {
        return name();
    }

    public static CashDepositOperationSType fromValue(String v) {
        return valueOf(v);
    }

}
