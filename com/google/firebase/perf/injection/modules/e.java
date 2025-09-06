package com.google.firebase.perf.injection.modules;

import dagger.internal.g;
import dagger.internal.p;
import h2.b;

public final class e implements g {
    private final a a;

    public e(a a0) {
        this.a = a0;
    }

    public static e a(a a0) {
        return new e(a0);
    }

    public b b() {
        return e.c(this.a);
    }

    public static b c(a a0) {
        return (b)p.c(a0.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

