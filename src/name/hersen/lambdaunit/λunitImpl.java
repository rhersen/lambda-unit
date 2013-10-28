package name.hersen.lambdaunit;

import java.util.function.Consumer;

class λunitImpl {
    private Reporter reporter;

    λunitImpl(Reporter reporter) {
        this.reporter = reporter;
    }

    λunitImpl() {
        this(new StreamReporter(System.out));
    }

    void it(String s, Consumer<Object> closure) {
        try {
            closure.accept(null);
            reporter.pass(s);
        } catch (Exception e) {
            reporter.fail(s);
        }
    }

    void assertEqual(int expected, int actual) {
        if (expected != actual) throw new IllegalArgumentException();
    }
}

