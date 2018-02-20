
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Returns stock product information in Half.com catalogs, such as
 * 			information about a particular DVD or book. Optionally,
 * 			also returns items that match the product.
 * 			
 * 
 * <p>Java class for FindHalfProductsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindHalfProductsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomainHistogram" type="{urn:ebay:apis:eBLBaseComponents}DomainHistogramType" minOccurs="0"/&gt;
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ApproximatePages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MoreResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalProducts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Products" type="{urn:ebay:apis:eBLBaseComponents}HalfProductsType" minOccurs="0"/&gt;
 *         &lt;element name="ProductSearchURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindHalfProductsResponseType", propOrder = {
    "domainHistogram",
    "pageNumber",
    "approximatePages",
    "moreResults",
    "totalProducts",
    "products",
    "productSearchURL"
})
public class SoapFindHalfProductsResponseType
    extends SoapAbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DomainHistogram")
    protected SoapDomainHistogramType domainHistogram;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "ApproximatePages")
    protected Integer approximatePages;
    @XmlElement(name = "MoreResults")
    protected Boolean moreResults;
    @XmlElement(name = "TotalProducts")
    protected Integer totalProducts;
    @XmlElement(name = "Products")
    protected SoapHalfProductsType products;
    @XmlElement(name = "ProductSearchURL")
    @XmlSchemaType(name = "anyURI")
    protected String productSearchURL;

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
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link SoapHalfProductsType }
     *     
     */
    public SoapHalfProductsType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapHalfProductsType }
     *     
     */
    public void setProducts(SoapHalfProductsType value) {
        this.products = value;
    }

    /**
     * Gets the value of the productSearchURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSearchURL() {
        return productSearchURL;
    }

    /**
     * Sets the value of the productSearchURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSearchURL(String value) {
        this.productSearchURL = value;
    }

}
