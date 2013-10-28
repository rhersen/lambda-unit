package name.hersen.lambdaunit;

import java.util.function.Consumer;

public class λunit {
    private static Reporter reporter;

    public static void setReporter(Reporter reporter) {
        λunit.reporter = reporter;
    }

    public static void it(String s, Consumer<Object> closure) {
        try {
            closure.accept(null);
            reporter.pass(s);
        } catch (Exception e) {
            reporter.fail(s);
        }
    }

    public static void assertEqual(int expected, int actual) {
        if (expected != actual) throw new IllegalArgumentException();
    }
}

