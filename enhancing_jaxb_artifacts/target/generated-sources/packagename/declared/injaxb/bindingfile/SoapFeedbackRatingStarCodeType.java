
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackRatingStarCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackRatingStarCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Yellow"/&gt;
 *     &lt;enumeration value="Blue"/&gt;
 *     &lt;enumeration value="Turquoise"/&gt;
 *     &lt;enumeration value="Purple"/&gt;
 *     &lt;enumeration value="Red"/&gt;
 *     &lt;enumeration value="Green"/&gt;
 *     &lt;enumeration value="YellowShooting"/&gt;
 *     &lt;enumeration value="TurquoiseShooting"/&gt;
 *     &lt;enumeration value="PurpleShooting"/&gt;
 *     &lt;enumeration value="RedShooting"/&gt;
 *     &lt;enumeration value="GreenShooting"/&gt;
 *     &lt;enumeration value="SilverShooting"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeedbackRatingStarCodeType")
@XmlEnum
public enum SoapFeedbackRatingStarCodeType {


    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 0-9. There is no Feedback Rating Star associated with this score range.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 10-49.
     * 						A Yellow Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 50-99.
     * 						A Blue Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("Blue")
    BLUE("Blue"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 100-499.
     * 						A Turquoise Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("Turquoise")
    TURQUOISE("Turquoise"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 500-999.
     * 						A Purple Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("Purple")
    PURPLE("Purple"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 1000-4999. A Red Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("Red")
    RED("Red"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 5000-9999. A Green Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("Green")
    GREEN("Green"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 10000-24999. A Yellow Shooting Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("YellowShooting")
    YELLOW_SHOOTING("YellowShooting"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 25000-49999. A Turquoise Shooting Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("TurquoiseShooting")
    TURQUOISE_SHOOTING("TurquoiseShooting"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 50000-99999. A Purple Shooting Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("PurpleShooting")
    PURPLE_SHOOTING("PurpleShooting"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 100000-499999. A Red Shooting Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("RedShooting")
    RED_SHOOTING("RedShooting"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score ranging from 500000-90000. A Green Shooting Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("GreenShooting")
    GREEN_SHOOTING("GreenShooting"),

    /**
     * 
     * 						This value indicates that the user has a Feedback score of 1000000 or above. A Silver Shooting Feedback Rating Star is used with this score range.
     * 					
     * 
     */
    @XmlEnumValue("SilverShooting")
    SILVER_SHOOTING("SilverShooting"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapFeedbackRatingStarCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapFeedbackRatingStarCodeType fromValue(String v) {
        for (SoapFeedbackRatingStarCodeType c: SoapFeedbackRatingStarCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
