package io.reactivex.internal.operators.maybe;

import e3.o;
import io.reactivex.y;
import org.reactivestreams.c;

public enum p0 implements o {
    INSTANCE;

    public c a(y y0) throws Exception {
        return new n0(y0);
    }

    @Override  // e3.o
    public Object apply(Object object0) throws Exception {
        return this.a(((y)object0));
    }

    public static o b() {
        return p0.a;
    }
}

