
package name.hersen.junit;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "failure")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
public class Failure {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String content;
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String type;
    @XmlAttribute(name = "message")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String message;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setMessage(String value) {
        this.message = value;
    }

}
