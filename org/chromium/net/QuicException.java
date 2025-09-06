package org.chromium.net;

public abstract class QuicException extends NetworkException {
    protected QuicException(String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public abstract int getQuicDetailedErrorCode();
}

