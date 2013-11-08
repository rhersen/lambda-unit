package name.hersen.lambdaunit;

import java.util.function.Consumer;

public class λμηιτ {
    private static final λμηιτε εκτέλεση = new λμηιτε();

    /**
     * Defines a test suite.
     *
     * @param description test suite heading
     * @param closure     the contents of the test suite, which usually consists of it() and beforeEach() calls
     */
    public static void describe(String description, Consumer<Object> closure) {
        εκτέλεση.describe(description, closure);
    }

    /**
     * BDD-style chainable expectation entry point.
     *
     * @param actual the value to do subsequent assertions on.
     * @return an object that has methods like toBe() which are usually called in a chain.
     */
    public static Expect expect(Object actual) {
        return εκτέλεση.expect(actual);
    }

    /**
     * Defines a test case.
     *
     * @param s       test case description
     * @param closure the contents of the test case, which usually contains at least one expect() assertion
     */
    public static void it(String s, Consumer<Object> closure) {
        εκτέλεση.it(s, closure);
    }

    /**
     * Defines setup code for the test cases in the containing suite.
     *
     * @param closure the setup
     */
    public static void beforeEach(Consumer<Object> closure) {
        εκτέλεση.beforeEach(closure);
    }
}
