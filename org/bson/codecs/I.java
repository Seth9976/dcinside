package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.t;

public class i implements N {
    public t c(P p0, T t0) {
        return t.m0(p0.readBoolean());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return t.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((t)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, t t0, Y y0) {
        a00.writeBoolean(t0.k0());
    }
}

