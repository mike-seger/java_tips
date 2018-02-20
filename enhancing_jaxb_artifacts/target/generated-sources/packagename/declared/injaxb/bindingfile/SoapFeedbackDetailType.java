
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
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * 
 * 				Container consisting of detailed information on a Feedback entry for a specific
 * 				order line item. This container will only be returned if an <b>IncludeSelector</b> field is include with its value set to  <code>ReturnAll</code>. For Feedback entries that were left for the buyer by the seller, some of the fields of this container will not be returned to users who were not involved in the transaction as either the buyer or seller.
 * 		  
 * 
 * <p>Java class for FeedbackDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeedbackRatingStar" type="{urn:ebay:apis:eBLBaseComponents}FeedbackRatingStarCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CommentingUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommentingUserScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CommentType" type="{urn:ebay:apis:eBLBaseComponents}CommentTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="FeedbackResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FollowUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ItemTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="FeedbackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommentReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResponseReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FollowUpReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Countable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "FeedbackDetailType", propOrder = {
    "feedbackRatingStar",
    "commentingUser",
    "commentingUserScore",
    "commentText",
    "commentTime",
    "commentType",
    "feedbackResponse",
    "followUp",
    "itemID",
    "role",
    "itemTitle",
    "itemPrice",
    "feedbackID",
    "transactionID",
    "commentReplaced",
    "responseReplaced",
    "followUpReplaced",
    "countable",
    "any"
})
public class SoapFeedbackDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FeedbackRatingStar")
    @XmlSchemaType(name = "token")
    protected SoapFeedbackRatingStarCodeType feedbackRatingStar;
    @XmlElement(name = "CommentingUser")
    protected String commentingUser;
    @XmlElement(name = "CommentingUserScore")
    protected Integer commentingUserScore;
    @XmlElement(name = "CommentText")
    protected String commentText;
    @XmlElement(name = "CommentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentTime;
    @XmlElement(name = "CommentType")
    @XmlSchemaType(name = "token")
    protected SoapCommentTypeCodeType commentType;
    @XmlElement(name = "FeedbackResponse")
    protected String feedbackResponse;
    @XmlElement(name = "FollowUp")
    protected String followUp;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "token")
    protected SoapTradingRoleCodeType role;
    @XmlElement(name = "ItemTitle")
    protected String itemTitle;
    @XmlElement(name = "ItemPrice")
    protected SoapAmountType itemPrice;
    @XmlElement(name = "FeedbackID")
    protected String feedbackID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "CommentReplaced")
    protected Boolean commentReplaced;
    @XmlElement(name = "ResponseReplaced")
    protected Boolean responseReplaced;
    @XmlElement(name = "FollowUpReplaced")
    protected Boolean followUpReplaced;
    @XmlElement(name = "Countable")
    protected Boolean countable;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the feedbackRatingStar property.
     * 
     * @return
     *     possible object is
     *     {@link SoapFeedbackRatingStarCodeType }
     *     
     */
    public SoapFeedbackRatingStarCodeType getFeedbackRatingStar() {
        return feedbackRatingStar;
    }

    /**
     * Sets the value of the feedbackRatingStar property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapFeedbackRatingStarCodeType }
     *     
     */
    public void setFeedbackRatingStar(SoapFeedbackRatingStarCodeType value) {
        this.feedbackRatingStar = value;
    }

    /**
     * Gets the value of the commentingUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentingUser() {
        return commentingUser;
    }

    /**
     * Sets the value of the commentingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentingUser(String value) {
        this.commentingUser = value;
    }

    /**
     * Gets the value of the commentingUserScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommentingUserScore() {
        return commentingUserScore;
    }

    /**
     * Sets the value of the commentingUserScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommentingUserScore(Integer value) {
        this.commentingUserScore = value;
    }

    /**
     * Gets the value of the commentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

    /**
     * Gets the value of the commentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommentTime() {
        return commentTime;
    }

    /**
     * Sets the value of the commentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommentTime(XMLGregorianCalendar value) {
        this.commentTime = value;
    }

    /**
     * Gets the value of the commentType property.
     * 
     * @return
     *     possible object is
     *     {@link SoapCommentTypeCodeType }
     *     
     */
    public SoapCommentTypeCodeType getCommentType() {
        return commentType;
    }

    /**
     * Sets the value of the commentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapCommentTypeCodeType }
     *     
     */
    public void setCommentType(SoapCommentTypeCodeType value) {
        this.commentType = value;
    }

    /**
     * Gets the value of the feedbackResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackResponse() {
        return feedbackResponse;
    }

    /**
     * Sets the value of the feedbackResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackResponse(String value) {
        this.feedbackResponse = value;
    }

    /**
     * Gets the value of the followUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowUp() {
        return followUp;
    }

    /**
     * Sets the value of the followUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowUp(String value) {
        this.followUp = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link SoapTradingRoleCodeType }
     *     
     */
    public SoapTradingRoleCodeType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapTradingRoleCodeType }
     *     
     */
    public void setRole(SoapTradingRoleCodeType value) {
        this.role = value;
    }

    /**
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setItemPrice(SoapAmountType value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the feedbackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackID() {
        return feedbackID;
    }

    /**
     * Sets the value of the feedbackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackID(String value) {
        this.feedbackID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the commentReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommentReplaced() {
        return commentReplaced;
    }

    /**
     * Sets the value of the commentReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommentReplaced(Boolean value) {
        this.commentReplaced = value;
    }

    /**
     * Gets the value of the responseReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResponseReplaced() {
        return responseReplaced;
    }

    /**
     * Sets the value of the responseReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResponseReplaced(Boolean value) {
        this.responseReplaced = value;
    }

    /**
     * Gets the value of the followUpReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowUpReplaced() {
        return followUpReplaced;
    }

    /**
     * Sets the value of the followUpReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowUpReplaced(Boolean value) {
        this.followUpReplaced = value;
    }

    /**
     * Gets the value of the countable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCountable() {
        return countable;
    }

    /**
     * Sets the value of the countable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountable(Boolean value) {
        this.countable = value;
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
