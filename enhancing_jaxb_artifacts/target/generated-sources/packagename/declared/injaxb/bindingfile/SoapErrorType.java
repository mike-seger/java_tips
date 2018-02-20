
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				These are request errors (as opposed to system errors) that occur due to problems
 * 				with business-level data (e.g., an invalid combination of arguments) that
 * 				the application passed in.
 * 			
 * 
 * <p>Java class for ErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShortMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="UserDisplayHint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SeverityCode" type="{urn:ebay:apis:eBLBaseComponents}SeverityCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ErrorParameters" type="{urn:ebay:apis:eBLBaseComponents}ErrorParameterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorClassification" type="{urn:ebay:apis:eBLBaseComponents}ErrorClassificationCodeType" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", propOrder = {
    "shortMessage",
    "longMessage",
    "errorCode",
    "userDisplayHint",
    "severityCode",
    "errorParameters",
    "errorClassification",
    "any"
})
public class SoapErrorType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ShortMessage")
    protected String shortMessage;
    @XmlElement(name = "LongMessage")
    protected String longMessage;
    @XmlElement(name = "ErrorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorCode;
    @XmlElement(name = "UserDisplayHint")
    protected Boolean userDisplayHint;
    @XmlElement(name = "SeverityCode")
    @XmlSchemaType(name = "token")
    protected SoapSeverityCodeType severityCode;
    @XmlElement(name = "ErrorParameters")
    protected List<SoapErrorParameterType> errorParameters;
    @XmlElement(name = "ErrorClassification")
    @XmlSchemaType(name = "token")
    protected SoapErrorClassificationCodeType errorClassification;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shortMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessage() {
        return shortMessage;
    }

    /**
     * Sets the value of the shortMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessage(String value) {
        this.shortMessage = value;
    }

    /**
     * Gets the value of the longMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongMessage() {
        return longMessage;
    }

    /**
     * Sets the value of the longMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongMessage(String value) {
        this.longMessage = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the userDisplayHint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDisplayHint() {
        return userDisplayHint;
    }

    /**
     * Sets the value of the userDisplayHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDisplayHint(Boolean value) {
        this.userDisplayHint = value;
    }

    /**
     * Gets the value of the severityCode property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSeverityCodeType }
     *     
     */
    public SoapSeverityCodeType getSeverityCode() {
        return severityCode;
    }

    /**
     * Sets the value of the severityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSeverityCodeType }
     *     
     */
    public void setSeverityCode(SoapSeverityCodeType value) {
        this.severityCode = value;
    }

    /**
     * Gets the value of the errorParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapErrorParameterType }
     * 
     * 
     */
    public List<SoapErrorParameterType> getErrorParameters() {
        if (errorParameters == null) {
            errorParameters = new ArrayList<SoapErrorParameterType>();
        }
        return this.errorParameters;
    }

    /**
     * Gets the value of the errorClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SoapErrorClassificationCodeType }
     *     
     */
    public SoapErrorClassificationCodeType getErrorClassification() {
        return errorClassification;
    }

    /**
     * Sets the value of the errorClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapErrorClassificationCodeType }
     *     
     */
    public void setErrorClassification(SoapErrorClassificationCodeType value) {
        this.errorClassification = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
