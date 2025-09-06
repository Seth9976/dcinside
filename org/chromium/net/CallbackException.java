package org.chromium.net;

public abstract class CallbackException extends CronetException {
    protected CallbackException(String s, Throwable throwable0) {
        super(s, throwable0);
    }
}

