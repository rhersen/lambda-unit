package name.hersen.lambdaunit;

interface Reporter {
    void pass(String description);

    void fail(String description, AssertionFailedException failure);

    void init(String description);

    void done();
}
