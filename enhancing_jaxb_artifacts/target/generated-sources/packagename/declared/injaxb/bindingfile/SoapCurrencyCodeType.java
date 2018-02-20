
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AFA"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="ADP"/&gt;
 *     &lt;enumeration value="AOA"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="AZM"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BYR"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="BOV"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BAM"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BGL"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="CDF"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="TPE"/&gt;
 *     &lt;enumeration value="ECV"/&gt;
 *     &lt;enumeration value="ECS"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="ERN"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GEL"/&gt;
 *     &lt;enumeration value="GHC"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GWP"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KGS"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MGF"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MTL"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MXV"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="MZM"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="XPF"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="RUR"/&gt;
 *     &lt;enumeration value="RWF"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="SDD"/&gt;
 *     &lt;enumeration value="SRG"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TJS"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="TMM"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="USS"/&gt;
 *     &lt;enumeration value="USN"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="UZS"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="VEB"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="YUM"/&gt;
 *     &lt;enumeration value="ZMK"/&gt;
 *     &lt;enumeration value="ZWD"/&gt;
 *     &lt;enumeration value="ATS"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeType")
@XmlEnum
public enum SoapCurrencyCodeType {


    /**
     * 
     * 						This value is a 3-digit code for an Afghan afghani, a currency used in Afghanistan.
     * 					
     * 
     */
    AFA("AFA"),

    /**
     * 
     * 						This value is a 3-digit code for an Albanian lek, a currency used in Albania.
     * 					
     * 
     */
    ALL("ALL"),

    /**
     * 
     * 						This value is a 3-digit code for an Algerian dinar, a currency used in Algeria.
     * 					
     * 
     */
    DZD("DZD"),

    /**
     * 
     * 						This value is a 3-digit code for an Andorran peseta, a currency used in Andorra.
     * 					
     * 
     */
    ADP("ADP"),

    /**
     * 
     * 						This value is a 3-digit code for an Angolan kwanza, a currency used in Angola.
     * 					
     * 
     */
    AOA("AOA"),

    /**
     * 
     * 						This value is a 3-digit code for an Argentine peso, a currency used in Argentina.
     * 					
     * 
     */
    ARS("ARS"),

    /**
     * 
     * 						This value is a 3-digit code for an Armenian dram, a currency used in Armenia.
     * 					
     * 
     */
    AMD("AMD"),

    /**
     * 
     * 						This value is a 3-digit code for an Aruban florin, a currency used in Aruba.
     * 					
     * 
     */
    AWG("AWG"),

    /**
     * 
     * 						This value is a 3-digit code for an Azerbaijani manat, a currency used in Azerbaijan.
     * 					
     * 
     */
    AZM("AZM"),

    /**
     * 
     * 						This value is a 3-digit code for a Bahamian dollar, a currency used in the Bahamas.
     * 					
     * 
     */
    BSD("BSD"),

    /**
     * 
     * 						This value is a 3-digit code for a Bahraini dinar, a currency used in the Bahrain.
     * 					
     * 
     */
    BHD("BHD"),

    /**
     * 
     * 						This value is a 3-digit code for a Bangladeshi taka, a currency used in Bangladesh.
     * 					
     * 
     */
    BDT("BDT"),

    /**
     * 
     * 						This value is a 3-digit code for a Barbados dollar, a currency used in Barbados.
     * 					
     * 
     */
    BBD("BBD"),

    /**
     * 
     * 						This value is a 3-digit code for a Belarusian ruble, a currency used in Belarus.
     * 					
     * 
     */
    BYR("BYR"),

    /**
     * 
     * 						This value is a 3-digit code for a Belize dollar, a currency used in Belize.
     * 					
     * 
     */
    BZD("BZD"),

    /**
     * 
     * 						This value is a 3-digit code for a Bermudian dollar, a currency used in Bermuda.
     * 					
     * 
     */
    BMD("BMD"),

    /**
     * 
     * 						This value is a 3-digit code for a Bhutanese ngultrum, a currency used in Bhutan.
     * 					
     * 
     */
    BTN("BTN"),

    /**
     * 
     * 					This value is a 3-digit code for an Indian rupee, a currency used in India. This is
     * 					the value that should be passed in the <b>Item.Currency</b> field by the
     * 					seller when listing an item on the eBay India site (Site ID 203).
     * 					
     * 
     */
    INR("INR"),

    /**
     * 
     * 						This value is a 3-digit code for a Bolivian Mvdol, a currency used in Bolivia.
     * 					
     * 
     */
    BOV("BOV"),

    /**
     * 
     * 						This value is a 3-digit code for a Boliviano, a currency used in Bolivia.
     * 					
     * 
     */
    BOB("BOB"),

    /**
     * 
     * 						This value is a 3-digit code for a Bosnia and Herzegovina convertible mark, a
     * 						currency used in Bosnia and Herzegovina.
     * 					
     * 
     */
    BAM("BAM"),

    /**
     * 
     * 						This value is a 3-digit code for a Botswana pula, a currency used in Botswana.
     * 					
     * 
     */
    BWP("BWP"),

    /**
     * 
     * 						This value is a 3-digit code for a Brazilian real, a currency used in Brazil.
     * 					
     * 
     */
    BRL("BRL"),

    /**
     * 
     * 						This value is a 3-digit code for a Brunei dollar, a currency used in Brunei and
     * 						Singapore.
     * 					
     * 
     */
    BND("BND"),

    /**
     * 
     * 						This value is a 3-digit code for the old Bulgarian lev, a currency previously used
     * 						in Bulgaria. This currency has been replaced by the new Bulgarian lev (3-digit
     * 						code: BGN).
     * 					
     * 
     */
    BGL("BGL"),

    /**
     * 
     * 						This value is a 3-digit code for a Bulgarian lev, a currency used in Bulgaria. This
     * 						currency replaced the old Bulgarian lev (3-digit code: BGL).
     * 					
     * 
     */
    BGN("BGN"),

    /**
     * 
     * 						This value is a 3-digit code for a Burundian franc, a currency used in Burundi.
     * 					
     * 
     */
    BIF("BIF"),

    /**
     * 
     * 						This value is a 3-digit code for a Cambodian riel, a currency used in Cambodia.
     * 					
     * 
     */
    KHR("KHR"),

    /**
     * 
     * 					This value is a 3-digit code for a Canadian dollar, a currency used in Canada. This is
     * 					the value that should be passed in the <b>Item.Currency</b> field by the
     * 					seller when listing an item on the eBay Canada site (Site ID 2). Note that items
     * 					listed on the Canada site can also specify 'USD'.
     * 					
     * 
     */
    CAD("CAD"),

    /**
     * 
     * 						This value is a 3-digit code for a Cape Verde escudo, a currency used in Cape
     * 						Verde.
     * 					
     * 
     */
    CVE("CVE"),

    /**
     * 
     * 						This value is a 3-digit code for a Cayman Islands dollar, a currency used in
     * 						the Cayman Islands.
     * 					
     * 
     */
    KYD("KYD"),

    /**
     * 
     * 						This value is a 3-digit code for a Central African CFA franc, a currency used in
     * 						Cameroon, Central African Republic, Republic of the Congo, Chad, Equatorial
     * 						Guinea, and Gabon.
     * 					
     * 
     */
    XAF("XAF"),

    /**
     * 
     * 						This value is a 3-digit code for a Unidad de Fomento, a currency used in Chile.
     * 					
     * 
     */
    CLF("CLF"),

    /**
     * 
     * 						This value is a 3-digit code for a Chilean peso, a currency used in Chile.
     * 					
     * 
     */
    CLP("CLP"),

    /**
     * 
     * 						This value is a 3-digit code for a Chinese yuan (also known as the renminbi), a
     * 						currency used in China.
     * 					
     * 
     */
    CNY("CNY"),

    /**
     * 
     * 						This value is a 3-digit code for a Columbian peso, a currency used in Columbia.
     * 					
     * 
     */
    COP("COP"),

    /**
     * 
     * 						This value is a 3-digit code for a Comoro franc, a currency used in Comoros.
     * 					
     * 
     */
    KMF("KMF"),

    /**
     * 
     * 						This value is a 3-digit code for a Congolese franc, a currency used in Democratic
     * 						Republic of Congo.
     * 					
     * 
     */
    CDF("CDF"),

    /**
     * 
     * 						This value is a 3-digit code for a Costa Rican colon, a currency used in Costa
     * 						Rica.
     * 					
     * 
     */
    CRC("CRC"),

    /**
     * 
     * 						This value is a 3-digit code for a Croatian kuna, a currency used in Croatia.
     * 					
     * 
     */
    HRK("HRK"),

    /**
     * 
     * 						This value is a 3-digit code for a Cuban peso, a currency used in Cuba.
     * 					
     * 
     */
    CUP("CUP"),

    /**
     * 
     * 						This value is a 3-digit code for a Cypriot pound, a currency previously used in
     * 						Cyprus. This currency has been replaced by the Euro (3-digit code: EUR).
     * 					
     * 
     */
    CYP("CYP"),

    /**
     * 
     * 						This value is a 3-digit code for a Czech koruna, a currency used in the Czech
     * 						Republic.
     * 					
     * 
     */
    CZK("CZK"),

    /**
     * 
     * 						This value is a 3-digit code for a Danish krone, a currency used in Denmark,
     * 						the Faroe Islands, and Greenland.
     * 					
     * 
     */
    DKK("DKK"),

    /**
     * 
     * 						This value is a 3-digit code for a Djiboutian franc, a currency used in Djibouti.
     * 					
     * 
     */
    DJF("DJF"),

    /**
     * 
     * 						This value is a 3-digit code for a Dominican peso, a currency used in the Dominican
     * 						Republic.
     * 					
     * 
     */
    DOP("DOP"),

    /**
     * 
     * 						This value is a 3-digit code for a Portuguese Timorese escudo, a currency
     * 						previously used in Portuguese Timor.
     * 					
     * 
     */
    TPE("TPE"),

    /**
     * 
     * 						This value is an old 3-digit code for a Cape Verde escudo, a currency used in
     * 						Cape Verde. The 'ECV' code has been replaced by 'CVE'.
     * 					
     * 
     */
    ECV("ECV"),

    /**
     * 
     * 						This value is a 3-digit code for an Ecuadorian sucre, a currency previously used in
     * 						Ecuador. This currency has been replaced by the US Dollar (3-digit code: USD).
     * 					
     * 
     */
    ECS("ECS"),

    /**
     * 
     * 						This value is a 3-digit code for an Egyptian pound, a currency used in Egypt.
     * 					
     * 
     */
    EGP("EGP"),

    /**
     * 
     * 						This value is a 3-digit code for a Salvadoran colon, a currency previously used in
     * 						El Salvador. This currency has been replaced by the US Dollar (3-digit code: USD).
     * 					
     * 
     */
    SVC("SVC"),

    /**
     * 
     * 						This value is a 3-digit code for an Eritrean nakfa, a currency used in Eritrea.
     * 					
     * 
     */
    ERN("ERN"),

    /**
     * 
     * 						This value is a 3-digit code for an Estonian kroon, a currency previously used in
     * 						Estonia. This currency has been replaced by the Euro (3-digit code: EUR).
     * 					
     * 
     */
    EEK("EEK"),

    /**
     * 
     * 						This value is a 3-digit code for an Ethiopian birr, a currency used in Ethiopia.
     * 					
     * 
     */
    ETB("ETB"),

    /**
     * 
     * 						This value is a 3-digit code for a Falkland Islands pound, a currency used in
     * 						the Falkland Islands.
     * 					
     * 
     */
    FKP("FKP"),

    /**
     * 
     * 						This value is a 3-digit code for a Fiji dollar, a currency used in Fiji.
     * 					
     * 
     */
    FJD("FJD"),

    /**
     * 
     * 						This value is a 3-digit code for a Gambian dalasi, a currency used in Gambia.
     * 					
     * 
     */
    GMD("GMD"),

    /**
     * 
     * 						This value is a 3-digit code for a Georgian Iari, a currency used in the country of
     * 						Georgia.
     * 					
     * 
     */
    GEL("GEL"),

    /**
     * 
     * 						This value is an old 3-digit code for a Ghanaian cedi, a currency used in Ghana.
     * 						The 'GHC' code has been replaced by 'GHS'.
     * 					
     * 
     */
    GHC("GHC"),

    /**
     * 
     * 						This value is a 3-digit code for a Gibraltar pound, a currency used in Gibraltar.
     * 					
     * 
     */
    GIP("GIP"),

    /**
     * 
     * 						This value is a 3-digit code for a Guatemalan quetzal, a currency used in
     * 						Guatemala.
     * 					
     * 
     */
    GTQ("GTQ"),

    /**
     * 
     * 						This value is a 3-digit code for a Guinean franc, a currency used in Guinea.
     * 					
     * 
     */
    GNF("GNF"),

    /**
     * 
     * 						This value is a 3-digit code for a Guinea-Bissau peso, a currency previously used
     * 						in Guinea-Bissau. This currency has been replaced by the West African CFA franc
     * 						(3-digit code: XOF).
     * 					
     * 
     */
    GWP("GWP"),

    /**
     * 
     * 						This value is a 3-digit code for a Guyanese dollar, a currency used in Guyana.
     * 					
     * 
     */
    GYD("GYD"),

    /**
     * 
     * 						This value is a 3-digit code for a Haitian gourde, a currency used in Haiti.
     * 					
     * 
     */
    HTG("HTG"),

    /**
     * 
     * 						This value is a 3-digit code for a Honduran lempira, a currency used in Honduras.
     * 					
     * 
     */
    HNL("HNL"),

    /**
     * 
     * 						This value is a 3-digit code for a Hong Kong dollar, a currency used in Hong Kong
     * 						and Macau. This is the value that should be passed in the
     * 						<b>Item.Currency</b> field by the seller when listing an item on the
     * 						eBay Hong Kong site (Site ID 201).
     * 					
     * 
     */
    HKD("HKD"),

    /**
     * 
     * 						This value is a 3-digit code for a Hungarian forint, a currency used in Hungary.
     * 					
     * 
     */
    HUF("HUF"),

    /**
     * 
     * 						This value is a 3-digit code for an Icelandic krona, a currency used in Iceland.
     * 					
     * 
     */
    ISK("ISK"),

    /**
     * 
     * 						This value is a 3-digit code for an Indonesian rupiah, a currency used in
     * 						Indonesia.
     * 					
     * 
     */
    IDR("IDR"),

    /**
     * 
     * 						This value is a 3-digit code for an Iranian rial, a currency used in Iran.
     * 					
     * 
     */
    IRR("IRR"),

    /**
     * 
     * 						This value is a 3-digit code for an Iraqi dinar, a currency used in Iraq.
     * 					
     * 
     */
    IQD("IQD"),

    /**
     * 
     * 						This value is a 3-digit code for an Israeli new shekel, a currency used in
     * 						Israel and in the Palestinian territories.
     * 					
     * 
     */
    ILS("ILS"),

    /**
     * 
     * 						This value is a 3-digit code for a Jamaican dollar, a currency used in Jamaica.
     * 					
     * 
     */
    JMD("JMD"),

    /**
     * 
     * 						This value is a 3-digit code for a Japanese yen, a currency used in Japan.
     * 					
     * 
     */
    JPY("JPY"),

    /**
     * 
     * 						This value is a 3-digit code for a Jordanian dinar, a currency used in Jordan.
     * 					
     * 
     */
    JOD("JOD"),

    /**
     * 
     * 						This value is a 3-digit code for a Kazahhstani tenge, a currency used in
     * 						Kazakhstan.
     * 					
     * 
     */
    KZT("KZT"),

    /**
     * 
     * 						This value is a 3-digit code for a Kenyan shilling, a currency used in Kenya.
     * 					
     * 
     */
    KES("KES"),

    /**
     * 
     * 						This value is a 3-digit code for an Australia dollar, a currency used in Australia.
     * 						This is the value that should be passed in the <b>Item.Currency</b>
     * 						field by the seller when listing an item on the eBay Australia site
     * 						(Site ID 15).
     * 					
     * 
     */
    AUD("AUD"),

    /**
     * 
     * 						This value is a 3-digit code for a North Korean won, a currency used in North
     * 						Korea.
     * 					
     * 
     */
    KPW("KPW"),

    /**
     * 
     * 						This value is a 3-digit code for a South Korean won, a currency used in South
     * 						Korea.
     * 					
     * 
     */
    KRW("KRW"),

    /**
     * 
     * 						This value is a 3-digit code for a Kuwaiti dollar, a currency used in Kuwait.
     * 					
     * 
     */
    KWD("KWD"),

    /**
     * 
     * 						This value is a 3-digit code for a Kyrgzstani som, a currency used in Kyrgystan.
     * 					
     * 
     */
    KGS("KGS"),

    /**
     * 
     * 						This value is a 3-digit code for a Lao kip, a currency used in Laos.
     * 					
     * 
     */
    LAK("LAK"),

    /**
     * 
     * 						This value is a 3-digit code for a Latvian lats, a currency used in Latvia.
     * 					
     * 
     */
    LVL("LVL"),

    /**
     * 
     * 						This value is a 3-digit code for a Lebanese pound, a currency used in Lebanon.
     * 					
     * 
     */
    LBP("LBP"),

    /**
     * 
     * 						This value is a 3-digit code for a Lesotho loti, a currency used in Lesotho.
     * 					
     * 
     */
    LSL("LSL"),

    /**
     * 
     * 						This value is a 3-digit code for a Liberian dollar, a currency used in Liberia.
     * 					
     * 
     */
    LRD("LRD"),

    /**
     * 
     * 						This value is a 3-digit code for a Libyan dinar, a currency used in Libya.
     * 					
     * 
     */
    LYD("LYD"),

    /**
     * 
     * 						Swiss Franc.
     * 						For eBay, you can only specify this currency for listings you submit to the
     * 						Switzerland site (site ID 193).
     * 					
     * 
     */
    CHF("CHF"),

    /**
     * 
     * 						This value is a 3-digit code for a Lithuanian litas, a currency used in Lithuania.
     * 					
     * 
     */
    LTL("LTL"),

    /**
     * 
     * 						This value is a 3-digit code for a Macanese pataca, a currency used in Macao.
     * 					
     * 
     */
    MOP("MOP"),

    /**
     * 
     * 						This value is a 3-digit code for a Macedonian denar, a currency used in Macedonia.
     * 					
     * 
     */
    MKD("MKD"),

    /**
     * 
     * 						This value is a 3-digit code for a Malagay franc, a currency previously used
     * 						in Madagascar. This currency has been replaced by the Malagasy ariary
     * 						(3-digit code: MGA).
     * 					
     * 
     */
    MGF("MGF"),

    /**
     * 
     * 						This value is a 3-digit code for a Malawian kwacha, a currency used in Malawi.
     * 					
     * 
     */
    MWK("MWK"),

    /**
     * 
     * 						This value is a 3-digit code for a Malaysian Ringgit, a currency used in Malaysia.
     * 						This is the value that should be passed in the <b>Item.Currency</b>
     * 						field by the seller when listing an item on the eBay Malaysia site
     * 						(Site ID 207).
     * 					
     * 
     */
    MYR("MYR"),

    /**
     * 
     * 						This value is a 3-digit code for a Maldivian rufiyaaa, a currency used in the
     * 						Maldives.
     * 					
     * 
     */
    MVR("MVR"),

    /**
     * 
     * 						This value is a 3-digit code for a Maltese lira, a currency previously used in
     * 						Malta. This currency has been replaced by the Euro (3-digit code: EUR).
     * 					
     * 
     */
    MTL("MTL"),

    /**
     * 
     * 						This value is a 3-digit code for a EURO, a currency used in Andorra, Austria,
     * 						Belgium, Cyprus, Estonia, Finland, France, Germany, Greece, Ireland, Italy, Kosovo,
     * 						Luxembourg, Malta, Monaco, Montenegro, Netherlands, Portugal, San Marino, Slovakia,
     * 						Slovenia, Spain, and Vatican City. This is the value that should be passed in the
     * 						<b>Item.Currency</b> field by the seller when listing an item on the
     * 						following sites: Austria (Site ID 16), Belgium_French (Site ID 23),
     * 						France (Site ID 71), Germany (Site ID 77), Italy (Site ID 101), Belgium_Dutch (Site
     * 						ID 123), Netherlands (Site ID 146), Spain (Site ID 186), and Ireland (Site ID 205).
     * 					
     * 
     */
    EUR("EUR"),

    /**
     * 
     * 						This value is a 3-digit code for a Mauritanian ouguiya, a currency used in
     * 						Mauritania.
     * 					
     * 
     */
    MRO("MRO"),

    /**
     * 
     * 						This value is a 3-digit code for a Mauritian rupee, a currency used in
     * 						Mauritius.
     * 					
     * 
     */
    MUR("MUR"),

    /**
     * 
     * 						This value is a 3-digit code for a Mexican peso, a currency used in
     * 						Mexico.
     * 					
     * 
     */
    MXN("MXN"),

    /**
     * 
     * 						This value is a 3-digit funds code for a Mexican peso, a currency used in
     * 						Mexico.
     * 					
     * 
     */
    MXV("MXV"),

    /**
     * 
     * 						This value is a 3-digit code for a Moldovan leu, a currency used in
     * 						Moldova.
     * 					
     * 
     */
    MDL("MDL"),

    /**
     * 
     * 						This value is a 3-digit code for a Mongolian tugrik, a currency used in
     * 						Mongolia.
     * 					
     * 
     */
    MNT("MNT"),

    /**
     * 
     * 						This value is a 3-digit code for an Easy Caribbean dollar, a currency used in
     * 						Anguilla, Antigua and Barbuda, Dominica, Grenada, Montserrat, Saint Kitts and
     * 						Nevis, Saint Lucia, and Saint Vincent and the Grenadines.
     * 					
     * 
     */
    XCD("XCD"),

    /**
     * 
     * 						This value is an old 3-digit code for a Mozambican metical, a currency used in
     * 						Mozambique. The 'MZM' code has been replaced by 'MZN'.
     * 					
     * 
     */
    MZM("MZM"),

    /**
     * 
     * 						This value is a 3-digit code for a Myanma kyat, a currency used in
     * 						Myanmar.
     * 					
     * 
     */
    MMK("MMK"),

    /**
     * 
     * 						This value is a 3-digit code for a South African rand, a currency used in
     * 						South Africa.
     * 					
     * 
     */
    ZAR("ZAR"),

    /**
     * 
     * 						This value is a 3-digit code for a Namibian dollar, a currency used in
     * 						Namibia.
     * 					
     * 
     */
    NAD("NAD"),

    /**
     * 
     * 						This value is a 3-digit code for a Nepalese rupee, a currency used in Nepal.
     * 					
     * 
     */
    NPR("NPR"),

    /**
     * 
     * 						This value is a 3-digit code for a Netherlands Antillean guilder, a currency used
     * 						in Curacao and Sint Maarten.
     * 					
     * 
     */
    ANG("ANG"),

    /**
     * 
     * 						This value is a 3-digit code for a CFP franc, a currency used in French Polynesia,
     * 						New Caledonia, and Wallis and Futuna.
     * 					
     * 
     */
    XPF("XPF"),

    /**
     * 
     * 						This value is a 3-digit code for a New Zealand dollar, a currency used in the
     * 						Cook Islands, New Zealand, Niue, Pitcairn, and Tokelau, Ross Dependency.
     * 					
     * 
     */
    NZD("NZD"),

    /**
     * 
     * 						This value is a 3-digit code for a Nicaraguan cordoba, a currency used in
     * 						Nicaragua.
     * 					
     * 
     */
    NIO("NIO"),

    /**
     * 
     * 						This value is a 3-digit code for a Nigerian naira, a currency used in Nigeria.
     * 					
     * 
     */
    NGN("NGN"),

    /**
     * 
     * 						This value is a 3-digit code for a Norwegian kron, a currency used in Norway,
     * 						Svalbard, Jan Mayen, Bouvet Island, Queen Maud Land, and Peter I Island.
     * 					
     * 
     */
    NOK("NOK"),

    /**
     * 
     * 						This value is a 3-digit code for an Omani rial, a currency used in Oman.
     * 					
     * 
     */
    OMR("OMR"),

    /**
     * 
     * 						This value is a 3-digit code for a Pakistani rupee, a currency used in Pakistan.
     * 					
     * 
     */
    PKR("PKR"),

    /**
     * 
     * 						This value is a 3-digit code for a Panamanian balboa, a currency used in Panama.
     * 					
     * 
     */
    PAB("PAB"),

    /**
     * 
     * 						This value is a 3-digit code for a Papua New Guinea kina, a currency used in
     * 						Papua New Guinea.
     * 					
     * 
     */
    PGK("PGK"),

    /**
     * 
     * 						This value is a 3-digit code for a Paraguayan guarani, a currency used in
     * 						Paraguay.
     * 					
     * 
     */
    PYG("PYG"),

    /**
     * 
     * 						This value is a 3-digit code for a Peruvian nuevo sol, a currency used in Peru.
     * 					
     * 
     */
    PEN("PEN"),

    /**
     * 
     * 						This value is a 3-digit code for a Philippine peso, a currency used in the
     * 						Philippines. This is the value that should be passed in the
     * 						<b>Item.Currency</b> field by the seller when listing an item on the
     * 						eBay Philippines site (Site ID 211).
     * 					
     * 
     */
    PHP("PHP"),

    /**
     * 
     * 						This value is a 3-digit code for a Polish zloty, a currency used in Poland. This
     * 						is the value that should be passed in the <b>Item.Currency</b> field
     * 						by the seller when listing an item on the eBay Poland site (Site ID 212).
     * 					
     * 
     */
    PLN("PLN"),

    /**
     * 
     * 						This value is a 3-digit code for a US dollar, a currency used in the United
     * 						States, America Samoa, Barbados, Bermuda, British Indian Ocean Territory, British
     * 						Virgin Islands, Caribbean Netherlands, Ecuador, El Salvador, Guam, Haiti, Marshall
     * 						Islands, Federated States of Micronesia, Northern Mariana Islands, Palau, Panama,
     * 						Puerto Rico, Timor-Leste, Turks and Caicos Islands, US Virgin Islands, and
     * 						Zimbabwe. This is the value that should be passed in the
     * 						<b>Item.Currency</b> field by the seller when listing an item on the
     * 						eBay US or US eBay Motors site (Site ID 0). 'USD' can also
     * 						be specified as the <b>Item.Currency</b> on the eBay Canada site
     * 						(Site ID 2).
     * 					
     * 
     */
    USD("USD"),

    /**
     * 
     * 						This value is a 3-digit code for a Qatari riyal, a currency used in Qatar.
     * 					
     * 
     */
    QAR("QAR"),

    /**
     * 
     * 						This value is a 3-digit code for the old Romanian leu, a currency previously used
     * 						in Romania. This currency has been replaced by the Romanian new leu (3-digit code:
     * 						RON).
     * 					
     * 
     */
    ROL("ROL"),

    /**
     * 
     * 						This value is a 3-digit code for a Russian rouble, a currency used in Russia,
     * 						Abkhazia, and South Ossetia. This value replace the old 3-digit code for the
     * 						Russian rouble, 'RUR'.
     * 					
     * 
     */
    RUB("RUB"),

    /**
     * 
     * 						This value is the old 3-digit code for a Russian rouble, a currency used in
     * 						Russia. This value was replaced by the new 3-digit code for the Russian rouble,
     * 						'RUB'.
     * 					
     * 
     */
    RUR("RUR"),

    /**
     * 
     * 						This value is a 3-digit code for a Rwandan franc, a currency used in Rwanda.
     * 					
     * 
     */
    RWF("RWF"),

    /**
     * 
     * 						This value is a 3-digit code for a Saint Helena pound, a currency used in Saint
     * 						Helena.
     * 					
     * 
     */
    SHP("SHP"),

    /**
     * 
     * 						This value is a 3-digit code for a Samoan tala, a currency used in Samoa.
     * 					
     * 
     */
    WST("WST"),

    /**
     * 
     * 						This value is a 3-digit code for a Sao Tome and Principe dobra, a currency used in
     * 						Sao Tome and Principe.
     * 					
     * 
     */
    STD("STD"),

    /**
     * 
     * 						This value is a 3-digit code for a Saudi riyal, a currency used in Saudi Arabia.
     * 					
     * 
     */
    SAR("SAR"),

    /**
     * 
     * 						This value is a 3-digit code for a Seychelles rupee, a currency used in Seychelles.
     * 					
     * 
     */
    SCR("SCR"),

    /**
     * 
     * 						This value is a 3-digit code for a Sierra Leonean leone, a currency used in Sierra
     * 						Leone.
     * 					
     * 
     */
    SLL("SLL"),

    /**
     * 
     * 						This value is a 3-digit code for a Singapore dollar, a currency used in Singapore
     * 						and Brunei. This is the value that should be passed in the
     * 						<b>Item.Currency</b> field by the seller when listing an item on the
     * 						eBay Singapore site (Site ID 216).
     * 					
     * 
     */
    SGD("SGD"),

    /**
     * 
     * 						This value is a 3-digit code for a Slovak koruna, a currency previously used in
     * 						Slovakia. This currency has been replaced by the Euro (3-digit code: EUR).
     * 					
     * 
     */
    SKK("SKK"),

    /**
     * 
     * 						This value is a 3-digit code for a Slovenian tolar, a currency previously used in
     * 						Slovenia. This currency has been replaced by the Euro (3-digit code: EUR).
     * 					
     * 
     */
    SIT("SIT"),

    /**
     * 
     * 						This value is a 3-digit code for a Solomon Islands dollar, a currency used in
     * 						the Solomon Islands.
     * 					
     * 
     */
    SBD("SBD"),

    /**
     * 
     * 						This value is a 3-digit code for a Somali shilling, a currency used in Somalia.
     * 					
     * 
     */
    SOS("SOS"),

    /**
     * 
     * 						This value is a 3-digit code for a Sri Lankan rupee, a currency used in Sri Lanka.
     * 					
     * 
     */
    LKR("LKR"),

    /**
     * 
     * 						This value is the 3-digit code for a Sudanese dinar, a currency previously used in
     * 						Sudan. The Sudanese dinar was replaced by the Sudanese pound, which has a 3-digit
     * 						code of 'SDG'.
     * 					
     * 
     */
    SDD("SDD"),

    /**
     * 
     * 						This value is the 3-digit code for a Suriname guilder, a currency previously used
     * 						in Suriname. The Surinam guilder was replaced by the Surinamese dollar, which has
     * 						a 3-digit code of 'SRD'.
     * 					
     * 
     */
    SRG("SRG"),

    /**
     * 
     * 						This value is a 3-digit code for a Swazi lilangeni, a currency used in Swaziland.
     * 					
     * 
     */
    SZL("SZL"),

    /**
     * 
     * 						This value is a 3-digit code for a Swedish krona, a currency used in Swedn. This
     * 						is the value that should be passed in the <b>Item.Currency</b> field
     * 						by the seller when listing an item on the eBay Sweden site (Site ID 218).
     * 					
     * 
     */
    SEK("SEK"),

    /**
     * 
     * 						This value is a 3-digit code for a Syrian pound, a currency used in Syria.
     * 					
     * 
     */
    SYP("SYP"),

    /**
     * 
     * 						This value is a 3-digit code for the New Taiwan dollar, a currency used in Taiwan.
     * 					
     * 
     */
    TWD("TWD"),

    /**
     * 
     * 						This value is a 3-digit code for a Tajikistani somoni, a currency used in
     * 						Tajikistan.
     * 					
     * 
     */
    TJS("TJS"),

    /**
     * 
     * 						This value is a 3-digit code for a Tanzanian shilling, a currency used in
     * 						Tanzania.
     * 					
     * 
     */
    TZS("TZS"),

    /**
     * 
     * 						This value is a 3-digit code for a Thai baht, a currency used in Thailand.
     * 					
     * 
     */
    THB("THB"),

    /**
     * 
     * 						This value is a 3-digit code for a West African CFA franc, a currency used in
     * 						Benin, Burkina Faso, Cote d'Ivoire, Guinea-Bissau, Mali, Niger, Senegal, and
     * 						Togo.
     * 					
     * 
     */
    XOF("XOF"),

    /**
     * 
     * 						This value is a 3-digit code for a Tongan pa'anga, a currency used in Tonga.
     * 					
     * 
     */
    TOP("TOP"),

    /**
     * 
     * 						This value is a 3-digit code for a Trinidad and Tobago dollar, a currency used in
     * 						Trinidad and Tobago.
     * 					
     * 
     */
    TTD("TTD"),

    /**
     * 
     * 						This value is a 3-digit code for a Tunisian dinar, a currency used in Tunisia.
     * 					
     * 
     */
    TND("TND"),

    /**
     * 
     * 						This value is the old 3-digit code for a Turkish lira, a currency used in Turkey
     * 						and Northern Cyprus. This value was replaced by the new 3-digit code for the
     * 						Turkish lira, 'TRY'.
     * 					
     * 
     */
    TRL("TRL"),

    /**
     * 
     * 						This value is the old 3-digit code for a Turkmenistani manat, a currency used in
     * 						Turkmenistan. This value was replaced by the new 3-digit code for
     * 						the Turkmenistani manat, 'TMT'.
     * 					
     * 
     */
    TMM("TMM"),

    /**
     * 
     * 						This value is a 3-digit code for a Ugandan shilling, a currency used in Uganda.
     * 					
     * 
     */
    UGX("UGX"),

    /**
     * 
     * 						This value is a 3-digit code for a Ukrainian hryvnia, a currency used in the
     * 						Ukraine.
     * 					
     * 
     */
    UAH("UAH"),

    /**
     * 
     * 						This value is a 3-digit code for an United Arab Emirates dirham, a currency used
     * 						in the United Arab Emirates.
     * 					
     * 
     */
    AED("AED"),

    /**
     * 
     * 						This value is a 3-digit code for a Pound sterling, a currency used in the United
     * 						Kingdom and British Crown dependencies. This is the value that should be passed in
     * 						the <b>Item.Currency</b> field by the seller when listing an item on
     * 						the eBay UK site (Site ID 3).
     * 					
     * 
     */
    GBP("GBP"),

    /**
     * 
     * 						This value is a 3-digit code for a same-day transaction involving US dollars.
     * 					
     * 
     */
    USS("USS"),

    /**
     * 
     * 						This value is a 3-digit code for a next-day transaction involving US dollars.
     * 					
     * 
     */
    USN("USN"),

    /**
     * 
     * 						This value is a 3-digit code for a Uruguayan peso, a currency used in Uruguay.
     * 					
     * 
     */
    UYU("UYU"),

    /**
     * 
     * 						This value is a 3-digit code for a Uzbekistan som, a currency used in the
     * 						Uzbekistan.
     * 					
     * 
     */
    UZS("UZS"),

    /**
     * 
     * 						This value is a 3-digit code for a Vanuatu vatu, a currency used in Vanuatu.
     * 					
     * 
     */
    VUV("VUV"),

    /**
     * 
     * 						This value is a 3-digit code for a Venezuelan bolivar, a currency previously used
     * 						in Venezuela. The Venezuela bolivar was replaced by the Venezuelan bolivar
     * 						fuerte, which has a 3-digit code of 'VEF'.
     * 					
     * 
     */
    VEB("VEB"),

    /**
     * 
     * 						This value is a 3-digit code for a Vietnamese dong, a currency used in Vietnam.
     * 					
     * 
     */
    VND("VND"),

    /**
     * 
     * 						This value is a 3-digit code for a Moroccan dirham, a currency used in Morocco.
     * 					
     * 
     */
    MAD("MAD"),

    /**
     * 
     * 						This value is a 3-digit code for a Yemeni rial, a currency used in Yemen.
     * 					
     * 
     */
    YER("YER"),

    /**
     * 
     * 						This value is a 3-digit code for a Yugoslav dinar, a currency previously used in
     * 						Yugoslavia. The Yugoslav dinar was replaced by the Serbian dinar, which has a 3-
     * 						digit code of 'RSD'.
     * 					
     * 
     */
    YUM("YUM"),

    /**
     * 
     * 						This value is the old 3-digit code for a Zambian kwacha, a currency used in
     * 						Zambia. The 'ZMK' code has been replaced by 'ZMW'.
     * 					
     * 
     */
    ZMK("ZMK"),

    /**
     * 
     * 						This value is the old 3-digit code for a Zimbabwean dollar, a currency previously
     * 						used in Zimbabwe. The US dollar replaced the Zimbabwean dollar as the official
     * 						currency in Zimbabwe.
     * 					
     * 
     */
    ZWD("ZWD"),

    /**
     * 
     * 						This value is a 3-digit code for an Austrian schilling, a currency previously used
     * 						in Austria. This currency has been replaced by the Euro (3-digit code: EUR).
     * 					
     * 
     */
    ATS("ATS"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SoapCurrencyCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapCurrencyCodeType fromValue(String v) {
        for (SoapCurrencyCodeType c: SoapCurrencyCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
