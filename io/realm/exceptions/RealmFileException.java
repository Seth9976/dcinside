package io.realm.exceptions;

import io.realm.internal.Keep;
import java.util.Locale;

@Keep
public class RealmFileException extends RuntimeException {
    @Keep
    public static enum Kind {
        ACCESS_ERROR,
        BAD_HISTORY,
        PERMISSION_DENIED,
        EXISTS,
        NOT_FOUND,
        INCOMPATIBLE_LOCK_FILE,
        FORMAT_UPGRADE_REQUIRED,
        INCOMPATIBLE_SYNC_FILE;

        static Kind getKind(byte b) {
            switch(b) {
                case 0: {
                    return Kind.ACCESS_ERROR;
                }
                case 1: {
                    return Kind.BAD_HISTORY;
                }
                case 2: {
                    return Kind.PERMISSION_DENIED;
                }
                case 3: {
                    return Kind.EXISTS;
                }
                case 4: {
                    return Kind.NOT_FOUND;
                }
                case 5: {
                    return Kind.INCOMPATIBLE_LOCK_FILE;
                }
                case 6: {
                    return Kind.FORMAT_UPGRADE_REQUIRED;
                }
                case 7: {
                    return Kind.INCOMPATIBLE_SYNC_FILE;
                }
                default: {
                    throw new RuntimeException("Unknown value for RealmFileException kind.");
                }
            }
        }
    }

    private final Kind kind;

    public RealmFileException(byte b, String s) {
        super(s);
        this.kind = Kind.getKind(b);
    }

    public RealmFileException(Kind realmFileException$Kind0, String s) {
        super(s);
        this.kind = realmFileException$Kind0;
    }

    public RealmFileException(Kind realmFileException$Kind0, String s, Throwable throwable0) {
        super(s, throwable0);
        this.kind = realmFileException$Kind0;
    }

    public RealmFileException(Kind realmFileException$Kind0, Throwable throwable0) {
        super(throwable0);
        this.kind = realmFileException$Kind0;
    }

    public Kind getKind() {
        return this.kind;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s Kind: %s.", super.toString(), this.kind);
    }
}

