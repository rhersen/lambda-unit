package name.hersen.lambdaunit;

import java.util.function.Consumer;

class WrappedClosure {
    private Consumer<Object> closure;
    private String description;

    WrappedClosure(String description, Consumer<Object> closure) {
        this.closure = closure;
        this.description = description;
    }

    Consumer<Object> getClosure() {
        return closure;
    }

    String getDescription() {
        return description;
    }
}
