
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Information about zero or more buying guides and the site's buying guide hub.
 * 				Buying guides contain content about particular product areas, categories, or subjects
 * 				to help buyers decide which type of item to purchase based on their particular interests.
 * 				Multiple buying guides can be returned. See the eBay Features Guide for additional information.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note:</b> Due to ongoing architectural and design changes of Buying Guides and Product Reviews on the site, the <b>FindReviewsAndGuides</b> call has been staged for deprecation. As of July 1, 2016, any issues with this call will no longer be supported, and this call will be shut down completely on August 1, 2016.
 * 				</span>
 * 			
 * 
 * <p>Java class for BuyingGuideDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyingGuideDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuyingGuide" type="{urn:ebay:apis:eBLBaseComponents}BuyingGuideType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuyingGuideHub" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
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
@XmlType(name = "BuyingGuideDetailsType", propOrder = {
    "buyingGuide",
    "buyingGuideHub",
    "any"
})
public class SoapBuyingGuideDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BuyingGuide")
    protected List<SoapBuyingGuideType> buyingGuide;
    @XmlElement(name = "BuyingGuideHub")
    @XmlSchemaType(name = "anyURI")
    protected String buyingGuideHub;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the buyingGuide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyingGuide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyingGuide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapBuyingGuideType }
     * 
     * 
     */
    public List<SoapBuyingGuideType> getBuyingGuide() {
        if (buyingGuide == null) {
            buyingGuide = new ArrayList<SoapBuyingGuideType>();
        }
        return this.buyingGuide;
    }

    /**
     * Gets the value of the buyingGuideHub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyingGuideHub() {
        return buyingGuideHub;
    }

    /**
     * Sets the value of the buyingGuideHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyingGuideHub(String value) {
        this.buyingGuideHub = value;
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
