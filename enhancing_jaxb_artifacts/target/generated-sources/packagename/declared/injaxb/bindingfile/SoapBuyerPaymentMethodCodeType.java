
package packagename.declared.injaxb.bindingfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPaymentMethodCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="MOCC"/&gt;
 *     &lt;enumeration value="AmEx"/&gt;
 *     &lt;enumeration value="PaymentSeeDescription"/&gt;
 *     &lt;enumeration value="CCAccepted"/&gt;
 *     &lt;enumeration value="PersonalCheck"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="VisaMC"/&gt;
 *     &lt;enumeration value="PaisaPayAccepted"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PayPal"/&gt;
 *     &lt;enumeration value="Discover"/&gt;
 *     &lt;enumeration value="CashOnPickup"/&gt;
 *     &lt;enumeration value="MoneyXferAccepted"/&gt;
 *     &lt;enumeration value="MoneyXferAcceptedInCheckout"/&gt;
 *     &lt;enumeration value="OtherOnlinePayments"/&gt;
 *     &lt;enumeration value="Escrow"/&gt;
 *     &lt;enumeration value="PrePayDelivery"/&gt;
 *     &lt;enumeration value="CODPrePayDelivery"/&gt;
 *     &lt;enumeration value="PostalTransfer"/&gt;
 *     &lt;enumeration value="CustomCode"/&gt;
 *     &lt;enumeration value="LoanCheck"/&gt;
 *     &lt;enumeration value="CashInPerson"/&gt;
 *     &lt;enumeration value="ELV"/&gt;
 *     &lt;enumeration value="PaisaPayEscrowEMI"/&gt;
 *     &lt;enumeration value="Moneybookers"/&gt;
 *     &lt;enumeration value="Paymate"/&gt;
 *     &lt;enumeration value="ProPay"/&gt;
 *     &lt;enumeration value="StandardPayment"/&gt;
 *     &lt;enumeration value="DirectDebit"/&gt;
 *     &lt;enumeration value="CreditCard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuyerPaymentMethodCodeType")
@XmlEnum
public enum SoapBuyerPaymentMethodCodeType {


    /**
     * 
     * 						No payment method specified.
     * 						For example, no payment methods would be specified for Ad format listings.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Money order/cashiers check.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    MOCC("MOCC"),

    /**
     * 
     * 						American Express.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),

    /**
     * 
     * 						Payment instructions are contained in the item's description.
     * 					
     * 
     */
    @XmlEnumValue("PaymentSeeDescription")
    PAYMENT_SEE_DESCRIPTION("PaymentSeeDescription"),

    /**
     * 
     * 						Credit card.
     * 						Not applicable to Real Estate or US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("CCAccepted")
    CC_ACCEPTED("CCAccepted"),

    /**
     * 
     * 						Personal check.
     * 					
     * 
     */
    @XmlEnumValue("PersonalCheck")
    PERSONAL_CHECK("PersonalCheck"),

    /**
     * 
     * 						Cash on delivery.
     * 						Only applicable to the following eBay sites: AT (16), BEFR (24),
     * 						BENL (123), CH (193), DE (77), ES (186), FR (71), HK (201), IN (203),
     * 						IT (101), PL (212), and SG (216).
     * 						Not applicable to Real Estate listings.
     * 					
     * 
     */
    COD("COD"),

    /**
     * 
     * 						Visa/Mastercard.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("VisaMC")
    VISA_MC("VisaMC"),

    /**
     * 
     * 						PaisaPay (for India site only).
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayAccepted")
    PAISA_PAY_ACCEPTED("PaisaPayAccepted"),

    /**
     * 
     * 						Other forms of payment.
     * 						Not applicable to US/CA eBay Motors listings
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						PayPal.<br>
     * 						<br>
     * 						If PayPal is specified for US/CA eBay Motors vehicles, it is for
     * 						the vehicle deposit (not for purchasing the vehicle).
     * 					
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 						Discover Card.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     * 						This payment method is equivalent to the PayOnPickup payment method.
     * 						CashOnPickup applies even for listings on the eBay US site that refer to "Pay on pickup."
     * 					
     * 
     */
    @XmlEnumValue("CashOnPickup")
    CASH_ON_PICKUP("CashOnPickup"),

    /**
     * 
     * 						Direct transfer of money.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAccepted")
    MONEY_XFER_ACCEPTED("MoneyXferAccepted"),

    /**
     * 
     * 						If the seller has bank account information on file, and
     * 						MoneyXferAcceptedInCheckout = true, then the bank account
     * 						information will be displayed in Checkout.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAcceptedInCheckout")
    MONEY_XFER_ACCEPTED_IN_CHECKOUT("MoneyXferAcceptedInCheckout"),

    /**
     * 
     * 						All other online payments.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("OtherOnlinePayments")
    OTHER_ONLINE_PAYMENTS("OtherOnlinePayments"),
    @XmlEnumValue("Escrow")
    ESCROW("Escrow"),
    @XmlEnumValue("PrePayDelivery")
    PRE_PAY_DELIVERY("PrePayDelivery"),
    @XmlEnumValue("CODPrePayDelivery")
    COD_PRE_PAY_DELIVERY("CODPrePayDelivery"),
    @XmlEnumValue("PostalTransfer")
    POSTAL_TRANSFER("PostalTransfer"),

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
     * 						Loan check option (applicable only to the US eBay Motors site,
     * 						except in the Parts and Accessories category, and the eBay Canada site for motors).
     * 					
     * 
     */
    @XmlEnumValue("LoanCheck")
    LOAN_CHECK("LoanCheck"),
    @XmlEnumValue("CashInPerson")
    CASH_IN_PERSON("CashInPerson"),

    /**
     * 
     * 						Elektronisches Lastschriftverfahren (direct debit).
     * 						Only applicable to Express Germany.
     * 					
     * 
     */
    ELV("ELV"),

    /**
     * 
     * 							PaisaPayEscrow EMI (Equal Monthly Installment) payment method.
     * 							The PaisaPayEscrowEMI payment method is only for the India site (site ID 203).
     * 						
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This payment method is no longer an acceptable form of payment. Sellers may no longer offer this payment method to buyers when creating new listings.
     * 						</span>
     * 						<br>
     * 						The Moneybookers payment method.
     * 						For more information, see http://www.moneybookers.com/partners/us/ebay.
     * 						Only applicable to the US site (and
     * 						to the Parts and Accessories category of the US eBay Motors site).
     * 					
     * 
     */
    @XmlEnumValue("Moneybookers")
    MONEYBOOKERS("Moneybookers"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This payment method is no longer an acceptable form of payment. Sellers may no longer offer this payment method to buyers when creating new listings.
     * 						</span>
     * 						<br>
     * 						The Paymate payment method. For more information,
     * 						see http://www.paymate.com/eBay.
     * 						Only applicable to the US site (and
     * 						to the Parts and Accessories category of the US eBay Motors site).
     * 					
     * 
     */
    @XmlEnumValue("Paymate")
    PAYMATE("Paymate"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This payment method is no longer an acceptable form of payment. Sellers may no longer offer this payment method to buyers when creating new listings.
     * 						</span>
     * 						<br>
     * 						The ProPay payment method. US site only. For more information,
     * 						see http://www.Propay.com/eBay.
     * 					
     * 
     */
    @XmlEnumValue("ProPay")
    PRO_PAY("ProPay"),

    /**
     * 
     * 						For all payment intermediated transactions, If the authenticated caller is a seller then Standard Payment Method is returned to as Payment Method Used to sellers.
     * 						OrderArray.Order.CheckoutStatus.PaymentMethod (GetOrders, GetOrderTransaction) and OrderArray.Order
     * 						.TransactionArray.Transaction.Status (For all the 4 APIs).
     * 					    The COD (Cash on Demand) or POP (Pay on Pickup) should be shown as is to the buyers and sellers, these payment methods are not intermediated.
     *   					
     * 
     */
    @XmlEnumValue("StandardPayment")
    STANDARD_PAYMENT("StandardPayment"),

    /**
     * 
     * 						This value indicates that a debit card is a valid payment method for the order.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebit")
    DIRECT_DEBIT("DirectDebit"),

    /**
     * 
     * 						This value indicates that a credit card is a valid payment method for the order.
     * 					
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard");
    private final String value;

    SoapBuyerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapBuyerPaymentMethodCodeType fromValue(String v) {
        for (SoapBuyerPaymentMethodCodeType c: SoapBuyerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
