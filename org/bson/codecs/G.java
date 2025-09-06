package org.bson.codecs;

import R3.a;
import java.util.ArrayList;
import org.bson.P;
import org.bson.X;
import org.bson.Z;
import org.bson.a0;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.c;
import org.bson.codecs.configuration.d;
import org.bson.n;

public class g implements N {
    private final d a;
    private static final d b;

    static {
        g.b = c.d(new b[]{new H()});
    }

    public g() {
        this(g.b);
    }

    public g(d d0) {
        this.a = (d)a.e("codecRegistry", d0);
    }

    public n c(P p0, T t0) {
        p0.q3();
        ArrayList arrayList0 = new ArrayList();
        while(p0.T2() != X.b) {
            arrayList0.add(this.i(p0, t0));
        }
        p0.v1();
        return new n(arrayList0);
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return n.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((n)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, n n0, Y y0) {
        a00.o();
        for(Object object0: n0) {
            Class class0 = ((Z)object0).getClass();
            y0.b(this.a.a(class0), a00, ((Z)object0));
        }
        a00.q();
    }

    protected Z i(P p0, T t0) {
        Class class0 = H.e(p0.z0());
        return (Z)this.a.a(class0).g(p0, t0);
    }
}

