package name.hersen.lambdaunit;

class Expect implements Matcher {
    private Object actual;
    public Matcher not;

    Expect(Object actual) {
        this.actual = actual;
        not = new NotExpect(this.actual);
    }

    public void toBe(Object expected) {
        if (!expected.equals(actual)) throw new AssertionFailedException(expected, actual);
    }
}
