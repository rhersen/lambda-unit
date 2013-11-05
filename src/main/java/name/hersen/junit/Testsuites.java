
package name.hersen.junit;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}testsuite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tests" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failures" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errors" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testsuite"
})
@XmlRootElement(name = "testsuites")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
public class Testsuites {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected List<Testsuite> testsuite;
    @XmlAttribute(name = "name")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String name;
    @XmlAttribute(name = "time")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String time;
    @XmlAttribute(name = "tests")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String tests;
    @XmlAttribute(name = "failures")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String failures;
    @XmlAttribute(name = "disabled")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String disabled;
    @XmlAttribute(name = "errors")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String errors;

    /**
     * Gets the value of the testsuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testsuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestsuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Testsuite }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public List<Testsuite> getTestsuite() {
        if (testsuite == null) {
            testsuite = new ArrayList<Testsuite>();
        }
        return this.testsuite;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setTests(String value) {
        this.tests = value;
    }

    /**
     * Gets the value of the failures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getFailures() {
        return failures;
    }

    /**
     * Sets the value of the failures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setFailures(String value) {
        this.failures = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setDisabled(String value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setErrors(String value) {
        this.errors = value;
    }

}
