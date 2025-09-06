package org.bson.codecs;

import R3.a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.bson.P;
import org.bson.X;
import org.bson.a0;
import org.bson.codecs.configuration.d;
import org.bson.q0;
import org.bson.r0;

public class c0 implements N, m0 {
    private final d a;
    private final E b;
    private final q0 c;
    private final r0 d;

    public c0(d d0, D d1) {
        this(d0, d1, null);
    }

    public c0(d d0, D d1, q0 q00) {
        this(d0, new E(((D)a.e("bsonTypeClassMap", d1)), d0), q00, r0.d);
    }

    private c0(d d0, E e0, q0 q00, r0 r00) {
        class org.bson.codecs.c0.a implements q0 {
            final c0 a;

            @Override  // org.bson.q0
            public Object a(Object object0) {
                return object0;
            }
        }

        this.a = (d)a.e("registry", d0);
        this.b = e0;
        if(q00 == null) {
            q00 = new org.bson.codecs.c0.a(this);
        }
        this.c = q00;
        this.d = r00;
    }

    @Override  // org.bson.codecs.m0
    public N c(r0 r00) {
        return new c0(this.a, this.b, this.c, r00);
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return Iterable.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.i(a00, ((Iterable)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.h(p0, t0);
    }

    public Iterable h(P p0, T t0) {
        p0.q3();
        Iterable iterable0 = new ArrayList();
        while(p0.T2() != X.b) {
            ((List)iterable0).add(this.j(p0, t0));
        }
        p0.v1();
        return iterable0;
    }

    public void i(a0 a00, Iterable iterable0, Y y0) {
        a00.o();
        for(Object object0: iterable0) {
            this.k(a00, y0, object0);
        }
        a00.q();
    }

    private Object j(P p0, T t0) {
        X x0 = p0.z0();
        if(x0 == X.l) {
            p0.o0();
            return null;
        }
        N n0 = this.b.a(x0);
        if(x0 == X.g && p0.a3() == 16) {
            int v = p0.G3();
            Class class0 = UUID.class;
            switch(v) {
                case 3: {
                    if(this.d == r0.d || this.d == r0.c || this.d == r0.e) {
                        n0 = this.a.a(class0);
                    }
                    break;
                }
                case 4: {
                    if(this.d == r0.d || this.d == r0.b) {
                        n0 = this.a.a(class0);
                    }
                }
            }
        }
        Object object0 = n0.g(p0, t0);
        return this.c.a(object0);
    }

    private void k(a0 a00, Y y0, Object object0) {
        if(object0 == null) {
            a00.i();
            return;
        }
        Class class0 = object0.getClass();
        y0.b(this.a.a(class0), a00, object0);
    }
}

