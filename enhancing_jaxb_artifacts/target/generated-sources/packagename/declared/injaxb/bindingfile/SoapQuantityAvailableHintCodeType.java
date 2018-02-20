
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityAvailableHintCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantityAvailableHintCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Limited"/&gt;
 *     &lt;enumeration value="MoreThan"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuantityAvailableHintCodeType")
@XmlEnum
public enum SoapQuantityAvailableHintCodeType {


    /**
     * 
     * 						(out) The message "Limited quantity available" is shown in the web
     * 						flow (e.g., for a flash sale or a Daily Deal).
     * 					
     * 
     */
    @XmlEnumValue("Limited")
    LIMITED("Limited"),

    /**
     * 
     * 						(out) The message "More than 10 available" is shown in the web flow.
     * 						10 is the value of QuantityThreshold tag based on the seller's
     * 						preference.
     * 					
     * 
     */
    @XmlEnumValue("MoreThan")
    MORE_THAN("MoreThan"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapQuantityAvailableHintCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapQuantityAvailableHintCodeType fromValue(String v) {
        for (SoapQuantityAvailableHintCodeType c: SoapQuantityAvailableHintCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
