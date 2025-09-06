package com.google.firebase.perf.injection.modules;

import dagger.internal.g;
import dagger.internal.p;

public final class b implements g {
    private final a a;

    public b(a a0) {
        this.a = a0;
    }

    public static b a(a a0) {
        return new b(a0);
    }

    public com.google.firebase.perf.config.a b() {
        return b.c(this.a);
    }

    public static com.google.firebase.perf.config.a c(a a0) {
        return (com.google.firebase.perf.config.a)p.c(a0.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

