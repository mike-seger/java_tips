
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerLevelCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Bronze"/&gt;
 *     &lt;enumeration value="Silver"/&gt;
 *     &lt;enumeration value="Gold"/&gt;
 *     &lt;enumeration value="Platinum"/&gt;
 *     &lt;enumeration value="Titanium"/&gt;
 *     &lt;enumeration value="Diamond"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SellerLevelCodeType")
@XmlEnum
public enum SoapSellerLevelCodeType {


    /**
     * 
     * 						Bronze (lowest tier)
     * 					
     * 
     */
    @XmlEnumValue("Bronze")
    BRONZE("Bronze"),

    /**
     * 
     * 						Silver (between Bronze and Gold)
     * 					
     * 
     */
    @XmlEnumValue("Silver")
    SILVER("Silver"),

    /**
     * 
     * 						Gold (between Silver and Platinum)
     * 					
     * 
     */
    @XmlEnumValue("Gold")
    GOLD("Gold"),

    /**
     * 
     * 						Platinum (between Gold and Titanium)
     * 					
     * 
     */
    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),

    /**
     * 
     * 						Titanium (highest tier)
     * 					
     * 
     */
    @XmlEnumValue("Titanium")
    TITANIUM("Titanium"),

    /**
     * 
     * 						Deprecated value.
     * 					
     * 
     */
    @XmlEnumValue("Diamond")
    DIAMOND("Diamond"),

    /**
     * 
     * 						Not a PowerSeller (eBay has not yet evaluated your PowerSeller status, or you have not chosen to be a member of the PowerSeller program, or you lost your PowerSeller status due to a policy violation.)
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						eserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapSellerLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapSellerLevelCodeType fromValue(String v) {
        for (SoapSellerLevelCodeType c: SoapSellerLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
