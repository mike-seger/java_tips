
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
import client.Soapy;
import org.w3c.dom.Element;


/**
 * 
 * 				Type for the shipping-related details for an item or transaction.
 * 			
 * 
 * <p>Java class for ShippingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetItFast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="InternationalShippingServiceOption" type="{urn:ebay:apis:eBLBaseComponents}InternationalShippingServiceOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesTax" type="{urn:ebay:apis:eBLBaseComponents}SalesTaxType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingRateErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingServiceOption" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxTable" type="{urn:ebay:apis:eBLBaseComponents}TaxTableType" minOccurs="0"/&gt;
 *         &lt;element name="InternationalInsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="InternationalInsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CODCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ExcludeShipToLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingDetailsType", propOrder = {
    "getItFast",
    "insuranceCost",
    "insuranceOption",
    "internationalShippingServiceOption",
    "salesTax",
    "shippingRateErrorMessage",
    "shippingServiceOption",
    "taxTable",
    "internationalInsuranceCost",
    "internationalInsuranceOption",
    "codCost",
    "excludeShipToLocation",
    "any"
})
public class SoapShippingDetailsType
    implements Serializable, Soapy
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GetItFast")
    protected Boolean getItFast;
    @XmlElement(name = "InsuranceCost")
    protected SoapAmountType insuranceCost;
    @XmlElement(name = "InsuranceOption")
    @XmlSchemaType(name = "token")
    protected SoapInsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "InternationalShippingServiceOption")
    protected List<SoapInternationalShippingServiceOptionType> internationalShippingServiceOption;
    @XmlElement(name = "SalesTax")
    protected SoapSalesTaxType salesTax;
    @XmlElement(name = "ShippingRateErrorMessage")
    protected String shippingRateErrorMessage;
    @XmlElement(name = "ShippingServiceOption")
    protected List<SoapShippingServiceOptionType> shippingServiceOption;
    @XmlElement(name = "TaxTable")
    protected SoapTaxTableType taxTable;
    @XmlElement(name = "InternationalInsuranceCost")
    protected SoapAmountType internationalInsuranceCost;
    @XmlElement(name = "InternationalInsuranceOption")
    @XmlSchemaType(name = "token")
    protected SoapInsuranceOptionCodeType internationalInsuranceOption;
    @XmlElement(name = "CODCost")
    protected SoapAmountType codCost;
    @XmlElement(name = "ExcludeShipToLocation")
    protected List<String> excludeShipToLocation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the getItFast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetItFast() {
        return getItFast;
    }

    /**
     * Sets the value of the getItFast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetItFast(Boolean value) {
        this.getItFast = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setInsuranceCost(SoapAmountType value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the insuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link SoapInsuranceOptionCodeType }
     *     
     */
    public SoapInsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the value of the insuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapInsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(SoapInsuranceOptionCodeType value) {
        this.insuranceOption = value;
    }

    /**
     * Gets the value of the internationalShippingServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalShippingServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalShippingServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapInternationalShippingServiceOptionType }
     * 
     * 
     */
    public List<SoapInternationalShippingServiceOptionType> getInternationalShippingServiceOption() {
        if (internationalShippingServiceOption == null) {
            internationalShippingServiceOption = new ArrayList<SoapInternationalShippingServiceOptionType>();
        }
        return this.internationalShippingServiceOption;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSalesTaxType }
     *     
     */
    public SoapSalesTaxType getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSalesTaxType }
     *     
     */
    public void setSalesTax(SoapSalesTaxType value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the shippingRateErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingRateErrorMessage() {
        return shippingRateErrorMessage;
    }

    /**
     * Sets the value of the shippingRateErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingRateErrorMessage(String value) {
        this.shippingRateErrorMessage = value;
    }

    /**
     * Gets the value of the shippingServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapShippingServiceOptionType }
     * 
     * 
     */
    public List<SoapShippingServiceOptionType> getShippingServiceOption() {
        if (shippingServiceOption == null) {
            shippingServiceOption = new ArrayList<SoapShippingServiceOptionType>();
        }
        return this.shippingServiceOption;
    }

    /**
     * Gets the value of the taxTable property.
     * 
     * @return
     *     possible object is
     *     {@link SoapTaxTableType }
     *     
     */
    public SoapTaxTableType getTaxTable() {
        return taxTable;
    }

    /**
     * Sets the value of the taxTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapTaxTableType }
     *     
     */
    public void setTaxTable(SoapTaxTableType value) {
        this.taxTable = value;
    }

    /**
     * Gets the value of the internationalInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getInternationalInsuranceCost() {
        return internationalInsuranceCost;
    }

    /**
     * Sets the value of the internationalInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setInternationalInsuranceCost(SoapAmountType value) {
        this.internationalInsuranceCost = value;
    }

    /**
     * Gets the value of the internationalInsuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link SoapInsuranceOptionCodeType }
     *     
     */
    public SoapInsuranceOptionCodeType getInternationalInsuranceOption() {
        return internationalInsuranceOption;
    }

    /**
     * Sets the value of the internationalInsuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapInsuranceOptionCodeType }
     *     
     */
    public void setInternationalInsuranceOption(SoapInsuranceOptionCodeType value) {
        this.internationalInsuranceOption = value;
    }

    /**
     * Gets the value of the codCost property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getCODCost() {
        return codCost;
    }

    /**
     * Sets the value of the codCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setCODCost(SoapAmountType value) {
        this.codCost = value;
    }

    /**
     * Gets the value of the excludeShipToLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeShipToLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeShipToLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeShipToLocation() {
        if (excludeShipToLocation == null) {
            excludeShipToLocation = new ArrayList<String>();
        }
        return this.excludeShipToLocation;
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
