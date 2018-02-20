
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 			Basic type for specifying monetary amounts. A double value (e.g.,
 * 			1.00 or 1.0) is meaningful as a monetary amount when accompanied by a
 * 			specification of the currency, in which case the value specifies
 * 			the amount in that currency. An AmountType expresses both the value
 * 			(a double) and the currency. Details such as prices, fees, costs,
 * 			and payments are specified as amount types.
 * 		
 * 
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
 *       &lt;attribute name="currencyID" use="required" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "value"
})
public class SoapAmountType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected double value;
    @XmlAttribute(name = "currencyID", required = true)
    protected SoapCurrencyCodeType currencyID;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link SoapCurrencyCodeType }
     *     
     */
    public SoapCurrencyCodeType getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapCurrencyCodeType }
     *     
     */
    public void setCurrencyID(SoapCurrencyCodeType value) {
        this.currencyID = value;
    }

}
