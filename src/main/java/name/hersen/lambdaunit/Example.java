package name.hersen.lambdaunit;

import static name.hersen.lambdaunit.λμηιτ.*;

public class Example {
    public static void main(String[] args) {
        new Example().test();
    }

    void test() {
        describe("A suite", (d) -> {
            it("contains spec with an expectation", (o) -> {
                expect(true).toBe(true);
            });
        });
    }
}

