package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

public final class d implements Callable {
    public final g a;
    public final h b;

    public d(g g0, h h0) {
        this.a = g0;
        this.b = h0;
    }

    @Override
    public final Object call() {
        return this.a.k(this.b);
    }
}

