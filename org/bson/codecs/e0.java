package org.bson.codecs;

import org.bson.P;
import org.bson.a0;

public class e0 implements N {
    public Long c(P p0, T t0) {
        return j0.c(p0);
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return Long.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((Long)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, Long long0, Y y0) {
        a00.r(((long)long0));
    }
}

