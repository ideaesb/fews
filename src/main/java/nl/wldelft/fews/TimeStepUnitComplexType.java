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
 * The time unit element has two attributes, unit and divider. the unit is required and can be 1, 2, 3, or 4 meaning: year, month, day and hour. The divider attribute is optional (default = 1).
 * 
 * <p>Java class for TimeStepUnitComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeStepUnitComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="unit" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;enumeration value="1"/&gt;
 *             &lt;enumeration value="2"/&gt;
 *             &lt;enumeration value="3"/&gt;
 *             &lt;enumeration value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="divider" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeStepUnitComplexType")
public class TimeStepUnitComplexType {

    @XmlAttribute(name = "unit", required = true)
    protected int unit;
    @XmlAttribute(name = "divider")
    protected Integer divider;

    /**
     * Gets the value of the unit property.
     * 
     */
    public int getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     */
    public void setUnit(int value) {
        this.unit = value;
    }

    /**
     * Gets the value of the divider property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDivider() {
        if (divider == null) {
            return  1;
        } else {
            return divider;
        }
    }

    /**
     * Sets the value of the divider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDivider(Integer value) {
        this.divider = value;
    }

}
