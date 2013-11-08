package name.hersen.lambdaunit;

class Expect {
    private Object actual;

    Expect(Object actual) {
        this.actual = actual;
    }

    void toBe(Object expected) {
        if (!expected.equals(actual)) throw new AssertionFailedException(expected, actual);
    }
}
