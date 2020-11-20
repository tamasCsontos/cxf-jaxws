
package hu.posta.xmlns.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RequestHeaderType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RequestHeaderType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="MessageFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OSBCorrelationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CallerSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="CallerUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CallerNode" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *         &amp;lt;element name="RequestRecordCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderType", propOrder = {
    "messageId",
    "messageFlowId",
    "osbCorrelationId",
    "callerSystem",
    "callerUser",
    "callerNode",
    "timeout",
    "requestRecordCount"
})
@XmlSeeAlso({
    ResponseHeaderType.class
})
public class RequestHeaderType {

    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "MessageFlowId")
    protected String messageFlowId;
    @XmlElement(name = "OSBCorrelationId")
    protected String osbCorrelationId;
    @XmlElement(name = "CallerSystem", required = true)
    protected String callerSystem;
    @XmlElement(name = "CallerUser")
    protected String callerUser;
    @XmlElement(name = "CallerNode", required = true)
    protected String callerNode;
    @XmlElement(name = "Timeout")
    protected long timeout;
    @XmlElement(name = "RequestRecordCount")
    protected Long requestRecordCount;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageFlowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFlowId() {
        return messageFlowId;
    }

    /**
     * Sets the value of the messageFlowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFlowId(String value) {
        this.messageFlowId = value;
    }

    /**
     * Gets the value of the osbCorrelationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSBCorrelationId() {
        return osbCorrelationId;
    }

    /**
     * Sets the value of the osbCorrelationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSBCorrelationId(String value) {
        this.osbCorrelationId = value;
    }

    /**
     * Gets the value of the callerSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerSystem() {
        return callerSystem;
    }

    /**
     * Sets the value of the callerSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerSystem(String value) {
        this.callerSystem = value;
    }

    /**
     * Gets the value of the callerUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerUser() {
        return callerUser;
    }

    /**
     * Sets the value of the callerUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerUser(String value) {
        this.callerUser = value;
    }

    /**
     * Gets the value of the callerNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerNode() {
        return callerNode;
    }

    /**
     * Sets the value of the callerNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerNode(String value) {
        this.callerNode = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     */
    public long getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     */
    public void setTimeout(long value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the requestRecordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestRecordCount() {
        return requestRecordCount;
    }

    /**
     * Sets the value of the requestRecordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestRecordCount(Long value) {
        this.requestRecordCount = value;
    }

}
