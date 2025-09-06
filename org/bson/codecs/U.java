package org.bson.codecs;

import org.bson.I;
import org.bson.P;
import org.bson.a0;
import org.bson.y;

public class u implements N {
    private final N a;

    public u(N n0) {
        this.a = n0;
    }

    public I c(P p0, T t0) {
        return new I(p0.y2(), ((y)this.a.g(p0, t0)));
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return I.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((I)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, I i0, Y y0) {
        a00.u0(i0.k0());
        this.a.e(a00, i0.m0(), y0);
    }
}

