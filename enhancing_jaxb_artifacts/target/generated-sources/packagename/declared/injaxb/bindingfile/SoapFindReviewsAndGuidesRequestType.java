
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Base request type for the <b>FindReviewsAndGuides</b> call
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note:</b> Due to ongoing architectural and design changes of Buying Guides and Product Reviews on the site, the <b>FindReviewsAndGuides</b> call has been staged for deprecation. As of July 1, 2016, any issues with this call will no longer be supported, and this call will be shut down completely on August 1, 2016.
 * 				</span>
 * 			
 * 
 * <p>Java class for FindReviewsAndGuidesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindReviewsAndGuidesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxResultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReviewSort" type="{urn:ebay:apis:eBLBaseComponents}ReviewSortCodeType" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindReviewsAndGuidesRequestType", propOrder = {
    "productID",
    "userID",
    "categoryID",
    "maxResultsPerPage",
    "pageNumber",
    "reviewSort",
    "sortOrder"
})
public class SoapFindReviewsAndGuidesRequestType
    extends SoapAbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductID")
    protected SoapProductIDType productID;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "MaxResultsPerPage")
    protected Integer maxResultsPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "ReviewSort")
    @XmlSchemaType(name = "token")
    protected SoapReviewSortCodeType reviewSort;
    @XmlElement(name = "SortOrder")
    @XmlSchemaType(name = "token")
    protected SoapSortOrderCodeType sortOrder;

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
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
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
     * Gets the value of the maxResultsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResultsPerPage() {
        return maxResultsPerPage;
    }

    /**
     * Sets the value of the maxResultsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResultsPerPage(Integer value) {
        this.maxResultsPerPage = value;
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
     * Gets the value of the reviewSort property.
     * 
     * @return
     *     possible object is
     *     {@link SoapReviewSortCodeType }
     *     
     */
    public SoapReviewSortCodeType getReviewSort() {
        return reviewSort;
    }

    /**
     * Sets the value of the reviewSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapReviewSortCodeType }
     *     
     */
    public void setReviewSort(SoapReviewSortCodeType value) {
        this.reviewSort = value;
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

}
