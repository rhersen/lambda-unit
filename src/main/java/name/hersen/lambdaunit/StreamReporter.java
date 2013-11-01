package name.hersen.lambdaunit;

import java.io.PrintStream;

public class StreamReporter implements Reporter {
    private PrintStream out;
    private AssertionFailedException failure;

    public StreamReporter(PrintStream out) {
        this.out = out;
    }

    public void pass(String description) {
        out.println("PASS:\t" + description);
    }

    public void fail(String description, AssertionFailedException failure) {
        this.failure = failure;
        out.println("FAIL:\t" + description + "\t" + failure);
    }

    public Object getExpected() {
        return failure.getExpected();
    }

    public Object getActual() {
        return failure.getActual();
    }
}
