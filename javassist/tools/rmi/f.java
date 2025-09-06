package javassist.tools.rmi;

public class f extends RuntimeException {
    private static final long a = 1L;

    public f(Exception exception0) {
        super("by " + exception0.toString());
    }

    public f(String s) {
        super(s);
    }
}

