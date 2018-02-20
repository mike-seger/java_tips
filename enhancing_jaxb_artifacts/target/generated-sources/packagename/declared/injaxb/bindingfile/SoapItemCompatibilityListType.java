
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				A list of compatible applications specified as name and value pairs. Describes assemblies with which a part is compatible (i.e., compatibility by application). For example, to specify a part's compatibility with a vehicle, the name would map to standard vehicle characteristics (e.g., Year, Make, Model, Trim, and Engine). The values describe the specific vehicle, such as a 2006 Honda Accord.
 * 				<br><br>
 * 				Parts Compatibility is supported in limited Parts & Accessories categories, on the eBay Motors (US) site (site ID 100) only.
 * 			
 * 
 * <p>Java class for ItemCompatibilityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCompatibilityListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Compatibility" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCompatibilityListType", propOrder = {
    "compatibility",
    "any"
})
public class SoapItemCompatibilityListType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Compatibility")
    protected List<SoapItemCompatibilityType> compatibility;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the compatibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapItemCompatibilityType }
     * 
     * 
     */
    public List<SoapItemCompatibilityType> getCompatibility() {
        if (compatibility == null) {
            compatibility = new ArrayList<SoapItemCompatibilityType>();
        }
        return this.compatibility;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
