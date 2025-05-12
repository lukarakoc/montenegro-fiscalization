
package com.montenegro.fiscal.soap;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashDepositType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashDepositType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="ChangeDateTime" use="required" type="{https://efi.tax.gov.me/fs/schema}UTCSType" />
 *       <attribute name="Operation" use="required" type="{https://efi.tax.gov.me/fs/schema}CashDepositOperationSType" />
 *       <attribute name="CashAmt" use="required" type="{https://efi.tax.gov.me/fs/schema}DecimalSType" />
 *       <attribute name="TCRCode" use="required" type="{https://efi.tax.gov.me/fs/schema}RegistrationCodeSType" />
 *       <attribute name="IssuerTIN" use="required" type="{https://efi.tax.gov.me/fs/schema}TINSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashDepositType")
public class CashDepositType {

    @XmlAttribute(name = "ChangeDateTime", required = true)
    protected XMLGregorianCalendar changeDateTime;
    @XmlAttribute(name = "Operation", required = true)
    protected CashDepositOperationSType operation;
    @XmlAttribute(name = "CashAmt", required = true)
    protected BigDecimal cashAmt;
    @XmlAttribute(name = "TCRCode", required = true)
    protected String tcrCode;
    @XmlAttribute(name = "IssuerTIN", required = true)
    protected String issuerTIN;

    /**
     * Gets the value of the changeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDateTime() {
        return changeDateTime;
    }

    /**
     * Sets the value of the changeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDateTime(XMLGregorianCalendar value) {
        this.changeDateTime = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link CashDepositOperationSType }
     *     
     */
    public CashDepositOperationSType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDepositOperationSType }
     *     
     */
    public void setOperation(CashDepositOperationSType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the cashAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashAmt() {
        return cashAmt;
    }

    /**
     * Sets the value of the cashAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashAmt(BigDecimal value) {
        this.cashAmt = value;
    }

    /**
     * Gets the value of the tcrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRCode() {
        return tcrCode;
    }

    /**
     * Sets the value of the tcrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCRCode(String value) {
        this.tcrCode = value;
    }

    /**
     * Gets the value of the issuerTIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerTIN() {
        return issuerTIN;
    }

    /**
     * Sets the value of the issuerTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerTIN(String value) {
        this.issuerTIN = value;
    }

}
