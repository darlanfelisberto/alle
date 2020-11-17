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
 * <p>Classe Java de TextLineType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TextLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternativeImage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}AlternativeImageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Coords" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}CoordsType"/>
 *         &lt;element name="Baseline" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}BaselineType" minOccurs="0"/>
 *         &lt;element name="Word" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}WordType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextEquiv" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextEquivType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextStyle" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextStyleType" minOccurs="0"/>
 *         &lt;element name="UserDefined" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UserDefinedType" minOccurs="0"/>
 *         &lt;element name="Labels" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LabelsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="primaryLanguage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LanguageSimpleType" />
 *       &lt;attribute name="primaryScript" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ScriptSimpleType" />
 *       &lt;attribute name="secondaryScript" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ScriptSimpleType" />
 *       &lt;attribute name="readingDirection" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ReadingDirectionSimpleType" />
 *       &lt;attribute name="production" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ProductionSimpleType" />
 *       &lt;attribute name="custom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextLineType", propOrder = {
    "alternativeImage",
    "coords",
    "baseline",
    "word",
    "textEquiv",
    "textStyle",
    "userDefined",
    "labels"
})
public class TextLineType {

    @XmlElement(name = "AlternativeImage")
    protected List<AlternativeImageType> alternativeImage;
    @XmlElement(name = "Coords", required = true)
    protected CoordsType coords;
    @XmlElement(name = "Baseline")
    protected BaselineType baseline;
    @XmlElement(name = "Word")
    protected List<WordType> word;
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
    @XmlAttribute(name = "primaryLanguage")
    protected LanguageSimpleType primaryLanguage;
    @XmlAttribute(name = "primaryScript")
    protected ScriptSimpleType primaryScript;
    @XmlAttribute(name = "secondaryScript")
    protected ScriptSimpleType secondaryScript;
    @XmlAttribute(name = "readingDirection")
    protected ReadingDirectionSimpleType readingDirection;
    @XmlAttribute(name = "production")
    protected ProductionSimpleType production;
    @XmlAttribute(name = "custom")
    protected String custom;
    @XmlAttribute(name = "comments")
    protected String comments;
    @XmlAttribute(name = "index")
    protected Integer index;

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
     * Obtém o valor da propriedade baseline.
     * 
     * @return
     *     possible object is
     *     {@link BaselineType }
     *     
     */
    public BaselineType getBaseline() {
        return baseline;
    }

    /**
     * Define o valor da propriedade baseline.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineType }
     *     
     */
    public void setBaseline(BaselineType value) {
        this.baseline = value;
    }

    /**
     * Gets the value of the word property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the word property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WordType }
     * 
     * 
     */
    public List<WordType> getWord() {
        if (word == null) {
            word = new ArrayList<WordType>();
        }
        return this.word;
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

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

}
