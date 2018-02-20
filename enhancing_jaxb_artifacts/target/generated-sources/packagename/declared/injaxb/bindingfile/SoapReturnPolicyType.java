
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Type for the return policy details of an item.
 * 			
 * 
 * <p>Java class for ReturnPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnPolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Refund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnsWithin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnsAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarrantyOffered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarrantyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarrantyDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCostPaidBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestockingFeeValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="RestockingFeeValueOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
@XmlType(name = "ReturnPolicyType", propOrder = {
    "refund",
    "returnsWithin",
    "returnsAccepted",
    "description",
    "warrantyOffered",
    "warrantyType",
    "warrantyDuration",
    "ean",
    "shippingCostPaidBy",
    "restockingFeeValue",
    "restockingFeeValueOption",
    "any"
})
public class SoapReturnPolicyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Refund")
    protected String refund;
    @XmlElement(name = "ReturnsWithin")
    protected String returnsWithin;
    @XmlElement(name = "ReturnsAccepted")
    protected String returnsAccepted;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "WarrantyOffered")
    protected String warrantyOffered;
    @XmlElement(name = "WarrantyType")
    protected String warrantyType;
    @XmlElement(name = "WarrantyDuration")
    protected String warrantyDuration;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "ShippingCostPaidBy")
    protected String shippingCostPaidBy;
    @XmlElement(name = "RestockingFeeValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String restockingFeeValue;
    @XmlElement(name = "RestockingFeeValueOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String restockingFeeValueOption;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefund(String value) {
        this.refund = value;
    }

    /**
     * Gets the value of the returnsWithin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsWithin() {
        return returnsWithin;
    }

    /**
     * Sets the value of the returnsWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsWithin(String value) {
        this.returnsWithin = value;
    }

    /**
     * Gets the value of the returnsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsAccepted() {
        return returnsAccepted;
    }

    /**
     * Sets the value of the returnsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsAccepted(String value) {
        this.returnsAccepted = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the warrantyOffered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyOffered() {
        return warrantyOffered;
    }

    /**
     * Sets the value of the warrantyOffered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyOffered(String value) {
        this.warrantyOffered = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyType(String value) {
        this.warrantyType = value;
    }

    /**
     * Gets the value of the warrantyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyDuration() {
        return warrantyDuration;
    }

    /**
     * Sets the value of the warrantyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyDuration(String value) {
        this.warrantyDuration = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the shippingCostPaidBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCostPaidBy() {
        return shippingCostPaidBy;
    }

    /**
     * Sets the value of the shippingCostPaidBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCostPaidBy(String value) {
        this.shippingCostPaidBy = value;
    }

    /**
     * Gets the value of the restockingFeeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestockingFeeValue() {
        return restockingFeeValue;
    }

    /**
     * Sets the value of the restockingFeeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestockingFeeValue(String value) {
        this.restockingFeeValue = value;
    }

    /**
     * Gets the value of the restockingFeeValueOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestockingFeeValueOption() {
        return restockingFeeValueOption;
    }

    /**
     * Sets the value of the restockingFeeValueOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestockingFeeValueOption(String value) {
        this.restockingFeeValueOption = value;
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
