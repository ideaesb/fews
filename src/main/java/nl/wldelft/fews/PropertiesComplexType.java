//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.08 at 03:36:14 PM MST 
//


package nl.wldelft.fews;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertiesComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertiesComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="string" type="{http://www.wldelft.nl/fews/PI}StringPropertyComplexType"/&gt;
 *           &lt;element name="int" type="{http://www.wldelft.nl/fews/PI}IntPropertyComplexType"/&gt;
 *           &lt;element name="float" type="{http://www.wldelft.nl/fews/PI}FloatPropertyComplexType"/&gt;
 *           &lt;element name="double" type="{http://www.wldelft.nl/fews/PI}DoublePropertyComplexType"/&gt;
 *           &lt;element name="bool" type="{http://www.wldelft.nl/fews/PI}BoolPropertyComplexType"/&gt;
 *           &lt;element name="dateTime" type="{http://www.wldelft.nl/fews/PI}DateTimePropertyComplexType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertiesComplexType", propOrder = {
    "description",
    "stringOrIntOrFloat"
})
public class PropertiesComplexType {

    protected String description;
    @XmlElements({
        @XmlElement(name = "string", type = StringPropertyComplexType.class),
        @XmlElement(name = "int", type = IntPropertyComplexType.class),
        @XmlElement(name = "float", type = FloatPropertyComplexType.class),
        @XmlElement(name = "double", type = DoublePropertyComplexType.class),
        @XmlElement(name = "bool", type = BoolPropertyComplexType.class),
        @XmlElement(name = "dateTime", type = DateTimePropertyComplexType.class)
    })
    protected List<Object> stringOrIntOrFloat;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the stringOrIntOrFloat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringOrIntOrFloat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringOrIntOrFloat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyComplexType }
     * {@link IntPropertyComplexType }
     * {@link FloatPropertyComplexType }
     * {@link DoublePropertyComplexType }
     * {@link BoolPropertyComplexType }
     * {@link DateTimePropertyComplexType }
     * 
     * 
     */
    public List<Object> getStringOrIntOrFloat() {
        if (stringOrIntOrFloat == null) {
            stringOrIntOrFloat = new ArrayList<Object>();
        }
        return this.stringOrIntOrFloat;
    }

}