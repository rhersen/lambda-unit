package name.hersen.lambdaunit;

import name.hersen.lambdaunit.matchers.AssertionFailedException;

interface Reporter {
    void pass(String description);

    void fail(String description, AssertionFailedException failure);

    void init(String description);

    void done();
}
