
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinimumAdvertisedPriceExposureCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MinimumAdvertisedPriceExposureCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PreCheckout"/&gt;
 *     &lt;enumeration value="DuringCheckout"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MinimumAdvertisedPriceExposureCodeType")
@XmlEnum
public enum SoapMinimumAdvertisedPriceExposureCodeType {


    /**
     * 
     * 						PreCheckout specifies that the buyer must click a link (or a button) to navigate to a separate
     * 						page (or window) that displays the discount price.
     * 					
     * 
     */
    @XmlEnumValue("PreCheckout")
    PRE_CHECKOUT("PreCheckout"),

    /**
     * 
     * 						DuringCheckout specifies that the discounted price must be shown on the eBay checkout
     * 						flow page.
     * 					
     * 
     */
    @XmlEnumValue("DuringCheckout")
    DURING_CHECKOUT("DuringCheckout"),

    /**
     * 
     * 						None means the discount price is not shown via either PreCheckout nor DuringCheckout.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapMinimumAdvertisedPriceExposureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapMinimumAdvertisedPriceExposureCodeType fromValue(String v) {
        for (SoapMinimumAdvertisedPriceExposureCodeType c: SoapMinimumAdvertisedPriceExposureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
