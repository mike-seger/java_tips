
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingStatusCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Ended"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListingStatusCodeType")
@XmlEnum
public enum SoapListingStatusCodeType {


    /**
     * 
     * 						(out) The listing is still live, or it has recently ended
     * 						but eBay has not completed processing
     * 						the listing (e.g., we're still determining the high bidder).
     * 						A multi-item listing is considered active until all items
     * 						have winning bids or purchases or the listing's end time
     * 						has passed. (That is, if the listing has a Quantity of 10,
     * 						the sale of 1 of those items doesn't end the listing.)
     * 						If the listing has ended but this Active
     * 						status is returned, please allow several minutes for eBay to
     * 						finish processing the listing.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						(out) The listing has ended and eBay has completed processing
     * 						of the sale (if any), such as determining the high bidder.
     * 					
     * 
     */
    @XmlEnumValue("Ended")
    ENDED("Ended"),

    /**
     * 
     * 						(out) The listing has ended and eBay has completed processing
     * 						of the sale (if any), such as determining the high bidder.
     * 						You can think of Completed and Ended as essentially equivalent.
     * 						(The difference is only meaningful to the seller of the item,
     * 						as Completed indicates whether eBay has finished calculating
     * 						certain selling fees.)
     * 					
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * 
     * 						(out) Placeholder value. See
     * 						<a href="http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/simpleTypes.html#token">token</a>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapListingStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapListingStatusCodeType fromValue(String v) {
        for (SoapListingStatusCodeType c: SoapListingStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
