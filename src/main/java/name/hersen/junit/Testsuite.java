
package name.hersen.junit;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "properties",
    "testcase",
    "systemOut",
    "systemErr"
})
@XmlRootElement(name = "testsuite")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
public class Testsuite {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected Properties properties;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected List<Testcase> testcase;
    @XmlElement(name = "system-out")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String systemOut;
    @XmlElement(name = "system-err")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String systemErr;
    @XmlAttribute(name = "name", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String name;
    @XmlAttribute(name = "tests", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String tests;
    @XmlAttribute(name = "failures")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String failures;
    @XmlAttribute(name = "errors")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String errors;
    @XmlAttribute(name = "time")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String time;
    @XmlAttribute(name = "disabled")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String disabled;
    @XmlAttribute(name = "skipped")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String skipped;
    @XmlAttribute(name = "timestamp")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String timestamp;
    @XmlAttribute(name = "hostname")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String hostname;
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String id;
    @XmlAttribute(name = "package")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    protected String _package;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the testcase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testcase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestcase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Testcase }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public List<Testcase> getTestcase() {
        if (testcase == null) {
            testcase = new ArrayList<Testcase>();
        }
        return this.testcase;
    }

    /**
     * Gets the value of the systemOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getSystemOut() {
        return systemOut;
    }

    /**
     * Sets the value of the systemOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setSystemOut(String value) {
        this.systemOut = value;
    }

    /**
     * Gets the value of the systemErr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getSystemErr() {
        return systemErr;
    }

    /**
     * Sets the value of the systemErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setSystemErr(String value) {
        this.systemErr = value;
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
     * Gets the value of the skipped property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getSkipped() {
        return skipped;
    }

    /**
     * Sets the value of the skipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setSkipped(String value) {
        this.skipped = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-11-04T08:43:24+01:00", comments = "JAXB RI v2.2.8-b20130806.1801")
    public void setPackage(String value) {
        this._package = value;
    }

}
