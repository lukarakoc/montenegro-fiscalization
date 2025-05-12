
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CurrencyCodeSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AED"/>
 *     <enumeration value="AFN"/>
 *     <enumeration value="AMD"/>
 *     <enumeration value="ANG"/>
 *     <enumeration value="AOA"/>
 *     <enumeration value="ARS"/>
 *     <enumeration value="AUD"/>
 *     <enumeration value="AWG"/>
 *     <enumeration value="AZN"/>
 *     <enumeration value="BAM"/>
 *     <enumeration value="BBD"/>
 *     <enumeration value="BDT"/>
 *     <enumeration value="BGN"/>
 *     <enumeration value="BHD"/>
 *     <enumeration value="BIF"/>
 *     <enumeration value="BMD"/>
 *     <enumeration value="BND"/>
 *     <enumeration value="BOB"/>
 *     <enumeration value="BRL"/>
 *     <enumeration value="BSD"/>
 *     <enumeration value="BTN"/>
 *     <enumeration value="BWP"/>
 *     <enumeration value="BYN"/>
 *     <enumeration value="BZD"/>
 *     <enumeration value="CAD"/>
 *     <enumeration value="CDF"/>
 *     <enumeration value="CHF"/>
 *     <enumeration value="CLP"/>
 *     <enumeration value="CNY"/>
 *     <enumeration value="COP"/>
 *     <enumeration value="CRC"/>
 *     <enumeration value="CUC"/>
 *     <enumeration value="CUP"/>
 *     <enumeration value="CVE"/>
 *     <enumeration value="CZK"/>
 *     <enumeration value="DJF"/>
 *     <enumeration value="DKK"/>
 *     <enumeration value="DOP"/>
 *     <enumeration value="DZD"/>
 *     <enumeration value="EGP"/>
 *     <enumeration value="ERN"/>
 *     <enumeration value="ETB"/>
 *     <enumeration value="EUR"/>
 *     <enumeration value="FJD"/>
 *     <enumeration value="FKP"/>
 *     <enumeration value="GBP"/>
 *     <enumeration value="GEL"/>
 *     <enumeration value="GGP"/>
 *     <enumeration value="GHS"/>
 *     <enumeration value="GIP"/>
 *     <enumeration value="GMD"/>
 *     <enumeration value="GNF"/>
 *     <enumeration value="GTQ"/>
 *     <enumeration value="GYD"/>
 *     <enumeration value="HKD"/>
 *     <enumeration value="HNL"/>
 *     <enumeration value="HRK"/>
 *     <enumeration value="HTG"/>
 *     <enumeration value="HUF"/>
 *     <enumeration value="IDR"/>
 *     <enumeration value="ILS"/>
 *     <enumeration value="IMP"/>
 *     <enumeration value="INR"/>
 *     <enumeration value="IQD"/>
 *     <enumeration value="IRR"/>
 *     <enumeration value="ISK"/>
 *     <enumeration value="JEP"/>
 *     <enumeration value="JMD"/>
 *     <enumeration value="JOD"/>
 *     <enumeration value="JPY"/>
 *     <enumeration value="KES"/>
 *     <enumeration value="KGS"/>
 *     <enumeration value="KHR"/>
 *     <enumeration value="KMF"/>
 *     <enumeration value="KPW"/>
 *     <enumeration value="KRW"/>
 *     <enumeration value="KWD"/>
 *     <enumeration value="KYD"/>
 *     <enumeration value="KZT"/>
 *     <enumeration value="LAK"/>
 *     <enumeration value="LBP"/>
 *     <enumeration value="LKR"/>
 *     <enumeration value="LRD"/>
 *     <enumeration value="LSL"/>
 *     <enumeration value="LYD"/>
 *     <enumeration value="MAD"/>
 *     <enumeration value="MDL"/>
 *     <enumeration value="MGA"/>
 *     <enumeration value="MKD"/>
 *     <enumeration value="MMK"/>
 *     <enumeration value="MNT"/>
 *     <enumeration value="MOP"/>
 *     <enumeration value="MRU"/>
 *     <enumeration value="MUR"/>
 *     <enumeration value="MVR"/>
 *     <enumeration value="MWK"/>
 *     <enumeration value="MXN"/>
 *     <enumeration value="MYR"/>
 *     <enumeration value="MZN"/>
 *     <enumeration value="NAD"/>
 *     <enumeration value="NGN"/>
 *     <enumeration value="NIO"/>
 *     <enumeration value="NOK"/>
 *     <enumeration value="NPR"/>
 *     <enumeration value="NZD"/>
 *     <enumeration value="OMR"/>
 *     <enumeration value="PAB"/>
 *     <enumeration value="PEN"/>
 *     <enumeration value="PGK"/>
 *     <enumeration value="PHP"/>
 *     <enumeration value="PKR"/>
 *     <enumeration value="PLN"/>
 *     <enumeration value="PYG"/>
 *     <enumeration value="QAR"/>
 *     <enumeration value="RON"/>
 *     <enumeration value="RSD"/>
 *     <enumeration value="RUB"/>
 *     <enumeration value="RWF"/>
 *     <enumeration value="SAR"/>
 *     <enumeration value="SBD"/>
 *     <enumeration value="SCR"/>
 *     <enumeration value="SDG"/>
 *     <enumeration value="SEK"/>
 *     <enumeration value="SGD"/>
 *     <enumeration value="SHP"/>
 *     <enumeration value="SLL"/>
 *     <enumeration value="SOS"/>
 *     <enumeration value="SPL"/>
 *     <enumeration value="SRD"/>
 *     <enumeration value="STN"/>
 *     <enumeration value="SVC"/>
 *     <enumeration value="SYP"/>
 *     <enumeration value="SZL"/>
 *     <enumeration value="THB"/>
 *     <enumeration value="TJS"/>
 *     <enumeration value="TMT"/>
 *     <enumeration value="TND"/>
 *     <enumeration value="TOP"/>
 *     <enumeration value="TRY"/>
 *     <enumeration value="TTD"/>
 *     <enumeration value="TVD"/>
 *     <enumeration value="TWD"/>
 *     <enumeration value="TZS"/>
 *     <enumeration value="UAH"/>
 *     <enumeration value="UGX"/>
 *     <enumeration value="USD"/>
 *     <enumeration value="UYU"/>
 *     <enumeration value="UZS"/>
 *     <enumeration value="VEF"/>
 *     <enumeration value="VND"/>
 *     <enumeration value="VUV"/>
 *     <enumeration value="WST"/>
 *     <enumeration value="XAF"/>
 *     <enumeration value="XCD"/>
 *     <enumeration value="XDR"/>
 *     <enumeration value="XOF"/>
 *     <enumeration value="XPF"/>
 *     <enumeration value="YER"/>
 *     <enumeration value="ZAR"/>
 *     <enumeration value="ZMW"/>
 *     <enumeration value="ZWD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CurrencyCodeSType")
@XmlEnum
public enum CurrencyCodeSType {


    /**
     * United Arab Emirates Dirham
     * 
     */
    AED,

    /**
     * Afghanistan Afghani
     * 
     */
    AFN,

    /**
     * Armenia Dram
     * 
     */
    AMD,

    /**
     * Netherlands Antilles Guilder
     * 
     */
    ANG,

    /**
     * Angola Kwanza
     * 
     */
    AOA,

    /**
     * Argentina Peso
     * 
     */
    ARS,

    /**
     * Australia Dollar
     * 
     */
    AUD,

    /**
     * Aruba Guilder
     * 
     */
    AWG,

    /**
     * Azerbaijan Manat
     * 
     */
    AZN,

    /**
     * Bosnia and Herzegovina Convertible Mark
     * 
     */
    BAM,

    /**
     * Barbados Dollar
     * 
     */
    BBD,

    /**
     * Bangladesh Taka
     * 
     */
    BDT,

    /**
     * Bulgaria Lev
     * 
     */
    BGN,

    /**
     * Bahrain Dinar
     * 
     */
    BHD,

    /**
     * Burundi Franc
     * 
     */
    BIF,

    /**
     * Bermuda Dollar
     * 
     */
    BMD,

    /**
     * Brunei Darussalam Dollar
     * 
     */
    BND,

    /**
     * Bolivia Boliviano
     * 
     */
    BOB,

    /**
     * Brazil Real
     * 
     */
    BRL,

    /**
     * Bahamas Dollar
     * 
     */
    BSD,

    /**
     * Bhutan Ngultrum
     * 
     */
    BTN,

    /**
     * Botswana Pula
     * 
     */
    BWP,

    /**
     * Belarus Ruble
     * 
     */
    BYN,

    /**
     * Belize Dollar
     * 
     */
    BZD,

    /**
     * Canada Dollar
     * 
     */
    CAD,

    /**
     * Congo/Kinshasa Franc
     * 
     */
    CDF,

    /**
     * Switzerland Franc
     * 
     */
    CHF,

    /**
     * Chile Peso
     * 
     */
    CLP,

    /**
     * China Yuan Renminbi
     * 
     */
    CNY,

    /**
     * Colombia Peso
     * 
     */
    COP,

    /**
     * Costa Rica Colon
     * 
     */
    CRC,

    /**
     * Cuba Convertible Peso
     * 
     */
    CUC,

    /**
     * Cuba Peso
     * 
     */
    CUP,

    /**
     * Cape Verde Escudo
     * 
     */
    CVE,

    /**
     * Czech Republic Koruna
     * 
     */
    CZK,

    /**
     * Djibouti Franc
     * 
     */
    DJF,

    /**
     * Denmark Krone
     * 
     */
    DKK,

    /**
     * Dominican Republic Peso
     * 
     */
    DOP,

    /**
     * Algeria Dinar
     * 
     */
    DZD,

    /**
     * Egypt Pound
     * 
     */
    EGP,

    /**
     * Eritrea Nakfa
     * 
     */
    ERN,

    /**
     * Ethiopia Birr
     * 
     */
    ETB,

    /**
     * Euro Member Countries
     * 
     */
    EUR,

    /**
     * Fiji Dollar
     * 
     */
    FJD,

    /**
     * Falkland Islands (Malvinas) Pound
     * 
     */
    FKP,

    /**
     * United Kingdom Pound
     * 
     */
    GBP,

    /**
     * Georgia Lari
     * 
     */
    GEL,

    /**
     * Guernsey Pound
     * 
     */
    GGP,

    /**
     * Ghana Cedi
     * 
     */
    GHS,

    /**
     * Gibraltar Pound
     * 
     */
    GIP,

    /**
     * Gambia Dalasi
     * 
     */
    GMD,

    /**
     * Guinea Franc
     * 
     */
    GNF,

    /**
     * Guatemala Quetzal
     * 
     */
    GTQ,

    /**
     * Guyana Dollar
     * 
     */
    GYD,

    /**
     * Hong Kong Dollar
     * 
     */
    HKD,

    /**
     * Honduras Lempira
     * 
     */
    HNL,

    /**
     * Croatia Kuna
     * 
     */
    HRK,

    /**
     * Haiti Gourde
     * 
     */
    HTG,

    /**
     * Hungary Forint
     * 
     */
    HUF,

    /**
     * Indonesia Rupiah
     * 
     */
    IDR,

    /**
     * Israel Shekel
     * 
     */
    ILS,

    /**
     * Isle of Man Pound
     * 
     */
    IMP,

    /**
     * India Rupee
     * 
     */
    INR,

    /**
     * Iraq Dinar
     * 
     */
    IQD,

    /**
     * Iran Rial
     * 
     */
    IRR,

    /**
     * Iceland Krona
     * 
     */
    ISK,

    /**
     * Jersey Pound
     * 
     */
    JEP,

    /**
     * Jamaica Dollar
     * 
     */
    JMD,

    /**
     * Jordan Dinar
     * 
     */
    JOD,

    /**
     * Japan Yen
     * 
     */
    JPY,

    /**
     * Kenya Shilling
     * 
     */
    KES,

    /**
     * Kyrgyzstan Som
     * 
     */
    KGS,

    /**
     * Cambodia Riel
     * 
     */
    KHR,

    /**
     * Comorian Franc
     * 
     */
    KMF,

    /**
     * Korea (North) Won
     * 
     */
    KPW,

    /**
     * Korea (South) Won
     * 
     */
    KRW,

    /**
     * Kuwait Dinar
     * 
     */
    KWD,

    /**
     * Cayman Islands Dollar
     * 
     */
    KYD,

    /**
     * Kazakhstan Tenge
     * 
     */
    KZT,

    /**
     * Laos Kip
     * 
     */
    LAK,

    /**
     * Lebanon Pound
     * 
     */
    LBP,

    /**
     * Sri Lanka Rupee
     * 
     */
    LKR,

    /**
     * Liberia Dollar
     * 
     */
    LRD,

    /**
     * Lesotho Loti
     * 
     */
    LSL,

    /**
     * Libya Dinar
     * 
     */
    LYD,

    /**
     * Morocco Dirham
     * 
     */
    MAD,

    /**
     * Moldova Leu
     * 
     */
    MDL,

    /**
     * Madagascar Ariary
     * 
     */
    MGA,

    /**
     * Macedonia Denar
     * 
     */
    MKD,

    /**
     * Myanmar (Burma) Kyat
     * 
     */
    MMK,

    /**
     * Mongolia Tughrik
     * 
     */
    MNT,

    /**
     * Macau Pataca
     * 
     */
    MOP,

    /**
     * Mauritania Ouguiya
     * 
     */
    MRU,

    /**
     * Mauritius Rupee
     * 
     */
    MUR,

    /**
     * Maldives (Maldive Islands) Rufiyaa
     * 
     */
    MVR,

    /**
     * Malawi Kwacha
     * 
     */
    MWK,

    /**
     * Mexico Peso
     * 
     */
    MXN,

    /**
     * Malaysia Ringgit
     * 
     */
    MYR,

    /**
     * Mozambique Metical
     * 
     */
    MZN,

    /**
     * Namibia Dollar
     * 
     */
    NAD,

    /**
     * Nigeria Naira
     * 
     */
    NGN,

    /**
     * Nicaragua Cordoba
     * 
     */
    NIO,

    /**
     * Norway Krone
     * 
     */
    NOK,

    /**
     * Nepal Rupee
     * 
     */
    NPR,

    /**
     * New Zealand Dollar
     * 
     */
    NZD,

    /**
     * Oman Rial
     * 
     */
    OMR,

    /**
     * Panama Balboa
     * 
     */
    PAB,

    /**
     * Peru Sol
     * 
     */
    PEN,

    /**
     * Papua New Guinea Kina
     * 
     */
    PGK,

    /**
     * Philippines Peso
     * 
     */
    PHP,

    /**
     * Pakistan Rupee
     * 
     */
    PKR,

    /**
     * Poland Zloty
     * 
     */
    PLN,

    /**
     * Paraguay Guarani
     * 
     */
    PYG,

    /**
     * Qatar Riyal
     * 
     */
    QAR,

    /**
     * Romania Leu
     * 
     */
    RON,

    /**
     * Serbia Dinar
     * 
     */
    RSD,

    /**
     * Russia Ruble
     * 
     */
    RUB,

    /**
     * Rwanda Franc
     * 
     */
    RWF,

    /**
     * Saudi Arabia Riyal
     * 
     */
    SAR,

    /**
     * Solomon Islands Dollar
     * 
     */
    SBD,

    /**
     * Seychelles Rupee
     * 
     */
    SCR,

    /**
     * Sudan Pound
     * 
     */
    SDG,

    /**
     * Sweden Krona
     * 
     */
    SEK,

    /**
     * Singapore Dollar
     * 
     */
    SGD,

    /**
     * Saint Helena Pound
     * 
     */
    SHP,

    /**
     * Sierra Leone Leone
     * 
     */
    SLL,

    /**
     * Somalia Shilling
     * 
     */
    SOS,

    /**
     * Seborga Luigino
     * 
     */
    SPL,

    /**
     * Suriname Dollar
     * 
     */
    SRD,

    /**
     * Sao Tome and Principe Dobra
     * 
     */
    STN,

    /**
     * El Salvador Colon
     * 
     */
    SVC,

    /**
     * Syria Pound
     * 
     */
    SYP,

    /**
     * eSwatini Lilangeni
     * 
     */
    SZL,

    /**
     * Thailand Baht
     * 
     */
    THB,

    /**
     * Tajikistan Somoni
     * 
     */
    TJS,

    /**
     * Turkmenistan Manat
     * 
     */
    TMT,

    /**
     * Tunisia Dinar
     * 
     */
    TND,

    /**
     * Tonga Pa'anga
     * 
     */
    TOP,

    /**
     * Turkey Lira
     * 
     */
    TRY,

    /**
     * Trinidad and Tobago Dollar
     * 
     */
    TTD,

    /**
     * Tuvalu Dollar
     * 
     */
    TVD,

    /**
     * Taiwan New Dollar
     * 
     */
    TWD,

    /**
     * Tanzania Shilling
     * 
     */
    TZS,

    /**
     * Ukraine Hryvnia
     * 
     */
    UAH,

    /**
     * Uganda Shilling
     * 
     */
    UGX,

    /**
     * United States Dollar
     * 
     */
    USD,

    /**
     * Uruguay Peso
     * 
     */
    UYU,

    /**
     * Uzbekistan Som
     * 
     */
    UZS,

    /**
     * Venezuela Bolivar
     * 
     */
    VEF,

    /**
     * Viet Nam Dong
     * 
     */
    VND,

    /**
     * Vanuatu Vatu
     * 
     */
    VUV,

    /**
     * Samoa Tala
     * 
     */
    WST,

    /**
     * Communaute Financiere Africaine (BEAC) CFA Franc BEAC
     * 
     */
    XAF,

    /**
     * East Caribbean Dollar
     * 
     */
    XCD,

    /**
     * International Monetary Fund (IMF) Special Drawing Rights
     * 
     */
    XDR,

    /**
     * Communaute Financiere Africaine (BCEAO) Franc
     * 
     */
    XOF,

    /**
     * Comptoirs Francais du Pacifique (CFP) Franc
     * 
     */
    XPF,

    /**
     * Yemen Rial
     * 
     */
    YER,

    /**
     * South Africa Rand
     * 
     */
    ZAR,

    /**
     * Zambia Kwacha
     * 
     */
    ZMW,

    /**
     * Zimbabwe Dollar
     * 
     */
    ZWD;

    public String value() {
        return name();
    }

    public static CurrencyCodeSType fromValue(String v) {
        return valueOf(v);
    }

}
