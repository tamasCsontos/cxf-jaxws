
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetFreeTimesResult" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface}GetFreeTimesResponse" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFreeTimesResult"
})
@XmlRootElement(name = "GetFreeTimesResponse")
public class GetFreeTimesResponse {

    @XmlElementRef(name = "GetFreeTimesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse> getFreeTimesResult;

    /**
     * Gets the value of the getFreeTimesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse> getGetFreeTimesResult() {
        return getFreeTimesResult;
    }

    /**
     * Sets the value of the getFreeTimesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse }{@code >}
     *     
     */
    public void setGetFreeTimesResult(JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse> value) {
        this.getFreeTimesResult = value;
    }

}
