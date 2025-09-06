package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.e;
import com.facebook.imagepipeline.image.l;

public final class g implements Runnable {
    public final Object a;
    public final m b;
    public final e c;
    public final l d;

    public g(Object object0, m m0, e e0, l l0) {
        this.a = object0;
        this.b = m0;
        this.c = e0;
        this.d = l0;
    }

    @Override
    public final void run() {
        m.y(this.a, this.b, this.c, this.d);
    }
}

