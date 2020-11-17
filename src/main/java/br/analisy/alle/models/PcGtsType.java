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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de PcGtsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PcGtsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Metadata" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}MetadataType"/>
 *         &lt;element name="Page" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}PageType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pcGtsId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="PcGts")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PcGtsType", propOrder = {
    "metadata",
    "page"
})
public class PcGtsType {

    @XmlElement(name = "Metadata", required = true)
    protected MetadataType metadata;
    @XmlElement(name = "Page", required = true)
    protected PageType page;
    @XmlAttribute(name = "pcGtsId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String pcGtsId;

    /**
     * Obtém o valor da propriedade metadata.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Define o valor da propriedade metadata.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Obtém o valor da propriedade page.
     * 
     * @return
     *     possible object is
     *     {@link PageType }
     *     
     */
    public PageType getPage() {
        return page;
    }

    /**
     * Define o valor da propriedade page.
     * 
     * @param value
     *     allowed object is
     *     {@link PageType }
     *     
     */
    public void setPage(PageType value) {
        this.page = value;
    }

    /**
     * Obtém o valor da propriedade pcGtsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcGtsId() {
        return pcGtsId;
    }

    /**
     * Define o valor da propriedade pcGtsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcGtsId(String value) {
        this.pcGtsId = value;
    }

}
