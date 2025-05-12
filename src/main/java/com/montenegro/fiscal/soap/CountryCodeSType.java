
package com.montenegro.fiscal.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCodeSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CountryCodeSType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABW"/>
 *     <enumeration value="AFG"/>
 *     <enumeration value="AGO"/>
 *     <enumeration value="AIA"/>
 *     <enumeration value="ALA"/>
 *     <enumeration value="ALB"/>
 *     <enumeration value="AND"/>
 *     <enumeration value="ARE"/>
 *     <enumeration value="ARG"/>
 *     <enumeration value="ARM"/>
 *     <enumeration value="ASM"/>
 *     <enumeration value="ATA"/>
 *     <enumeration value="ATF"/>
 *     <enumeration value="ATG"/>
 *     <enumeration value="AUS"/>
 *     <enumeration value="AUT"/>
 *     <enumeration value="AZE"/>
 *     <enumeration value="BDI"/>
 *     <enumeration value="BEL"/>
 *     <enumeration value="BEN"/>
 *     <enumeration value="BES"/>
 *     <enumeration value="BFA"/>
 *     <enumeration value="BGD"/>
 *     <enumeration value="BGR"/>
 *     <enumeration value="BHR"/>
 *     <enumeration value="BHS"/>
 *     <enumeration value="BIH"/>
 *     <enumeration value="BLM"/>
 *     <enumeration value="BLR"/>
 *     <enumeration value="BLZ"/>
 *     <enumeration value="BMU"/>
 *     <enumeration value="BOL"/>
 *     <enumeration value="BRA"/>
 *     <enumeration value="BRB"/>
 *     <enumeration value="BRN"/>
 *     <enumeration value="BTN"/>
 *     <enumeration value="BVT"/>
 *     <enumeration value="BWA"/>
 *     <enumeration value="CAF"/>
 *     <enumeration value="CAN"/>
 *     <enumeration value="CCK"/>
 *     <enumeration value="CHE"/>
 *     <enumeration value="CHL"/>
 *     <enumeration value="CHN"/>
 *     <enumeration value="CIV"/>
 *     <enumeration value="CMR"/>
 *     <enumeration value="COD"/>
 *     <enumeration value="COG"/>
 *     <enumeration value="COK"/>
 *     <enumeration value="COL"/>
 *     <enumeration value="COM"/>
 *     <enumeration value="CPV"/>
 *     <enumeration value="CRI"/>
 *     <enumeration value="CUB"/>
 *     <enumeration value="CUW"/>
 *     <enumeration value="CXR"/>
 *     <enumeration value="CYM"/>
 *     <enumeration value="CYP"/>
 *     <enumeration value="CZE"/>
 *     <enumeration value="DEU"/>
 *     <enumeration value="DJI"/>
 *     <enumeration value="DMA"/>
 *     <enumeration value="DNK"/>
 *     <enumeration value="DOM"/>
 *     <enumeration value="DZA"/>
 *     <enumeration value="ECU"/>
 *     <enumeration value="EGY"/>
 *     <enumeration value="ERI"/>
 *     <enumeration value="ESH"/>
 *     <enumeration value="ESP"/>
 *     <enumeration value="EST"/>
 *     <enumeration value="ETH"/>
 *     <enumeration value="FIN"/>
 *     <enumeration value="FJI"/>
 *     <enumeration value="FLK"/>
 *     <enumeration value="FRA"/>
 *     <enumeration value="FRO"/>
 *     <enumeration value="FSM"/>
 *     <enumeration value="GAB"/>
 *     <enumeration value="GBR"/>
 *     <enumeration value="GEO"/>
 *     <enumeration value="GGY"/>
 *     <enumeration value="GHA"/>
 *     <enumeration value="GIB"/>
 *     <enumeration value="GIN"/>
 *     <enumeration value="GLP"/>
 *     <enumeration value="GMB"/>
 *     <enumeration value="GNB"/>
 *     <enumeration value="GNQ"/>
 *     <enumeration value="GRC"/>
 *     <enumeration value="GRD"/>
 *     <enumeration value="GRL"/>
 *     <enumeration value="GTM"/>
 *     <enumeration value="GUF"/>
 *     <enumeration value="GUM"/>
 *     <enumeration value="GUY"/>
 *     <enumeration value="HKG"/>
 *     <enumeration value="HMD"/>
 *     <enumeration value="HND"/>
 *     <enumeration value="HRV"/>
 *     <enumeration value="HTI"/>
 *     <enumeration value="HUN"/>
 *     <enumeration value="IDN"/>
 *     <enumeration value="IMN"/>
 *     <enumeration value="IND"/>
 *     <enumeration value="IOT"/>
 *     <enumeration value="IRL"/>
 *     <enumeration value="IRN"/>
 *     <enumeration value="IRQ"/>
 *     <enumeration value="ISL"/>
 *     <enumeration value="ISR"/>
 *     <enumeration value="ITA"/>
 *     <enumeration value="JAM"/>
 *     <enumeration value="JEY"/>
 *     <enumeration value="JOR"/>
 *     <enumeration value="JPN"/>
 *     <enumeration value="KAZ"/>
 *     <enumeration value="KEN"/>
 *     <enumeration value="KGZ"/>
 *     <enumeration value="KHM"/>
 *     <enumeration value="KIR"/>
 *     <enumeration value="KNA"/>
 *     <enumeration value="KOR"/>
 *     <enumeration value="KWT"/>
 *     <enumeration value="LAO"/>
 *     <enumeration value="LBN"/>
 *     <enumeration value="LBR"/>
 *     <enumeration value="LBY"/>
 *     <enumeration value="LCA"/>
 *     <enumeration value="LIE"/>
 *     <enumeration value="LKA"/>
 *     <enumeration value="LSO"/>
 *     <enumeration value="LTU"/>
 *     <enumeration value="LUX"/>
 *     <enumeration value="LVA"/>
 *     <enumeration value="MAC"/>
 *     <enumeration value="MAF"/>
 *     <enumeration value="MAR"/>
 *     <enumeration value="MCO"/>
 *     <enumeration value="MDA"/>
 *     <enumeration value="MDG"/>
 *     <enumeration value="MDV"/>
 *     <enumeration value="MEX"/>
 *     <enumeration value="MHL"/>
 *     <enumeration value="MKD"/>
 *     <enumeration value="MLI"/>
 *     <enumeration value="MLT"/>
 *     <enumeration value="MMR"/>
 *     <enumeration value="MNE"/>
 *     <enumeration value="MNG"/>
 *     <enumeration value="MNP"/>
 *     <enumeration value="MOZ"/>
 *     <enumeration value="MRT"/>
 *     <enumeration value="MSR"/>
 *     <enumeration value="MTQ"/>
 *     <enumeration value="MUS"/>
 *     <enumeration value="MWI"/>
 *     <enumeration value="MYS"/>
 *     <enumeration value="MYT"/>
 *     <enumeration value="NAM"/>
 *     <enumeration value="NCL"/>
 *     <enumeration value="NER"/>
 *     <enumeration value="NFK"/>
 *     <enumeration value="NGA"/>
 *     <enumeration value="NIC"/>
 *     <enumeration value="NIU"/>
 *     <enumeration value="NLD"/>
 *     <enumeration value="NOR"/>
 *     <enumeration value="NPL"/>
 *     <enumeration value="NRU"/>
 *     <enumeration value="NZL"/>
 *     <enumeration value="OMN"/>
 *     <enumeration value="PAK"/>
 *     <enumeration value="PAN"/>
 *     <enumeration value="PCN"/>
 *     <enumeration value="PER"/>
 *     <enumeration value="PHL"/>
 *     <enumeration value="PLW"/>
 *     <enumeration value="PNG"/>
 *     <enumeration value="POL"/>
 *     <enumeration value="PRI"/>
 *     <enumeration value="PRK"/>
 *     <enumeration value="PRT"/>
 *     <enumeration value="PRY"/>
 *     <enumeration value="PSE"/>
 *     <enumeration value="PYF"/>
 *     <enumeration value="QAT"/>
 *     <enumeration value="REU"/>
 *     <enumeration value="ROU"/>
 *     <enumeration value="RUS"/>
 *     <enumeration value="RWA"/>
 *     <enumeration value="SAU"/>
 *     <enumeration value="SDN"/>
 *     <enumeration value="SEN"/>
 *     <enumeration value="SGP"/>
 *     <enumeration value="SGS"/>
 *     <enumeration value="SHN"/>
 *     <enumeration value="SJM"/>
 *     <enumeration value="SLB"/>
 *     <enumeration value="SLE"/>
 *     <enumeration value="SLV"/>
 *     <enumeration value="SMR"/>
 *     <enumeration value="SOM"/>
 *     <enumeration value="SPM"/>
 *     <enumeration value="SRB"/>
 *     <enumeration value="SSD"/>
 *     <enumeration value="STP"/>
 *     <enumeration value="SUR"/>
 *     <enumeration value="SVK"/>
 *     <enumeration value="SVN"/>
 *     <enumeration value="SWE"/>
 *     <enumeration value="SWZ"/>
 *     <enumeration value="SXM"/>
 *     <enumeration value="SYC"/>
 *     <enumeration value="SYR"/>
 *     <enumeration value="TCA"/>
 *     <enumeration value="TCD"/>
 *     <enumeration value="TGO"/>
 *     <enumeration value="THA"/>
 *     <enumeration value="TJK"/>
 *     <enumeration value="TKL"/>
 *     <enumeration value="TKM"/>
 *     <enumeration value="TLS"/>
 *     <enumeration value="TON"/>
 *     <enumeration value="TTO"/>
 *     <enumeration value="TUN"/>
 *     <enumeration value="TUR"/>
 *     <enumeration value="TUV"/>
 *     <enumeration value="TWN"/>
 *     <enumeration value="TZA"/>
 *     <enumeration value="UGA"/>
 *     <enumeration value="UKR"/>
 *     <enumeration value="UMI"/>
 *     <enumeration value="RKS"/>
 *     <enumeration value="URY"/>
 *     <enumeration value="USA"/>
 *     <enumeration value="UZB"/>
 *     <enumeration value="VAT"/>
 *     <enumeration value="VCT"/>
 *     <enumeration value="VEN"/>
 *     <enumeration value="VGB"/>
 *     <enumeration value="VIR"/>
 *     <enumeration value="VNM"/>
 *     <enumeration value="VUT"/>
 *     <enumeration value="WLF"/>
 *     <enumeration value="WSM"/>
 *     <enumeration value="YEM"/>
 *     <enumeration value="ZAF"/>
 *     <enumeration value="ZMB"/>
 *     <enumeration value="ZWE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CountryCodeSType")
@XmlEnum
public enum CountryCodeSType {


    /**
     * Aruba
     * 
     */
    ABW,

    /**
     * Afghanistan
     * 
     */
    AFG,

    /**
     * Angola
     * 
     */
    AGO,

    /**
     * Anguilla
     * 
     */
    AIA,

    /**
     * Aland Islands
     * 
     */
    ALA,

    /**
     * Albania
     * 
     */
    ALB,

    /**
     * Andorra
     * 
     */
    AND,

    /**
     * United Arab Emirates
     * 
     */
    ARE,

    /**
     * Argentina
     * 
     */
    ARG,

    /**
     * Armenia
     * 
     */
    ARM,

    /**
     * American Samoa
     * 
     */
    ASM,

    /**
     * Antarctica
     * 
     */
    ATA,

    /**
     * French Southern Territories
     * 
     */
    ATF,

    /**
     * Antigua and Barbuda
     * 
     */
    ATG,

    /**
     * Australia
     * 
     */
    AUS,

    /**
     * Austria
     * 
     */
    AUT,

    /**
     * Azerbaijan
     * 
     */
    AZE,

    /**
     * Burundi
     * 
     */
    BDI,

    /**
     * Belgium
     * 
     */
    BEL,

    /**
     * Benin
     * 
     */
    BEN,

    /**
     * Bonaire, Sint Eustatius and Saba
     * 
     */
    BES,

    /**
     * Burkina Faso
     * 
     */
    BFA,

    /**
     * Bangladesh
     * 
     */
    BGD,

    /**
     * Bulgaria
     * 
     */
    BGR,

    /**
     * Bahrain
     * 
     */
    BHR,

    /**
     * Bahamas
     * 
     */
    BHS,

    /**
     * Bosnia and Herzegovina
     * 
     */
    BIH,

    /**
     * Saint Barthelemy
     * 
     */
    BLM,

    /**
     * Belarus
     * 
     */
    BLR,

    /**
     * Belize
     * 
     */
    BLZ,

    /**
     * Bermuda
     * 
     */
    BMU,

    /**
     * Bolivia (Plurinational State of)
     * 
     */
    BOL,

    /**
     * Brazil
     * 
     */
    BRA,

    /**
     * Barbados
     * 
     */
    BRB,

    /**
     * Brunei Darussalam
     * 
     */
    BRN,

    /**
     * Bhutan
     * 
     */
    BTN,

    /**
     * Bouvet Island
     * 
     */
    BVT,

    /**
     * Botswana
     * 
     */
    BWA,

    /**
     * Central African Republic
     * 
     */
    CAF,

    /**
     * Canada
     * 
     */
    CAN,

    /**
     * Cocos (Keeling) Islands
     * 
     */
    CCK,

    /**
     * Switzerland
     * 
     */
    CHE,

    /**
     * Chile
     * 
     */
    CHL,

    /**
     * China
     * 
     */
    CHN,

    /**
     * Cote d'Ivoire
     * 
     */
    CIV,

    /**
     * Cameroon
     * 
     */
    CMR,

    /**
     * Congo, Democratic Republic of the
     * 
     */
    COD,

    /**
     * Congo
     * 
     */
    COG,

    /**
     * Cook Islands
     * 
     */
    COK,

    /**
     * Colombia
     * 
     */
    COL,

    /**
     * Comoros
     * 
     */
    COM,

    /**
     * Cabo Verde
     * 
     */
    CPV,

    /**
     * Costa Rica
     * 
     */
    CRI,

    /**
     * Cuba
     * 
     */
    CUB,

    /**
     * Curacao
     * 
     */
    CUW,

    /**
     * Christmas Island
     * 
     */
    CXR,

    /**
     * Cayman Islands
     * 
     */
    CYM,

    /**
     * Cyprus
     * 
     */
    CYP,

    /**
     * Czechia
     * 
     */
    CZE,

    /**
     * Germany
     * 
     */
    DEU,

    /**
     * Djibouti
     * 
     */
    DJI,

    /**
     * Dominica
     * 
     */
    DMA,

    /**
     * Denmark
     * 
     */
    DNK,

    /**
     * Dominican Republic
     * 
     */
    DOM,

    /**
     * Algeria
     * 
     */
    DZA,

    /**
     * Ecuador
     * 
     */
    ECU,

    /**
     * Egypt
     * 
     */
    EGY,

    /**
     * Eritrea
     * 
     */
    ERI,

    /**
     * Western Sahara
     * 
     */
    ESH,

    /**
     * Spain
     * 
     */
    ESP,

    /**
     * Estonia
     * 
     */
    EST,

    /**
     * Ethiopia
     * 
     */
    ETH,

    /**
     * Finland
     * 
     */
    FIN,

    /**
     * Fiji
     * 
     */
    FJI,

    /**
     * Falkland Islands (Malvinas)
     * 
     */
    FLK,

    /**
     * France
     * 
     */
    FRA,

    /**
     * Faroe Islands
     * 
     */
    FRO,

    /**
     * Micronesia (Federated States of)
     * 
     */
    FSM,

    /**
     * Gabon
     * 
     */
    GAB,

    /**
     * United Kingdom of Great Britain and Northern Ireland
     * 
     */
    GBR,

    /**
     * Georgia
     * 
     */
    GEO,

    /**
     * Guernsey
     * 
     */
    GGY,

    /**
     * Ghana
     * 
     */
    GHA,

    /**
     * Gibraltar
     * 
     */
    GIB,

    /**
     * Guinea
     * 
     */
    GIN,

    /**
     * Guadeloupe
     * 
     */
    GLP,

    /**
     * Gambia
     * 
     */
    GMB,

    /**
     * Guinea-Bissau
     * 
     */
    GNB,

    /**
     * Equatorial Guinea
     * 
     */
    GNQ,

    /**
     * Greece
     * 
     */
    GRC,

    /**
     * Grenada
     * 
     */
    GRD,

    /**
     * Greenland
     * 
     */
    GRL,

    /**
     * Guatemala
     * 
     */
    GTM,

    /**
     * French Guiana
     * 
     */
    GUF,

    /**
     * Guam
     * 
     */
    GUM,

    /**
     * Guyana
     * 
     */
    GUY,

    /**
     * Hong Kong
     * 
     */
    HKG,

    /**
     * Heard Island and McDonald Islands
     * 
     */
    HMD,

    /**
     * Honduras
     * 
     */
    HND,

    /**
     * Croatia
     * 
     */
    HRV,

    /**
     * Haiti
     * 
     */
    HTI,

    /**
     * Hungary
     * 
     */
    HUN,

    /**
     * Indonesia
     * 
     */
    IDN,

    /**
     * Isle of Man
     * 
     */
    IMN,

    /**
     * India
     * 
     */
    IND,

    /**
     * British Indian Ocean Territory
     * 
     */
    IOT,

    /**
     * Ireland
     * 
     */
    IRL,

    /**
     * Iran (Islamic Republic of)
     * 
     */
    IRN,

    /**
     * Iraq
     * 
     */
    IRQ,

    /**
     * Iceland
     * 
     */
    ISL,

    /**
     * Israel
     * 
     */
    ISR,

    /**
     * Italy
     * 
     */
    ITA,

    /**
     * Jamaica
     * 
     */
    JAM,

    /**
     * Jersey
     * 
     */
    JEY,

    /**
     * Jordan
     * 
     */
    JOR,

    /**
     * Japan
     * 
     */
    JPN,

    /**
     * Kazakhstan
     * 
     */
    KAZ,

    /**
     * Kenya
     * 
     */
    KEN,

    /**
     * Kyrgyzstan
     * 
     */
    KGZ,

    /**
     * Cambodia
     * 
     */
    KHM,

    /**
     * Kiribati
     * 
     */
    KIR,

    /**
     * Saint Kitts and Nevis
     * 
     */
    KNA,

    /**
     * Korea, Republic of
     * 
     */
    KOR,

    /**
     * Kuwait
     * 
     */
    KWT,

    /**
     * Lao People's Democratic Republic
     * 
     */
    LAO,

    /**
     * Lebanon
     * 
     */
    LBN,

    /**
     * Liberia
     * 
     */
    LBR,

    /**
     * Libya
     * 
     */
    LBY,

    /**
     * Saint Lucia
     * 
     */
    LCA,

    /**
     * Liechtenstein
     * 
     */
    LIE,

    /**
     * Sri Lanka
     * 
     */
    LKA,

    /**
     * Lesotho
     * 
     */
    LSO,

    /**
     * Lithuania
     * 
     */
    LTU,

    /**
     * Luxembourg
     * 
     */
    LUX,

    /**
     * Latvia
     * 
     */
    LVA,

    /**
     * Macao
     * 
     */
    MAC,

    /**
     * Saint Martin (French part)
     * 
     */
    MAF,

    /**
     * Morocco
     * 
     */
    MAR,

    /**
     * Monaco
     * 
     */
    MCO,

    /**
     * Moldova, Republic of
     * 
     */
    MDA,

    /**
     * Madagascar
     * 
     */
    MDG,

    /**
     * Maldives
     * 
     */
    MDV,

    /**
     * Mexico
     * 
     */
    MEX,

    /**
     * Marshall Islands
     * 
     */
    MHL,

    /**
     * North Macedonia
     * 
     */
    MKD,

    /**
     * Mali
     * 
     */
    MLI,

    /**
     * Malta
     * 
     */
    MLT,

    /**
     * Myanmar
     * 
     */
    MMR,

    /**
     * Montenegro
     * 
     */
    MNE,

    /**
     * Mongolia
     * 
     */
    MNG,

    /**
     * Northern Mariana Islands
     * 
     */
    MNP,

    /**
     * Mozambique
     * 
     */
    MOZ,

    /**
     * Mauritania
     * 
     */
    MRT,

    /**
     * Montserrat
     * 
     */
    MSR,

    /**
     * Martinique
     * 
     */
    MTQ,

    /**
     * Mauritius
     * 
     */
    MUS,

    /**
     * Malawi
     * 
     */
    MWI,

    /**
     * Malaysia
     * 
     */
    MYS,

    /**
     * Mayotte
     * 
     */
    MYT,

    /**
     * Namibia
     * 
     */
    NAM,

    /**
     * New Caledonia
     * 
     */
    NCL,

    /**
     * Niger
     * 
     */
    NER,

    /**
     * Norfolk Island
     * 
     */
    NFK,

    /**
     * Nigeria
     * 
     */
    NGA,

    /**
     * Nicaragua
     * 
     */
    NIC,

    /**
     * Niue
     * 
     */
    NIU,

    /**
     * Netherlands
     * 
     */
    NLD,

    /**
     * Norway
     * 
     */
    NOR,

    /**
     * Nepal
     * 
     */
    NPL,

    /**
     * Nauru
     * 
     */
    NRU,

    /**
     * New Zealand
     * 
     */
    NZL,

    /**
     * Oman
     * 
     */
    OMN,

    /**
     * Pakistan
     * 
     */
    PAK,

    /**
     * Panama
     * 
     */
    PAN,

    /**
     * Pitcairn
     * 
     */
    PCN,

    /**
     * Peru
     * 
     */
    PER,

    /**
     * Philippines
     * 
     */
    PHL,

    /**
     * Palau
     * 
     */
    PLW,

    /**
     * Papua New Guinea
     * 
     */
    PNG,

    /**
     * Poland
     * 
     */
    POL,

    /**
     * Puerto Rico
     * 
     */
    PRI,

    /**
     * Korea (Democratic People's Republic of)
     * 
     */
    PRK,

    /**
     * Portugal
     * 
     */
    PRT,

    /**
     * Paraguay
     * 
     */
    PRY,

    /**
     * Palestine, State of
     * 
     */
    PSE,

    /**
     * French Polynesia
     * 
     */
    PYF,

    /**
     * Qatar
     * 
     */
    QAT,

    /**
     * Reunion
     * 
     */
    REU,

    /**
     * Romania
     * 
     */
    ROU,

    /**
     * Russian Federation
     * 
     */
    RUS,

    /**
     * Rwanda
     * 
     */
    RWA,

    /**
     * Saudi Arabia
     * 
     */
    SAU,

    /**
     * Sudan
     * 
     */
    SDN,

    /**
     * Senegal
     * 
     */
    SEN,

    /**
     * Singapore
     * 
     */
    SGP,

    /**
     * South Georgia and the South Sandwich Islands
     * 
     */
    SGS,

    /**
     * Saint Helena, Ascension and Tristan da Cunha
     * 
     */
    SHN,

    /**
     * Svalbard and Jan Mayen
     * 
     */
    SJM,

    /**
     * Solomon Islands
     * 
     */
    SLB,

    /**
     * Sierra Leone
     * 
     */
    SLE,

    /**
     * El Salvador
     * 
     */
    SLV,

    /**
     * San Marino
     * 
     */
    SMR,

    /**
     * Somalia
     * 
     */
    SOM,

    /**
     * Saint Pierre and Miquelon
     * 
     */
    SPM,

    /**
     * Serbia
     * 
     */
    SRB,

    /**
     * South Sudan
     * 
     */
    SSD,

    /**
     * Sao Tome and Principe
     * 
     */
    STP,

    /**
     * Suriname
     * 
     */
    SUR,

    /**
     * Slovakia
     * 
     */
    SVK,

    /**
     * Slovenia
     * 
     */
    SVN,

    /**
     * Sweden
     * 
     */
    SWE,

    /**
     * Eswatini
     * 
     */
    SWZ,

    /**
     * Sint Maarten (Dutch part)
     * 
     */
    SXM,

    /**
     * Seychelles
     * 
     */
    SYC,

    /**
     * Syrian Arab Republic
     * 
     */
    SYR,

    /**
     * Turks and Caicos Islands
     * 
     */
    TCA,

    /**
     * Chad
     * 
     */
    TCD,

    /**
     * Togo
     * 
     */
    TGO,

    /**
     * Thailand
     * 
     */
    THA,

    /**
     * Tajikistan
     * 
     */
    TJK,

    /**
     * Tokelau
     * 
     */
    TKL,

    /**
     * Turkmenistan
     * 
     */
    TKM,

    /**
     * Timor-Leste
     * 
     */
    TLS,

    /**
     * Tonga
     * 
     */
    TON,

    /**
     * Trinidad and Tobago
     * 
     */
    TTO,

    /**
     * Tunisia
     * 
     */
    TUN,

    /**
     * Turkey
     * 
     */
    TUR,

    /**
     * Tuvalu
     * 
     */
    TUV,

    /**
     * Taiwan, Province of China
     * 
     */
    TWN,

    /**
     * Tanzania, United Republic of
     * 
     */
    TZA,

    /**
     * Uganda
     * 
     */
    UGA,

    /**
     * Ukraine
     * 
     */
    UKR,

    /**
     * United States Minor Outlying Islands
     * 
     */
    UMI,

    /**
     * Kosovo
     * 
     */
    RKS,

    /**
     * Uruguay
     * 
     */
    URY,

    /**
     * United States of America
     * 
     */
    USA,

    /**
     * Uzbekistan
     * 
     */
    UZB,

    /**
     * Holy See
     * 
     */
    VAT,

    /**
     * Saint Vincent and the Grenadines
     * 
     */
    VCT,

    /**
     * Venezuela (Bolivarian Republic of)
     * 
     */
    VEN,

    /**
     * Virgin Islands (British)
     * 
     */
    VGB,

    /**
     * Virgin Islands (U.S.)
     * 
     */
    VIR,

    /**
     * Viet Nam
     * 
     */
    VNM,

    /**
     * Vanuatu
     * 
     */
    VUT,

    /**
     * Wallis and Futuna
     * 
     */
    WLF,

    /**
     * Samoa
     * 
     */
    WSM,

    /**
     * Yemen
     * 
     */
    YEM,

    /**
     * South Africa
     * 
     */
    ZAF,

    /**
     * Zambia
     * 
     */
    ZMB,

    /**
     * Zimbabwe
     * 
     */
    ZWE;

    public String value() {
        return name();
    }

    public static CountryCodeSType fromValue(String v) {
        return valueOf(v);
    }

}
