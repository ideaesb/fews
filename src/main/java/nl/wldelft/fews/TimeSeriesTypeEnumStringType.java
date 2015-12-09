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
 * <p>Java class for timeSeriesTypeEnumStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeSeriesTypeEnumStringType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="external historical"/&gt;
 *     &lt;enumeration value="external forecasting"/&gt;
 *     &lt;enumeration value="simulated historical"/&gt;
 *     &lt;enumeration value="simulated forecasting"/&gt;
 *     &lt;enumeration value="temporary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "timeSeriesTypeEnumStringType")
@XmlEnum
public enum TimeSeriesTypeEnumStringType {

    @XmlEnumValue("external historical")
    EXTERNAL_HISTORICAL("external historical"),
    @XmlEnumValue("external forecasting")
    EXTERNAL_FORECASTING("external forecasting"),
    @XmlEnumValue("simulated historical")
    SIMULATED_HISTORICAL("simulated historical"),
    @XmlEnumValue("simulated forecasting")
    SIMULATED_FORECASTING("simulated forecasting"),
    @XmlEnumValue("temporary")
    TEMPORARY("temporary");
    private final String value;

    TimeSeriesTypeEnumStringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeSeriesTypeEnumStringType fromValue(String v) {
        for (TimeSeriesTypeEnumStringType c: TimeSeriesTypeEnumStringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
