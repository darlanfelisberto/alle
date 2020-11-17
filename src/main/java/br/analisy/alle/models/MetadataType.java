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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de MetadataType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UserDefinedType" minOccurs="0"/>
 *         &lt;element name="MetadataItem" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}MetadataItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="externalRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataType", propOrder = {
    "creator",
    "created",
    "lastChange",
    "comments",
    "userDefined",
    "metadataItem"
})
public class MetadataType {

    @XmlElement(name = "Creator", required = true)
    protected String creator;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "LastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChange;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "UserDefined")
    protected UserDefinedType userDefined;
    @XmlElement(name = "MetadataItem")
    protected List<MetadataItemType> metadataItem;
    @XmlAttribute(name = "externalRef")
    protected String externalRef;

    /**
     * Obtém o valor da propriedade creator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Define o valor da propriedade creator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Obtém o valor da propriedade created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Define o valor da propriedade created.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Obtém o valor da propriedade lastChange.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChange() {
        return lastChange;
    }

    /**
     * Define o valor da propriedade lastChange.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChange(XMLGregorianCalendar value) {
        this.lastChange = value;
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
     * Gets the value of the metadataItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataItemType }
     * 
     * 
     */
    public List<MetadataItemType> getMetadataItem() {
        if (metadataItem == null) {
            metadataItem = new ArrayList<MetadataItemType>();
        }
        return this.metadataItem;
    }

    /**
     * Obtém o valor da propriedade externalRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRef() {
        return externalRef;
    }

    /**
     * Define o valor da propriedade externalRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRef(String value) {
        this.externalRef = value;
    }

}
