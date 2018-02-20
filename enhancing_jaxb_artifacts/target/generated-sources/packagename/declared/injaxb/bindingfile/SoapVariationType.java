
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
 * 			This element hold the values that define the SKU, StartPrice, Quantity, VariationDetails, and VariationSpecifics.
 * 			
 * 
 * <p>Java class for VariationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/&gt;
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SellingStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingStatusType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPriceInfo" type="{urn:ebay:apis:eBLBaseComponents}DiscountPriceInfoType" minOccurs="0"/&gt;
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
@XmlType(name = "VariationType", propOrder = {
    "sku",
    "startPrice",
    "quantity",
    "variationSpecifics",
    "quantitySold",
    "sellingStatus",
    "discountPriceInfo",
    "any"
})
public class SoapVariationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "StartPrice")
    protected SoapAmountType startPrice;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "VariationSpecifics")
    protected SoapNameValueListArrayType variationSpecifics;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "SellingStatus")
    protected SoapSellingStatusType sellingStatus;
    @XmlElement(name = "DiscountPriceInfo")
    protected SoapDiscountPriceInfoType discountPriceInfo;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the startPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getStartPrice() {
        return startPrice;
    }

    /**
     * Sets the value of the startPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setStartPrice(SoapAmountType value) {
        this.startPrice = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the variationSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link SoapNameValueListArrayType }
     *     
     */
    public SoapNameValueListArrayType getVariationSpecifics() {
        return variationSpecifics;
    }

    /**
     * Sets the value of the variationSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapNameValueListArrayType }
     *     
     */
    public void setVariationSpecifics(SoapNameValueListArrayType value) {
        this.variationSpecifics = value;
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
     * Gets the value of the sellingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSellingStatusType }
     *     
     */
    public SoapSellingStatusType getSellingStatus() {
        return sellingStatus;
    }

    /**
     * Sets the value of the sellingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSellingStatusType }
     *     
     */
    public void setSellingStatus(SoapSellingStatusType value) {
        this.sellingStatus = value;
    }

    /**
     * Gets the value of the discountPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SoapDiscountPriceInfoType }
     *     
     */
    public SoapDiscountPriceInfoType getDiscountPriceInfo() {
        return discountPriceInfo;
    }

    /**
     * Sets the value of the discountPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapDiscountPriceInfoType }
     *     
     */
    public void setDiscountPriceInfo(SoapDiscountPriceInfoType value) {
        this.discountPriceInfo = value;
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
