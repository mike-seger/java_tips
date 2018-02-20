
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackRatingDetailCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackRatingDetailCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ItemAsDescribed"/&gt;
 *     &lt;enumeration value="Communication"/&gt;
 *     &lt;enumeration value="ShippingTime"/&gt;
 *     &lt;enumeration value="ShippingAndHandlingCharges"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeedbackRatingDetailCodeType")
@XmlEnum
public enum SoapFeedbackRatingDetailCodeType {


    /**
     * 
     * 						Detailed seller rating in the area of "item as described."
     * 					
     * 
     */
    @XmlEnumValue("ItemAsDescribed")
    ITEM_AS_DESCRIBED("ItemAsDescribed"),

    /**
     * 
     * 						Detailed seller rating in the area of "communication."
     * 					
     * 
     */
    @XmlEnumValue("Communication")
    COMMUNICATION("Communication"),

    /**
     * 
     * 						Detailed seller rating in the area of "shipping time." Inapplicable to 
     * 						motor vehicle items.
     * 					
     * 
     */
    @XmlEnumValue("ShippingTime")
    SHIPPING_TIME("ShippingTime"),

    /**
     * 
     * 						Detailed seller rating in the area of "charges for shipping and handling."
     * 						Inapplicable to motor vehicle items. 
     * 					
     * 
     */
    @XmlEnumValue("ShippingAndHandlingCharges")
    SHIPPING_AND_HANDLING_CHARGES("ShippingAndHandlingCharges"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapFeedbackRatingDetailCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapFeedbackRatingDetailCodeType fromValue(String v) {
        for (SoapFeedbackRatingDetailCodeType c: SoapFeedbackRatingDetailCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
