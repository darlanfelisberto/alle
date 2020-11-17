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
 * 
 * 			Regions containing charts or graphs of any type, should
 * 			be marked as chart regions.
 * 			
 * 
 * <p>Classe Java de ChartRegionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChartRegionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RegionType">
 *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="type" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ChartTypeSimpleType" />
 *       &lt;attribute name="numColours" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bgColour" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ColourSimpleType" />
 *       &lt;attribute name="embText" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartRegionType")
public class ChartRegionType
    extends RegionType
{

    @XmlAttribute(name = "orientation")
    protected Float orientation;
    @XmlAttribute(name = "type")
    protected ChartTypeSimpleType type;
    @XmlAttribute(name = "numColours")
    protected Integer numColours;
    @XmlAttribute(name = "bgColour")
    protected ColourSimpleType bgColour;
    @XmlAttribute(name = "embText")
    protected Boolean embText;

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
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link ChartTypeSimpleType }
     *     
     */
    public ChartTypeSimpleType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartTypeSimpleType }
     *     
     */
    public void setType(ChartTypeSimpleType value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade numColours.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumColours() {
        return numColours;
    }

    /**
     * Define o valor da propriedade numColours.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumColours(Integer value) {
        this.numColours = value;
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
