
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
 * 			Defines variation-specific pictures associated with one 
 * 			VariationSpecificName (e.g., Color) whose values differ across variations.
 * 			
 * 
 * <p>Java class for PicturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PicturesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VariationSpecificName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VariationSpecificPictureSet" type="{urn:ebay:apis:eBLBaseComponents}VariationSpecificPictureSetType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PicturesType", propOrder = {
    "variationSpecificName",
    "variationSpecificPictureSet",
    "any"
})
public class SoapPicturesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VariationSpecificName")
    protected String variationSpecificName;
    @XmlElement(name = "VariationSpecificPictureSet")
    protected List<SoapVariationSpecificPictureSetType> variationSpecificPictureSet;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the variationSpecificName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationSpecificName() {
        return variationSpecificName;
    }

    /**
     * Sets the value of the variationSpecificName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationSpecificName(String value) {
        this.variationSpecificName = value;
    }

    /**
     * Gets the value of the variationSpecificPictureSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variationSpecificPictureSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariationSpecificPictureSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapVariationSpecificPictureSetType }
     * 
     * 
     */
    public List<SoapVariationSpecificPictureSetType> getVariationSpecificPictureSet() {
        if (variationSpecificPictureSet == null) {
            variationSpecificPictureSet = new ArrayList<SoapVariationSpecificPictureSetType>();
        }
        return this.variationSpecificPictureSet;
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
