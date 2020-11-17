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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de GlyphType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GlyphType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternativeImage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}AlternativeImageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Coords" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}CoordsType"/>
 *         &lt;element name="Graphemes" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}GraphemesType" minOccurs="0"/>
 *         &lt;element name="TextEquiv" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextEquivType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextStyle" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextStyleType" minOccurs="0"/>
 *         &lt;element name="UserDefined" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UserDefinedType" minOccurs="0"/>
 *         &lt;element name="Labels" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LabelsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ligature" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="symbol" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="script" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ScriptSimpleType" />
 *       &lt;attribute name="production" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ProductionSimpleType" />
 *       &lt;attribute name="custom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlyphType", propOrder = {
    "alternativeImage",
    "coords",
    "graphemes",
    "textEquiv",
    "textStyle",
    "userDefined",
    "labels"
})
public class GlyphType {

    @XmlElement(name = "AlternativeImage")
    protected List<AlternativeImageType> alternativeImage;
    @XmlElement(name = "Coords", required = true)
    protected CoordsType coords;
    @XmlElement(name = "Graphemes")
    protected GraphemesType graphemes;
    @XmlElement(name = "TextEquiv")
    protected List<TextEquivType> textEquiv;
    @XmlElement(name = "TextStyle")
    protected TextStyleType textStyle;
    @XmlElement(name = "UserDefined")
    protected UserDefinedType userDefined;
    @XmlElement(name = "Labels")
    protected List<LabelsType> labels;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ligature")
    protected Boolean ligature;
    @XmlAttribute(name = "symbol")
    protected Boolean symbol;
    @XmlAttribute(name = "script")
    protected ScriptSimpleType script;
    @XmlAttribute(name = "production")
    protected ProductionSimpleType production;
    @XmlAttribute(name = "custom")
    protected String custom;
    @XmlAttribute(name = "comments")
    protected String comments;

    /**
     * Gets the value of the alternativeImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeImageType }
     * 
     * 
     */
    public List<AlternativeImageType> getAlternativeImage() {
        if (alternativeImage == null) {
            alternativeImage = new ArrayList<AlternativeImageType>();
        }
        return this.alternativeImage;
    }

    /**
     * Obtém o valor da propriedade coords.
     * 
     * @return
     *     possible object is
     *     {@link CoordsType }
     *     
     */
    public CoordsType getCoords() {
        return coords;
    }

    /**
     * Define o valor da propriedade coords.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordsType }
     *     
     */
    public void setCoords(CoordsType value) {
        this.coords = value;
    }

    /**
     * Obtém o valor da propriedade graphemes.
     * 
     * @return
     *     possible object is
     *     {@link GraphemesType }
     *     
     */
    public GraphemesType getGraphemes() {
        return graphemes;
    }

    /**
     * Define o valor da propriedade graphemes.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphemesType }
     *     
     */
    public void setGraphemes(GraphemesType value) {
        this.graphemes = value;
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
     * Obtém o valor da propriedade userDefined.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedType }
     *     
     */
    public UserDefinedType getUserDefined() {
        return userDefined;
    }

    /**
     * Define o valor da propriedade userDefined.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedType }
     *     
     */
    public void setUserDefined(UserDefinedType value) {
        this.userDefined = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelsType }
     * 
     * 
     */
    public List<LabelsType> getLabels() {
        if (labels == null) {
            labels = new ArrayList<LabelsType>();
        }
        return this.labels;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade ligature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLigature() {
        return ligature;
    }

    /**
     * Define o valor da propriedade ligature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLigature(Boolean value) {
        this.ligature = value;
    }

    /**
     * Obtém o valor da propriedade symbol.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSymbol() {
        return symbol;
    }

    /**
     * Define o valor da propriedade symbol.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSymbol(Boolean value) {
        this.symbol = value;
    }

    /**
     * Obtém o valor da propriedade script.
     * 
     * @return
     *     possible object is
     *     {@link ScriptSimpleType }
     *     
     */
    public ScriptSimpleType getScript() {
        return script;
    }

    /**
     * Define o valor da propriedade script.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptSimpleType }
     *     
     */
    public void setScript(ScriptSimpleType value) {
        this.script = value;
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

    /**
     * Obtém o valor da propriedade custom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom() {
        return custom;
    }

    /**
     * Define o valor da propriedade custom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom(String value) {
        this.custom = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
