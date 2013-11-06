package name.hersen.lambdaunit;

import java.util.function.Consumer;

public class WrappedClosure {
    private Consumer<Object> closure;
    private String description;

    public WrappedClosure(String description, Consumer<Object> closure) {
        this.closure = closure;
        this.description = description;
    }

    public Consumer<Object> getClosure() {
        return closure;
    }

    public String getDescription() {
        return description;
    }
}
