
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface.ArrayOfBranch;


/**
 * &lt;p&gt;Java class for GetBranchesResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GetBranchesResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface}ResponseBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Branches" type="{http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities}ArrayOfBranch" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBranchesResponse", propOrder = {
    "branches"
})
public class GetBranchesResponse
    extends ResponseBase
{

    @XmlElementRef(name = "Branches", namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBranch> branches;

    /**
     * Gets the value of the branches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBranch }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBranch> getBranches() {
        return branches;
    }

    /**
     * Sets the value of the branches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBranch }{@code >}
     *     
     */
    public void setBranches(JAXBElement<ArrayOfBranch> value) {
        this.branches = value;
    }

}
