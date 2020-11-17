//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Determines the effective area on the paper of a printed page.
 * 			Its size is equal for all pages of a book
 * 			(exceptions: titlepage, multipage pictures).
 * 			It contains all living elements (except marginals)
 * 			like body type, footnotes, headings, running titles.
 * 			It does not contain pagenumber (if not part of running title),
 * 			marginals, signature mark, preview words.
 * 			
 * 
 * <p>Classe Java de PrintSpaceType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PrintSpaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coords" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}CoordsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintSpaceType", propOrder = {
    "coords"
})
public class PrintSpaceType {

    @XmlElement(name = "Coords", required = true)
    protected CoordsType coords;

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

}
