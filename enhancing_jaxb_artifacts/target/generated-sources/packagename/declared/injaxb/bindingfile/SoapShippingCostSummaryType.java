
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
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> This type and its fields do not provide reliable shipping cost information when returned by the FindProducts, GetMultipleItems and GetSingleItem calls. If a listing has shipping costs, use the GetShippingCosts call to get more details about the services and costs that the seller is offering.
 * 				</span>
 * 			
 * 
 * <p>Java class for ShippingCostSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingCostSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingType" type="{urn:ebay:apis:eBLBaseComponents}ShippingTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="LocalPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ListedShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ImportCharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="LogisticPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingCostSummaryType", propOrder = {
    "shippingServiceName",
    "shippingServiceCost",
    "insuranceCost",
    "shippingType",
    "localPickup",
    "insuranceOption",
    "listedShippingServiceCost",
    "importCharge",
    "logisticPlanType",
    "any"
})
public class SoapShippingCostSummaryType
    implements Serializable, Soapy
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ShippingServiceName")
    protected String shippingServiceName;
    @XmlElement(name = "ShippingServiceCost")
    protected SoapAmountType shippingServiceCost;
    @XmlElement(name = "InsuranceCost")
    protected SoapAmountType insuranceCost;
    @XmlElement(name = "ShippingType")
    @XmlSchemaType(name = "token")
    protected SoapShippingTypeCodeType shippingType;
    @XmlElement(name = "LocalPickup")
    protected Boolean localPickup;
    @XmlElement(name = "InsuranceOption")
    @XmlSchemaType(name = "token")
    protected SoapInsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "ListedShippingServiceCost")
    protected SoapAmountType listedShippingServiceCost;
    @XmlElement(name = "ImportCharge")
    protected SoapAmountType importCharge;
    @XmlElement(name = "LogisticPlanType")
    protected String logisticPlanType;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shippingServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceName() {
        return shippingServiceName;
    }

    /**
     * Sets the value of the shippingServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceName(String value) {
        this.shippingServiceName = value;
    }

    /**
     * Gets the value of the shippingServiceCost property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getShippingServiceCost() {
        return shippingServiceCost;
    }

    /**
     * Sets the value of the shippingServiceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setShippingServiceCost(SoapAmountType value) {
        this.shippingServiceCost = value;
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
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link SoapShippingTypeCodeType }
     *     
     */
    public SoapShippingTypeCodeType getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapShippingTypeCodeType }
     *     
     */
    public void setShippingType(SoapShippingTypeCodeType value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the localPickup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalPickup() {
        return localPickup;
    }

    /**
     * Sets the value of the localPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalPickup(Boolean value) {
        this.localPickup = value;
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
     * Gets the value of the listedShippingServiceCost property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getListedShippingServiceCost() {
        return listedShippingServiceCost;
    }

    /**
     * Sets the value of the listedShippingServiceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setListedShippingServiceCost(SoapAmountType value) {
        this.listedShippingServiceCost = value;
    }

    /**
     * Gets the value of the importCharge property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAmountType }
     *     
     */
    public SoapAmountType getImportCharge() {
        return importCharge;
    }

    /**
     * Sets the value of the importCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAmountType }
     *     
     */
    public void setImportCharge(SoapAmountType value) {
        this.importCharge = value;
    }

    /**
     * Gets the value of the logisticPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticPlanType() {
        return logisticPlanType;
    }

    /**
     * Sets the value of the logisticPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticPlanType(String value) {
        this.logisticPlanType = value;
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
