//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.08 at 03:36:14 PM MST 
//


package nl.wldelft.fews;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaylightSavingObservedTimeZoneEnumStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaylightSavingObservedTimeZoneEnumStringType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AST"/&gt;
 *     &lt;enumeration value="PST"/&gt;
 *     &lt;enumeration value="MST"/&gt;
 *     &lt;enumeration value="CST"/&gt;
 *     &lt;enumeration value="IET"/&gt;
 *     &lt;enumeration value="CNT"/&gt;
 *     &lt;enumeration value="AGT"/&gt;
 *     &lt;enumeration value="BET"/&gt;
 *     &lt;enumeration value="WET"/&gt;
 *     &lt;enumeration value="CET"/&gt;
 *     &lt;enumeration value="MET"/&gt;
 *     &lt;enumeration value="EET"/&gt;
 *     &lt;enumeration value="AZT"/&gt;
 *     &lt;enumeration value="NET"/&gt;
 *     &lt;enumeration value="AET"/&gt;
 *     &lt;enumeration value="AWT"/&gt;
 *     &lt;enumeration value="NST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DaylightSavingObservedTimeZoneEnumStringType")
@XmlEnum
public enum DaylightSavingObservedTimeZoneEnumStringType {


    /**
     * Alaska Standard Time, winter:GMT-9 summer:GMT-8
     * 
     */
    AST,

    /**
     * Pacific Standard Time, winter:GMT-8 summer:GMT-7
     * 
     */
    PST,

    /**
     * Mountain Standard Time, winter and summer:GMT-7
     * 
     */
    MST,

    /**
     * Central Standard Time, winter:GMT-6 summer:GMT-5
     * 
     */
    CST,

    /**
     * Eastern Standard Time, winter:GMT-5 summer:GMT-4
     * 
     */
    IET,

    /**
     * Newfoundland Standard Time, winter:GMT-3:30 summer:GMT-2:30
     * 
     */
    CNT,

    /**
     * Argentine Time, winter:GMT-3 summer:GMT-2
     * 
     */
    AGT,

    /**
     * Brasilia Time, winter:GMT-3 summer:GMT-2
     * 
     */
    BET,

    /**
     * Western European Time, winter:GMT+0 summer:GMT+1
     * 
     */
    WET,

    /**
     * Central European Time, winter:GMT+1 summer:GMT+2
     * 
     */
    CET,

    /**
     * Middle Europe Time, winter:GMT+1 summer:GMT+2
     * 
     */
    MET,

    /**
     * Eastern European Time, winter:GMT+2 summer:GMT+3
     * 
     */
    EET,

    /**
     * Azerbaijan Time, winter:GMT+4 summer:GMT+5
     * 
     */
    AZT,

    /**
     * Armenia Time, winter:GMT+4 summer:GMT+5
     * 
     */
    NET,

    /**
     * Australia Eastern Time (New South Wales), winter:GMT+10 summer:GMT+11
     * 
     */
    AET,

    /**
     * Since 2013.01. Australia Western Time, winter:GMT+8 summer:GMT+9
     * 
     */
    AWT,

    /**
     * New Zealand Standard Time, winter:GMT+12 summer:GMT+13
     * 
     */
    NST;

    public String value() {
        return name();
    }

    public static DaylightSavingObservedTimeZoneEnumStringType fromValue(String v) {
        return valueOf(v);
    }

}
