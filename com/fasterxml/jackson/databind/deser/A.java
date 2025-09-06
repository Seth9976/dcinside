package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.P;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.impl.s;
import com.fasterxml.jackson.databind.deser.impl.w;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class a extends n implements j, Serializable {
    protected final m a;
    protected final s b;
    protected final Map c;
    protected transient Map d;
    protected final boolean e;
    protected final boolean f;
    protected final boolean g;
    protected final boolean h;
    private static final long i = 1L;

    protected a(c c0) {
        m m0 = c0.H();
        this.a = m0;
        this.b = null;
        this.c = null;
        Class class0 = m0.g();
        this.e = class0.isAssignableFrom(String.class);
        boolean z = true;
        this.f = class0 == Boolean.TYPE || class0.isAssignableFrom(Boolean.class);
        this.g = class0 == Integer.TYPE || class0.isAssignableFrom(Integer.class);
        if(class0 != Double.TYPE && !class0.isAssignableFrom(Double.class)) {
            z = false;
        }
        this.h = z;
    }

    protected a(a a0, s s0, Map map0) {
        this.a = a0.a;
        this.c = a0.c;
        this.e = a0.e;
        this.f = a0.f;
        this.g = a0.g;
        this.h = a0.h;
        this.b = s0;
        this.d = map0;
    }

    @Deprecated
    public a(f f0, c c0, Map map0) {
        this(f0, c0, map0, null);
    }

    public a(f f0, c c0, Map map0, Map map1) {
        m m0 = c0.H();
        this.a = m0;
        this.b = f0.w();
        this.c = map0;
        this.d = map1;
        Class class0 = m0.g();
        this.e = class0.isAssignableFrom(String.class);
        boolean z = true;
        this.f = class0 == Boolean.TYPE || class0.isAssignableFrom(Boolean.class);
        this.g = class0 == Integer.TYPE || class0.isAssignableFrom(Integer.class);
        if(class0 != Double.TYPE && !class0.isAssignableFrom(Double.class)) {
            z = false;
        }
        this.h = z;
    }

    protected Object A(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        Object object0 = this.b.f(n0, h0);
        z z0 = h0.b0(object0, this.b.c, this.b.d);
        Object object1 = z0.g();
        if(object1 == null) {
            throw new com.fasterxml.jackson.databind.deser.z(n0, "Could not resolve Object Id [" + object0 + "] -- unresolved forward-reference?", n0.b1(), z0);
        }
        return object1;
    }

    protected Object B(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        switch(n0.d0()) {
            case 6: {
                if(this.e) {
                    return n0.R2();
                }
                break;
            }
            case 7: {
                if(this.g) {
                    return n0.Q1();
                }
                break;
            }
            case 8: {
                if(this.h) {
                    return n0.j1();
                }
                break;
            }
            case 9: {
                if(this.f) {
                    return true;
                }
                break;
            }
            case 10: {
                if(this.f) {
                    return false;
                }
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    public static a C(c c0) {
        return new a(c0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws o {
        b b0 = h0.o();
        if(d0 != null && b0 != null) {
            k k0 = d0.h();
            if(k0 != null) {
                F f0 = b0.M(k0);
                if(f0 != null) {
                    P p0 = h0.C(k0, f0);
                    F f1 = b0.N(k0, f0);
                    Class class0 = f1.c();
                    if(class0 == com.fasterxml.jackson.annotation.O.d.class) {
                        B b1 = f1.d();
                        y y0 = this.d == null ? null : ((y)this.d.get(b1.d()));
                        if(y0 == null) {
                            Object[] arr_object = {com.fasterxml.jackson.databind.util.h.l0(this.s()), com.fasterxml.jackson.databind.util.h.i0(b1)};
                            h0.D(this.a, String.format("Invalid Object Id definition for %s: cannot find property with name %s", arr_object));
                        }
                        m m0 = y0.getType();
                        return new a(this, s.a(m0, f1.d(), new w(f1.f()), h0.c0(m0), y0, p0), null);
                    }
                    p0 = h0.C(k0, f1);
                    m m1 = h0.x().n0(h0.R(class0), N.class)[0];
                    return new a(this, s.a(m1, f1.d(), h0.B(k0, f1), h0.c0(m1), null, p0), null);
                }
            }
        }
        return this.d == null ? this : new a(this, this.b, null);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        com.fasterxml.jackson.databind.deser.B.a b$a0 = new com.fasterxml.jackson.databind.deser.B.a(this.a);
        return h0.p0(this.a.g(), b$a0, n0, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object i(com.fasterxml.jackson.core.n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
        if(this.b != null) {
            r r0 = n0.Y();
            if(r0 != null) {
                if(r0.g()) {
                    return this.A(n0, h0);
                }
                if(r0 == r.k) {
                    r0 = n0.m4();
                }
                if(r0 == r.o && this.b.e()) {
                    String s = n0.T();
                    if(this.b.d(s, n0)) {
                        return this.A(n0, h0);
                    }
                }
            }
        }
        Object object0 = this.B(n0, h0);
        return object0 == null ? f0.e(n0, h0) : object0;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public y k(String s) {
        return this.c == null ? null : ((y)this.c.get(s));
    }

    @Override  // com.fasterxml.jackson.databind.n
    public s r() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Class s() {
        return this.a.g();
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.d;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(g g0) {
        return null;
    }
}

