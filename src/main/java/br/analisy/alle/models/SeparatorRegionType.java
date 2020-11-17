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
 * 			Separators are lines that lie between columns and
 * 			paragraphs and can be used to logically separate
 * 			different articles from each other.
 * 			
 * 
 * <p>Classe Java de SeparatorRegionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SeparatorRegionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RegionType">
 *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="colour" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ColourSimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparatorRegionType")
public class SeparatorRegionType
    extends RegionType
{

    @XmlAttribute(name = "orientation")
    protected Float orientation;
    @XmlAttribute(name = "colour")
    protected ColourSimpleType colour;

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
    
    public boolean vertical() {
    	return (this.coords.p2.getX() - this.coords.p1.getX()) < (this.coords.p2.getY() - this.coords.p1.getY());
    }
    
    public boolean middle() {
    	return true;
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
     * Obtém o valor da propriedade colour.
     * 
     * @return
     *     possible object is
     *     {@link ColourSimpleType }
     *     
     */
    public ColourSimpleType getColour() {
        return colour;
    }

    /**
     * Define o valor da propriedade colour.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourSimpleType }
     *     
     */
    public void setColour(ColourSimpleType value) {
        this.colour = value;
    }

}
