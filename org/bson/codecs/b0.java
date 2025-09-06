package org.bson.codecs;

import org.bson.P;
import org.bson.a0;

public class b0 implements N {
    public Integer c(P p0, T t0) {
        return j0.b(p0);
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return Integer.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((Integer)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, Integer integer0, Y y0) {
        a00.h(((int)integer0));
    }
}

