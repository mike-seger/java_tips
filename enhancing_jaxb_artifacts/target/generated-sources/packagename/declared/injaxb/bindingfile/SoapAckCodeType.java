
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AckCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AckCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Failure"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="PartialFailure"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AckCodeType")
@XmlEnum
public enum SoapAckCodeType {


    /**
     * 
     * 						This value indicates that the call request was processed successfully without any issues.
     * 					
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     * 						This value indicates that the call request processing failed.
     * 					
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure"),

    /**
     * 
     * 						This value indicates that the call request was successful, but processing was not without any issues. These issues can be checked in the <b>Errors</b> container, that will also be returned when one or more known issues occur with the call request.
     * 					 
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 						This value indicates that the call request partially failed. One or more issues that may be responsible for this partial failure can be checked in the <b>Errors</b> container, that will also be returned when one or more known issues occur with the call request.
     * 					 
     * 
     */
    @XmlEnumValue("PartialFailure")
    PARTIAL_FAILURE("PartialFailure"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapAckCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapAckCodeType fromValue(String v) {
        for (SoapAckCodeType c: SoapAckCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
