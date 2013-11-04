package name.hersen.lambdaunit;

import java.util.function.Consumer;

class λμηιτImpl {
    private Reporter reporter;

    λμηιτImpl(Reporter reporter) {
        this.reporter = reporter;
    }

    λμηιτImpl() {
        this(new PrintStreamReporter(System.out));
    }

    void describe(String description, Consumer<Object> closure) {
        closure.accept(null);
    }

    void it(String description, Consumer<Object> closure) {
        try {
            closure.accept(null);
            reporter.pass(description);
        } catch (AssertionFailedException e) {
            reporter.fail(description, e);
        }
    }

    void assertEqual(int expected, int actual) {
        if (expected != actual) throw new AssertionFailedException(expected, actual);
    }
}

