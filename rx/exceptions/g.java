package rx.exceptions;

public class g extends RuntimeException {
    private static final long a = -6298857009889503852L;

    public g(String s, Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(s, throwable0);
    }

    public g(Throwable throwable0) {
        String s = throwable0 == null ? null : throwable0.getMessage();
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(s, throwable0);
    }
}

