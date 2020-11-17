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
 * <p>Classe Java de RolesType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RolesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TableCellRole" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}TableCellRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolesType", propOrder = {
    "tableCellRole"
})
public class RolesType {

    @XmlElement(name = "TableCellRole")
    protected TableCellRoleType tableCellRole;

    /**
     * Obtém o valor da propriedade tableCellRole.
     * 
     * @return
     *     possible object is
     *     {@link TableCellRoleType }
     *     
     */
    public TableCellRoleType getTableCellRole() {
        return tableCellRole;
    }

    /**
     * Define o valor da propriedade tableCellRole.
     * 
     * @param value
     *     allowed object is
     *     {@link TableCellRoleType }
     *     
     */
    public void setTableCellRole(TableCellRoleType value) {
        this.tableCellRole = value;
    }

}
