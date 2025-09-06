package org.bson.codecs;

import java.util.ArrayList;
import java.util.Map.Entry;
import org.bson.D;
import org.bson.P;
import org.bson.X;
import org.bson.Z;
import org.bson.a0;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.c;
import org.bson.codecs.configuration.d;
import org.bson.types.ObjectId;
import org.bson.y;

public class o implements O {
    private final d a;
    private final E b;
    private static final String c = "_id";
    private static final d d;

    static {
        o.d = c.d(new b[]{new H()});
    }

    public o() {
        this(o.d);
    }

    public o(d d0) {
        if(d0 == null) {
            throw new IllegalArgumentException("Codec registry can not be null");
        }
        this.a = d0;
        this.b = new E(H.d(), d0);
    }

    @Override  // org.bson.codecs.O
    public Z a(Object object0) {
        return this.m(((y)object0));
    }

    @Override  // org.bson.codecs.O
    public boolean b(Object object0) {
        return this.i(((y)object0));
    }

    private void c(a0 a00, Y y0, y y1) {
        if(y0.d() && y1.containsKey("_id")) {
            a00.k("_id");
            this.p(a00, y0, y1.n0("_id"));
        }
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return y.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.j(a00, ((y)object0), y0);
    }

    @Override  // org.bson.codecs.O
    public Object f(Object object0) {
        return this.k(((y)object0));
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.h(p0, t0);
    }

    public y h(P p0, T t0) {
        ArrayList arrayList0 = new ArrayList();
        p0.g0();
        while(p0.T2() != X.b) {
            arrayList0.add(new D(p0.n0(), this.n(p0, t0)));
        }
        p0.E1();
        return new y(arrayList0);
    }

    public boolean i(y y0) {
        return y0.containsKey("_id");
    }

    public void j(a0 a00, y y0, Y y1) {
        a00.e0();
        this.c(a00, y1, y0);
        for(Object object0: y0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!this.o(y1, ((String)map$Entry0.getKey()))) {
                a00.k(((String)map$Entry0.getKey()));
                this.p(a00, y1, ((Z)map$Entry0.getValue()));
            }
        }
        a00.J1();
    }

    public y k(y y0) {
        if(!this.i(y0)) {
            y0.x1("_id", new org.bson.O(new ObjectId()));
        }
        return y0;
    }

    public d l() {
        return this.a;
    }

    public Z m(y y0) {
        return y0.n0("_id");
    }

    protected Z n(P p0, T t0) {
        X x0 = p0.z0();
        return (Z)this.b.a(x0).g(p0, t0);
    }

    // 去混淆评级： 低(20)
    private boolean o(Y y0, String s) {
        return y0.d() && s.equals("_id");
    }

    private void p(a0 a00, Y y0, Z z0) {
        Class class0 = z0.getClass();
        y0.b(this.a.a(class0), a00, z0);
    }
}

