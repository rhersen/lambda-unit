package name.hersen.lambdaunit;

class NotExpect implements Matcher {
    private Object actual;

    NotExpect(Object actual) {
        this.actual = actual;
    }

    public void toBe(Object expected) {
        if (expected.equals(actual)) throw new AssertionFailedException(expected, actual);
    }
}
