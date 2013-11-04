package name.hersen.lambdaunit;

import java.io.PrintStream;

public class PrintStreamReporter implements Reporter {
    private PrintStream out;

    public PrintStreamReporter(PrintStream out) {
        this.out = out;
    }

    public void pass(String description) {
        out.println("PASS:\t" + description);
    }

    public void fail(String description, AssertionFailedException failure) {
        out.println("FAIL:\t" + description + "\t" + failure);
    }

}
