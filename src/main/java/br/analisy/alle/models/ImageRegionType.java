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
 * 			An image is considered to be more intricate and complex
 * 			than a graphic. These can be photos or drawings.
 * 			
 * 
 * <p>Classe Java de ImageRegionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImageRegionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RegionType">
 *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="colourDepth" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ColourDepthSimpleType" />
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
@XmlType(name = "ImageRegionType")
public class ImageRegionType
    extends RegionType
{

    @XmlAttribute(name = "orientation")
    protected Float orientation;
    @XmlAttribute(name = "colourDepth")
    protected ColourDepthSimpleType colourDepth;
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
     * Obtém o valor da propriedade colourDepth.
     * 
     * @return
     *     possible object is
     *     {@link ColourDepthSimpleType }
     *     
     */
    public ColourDepthSimpleType getColourDepth() {
        return colourDepth;
    }

    /**
     * Define o valor da propriedade colourDepth.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourDepthSimpleType }
     *     
     */
    public void setColourDepth(ColourDepthSimpleType value) {
        this.colourDepth = value;
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
