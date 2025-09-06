package javassist.tools.reflect;

public class a extends Exception {
    private static final long a = 1L;

    public a(Exception exception0) {
        super("by " + exception0.toString());
    }

    public a(String s) {
        super(s);
    }
}

