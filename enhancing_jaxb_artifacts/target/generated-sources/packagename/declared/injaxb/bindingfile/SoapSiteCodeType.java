
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="Canada"/&gt;
 *     &lt;enumeration value="UK"/&gt;
 *     &lt;enumeration value="Australia"/&gt;
 *     &lt;enumeration value="Austria"/&gt;
 *     &lt;enumeration value="Belgium_French"/&gt;
 *     &lt;enumeration value="France"/&gt;
 *     &lt;enumeration value="Germany"/&gt;
 *     &lt;enumeration value="Italy"/&gt;
 *     &lt;enumeration value="Belgium_Dutch"/&gt;
 *     &lt;enumeration value="Netherlands"/&gt;
 *     &lt;enumeration value="Spain"/&gt;
 *     &lt;enumeration value="Switzerland"/&gt;
 *     &lt;enumeration value="Taiwan"/&gt;
 *     &lt;enumeration value="eBayMotors"/&gt;
 *     &lt;enumeration value="HongKong"/&gt;
 *     &lt;enumeration value="Singapore"/&gt;
 *     &lt;enumeration value="India"/&gt;
 *     &lt;enumeration value="China"/&gt;
 *     &lt;enumeration value="Ireland"/&gt;
 *     &lt;enumeration value="Malaysia"/&gt;
 *     &lt;enumeration value="Philippines"/&gt;
 *     &lt;enumeration value="Poland"/&gt;
 *     &lt;enumeration value="Sweden"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *     &lt;enumeration value="CanadaFrench"/&gt;
 *     &lt;enumeration value="Russia"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SiteCodeType")
@XmlEnum
public enum SoapSiteCodeType {


    /**
     * 
     * 						USA, site ID 0, abbreviation US, currency USD.
     * 					
     * 
     */
    US("US"),

    /**
     * 
     * 						Canada, site ID 2, abbreviation CA, currencies CAD and USD.
     * 					
     * 
     */
    @XmlEnumValue("Canada")
    CANADA("Canada"),

    /**
     * 
     * 						United Kingdom, site ID 3, abbreviation UK, currency GBP.
     * 					
     * 
     */
    UK("UK"),

    /**
     * 
     * 						Australia, site ID 15, abbreviation AU, currency AUD.
     * 					
     * 
     */
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),

    /**
     * 
     * 						Austria, site ID 16, abbreviation AT, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("Austria")
    AUSTRIA("Austria"),

    /**
     * 
     * 						Belgium (French), site ID 23, abbreviation BEFR, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("Belgium_French")
    BELGIUM_FRENCH("Belgium_French"),

    /**
     * 
     * 						France, site ID 71, abbreviation FR, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("France")
    FRANCE("France"),

    /**
     * 
     * 						Germany, site ID 77, abbreviation DE, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("Germany")
    GERMANY("Germany"),

    /**
     * 
     * 						Italy, site ID 101, abbreviation IT, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("Italy")
    ITALY("Italy"),

    /**
     * 
     * 						Belgium (Dutch), site ID 123, abbreviation BENL, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("Belgium_Dutch")
    BELGIUM_DUTCH("Belgium_Dutch"),

    /**
     * 
     * 						Netherlands, site ID 146, abbreviation NL, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("Netherlands")
    NETHERLANDS("Netherlands"),

    /**
     * 
     * 						Spain, site ID 186, abbreviation ES, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("Spain")
    SPAIN("Spain"),

    /**
     * 
     * 						Switzerland, site ID 193, abbreviation CH, currency CHF.
     * 					
     * 
     */
    @XmlEnumValue("Switzerland")
    SWITZERLAND("Switzerland"),

    /**
     * 
     * 						Taiwan, site ID 196, abbreviation TW, currency TWD.
     * 					
     * 
     */
    @XmlEnumValue("Taiwan")
    TAIWAN("Taiwan"),

    /**
     * 
     * 						eBay Motors, site ID 100, currency USD.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotors")
    E_BAY_MOTORS("eBayMotors"),

    /**
     * 
     * 						Hong Kong, site ID 201, abbreviation HK, currency HKD.
     * 					
     * 
     */
    @XmlEnumValue("HongKong")
    HONG_KONG("HongKong"),

    /**
     * 
     * 						Singapore, site ID 216, abbreviation SG, currency SGD.
     * 					
     * 
     */
    @XmlEnumValue("Singapore")
    SINGAPORE("Singapore"),

    /**
     * 
     * 						India, site ID 203, abbreviation IN, currency INR.
     * 					
     * 
     */
    @XmlEnumValue("India")
    INDIA("India"),

    /**
     * 
     * 						China, site ID 223, abbreviation CN, currency CNY.
     * 					
     * 
     */
    @XmlEnumValue("China")
    CHINA("China"),

    /**
     * 
     * 						Ireland, site ID 205, abbreviation IE, currency EUR.
     * 					
     * 
     */
    @XmlEnumValue("Ireland")
    IRELAND("Ireland"),

    /**
     * 
     * 						Malaysia, site ID 207, abbreviation MY, currency MYR.
     * 					
     * 
     */
    @XmlEnumValue("Malaysia")
    MALAYSIA("Malaysia"),

    /**
     * 
     * 						Philippines, site ID 211, abbreviation PH, currency PHP.
     * 					
     * 
     */
    @XmlEnumValue("Philippines")
    PHILIPPINES("Philippines"),

    /**
     * 
     * 						Poland, site ID 212, abbreviation PL, currency PLN.
     * 					
     * 
     */
    @XmlEnumValue("Poland")
    POLAND("Poland"),

    /**
     * 
     * 						Sweden, site ID 218, abbreviation SE, currency SEK.
     * 					
     * 
     */
    @XmlEnumValue("Sweden")
    SWEDEN("Sweden"),

    /**
     * 
     * 						Placeholder value. See
     * 						<a href="http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/simpleTypes.html#token">token</a>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						CanadaFrench, site ID 210, abbreviation CAFR, currencies CAD and USD.
     * 					
     * 
     */
    @XmlEnumValue("CanadaFrench")
    CANADA_FRENCH("CanadaFrench"),

    /**
     * 
     * 						Russia, site ID 215, abbreviation RU, currency RUB.
     * 					
     * 
     */
    @XmlEnumValue("Russia")
    RUSSIA("Russia");
    private final String value;

    SoapSiteCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapSiteCodeType fromValue(String v) {
        for (SoapSiteCodeType c: SoapSiteCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
