package name.hersen.lambdaunit;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class λμηιτεTest {

    private Reporter reporter;
    private λμηιτε target;

    @Before
    public void setUp() {
        reporter = mock(Reporter.class);
        target = new λμηιτε(reporter);
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
    public void shouldCallInitAndDone() {
        new MultipleTest(target).test();
        verify(reporter).init(any());
        verify(reporter).done();
    }

    @Test
    public void shouldHaveDefaultReporter() {
        new FailingTest(new λμηιτε()).test();
    }
}

class Subject {
    public int add(int a, int b) {
        return a * b;
    }
}

class PassingTest {

    private λμηιτε λ;

    PassingTest(λμηιτε λ) {
        this.λ = λ;
    }

    void test() {
        λ.describe("PassingTest", (o1) ->
                λ.it("should add two and two", (o2) -> {
                    Subject subject = new Subject();
                    int result = subject.add(2, 2);
                    λ.expect(result).toBe(4);
                    λ.expect(result).not.toBe(5);
                }));
    }
}

class FailingTest {

    private λμηιτε λ;

    FailingTest(λμηιτε λ) {
        this.λ = λ;
    }

    void test() {
        λ.describe("FailingTest", (o1) ->
                λ.it("should add two and two", (object) -> {
                    Subject subject = new Subject();
                    int result = subject.add(2, 2);
                    λ.expect(result).not.toBe(4);
                }));
    }
}

class MultipleTest {

    private λμηιτε λ;

    MultipleTest(λμηιτε λ) {
        this.λ = λ;
    }

    Subject subject;

    void test() {
        λ.describe("MultipleTest", (o0) -> {
            λ.beforeEach((o) -> {
                subject = new Subject();
            });

            λ.it("should add two and two", (o) -> {
                int result = subject.add(2, 2);
                λ.expect(result).toBe(4);
                subject = null;
            });

            λ.it("should add two and two", (o) -> {
                int result = subject.add(2, 2);
                λ.expect(result).toBe(5);
            });
        });
    }
}

