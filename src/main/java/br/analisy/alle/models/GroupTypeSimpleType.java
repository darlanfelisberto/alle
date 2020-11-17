//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GroupTypeSimpleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="paragraph"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="list-item"/>
 *     &lt;enumeration value="figure"/>
 *     &lt;enumeration value="article"/>
 *     &lt;enumeration value="div"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupTypeSimpleType")
@XmlEnum
public enum GroupTypeSimpleType {

    @XmlEnumValue("paragraph")
    PARAGRAPH("paragraph"),
    @XmlEnumValue("list")
    LIST("list"),
    @XmlEnumValue("list-item")
    LIST_ITEM("list-item"),
    @XmlEnumValue("figure")
    FIGURE("figure"),
    @XmlEnumValue("article")
    ARTICLE("article"),
    @XmlEnumValue("div")
    DIV("div"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GroupTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupTypeSimpleType fromValue(String v) {
        for (GroupTypeSimpleType c: GroupTypeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
