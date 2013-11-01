package name.hersen.lambdaunit;

import java.util.function.Consumer;

public class λunit {
    private static final λunitImpl delegate = new λunitImpl();

    public static void describe(String description, Consumer<Object> closure) {
        delegate.describe(description, closure);
    }

    public static void assertEqual(int expected, int actual) {
        delegate.assertEqual(expected, actual);
    }

    public static void it(String s, Consumer<Object> closure) {
        delegate.it(s, closure);
    }
}
