
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Gets the official eBay system time in GMT.
 * 			
 * 
 * <p>Java class for GeteBayTimeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeteBayTimeRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeteBayTimeRequestType")
public class SoapGeteBayTimeRequestType
    extends SoapAbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
