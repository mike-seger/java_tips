
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Positive"/&gt;
 *     &lt;enumeration value="Neutral"/&gt;
 *     &lt;enumeration value="Negative"/&gt;
 *     &lt;enumeration value="Withdrawn"/&gt;
 *     &lt;enumeration value="IndependentlyWithdrawn"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommentTypeCodeType")
@XmlEnum
public enum SoapCommentTypeCodeType {


    /**
     * 
     * 						This value indicates that the submitting user's experience with the other user (receiving feedback) was rated as a 'Positive' experience. If an eBay user receives a Positive rating for an order line item from a Verified User, their overall Feedback score increases by a value of 1.
     * 					
     * 
     */
    @XmlEnumValue("Positive")
    POSITIVE("Positive"),

    /**
     * 
     * 						This value indicates that the submitting user's experience with the other user (receiving feedback) was rated as a 'Neutral' experience. If an eBay user receives a Neutral rating for an order line item from a Verified User, their overall Feedback score remains the same.
     * 					
     * 
     */
    @XmlEnumValue("Neutral")
    NEUTRAL("Neutral"),

    /**
     * 
     * 						This value indicates that the submitting user's experience with the other user (receiving feedback) was rated as a 'Negative' experience. If an eBay user receives a Negative rating for an order line item from a Verified User, their overall Feedback score decreases by a value of 1.
     * 					
     * 
     */
    @XmlEnumValue("Negative")
    NEGATIVE("Negative"),

    /**
     * 
     * 						This value indicates that a submitted Feedback entry was withdrawn. If a Feedback entry is withdrawn, the effect of that entry on the overall Feedback score is nullified. However, Feedback comments from the withdrawn entry are still visible.
     * 					
     * 
     */
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),

    /**
     * 
     * 						This value indicates that a submitted Feedback entry was withdrawn based on the decision of a third-party (such as eBay). If a Feedback entry is withdrawn, the effect of that entry on the overall Feedback score is nullified.
     * 						<br><br>
     * 						This value is only applicable to the eBay Motors site only.
     * 					
     * 
     */
    @XmlEnumValue("IndependentlyWithdrawn")
    INDEPENDENTLY_WITHDRAWN("IndependentlyWithdrawn"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapCommentTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapCommentTypeCodeType fromValue(String v) {
        for (SoapCommentTypeCodeType c: SoapCommentTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
