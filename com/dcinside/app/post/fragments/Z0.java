package com.dcinside.app.post.fragments;

import rx.functions.b;

public final class z0 implements b {
    public final S0 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public z0(S0 s00, int v, boolean z, boolean z1, String s) {
        this.a = s00;
        this.b = v;
        this.c = z;
        this.d = z1;
        this.e = s;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        S0.A3(this.a, this.b, this.c, this.d, this.e, ((Throwable)object0));
    }
}

