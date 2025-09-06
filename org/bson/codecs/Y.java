package org.bson.codecs;

import org.bson.O;
import org.bson.P;
import org.bson.a0;

public class y implements N {
    public O c(P p0, T t0) {
        return new O(p0.H());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return O.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((O)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, O o0, Y y0) {
        a00.l(o0.k0());
    }
}

