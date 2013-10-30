package name.hersen.lambdaunit;


public class Example {
    public static void main(String[] args) {
        new Example().describe();
    }

    void describe() {
        λunit.it("should add two and two", (object) -> {
            Multiplier subject = new Multiplier();
            int result = subject.add(2, 2);
            λunit.assertEqual(5, result);
        });
    }

}

class Multiplier {
    public int add(int a, int b) {
        return a + b;
    }
}
