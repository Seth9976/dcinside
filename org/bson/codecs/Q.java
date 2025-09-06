package org.bson.codecs;

import org.bson.C;
import org.bson.P;
import org.bson.a0;

public class q implements N {
    public C c(P p0, T t0) {
        return new C(p0.readDouble());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return C.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((C)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, C c0, Y y0) {
        a00.writeDouble(c0.p0());
    }
}

