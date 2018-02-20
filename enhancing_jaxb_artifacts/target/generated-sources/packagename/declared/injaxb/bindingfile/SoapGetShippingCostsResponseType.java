
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import client.Soapy;


/**
 * 
 * 				The base response type of the <b>GetShippingCosts</b> call.
 * 			
 * 
 * <p>Java class for GetShippingCostsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetShippingCostsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCostSummary" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="PickUpInStoreDetails" type="{urn:ebay:apis:eBLBaseComponents}PickUpInStoreDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetShippingCostsResponseType", propOrder = {
    "shippingDetails",
    "shippingCostSummary",
    "pickUpInStoreDetails"
})
public class SoapGetShippingCostsResponseType
    extends SoapAbstractResponseType
    implements Serializable, Soapy
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ShippingDetails")
    protected SoapShippingDetailsType shippingDetails;
    @XmlElement(name = "ShippingCostSummary")
    protected SoapShippingCostSummaryType shippingCostSummary;
    @XmlElement(name = "PickUpInStoreDetails")
    protected SoapPickUpInStoreDetailsType pickUpInStoreDetails;

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SoapShippingDetailsType }
     *     
     */
    public SoapShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapShippingDetailsType }
     *     
     */
    public void setShippingDetails(SoapShippingDetailsType value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the shippingCostSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SoapShippingCostSummaryType }
     *     
     */
    public SoapShippingCostSummaryType getShippingCostSummary() {
        return shippingCostSummary;
    }

    /**
     * Sets the value of the shippingCostSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapShippingCostSummaryType }
     *     
     */
    public void setShippingCostSummary(SoapShippingCostSummaryType value) {
        this.shippingCostSummary = value;
    }

    /**
     * Gets the value of the pickUpInStoreDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SoapPickUpInStoreDetailsType }
     *     
     */
    public SoapPickUpInStoreDetailsType getPickUpInStoreDetails() {
        return pickUpInStoreDetails;
    }

    /**
     * Sets the value of the pickUpInStoreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapPickUpInStoreDetailsType }
     *     
     */
    public void setPickUpInStoreDetails(SoapPickUpInStoreDetailsType value) {
        this.pickUpInStoreDetails = value;
    }

}
