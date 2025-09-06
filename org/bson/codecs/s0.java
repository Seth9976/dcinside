package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.types.j;

public class s0 implements N {
    public j c(P p0, T t0) {
        return new j(p0.c2());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return j.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((j)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, j j0, Y y0) {
        a00.Y0(j0.a());
    }
}

