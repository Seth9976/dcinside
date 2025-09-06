package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class h {
    public static enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD;

    }

    public static h a() {
        return new b(a.c, -1L);
    }

    public abstract long b();

    public abstract a c();

    public static h d() {
        return new b(a.d, -1L);
    }

    public static h e(long v) {
        return new b(a.a, v);
    }

    public static h f() {
        return new b(a.b, -1L);
    }
}

