
package name.hersen.junit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _SystemErr_QNAME = new QName("", "system-err");
    private final static QName _Skipped_QNAME = new QName("", "skipped");
    private final static QName _SystemOut_QNAME = new QName("", "system-out");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: name.hersen.junit
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Testsuite }
     * 
     */
    public Testsuite createTestsuite() {
        return new Testsuite();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Testcase }
     * 
     */
    public Testcase createTestcase() {
        return new Testcase();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Failure }
     * 
     */
    public Failure createFailure() {
        return new Failure();
    }

    /**
     * Create an instance of {@link Testsuites }
     * 
     */
    public Testsuites createTestsuites() {
        return new Testsuites();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "system-err")
    public JAXBElement<String> createSystemErr(String value) {
        return new JAXBElement<>(_SystemErr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "skipped")
    public JAXBElement<String> createSkipped(String value) {
        return new JAXBElement<>(_Skipped_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "system-out")
    public JAXBElement<String> createSystemOut(String value) {
        return new JAXBElement<>(_SystemOut_QNAME, String.class, null, value);
    }

}
