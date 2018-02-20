
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response type of the <b>GetUserProfile</b> call, which contains detailed information about an eBay user, including their Feedback data.
 * 			
 * 
 * <p>Java class for GetUserProfileResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserProfileResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="User" type="{urn:ebay:apis:eBLBaseComponents}SimpleUserType" minOccurs="0"/&gt;
 *         &lt;element name="FeedbackHistory" type="{urn:ebay:apis:eBLBaseComponents}FeedbackHistoryType" minOccurs="0"/&gt;
 *         &lt;element name="FeedbackDetails" type="{urn:ebay:apis:eBLBaseComponents}FeedbackDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserProfileResponseType", propOrder = {
    "user",
    "feedbackHistory",
    "feedbackDetails"
})
public class SoapGetUserProfileResponseType
    extends SoapAbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "User")
    protected SoapSimpleUserType user;
    @XmlElement(name = "FeedbackHistory")
    protected SoapFeedbackHistoryType feedbackHistory;
    @XmlElement(name = "FeedbackDetails")
    protected List<SoapFeedbackDetailType> feedbackDetails;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSimpleUserType }
     *     
     */
    public SoapSimpleUserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSimpleUserType }
     *     
     */
    public void setUser(SoapSimpleUserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the feedbackHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SoapFeedbackHistoryType }
     *     
     */
    public SoapFeedbackHistoryType getFeedbackHistory() {
        return feedbackHistory;
    }

    /**
     * Sets the value of the feedbackHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapFeedbackHistoryType }
     *     
     */
    public void setFeedbackHistory(SoapFeedbackHistoryType value) {
        this.feedbackHistory = value;
    }

    /**
     * Gets the value of the feedbackDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbackDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbackDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapFeedbackDetailType }
     * 
     * 
     */
    public List<SoapFeedbackDetailType> getFeedbackDetails() {
        if (feedbackDetails == null) {
            feedbackDetails = new ArrayList<SoapFeedbackDetailType>();
        }
        return this.feedbackDetails;
    }

}
