
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ArrayOfOpeningHoursException complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfOpeningHoursException"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="OpeningHoursException" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities}OpeningHoursException" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOpeningHoursException", propOrder = {
    "openingHoursException"
})
public class ArrayOfOpeningHoursException {

    @XmlElement(name = "OpeningHoursException", nillable = true)
    protected List<OpeningHoursException> openingHoursException;

    /**
     * Gets the value of the openingHoursException property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the openingHoursException property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOpeningHoursException().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OpeningHoursException }
     * 
     * 
     */
    public List<OpeningHoursException> getOpeningHoursException() {
        if (openingHoursException == null) {
            openingHoursException = new ArrayList<OpeningHoursException>();
        }
        return this.openingHoursException;
    }

}
