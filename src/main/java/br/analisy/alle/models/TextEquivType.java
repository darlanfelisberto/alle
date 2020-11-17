//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TextEquivType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TextEquivType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unicode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="conf" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ConfSimpleType" />
 *       &lt;attribute name="dataType" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TextDataTypeSimpleType" />
 *       &lt;attribute name="dataTypeDetails" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextEquivType", propOrder = {
    "plainText",
    "unicode"
})
public class TextEquivType {

    @XmlElement(name = "PlainText")
    protected String plainText;
    @XmlElement(name = "Unicode", required = true)
    protected String unicode;
    @XmlAttribute(name = "index")
    protected BigInteger index;
    @XmlAttribute(name = "conf")
    protected Float conf;
    @XmlAttribute(name = "dataType")
    protected TextDataTypeSimpleType dataType;
    @XmlAttribute(name = "dataTypeDetails")
    protected String dataTypeDetails;
    @XmlAttribute(name = "comments")
    protected String comments;

    /**
     * Obtém o valor da propriedade plainText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * Define o valor da propriedade plainText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainText(String value) {
        this.plainText = value;
    }

    /**
     * Obtém o valor da propriedade unicode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnicode() {
        return unicode;
    }

    /**
     * Define o valor da propriedade unicode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnicode(String value) {
        this.unicode = value;
    }

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
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

    /**
     * Obtém o valor da propriedade dataType.
     * 
     * @return
     *     possible object is
     *     {@link TextDataTypeSimpleType }
     *     
     */
    public TextDataTypeSimpleType getDataType() {
        return dataType;
    }

    /**
     * Define o valor da propriedade dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDataTypeSimpleType }
     *     
     */
    public void setDataType(TextDataTypeSimpleType value) {
        this.dataType = value;
    }

    /**
     * Obtém o valor da propriedade dataTypeDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTypeDetails() {
        return dataTypeDetails;
    }

    /**
     * Define o valor da propriedade dataTypeDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTypeDetails(String value) {
        this.dataTypeDetails = value;
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
