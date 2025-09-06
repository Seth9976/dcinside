package org.bson.codecs;

import java.util.concurrent.atomic.AtomicLong;
import org.bson.P;
import org.bson.a0;

public class c implements N {
    public AtomicLong c(P p0, T t0) {
        return new AtomicLong(j0.c(p0));
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return AtomicLong.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((AtomicLong)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, AtomicLong atomicLong0, Y y0) {
        a00.r(atomicLong0.longValue());
    }
}

