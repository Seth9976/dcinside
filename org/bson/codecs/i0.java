package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.types.h;

public class i0 implements N {
    public h c(P p0, T t0) {
        p0.V0();
        return new h();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return h.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((h)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, h h0, Y y0) {
        a00.t1();
    }
}

