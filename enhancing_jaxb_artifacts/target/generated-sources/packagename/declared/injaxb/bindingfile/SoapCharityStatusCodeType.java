
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharityStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharityStatusCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Valid"/&gt;
 *     &lt;enumeration value="NoLongerValid"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CharityStatusCodeType")
@XmlEnum
public enum SoapCharityStatusCodeType {


    /**
     * 
     * 						The specified nonprofit charity organization is a valid nonprofit charity organization according to the requirements of the PayPal Giving Fund.
     * 					
     * 
     */
    @XmlEnumValue("Valid")
    VALID("Valid"),

    /**
     * 
     * 					  The specified nonprofit charity organization is no longer a valid nonprofit charity organization according to the requirements of the PayPal Giving Fund.
     * 					
     * 
     */
    @XmlEnumValue("NoLongerValid")
    NO_LONGER_VALID("NoLongerValid"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapCharityStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapCharityStatusCodeType fromValue(String v) {
        for (SoapCharityStatusCodeType c: SoapCharityStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
