
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSortCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSortCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Popularity"/&gt;
 *     &lt;enumeration value="Rating"/&gt;
 *     &lt;enumeration value="ReviewCount"/&gt;
 *     &lt;enumeration value="ItemCount"/&gt;
 *     &lt;enumeration value="Title"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductSortCodeType")
@XmlEnum
public enum SoapProductSortCodeType {


    /**
     * 
     * 						Sort by product popularity (as determined by eBay).
     * 						(This is the default sort order.)
     * 					
     * 
     */
    @XmlEnumValue("Popularity")
    POPULARITY("Popularity"),

    /**
     * 
     * 						Sort by average rating.
     * 					
     * 
     */
    @XmlEnumValue("Rating")
    RATING("Rating"),

    /**
     * 
     * 						Sort by the number of reviews on eBay.
     * 					
     * 
     */
    @XmlEnumValue("ReviewCount")
    REVIEW_COUNT("ReviewCount"),

    /**
     * 
     * 						Sort by the number of active items listed with this product.
     * 					
     * 
     */
    @XmlEnumValue("ItemCount")
    ITEM_COUNT("ItemCount"),

    /**
     * 
     * 						Sort by the product title.
     * 					
     * 
     */
    @XmlEnumValue("Title")
    TITLE("Title"),

    /**
     * 
     * 						Reserved for values that are not available in the version of the schema
     * 						you are using. This means if in a newer version of the API eBay adds a new value to <b>ProductSortCodeList</b> type and the request was using a <i>lower</i> version, 'CustomCode' is returned instead of the new value.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapProductSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapProductSortCodeType fromValue(String v) {
        for (SoapProductSortCodeType c: SoapProductSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
