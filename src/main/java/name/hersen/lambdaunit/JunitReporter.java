package name.hersen.lambdaunit;

import name.hersen.junit.*;

public class JunitReporter implements Reporter {

    private final ObjectFactory factory = new ObjectFactory();
    private Testsuites root = factory.createTestsuites();
    private Testsuite testsuite;

    public void pass(String description) {
        Testcase c = createTestcase(description);
        testsuite.getTestcase().add(c);
    }

    public void fail(String description, AssertionFailedException failure) {
        Testcase c = createTestcase(description);
        Failure f = factory.createFailure();
        f.setContent(description);
        c.getFailure().add(f);
        testsuite.getTestcase().add(c);
    }

    public void init(String description) {
        testsuite = createTestsuite();
        root.getTestsuite().add(testsuite);
        testsuite.setName(description);
    }

    public Testsuites getReport() {
        return root;
    }

    private Testcase createTestcase(String description) {
        Testcase c = factory.createTestcase();
        c.setName(description);
        return c;
    }

    private Testsuite createTestsuite() {
        return factory.createTestsuite();
    }

}
