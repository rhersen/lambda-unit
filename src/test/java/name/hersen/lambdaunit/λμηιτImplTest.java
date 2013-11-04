package name.hersen.lambdaunit;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class λμηιτImplTest {

    private Reporter reporter;
    private λμηιτImpl target;

    @Before
    public void setUp() throws Exception {
        reporter = mock(Reporter.class);
        target = new λμηιτImpl(reporter);
    }

    @Test
    public void shouldPass() throws Exception {
        new PassingTest(target).test();
        verify(reporter).pass(any());
    }

    @Test
    public void shouldFail() throws Exception {
        new FailingTest(target).test();
        verify(reporter).fail(any(), any());
    }

    @Test
    public void shouldHaveDefaultReporter() throws Exception {
        new FailingTest(new λμηιτImpl()).test();
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
