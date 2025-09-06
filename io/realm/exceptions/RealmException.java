package io.realm.exceptions;

import io.realm.internal.Keep;

@Keep
public final class RealmException extends RuntimeException {
    public RealmException(String s) {
        super(s);
    }

    public RealmException(String s, Throwable throwable0) {
        super(s, throwable0);
    }
}

