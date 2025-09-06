package javassist.bytecode;

public class e extends Exception {
    private static final long a = 1L;

    public e(int v) {
        super("bytecode " + v);
    }

    public e(String s) {
        super(s);
    }

    public e(String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public e(T t0, Throwable throwable0) {
        super(t0.toString() + " in " + t0.g().C() + ": " + throwable0.getMessage(), throwable0);
    }
}

