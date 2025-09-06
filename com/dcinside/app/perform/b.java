package com.dcinside.app.perform;

import rx.functions.a;

public final class b implements a {
    public final double a;
    public final e b;

    public b(double f, e e0) {
        this.a = f;
        this.b = e0;
    }

    @Override  // rx.functions.a
    public final void call() {
        e.l(this.a, this.b);
    }
}

