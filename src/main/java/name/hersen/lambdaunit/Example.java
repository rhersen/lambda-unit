package name.hersen.lambdaunit;

import static name.hersen.lambdaunit.λμηιτ.*;

public class Example {
    public static void main(String[] args) {
        new Example().test();
    }

    void test() {
        describe("The 'toBe' matcher compares with ===", (d) -> {
            it("and has a positive case ", (o) -> {
                expect(true).toBe(true);
            });
            it("and can have a negative case", (o) -> {
                expect(false).not.toBe(true);
            });
        });
    }
}

