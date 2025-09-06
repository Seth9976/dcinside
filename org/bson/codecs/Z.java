package org.bson.codecs;

import org.bson.P;
import org.bson.S;
import org.bson.a0;

public class z implements N {
    public S c(P p0, T t0) {
        return p0.m0();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return S.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((S)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, S s0, Y y0) {
        a00.h1(s0);
    }
}

