package org.bson.codecs;

import org.bson.E;
import org.bson.P;
import org.bson.a0;

public class r implements N {
    public E c(P p0, T t0) {
        return new E(p0.readInt32());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return E.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((E)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, E e0, Y y0) {
        a00.h(e0.p0());
    }
}

