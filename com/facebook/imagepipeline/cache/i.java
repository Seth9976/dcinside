package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.e;
import java.util.concurrent.Callable;

public final class i implements Callable {
    public final Object a;
    public final m b;
    public final e c;

    public i(Object object0, m m0, e e0) {
        this.a = object0;
        this.b = m0;
        this.c = e0;
    }

    @Override
    public final Object call() {
        return m.B(this.a, this.b, this.c);
    }
}

