package name.hersen.lambdaunit;

import name.hersen.junit.*;

class JunitReporter implements Reporter {

    private final ObjectFactory factory = new ObjectFactory();
    private Testsuites root = factory.createTestsuites();
    private Testsuite testsuite;
    private int tests;

    public void pass(String description) {
        ++tests;
        Testcase c = createTestcase(description);
        testsuite.getTestcase().add(c);
    }

    public void fail(String description, AssertionFailedException failure) {
        ++tests;
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
        tests = 0;
    }

    public void done() {
        testsuite.setTests(Integer.toString(tests));
    }

    Testsuites getReport() {
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
