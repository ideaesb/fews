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
import javax.xml.bind.annotation.XmlType;


/**
 * Intended for the configuration of any table
 * 
 * <p>Java class for GlobalTableComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalTableComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="columnIds" type="{http://www.wldelft.nl/fews/PI}ColumnIdsComplexType" minOccurs="0"/&gt;
 *         &lt;element name="columnTypes" type="{http://www.wldelft.nl/fews/PI}ColumnTypesComplexType" minOccurs="0"/&gt;
 *         &lt;element name="columnUnits" type="{http://www.wldelft.nl/fews/PI}ColumnIdsComplexType" minOccurs="0"/&gt;
 *         &lt;element name="columnMetaData" type="{http://www.wldelft.nl/fews/PI}ColumnMetaDataComplexType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="row" type="{http://www.wldelft.nl/fews/PI}RowComplexType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalTableComplexType", propOrder = {
    "columnIds",
    "columnTypes",
    "columnUnits",
    "columnMetaData",
    "row"
})
public class GlobalTableComplexType {

    protected ColumnIdsComplexType columnIds;
    protected ColumnTypesComplexType columnTypes;
    protected ColumnIdsComplexType columnUnits;
    protected List<ColumnMetaDataComplexType> columnMetaData;
    @XmlElement(required = true)
    protected List<RowComplexType> row;

    /**
     * Gets the value of the columnIds property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnIdsComplexType }
     *     
     */
    public ColumnIdsComplexType getColumnIds() {
        return columnIds;
    }

    /**
     * Sets the value of the columnIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnIdsComplexType }
     *     
     */
    public void setColumnIds(ColumnIdsComplexType value) {
        this.columnIds = value;
    }

    /**
     * Gets the value of the columnTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnTypesComplexType }
     *     
     */
    public ColumnTypesComplexType getColumnTypes() {
        return columnTypes;
    }

    /**
     * Sets the value of the columnTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnTypesComplexType }
     *     
     */
    public void setColumnTypes(ColumnTypesComplexType value) {
        this.columnTypes = value;
    }

    /**
     * Gets the value of the columnUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnIdsComplexType }
     *     
     */
    public ColumnIdsComplexType getColumnUnits() {
        return columnUnits;
    }

    /**
     * Sets the value of the columnUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnIdsComplexType }
     *     
     */
    public void setColumnUnits(ColumnIdsComplexType value) {
        this.columnUnits = value;
    }

    /**
     * Gets the value of the columnMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnMetaDataComplexType }
     * 
     * 
     */
    public List<ColumnMetaDataComplexType> getColumnMetaData() {
        if (columnMetaData == null) {
            columnMetaData = new ArrayList<ColumnMetaDataComplexType>();
        }
        return this.columnMetaData;
    }

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowComplexType }
     * 
     * 
     */
    public List<RowComplexType> getRow() {
        if (row == null) {
            row = new ArrayList<RowComplexType>();
        }
        return this.row;
    }

}
