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
 * <p>Classe Java de ProductionSimpleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductionSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="printed"/>
 *     &lt;enumeration value="typewritten"/>
 *     &lt;enumeration value="handwritten-cursive"/>
 *     &lt;enumeration value="handwritten-printscript"/>
 *     &lt;enumeration value="medieval-manuscript"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductionSimpleType")
@XmlEnum
public enum ProductionSimpleType {

    @XmlEnumValue("printed")
    PRINTED("printed"),
    @XmlEnumValue("typewritten")
    TYPEWRITTEN("typewritten"),
    @XmlEnumValue("handwritten-cursive")
    HANDWRITTEN_CURSIVE("handwritten-cursive"),
    @XmlEnumValue("handwritten-printscript")
    HANDWRITTEN_PRINTSCRIPT("handwritten-printscript"),
    @XmlEnumValue("medieval-manuscript")
    MEDIEVAL_MANUSCRIPT("medieval-manuscript"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ProductionSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductionSimpleType fromValue(String v) {
        for (ProductionSimpleType c: ProductionSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
