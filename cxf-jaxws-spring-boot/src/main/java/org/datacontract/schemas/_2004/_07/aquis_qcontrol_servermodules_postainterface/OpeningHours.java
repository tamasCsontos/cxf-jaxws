
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OpeningHours complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpeningHours"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Exceptions" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities}ArrayOfOpeningHoursException" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Week" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities}ArrayOfDay" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningHours", propOrder = {
    "exceptions",
    "week"
})
public class OpeningHours {

    @XmlElementRef(name = "Exceptions", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOpeningHoursException> exceptions;
    @XmlElementRef(name = "Week", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDay> week;

    /**
     * Gets the value of the exceptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOpeningHoursException }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOpeningHoursException> getExceptions() {
        return exceptions;
    }

    /**
     * Sets the value of the exceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOpeningHoursException }{@code >}
     *     
     */
    public void setExceptions(JAXBElement<ArrayOfOpeningHoursException> value) {
        this.exceptions = value;
    }

    /**
     * Gets the value of the week property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDay }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDay> getWeek() {
        return week;
    }

    /**
     * Sets the value of the week property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDay }{@code >}
     *     
     */
    public void setWeek(JAXBElement<ArrayOfDay> value) {
        this.week = value;
    }

}
