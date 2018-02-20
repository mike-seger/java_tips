
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrderCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Ascending"/&gt;
 *     &lt;enumeration value="Descending"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortOrderCodeType")
@XmlEnum
public enum SoapSortOrderCodeType {


    /**
     * 
     * 						Sorts results in ascending (low to high) order.
     * 					
     * 
     */
    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),

    /**
     * 
     * 						Sorts results in descending (high to low) order.
     * 					
     * 
     */
    @XmlEnumValue("Descending")
    DESCENDING("Descending"),

    /**
     * 
     * 						Placeholder value. See
     * 						<a href="http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/simpleTypes.html#token">token</a>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapSortOrderCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapSortOrderCodeType fromValue(String v) {
        for (SoapSortOrderCodeType c: SoapSortOrderCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
