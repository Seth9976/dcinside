package org.bson.codecs;

import org.bson.F;
import org.bson.P;
import org.bson.a0;

public class s implements N {
    public F c(P p0, T t0) {
        return new F(p0.readInt64());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return F.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((F)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, F f0, Y y0) {
        a00.r(f0.p0());
    }
}

