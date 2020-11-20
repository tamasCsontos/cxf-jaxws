
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime;


/**
 * &lt;p&gt;Java class for GetFreeTimesResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GetFreeTimesResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface}ResponseBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FreeTimes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfdateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFreeTimesResponse", propOrder = {
    "freeTimes"
})
public class GetFreeTimesResponse
    extends ResponseBase
{

    @XmlElementRef(name = "FreeTimes", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfdateTime> freeTimes;

    /**
     * Gets the value of the freeTimes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdateTime }{@code >}
     *     
     */
    public JAXBElement<ArrayOfdateTime> getFreeTimes() {
        return freeTimes;
    }

    /**
     * Sets the value of the freeTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdateTime }{@code >}
     *     
     */
    public void setFreeTimes(JAXBElement<ArrayOfdateTime> value) {
        this.freeTimes = value;
    }

}
