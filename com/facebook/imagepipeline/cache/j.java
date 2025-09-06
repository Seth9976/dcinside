package com.facebook.imagepipeline.cache;

import java.util.concurrent.Callable;

public final class j implements Callable {
    public final Object a;
    public final m b;

    public j(Object object0, m m0) {
        this.a = object0;
        this.b = m0;
    }

    @Override
    public final Object call() {
        return m.k(this.a, this.b);
    }
}

