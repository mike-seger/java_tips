
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityCodeType")
@XmlEnum
public enum SoapSeverityCodeType {


    /**
     * 
     * 						(out) The request was processed successfully, but something occurred
     * 						that may affect your application or the user. For example, eBay may have
     * 						changed a value the user sent in. In this case, eBay returns a normal,
     * 						successful response and also returns the warning.
     * 					
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 						(out) The request that triggered the error was not processed
     * 						successfully. When a serious application-level error occurs, the error
     * 						is returned instead of the business data.
     * 					
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapSeverityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapSeverityCodeType fromValue(String v) {
        for (SoapSeverityCodeType c: SoapSeverityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
