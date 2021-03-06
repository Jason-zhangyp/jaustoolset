//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.04 at 04:33:14 PM EST 
//


package org.jts.jsidl.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{urn:jaus:jsidl:1.0}record"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}declared_record"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}list"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}declared_list"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}variant"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}declared_variant"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}sequence"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}declared_sequence"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{urn:jaus:jsidl:1.0}identifier" />
 *       &lt;attribute name="interpretation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "record",
    "declaredRecord",
    "list",
    "declaredList",
    "variant",
    "declaredVariant",
    "sequence",
    "declaredSequence"
})
@XmlRootElement(name = "footer")
public class Footer {

    protected Record record;
    @XmlElement(name = "declared_record")
    protected DeclaredRecord declaredRecord;
    protected List list;
    @XmlElement(name = "declared_list")
    protected DeclaredList declaredList;
    protected Variant variant;
    @XmlElement(name = "declared_variant")
    protected DeclaredVariant declaredVariant;
    protected Sequence sequence;
    @XmlElement(name = "declared_sequence")
    protected DeclaredSequence declaredSequence;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "interpretation")
    @XmlSchemaType(name = "anySimpleType")
    protected String interpretation;

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link Record }
     *     
     */
    public Record getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link Record }
     *     
     */
    public void setRecord(Record value) {
        this.record = value;
    }

    /**
     * Gets the value of the declaredRecord property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredRecord }
     *     
     */
    public DeclaredRecord getDeclaredRecord() {
        return declaredRecord;
    }

    /**
     * Sets the value of the declaredRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredRecord }
     *     
     */
    public void setDeclaredRecord(DeclaredRecord value) {
        this.declaredRecord = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setList(List value) {
        this.list = value;
    }

    /**
     * Gets the value of the declaredList property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredList }
     *     
     */
    public DeclaredList getDeclaredList() {
        return declaredList;
    }

    /**
     * Sets the value of the declaredList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredList }
     *     
     */
    public void setDeclaredList(DeclaredList value) {
        this.declaredList = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setVariant(Variant value) {
        this.variant = value;
    }

    /**
     * Gets the value of the declaredVariant property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredVariant }
     *     
     */
    public DeclaredVariant getDeclaredVariant() {
        return declaredVariant;
    }

    /**
     * Sets the value of the declaredVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredVariant }
     *     
     */
    public void setDeclaredVariant(DeclaredVariant value) {
        this.declaredVariant = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Sequence }
     *     
     */
    public Sequence getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sequence }
     *     
     */
    public void setSequence(Sequence value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the declaredSequence property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredSequence }
     *     
     */
    public DeclaredSequence getDeclaredSequence() {
        return declaredSequence;
    }

    /**
     * Sets the value of the declaredSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredSequence }
     *     
     */
    public void setDeclaredSequence(DeclaredSequence value) {
        this.declaredSequence = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        String[] ignore={"interpretation"};
		return EqualsBuilder.reflectionEquals(this, that, ignore);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
