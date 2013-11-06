package name.hersen.lambdaunit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

class λμηιτε {
    private Reporter reporter;
    private Deque<Consumer<Object>> eachs;
    private Deque<Consumer<Object>> its;

    λμηιτε(Reporter reporter) {
        this.reporter = reporter;
        eachs = new ArrayDeque<>();
        its = new ArrayDeque<>();
    }

    λμηιτε() {
        this(new PrintStreamReporter(System.out));
    }

    void describe(String description, Consumer<Object> closure) {
        reporter.init(description);
        closure.accept(null);

        for (Consumer<Object> consumer : eachs) {
            consumer.accept(null);
        }

        for (Consumer<Object> consumer : its) {
            try {
                consumer.accept(null);
                reporter.pass(description);
            } catch (AssertionFailedException e) {
                reporter.fail(description, e);
            }
        }

        reporter.done();
    }

    void it(String description, Consumer<Object> closure) {
        its.push(closure);
    }

    void assertEqual(int expected, int actual) {
        if (expected != actual) throw new AssertionFailedException(expected, actual);
    }

    public void beforeEach(Consumer<Object> closure) {
        eachs.push(closure);
    }
}

