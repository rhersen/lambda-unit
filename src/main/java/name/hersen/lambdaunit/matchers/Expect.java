package name.hersen.lambdaunit.matchers;

public class Expect implements Matcher {
    private Object actual;
    public Matcher not;

    public Expect(Object actual) {
        this.actual = actual;
        not = new NotExpect(this.actual);
    }

    public void toBe(Object expected) {
        if (!expected.equals(actual)) throw new AssertionFailedException(expected, actual);
    }
}
