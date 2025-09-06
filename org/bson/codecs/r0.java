package org.bson.codecs;

import org.bson.P;
import org.bson.X;
import org.bson.a0;

public class r0 implements N {
    public String c(P p0, T t0) {
        return p0.z0() == X.p ? p0.c2() : p0.readString();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return String.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((String)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, String s, Y y0) {
        a00.d(s);
    }
}

