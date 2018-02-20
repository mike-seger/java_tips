
package packagename.declared.injaxb.bindingfile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response type of the <b>GetMultipleItems</b> call, which includes an array of eBay items.
 * 			
 * 
 * <p>Java class for GetMultipleItemsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMultipleItemsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMultipleItemsResponseType", propOrder = {
    "item"
})
public class SoapGetMultipleItemsResponseType
    extends SoapAbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Item")
    protected List<SoapSimpleItemType> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapSimpleItemType }
     * 
     * 
     */
    public List<SoapSimpleItemType> getItem() {
        if (item == null) {
            item = new ArrayList<SoapSimpleItemType>();
        }
        return this.item;
    }

}
