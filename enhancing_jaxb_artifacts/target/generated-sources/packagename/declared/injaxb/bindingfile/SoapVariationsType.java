
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
 * 					Variations are multiple similar (but not identical) items in a 
 * 					single fixed-price listing. 
 * 					For example, a single listing could contain multiple items of the 
 * 					same brand and model that vary by color and size (like "Blue, Large" and "Black, Medium"). Each variation can have its own quantity and 
 * 					price. For example, a listing could include 10 "Blue, Large" 
 * 					variations and 20 "Black, Medium" variations. 
 * 			
 * 
 * <p>Java class for VariationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Variation" type="{urn:ebay:apis:eBLBaseComponents}VariationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Pictures" type="{urn:ebay:apis:eBLBaseComponents}PicturesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VariationSpecificsSet" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/&gt;
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
@XmlType(name = "VariationsType", propOrder = {
    "variation",
    "pictures",
    "variationSpecificsSet",
    "any"
})
public class SoapVariationsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Variation")
    protected List<SoapVariationType> variation;
    @XmlElement(name = "Pictures")
    protected List<SoapPicturesType> pictures;
    @XmlElement(name = "VariationSpecificsSet")
    protected SoapNameValueListArrayType variationSpecificsSet;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the variation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapVariationType }
     * 
     * 
     */
    public List<SoapVariationType> getVariation() {
        if (variation == null) {
            variation = new ArrayList<SoapVariationType>();
        }
        return this.variation;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapPicturesType }
     * 
     * 
     */
    public List<SoapPicturesType> getPictures() {
        if (pictures == null) {
            pictures = new ArrayList<SoapPicturesType>();
        }
        return this.pictures;
    }

    /**
     * Gets the value of the variationSpecificsSet property.
     * 
     * @return
     *     possible object is
     *     {@link SoapNameValueListArrayType }
     *     
     */
    public SoapNameValueListArrayType getVariationSpecificsSet() {
        return variationSpecificsSet;
    }

    /**
     * Sets the value of the variationSpecificsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapNameValueListArrayType }
     *     
     */
    public void setVariationSpecificsSet(SoapNameValueListArrayType value) {
        this.variationSpecificsSet = value;
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
