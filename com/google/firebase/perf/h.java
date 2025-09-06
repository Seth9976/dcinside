package com.google.firebase.perf;

import com.google.firebase.installations.k;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import dagger.internal.g;
import h2.b;
import r3.c;

public final class h implements g {
    private final c a;
    private final c b;
    private final c c;
    private final c d;
    private final c e;
    private final c f;
    private final c g;

    public h(c c0, c c1, c c2, c c3, c c4, c c5, c c6) {
        this.a = c0;
        this.b = c1;
        this.c = c2;
        this.d = c3;
        this.e = c4;
        this.f = c5;
        this.g = c6;
    }

    public static h a(c c0, c c1, c c2, c c3, c c4, c c5, c c6) {
        return new h(c0, c1, c2, c3, c4, c5, c6);
    }

    public e b() {
        return h.c(((com.google.firebase.h)this.a.get()), ((b)this.b.get()), ((k)this.c.get()), ((b)this.d.get()), ((RemoteConfigManager)this.e.get()), ((a)this.f.get()), ((SessionManager)this.g.get()));
    }

    public static e c(com.google.firebase.h h0, b b0, k k0, b b1, RemoteConfigManager remoteConfigManager0, a a0, SessionManager sessionManager0) {
        return new e(h0, b0, k0, b1, remoteConfigManager0, a0, sessionManager0);
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

