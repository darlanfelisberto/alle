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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de RegionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RegionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternativeImage" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}AlternativeImageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Coords" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}CoordsType"/>
 *         &lt;element name="UserDefined" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UserDefinedType" minOccurs="0"/>
 *         &lt;element name="Labels" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LabelsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Roles" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RolesType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="TextRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextRegionType"/>
 *           &lt;element name="ImageRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ImageRegionType"/>
 *           &lt;element name="LineDrawingRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LineDrawingRegionType"/>
 *           &lt;element name="GraphicRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}GraphicRegionType"/>
 *           &lt;element name="TableRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TableRegionType"/>
 *           &lt;element name="ChartRegion" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ChartRegionType"/>
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
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="custom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="continuation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionType", propOrder = {
    "alternativeImage",
    "coords",
    "userDefined",
    "labels",
    "roles",
    "textRegionOrImageRegionOrLineDrawingRegion"
})
@XmlSeeAlso({
    MusicRegionType.class,
    MathsRegionType.class,
    TableRegionType.class,
    NoiseRegionType.class,
    CustomRegionType.class,
    ChartRegionType.class,
    GraphicRegionType.class,
    MapRegionType.class,
    ImageRegionType.class,
    TextRegionType.class,
    ChemRegionType.class,
    UnknownRegionType.class,
    AdvertRegionType.class,
    SeparatorRegionType.class,
    LineDrawingRegionType.class
})
public abstract class RegionType {

    @XmlElement(name = "AlternativeImage")
    protected List<AlternativeImageType> alternativeImage;
    @XmlElement(name = "Coords", required = true)
    protected CoordsType coords;
    @XmlElement(name = "UserDefined")
    protected UserDefinedType userDefined;
    @XmlElement(name = "Labels")
    protected List<LabelsType> labels;
    @XmlElement(name = "Roles")
    protected RolesType roles;
    @XmlElements({
        @XmlElement(name = "TextRegion", type = TextRegionType.class),
        @XmlElement(name = "ImageRegion", type = ImageRegionType.class),
        @XmlElement(name = "LineDrawingRegion", type = LineDrawingRegionType.class),
        @XmlElement(name = "GraphicRegion", type = GraphicRegionType.class),
        @XmlElement(name = "TableRegion", type = TableRegionType.class),
        @XmlElement(name = "ChartRegion", type = ChartRegionType.class),
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
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "custom")
    protected String custom;
    @XmlAttribute(name = "comments")
    protected String comments;
    @XmlAttribute(name = "continuation")
    protected Boolean continuation;

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
    	coords.initPoints();
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
     * Obtém o valor da propriedade roles.
     * 
     * @return
     *     possible object is
     *     {@link RolesType }
     *     
     */
    public RolesType getRoles() {
        return roles;
    }

    /**
     * Define o valor da propriedade roles.
     * 
     * @param value
     *     allowed object is
     *     {@link RolesType }
     *     
     */
    public void setRoles(RolesType value) {
        this.roles = value;
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
     * Obtém o valor da propriedade continuation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuation() {
        return continuation;
    }

    /**
     * Define o valor da propriedade continuation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuation(Boolean value) {
        this.continuation = value;
    }

}
