
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Chinese"/&gt;
 *     &lt;enumeration value="Dutch"/&gt;
 *     &lt;enumeration value="Live"/&gt;
 *     &lt;enumeration value="Auction"/&gt;
 *     &lt;enumeration value="AdType"/&gt;
 *     &lt;enumeration value="StoresFixedPrice"/&gt;
 *     &lt;enumeration value="PersonalOffer"/&gt;
 *     &lt;enumeration value="FixedPriceItem"/&gt;
 *     &lt;enumeration value="Half"/&gt;
 *     &lt;enumeration value="LeadGeneration"/&gt;
 *     &lt;enumeration value="Express"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListingTypeCodeType")
@XmlEnum
public enum SoapListingTypeCodeType {


    /**
     * 
     * 						Unknown auction type. (This is not normally used.)
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						Single-quantity online auction format.
     * 						A Chinese auction has a Quantity of 1. Buyers engage in competitive bidding,
     * 						although Buy It Now may be offered as long as no bids have been placed.
     * 						Online auctions are listed on eBay.com, and they are also listed in
     * 						the seller's eBay Store if the seller is a Store owner.
     * 					
     * 
     */
    @XmlEnumValue("Chinese")
    CHINESE("Chinese"),

    /**
     * 
     * 					This value is no longer applicable.
     * 					
     * 					
     * 
     */
    @XmlEnumValue("Dutch")
    DUTCH("Dutch"),

    /**
     * 
     * 						Live auction, on-site auction that can include non-eBay bidders. Live auctions
     * 						are listed on the eBay Live Auctions site, in live auction categories. They can
     * 						also appear on eBay if the seller lists the lot in a secondary, eBay category.
     * 					
     * 
     */
    @XmlEnumValue("Live")
    LIVE("Live"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Auction")
    AUCTION("Auction"),

    /**
     * 
     * 						Advertisement to solicit inquiries on listings such as real estate. Permits no
     * 						bidding on that item, service, or property. To express interest, a buyer fills
     * 						out a contact form that eBay forwards to the seller as a lead. This format
     * 						does not enable buyers and sellers to transact online through eBay, and eBay
     * 						Feedback is not available for ad format listings.
     * 					
     * 
     */
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),

    /**
     * 
     * 						This value is no longer applicable. 
     * 						
     * 					
     * 
     */
    @XmlEnumValue("StoresFixedPrice")
    STORES_FIXED_PRICE("StoresFixedPrice"),

    /**
     * 
     * 						Second chance offer made to a non-winning bidder on an ended listing. A seller
     * 						can make an offer to a non-winning bidder when either the winning bidder has
     * 						failed to pay for an item or the seller has a duplicate of the item. Second-
     * 						chance offer items are on eBay, but they do not appear when browsing or
     * 						searching listings. You need to already know the item ID in order to retrieve a
     * 						second-chance offer.
     * 					
     * 
     */
    @XmlEnumValue("PersonalOffer")
    PERSONAL_OFFER("PersonalOffer"),

    /**
     * 
     * 						A basic fixed-price listing with a Quantity of 1. Allows no auction-style
     * 						bidding. Also known as Buy It Now Only on some sites, this should not to be
     * 						confused with the BuyItNow option that is available for competitive-bid
     * 						auctions. Fixed-price listings appear on eBay.com. They are also listed in a
     * 						seller's eBay Store if the seller is a Store owner.
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceItem")
    FIXED_PRICE_ITEM("FixedPriceItem"),

    /**
     * 
     * 						Half.com listing (item is listed on Half.com, not on eBay).
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Half")
    HALF("Half"),

    /**
     * 
     * 						Lead Generation format (advertisement-style listing to solicit
     * 						inquiries or offers, no bidding or fixed price, listed on eBay).
     * 					
     * 
     */
    @XmlEnumValue("LeadGeneration")
    LEAD_GENERATION("LeadGeneration"),

    /**
     * 
     * 					This value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("Express")
    EXPRESS("Express"),

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

    SoapListingTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapListingTypeCodeType fromValue(String v) {
        for (SoapListingTypeCodeType c: SoapListingTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
