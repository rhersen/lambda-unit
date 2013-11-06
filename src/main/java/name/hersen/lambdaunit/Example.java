package name.hersen.lambdaunit;

import static name.hersen.lambdaunit.λμηιτ.*;

public class Example {
    public static void main(String[] args) {
        new Example().test();
    }

    private Multiplier subject;

    void test() {
        describe("Example", (o1) -> {
            beforeEach((o2) -> {
                subject = new Multiplier();
            });

            it("should add two and two", (o2) -> {
                int result = subject.add(2, 2);
                assertEqual(6, result);
            });

            it("should add two and three", (o2) -> {
                int result = subject.add(2, 3);
                assertEqual(6, result);
            });
        });
    }
}

class Multiplier {
    public int add(int a, int b) {
        return a * b;
    }
}
