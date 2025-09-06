package com.dcinside.app.post;

import rx.functions.b;

public final class z0 implements b {
    public final S0 a;
    public final String b;

    public z0(S0 s00, String s) {
        this.a = s00;
        this.b = s;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        S0.D1(this.a, this.b, ((Throwable)object0));
    }
}

