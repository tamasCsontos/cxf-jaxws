
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
 *         &amp;lt;element name="RevokeBookingTicketResult" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface}RevokeBookingTicketResponse" minOccurs="0"/&amp;gt;
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
    "revokeBookingTicketResult"
})
@XmlRootElement(name = "RevokeBookingTicketResponse")
public class RevokeBookingTicketResponse {

    @XmlElementRef(name = "RevokeBookingTicketResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse> revokeBookingTicketResult;

    /**
     * Gets the value of the revokeBookingTicketResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse> getRevokeBookingTicketResult() {
        return revokeBookingTicketResult;
    }

    /**
     * Sets the value of the revokeBookingTicketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse }{@code >}
     *     
     */
    public void setRevokeBookingTicketResult(JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse> value) {
        this.revokeBookingTicketResult = value;
    }

}
