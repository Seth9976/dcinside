package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.k;
import dagger.internal.g;
import dagger.internal.p;

public final class d implements g {
    private final a a;

    public d(a a0) {
        this.a = a0;
    }

    public static d a(a a0) {
        return new d(a0);
    }

    public k b() {
        return d.c(this.a);
    }

    public static k c(a a0) {
        return (k)p.c(a0.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

