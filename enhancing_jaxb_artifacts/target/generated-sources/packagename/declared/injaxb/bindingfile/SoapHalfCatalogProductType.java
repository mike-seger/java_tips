
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
 * 			Information about an Half.com catalog product.
 * 			
 * 
 * <p>Java class for HalfCatalogProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HalfCatalogProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="StockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCostSummary" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayStockPhotos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/&gt;
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemArrayType" minOccurs="0"/&gt;
 *         &lt;element name="ReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
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
@XmlType(name = "HalfCatalogProductType", propOrder = {
    "title",
    "detailsURL",
    "stockPhotoURL",
    "shippingCostSummary",
    "displayStockPhotos",
    "itemCount",
    "productID",
    "domainName",
    "itemSpecifics",
    "itemArray",
    "reviewCount",
    "minPrice",
    "any"
})
public class SoapHalfCatalogProductType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "DetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String detailsURL;
    @XmlElement(name = "StockPhotoURL")
    @XmlSchemaType(name = "anyURI")
    protected String stockPhotoURL;
    @XmlElement(name = "ShippingCostSummary")
    protected SoapShippingCostSummaryType shippingCostSummary;
    @XmlElement(name = "DisplayStockPhotos")
    protected Boolean displayStockPhotos;
    @XmlElement(name = "ItemCount")
    protected Integer itemCount;
    @XmlElement(name = "ProductID")
    protected List<SoapProductIDType> productID;
    @XmlElement(name = "DomainName")
    protected String domainName;
    @XmlElement(name = "ItemSpecifics")
    protected SoapNameValueListArrayType itemSpecifics;
    @XmlElement(name = "ItemArray")
    protected SoapSimpleItemArrayType itemArray;
    @XmlElement(name = "ReviewCount")
    protected Integer reviewCount;
    @XmlElement(name = "MinPrice")
    protected SoapAmountType minPrice;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the detailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsURL() {
        return detailsURL;
    }

    /**
     * Sets the value of the detailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsURL(String value) {
        this.detailsURL = value;
    }

    /**
     * Gets the value of the stockPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhotoURL() {
        return stockPhotoURL;
    }

    /**
     * Sets the value of the stockPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhotoURL(String value) {
        this.stockPhotoURL = value;
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
     * Gets the value of the displayStockPhotos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayStockPhotos() {
        return displayStockPhotos;
    }

    /**
     * Sets the value of the displayStockPhotos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayStockPhotos(Boolean value) {
        this.displayStockPhotos = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapProductIDType }
     * 
     * 
     */
    public List<SoapProductIDType> getProductID() {
        if (productID == null) {
            productID = new ArrayList<SoapProductIDType>();
        }
        return this.productID;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the itemSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link SoapNameValueListArrayType }
     *     
     */
    public SoapNameValueListArrayType getItemSpecifics() {
        return itemSpecifics;
    }

    /**
     * Sets the value of the itemSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapNameValueListArrayType }
     *     
     */
    public void setItemSpecifics(SoapNameValueListArrayType value) {
        this.itemSpecifics = value;
    }

    /**
     * Gets the value of the itemArray property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSimpleItemArrayType }
     *     
     */
    public SoapSimpleItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * Sets the value of the itemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSimpleItemArrayType }
     *     
     */
    public void setItemArray(SoapSimpleItemArrayType value) {
        this.itemArray = value;
    }

    /**
     * Gets the value of the reviewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * Sets the value of the reviewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewCount(Integer value) {
        this.reviewCount = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setMinPrice(SoapAmountType value) {
        this.minPrice = value;
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
