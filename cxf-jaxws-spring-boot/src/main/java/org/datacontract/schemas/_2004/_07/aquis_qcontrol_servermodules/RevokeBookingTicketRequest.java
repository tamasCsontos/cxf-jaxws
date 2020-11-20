
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for RevokeBookingTicketRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RevokeBookingTicketRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface}RequestBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BookingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevokeBookingTicketRequest", propOrder = {
    "bookingCode",
    "bookingTime"
})
public class RevokeBookingTicketRequest
    extends RequestBase
{

    @XmlElementRef(name = "BookingCode", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingCode;
    @XmlElement(name = "BookingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingTime;

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingCode(JAXBElement<String> value) {
        this.bookingCode = value;
    }

    /**
     * Gets the value of the bookingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingTime() {
        return bookingTime;
    }

    /**
     * Sets the value of the bookingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingTime(XMLGregorianCalendar value) {
        this.bookingTime = value;
    }

}
