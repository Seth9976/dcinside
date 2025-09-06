package com.google.firebase.perf.injection.modules;

import com.google.firebase.h;
import dagger.internal.g;
import dagger.internal.p;

public final class c implements g {
    private final a a;

    public c(a a0) {
        this.a = a0;
    }

    public static c a(a a0) {
        return new c(a0);
    }

    public h b() {
        return c.c(this.a);
    }

    public static h c(a a0) {
        return (h)p.c(a0.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

