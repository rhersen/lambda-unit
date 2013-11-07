package name.hersen.lambdaunit;

import java.util.function.Consumer;

public class λμηιτ {
    private static final λμηιτε εκτέλεση = new λμηιτε();

    public static void describe(String description, Consumer<Object> closure) {
        εκτέλεση.describe(description, closure);
    }

    public static Expect expect(Object actual) {
        return εκτέλεση.expect(actual);
    }

    public static void it(String s, Consumer<Object> closure) {
        εκτέλεση.it(s, closure);
    }

    public static void beforeEach(Consumer<Object> closure) {
        εκτέλεση.beforeEach(closure);
    }
}
