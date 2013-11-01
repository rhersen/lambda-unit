package name.hersen.lambdaunit;


import static name.hersen.lambdaunit.λμηιτ.*;

public class Example {
    public static void main(String[] args) {
        new Example().test();
    }

    void test() {
        describe("Example", (o1) -> {
            it("should add two and two", (o2) -> {
                Multiplier subject = new Multiplier();
                int result = subject.add(2, 2);
                assertEqual(5, result);
            });

            it("should add two and three", (o2) -> {
                Multiplier subject = new Multiplier();
                int result = subject.add(2, 3);
                assertEqual(5, result);
            });
        });
    }
}

class Multiplier {
    public int add(int a, int b) {
        return a + b;
    }
}
