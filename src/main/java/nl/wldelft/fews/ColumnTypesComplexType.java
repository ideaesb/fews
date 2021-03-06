//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.08 at 03:36:14 PM MST 
//


package nl.wldelft.fews;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Value-types in the columns A through Z. If no type specified, type 'String' is assumed.
 * 
 * <p>Java class for ColumnTypesComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnTypesComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="A" use="required" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="B" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="C" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="D" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="E" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="F" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="G" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="H" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="I" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="J" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="K" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="L" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="M" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="N" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="O" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="P" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="Q" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="R" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="S" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="T" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="U" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="V" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="W" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="X" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="Y" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *       &lt;attribute name="Z" type="{http://www.wldelft.nl/fews/PI}ValueTypeEnumStringType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnTypesComplexType")
public class ColumnTypesComplexType {

    @XmlAttribute(name = "A", required = true)
    protected ValueTypeEnumStringType a;
    @XmlAttribute(name = "B")
    protected ValueTypeEnumStringType b;
    @XmlAttribute(name = "C")
    protected ValueTypeEnumStringType c;
    @XmlAttribute(name = "D")
    protected ValueTypeEnumStringType d;
    @XmlAttribute(name = "E")
    protected ValueTypeEnumStringType e;
    @XmlAttribute(name = "F")
    protected ValueTypeEnumStringType f;
    @XmlAttribute(name = "G")
    protected ValueTypeEnumStringType g;
    @XmlAttribute(name = "H")
    protected ValueTypeEnumStringType h;
    @XmlAttribute(name = "I")
    protected ValueTypeEnumStringType i;
    @XmlAttribute(name = "J")
    protected ValueTypeEnumStringType j;
    @XmlAttribute(name = "K")
    protected ValueTypeEnumStringType k;
    @XmlAttribute(name = "L")
    protected ValueTypeEnumStringType l;
    @XmlAttribute(name = "M")
    protected ValueTypeEnumStringType m;
    @XmlAttribute(name = "N")
    protected ValueTypeEnumStringType n;
    @XmlAttribute(name = "O")
    protected ValueTypeEnumStringType o;
    @XmlAttribute(name = "P")
    protected ValueTypeEnumStringType p;
    @XmlAttribute(name = "Q")
    protected ValueTypeEnumStringType q;
    @XmlAttribute(name = "R")
    protected ValueTypeEnumStringType r;
    @XmlAttribute(name = "S")
    protected ValueTypeEnumStringType s;
    @XmlAttribute(name = "T")
    protected ValueTypeEnumStringType t;
    @XmlAttribute(name = "U")
    protected ValueTypeEnumStringType u;
    @XmlAttribute(name = "V")
    protected ValueTypeEnumStringType v;
    @XmlAttribute(name = "W")
    protected ValueTypeEnumStringType w;
    @XmlAttribute(name = "X")
    protected ValueTypeEnumStringType x;
    @XmlAttribute(name = "Y")
    protected ValueTypeEnumStringType y;
    @XmlAttribute(name = "Z")
    protected ValueTypeEnumStringType z;

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setA(ValueTypeEnumStringType value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setB(ValueTypeEnumStringType value) {
        this.b = value;
    }

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setC(ValueTypeEnumStringType value) {
        this.c = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setD(ValueTypeEnumStringType value) {
        this.d = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setE(ValueTypeEnumStringType value) {
        this.e = value;
    }

    /**
     * Gets the value of the f property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setF(ValueTypeEnumStringType value) {
        this.f = value;
    }

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setG(ValueTypeEnumStringType value) {
        this.g = value;
    }

    /**
     * Gets the value of the h property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setH(ValueTypeEnumStringType value) {
        this.h = value;
    }

    /**
     * Gets the value of the i property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getI() {
        return i;
    }

    /**
     * Sets the value of the i property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setI(ValueTypeEnumStringType value) {
        this.i = value;
    }

    /**
     * Gets the value of the j property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getJ() {
        return j;
    }

    /**
     * Sets the value of the j property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setJ(ValueTypeEnumStringType value) {
        this.j = value;
    }

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setK(ValueTypeEnumStringType value) {
        this.k = value;
    }

    /**
     * Gets the value of the l property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setL(ValueTypeEnumStringType value) {
        this.l = value;
    }

    /**
     * Gets the value of the m property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setM(ValueTypeEnumStringType value) {
        this.m = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setN(ValueTypeEnumStringType value) {
        this.n = value;
    }

    /**
     * Gets the value of the o property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getO() {
        return o;
    }

    /**
     * Sets the value of the o property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setO(ValueTypeEnumStringType value) {
        this.o = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setP(ValueTypeEnumStringType value) {
        this.p = value;
    }

    /**
     * Gets the value of the q property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getQ() {
        return q;
    }

    /**
     * Sets the value of the q property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setQ(ValueTypeEnumStringType value) {
        this.q = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setR(ValueTypeEnumStringType value) {
        this.r = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setS(ValueTypeEnumStringType value) {
        this.s = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setT(ValueTypeEnumStringType value) {
        this.t = value;
    }

    /**
     * Gets the value of the u property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setU(ValueTypeEnumStringType value) {
        this.u = value;
    }

    /**
     * Gets the value of the v property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getV() {
        return v;
    }

    /**
     * Sets the value of the v property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setV(ValueTypeEnumStringType value) {
        this.v = value;
    }

    /**
     * Gets the value of the w property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getW() {
        return w;
    }

    /**
     * Sets the value of the w property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setW(ValueTypeEnumStringType value) {
        this.w = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setX(ValueTypeEnumStringType value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setY(ValueTypeEnumStringType value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public ValueTypeEnumStringType getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnumStringType }
     *     
     */
    public void setZ(ValueTypeEnumStringType value) {
        this.z = value;
    }

}
