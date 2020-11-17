//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import br.analisy.alle.Point;


/**
 * <p>Classe Java de CoordsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CoordsType">
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
@XmlType(name = "CoordsType")
public class CoordsType {

    @XmlAttribute(name = "points", required = true)
    protected String points;
    @XmlAttribute(name = "conf")
    protected Float conf;
    @XmlTransient
    protected List<Point> listPoint;
    
    protected Point p1 = new Point(0,0);
    protected Point p2 = new Point(0,0);
//    private Point p3 = new Point(0,0);
//    private Point p4 = new Point(0,0);

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
    
    public boolean is2Col(int middle) {
//    	System.out.println((this.p1.getX() > middle || this.p2.getX() < middle));
    	return (this.p1.getX() > middle || this.p2.getX() < middle);
    }
    

    
//    @SuppressWarnings("unchecked")
	public void initPoints() {
//    	Integer.
    	//if(this.listPoint == null) {
    	List<Integer[]> l = Stream.of(this.points.split(" ")).parallel()
    			.map(s -> { 
    				String []m = s.split(",");
    				Integer []i = new Integer[2];
    				i[0] = Integer.parseInt(m[0]);
    				i[1] = Integer.parseInt(m[1]);
    				return i;
    			})
    			.collect(Collectors.toList());
    	this.p1.setX(l.parallelStream().map(p -> p[0]).min(Integer::compare).get());
    	this.p1.setY(l.parallelStream().map(p -> p[1]).min(Integer::compare).get());
    	
    	this.p2.setX(l.parallelStream().map(p -> p[0]).max(Integer::compare).get());
    	this.p2.setY(l.parallelStream().map(p -> p[1]).max(Integer::compare).get());
    }
	
	public int getMiddle() {
		return (this.p1.getX() + this.p2.getX())/2;
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
