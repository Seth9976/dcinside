package com.google.common.cache;

import java.util.concurrent.Executor;

public final class x implements v {
    public final Executor a;
    public final v b;

    public x(Executor executor0, v v0) {
        this.a = executor0;
        this.b = v0;
    }

    @Override  // com.google.common.cache.v
    public final void a(z z0) {
        y.e(this.a, this.b, z0);
    }
}

