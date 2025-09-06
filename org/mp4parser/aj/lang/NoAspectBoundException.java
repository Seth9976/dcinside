package org.mp4parser.aj.lang;

public class NoAspectBoundException extends RuntimeException {
    Throwable cause;

    public NoAspectBoundException() {
    }

    public NoAspectBoundException(String s, Throwable throwable0) {
        if(throwable0 != null) {
            s = "Exception while initializing " + s + ": " + throwable0;
        }
        super(s);
        this.cause = throwable0;
    }

    @Override
    public Throwable getCause() {
        return this.cause;
    }
}

