package rx.exceptions;

public final class i extends RuntimeException {
    private static final long a = 0x3FC38E1F743AA0EEL;

    public i(String s, Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(s, throwable0);
    }

    public i(Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(throwable0);
    }
}

