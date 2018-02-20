
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					<b>This call is deprecated.</b>
 * 			
 * 
 * <p>Java class for FindPopularItemsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindPopularItemsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemArrayType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPopularItemsResponseType", propOrder = {
    "itemArray"
})
public class SoapFindPopularItemsResponseType
    extends SoapAbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemArray")
    protected SoapSimpleItemArrayType itemArray;

    /**
     * Gets the value of the itemArray property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSimpleItemArrayType }
     *     
     */
    public SoapSimpleItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * Sets the value of the itemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSimpleItemArrayType }
     *     
     */
    public void setItemArray(SoapSimpleItemArrayType value) {
        this.itemArray = value;
    }

}
