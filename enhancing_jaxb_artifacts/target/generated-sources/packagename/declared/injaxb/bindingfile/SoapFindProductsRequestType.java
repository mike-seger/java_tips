
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Searches for stock product information.
 * 			
 * 
 * <p>Java class for FindProductsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindProductsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludeSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableItemsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/&gt;
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductSort" type="{urn:ebay:apis:eBLBaseComponents}ProductSortCodeType" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/&gt;
 *         &lt;element name="MaxEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HideDuplicateItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindProductsRequestType", propOrder = {
    "includeSelector",
    "availableItemsOnly",
    "domainName",
    "productID",
    "queryKeywords",
    "productSort",
    "sortOrder",
    "maxEntries",
    "pageNumber",
    "categoryID",
    "hideDuplicateItems"
})
public class SoapFindProductsRequestType
    extends SoapAbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IncludeSelector")
    protected String includeSelector;
    @XmlElement(name = "AvailableItemsOnly")
    protected Boolean availableItemsOnly;
    @XmlElement(name = "DomainName")
    protected List<String> domainName;
    @XmlElement(name = "ProductID")
    protected SoapProductIDType productID;
    @XmlElement(name = "QueryKeywords")
    protected String queryKeywords;
    @XmlElement(name = "ProductSort")
    @XmlSchemaType(name = "token")
    protected SoapProductSortCodeType productSort;
    @XmlElement(name = "SortOrder")
    @XmlSchemaType(name = "token")
    protected SoapSortOrderCodeType sortOrder;
    @XmlElement(name = "MaxEntries")
    protected Integer maxEntries;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "HideDuplicateItems")
    protected Boolean hideDuplicateItems;

    /**
     * Gets the value of the includeSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeSelector() {
        return includeSelector;
    }

    /**
     * Sets the value of the includeSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeSelector(String value) {
        this.includeSelector = value;
    }

    /**
     * Gets the value of the availableItemsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableItemsOnly() {
        return availableItemsOnly;
    }

    /**
     * Sets the value of the availableItemsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableItemsOnly(Boolean value) {
        this.availableItemsOnly = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDomainName() {
        if (domainName == null) {
            domainName = new ArrayList<String>();
        }
        return this.domainName;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link SoapProductIDType }
     *     
     */
    public SoapProductIDType getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapProductIDType }
     *     
     */
    public void setProductID(SoapProductIDType value) {
        this.productID = value;
    }

    /**
     * Gets the value of the queryKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryKeywords() {
        return queryKeywords;
    }

    /**
     * Sets the value of the queryKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryKeywords(String value) {
        this.queryKeywords = value;
    }

    /**
     * Gets the value of the productSort property.
     * 
     * @return
     *     possible object is
     *     {@link SoapProductSortCodeType }
     *     
     */
    public SoapProductSortCodeType getProductSort() {
        return productSort;
    }

    /**
     * Sets the value of the productSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapProductSortCodeType }
     *     
     */
    public void setProductSort(SoapProductSortCodeType value) {
        this.productSort = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSortOrderCodeType }
     *     
     */
    public SoapSortOrderCodeType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSortOrderCodeType }
     *     
     */
    public void setSortOrder(SoapSortOrderCodeType value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the maxEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEntries() {
        return maxEntries;
    }

    /**
     * Sets the value of the maxEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEntries(Integer value) {
        this.maxEntries = value;
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
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the hideDuplicateItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideDuplicateItems() {
        return hideDuplicateItems;
    }

    /**
     * Sets the value of the hideDuplicateItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideDuplicateItems(Boolean value) {
        this.hideDuplicateItems = value;
    }

}
