package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.o;

public class l extends o {
    public static enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS;

        private static a[] a() [...] // Inlined contents
    }

    @NonNull
    private final a a;

    public l(@NonNull a l$a0) {
        this.a = l$a0;
    }

    public l(@NonNull String s, @NonNull a l$a0) {
        super(s);
        this.a = l$a0;
    }

    public l(@NonNull String s, @NonNull a l$a0, @NonNull Throwable throwable0) {
        super(s, throwable0);
        this.a = l$a0;
    }

    @NonNull
    public a a() {
        return this.a;
    }
}

