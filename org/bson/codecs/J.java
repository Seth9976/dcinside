package org.bson.codecs;

import T3.a;
import org.bson.P;
import org.bson.a0;
import org.bson.codecs.configuration.d;
import org.bson.y;

public class j implements N {
    private final d a;
    private static final N b;

    static {
        j.b = new o();
    }

    public j(d d0) {
        this.a = d0;
    }

    public a c(P p0, T t0) {
        throw new UnsupportedOperationException("The BsonCodec can only encode to Bson");
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return a.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((a)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, a a0, Y y0) {
        try {
            y y1 = a0.a(y.class, this.a);
            j.b.e(a00, y1, y0);
        }
        catch(Exception exception0) {
            throw new org.bson.codecs.configuration.a(String.format("Unable to encode a Bson implementation: %s", a0), exception0);
        }
    }
}

