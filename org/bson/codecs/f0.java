package org.bson.codecs;

import R3.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.UUID;
import org.bson.P;
import org.bson.X;
import org.bson.a0;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.c;
import org.bson.codecs.configuration.d;
import org.bson.q0;
import org.bson.r0;

public class f0 implements N, m0 {
    private final E a;
    private final d b;
    private final q0 c;
    private final r0 d;
    private static final d e;
    private static final D f;

    static {
        f0.e = c.c(Arrays.asList(new b[]{new w0(), new H(), new V(), new d0(), new g0()}));
        f0.f = new D();
    }

    public f0() {
        this(f0.e);
    }

    public f0(d d0) {
        this(d0, f0.f);
    }

    public f0(d d0, D d1) {
        this(d0, d1, null);
    }

    public f0(d d0, D d1, q0 q00) {
        this(d0, new E(((D)a.e("bsonTypeClassMap", d1)), d0), q00, r0.d);
    }

    private f0(d d0, E e0, q0 q00, r0 r00) {
        class org.bson.codecs.f0.a implements q0 {
            final f0 a;

            @Override  // org.bson.q0
            public Object a(Object object0) {
                return object0;
            }
        }

        this.b = (d)a.e("registry", d0);
        this.a = e0;
        if(q00 == null) {
            q00 = new org.bson.codecs.f0.a(this);
        }
        this.c = q00;
        this.d = r00;
    }

    @Override  // org.bson.codecs.m0
    public N c(r0 r00) {
        return new f0(this.b, this.a, this.c, r00);
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return Map.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.i(a00, ((Map)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.h(p0, t0);
    }

    public Map h(P p0, T t0) {
        Map map0 = new HashMap();
        p0.g0();
        while(p0.T2() != X.b) {
            map0.put(p0.n0(), this.j(p0, t0));
        }
        p0.E1();
        return map0;
    }

    public void i(a0 a00, Map map0, Y y0) {
        a00.e0();
        for(Object object0: map0.entrySet()) {
            a00.k(((String)((Map.Entry)object0).getKey()));
            this.k(a00, y0, ((Map.Entry)object0).getValue());
        }
        a00.J1();
    }

    private Object j(P p0, T t0) {
        X x0 = p0.z0();
        if(x0 == X.l) {
            p0.o0();
            return null;
        }
        if(x0 == X.f) {
            return t0.b(this.b.a(List.class), p0);
        }
        if(x0 == X.g && p0.a3() == 16) {
            N n0 = this.a.a(x0);
            int v = p0.G3();
            Class class0 = UUID.class;
            switch(v) {
                case 3: {
                    if(this.d == r0.d || this.d == r0.c || this.d == r0.e) {
                        n0 = this.b.a(class0);
                    }
                    return t0.b(n0, p0);
                }
                case 4: {
                    return this.d != r0.d && this.d != r0.b ? t0.b(n0, p0) : t0.b(this.b.a(class0), p0);
                }
                default: {
                    return t0.b(n0, p0);
                }
            }
        }
        Object object0 = this.a.a(x0).g(p0, t0);
        return this.c.a(object0);
    }

    private void k(a0 a00, Y y0, Object object0) {
        if(object0 == null) {
            a00.i();
            return;
        }
        Class class0 = object0.getClass();
        y0.b(this.b.a(class0), a00, object0);
    }
}

