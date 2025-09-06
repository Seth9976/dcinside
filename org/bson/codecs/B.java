package org.bson.codecs;

import java.util.concurrent.atomic.AtomicInteger;
import org.bson.P;
import org.bson.a0;

public class b implements N {
    public AtomicInteger c(P p0, T t0) {
        return new AtomicInteger(j0.b(p0));
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return AtomicInteger.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((AtomicInteger)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, AtomicInteger atomicInteger0, Y y0) {
        a00.h(atomicInteger0.intValue());
    }
}

