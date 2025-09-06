package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.e;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h implements Callable {
    public final Object a;
    public final AtomicBoolean b;
    public final m c;
    public final e d;

    public h(Object object0, AtomicBoolean atomicBoolean0, m m0, e e0) {
        this.a = object0;
        this.b = atomicBoolean0;
        this.c = m0;
        this.d = e0;
    }

    @Override
    public final Object call() {
        return m.t(this.a, this.b, this.c, this.d);
    }
}

