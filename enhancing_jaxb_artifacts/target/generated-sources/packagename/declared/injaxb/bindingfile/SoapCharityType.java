
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
 * 				This type is used to provide details about a nonprofit organization registered with the PayPal Giving Fund.
 * 			
 * 
 * <p>Java class for CharityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CharityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CharityNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DonationPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Mission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CharityListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}CharityStatusCodeType" minOccurs="0"/&gt;
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
@XmlType(name = "CharityType", propOrder = {
    "charityID",
    "charityName",
    "charityNumber",
    "donationPercent",
    "mission",
    "logoURL",
    "charityListing",
    "status",
    "any"
})
public class SoapCharityType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CharityID")
    protected String charityID;
    @XmlElement(name = "CharityName")
    protected String charityName;
    @XmlElement(name = "CharityNumber")
    protected Integer charityNumber;
    @XmlElement(name = "DonationPercent")
    protected Float donationPercent;
    @XmlElement(name = "Mission")
    protected String mission;
    @XmlElement(name = "LogoURL")
    protected String logoURL;
    @XmlElement(name = "CharityListing")
    protected Boolean charityListing;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "token")
    protected SoapCharityStatusCodeType status;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the charityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityID() {
        return charityID;
    }

    /**
     * Sets the value of the charityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityID(String value) {
        this.charityID = value;
    }

    /**
     * Gets the value of the charityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityName() {
        return charityName;
    }

    /**
     * Sets the value of the charityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityName(String value) {
        this.charityName = value;
    }

    /**
     * Gets the value of the charityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharityNumber() {
        return charityNumber;
    }

    /**
     * Sets the value of the charityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharityNumber(Integer value) {
        this.charityNumber = value;
    }

    /**
     * Gets the value of the donationPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDonationPercent() {
        return donationPercent;
    }

    /**
     * Sets the value of the donationPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDonationPercent(Float value) {
        this.donationPercent = value;
    }

    /**
     * Gets the value of the mission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMission() {
        return mission;
    }

    /**
     * Sets the value of the mission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMission(String value) {
        this.mission = value;
    }

    /**
     * Gets the value of the logoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * Sets the value of the logoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * Gets the value of the charityListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCharityListing() {
        return charityListing;
    }

    /**
     * Sets the value of the charityListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCharityListing(Boolean value) {
        this.charityListing = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SoapCharityStatusCodeType }
     *     
     */
    public SoapCharityStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapCharityStatusCodeType }
     *     
     */
    public void setStatus(SoapCharityStatusCodeType value) {
        this.status = value;
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
