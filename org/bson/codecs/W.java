package org.bson.codecs;

import org.bson.L;
import org.bson.P;
import org.bson.a0;

public class w implements N {
    public L c(P p0, T t0) {
        p0.V0();
        return new L();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return L.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((L)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, L l0, Y y0) {
        a00.t1();
    }
}

