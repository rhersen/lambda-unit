package name.hersen.lambdaunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class λunitTest {

    private MockReporter reporter;

    @Before
    public void setUp() throws Exception {
        reporter = new MockReporter();
        λunit.setReporter(reporter);
    }

    @Test
    public void shouldPass() throws Exception {
        new PassingTest().describe();
        Assert.assertNotNull(reporter.getPassMessage());
    }

    @Test
    public void shouldFail() throws Exception {
        new FailingTest().describe();
        Assert.assertNotNull(reporter.getFailMessage());
    }
}

class MockReporter implements Reporter {
    private String passMessage;
    private String failMessage;

    @Override
    public void pass(String s) {
        passMessage = s;
    }

    @Override
    public void fail(String s) {
        failMessage = s;
    }

    public String getPassMessage() {
        return passMessage;
    }

    public String getFailMessage() {
        return failMessage;
    }
}

class Subject {
    public int add(int a, int b) {
        return a * b;
    }
}

class PassingTest {
    void describe() {
        λunit.it("should add two and two", (object) -> {
            Subject subject = new Subject();
            int result = subject.add(2, 2);
            λunit.assertEqual(4, result);
        });
    }
}

class FailingTest {
    void describe() {
        λunit.it("should add two and two", (object) -> {
            Subject subject = new Subject();
            int result = subject.add(2, 2);
            λunit.assertEqual(5, result);
        });
    }
}
