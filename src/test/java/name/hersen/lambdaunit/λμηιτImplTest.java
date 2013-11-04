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
    public void setUp() {
        reporter = mock(Reporter.class);
        target = new λμηιτImpl(reporter);
    }

    @Test
    public void shouldPass() {
        new PassingTest(target).test();
        verify(reporter).pass(any());
    }

    @Test
    public void shouldFail() {
        new FailingTest(target).test();
        verify(reporter).fail(any(), any());
    }

    @Test
    public void shouldPassAndFail() {
        new MultipleTest(target).test();
        verify(reporter).pass(any());
        verify(reporter).fail(any(), any());
    }

    @Test
    public void shouldHaveDefaultReporter() {
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
        λ.describe("PassingTest", (o1) ->
                λ.it("should add two and two", (o2) -> {
                    Subject subject = new Subject();
                    int result = subject.add(2, 2);
                    λ.assertEqual(4, result);
                }));
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

class MultipleTest {

    private λμηιτImpl λ;

    MultipleTest(λμηιτImpl λ) {
        this.λ = λ;
    }

    void test() {
        λ.describe("PassingTest", (o1) -> {
            λ.it("should add two and two", (o2) -> {
                Subject subject = new Subject();
                int result = subject.add(2, 2);
                λ.assertEqual(4, result);
            });

            λ.it("should add two and two", (object) -> {
                Subject subject = new Subject();
                int result = subject.add(2, 2);
                λ.assertEqual(5, result);
            });
        });
    }
}

