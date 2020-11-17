//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TableCellRoleType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TableCellRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="rowIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="columnIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rowSpan" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="colSpan" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="header" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableCellRoleType")
public class TableCellRoleType {

    @XmlAttribute(name = "rowIndex", required = true)
    protected int rowIndex;
    @XmlAttribute(name = "columnIndex", required = true)
    protected int columnIndex;
    @XmlAttribute(name = "rowSpan")
    protected Integer rowSpan;
    @XmlAttribute(name = "colSpan")
    protected Integer colSpan;
    @XmlAttribute(name = "header")
    protected Boolean header;

    /**
     * Obtém o valor da propriedade rowIndex.
     * 
     */
    public int getRowIndex() {
        return rowIndex;
    }

    /**
     * Define o valor da propriedade rowIndex.
     * 
     */
    public void setRowIndex(int value) {
        this.rowIndex = value;
    }

    /**
     * Obtém o valor da propriedade columnIndex.
     * 
     */
    public int getColumnIndex() {
        return columnIndex;
    }

    /**
     * Define o valor da propriedade columnIndex.
     * 
     */
    public void setColumnIndex(int value) {
        this.columnIndex = value;
    }

    /**
     * Obtém o valor da propriedade rowSpan.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowSpan() {
        return rowSpan;
    }

    /**
     * Define o valor da propriedade rowSpan.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowSpan(Integer value) {
        this.rowSpan = value;
    }

    /**
     * Obtém o valor da propriedade colSpan.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColSpan() {
        return colSpan;
    }

    /**
     * Define o valor da propriedade colSpan.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColSpan(Integer value) {
        this.colSpan = value;
    }

    /**
     * Obtém o valor da propriedade header.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeader() {
        return header;
    }

    /**
     * Define o valor da propriedade header.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeader(Boolean value) {
        this.header = value;
    }

}
