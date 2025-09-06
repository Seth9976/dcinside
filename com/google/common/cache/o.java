package com.google.common.cache;

import com.google.common.util.concurrent.t0;

public final class o implements Runnable {
    public final r a;
    public final Object b;
    public final int c;
    public final m d;
    public final t0 e;

    public o(r m$r0, Object object0, int v, m m$m0, t0 t00) {
        this.a = m$r0;
        this.b = object0;
        this.c = v;
        this.d = m$m0;
        this.e = t00;
    }

    @Override
    public final void run() {
        this.a.D(this.b, this.c, this.d, this.e);
    }
}

