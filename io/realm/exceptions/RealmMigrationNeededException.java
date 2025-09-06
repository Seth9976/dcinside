package io.realm.exceptions;

import io.realm.internal.Keep;

@Keep
public final class RealmMigrationNeededException extends RuntimeException {
    private final String canonicalRealmPath;

    public RealmMigrationNeededException(String s, String s1) {
        super(s1);
        this.canonicalRealmPath = s;
    }

    public String getPath() {
        return this.canonicalRealmPath;
    }
}

