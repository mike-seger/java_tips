
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingTreatmentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingTreatmentCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="STP"/&gt;
 *     &lt;enumeration value="MAP"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PricingTreatmentCodeType")
@XmlEnum
public enum SoapPricingTreatmentCodeType {


    /**
     * 
     * 						STP stands for Strikethrough Pricing.
     * 					
     * 
     */
    STP("STP"),

    /**
     * 
     * 						MAP stands for Minimum Advertised Price.
     * 					
     * 
     */
    MAP("MAP"),

    /**
     * 
     * 						None means the item does not qualify for either STP or MAP pricing.
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

    SoapPricingTreatmentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapPricingTreatmentCodeType fromValue(String v) {
        for (SoapPricingTreatmentCodeType c: SoapPricingTreatmentCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
