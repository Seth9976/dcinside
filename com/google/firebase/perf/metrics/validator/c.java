package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.util.k;
import com.google.firebase.perf.v1.q.d;
import com.google.firebase.perf.v1.q;
import java.net.URI;

final class c extends e {
    private final q a;
    private final Context b;
    private static final a c = null;
    private static final String d = "http";
    private static final String e = "https";
    private static final int f = -1;

    static {
        c.c = a.e();
    }

    c(q q0, Context context0) {
        this.b = context0;
        this.a = q0;
    }

    // 去混淆评级： 中等(155)
    @Override  // com.google.firebase.perf.metrics.validator.e
    public boolean c() {
        c.c.l("URL is missing:");
        return false;
    }

    @Nullable
    private URI g(@Nullable String s) {
        if(s == null) {
            return null;
        }
        try {
            return URI.create(s);
        }
        catch(IllegalArgumentException | IllegalStateException illegalArgumentException0) {
            c.c.m("getResultUrl throws exception %s", new Object[]{illegalArgumentException0.getMessage()});
            return null;
        }
    }

    private boolean h(@Nullable URI uRI0, @NonNull Context context0) {
        return uRI0 == null ? false : k.a(uRI0, context0);
    }

    private boolean i(@Nullable String s) {
        return s == null ? true : s.trim().isEmpty();
    }

    private boolean j(@Nullable String s) [...] // 潜在的解密器

    private boolean k(@Nullable String s) {
        return s != null && !this.i(s) && s.length() <= 0xFF;
    }

    boolean l(@Nullable d q$d0) {
        return q$d0 != null && q$d0 != d.b;
    }

    private boolean m(int v) {
        return v > 0;
    }

    private boolean n(long v) {
        return v >= 0L;
    }

    private boolean o(int v) {
        return v == -1 || v > 0;
    }

    // 去混淆评级： 低(30)
    private boolean p(@Nullable String s) {
        return s == null ? false : "http".equalsIgnoreCase(s) || "https".equalsIgnoreCase(s);
    }

    private boolean q(long v) {
        return v >= 0L;
    }

    private boolean r(@Nullable String s) {
        return s == null;
    }
}

