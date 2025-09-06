package rx.exceptions;

public final class e extends RuntimeException {
    private static final long a = 0x77A98E42BD159A4AL;

    public e(String s, Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(s, throwable0);
    }

    public e(Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(throwable0);
    }
}

