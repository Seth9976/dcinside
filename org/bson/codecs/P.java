package org.bson.codecs;

import org.bson.A;
import org.bson.P;
import org.bson.a0;

public class p implements N {
    private final N a;

    public p(N n0) {
        this.a = n0;
    }

    public A c(P p0, T t0) {
        throw new UnsupportedOperationException("Decoding into a BsonDocumentWrapper is not allowed");
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return A.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((A)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, A a0, Y y0) {
        if(a0.I1()) {
            this.a.e(a00, a0, y0);
            return;
        }
        a0.F1().e(a00, a0.H1(), y0);
    }
}

