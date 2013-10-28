package name.hersen.lambdaunit;

import java.io.PrintStream;

public class StreamReporter implements Reporter {
    private PrintStream out;

    public StreamReporter(PrintStream out) {
        this.out = out;
    }

    public void pass(String s) {
        out.println("PASS:\t" + s);
    }

    public void fail(String s) {
        out.println("FAIL:\t" + s);
    }
}
