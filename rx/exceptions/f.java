package rx.exceptions;

public class f extends RuntimeException {
    private static final long a = 0xFA2E62320074C675L;

    public f(String s, Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(s, throwable0);
    }

    public f(Throwable throwable0) {
        String s = throwable0 == null ? null : throwable0.getMessage();
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(s, throwable0);
    }
}

