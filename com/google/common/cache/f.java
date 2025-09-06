package com.google.common.cache;

import java.util.concurrent.Callable;

public final class f implements Callable {
    public final g a;
    public final Object b;
    public final Object c;

    public f(g g0, Object object0, Object object1) {
        this.a = g0;
        this.b = object0;
        this.c = object1;
    }

    @Override
    public final Object call() {
        return a.h(this.a, this.b, this.c);
    }
}

