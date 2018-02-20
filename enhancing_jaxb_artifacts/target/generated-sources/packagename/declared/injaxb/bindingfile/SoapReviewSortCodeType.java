
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReviewSortCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReviewSortCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CreationTime"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReviewSortCodeType")
@XmlEnum
public enum SoapReviewSortCodeType {


    /**
     * 
     * 						Sorts reviews by creation time, in ascending or descending order.
     * 					
     * 
     */
    @XmlEnumValue("CreationTime")
    CREATION_TIME("CreationTime"),

    /**
     * 
     * 						Reserved for values that are not available in the version of the schema
     * 						you are using. This means if in a newer version of the API eBay adds a new
     * 						value to <b>ProductSortCodeList</b> type and the request was using
     * 						a <i>lower</i> version, 'CustomCode' is returned instead of the
     * 						new value.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapReviewSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapReviewSortCodeType fromValue(String v) {
        for (SoapReviewSortCodeType c: SoapReviewSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
