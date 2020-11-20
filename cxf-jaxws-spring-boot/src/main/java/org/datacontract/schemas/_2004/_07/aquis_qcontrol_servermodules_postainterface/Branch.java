
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Branch complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Branch"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Seaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Tasks" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities}ArrayOfTask" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TotemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Branch", propOrder = {
    "name",
    "seaz",
    "tasks",
    "totemType"
})
public class Branch {

    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Seaz", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seaz;
    @XmlElementRef(name = "Tasks", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTask> tasks;
    @XmlElementRef(name = "TotemType", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totemType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the seaz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeaz() {
        return seaz;
    }

    /**
     * Sets the value of the seaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeaz(JAXBElement<String> value) {
        this.seaz = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTask> getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     *     
     */
    public void setTasks(JAXBElement<ArrayOfTask> value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the totemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotemType() {
        return totemType;
    }

    /**
     * Sets the value of the totemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotemType(JAXBElement<String> value) {
        this.totemType = value;
    }

}
