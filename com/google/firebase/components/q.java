package com.google.firebase.components;

import h2.b;

public final class q implements b {
    public final t a;
    public final g b;

    public q(t t0, g g0) {
        this.a = t0;
        this.b = g0;
    }

    @Override  // h2.b
    public final Object get() {
        return this.a.w(this.b);
    }
}

