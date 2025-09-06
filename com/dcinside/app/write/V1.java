package com.dcinside.app.write;

import rx.functions.b;

public final class v1 implements b {
    public final A1 a;
    public final boolean b;

    public v1(A1 a10, boolean z) {
        this.a = a10;
        this.b = z;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        A1.R(this.a, this.b, ((Throwable)object0));
    }
}

