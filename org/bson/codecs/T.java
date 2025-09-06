package org.bson.codecs;

import org.bson.H;
import org.bson.P;
import org.bson.a0;

public class t implements N {
    public H c(P p0, T t0) {
        return new H(p0.C1());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return H.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((H)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, H h0, Y y0) {
        a00.L(h0.j0());
    }
}

