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
 * 
 * 			One-to-one relation between to layout object. Use 'link'
 * 			for loose relations and 'join' for strong relations
 * 			(where something is fragmented for instance).
 * 			
 * 			Examples for 'link': caption - image floating -
 * 			paragraph paragraph - paragraph (when a paragraph is
 * 			split across columns and the last word of the first
 * 			paragraph DOES NOT continue in the second paragraph)
 * 			drop-cap - paragraph (when the drop-cap is a whole word)
 * 			
 * 			Examples for 'join': word - word (separated word at the
 * 			end of a line) drop-cap - paragraph (when the drop-cap
 * 			is not a whole word) paragraph - paragraph (when a
 * 			pragraph is split across columns and the last word of
 * 			the first paragraph DOES continue in the second
 * 			paragraph)
 * 			
 * 
 * <p>Classe Java de RelationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RelationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Labels" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LabelsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SourceRegionRef" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RegionRefType"/>
 *         &lt;element name="TargetRegionRef" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RegionRefType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="link"/>
 *             &lt;enumeration value="join"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlType(name = "RelationType", propOrder = {
    "labels",
    "sourceRegionRef",
    "targetRegionRef"
})
public class RelationType {

    @XmlElement(name = "Labels")
    protected List<LabelsType> labels;
    @XmlElement(name = "SourceRegionRef", required = true)
    protected RegionRefType sourceRegionRef;
    @XmlElement(name = "TargetRegionRef", required = true)
    protected RegionRefType targetRegionRef;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "custom")
    protected String custom;
    @XmlAttribute(name = "comments")
    protected String comments;

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
     * Obtém o valor da propriedade sourceRegionRef.
     * 
     * @return
     *     possible object is
     *     {@link RegionRefType }
     *     
     */
    public RegionRefType getSourceRegionRef() {
        return sourceRegionRef;
    }

    /**
     * Define o valor da propriedade sourceRegionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionRefType }
     *     
     */
    public void setSourceRegionRef(RegionRefType value) {
        this.sourceRegionRef = value;
    }

    /**
     * Obtém o valor da propriedade targetRegionRef.
     * 
     * @return
     *     possible object is
     *     {@link RegionRefType }
     *     
     */
    public RegionRefType getTargetRegionRef() {
        return targetRegionRef;
    }

    /**
     * Define o valor da propriedade targetRegionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionRefType }
     *     
     */
    public void setTargetRegionRef(RegionRefType value) {
        this.targetRegionRef = value;
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
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
