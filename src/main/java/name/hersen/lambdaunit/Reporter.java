package name.hersen.lambdaunit;

public interface Reporter {
    void pass(String description);

    void fail(String description, AssertionFailedException failure);

}
