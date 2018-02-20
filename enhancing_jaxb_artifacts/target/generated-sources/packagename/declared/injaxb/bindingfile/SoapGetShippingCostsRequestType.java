
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import client.Soapy;


/**
 * 
 * 				Gets shipping costs for an item. This is one of the ways a buyer or seller
 * 				can obtain shipping cost information for an existing item (for which the caller is
 * 				either the buyer or seller) at any point in the life of the listing, before or
 * 				after a buyer has committed to purchasing the item(s). This call works for
 * 				both flat rate shipping and calculated shipping. Flat rate shipping costs are
 * 				established by the seller before bidding occurs. Calculated shipping costs
 * 				are calculated by eBay with its shipping partners based on postal code, but note
 * 				that insurance cost can only be determined once the final item price is known
 * 				when the listing ends. To determine whether a listing has ended, use GetSingleItem.
 * 				It is best to call GetShippingCosts only after determining via GetSingleItem
 * 				or findItemsAdvanced (<a 
 * 				href="http://www.developer.ebay.com/DevZone/finding/CallRef/index.html" 
 * 				>Finding API</a>) that the item actually has shipping cost information.
 * 			
 * 
 * <p>Java class for GetShippingCostsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetShippingCostsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCountryCode" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetShippingCostsRequestType", propOrder = {
    "itemID",
    "quantitySold",
    "destinationPostalCode",
    "destinationCountryCode",
    "includeDetails"
})
public class SoapGetShippingCostsRequestType
    extends SoapAbstractRequestType
    implements Serializable, Soapy
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "DestinationPostalCode")
    protected String destinationPostalCode;
    @XmlElement(name = "DestinationCountryCode")
    @XmlSchemaType(name = "token")
    protected SoapCountryCodeType destinationCountryCode;
    @XmlElement(name = "IncludeDetails")
    protected Boolean includeDetails;

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
     * Gets the value of the quantitySold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySold() {
        return quantitySold;
    }

    /**
     * Sets the value of the quantitySold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySold(Integer value) {
        this.quantitySold = value;
    }

    /**
     * Gets the value of the destinationPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    /**
     * Sets the value of the destinationPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPostalCode(String value) {
        this.destinationPostalCode = value;
    }

    /**
     * Gets the value of the destinationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link SoapCountryCodeType }
     *     
     */
    public SoapCountryCodeType getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapCountryCodeType }
     *     
     */
    public void setDestinationCountryCode(SoapCountryCodeType value) {
        this.destinationCountryCode = value;
    }

    /**
     * Gets the value of the includeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDetails() {
        return includeDetails;
    }

    /**
     * Sets the value of the includeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDetails(Boolean value) {
        this.includeDetails = value;
    }

}
