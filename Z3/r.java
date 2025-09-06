package z3;

import y4.m;

public class r extends Error {
    public r() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public r(@m String s) {
        super(s);
    }

    public r(@m String s, @m Throwable throwable0) {
        super(s, throwable0);
    }

    public r(@m Throwable throwable0) {
        super(throwable0);
    }
}

