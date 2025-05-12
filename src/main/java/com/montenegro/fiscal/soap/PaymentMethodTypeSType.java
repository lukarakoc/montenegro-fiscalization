
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodTypeSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentMethodTypeSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BANKNOTE"/>
 *     <enumeration value="CARD"/>
 *     <enumeration value="BUSINESSCARD"/>
 *     <enumeration value="SVOUCHER"/>
 *     <enumeration value="COMPANY"/>
 *     <enumeration value="ORDER"/>
 *     <enumeration value="ADVANCE"/>
 *     <enumeration value="ACCOUNT"/>
 *     <enumeration value="FACTORING"/>
 *     <enumeration value="OTHER"/>
 *     <enumeration value="OTHER-CASH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentMethodTypeSType")
@XmlEnum
public enum PaymentMethodTypeSType {


    /**
     * Banknotes and coins
     * 
     */
    BANKNOTE("BANKNOTE"),

    /**
     * Credit and debit card issued to the physical person
     * 
     */
    CARD("CARD"),

    /**
     * Credit and debit card issued to the taxpayer
     * 
     */
    BUSINESSCARD("BUSINESSCARD"),

    /**
     * Single-purpose voucher
     * 
     */
    SVOUCHER("SVOUCHER"),

    /**
     * Seller's company cards, gift cards and similar prepaid cards
     * 
     */
    COMPANY("COMPANY"),

    /**
     * Invoice not yet paid. It will be paid by summary invoice.
     * 
     */
    ORDER("ORDER"),

    /**
     * Invoice is paid in advance
     * 
     */
    ADVANCE("ADVANCE"),

    /**
     * Transaction account
     * 
     */
    ACCOUNT("ACCOUNT"),

    /**
     * Factoring
     * 
     */
    FACTORING("FACTORING"),

    /**
     * Other cashless payments
     * 
     */
    OTHER("OTHER"),

    /**
     * Other cash payments
     * 
     */
    @XmlEnumValue("OTHER-CASH")
    OTHER_CASH("OTHER-CASH");
    private final String value;

    PaymentMethodTypeSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodTypeSType fromValue(String v) {
        for (PaymentMethodTypeSType c: PaymentMethodTypeSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
