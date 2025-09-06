package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

public final class e extends IOException {
    private final int a;
    private static final long b = 1L;
    public static final int c = -1;

    public e(int v) {
        this("Http request failed", v);
    }

    @Deprecated
    public e(String s) {
        this(s, -1);
    }

    public e(String s, int v) {
        this(s, v, null);
    }

    public e(String s, int v, @Nullable Throwable throwable0) {
        super(s + ", status code: " + v, throwable0);
        this.a = v;
    }

    public int a() {
        return this.a;
    }
}

