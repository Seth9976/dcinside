package javassist;

public class E extends Exception {
    private static final long a = 1L;

    public E(String s) {
        super(s);
    }

    public E(String s, Exception exception0) {
        super(s + " because of " + exception0.toString());
    }
}

