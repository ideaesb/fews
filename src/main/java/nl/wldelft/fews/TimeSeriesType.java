//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.08 at 03:36:14 PM MST 
//


package nl.wldelft.fews;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeSeriesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeSeriesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accumulative"/&gt;
 *     &lt;enumeration value="instantaneous"/&gt;
 *     &lt;enumeration value="mean"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "timeSeriesType")
@XmlEnum
public enum TimeSeriesType {

    @XmlEnumValue("accumulative")
    ACCUMULATIVE("accumulative"),
    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),
    @XmlEnumValue("mean")
    MEAN("mean");
    private final String value;

    TimeSeriesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeSeriesType fromValue(String v) {
        for (TimeSeriesType c: TimeSeriesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
