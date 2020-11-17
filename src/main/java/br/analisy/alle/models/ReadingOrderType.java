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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Definition of the reading order within the page.
 * 			To express a reading order between elements
 * 			they have to be included in an OrderedGroup.
 * 			Groups may contain further groups.
 * 			
 * 
 * <p>Classe Java de ReadingOrderType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReadingOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="OrderedGroup" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}OrderedGroupType"/>
 *         &lt;element name="UnorderedGroup" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UnorderedGroupType"/>
 *       &lt;/choice>
 *       &lt;attribute name="conf" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ConfSimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadingOrderType", propOrder = {
    "orderedGroup",
    "unorderedGroup"
})
public class ReadingOrderType {

    @XmlElement(name = "OrderedGroup")
    protected OrderedGroupType orderedGroup;
    @XmlElement(name = "UnorderedGroup")
    protected UnorderedGroupType unorderedGroup;
    @XmlAttribute(name = "conf")
    protected Float conf;

    /**
     * Obtém o valor da propriedade orderedGroup.
     * 
     * @return
     *     possible object is
     *     {@link OrderedGroupType }
     *     
     */
    public OrderedGroupType getOrderedGroup() {
        return orderedGroup;
    }

    /**
     * Define o valor da propriedade orderedGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderedGroupType }
     *     
     */
    public void setOrderedGroup(OrderedGroupType value) {
        this.orderedGroup = value;
    }

    /**
     * Obtém o valor da propriedade unorderedGroup.
     * 
     * @return
     *     possible object is
     *     {@link UnorderedGroupType }
     *     
     */
    public UnorderedGroupType getUnorderedGroup() {
        return unorderedGroup;
    }

    /**
     * Define o valor da propriedade unorderedGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link UnorderedGroupType }
     *     
     */
    public void setUnorderedGroup(UnorderedGroupType value) {
        this.unorderedGroup = value;
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
