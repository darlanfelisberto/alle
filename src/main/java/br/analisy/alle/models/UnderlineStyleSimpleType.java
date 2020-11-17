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
 * <p>Classe Java de UnderlineStyleSimpleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlineStyleSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="singleLine"/>
 *     &lt;enumeration value="doubleLine"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlineStyleSimpleType")
@XmlEnum
public enum UnderlineStyleSimpleType {

    @XmlEnumValue("singleLine")
    SINGLE_LINE("singleLine"),
    @XmlEnumValue("doubleLine")
    DOUBLE_LINE("doubleLine"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UnderlineStyleSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnderlineStyleSimpleType fromValue(String v) {
        for (UnderlineStyleSimpleType c: UnderlineStyleSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
