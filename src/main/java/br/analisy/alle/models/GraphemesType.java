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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Container for graphemes, grapheme groups and
 * 			non-printing characters.
 * 			
 * 
 * <p>Classe Java de GraphemesType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GraphemesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Grapheme" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}GraphemeType"/>
 *         &lt;element name="NonPrintingChar" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}NonPrintingCharType"/>
 *         &lt;element name="GraphemeGroup" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}GraphemeGroupType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphemesType", propOrder = {
    "graphemeOrNonPrintingCharOrGraphemeGroup"
})
public class GraphemesType {

    @XmlElements({
        @XmlElement(name = "Grapheme", type = GraphemeType.class),
        @XmlElement(name = "NonPrintingChar", type = NonPrintingCharType.class),
        @XmlElement(name = "GraphemeGroup", type = GraphemeGroupType.class)
    })
    protected List<GraphemeBaseType> graphemeOrNonPrintingCharOrGraphemeGroup;

    /**
     * Gets the value of the graphemeOrNonPrintingCharOrGraphemeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphemeOrNonPrintingCharOrGraphemeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphemeOrNonPrintingCharOrGraphemeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphemeType }
     * {@link NonPrintingCharType }
     * {@link GraphemeGroupType }
     * 
     * 
     */
    public List<GraphemeBaseType> getGraphemeOrNonPrintingCharOrGraphemeGroup() {
        if (graphemeOrNonPrintingCharOrGraphemeGroup == null) {
            graphemeOrNonPrintingCharOrGraphemeGroup = new ArrayList<GraphemeBaseType>();
        }
        return this.graphemeOrNonPrintingCharOrGraphemeGroup;
    }

}
