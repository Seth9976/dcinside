package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.x;

public class n implements N {
    public x c(P p0, T t0) {
        return new x(p0.U1());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return x.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((x)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, x x0, Y y0) {
        a00.E0(x0.o0());
    }
}

