
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
 * 				Contains product reviews written by eBay members.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note:</b> Due to ongoing architectural and design changes of Buying Guides and Product Reviews on the site, the <b>FindReviewsAndGuides</b> call has been staged for deprecation. As of July 1, 2016, any issues with this call will no longer be supported, and this call will be shut down completely on August 1, 2016.
 * 				</span>
 * 			 
 * 
 * <p>Java class for ReviewDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviewDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AverageRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Review" type="{urn:ebay:apis:eBLBaseComponents}ReviewType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ReviewDetailsType", propOrder = {
    "averageRating",
    "review",
    "any"
})
public class SoapReviewDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AverageRating")
    protected Float averageRating;
    @XmlElement(name = "Review")
    protected List<SoapReviewType> review;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the averageRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageRating() {
        return averageRating;
    }

    /**
     * Sets the value of the averageRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageRating(Float value) {
        this.averageRating = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the review property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapReviewType }
     * 
     * 
     */
    public List<SoapReviewType> getReview() {
        if (review == null) {
            review = new ArrayList<SoapReviewType>();
        }
        return this.review;
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
