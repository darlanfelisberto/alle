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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PageType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternativeImage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}AlternativeImageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Border" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}BorderType" minOccurs="0"/>
 *         &lt;element name="PrintSpace" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}PrintSpaceType" minOccurs="0"/>
 *         &lt;element name="ReadingOrder" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ReadingOrderType" minOccurs="0"/>
 *         &lt;element name="Layers" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LayersType" minOccurs="0"/>
 *         &lt;element name="Relations" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RelationsType" minOccurs="0"/>
 *         &lt;element name="TextStyle" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextStyleType" minOccurs="0"/>
 *         &lt;element name="UserDefined" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UserDefinedType" minOccurs="0"/>
 *         &lt;element name="Labels" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LabelsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="TextRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextRegionType"/>
 *           &lt;element name="ImageRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ImageRegionType"/>
 *           &lt;element name="LineDrawingRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LineDrawingRegionType"/>
 *           &lt;element name="GraphicRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}GraphicRegionType"/>
 *           &lt;element name="TableRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TableRegionType"/>
 *           &lt;element name="ChartRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ChartRegionType"/>
 *           &lt;element name="MapRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}MapRegionType"/>
 *           &lt;element name="SeparatorRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}SeparatorRegionType"/>
 *           &lt;element name="MathsRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}MathsRegionType"/>
 *           &lt;element name="ChemRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ChemRegionType"/>
 *           &lt;element name="MusicRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}MusicRegionType"/>
 *           &lt;element name="AdvertRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}AdvertRegionType"/>
 *           &lt;element name="NoiseRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}NoiseRegionType"/>
 *           &lt;element name="UnknownRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UnknownRegionType"/>
 *           &lt;element name="CustomRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}CustomRegionType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="imageFilename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imageWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="imageHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="imageXResolution" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="imageYResolution" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="imageResolutionUnit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="PPI"/>
 *             &lt;enumeration value="PPCM"/>
 *             &lt;enumeration value="other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="custom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="type" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}PageTypeSimpleType" />
 *       &lt;attribute name="primaryLanguage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LanguageSimpleType" />
 *       &lt;attribute name="secondaryLanguage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LanguageSimpleType" />
 *       &lt;attribute name="primaryScript" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ScriptSimpleType" />
 *       &lt;attribute name="secondaryScript" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ScriptSimpleType" />
 *       &lt;attribute name="readingDirection" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ReadingDirectionSimpleType" />
 *       &lt;attribute name="textLineOrder" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextLineOrderSimpleType" />
 *       &lt;attribute name="conf" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ConfSimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageType", propOrder = {
    "alternativeImage",
    "border",
    "printSpace",
    "readingOrder",
    "layers",
    "relations",
    "textStyle",
    "userDefined",
    "labels",
    "textRegionOrImageRegionOrLineDrawingRegion"
})
public class PageType {

    @XmlElement(name = "AlternativeImage")
    protected List<AlternativeImageType> alternativeImage;
    @XmlElement(name = "Border")
    protected BorderType border;
    @XmlElement(name = "PrintSpace")
    protected PrintSpaceType printSpace;
    @XmlElement(name = "ReadingOrder")
    protected ReadingOrderType readingOrder;
    @XmlElement(name = "Layers")
    protected LayersType layers;
    @XmlElement(name = "Relations")
    protected RelationsType relations;
    @XmlElement(name = "TextStyle")
    protected TextStyleType textStyle;
    @XmlElement(name = "UserDefined")
    protected UserDefinedType userDefined;
    @XmlElement(name = "Labels")
    protected List<LabelsType> labels;
    @XmlElements({
        @XmlElement(name = "TextRegion", type = TextRegionType.class),
        @XmlElement(name = "ImageRegion", type = ImageRegionType.class),
        @XmlElement(name = "LineDrawingRegion", type = LineDrawingRegionType.class),
        @XmlElement(name = "GraphicRegion", type = GraphicRegionType.class),
        @XmlElement(name = "TableRegion", type = TableRegionType.class),
        @XmlElement(name = "ChartRegion", type = ChartRegionType.class),
        @XmlElement(name = "MapRegion", type = MapRegionType.class),
        @XmlElement(name = "SeparatorRegion", type = SeparatorRegionType.class),
        @XmlElement(name = "MathsRegion", type = MathsRegionType.class),
        @XmlElement(name = "ChemRegion", type = ChemRegionType.class),
        @XmlElement(name = "MusicRegion", type = MusicRegionType.class),
        @XmlElement(name = "AdvertRegion", type = AdvertRegionType.class),
        @XmlElement(name = "NoiseRegion", type = NoiseRegionType.class),
        @XmlElement(name = "UnknownRegion", type = UnknownRegionType.class),
        @XmlElement(name = "CustomRegion", type = CustomRegionType.class)
    })
    protected List<RegionType> textRegionOrImageRegionOrLineDrawingRegion;
    @XmlAttribute(name = "imageFilename", required = true)
    protected String imageFilename;
    @XmlAttribute(name = "imageWidth", required = true)
    protected int imageWidth;
    @XmlAttribute(name = "imageHeight", required = true)
    protected int imageHeight;
    @XmlAttribute(name = "imageXResolution")
    protected Float imageXResolution;
    @XmlAttribute(name = "imageYResolution")
    protected Float imageYResolution;
    @XmlAttribute(name = "imageResolutionUnit")
    protected String imageResolutionUnit;
    @XmlAttribute(name = "custom")
    protected String custom;
    @XmlAttribute(name = "orientation")
    protected Float orientation;
    @XmlAttribute(name = "type")
    protected PageTypeSimpleType type;
    @XmlAttribute(name = "primaryLanguage")
    protected LanguageSimpleType primaryLanguage;
    @XmlAttribute(name = "secondaryLanguage")
    protected LanguageSimpleType secondaryLanguage;
    @XmlAttribute(name = "primaryScript")
    protected ScriptSimpleType primaryScript;
    @XmlAttribute(name = "secondaryScript")
    protected ScriptSimpleType secondaryScript;
    @XmlAttribute(name = "readingDirection")
    protected ReadingDirectionSimpleType readingDirection;
    @XmlAttribute(name = "textLineOrder")
    protected TextLineOrderSimpleType textLineOrder;
    @XmlAttribute(name = "conf")
    protected Float conf;

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
     * Obtém o valor da propriedade border.
     * 
     * @return
     *     possible object is
     *     {@link BorderType }
     *     
     */
    public BorderType getBorder() {
        return border;
    }

    /**
     * Define o valor da propriedade border.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderType }
     *     
     */
    public void setBorder(BorderType value) {
        this.border = value;
    }

    /**
     * Obtém o valor da propriedade printSpace.
     * 
     * @return
     *     possible object is
     *     {@link PrintSpaceType }
     *     
     */
    public PrintSpaceType getPrintSpace() {
        return printSpace;
    }

    /**
     * Define o valor da propriedade printSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintSpaceType }
     *     
     */
    public void setPrintSpace(PrintSpaceType value) {
        this.printSpace = value;
    }

    /**
     * Obtém o valor da propriedade readingOrder.
     * 
     * @return
     *     possible object is
     *     {@link ReadingOrderType }
     *     
     */
    public ReadingOrderType getReadingOrder() {
        return readingOrder;
    }

    /**
     * Define o valor da propriedade readingOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingOrderType }
     *     
     */
    public void setReadingOrder(ReadingOrderType value) {
        this.readingOrder = value;
    }

    /**
     * Obtém o valor da propriedade layers.
     * 
     * @return
     *     possible object is
     *     {@link LayersType }
     *     
     */
    public LayersType getLayers() {
        return layers;
    }

    /**
     * Define o valor da propriedade layers.
     * 
     * @param value
     *     allowed object is
     *     {@link LayersType }
     *     
     */
    public void setLayers(LayersType value) {
        this.layers = value;
    }

    /**
     * Obtém o valor da propriedade relations.
     * 
     * @return
     *     possible object is
     *     {@link RelationsType }
     *     
     */
    public RelationsType getRelations() {
        return relations;
    }

    /**
     * Define o valor da propriedade relations.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationsType }
     *     
     */
    public void setRelations(RelationsType value) {
        this.relations = value;
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
     * Gets the value of the textRegionOrImageRegionOrLineDrawingRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textRegionOrImageRegionOrLineDrawingRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextRegionOrImageRegionOrLineDrawingRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextRegionType }
     * {@link ImageRegionType }
     * {@link LineDrawingRegionType }
     * {@link GraphicRegionType }
     * {@link TableRegionType }
     * {@link ChartRegionType }
     * {@link MapRegionType }
     * {@link SeparatorRegionType }
     * {@link MathsRegionType }
     * {@link ChemRegionType }
     * {@link MusicRegionType }
     * {@link AdvertRegionType }
     * {@link NoiseRegionType }
     * {@link UnknownRegionType }
     * {@link CustomRegionType }
     * 
     * 
     */
    public List<RegionType> getTextRegionOrImageRegionOrLineDrawingRegion() {
        if (textRegionOrImageRegionOrLineDrawingRegion == null) {
            textRegionOrImageRegionOrLineDrawingRegion = new ArrayList<RegionType>();
        }
        return this.textRegionOrImageRegionOrLineDrawingRegion;
    }

    /**
     * Obtém o valor da propriedade imageFilename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFilename() {
        return imageFilename;
    }

    /**
     * Define o valor da propriedade imageFilename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFilename(String value) {
        this.imageFilename = value;
    }

    /**
     * Obtém o valor da propriedade imageWidth.
     * 
     */
    public int getImageWidth() {
        return imageWidth;
    }

    /**
     * Define o valor da propriedade imageWidth.
     * 
     */
    public void setImageWidth(int value) {
        this.imageWidth = value;
    }

    /**
     * Obtém o valor da propriedade imageHeight.
     * 
     */
    public int getImageHeight() {
        return imageHeight;
    }

    /**
     * Define o valor da propriedade imageHeight.
     * 
     */
    public void setImageHeight(int value) {
        this.imageHeight = value;
    }

    /**
     * Obtém o valor da propriedade imageXResolution.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImageXResolution() {
        return imageXResolution;
    }

    /**
     * Define o valor da propriedade imageXResolution.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImageXResolution(Float value) {
        this.imageXResolution = value;
    }

    /**
     * Obtém o valor da propriedade imageYResolution.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImageYResolution() {
        return imageYResolution;
    }

    /**
     * Define o valor da propriedade imageYResolution.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImageYResolution(Float value) {
        this.imageYResolution = value;
    }

    /**
     * Obtém o valor da propriedade imageResolutionUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageResolutionUnit() {
        return imageResolutionUnit;
    }

    /**
     * Define o valor da propriedade imageResolutionUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageResolutionUnit(String value) {
        this.imageResolutionUnit = value;
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
     *     {@link PageTypeSimpleType }
     *     
     */
    public PageTypeSimpleType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link PageTypeSimpleType }
     *     
     */
    public void setType(PageTypeSimpleType value) {
        this.type = value;
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
     * Obtém o valor da propriedade conf.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConf() {
        return conf;
    }

    /**
     * Define o valor da propriedade conf.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConf(Float value) {
        this.conf = value;
    }

}
