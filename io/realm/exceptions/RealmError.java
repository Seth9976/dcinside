package io.realm.exceptions;

import io.realm.internal.Keep;

@Keep
public final class RealmError extends Error {
    public RealmError(String s) {
        super(s);
    }
}

