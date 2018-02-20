
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalProductCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalProductCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ISBN"/&gt;
 *     &lt;enumeration value="UPC"/&gt;
 *     &lt;enumeration value="ProductID"/&gt;
 *     &lt;enumeration value="EAN"/&gt;
 *     &lt;enumeration value="Keywords"/&gt;
 *     &lt;enumeration value="MPN"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalProductCodeType")
@XmlEnum
public enum SoapExternalProductCodeType {


    /**
     * 
     * 						ExternalProductID.Value contains an ISBN value.
     * 						Required when you pass an ISBN as the external product ID.
     * 						(This value is also applicable to Half.com listings.)
     * 					
     * 
     */
    ISBN("ISBN"),

    /**
     * 
     * 						ExternalProductID.Value contains a UPC value.
     * 						Required when you pass a UPC as the external product ID.
     * 						(This value is also applicable to Half.com listings.)
     * 					
     * 
     */
    UPC("UPC"),

    /**
     * 
     * 						ExternalProductID.Value contains an eBay catalog product ID.
     * 						Required when you pass an eBay product ID
     * 						as the external product ID.
     * 						Not applicable with FindItemsAdvanced or FindProducts.
     * 					
     * 
     */
    @XmlEnumValue("ProductID")
    PRODUCT_ID("ProductID"),

    /**
     * 
     * 						ExternalProductID.Value contains an EAN value.
     * 						Required when you pass an EAN as the external product ID.
     * 					
     * 
     */
    EAN("EAN"),

    /**
     * 
     * 						ExternalProductID.Value contains a set of keywords that uniquely identify the product.
     * 						Only applicable when listing event ticket.
     * 						See the eBay Features Guide for information about valid
     * 						ticket keywords for an external product ID.
     * 						Required when you pass a set of keywords as the external product ID.
     * 						Not applicable with FindItemsAdvanced or FindProducts. 
     * 						With FindItemsAdvanced, use TicketFinder instead.
     * 					
     * 
     */
    @XmlEnumValue("Keywords")
    KEYWORDS("Keywords"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    MPN("MPN"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapExternalProductCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapExternalProductCodeType fromValue(String v) {
        for (SoapExternalProductCodeType c: SoapExternalProductCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
