package name.hersen.lambdaunit;

import name.hersen.junit.Failure;
import name.hersen.junit.Testcase;
import name.hersen.junit.Testsuite;
import name.hersen.lambdaunit.matchers.AssertionFailedException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class JunitReporterTest {

    private JunitReporter subject;

    @Before
    public void setUp() throws Exception {
        subject = new JunitReporter();
        subject.init("name");
    }

    @Test
    public void passContainsNoFailures() throws Exception {
        subject.pass("description");

        List<Failure> failures = subject.getReport().getTestsuite().get(0).getTestcase().get(0).getFailure();
        Assert.assertTrue(failures.isEmpty());
    }

    @Test
    public void testcaseMustHaveName() throws Exception {
        subject.pass("description");

        Testcase testcase = subject.getReport().getTestsuite().get(0).getTestcase().get(0);
        Assert.assertEquals("description", testcase.getName());
    }

    @Test
    public void testsuiteMustHaveName() throws Exception {
        subject.pass("description");

        Testsuite testsuite = subject.getReport().getTestsuite().get(0);
        Assert.assertEquals("name", testsuite.getName());
    }

    @Test
    public void testsuiteMustHaveTests() throws Exception {
        subject.pass("description");
        subject.done();

        Testsuite testsuite = subject.getReport().getTestsuite().get(0);
        Assert.assertEquals("1", testsuite.getTests());
    }

    @Test
    public void failureHasContent() throws Exception {
        String description = "description";

        subject.fail(description, new AssertionFailedException(4, 5));

        List<Failure> failures = subject.getReport().getTestsuite().get(0).getTestcase().get(0).getFailure();
        Assert.assertEquals(description, failures.get(0).getContent());
    }
}
