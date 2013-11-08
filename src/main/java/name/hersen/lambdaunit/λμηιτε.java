package name.hersen.lambdaunit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

class λμηιτε {
    private Reporter reporter;
    private Deque<Consumer<Object>> eachs;
    private Deque<WrappedClosure> its;

    λμηιτε(Reporter reporter) {
        this.reporter = reporter;
        eachs = new ArrayDeque<>();
        its = new ArrayDeque<>();
    }

    λμηιτε() {
        this(new PrintStreamReporter(System.out));
    }

    void describe(String name, Consumer<Object> closure) {
        reporter.init(name);
        closure.accept(null);

        for (WrappedClosure wrapped : its) {
            for (Consumer<Object> consumer : eachs) {
                consumer.accept(null);
            }

            try {
                wrapped.getClosure().accept(null);
                reporter.pass(wrapped.getDescription());
            } catch (AssertionFailedException e) {
                reporter.fail(wrapped.getDescription(), e);
            }
        }

        reporter.done();
    }

    void it(String description, Consumer<Object> closure) {
        its.add(new WrappedClosure(description, closure));
    }

    Expect expect(Object actual) {
        return new Expect(actual);
    }

    void beforeEach(Consumer<Object> closure) {
        eachs.add(closure);
    }
}

