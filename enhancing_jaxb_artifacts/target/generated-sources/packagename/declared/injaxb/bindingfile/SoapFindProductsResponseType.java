
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
 * 				Returns stock product information in eBay catalogs, such as
 * 				information about a particular DVD or camera. Optionally,
 * 				also returns items that match the product.
 * 			
 * 
 * <p>Java class for FindProductsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindProductsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApproximatePages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MoreResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DomainHistogram" type="{urn:ebay:apis:eBLBaseComponents}DomainHistogramType" minOccurs="0"/&gt;
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemArrayType" minOccurs="0"/&gt;
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{urn:ebay:apis:eBLBaseComponents}CatalogProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalProducts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DuplicateItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindProductsResponseType", propOrder = {
    "approximatePages",
    "moreResults",
    "domainHistogram",
    "itemArray",
    "pageNumber",
    "product",
    "totalProducts",
    "duplicateItems"
})
public class SoapFindProductsResponseType
    extends SoapAbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ApproximatePages")
    protected Integer approximatePages;
    @XmlElement(name = "MoreResults")
    protected Boolean moreResults;
    @XmlElement(name = "DomainHistogram")
    protected SoapDomainHistogramType domainHistogram;
    @XmlElement(name = "ItemArray")
    protected SoapSimpleItemArrayType itemArray;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "Product")
    protected List<SoapCatalogProductType> product;
    @XmlElement(name = "TotalProducts")
    protected Integer totalProducts;
    @XmlElement(name = "DuplicateItems")
    protected Boolean duplicateItems;

    /**
     * Gets the value of the approximatePages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApproximatePages() {
        return approximatePages;
    }

    /**
     * Sets the value of the approximatePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApproximatePages(Integer value) {
        this.approximatePages = value;
    }

    /**
     * Gets the value of the moreResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreResults() {
        return moreResults;
    }

    /**
     * Sets the value of the moreResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreResults(Boolean value) {
        this.moreResults = value;
    }

    /**
     * Gets the value of the domainHistogram property.
     * 
     * @return
     *     possible object is
     *     {@link SoapDomainHistogramType }
     *     
     */
    public SoapDomainHistogramType getDomainHistogram() {
        return domainHistogram;
    }

    /**
     * Sets the value of the domainHistogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapDomainHistogramType }
     *     
     */
    public void setDomainHistogram(SoapDomainHistogramType value) {
        this.domainHistogram = value;
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
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapCatalogProductType }
     * 
     * 
     */
    public List<SoapCatalogProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<SoapCatalogProductType>();
        }
        return this.product;
    }

    /**
     * Gets the value of the totalProducts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalProducts() {
        return totalProducts;
    }

    /**
     * Sets the value of the totalProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalProducts(Integer value) {
        this.totalProducts = value;
    }

    /**
     * Gets the value of the duplicateItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateItems() {
        return duplicateItems;
    }

    /**
     * Sets the value of the duplicateItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateItems(Boolean value) {
        this.duplicateItems = value;
    }

}
