package com.google.firebase.perf.injection.modules;

import dagger.internal.g;
import dagger.internal.p;
import h2.b;

public final class h implements g {
    private final a a;

    public h(a a0) {
        this.a = a0;
    }

    public static h a(a a0) {
        return new h(a0);
    }

    public b b() {
        return h.c(this.a);
    }

    public static b c(a a0) {
        return (b)p.c(a0.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

