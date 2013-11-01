package name.hersen.lambdaunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class λμηιτImplTest {

    private MockReporter reporter;
    private λμηιτImpl target;

    @Before
    public void setUp() throws Exception {
        reporter = new MockReporter();
        target = new λμηιτImpl(reporter);
    }

    @Test
    public void shouldPass() throws Exception {
        new PassingTest(target).test();
        Assert.assertNotNull(reporter.getPassMessage());
    }

    @Test
    public void shouldFail() throws Exception {
        new FailingTest(target).test();
        Assert.assertNotNull(reporter.getFailMessage());
    }

    @Test
    public void shouldReportExpectedAndActualWhenFailing() throws Exception {
        new FailingTest(target).test();
        Assert.assertEquals(5, reporter.getExpected());
        Assert.assertEquals(4, reporter.getActual());
    }

    @Test
    public void shouldHaveDefaultReporter() throws Exception {
        new FailingTest(new λμηιτImpl()).test();
    }
}

class MockReporter implements Reporter {
    private String passMessage;
    private AssertionFailedException failure;

    public void pass(String description) {
        passMessage = description;
    }

    public void fail(String description, AssertionFailedException failure) {
        this.failure = failure;
    }

    public Object getExpected() {
        return failure.getExpected();
    }

    public Object getActual() {
        return failure.getActual();
    }

    public String getPassMessage() {
        return passMessage;
    }

    public String getFailMessage() {
        return failure.toString();
    }
}

class Subject {
    public int add(int a, int b) {
        return a * b;
    }
}

class PassingTest {

    private λμηιτImpl λ;

    PassingTest(λμηιτImpl λ) {
        this.λ = λ;
    }

    void test() {
        λ.describe("PassingTest", (o1) -> {
            λ.it("should add two and two", (o2) -> {
                Subject subject = new Subject();
                int result = subject.add(2, 2);
                λ.assertEqual(4, result);
            });
        });
    }
}

class FailingTest {

    private λμηιτImpl λ;

    FailingTest(λμηιτImpl λ) {
        this.λ = λ;
    }

    void test() {
        λ.it("should add two and two", (object) -> {
            Subject subject = new Subject();
            int result = subject.add(2, 2);
            λ.assertEqual(5, result);
        });
    }
}
