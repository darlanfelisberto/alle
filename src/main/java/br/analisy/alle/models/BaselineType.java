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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BaselineType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BaselineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="points" use="required" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}PointsType" />
 *       &lt;attribute name="conf" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ConfSimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaselineType")
public class BaselineType {

    @XmlAttribute(name = "points", required = true)
    protected String points;
    @XmlAttribute(name = "conf")
    protected Float conf;

    /**
     * Obtém o valor da propriedade points.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoints() {
        return points;
    }

    /**
     * Define o valor da propriedade points.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoints(String value) {
        this.points = value;
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
