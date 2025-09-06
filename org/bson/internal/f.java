package org.bson.internal;

import org.bson.P;
import org.bson.a0;
import org.bson.codecs.N;
import org.bson.codecs.T;
import org.bson.codecs.Y;
import org.bson.codecs.configuration.d;

class f implements N {
    private final d a;
    private final Class b;
    private volatile N c;

    f(d d0, Class class0) {
        this.a = d0;
        this.b = class0;
    }

    private N c() {
        if(this.c == null) {
            this.c = this.a.a(this.b);
        }
        return this.c;
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return this.b;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.c().e(a00, object0, y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c().g(p0, t0);
    }
}

