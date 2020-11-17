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
 * <p>Classe Java de ReadingDirectionSimpleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReadingDirectionSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="left-to-right"/>
 *     &lt;enumeration value="right-to-left"/>
 *     &lt;enumeration value="top-to-bottom"/>
 *     &lt;enumeration value="bottom-to-top"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReadingDirectionSimpleType")
@XmlEnum
public enum ReadingDirectionSimpleType {

    @XmlEnumValue("left-to-right")
    LEFT_TO_RIGHT("left-to-right"),
    @XmlEnumValue("right-to-left")
    RIGHT_TO_LEFT("right-to-left"),
    @XmlEnumValue("top-to-bottom")
    TOP_TO_BOTTOM("top-to-bottom"),
    @XmlEnumValue("bottom-to-top")
    BOTTOM_TO_TOP("bottom-to-top");
    private final String value;

    ReadingDirectionSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadingDirectionSimpleType fromValue(String v) {
        for (ReadingDirectionSimpleType c: ReadingDirectionSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
