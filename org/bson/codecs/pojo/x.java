package org.bson.codecs.pojo;

import java.util.concurrent.ConcurrentMap;
import org.bson.P;
import org.bson.a0;
import org.bson.codecs.N;
import org.bson.codecs.T;
import org.bson.codecs.Y;
import org.bson.codecs.configuration.d;

class x extends A {
    private final b a;
    private final d b;
    private final G c;
    private final m d;
    private final ConcurrentMap e;
    private volatile B f;

    x(b b0, d d0, G g0, m m0, ConcurrentMap concurrentMap0) {
        this.a = b0;
        this.b = d0;
        this.c = g0;
        this.d = m0;
        this.e = concurrentMap0;
    }

    @Override  // org.bson.codecs.pojo.A
    b c() {
        return this.a;
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return this.a.l();
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h().e(a00, object0, y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.h().g(p0, t0);
    }

    private N h() {
        if(this.f == null) {
            this.f = new B(this.a, this.b, this.c, this.d, this.e, true);
        }
        return this.f;
    }
}

