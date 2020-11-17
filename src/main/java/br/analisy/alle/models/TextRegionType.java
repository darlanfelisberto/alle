//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Pure text is represented as a text region. This includes
 * 			drop capitals, but practically ornate text may be
 * 			considered as a graphic.
 * 			
 * 
 * <p>Classe Java de TextRegionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TextRegionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RegionType">
 *       &lt;sequence>
 *         &lt;element name="TextLine" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextLineType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextEquiv" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextEquivType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextStyle" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextStyleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="type" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextTypeSimpleType" />
 *       &lt;attribute name="leading" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="readingDirection" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ReadingDirectionSimpleType" />
 *       &lt;attribute name="textLineOrder" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextLineOrderSimpleType" />
 *       &lt;attribute name="readingOrientation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="indented" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="align" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}AlignSimpleType" />
 *       &lt;attribute name="primaryLanguage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LanguageSimpleType" />
 *       &lt;attribute name="secondaryLanguage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LanguageSimpleType" />
 *       &lt;attribute name="primaryScript" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ScriptSimpleType" />
 *       &lt;attribute name="secondaryScript" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ScriptSimpleType" />
 *       &lt;attribute name="production" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ProductionSimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextRegionType", propOrder = {
    "textLine",
    "textEquiv",
    "textStyle"
})
public class TextRegionType
    extends RegionType
{

    @XmlElement(name = "TextLine")
    protected List<TextLineType> textLine;
    @XmlElement(name = "TextEquiv")
    protected List<TextEquivType> textEquiv;
    @XmlElement(name = "TextStyle")
    protected TextStyleType textStyle;
    @XmlAttribute(name = "orientation")
    protected Float orientation;
    @XmlAttribute(name = "type")
    protected TextTypeSimpleType type;
    @XmlAttribute(name = "leading")
    protected Integer leading;
    @XmlAttribute(name = "readingDirection")
    protected ReadingDirectionSimpleType readingDirection;
    @XmlAttribute(name = "textLineOrder")
    protected TextLineOrderSimpleType textLineOrder;
    @XmlAttribute(name = "readingOrientation")
    protected Float readingOrientation;
    @XmlAttribute(name = "indented")
    protected Boolean indented;
    @XmlAttribute(name = "align")
    protected AlignSimpleType align;
    @XmlAttribute(name = "primaryLanguage")
    protected LanguageSimpleType primaryLanguage;
    @XmlAttribute(name = "secondaryLanguage")
    protected LanguageSimpleType secondaryLanguage;
    @XmlAttribute(name = "primaryScript")
    protected ScriptSimpleType primaryScript;
    @XmlAttribute(name = "secondaryScript")
    protected ScriptSimpleType secondaryScript;
    @XmlAttribute(name = "production")
    protected ProductionSimpleType production;

    /**
     * Gets the value of the textLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextLineType }
     * 
     * 
     */
    public List<TextLineType> getTextLine() {
        if (textLine == null) {
            textLine = new ArrayList<TextLineType>();
        }
        return this.textLine;
    }

    /**
     * Gets the value of the textEquiv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textEquiv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextEquiv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextEquivType }
     * 
     * 
     */
    public List<TextEquivType> getTextEquiv() {
        if (textEquiv == null) {
            textEquiv = new ArrayList<TextEquivType>();
        }
        return this.textEquiv;
    }

    /**
     * Obtém o valor da propriedade textStyle.
     * 
     * @return
     *     possible object is
     *     {@link TextStyleType }
     *     
     */
    public TextStyleType getTextStyle() {
        return textStyle;
    }

    /**
     * Define o valor da propriedade textStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link TextStyleType }
     *     
     */
    public void setTextStyle(TextStyleType value) {
        this.textStyle = value;
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
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link TextTypeSimpleType }
     *     
     */
    public TextTypeSimpleType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link TextTypeSimpleType }
     *     
     */
    public void setType(TextTypeSimpleType value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade leading.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeading() {
        return leading;
    }

    /**
     * Define o valor da propriedade leading.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeading(Integer value) {
        this.leading = value;
    }

    /**
     * Obtém o valor da propriedade readingDirection.
     * 
     * @return
     *     possible object is
     *     {@link ReadingDirectionSimpleType }
     *     
     */
    public ReadingDirectionSimpleType getReadingDirection() {
        return readingDirection;
    }

    /**
     * Define o valor da propriedade readingDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingDirectionSimpleType }
     *     
     */
    public void setReadingDirection(ReadingDirectionSimpleType value) {
        this.readingDirection = value;
    }

    /**
     * Obtém o valor da propriedade textLineOrder.
     * 
     * @return
     *     possible object is
     *     {@link TextLineOrderSimpleType }
     *     
     */
    public TextLineOrderSimpleType getTextLineOrder() {
        return textLineOrder;
    }

    /**
     * Define o valor da propriedade textLineOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link TextLineOrderSimpleType }
     *     
     */
    public void setTextLineOrder(TextLineOrderSimpleType value) {
        this.textLineOrder = value;
    }

    /**
     * Obtém o valor da propriedade readingOrientation.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReadingOrientation() {
        return readingOrientation;
    }

    /**
     * Define o valor da propriedade readingOrientation.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReadingOrientation(Float value) {
        this.readingOrientation = value;
    }

    /**
     * Obtém o valor da propriedade indented.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndented() {
        return indented;
    }

    /**
     * Define o valor da propriedade indented.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndented(Boolean value) {
        this.indented = value;
    }

    /**
     * Obtém o valor da propriedade align.
     * 
     * @return
     *     possible object is
     *     {@link AlignSimpleType }
     *     
     */
    public AlignSimpleType getAlign() {
        return align;
    }

    /**
     * Define o valor da propriedade align.
     * 
     * @param value
     *     allowed object is
     *     {@link AlignSimpleType }
     *     
     */
    public void setAlign(AlignSimpleType value) {
        this.align = value;
    }

    /**
     * Obtém o valor da propriedade primaryLanguage.
     * 
     * @return
     *     possible object is
     *     {@link LanguageSimpleType }
     *     
     */
    public LanguageSimpleType getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Define o valor da propriedade primaryLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageSimpleType }
     *     
     */
    public void setPrimaryLanguage(LanguageSimpleType value) {
        this.primaryLanguage = value;
    }

    /**
     * Obtém o valor da propriedade secondaryLanguage.
     * 
     * @return
     *     possible object is
     *     {@link LanguageSimpleType }
     *     
     */
    public LanguageSimpleType getSecondaryLanguage() {
        return secondaryLanguage;
    }

    /**
     * Define o valor da propriedade secondaryLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageSimpleType }
     *     
     */
    public void setSecondaryLanguage(LanguageSimpleType value) {
        this.secondaryLanguage = value;
    }

    /**
     * Obtém o valor da propriedade primaryScript.
     * 
     * @return
     *     possible object is
     *     {@link ScriptSimpleType }
     *     
     */
    public ScriptSimpleType getPrimaryScript() {
        return primaryScript;
    }

    /**
     * Define o valor da propriedade primaryScript.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptSimpleType }
     *     
     */
    public void setPrimaryScript(ScriptSimpleType value) {
        this.primaryScript = value;
    }

    /**
     * Obtém o valor da propriedade secondaryScript.
     * 
     * @return
     *     possible object is
     *     {@link ScriptSimpleType }
     *     
     */
    public ScriptSimpleType getSecondaryScript() {
        return secondaryScript;
    }

    /**
     * Define o valor da propriedade secondaryScript.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptSimpleType }
     *     
     */
    public void setSecondaryScript(ScriptSimpleType value) {
        this.secondaryScript = value;
    }

    /**
     * Obtém o valor da propriedade production.
     * 
     * @return
     *     possible object is
     *     {@link ProductionSimpleType }
     *     
     */
    public ProductionSimpleType getProduction() {
        return production;
    }

    /**
     * Define o valor da propriedade production.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionSimpleType }
     *     
     */
    public void setProduction(ProductionSimpleType value) {
        this.production = value;
    }

}
