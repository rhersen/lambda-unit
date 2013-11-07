package name.hersen.lambdaunit;

class Expect {
    private Object actual;

    public Expect(Object actual) {
        this.actual = actual;
    }

    public void toBe(Object expected) {
        if (!expected.equals(actual)) throw new AssertionFailedException(expected, actual);
    }
}
