package io.realm.internal.async;

import io.realm.internal.Keep;

@Keep
public class BadVersionException extends Exception {
    public BadVersionException(String s) {
        super(s);
    }

    public BadVersionException(String s, Throwable throwable0) {
        super(s, throwable0);
    }
}

