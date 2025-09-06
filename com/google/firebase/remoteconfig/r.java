package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.o;

public class r extends o {
    public static enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int a;

        private a(int v1) {
            this.a = v1;
        }

        private static a[] a() [...] // Inlined contents

        public int b() {
            return this.a;
        }
    }

    private final a a;

    public r(@NonNull String s) {
        super(s);
        this.a = a.b;
    }

    public r(@NonNull String s, @NonNull a r$a0) {
        super(s);
        this.a = r$a0;
    }

    public r(@NonNull String s, @Nullable Throwable throwable0) {
        super(s, throwable0);
        this.a = a.b;
    }

    public r(@NonNull String s, @Nullable Throwable throwable0, @NonNull a r$a0) {
        super(s, throwable0);
        this.a = r$a0;
    }

    @NonNull
    public a a() {
        return this.a;
    }
}

