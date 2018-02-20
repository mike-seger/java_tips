
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
 * 				Contains the discount pricing details for an item, including the original
 * 				retail price and the display treatment to be used for the item. The pricing
 * 				treatment displayed for a discounted item depends on the values specified
 * 				in this container when the item is listed. Discount pricing treatments
 * 				(Strikethrough Pricing and Minimum Advertised Price) apply to only fixed
 * 				price, BIN items. Sellers can apply Discount Pricing to both MSKU and
 * 				Non-MSKU items.
 * 			
 * 
 * <p>Java class for DiscountPriceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountPriceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalRetailPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="MinimumAdvertisedPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="MinimumAdvertisedPriceExposure" type="{urn:ebay:apis:eBLBaseComponents}MinimumAdvertisedPriceExposureCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PricingTreatment" type="{urn:ebay:apis:eBLBaseComponents}PricingTreatmentCodeType" minOccurs="0"/&gt;
 *         &lt;element name="SoldOneBay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SoldOffeBay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "DiscountPriceInfoType", propOrder = {
    "originalRetailPrice",
    "minimumAdvertisedPrice",
    "minimumAdvertisedPriceExposure",
    "pricingTreatment",
    "soldOneBay",
    "soldOffeBay",
    "any"
})
public class SoapDiscountPriceInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OriginalRetailPrice")
    protected SoapAmountType originalRetailPrice;
    @XmlElement(name = "MinimumAdvertisedPrice")
    protected SoapAmountType minimumAdvertisedPrice;
    @XmlElement(name = "MinimumAdvertisedPriceExposure")
    @XmlSchemaType(name = "token")
    protected SoapMinimumAdvertisedPriceExposureCodeType minimumAdvertisedPriceExposure;
    @XmlElement(name = "PricingTreatment")
    @XmlSchemaType(name = "token")
    protected SoapPricingTreatmentCodeType pricingTreatment;
    @XmlElement(name = "SoldOneBay", defaultValue = "false")
    protected Boolean soldOneBay;
    @XmlElement(name = "SoldOffeBay", defaultValue = "false")
    protected Boolean soldOffeBay;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the originalRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getOriginalRetailPrice() {
        return originalRetailPrice;
    }

    /**
     * Sets the value of the originalRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setOriginalRetailPrice(SoapAmountType value) {
        this.originalRetailPrice = value;
    }

    /**
     * Gets the value of the minimumAdvertisedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getMinimumAdvertisedPrice() {
        return minimumAdvertisedPrice;
    }

    /**
     * Sets the value of the minimumAdvertisedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setMinimumAdvertisedPrice(SoapAmountType value) {
        this.minimumAdvertisedPrice = value;
    }

    /**
     * Gets the value of the minimumAdvertisedPriceExposure property.
     * 
     * @return
     *     possible object is
     *     {@link SoapMinimumAdvertisedPriceExposureCodeType }
     *     
     */
    public SoapMinimumAdvertisedPriceExposureCodeType getMinimumAdvertisedPriceExposure() {
        return minimumAdvertisedPriceExposure;
    }

    /**
     * Sets the value of the minimumAdvertisedPriceExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapMinimumAdvertisedPriceExposureCodeType }
     *     
     */
    public void setMinimumAdvertisedPriceExposure(SoapMinimumAdvertisedPriceExposureCodeType value) {
        this.minimumAdvertisedPriceExposure = value;
    }

    /**
     * Gets the value of the pricingTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link SoapPricingTreatmentCodeType }
     *     
     */
    public SoapPricingTreatmentCodeType getPricingTreatment() {
        return pricingTreatment;
    }

    /**
     * Sets the value of the pricingTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapPricingTreatmentCodeType }
     *     
     */
    public void setPricingTreatment(SoapPricingTreatmentCodeType value) {
        this.pricingTreatment = value;
    }

    /**
     * Gets the value of the soldOneBay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOneBay() {
        return soldOneBay;
    }

    /**
     * Sets the value of the soldOneBay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOneBay(Boolean value) {
        this.soldOneBay = value;
    }

    /**
     * Gets the value of the soldOffeBay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOffeBay() {
        return soldOffeBay;
    }

    /**
     * Sets the value of the soldOffeBay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOffeBay(Boolean value) {
        this.soldOffeBay = value;
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
