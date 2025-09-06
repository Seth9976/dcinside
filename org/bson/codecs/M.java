package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.v;

public class m implements N {
    public v c(P p0, T t0) {
        return new v(p0.m3());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return v.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((v)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, v v0, Y y0) {
        a00.f0(v0.k0());
    }
}

