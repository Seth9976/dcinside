package javassist.tools.rmi;

public class d extends Exception {
    private static final long a = 1L;

    public d(String s) {
        super(s + " is not exported");
    }

    public d(String s, Exception exception0) {
        super(s + " because of " + exception0.toString());
    }
}

