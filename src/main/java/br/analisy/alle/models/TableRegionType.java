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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Tabular data in any form is represented with a table
 * 			region. Rows and columns may or may not have separator
 * 			lines; these lines are not separator regions.
 * 			
 * 
 * <p>Classe Java de TableRegionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TableRegionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RegionType">
 *       &lt;sequence>
 *         &lt;element name="Grid" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}GridType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="rows" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="columns" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lineColour" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ColourSimpleType" />
 *       &lt;attribute name="bgColour" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ColourSimpleType" />
 *       &lt;attribute name="lineSeparators" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="embText" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableRegionType", propOrder = {
    "grid"
})
public class TableRegionType
    extends RegionType
{

    @XmlElement(name = "Grid")
    protected GridType grid;
    @XmlAttribute(name = "orientation")
    protected Float orientation;
    @XmlAttribute(name = "rows")
    protected Integer rows;
    @XmlAttribute(name = "columns")
    protected Integer columns;
    @XmlAttribute(name = "lineColour")
    protected ColourSimpleType lineColour;
    @XmlAttribute(name = "bgColour")
    protected ColourSimpleType bgColour;
    @XmlAttribute(name = "lineSeparators")
    protected Boolean lineSeparators;
    @XmlAttribute(name = "embText")
    protected Boolean embText;

    /**
     * Obtém o valor da propriedade grid.
     * 
     * @return
     *     possible object is
     *     {@link GridType }
     *     
     */
    public GridType getGrid() {
        return grid;
    }

    /**
     * Define o valor da propriedade grid.
     * 
     * @param value
     *     allowed object is
     *     {@link GridType }
     *     
     */
    public void setGrid(GridType value) {
        this.grid = value;
    }

    /**
     * Obtém o valor da propriedade orientation.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrientation() {
        return orientation;
    }

    /**
     * Define o valor da propriedade orientation.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrientation(Float value) {
        this.orientation = value;
    }

    /**
     * Obtém o valor da propriedade rows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * Define o valor da propriedade rows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRows(Integer value) {
        this.rows = value;
    }

    /**
     * Obtém o valor da propriedade columns.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColumns() {
        return columns;
    }

    /**
     * Define o valor da propriedade columns.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColumns(Integer value) {
        this.columns = value;
    }

    /**
     * Obtém o valor da propriedade lineColour.
     * 
     * @return
     *     possible object is
     *     {@link ColourSimpleType }
     *     
     */
    public ColourSimpleType getLineColour() {
        return lineColour;
    }

    /**
     * Define o valor da propriedade lineColour.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourSimpleType }
     *     
     */
    public void setLineColour(ColourSimpleType value) {
        this.lineColour = value;
    }

    /**
     * Obtém o valor da propriedade bgColour.
     * 
     * @return
     *     possible object is
     *     {@link ColourSimpleType }
     *     
     */
    public ColourSimpleType getBgColour() {
        return bgColour;
    }

    /**
     * Define o valor da propriedade bgColour.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourSimpleType }
     *     
     */
    public void setBgColour(ColourSimpleType value) {
        this.bgColour = value;
    }

    /**
     * Obtém o valor da propriedade lineSeparators.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineSeparators() {
        return lineSeparators;
    }

    /**
     * Define o valor da propriedade lineSeparators.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineSeparators(Boolean value) {
        this.lineSeparators = value;
    }

    /**
     * Obtém o valor da propriedade embText.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmbText() {
        return embText;
    }

    /**
     * Define o valor da propriedade embText.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbText(Boolean value) {
        this.embText = value;
    }

}
