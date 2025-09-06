package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.types.g;

public class h0 implements N {
    public g c(P p0, T t0) {
        p0.s1();
        return new g();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return g.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((g)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, g g0, Y y0) {
        a00.d1();
    }
}

