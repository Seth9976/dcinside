package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.o;
import org.bson.types.c;

public class e implements N {
    public c c(P p0, T t0) {
        o o0 = p0.B0();
        return new c(o0.o0(), o0.n0());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return c.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((c)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, c c0, Y y0) {
        a00.T0(new o(c0.b(), c0.a()));
    }
}

