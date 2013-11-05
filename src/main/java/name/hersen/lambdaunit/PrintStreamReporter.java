package name.hersen.lambdaunit;

import java.io.PrintStream;

public class PrintStreamReporter implements Reporter {
    private PrintStream out;
    private int tests;

    public PrintStreamReporter(PrintStream out) {
        this.out = out;
    }

    public void pass(String description) {
        ++tests;
        out.println("PASS:\t" + description);
    }

    public void fail(String description, AssertionFailedException failure) {
        ++tests;
        out.println("FAIL:\t" + description + "\t" + failure);
    }

    public void init(String description) {
        out.println(description);
    }

    public void done() {
        out.println(tests);
    }

}
