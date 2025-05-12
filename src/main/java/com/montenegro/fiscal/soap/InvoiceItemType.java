
package com.montenegro.fiscal.soap;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="N" use="required" type="{https://efi.tax.gov.me/fs/schema}String50SType" />
 *       <attribute name="C" type="{https://efi.tax.gov.me/fs/schema}String50SType" />
 *       <attribute name="U" use="required" type="{https://efi.tax.gov.me/fs/schema}String50SType" />
 *       <attribute name="Q" use="required" type="{https://efi.tax.gov.me/fs/schema}DoubleNegForQuantitySType" />
 *       <attribute name="UPB" use="required" type="{https://efi.tax.gov.me/fs/schema}Decimal4SType" />
 *       <attribute name="UPA" use="required" type="{https://efi.tax.gov.me/fs/schema}Decimal4SType" />
 *       <attribute name="R" type="{https://efi.tax.gov.me/fs/schema}Decimal4SType" />
 *       <attribute name="RR" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PB" use="required" type="{https://efi.tax.gov.me/fs/schema}Decimal4NegSType" />
 *       <attribute name="VR" type="{https://efi.tax.gov.me/fs/schema}Decimal4SType" />
 *       <attribute name="VA" type="{https://efi.tax.gov.me/fs/schema}Decimal4NegSType" />
 *       <attribute name="IN" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PA" use="required" type="{https://efi.tax.gov.me/fs/schema}Decimal4NegSType" />
 *       <attribute name="EX" type="{https://efi.tax.gov.me/fs/schema}ExemptFromVATSType" />
 *       <attribute name="VD" type="{https://efi.tax.gov.me/fs/schema}DateSType" />
 *       <attribute name="VSN" type="{https://efi.tax.gov.me/fs/schema}VoucherNumSType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItemType")
public class InvoiceItemType {

    @XmlAttribute(name = "N", required = true)
    protected String n;
    @XmlAttribute(name = "C")
    protected String c;
    @XmlAttribute(name = "U", required = true)
    protected String u;
    @XmlAttribute(name = "Q", required = true)
    protected double q;
    @XmlAttribute(name = "UPB", required = true)
    protected BigDecimal upb;
    @XmlAttribute(name = "UPA", required = true)
    protected BigDecimal upa;
    @XmlAttribute(name = "R")
    protected BigDecimal r;
    @XmlAttribute(name = "RR")
    protected Boolean rr;
    @XmlAttribute(name = "PB", required = true)
    protected BigDecimal pb;
    @XmlAttribute(name = "VR")
    protected BigDecimal vr;
    @XmlAttribute(name = "VA")
    protected BigDecimal va;
    @XmlAttribute(name = "IN")
    protected Boolean in;
    @XmlAttribute(name = "PA", required = true)
    protected BigDecimal pa;
    @XmlAttribute(name = "EX")
    protected ExemptFromVATSType ex;
    @XmlAttribute(name = "VD")
    protected XMLGregorianCalendar vd;
    @XmlAttribute(name = "VSN")
    protected String vsn;

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC(String value) {
        this.c = value;
    }

    /**
     * Gets the value of the u property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setU(String value) {
        this.u = value;
    }

    /**
     * Gets the value of the q property.
     * 
     */
    public double getQ() {
        return q;
    }

    /**
     * Sets the value of the q property.
     * 
     */
    public void setQ(double value) {
        this.q = value;
    }

    /**
     * Gets the value of the upb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPB() {
        return upb;
    }

    /**
     * Sets the value of the upb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUPB(BigDecimal value) {
        this.upb = value;
    }

    /**
     * Gets the value of the upa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPA() {
        return upa;
    }

    /**
     * Sets the value of the upa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUPA(BigDecimal value) {
        this.upa = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR(BigDecimal value) {
        this.r = value;
    }

    /**
     * Gets the value of the rr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRR() {
        return rr;
    }

    /**
     * Sets the value of the rr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRR(Boolean value) {
        this.rr = value;
    }

    /**
     * Gets the value of the pb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPB() {
        return pb;
    }

    /**
     * Sets the value of the pb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPB(BigDecimal value) {
        this.pb = value;
    }

    /**
     * Gets the value of the vr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVR() {
        return vr;
    }

    /**
     * Sets the value of the vr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVR(BigDecimal value) {
        this.vr = value;
    }

    /**
     * Gets the value of the va property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVA() {
        return va;
    }

    /**
     * Sets the value of the va property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVA(BigDecimal value) {
        this.va = value;
    }

    /**
     * Gets the value of the in property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIN() {
        return in;
    }

    /**
     * Sets the value of the in property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIN(Boolean value) {
        this.in = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPA() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPA(BigDecimal value) {
        this.pa = value;
    }

    /**
     * Gets the value of the ex property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptFromVATSType }
     *     
     */
    public ExemptFromVATSType getEX() {
        return ex;
    }

    /**
     * Sets the value of the ex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptFromVATSType }
     *     
     */
    public void setEX(ExemptFromVATSType value) {
        this.ex = value;
    }

    /**
     * Gets the value of the vd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVD() {
        return vd;
    }

    /**
     * Sets the value of the vd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVD(XMLGregorianCalendar value) {
        this.vd = value;
    }

    /**
     * Gets the value of the vsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSN() {
        return vsn;
    }

    /**
     * Sets the value of the vsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSN(String value) {
        this.vsn = value;
    }

}
