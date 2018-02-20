
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AF"/&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="DZ"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="AI"/&gt;
 *     &lt;enumeration value="AQ"/&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AW"/&gt;
 *     &lt;enumeration value="AU"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="BH"/&gt;
 *     &lt;enumeration value="BD"/&gt;
 *     &lt;enumeration value="BB"/&gt;
 *     &lt;enumeration value="BY"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BZ"/&gt;
 *     &lt;enumeration value="BJ"/&gt;
 *     &lt;enumeration value="BM"/&gt;
 *     &lt;enumeration value="BT"/&gt;
 *     &lt;enumeration value="BO"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="BW"/&gt;
 *     &lt;enumeration value="BV"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="IO"/&gt;
 *     &lt;enumeration value="BN"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="BF"/&gt;
 *     &lt;enumeration value="BI"/&gt;
 *     &lt;enumeration value="KH"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="KY"/&gt;
 *     &lt;enumeration value="CF"/&gt;
 *     &lt;enumeration value="TD"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CN"/&gt;
 *     &lt;enumeration value="CX"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="KM"/&gt;
 *     &lt;enumeration value="CG"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="CK"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CI"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="DJ"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="DO"/&gt;
 *     &lt;enumeration value="TP"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="EG"/&gt;
 *     &lt;enumeration value="SV"/&gt;
 *     &lt;enumeration value="GQ"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="FK"/&gt;
 *     &lt;enumeration value="FO"/&gt;
 *     &lt;enumeration value="FJ"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="GF"/&gt;
 *     &lt;enumeration value="PF"/&gt;
 *     &lt;enumeration value="TF"/&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="GH"/&gt;
 *     &lt;enumeration value="GI"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="GP"/&gt;
 *     &lt;enumeration value="GU"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GN"/&gt;
 *     &lt;enumeration value="GW"/&gt;
 *     &lt;enumeration value="GY"/&gt;
 *     &lt;enumeration value="HT"/&gt;
 *     &lt;enumeration value="HM"/&gt;
 *     &lt;enumeration value="VA"/&gt;
 *     &lt;enumeration value="HN"/&gt;
 *     &lt;enumeration value="HK"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IR"/&gt;
 *     &lt;enumeration value="IQ"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IL"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="JM"/&gt;
 *     &lt;enumeration value="JP"/&gt;
 *     &lt;enumeration value="JO"/&gt;
 *     &lt;enumeration value="KZ"/&gt;
 *     &lt;enumeration value="KE"/&gt;
 *     &lt;enumeration value="KI"/&gt;
 *     &lt;enumeration value="KP"/&gt;
 *     &lt;enumeration value="KR"/&gt;
 *     &lt;enumeration value="KW"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="LR"/&gt;
 *     &lt;enumeration value="LY"/&gt;
 *     &lt;enumeration value="LI"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="MO"/&gt;
 *     &lt;enumeration value="MK"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="MW"/&gt;
 *     &lt;enumeration value="MY"/&gt;
 *     &lt;enumeration value="MV"/&gt;
 *     &lt;enumeration value="ML"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="MQ"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MU"/&gt;
 *     &lt;enumeration value="YT"/&gt;
 *     &lt;enumeration value="MX"/&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="MC"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="MZ"/&gt;
 *     &lt;enumeration value="MM"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NR"/&gt;
 *     &lt;enumeration value="NP"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="NC"/&gt;
 *     &lt;enumeration value="NZ"/&gt;
 *     &lt;enumeration value="NI"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NG"/&gt;
 *     &lt;enumeration value="NU"/&gt;
 *     &lt;enumeration value="NF"/&gt;
 *     &lt;enumeration value="MP"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="OM"/&gt;
 *     &lt;enumeration value="PK"/&gt;
 *     &lt;enumeration value="PW"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PG"/&gt;
 *     &lt;enumeration value="PY"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="PH"/&gt;
 *     &lt;enumeration value="PN"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="QA"/&gt;
 *     &lt;enumeration value="RE"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="KN"/&gt;
 *     &lt;enumeration value="LC"/&gt;
 *     &lt;enumeration value="PM"/&gt;
 *     &lt;enumeration value="VC"/&gt;
 *     &lt;enumeration value="WS"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="SB"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="ZA"/&gt;
 *     &lt;enumeration value="GS"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="LK"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="SJ"/&gt;
 *     &lt;enumeration value="SZ"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="SY"/&gt;
 *     &lt;enumeration value="TW"/&gt;
 *     &lt;enumeration value="TJ"/&gt;
 *     &lt;enumeration value="TZ"/&gt;
 *     &lt;enumeration value="TH"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TK"/&gt;
 *     &lt;enumeration value="TO"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="TN"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="TM"/&gt;
 *     &lt;enumeration value="TC"/&gt;
 *     &lt;enumeration value="TV"/&gt;
 *     &lt;enumeration value="UG"/&gt;
 *     &lt;enumeration value="UA"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="GB"/&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="UM"/&gt;
 *     &lt;enumeration value="UY"/&gt;
 *     &lt;enumeration value="UZ"/&gt;
 *     &lt;enumeration value="VU"/&gt;
 *     &lt;enumeration value="VE"/&gt;
 *     &lt;enumeration value="VN"/&gt;
 *     &lt;enumeration value="VG"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="WF"/&gt;
 *     &lt;enumeration value="EH"/&gt;
 *     &lt;enumeration value="YE"/&gt;
 *     &lt;enumeration value="YU"/&gt;
 *     &lt;enumeration value="ZM"/&gt;
 *     &lt;enumeration value="ZW"/&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="QM"/&gt;
 *     &lt;enumeration value="QN"/&gt;
 *     &lt;enumeration value="QO"/&gt;
 *     &lt;enumeration value="QP"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryCodeType")
@XmlEnum
public enum SoapCountryCodeType {


    /**
     * 
     * 						Afghanistan.
     * 					
     * 
     */
    AF("AF"),

    /**
     * 
     * 						Albania.
     * 					
     * 
     */
    AL("AL"),

    /**
     * 
     * 						Algeria.
     * 					
     * 
     */
    DZ("DZ"),

    /**
     * 
     * 						American Samoa.
     * 					
     * 
     */
    AS("AS"),

    /**
     * 
     * 						Andorra.
     * 					
     * 
     */
    AD("AD"),

    /**
     * 
     * 						Angola.
     * 					
     * 
     */
    AO("AO"),

    /**
     * 
     * 						Anguilla.
     * 					
     * 
     */
    AI("AI"),

    /**
     * 
     * 						Antarctica.
     * 					
     * 
     */
    AQ("AQ"),

    /**
     * 
     * 						Antigua and Barbuda.
     * 					
     * 
     */
    AG("AG"),

    /**
     * 
     * 						Argentina.
     * 					
     * 
     */
    AR("AR"),

    /**
     * 
     * 						Armenia.
     * 					
     * 
     */
    AM("AM"),

    /**
     * 
     * 						Aruba.
     * 					
     * 
     */
    AW("AW"),

    /**
     * 
     * 						Australia.
     * 					
     * 
     */
    AU("AU"),

    /**
     * 
     * 						Austria.
     * 					
     * 
     */
    AT("AT"),

    /**
     * 
     * 						Azerbaijan.
     * 					
     * 
     */
    AZ("AZ"),

    /**
     * 
     * 						Bahamas.
     * 					
     * 
     */
    BS("BS"),

    /**
     * 
     * 						Bahrain.
     * 					
     * 
     */
    BH("BH"),

    /**
     * 
     * 						Bangladesh.
     * 					
     * 
     */
    BD("BD"),

    /**
     * 
     * 						Barbados.
     * 					
     * 
     */
    BB("BB"),

    /**
     * 
     * 						Belarus.
     * 					
     * 
     */
    BY("BY"),

    /**
     * 
     * 						Belgium.
     * 					
     * 
     */
    BE("BE"),

    /**
     * 
     * 						Belize.
     * 					
     * 
     */
    BZ("BZ"),

    /**
     * 
     * 						Benin.
     * 					
     * 
     */
    BJ("BJ"),

    /**
     * 
     * 						Bermuda.
     * 					
     * 
     */
    BM("BM"),

    /**
     * 
     * 						Bhutan.
     * 					
     * 
     */
    BT("BT"),

    /**
     * 
     * 						Bolivia.
     * 					
     * 
     */
    BO("BO"),

    /**
     * 
     * 						Bosnia and Herzegovina.
     * 					
     * 
     */
    BA("BA"),

    /**
     * 
     * 						Botswana.
     * 					
     * 
     */
    BW("BW"),

    /**
     * 
     * 						Bouvet Island.
     * 					
     * 
     */
    BV("BV"),

    /**
     * 
     * 						Brazil.
     * 					
     * 
     */
    BR("BR"),

    /**
     * 
     * 						British Indian Ocean Territory.
     * 					
     * 
     */
    IO("IO"),

    /**
     * 
     * 						Brunei Darussalam.
     * 					
     * 
     */
    BN("BN"),

    /**
     * 
     * 						Bulgaria.
     * 					
     * 
     */
    BG("BG"),

    /**
     * 
     * 						Burkina Faso.
     * 					
     * 
     */
    BF("BF"),

    /**
     * 
     * 						Burundi.
     * 					
     * 
     */
    BI("BI"),

    /**
     * 
     * 						Cambodia.
     * 					
     * 
     */
    KH("KH"),

    /**
     * 
     * 						Cameroon.
     * 					
     * 
     */
    CM("CM"),

    /**
     * 
     * 						Canada.
     * 					
     * 
     */
    CA("CA"),

    /**
     * 
     * 						Cape Verde.
     * 					
     * 
     */
    CV("CV"),

    /**
     * 
     * 						Cayman Islands.
     * 					
     * 
     */
    KY("KY"),

    /**
     * 
     * 						Central African Republic.
     * 					
     * 
     */
    CF("CF"),

    /**
     * 
     * 						Chad.
     * 					
     * 
     */
    TD("TD"),

    /**
     * 
     * 						Chile.
     * 					
     * 
     */
    CL("CL"),

    /**
     * 
     * 						China.
     * 					
     * 
     */
    CN("CN"),

    /**
     * 
     * 						Christmas Island.
     * 					
     * 
     */
    CX("CX"),

    /**
     * 
     * 						Cocos (Keeling) Islands.
     * 					
     * 
     */
    CC("CC"),

    /**
     * 
     * 						Colombia.
     * 					
     * 
     */
    CO("CO"),

    /**
     * 
     * 						Comoros.
     * 					
     * 
     */
    KM("KM"),

    /**
     * 
     * 						Congo.
     * 					
     * 
     */
    CG("CG"),

    /**
     * 
     * 						The Democratic Republic of the Congo.
     * 					
     * 
     */
    CD("CD"),

    /**
     * 
     * 						Cook Islands.
     * 					
     * 
     */
    CK("CK"),

    /**
     * 
     * 						Costa Rica.
     * 					
     * 
     */
    CR("CR"),

    /**
     * 
     * 						Cote d'Ivoire.
     * 					
     * 
     */
    CI("CI"),

    /**
     * 
     * 						Croatia.
     * 					
     * 
     */
    HR("HR"),

    /**
     * 
     * 						Cuba.
     * 					
     * 
     */
    CU("CU"),

    /**
     * 
     * 						Cyprus.
     * 					
     * 
     */
    CY("CY"),

    /**
     * 
     * 						Czech Republic.
     * 					
     * 
     */
    CZ("CZ"),

    /**
     * 
     * 						Denmark.
     * 					
     * 
     */
    DK("DK"),

    /**
     * 
     * 						Djibouti.
     * 					
     * 
     */
    DJ("DJ"),

    /**
     * 
     * 						Dominica.
     * 					
     * 
     */
    DM("DM"),

    /**
     * 
     * 						Dominican Republic.
     * 					
     * 
     */
    DO("DO"),

    /**
     * 
     * 						No longer in use.
     * 					
     * 
     */
    TP("TP"),

    /**
     * 
     * 						Ecuador.
     * 					
     * 
     */
    EC("EC"),

    /**
     * 
     * 						Egypt.
     * 					
     * 
     */
    EG("EG"),

    /**
     * 
     * 						El Salvador.
     * 					
     * 
     */
    SV("SV"),

    /**
     * 
     * 						Equatorial Guinea.
     * 					
     * 
     */
    GQ("GQ"),

    /**
     * 
     * 						Eritrea.
     * 					
     * 
     */
    ER("ER"),

    /**
     * 
     * 						Estonia.
     * 					
     * 
     */
    EE("EE"),

    /**
     * 
     * 						Ethiopia.
     * 					
     * 
     */
    ET("ET"),

    /**
     * 
     * 						Falkland Islands (Malvinas).
     * 					
     * 
     */
    FK("FK"),

    /**
     * 
     * 						Faroe Islands.
     * 					
     * 
     */
    FO("FO"),

    /**
     * 
     * 						Fiji.
     * 					
     * 
     */
    FJ("FJ"),

    /**
     * 
     * 						Finland.
     * 					
     * 
     */
    FI("FI"),

    /**
     * 
     * 						France.
     * 					
     * 
     */
    FR("FR"),

    /**
     * 
     * 						French Guiana.
     * 					
     * 
     */
    GF("GF"),

    /**
     * 
     * 						French Polynesia. Includes Tahiti.
     * 					
     * 
     */
    PF("PF"),

    /**
     * 
     * 						French Southern Territories.
     * 					
     * 
     */
    TF("TF"),

    /**
     * 
     * 						Gabon.
     * 					
     * 
     */
    GA("GA"),

    /**
     * 
     * 						Gambia.
     * 					
     * 
     */
    GM("GM"),

    /**
     * 
     * 						Georgia.
     * 					
     * 
     */
    GE("GE"),

    /**
     * 
     * 						Germany.
     * 					
     * 
     */
    DE("DE"),

    /**
     * 
     * 						Ghana.
     * 					
     * 
     */
    GH("GH"),

    /**
     * 
     * 						Gibraltar.
     * 					
     * 
     */
    GI("GI"),

    /**
     * 
     * 						Greece.
     * 					
     * 
     */
    GR("GR"),

    /**
     * 
     * 						Greenland.
     * 					
     * 
     */
    GL("GL"),

    /**
     * 
     * 						Grenada.
     * 					
     * 
     */
    GD("GD"),

    /**
     * 
     * 						Guadeloupe.
     * 					
     * 
     */
    GP("GP"),

    /**
     * 
     * 						Guam.
     * 					
     * 
     */
    GU("GU"),

    /**
     * 
     * 						Guatemala.
     * 					
     * 
     */
    GT("GT"),

    /**
     * 
     * 						Guinea.
     * 					
     * 
     */
    GN("GN"),

    /**
     * 
     * 						Guinea-Bissau.
     * 					
     * 
     */
    GW("GW"),

    /**
     * 
     * 						Guyana.
     * 					
     * 
     */
    GY("GY"),

    /**
     * 
     * 						Haiti.
     * 					
     * 
     */
    HT("HT"),

    /**
     * 
     * 						Heard Island and McDonald Islands.
     * 					
     * 
     */
    HM("HM"),

    /**
     * 
     * 						Holy See (Vatican City state).
     * 					
     * 
     */
    VA("VA"),

    /**
     * 
     * 						Honduras.
     * 					
     * 
     */
    HN("HN"),

    /**
     * 
     * 						Hong Kong.
     * 					
     * 
     */
    HK("HK"),

    /**
     * 
     * 						Hungary.
     * 					
     * 
     */
    HU("HU"),

    /**
     * 
     * 						Iceland.
     * 					
     * 
     */
    IS("IS"),

    /**
     * 
     * 						India.
     * 					
     * 
     */
    IN("IN"),

    /**
     * 
     * 						Indonesia.
     * 					
     * 
     */
    ID("ID"),

    /**
     * 
     * 						Islamic Republic of Iran.
     * 					
     * 
     */
    IR("IR"),

    /**
     * 
     * 						Iraq.
     * 					
     * 
     */
    IQ("IQ"),

    /**
     * 
     * 						Ireland.
     * 					
     * 
     */
    IE("IE"),

    /**
     * 
     * 						Israel.
     * 					
     * 
     */
    IL("IL"),

    /**
     * 
     * 						Italy.
     * 					
     * 
     */
    IT("IT"),

    /**
     * 
     * 						Jamaica.
     * 					
     * 
     */
    JM("JM"),

    /**
     * 
     * 						Japan.
     * 					
     * 
     */
    JP("JP"),

    /**
     * 
     * 						Jordan.
     * 					
     * 
     */
    JO("JO"),

    /**
     * 
     * 						Kazakhstan.
     * 					
     * 
     */
    KZ("KZ"),

    /**
     * 
     * 						Kenya.
     * 					
     * 
     */
    KE("KE"),

    /**
     * 
     * 						Kiribati.
     * 					
     * 
     */
    KI("KI"),

    /**
     * 
     * 						Democratic People's Republic of Korea.
     * 					
     * 
     */
    KP("KP"),

    /**
     * 
     * 						Republic of Korea.
     * 					
     * 
     */
    KR("KR"),

    /**
     * 
     * 						Kuwait.
     * 					
     * 
     */
    KW("KW"),

    /**
     * 
     * 						Kyrgyzstan.
     * 					
     * 
     */
    KG("KG"),

    /**
     * 
     * 						Lao People's Democratic Republic.
     * 					
     * 
     */
    LA("LA"),

    /**
     * 
     * 						Latvia.
     * 					
     * 
     */
    LV("LV"),

    /**
     * 
     * 						Lebanon.
     * 					
     * 
     */
    LB("LB"),

    /**
     * 
     * 						Lesotho.
     * 					
     * 
     */
    LS("LS"),

    /**
     * 
     * 						Liberia.
     * 					
     * 
     */
    LR("LR"),

    /**
     * 
     * 						Libyan Arab Jamahiriya.
     * 					
     * 
     */
    LY("LY"),

    /**
     * 
     * 						Liechtenstein.
     * 					
     * 
     */
    LI("LI"),

    /**
     * 
     * 						Lithuania.
     * 					
     * 
     */
    LT("LT"),

    /**
     * 
     * 						Luxembourg.
     * 					
     * 
     */
    LU("LU"),

    /**
     * 
     * 						Macao.
     * 					
     * 
     */
    MO("MO"),

    /**
     * 
     * 						The Former Yugoslav Republic of Macedonia.
     * 					
     * 
     */
    MK("MK"),

    /**
     * 
     * 						Madagascar.
     * 					
     * 
     */
    MG("MG"),

    /**
     * 
     * 						Malawi.
     * 					
     * 
     */
    MW("MW"),

    /**
     * 
     * 						Malaysia.
     * 					
     * 
     */
    MY("MY"),

    /**
     * 
     * 						Maldives.
     * 					
     * 
     */
    MV("MV"),

    /**
     * 
     * 						Mali.
     * 					
     * 
     */
    ML("ML"),

    /**
     * 
     * 						Malta.
     * 					
     * 
     */
    MT("MT"),

    /**
     * 
     * 						Marshall Islands.
     * 					
     * 
     */
    MH("MH"),

    /**
     * 
     * 						Martinique.
     * 					
     * 
     */
    MQ("MQ"),

    /**
     * 
     * 						Mauritania.
     * 					
     * 
     */
    MR("MR"),

    /**
     * 
     * 						Mauritius.
     * 					
     * 
     */
    MU("MU"),

    /**
     * 
     * 						Mayotte.
     * 					
     * 
     */
    YT("YT"),

    /**
     * 
     * 						Mexico.
     * 					
     * 
     */
    MX("MX"),

    /**
     * 
     * 						Federated States of Micronesia.
     * 					
     * 
     */
    FM("FM"),

    /**
     * 
     * 						Republic of Moldova.
     * 					
     * 
     */
    MD("MD"),

    /**
     * 
     * 						Monaco.
     * 					
     * 
     */
    MC("MC"),

    /**
     * 
     * 						Mongolia.
     * 					
     * 
     */
    MN("MN"),

    /**
     * 
     * 						Montserrat.
     * 					
     * 
     */
    MS("MS"),

    /**
     * 
     * 						Morocco.
     * 					
     * 
     */
    MA("MA"),

    /**
     * 
     * 						Mozambique.
     * 					
     * 
     */
    MZ("MZ"),

    /**
     * 
     * 						Myanmar.
     * 					
     * 
     */
    MM("MM"),

    /**
     * 
     * 						Namibia.
     * 					
     * 
     */
    NA("NA"),

    /**
     * 
     * 						Nauru.
     * 					
     * 
     */
    NR("NR"),

    /**
     * 
     * 						Nepal.
     * 					
     * 
     */
    NP("NP"),

    /**
     * 
     * 						Netherlands.
     * 					
     * 
     */
    NL("NL"),

    /**
     * 
     * 						Netherlands Antilles.
     * 					
     * 
     */
    AN("AN"),

    /**
     * 
     * 						New Caledonia.
     * 					
     * 
     */
    NC("NC"),

    /**
     * 
     * 						New Zealand.
     * 					
     * 
     */
    NZ("NZ"),

    /**
     * 
     * 						Nicaragua.
     * 					
     * 
     */
    NI("NI"),

    /**
     * 
     * 						Niger.
     * 					
     * 
     */
    NE("NE"),

    /**
     * 
     * 						Nigeria.
     * 					
     * 
     */
    NG("NG"),

    /**
     * 
     * 						Niue.
     * 					
     * 
     */
    NU("NU"),

    /**
     * 
     * 						Norfolk Island.
     * 					
     * 
     */
    NF("NF"),

    /**
     * 
     * 						Northern Mariana Islands.
     * 					
     * 
     */
    MP("MP"),

    /**
     * 
     * 						Norway.
     * 					
     * 
     */
    NO("NO"),

    /**
     * 
     * 						Oman.
     * 					
     * 
     */
    OM("OM"),

    /**
     * 
     * 						Pakistan.
     * 					
     * 
     */
    PK("PK"),

    /**
     * 
     * 						Palau.
     * 					
     * 
     */
    PW("PW"),

    /**
     * 
     * 						Palestinian territory, Occupied.
     * 					
     * 
     */
    PS("PS"),

    /**
     * 
     * 						Panama.
     * 					
     * 
     */
    PA("PA"),

    /**
     * 
     * 						Papua New Guinea.
     * 					
     * 
     */
    PG("PG"),

    /**
     * 
     * 						Paraguay.
     * 					
     * 
     */
    PY("PY"),

    /**
     * 
     * 						Peru.
     * 					
     * 
     */
    PE("PE"),

    /**
     * 
     * 						Philippines.
     * 					
     * 
     */
    PH("PH"),

    /**
     * 
     * 						Pitcairn.
     * 					
     * 
     */
    PN("PN"),

    /**
     * 
     * 						Poland.
     * 					
     * 
     */
    PL("PL"),

    /**
     * 
     * 						Portugal.
     * 					
     * 
     */
    PT("PT"),

    /**
     * 
     * 						Puerto Rico.
     * 					
     * 
     */
    PR("PR"),

    /**
     * 
     * 						Qatar.
     * 					
     * 
     */
    QA("QA"),

    /**
     * 
     * 						Reunion.
     * 					
     * 
     */
    RE("RE"),

    /**
     * 
     * 						Romania.
     * 					
     * 
     */
    RO("RO"),

    /**
     * 
     * 						Russian Federation.
     * 					
     * 
     */
    RU("RU"),

    /**
     * 
     * 						Rwanda.
     * 					
     * 
     */
    RW("RW"),

    /**
     * 
     * 						Saint Helena.
     * 					
     * 
     */
    SH("SH"),

    /**
     * 
     * 						Saint Kitts and Nevis.
     * 					
     * 
     */
    KN("KN"),

    /**
     * 
     * 						Saint Lucia.
     * 					
     * 
     */
    LC("LC"),

    /**
     * 
     * 						Saint Pierre and Miquelon.
     * 					
     * 
     */
    PM("PM"),

    /**
     * 
     * 						Saint Vincent and the Grenadines.
     * 					
     * 
     */
    VC("VC"),

    /**
     * 
     * 						Samoa.
     * 					
     * 
     */
    WS("WS"),

    /**
     * 
     * 						San Marino.
     * 					
     * 
     */
    SM("SM"),

    /**
     * 
     * 						Sao Tome and Principe.
     * 					
     * 
     */
    ST("ST"),

    /**
     * 
     * 						Saudi Arabia.
     * 					
     * 
     */
    SA("SA"),

    /**
     * 
     * 						Senegal.
     * 					
     * 
     */
    SN("SN"),

    /**
     * 
     * 						Seychelles.
     * 					
     * 
     */
    SC("SC"),

    /**
     * 
     * 						Sierra Leone.
     * 					
     * 
     */
    SL("SL"),

    /**
     * 
     * 						Singapore.
     * 					
     * 
     */
    SG("SG"),

    /**
     * 
     * 						Slovakia.
     * 					
     * 
     */
    SK("SK"),

    /**
     * 
     * 						Slovenia.
     * 					
     * 
     */
    SI("SI"),

    /**
     * 
     * 						Solomon Islands.
     * 					
     * 
     */
    SB("SB"),

    /**
     * 
     * 					Somalia.
     * 				
     * 
     */
    SO("SO"),

    /**
     * 
     * 					South Africa.
     * 				
     * 
     */
    ZA("ZA"),

    /**
     * 
     * 					South Georgia and the South Sandwich Islands.
     * 				
     * 
     */
    GS("GS"),

    /**
     * 
     * 					Spain.
     * 				
     * 
     */
    ES("ES"),

    /**
     * 
     * 					Sri Lanka.
     * 				
     * 
     */
    LK("LK"),

    /**
     * 
     * 					Sudan.
     * 				
     * 
     */
    SD("SD"),

    /**
     * 
     * 					Suriname.
     * 				
     * 
     */
    SR("SR"),

    /**
     * 
     * 						Svalbard and Jan Mayen.
     * 					
     * 
     */
    SJ("SJ"),

    /**
     * 
     * 						Swaziland.
     * 					
     * 
     */
    SZ("SZ"),

    /**
     * 
     * 						Sweden.
     * 					
     * 
     */
    SE("SE"),

    /**
     * 
     * 						Switzerland.
     * 					
     * 
     */
    CH("CH"),

    /**
     * 
     * 						Syrian Arab Republic.
     * 					
     * 
     */
    SY("SY"),

    /**
     * 
     * 						Taiwan, Province of China.
     * 					
     * 
     */
    TW("TW"),

    /**
     * 
     * 						Tajikistan.
     * 					
     * 
     */
    TJ("TJ"),

    /**
     * 
     * 						Tanzania, United Republic of.
     * 					
     * 
     */
    TZ("TZ"),

    /**
     * 
     * 						Thailand.
     * 					
     * 
     */
    TH("TH"),

    /**
     * 
     * 						Togo.
     * 					
     * 
     */
    TG("TG"),

    /**
     * 
     * 						Tokelau.
     * 					
     * 
     */
    TK("TK"),

    /**
     * 
     * 						Tonga.
     * 					
     * 
     */
    TO("TO"),

    /**
     * 
     * 						Trinidad and Tobago.
     * 					
     * 
     */
    TT("TT"),

    /**
     * 
     * 						Tunisia.
     * 					
     * 
     */
    TN("TN"),

    /**
     * 
     * 						Turkey.
     * 					
     * 
     */
    TR("TR"),

    /**
     * 
     * 						Turkmenistan.
     * 					
     * 
     */
    TM("TM"),

    /**
     * 
     * 						Turks and Caicos Islands.
     * 					
     * 
     */
    TC("TC"),

    /**
     * 
     * 						Tuvalu.
     * 					
     * 
     */
    TV("TV"),

    /**
     * 
     * 						Uganda.
     * 					
     * 
     */
    UG("UG"),

    /**
     * 
     * 						Ukraine.
     * 					
     * 
     */
    UA("UA"),

    /**
     * 
     * 						United Arab Emirates.
     * 					
     * 
     */
    AE("AE"),

    /**
     * 
     * 						United Kingdom.
     * 					
     * 
     */
    GB("GB"),

    /**
     * 
     * 						United States.
     * 					
     * 
     */
    US("US"),

    /**
     * 
     * 						NOTE: United States Minor Outlying Islands was
     * 						defined in the eBay list previously
     * 						but is no longer a viable option. This country
     * 						will remain on eBay country list for backward
     * 						compatibility. Use 'US' instead.
     * 					
     * 
     */
    UM("UM"),

    /**
     * 
     * 						Uruguay.
     * 					
     * 
     */
    UY("UY"),

    /**
     * 
     * 						Uzbekistan.
     * 					
     * 
     */
    UZ("UZ"),

    /**
     * 
     * 						Vanuatu.
     * 					
     * 
     */
    VU("VU"),

    /**
     * 
     * 						Venezuela.
     * 					
     * 
     */
    VE("VE"),

    /**
     * 
     * 						Vietnam.
     * 					
     * 
     */
    VN("VN"),

    /**
     * 
     * 						Virgin Islands, British.
     * 					
     * 
     */
    VG("VG"),

    /**
     * 
     * 						Virgin Islands, U.S.
     * 					
     * 
     */
    VI("VI"),

    /**
     * 
     * 						Wallis and Futuna.
     * 					
     * 
     */
    WF("WF"),

    /**
     * 
     * 						Western Sahara.
     * 					
     * 
     */
    EH("EH"),

    /**
     * 
     * 						Yemen.
     * 					
     * 
     */
    YE("YE"),

    /**
     * 
     * 						No longer in use. See RS for Serbia and ME for Montenegro.
     * 					
     * 
     */
    YU("YU"),

    /**
     * 
     * 						Zambia.
     * 					
     * 
     */
    ZM("ZM"),

    /**
     * 
     * 						Zimbabwe.
     * 					
     * 
     */
    ZW("ZW"),

    /**
     * 
     * 						NOTE: APO/FPO was defined in eBay list previously
     * 						but they are not defined in ISO 3166. This country
     * 						will remain on eBay country code list for backward
     * 						compatibility.
     * 				 
     * 
     */
    AA("AA"),

    /**
     * 
     * 							NOTE: Guernsey was defined in eBay list previously
     * 							but they are not defined in ISO 3166. This country
     * 							will remain on eBay country list for backward
     * 							compatibility.
     * 					 
     * 
     */
    QM("QM"),

    /**
     * 
     * 						 NOTE: Jan Mayen was defined in eBay list previously
     * 						 but they are not defined in ISO 3166. This country
     * 						 will remain on eBay country list for backward
     * 						 compatibility.
     * 				 
     * 
     */
    QN("QN"),

    /**
     * 
     * 						 NOTE: Jersey was defined in eBay list previously
     * 						 but they are not defined in ISO 3166. This country
     * 						 will remain on eBay country list for backward
     * 						 compatibility.
     * 					 
     * 
     */
    QO("QO"),
    QP("QP"),

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

    SoapCountryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapCountryCodeType fromValue(String v) {
        for (SoapCountryCodeType c: SoapCountryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
