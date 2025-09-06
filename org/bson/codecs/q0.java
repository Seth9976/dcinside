package org.bson.codecs;

import org.bson.G;
import org.bson.P;
import org.bson.a0;

public class q0 implements N {
    public Short c(P p0, T t0) {
        int v = j0.b(p0);
        if(v < 0xFFFF8000 || v > 0x7FFF) {
            throw new G(String.format("%s can not be converted into a Short.", v));
        }
        return (short)v;
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return Short.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((Short)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, Short short0, Y y0) {
        a00.h(((short)short0));
    }
}

