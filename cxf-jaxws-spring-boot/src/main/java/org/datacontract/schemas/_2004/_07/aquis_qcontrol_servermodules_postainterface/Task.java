
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Task complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Task"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AverageWaitingTimeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BookingOpeningHours" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities}OpeningHours" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities}ArrayOfLanguageString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TopWaitingTimeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WaitingCustomersCountLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", propOrder = {
    "averageWaitingTimeLimit",
    "bookingOpeningHours",
    "id",
    "name",
    "topWaitingTimeLimit",
    "waitingCustomersCountLimit"
})
public class Task {

    @XmlElement(name = "AverageWaitingTimeLimit")
    protected Integer averageWaitingTimeLimit;
    @XmlElementRef(name = "BookingOpeningHours", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<OpeningHours> bookingOpeningHours;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLanguageString> name;
    @XmlElement(name = "TopWaitingTimeLimit")
    protected Integer topWaitingTimeLimit;
    @XmlElement(name = "WaitingCustomersCountLimit")
    protected Integer waitingCustomersCountLimit;

    /**
     * Gets the value of the averageWaitingTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAverageWaitingTimeLimit() {
        return averageWaitingTimeLimit;
    }

    /**
     * Sets the value of the averageWaitingTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAverageWaitingTimeLimit(Integer value) {
        this.averageWaitingTimeLimit = value;
    }

    /**
     * Gets the value of the bookingOpeningHours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpeningHours }{@code >}
     *     
     */
    public JAXBElement<OpeningHours> getBookingOpeningHours() {
        return bookingOpeningHours;
    }

    /**
     * Sets the value of the bookingOpeningHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpeningHours }{@code >}
     *     
     */
    public void setBookingOpeningHours(JAXBElement<OpeningHours> value) {
        this.bookingOpeningHours = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLanguageString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLanguageString> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLanguageString }{@code >}
     *     
     */
    public void setName(JAXBElement<ArrayOfLanguageString> value) {
        this.name = value;
    }

    /**
     * Gets the value of the topWaitingTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopWaitingTimeLimit() {
        return topWaitingTimeLimit;
    }

    /**
     * Sets the value of the topWaitingTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopWaitingTimeLimit(Integer value) {
        this.topWaitingTimeLimit = value;
    }

    /**
     * Gets the value of the waitingCustomersCountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaitingCustomersCountLimit() {
        return waitingCustomersCountLimit;
    }

    /**
     * Sets the value of the waitingCustomersCountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaitingCustomersCountLimit(Integer value) {
        this.waitingCustomersCountLimit = value;
    }

}
