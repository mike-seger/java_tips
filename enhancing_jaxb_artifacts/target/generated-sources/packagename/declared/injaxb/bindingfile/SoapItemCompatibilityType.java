
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
 * 				All information corresponding to an individual compatibility by application.
 * 				<br><br>
 * 				Parts Compatibility is supported in limited Parts & Accessories categories, on the eBay Motors (US) site (site ID 100) only. If a 
 * 			
 * 
 * <p>Java class for ItemCompatibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCompatibilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameValueList" type="{urn:ebay:apis:eBLBaseComponents}NameValueListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CompatibilityNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ItemCompatibilityType", propOrder = {
    "nameValueList",
    "compatibilityNotes",
    "any"
})
public class SoapItemCompatibilityType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NameValueList")
    protected List<SoapNameValueListType> nameValueList;
    @XmlElement(name = "CompatibilityNotes")
    protected String compatibilityNotes;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the nameValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapNameValueListType }
     * 
     * 
     */
    public List<SoapNameValueListType> getNameValueList() {
        if (nameValueList == null) {
            nameValueList = new ArrayList<SoapNameValueListType>();
        }
        return this.nameValueList;
    }

    /**
     * Gets the value of the compatibilityNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibilityNotes() {
        return compatibilityNotes;
    }

    /**
     * Sets the value of the compatibilityNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibilityNotes(String value) {
        this.compatibilityNotes = value;
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
