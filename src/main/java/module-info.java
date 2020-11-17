/**
 * 
 */
/**
 * @author darlan
 *
 */
module aleteia {
	

	requires java.desktop;
	requires java.logging;
	requires java.xml;
	requires java.xml.bind;
	
	opens br.analisy.alle.models to java.xml.bind; 
}