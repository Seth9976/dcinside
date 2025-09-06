package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import dagger.internal.g;
import dagger.internal.p;

public final class f implements g {
    private final a a;

    public f(a a0) {
        this.a = a0;
    }

    public static f a(a a0) {
        return new f(a0);
    }

    public RemoteConfigManager b() {
        return f.c(this.a);
    }

    public static RemoteConfigManager c(a a0) {
        return (RemoteConfigManager)p.c(a0.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

