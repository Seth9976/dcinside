package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.e;
import java.util.concurrent.Callable;

public final class f implements Callable {
    public final Object a;
    public final m b;
    public final e c;

    public f(Object object0, m m0, e e0) {
        this.a = object0;
        this.b = m0;
        this.c = e0;
    }

    @Override
    public final Object call() {
        return m.n(this.a, this.b, this.c);
    }
}

