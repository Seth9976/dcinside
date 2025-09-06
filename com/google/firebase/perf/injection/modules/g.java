package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import dagger.internal.p;

public final class g implements dagger.internal.g {
    private final a a;

    public g(a a0) {
        this.a = a0;
    }

    public static g a(a a0) {
        return new g(a0);
    }

    public SessionManager b() {
        return g.c(this.a);
    }

    public static SessionManager c(a a0) {
        return (SessionManager)p.c(a0.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

