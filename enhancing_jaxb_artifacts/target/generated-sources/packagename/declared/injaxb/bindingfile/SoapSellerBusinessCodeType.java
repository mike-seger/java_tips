
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerBusinessCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerBusinessCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Commercial"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SellerBusinessCodeType")
@XmlEnum
public enum SoapSellerBusinessCodeType {


    /**
     * 
     * 							Type of seller account not defined.
     * 						
     * 
     */
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),

    /**
     * 
     * 							Private seller account.
     * 						
     * 
     */
    @XmlEnumValue("Private")
    PRIVATE("Private"),

    /**
     * 
     * 							Commercial seller account.
     * 						
     * 
     */
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),

    /**
     * 
     * 							(out) Reserved for internal or future use.
     * 						
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapSellerBusinessCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapSellerBusinessCodeType fromValue(String v) {
        for (SoapSellerBusinessCodeType c: SoapSellerBusinessCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
