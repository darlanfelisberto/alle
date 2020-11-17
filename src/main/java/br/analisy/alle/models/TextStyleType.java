//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Monospace (fixed-pitch, non-proportional) or
 * 			proportional font.
 * 			
 * 
 * <p>Classe Java de TextStyleType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TextStyleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fontFamily" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serif" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="monospace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="xHeight" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="kerning" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="textColour" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ColourSimpleType" />
 *       &lt;attribute name="textColourRgb" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="bgColour" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}ColourSimpleType" />
 *       &lt;attribute name="bgColourRgb" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="reverseVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="bold" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="italic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="underlined" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="underlineStyle" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UnderlineStyleSimpleType" />
 *       &lt;attribute name="subscript" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="superscript" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="strikethrough" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="smallCaps" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="letterSpaced" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextStyleType")
public class TextStyleType {

    @XmlAttribute(name = "fontFamily")
    protected String fontFamily;
    @XmlAttribute(name = "serif")
    protected Boolean serif;
    @XmlAttribute(name = "monospace")
    protected Boolean monospace;
    @XmlAttribute(name = "fontSize")
    protected Float fontSize;
    @XmlAttribute(name = "xHeight")
    protected BigInteger xHeight;
    @XmlAttribute(name = "kerning")
    protected Integer kerning;
    @XmlAttribute(name = "textColour")
    protected ColourSimpleType textColour;
    @XmlAttribute(name = "textColourRgb")
    protected BigInteger textColourRgb;
    @XmlAttribute(name = "bgColour")
    protected ColourSimpleType bgColour;
    @XmlAttribute(name = "bgColourRgb")
    protected BigInteger bgColourRgb;
    @XmlAttribute(name = "reverseVideo")
    protected Boolean reverseVideo;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "italic")
    protected Boolean italic;
    @XmlAttribute(name = "underlined")
    protected Boolean underlined;
    @XmlAttribute(name = "underlineStyle")
    protected UnderlineStyleSimpleType underlineStyle;
    @XmlAttribute(name = "subscript")
    protected Boolean subscript;
    @XmlAttribute(name = "superscript")
    protected Boolean superscript;
    @XmlAttribute(name = "strikethrough")
    protected Boolean strikethrough;
    @XmlAttribute(name = "smallCaps")
    protected Boolean smallCaps;
    @XmlAttribute(name = "letterSpaced")
    protected Boolean letterSpaced;

    /**
     * Obtém o valor da propriedade fontFamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Define o valor da propriedade fontFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Obtém o valor da propriedade serif.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSerif() {
        return serif;
    }

    /**
     * Define o valor da propriedade serif.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSerif(Boolean value) {
        this.serif = value;
    }

    /**
     * Obtém o valor da propriedade monospace.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonospace() {
        return monospace;
    }

    /**
     * Define o valor da propriedade monospace.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonospace(Boolean value) {
        this.monospace = value;
    }

    /**
     * Obtém o valor da propriedade fontSize.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFontSize() {
        return fontSize;
    }

    /**
     * Define o valor da propriedade fontSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFontSize(Float value) {
        this.fontSize = value;
    }

    /**
     * Obtém o valor da propriedade xHeight.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXHeight() {
        return xHeight;
    }

    /**
     * Define o valor da propriedade xHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXHeight(BigInteger value) {
        this.xHeight = value;
    }

    /**
     * Obtém o valor da propriedade kerning.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKerning() {
        return kerning;
    }

    /**
     * Define o valor da propriedade kerning.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKerning(Integer value) {
        this.kerning = value;
    }

    /**
     * Obtém o valor da propriedade textColour.
     * 
     * @return
     *     possible object is
     *     {@link ColourSimpleType }
     *     
     */
    public ColourSimpleType getTextColour() {
        return textColour;
    }

    /**
     * Define o valor da propriedade textColour.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourSimpleType }
     *     
     */
    public void setTextColour(ColourSimpleType value) {
        this.textColour = value;
    }

    /**
     * Obtém o valor da propriedade textColourRgb.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextColourRgb() {
        return textColourRgb;
    }

    /**
     * Define o valor da propriedade textColourRgb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextColourRgb(BigInteger value) {
        this.textColourRgb = value;
    }

    /**
     * Obtém o valor da propriedade bgColour.
     * 
     * @return
     *     possible object is
     *     {@link ColourSimpleType }
     *     
     */
    public ColourSimpleType getBgColour() {
        return bgColour;
    }

    /**
     * Define o valor da propriedade bgColour.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourSimpleType }
     *     
     */
    public void setBgColour(ColourSimpleType value) {
        this.bgColour = value;
    }

    /**
     * Obtém o valor da propriedade bgColourRgb.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBgColourRgb() {
        return bgColourRgb;
    }

    /**
     * Define o valor da propriedade bgColourRgb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBgColourRgb(BigInteger value) {
        this.bgColourRgb = value;
    }

    /**
     * Obtém o valor da propriedade reverseVideo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseVideo() {
        return reverseVideo;
    }

    /**
     * Define o valor da propriedade reverseVideo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseVideo(Boolean value) {
        this.reverseVideo = value;
    }

    /**
     * Obtém o valor da propriedade bold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBold() {
        return bold;
    }

    /**
     * Define o valor da propriedade bold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * Obtém o valor da propriedade italic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItalic() {
        return italic;
    }

    /**
     * Define o valor da propriedade italic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**
     * Obtém o valor da propriedade underlined.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderlined() {
        return underlined;
    }

    /**
     * Define o valor da propriedade underlined.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderlined(Boolean value) {
        this.underlined = value;
    }

    /**
     * Obtém o valor da propriedade underlineStyle.
     * 
     * @return
     *     possible object is
     *     {@link UnderlineStyleSimpleType }
     *     
     */
    public UnderlineStyleSimpleType getUnderlineStyle() {
        return underlineStyle;
    }

    /**
     * Define o valor da propriedade underlineStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlineStyleSimpleType }
     *     
     */
    public void setUnderlineStyle(UnderlineStyleSimpleType value) {
        this.underlineStyle = value;
    }

    /**
     * Obtém o valor da propriedade subscript.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscript() {
        return subscript;
    }

    /**
     * Define o valor da propriedade subscript.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscript(Boolean value) {
        this.subscript = value;
    }

    /**
     * Obtém o valor da propriedade superscript.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuperscript() {
        return superscript;
    }

    /**
     * Define o valor da propriedade superscript.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuperscript(Boolean value) {
        this.superscript = value;
    }

    /**
     * Obtém o valor da propriedade strikethrough.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrikethrough() {
        return strikethrough;
    }

    /**
     * Define o valor da propriedade strikethrough.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrikethrough(Boolean value) {
        this.strikethrough = value;
    }

    /**
     * Obtém o valor da propriedade smallCaps.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmallCaps() {
        return smallCaps;
    }

    /**
     * Define o valor da propriedade smallCaps.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallCaps(Boolean value) {
        this.smallCaps = value;
    }

    /**
     * Obtém o valor da propriedade letterSpaced.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetterSpaced() {
        return letterSpaced;
    }

    /**
     * Define o valor da propriedade letterSpaced.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterSpaced(Boolean value) {
        this.letterSpaced = value;
    }

}
