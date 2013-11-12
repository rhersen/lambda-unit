package name.hersen.lambdaunit.matchers;

public class AssertionFailedException extends RuntimeException {
    private Object expected;
    private Object actual;

    public String toString() {
        return "expected " + expected + " but got " + actual;
    }

    public AssertionFailedException(Object expected, Object actual) {
        this.expected = expected;
        this.actual = actual;
    }
}
