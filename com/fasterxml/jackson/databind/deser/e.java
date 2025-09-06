package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.M;
import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.P;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.A.a;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.impl.E;
import com.fasterxml.jackson.databind.deser.impl.g;
import com.fasterxml.jackson.databind.deser.impl.s;
import com.fasterxml.jackson.databind.deser.impl.u;
import com.fasterxml.jackson.databind.deser.impl.v;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.deser.std.C;
import com.fasterxml.jackson.databind.deser.std.D;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.H;
import com.fasterxml.jackson.databind.util.q;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class e extends D implements c, j, w, Serializable {
    protected static final B A = null;
    protected final m f;
    protected final com.fasterxml.jackson.annotation.n.c g;
    protected final com.fasterxml.jackson.databind.deser.B h;
    protected n i;
    protected n j;
    protected v k;
    protected boolean l;
    protected boolean m;
    protected final com.fasterxml.jackson.databind.deser.impl.c n;
    protected final E[] o;
    protected x p;
    protected final Set q;
    protected final Set r;
    protected final boolean s;
    protected final boolean t;
    protected final Map u;
    protected transient HashMap v;
    protected com.fasterxml.jackson.databind.deser.impl.D w;
    protected g x;
    protected final s y;
    private static final long z = 1L;

    static {
        e.A = new B("#temporary-name");
    }

    protected e(e e0) {
        this(e0, e0.s);
    }

    protected e(e e0, com.fasterxml.jackson.databind.deser.impl.c c0) {
        super(e0.f);
        this.f = e0.f;
        this.h = e0.h;
        this.i = e0.i;
        this.j = e0.j;
        this.k = e0.k;
        this.n = c0;
        this.u = e0.u;
        this.q = e0.q;
        this.s = e0.s;
        this.r = e0.r;
        this.p = e0.p;
        this.o = e0.o;
        this.y = e0.y;
        this.l = e0.l;
        this.w = e0.w;
        this.t = e0.t;
        this.g = e0.g;
        this.m = e0.m;
        this.x = e0.x;
    }

    public e(e e0, s s0) {
        super(e0.f);
        this.f = e0.f;
        this.h = e0.h;
        this.i = e0.i;
        this.j = e0.j;
        this.k = e0.k;
        this.u = e0.u;
        this.q = e0.q;
        this.s = e0.s;
        this.r = e0.r;
        this.p = e0.p;
        this.o = e0.o;
        this.l = e0.l;
        this.w = e0.w;
        this.t = e0.t;
        this.g = e0.g;
        this.y = s0;
        if(s0 == null) {
            this.n = e0.n;
            this.m = e0.m;
        }
        else {
            u u0 = new u(s0, A.i);
            this.n = e0.n.F(u0);
            this.m = false;
        }
        this.x = e0.x;
    }

    protected e(e e0, com.fasterxml.jackson.databind.util.x x0) {
        super(e0.f);
        this.f = e0.f;
        this.h = e0.h;
        this.i = e0.i;
        this.j = e0.j;
        this.k = e0.k;
        this.u = e0.u;
        this.q = e0.q;
        this.s = x0 != null || e0.s;
        this.r = e0.r;
        this.p = e0.p;
        this.o = e0.o;
        this.y = e0.y;
        this.l = e0.l;
        com.fasterxml.jackson.databind.deser.impl.D d0 = e0.w;
        if(x0 == null) {
            this.n = e0.n;
        }
        else {
            if(d0 != null) {
                d0 = d0.c(x0);
            }
            this.n = e0.n.C(x0);
        }
        this.w = d0;
        this.t = e0.t;
        this.g = e0.g;
        this.m = false;
        this.x = e0.x;
    }

    @Deprecated
    protected e(e e0, Set set0) {
        this(e0, set0, e0.r);
    }

    public e(e e0, Set set0, Set set1) {
        super(e0.f);
        this.f = e0.f;
        this.h = e0.h;
        this.i = e0.i;
        this.j = e0.j;
        this.k = e0.k;
        this.u = e0.u;
        this.q = set0;
        this.s = e0.s;
        this.r = set1;
        this.p = e0.p;
        this.o = e0.o;
        this.l = e0.l;
        this.w = e0.w;
        this.t = e0.t;
        this.g = e0.g;
        this.m = e0.m;
        this.y = e0.y;
        this.n = e0.n.H(set0, set1);
        this.x = e0.x;
    }

    protected e(e e0, boolean z) {
        super(e0.f);
        this.f = e0.f;
        this.h = e0.h;
        this.i = e0.i;
        this.j = e0.j;
        this.k = e0.k;
        this.n = e0.n;
        this.u = e0.u;
        this.q = e0.q;
        this.s = z;
        this.r = e0.r;
        this.p = e0.p;
        this.o = e0.o;
        this.y = e0.y;
        this.l = e0.l;
        this.w = e0.w;
        this.t = e0.t;
        this.g = e0.g;
        this.m = e0.m;
        this.x = e0.x;
    }

    protected e(f f0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.deser.impl.c c1, Map map0, Set set0, boolean z, Set set1, boolean z1) {
        super(c0.H());
        this.f = c0.H();
        com.fasterxml.jackson.databind.deser.B b0 = f0.y();
        this.h = b0;
        this.i = null;
        this.j = null;
        this.k = null;
        this.n = c1;
        this.u = map0;
        this.q = set0;
        this.s = z;
        this.r = set1;
        this.p = f0.s();
        List list0 = f0.v();
        E[] arr_e = list0 == null || list0.isEmpty() ? null : ((E[])list0.toArray(new E[list0.size()]));
        this.o = arr_e;
        s s0 = f0.w();
        this.y = s0;
        boolean z2 = true;
        this.l = this.w != null || b0.l() || b0.h() || !b0.k();
        this.g = c0.l(null).m();
        this.t = z1;
        if(this.l || arr_e != null || z1 || s0 != null) {
            z2 = false;
        }
        this.m = z2;
    }

    protected void A1(com.fasterxml.jackson.databind.deser.impl.c c0, y[] arr_y, y y0, y y1) {
        c0.D(y0, y1);
        if(arr_y != null) {
            for(int v = 0; v < arr_y.length; ++v) {
                if(arr_y[v] == y0) {
                    arr_y[v] = y1;
                    return;
                }
            }
        }
    }

    protected y B1(h h0, y y0) {
        n n0 = y0.E();
        if(n0 instanceof e && !((e)n0).e().k()) {
            Class class0 = y0.getType().g();
            Class class1 = com.fasterxml.jackson.databind.util.h.N(class0);
            if(class1 != null && class1 == this.f.g()) {
                Constructor[] arr_constructor = class0.getConstructors();
                for(int v = 0; v < arr_constructor.length; ++v) {
                    Constructor constructor0 = arr_constructor[v];
                    if(constructor0.getParameterCount() == 1 && class1.equals(constructor0.getParameterTypes()[0])) {
                        if(h0.j()) {
                            com.fasterxml.jackson.databind.util.h.i(constructor0, h0.z(t.q));
                        }
                        return new com.fasterxml.jackson.databind.deser.impl.j(y0, constructor0);
                    }
                }
            }
        }
        return y0;
    }

    protected y C1(h h0, y y0) throws o {
        String s = y0.A();
        if(s == null) {
            return y0;
        }
        y y1 = y0.E().k(s);
        if(y1 == null) {
            Object[] arr_object = {com.fasterxml.jackson.databind.util.h.j0(s), com.fasterxml.jackson.databind.util.h.Q(y0.getType())};
            return (y)h0.D(this.f, String.format("Cannot handle managed/back reference %s: no back reference property found from type %s", arr_object));
        }
        m m0 = this.f;
        m m1 = y1.getType();
        boolean z = y0.getType().o();
        if(!m1.g().isAssignableFrom(m0.g())) {
            Object[] arr_object1 = {com.fasterxml.jackson.databind.util.h.j0(s), com.fasterxml.jackson.databind.util.h.Q(m1), m0.g().getName()};
            h0.D(this.f, String.format("Cannot handle managed/back reference %s: back reference type (%s) not compatible with managed type (%s)", arr_object1));
        }
        return new com.fasterxml.jackson.databind.deser.impl.m(y0, s, y1, z);
    }

    protected y D1(h h0, y y0, A a0) throws o {
        a a$a0 = a0.g();
        if(a$a0 != null) {
            n n0 = y0.E();
            Boolean boolean0 = n0.y(h0.g0());
            if(boolean0 == null) {
                if(a$a0.b) {
                    return y0;
                }
            }
            else if(!boolean0.booleanValue()) {
                if(!a$a0.b) {
                    h0.n0(n0);
                }
                return y0;
            }
            k k0 = a$a0.a;
            k0.k(h0.z(t.q));
            if(!(y0 instanceof com.fasterxml.jackson.databind.deser.impl.A)) {
                y0 = com.fasterxml.jackson.databind.deser.impl.n.Z(y0, k0);
            }
        }
        com.fasterxml.jackson.databind.deser.v v0 = this.i1(h0, y0, a0);
        return v0 == null ? y0 : y0.T(v0);
    }

    protected y E1(h h0, y y0) throws o {
        F f0 = y0.C();
        n n0 = y0.E();
        return f0 == null && (n0 == null ? null : n0.r()) == null ? y0 : new com.fasterxml.jackson.databind.deser.impl.t(y0, f0);
    }

    protected abstract e F1();

    public Iterator G1() {
        return this.k == null ? Collections.emptyList().iterator() : this.k.g().iterator();
    }

    @Deprecated
    public Object H1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        return this.U(n0, h0);
    }

    public Object I1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        n n1 = this.s1();
        if(n1 != null && !this.h.d()) {
            Object object0 = n1.g(n0, h0);
            Object object1 = this.h.C(h0, object0);
            if(this.o != null) {
                this.f2(h0, object1);
            }
            return object1;
        }
        return n0.Y() == r.t ? this.h.q(h0, true) : this.h.q(h0, false);
    }

    public Object J1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        b n$b0 = n0.i2();
        if(n$b0 != b.e && n$b0 != b.d) {
            if(n$b0 == b.f) {
                n n1 = this.s1();
                if(n1 != null && !this.h.b()) {
                    Object object0 = n1.g(n0, h0);
                    Object object1 = this.h.C(h0, object0);
                    if(this.o != null) {
                        this.f2(h0, object1);
                    }
                    return object1;
                }
                BigDecimal bigDecimal0 = n0.i1();
                return this.h.o(h0, bigDecimal0);
            }
            return h0.p0(this.s(), this.e(), n0, "no suitable creator method found to deserialize from Number value (%s)", new Object[]{n0.j2()});
        }
        n n2 = this.s1();
        if(n2 != null && !this.h.e()) {
            Object object2 = n2.g(n0, h0);
            Object object3 = this.h.C(h0, object2);
            if(this.o != null) {
                this.f2(h0, object3);
            }
            return object3;
        }
        double f = n0.j1();
        return this.h.r(h0, f);
    }

    public Object K1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        if(this.y != null) {
            return this.N1(n0, h0);
        }
        n n1 = this.s1();
        if(n1 != null && !this.h.i()) {
            Object object0 = n1.g(n0, h0);
            Object object1 = this.h.C(h0, object0);
            if(this.o != null) {
                this.f2(h0, object1);
            }
            return object1;
        }
        Object object2 = n0.l1();
        if(object2 != null) {
            Class class0 = object2.getClass();
            return this.f.b0(class0) ? object2 : h0.A0(this.f, object2, n0);
        }
        return null;
    }

    public Object L1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        if(this.y != null) {
            return this.N1(n0, h0);
        }
        n n1 = this.s1();
        b n$b0 = n0.i2();
        if(n$b0 == b.a) {
            if(n1 != null && !this.h.f()) {
                Object object0 = n1.g(n0, h0);
                Object object1 = this.h.C(h0, object0);
                if(this.o != null) {
                    this.f2(h0, object1);
                }
                return object1;
            }
            int v = n0.Q1();
            return this.h.s(h0, v);
        }
        if(n$b0 == b.b) {
            if(n1 != null && !this.h.f()) {
                Object object2 = n1.g(n0, h0);
                Object object3 = this.h.C(h0, object2);
                if(this.o != null) {
                    this.f2(h0, object3);
                }
                return object3;
            }
            long v1 = n0.e2();
            return this.h.u(h0, v1);
        }
        if(n$b0 == b.c) {
            if(n1 != null && !this.h.c()) {
                Object object4 = n1.g(n0, h0);
                Object object5 = this.h.C(h0, object4);
                if(this.o != null) {
                    this.f2(h0, object5);
                }
                return object5;
            }
            BigInteger bigInteger0 = n0.x0();
            return this.h.p(h0, bigInteger0);
        }
        return h0.p0(this.s(), this.e(), n0, "no suitable creator method found to deserialize from Number value (%s)", new Object[]{n0.j2()});
    }

    public abstract Object M1(com.fasterxml.jackson.core.n arg1, h arg2) throws IOException;

    protected Object N1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        Object object0 = this.y.f(n0, h0);
        z z0 = h0.b0(object0, this.y.c, this.y.d);
        Object object1 = z0.g();
        if(object1 == null) {
            throw new com.fasterxml.jackson.databind.deser.z(n0, "Could not resolve Object Id [" + object0 + "] (for " + this.f + ").", n0.b1(), z0);
        }
        return object1;
    }

    protected Object O1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        n n1 = this.s1();
        if(n1 != null) {
            Object object0 = n1.g(n0, h0);
            Object object1 = this.h.C(h0, object0);
            if(this.o != null) {
                this.f2(h0, object1);
            }
            return object1;
        }
        if(this.k != null) {
            return this.t1(n0, h0);
        }
        Class class0 = this.f.g();
        if(com.fasterxml.jackson.databind.util.h.e0(class0)) {
            return h0.p0(class0, null, n0, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
        }
        return com.fasterxml.jackson.databind.util.z.d(class0) ? h0.p0(class0, null, n0, "cannot deserialize from Object value (no delegate- or property-based Creator): this appears to be a native image, in which case you may need to configure reflection for the class that is to be deserialized", new Object[0]) : h0.p0(class0, this.e(), n0, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object P1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        if(this.y != null) {
            return this.N1(n0, h0);
        }
        n n1 = this.s1();
        if(n1 != null && !this.h.i()) {
            Object object0 = n1.g(n0, h0);
            Object object1 = this.h.C(h0, object0);
            if(this.o != null) {
                this.f2(h0, object1);
            }
            return object1;
        }
        return this.X(n0, h0);
    }

    protected Object Q1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        return this.M1(n0, h0);
    }

    protected n R1(h h0, y y0) throws o {
        com.fasterxml.jackson.databind.b b0 = h0.o();
        if(b0 != null) {
            Object object0 = b0.p(y0.h());
            if(object0 != null) {
                com.fasterxml.jackson.databind.util.j j0 = h0.m(y0.h(), object0);
                m m0 = j0.a(h0.x());
                return new C(j0, m0, h0.a0(m0));
            }
        }
        return null;
    }

    public y S1(int v) {
        y y0 = this.n == null ? null : this.n.o(v);
        if(y0 == null) {
            return this.k == null ? null : this.k.e(v);
        }
        return y0;
    }

    public y T1(B b0) {
        return this.U1(b0.d());
    }

    public y U1(String s) {
        y y0 = this.n == null ? null : this.n.p(s);
        if(y0 == null) {
            return this.k == null ? null : this.k.f(s);
        }
        return y0;
    }

    @Deprecated
    public final Class V1() {
        return this.f.g();
    }

    public int W1() {
        return this.n.size();
    }

    protected void X1(com.fasterxml.jackson.core.n n0, h h0, Object object0, String s) throws IOException {
        if(h0.J0(i.l)) {
            throw com.fasterxml.jackson.databind.exc.a.M(n0, object0, s, this.p());
        }
        n0.I4();
    }

    protected Object Y1(com.fasterxml.jackson.core.n n0, h h0, com.fasterxml.jackson.core.y y0, Object object0, H h1) throws IOException {
        n n1 = this.w1(h0, object0, h1);
        if(n1 != null) {
            if(h1 != null) {
                h1.p3();
                com.fasterxml.jackson.core.n n2 = h1.d5(y0);
                n2.m4();
                object0 = n1.h(n2, h0, object0);
            }
            return n0 == null ? object0 : n1.h(n0, h0, object0);
        }
        if(h1 != null) {
            object0 = this.a2(h0, object0, h1);
        }
        return n0 == null ? object0 : this.h(n0, h0, object0);
    }

    @Deprecated
    protected Object Z1(com.fasterxml.jackson.core.n n0, h h0, Object object0, H h1) throws IOException {
        return n0 == null ? this.Y1(null, h0, com.fasterxml.jackson.core.y.d(), object0, h1) : this.Y1(n0, h0, n0.J4(), object0, h1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws o {
        m m0;
        y y1;
        N n0;
        s s0 = this.y;
        com.fasterxml.jackson.databind.b b0 = h0.o();
        com.fasterxml.jackson.annotation.n.c n$c0 = null;
        k k0 = D.q0(d0, b0) ? d0.h() : null;
        if(k0 != null) {
            F f0 = b0.M(k0);
            if(f0 != null) {
                F f1 = b0.N(k0, f0);
                Class class0 = f1.c();
                P p0 = h0.C(k0, f1);
                if(class0 == com.fasterxml.jackson.annotation.O.d.class) {
                    B b1 = f1.d();
                    y y0 = this.T1(b1);
                    if(y0 == null) {
                        Object[] arr_object = {com.fasterxml.jackson.databind.util.h.l0(this.s()), com.fasterxml.jackson.databind.util.h.i0(b1)};
                        return (n)h0.D(this.f, String.format("Invalid Object Id definition for %s: cannot find property with name %s", arr_object));
                    }
                    n0 = new com.fasterxml.jackson.databind.deser.impl.w(f1.f());
                    y1 = y0;
                    m0 = y0.getType();
                }
                else {
                    m0 = h0.x().n0(h0.R(class0), N.class)[0];
                    y1 = null;
                    n0 = h0.B(k0, f1);
                }
                s0 = s.a(m0, f1.d(), n0, h0.c0(m0), y1, p0);
            }
        }
        n n1 = s0 == null || s0 == this.y ? this : this.p2(s0);
        if(k0 != null) {
            n1 = this.y1(h0, b0, ((e)n1), k0);
        }
        com.fasterxml.jackson.annotation.n.d n$d0 = this.h1(h0, d0, this.s());
        if(n$d0 != null) {
            if(n$d0.r()) {
                n$c0 = n$d0.m();
            }
            Boolean boolean0 = n$d0.h(com.fasterxml.jackson.annotation.n.a.b);
            if(boolean0 != null) {
                com.fasterxml.jackson.databind.deser.impl.c c0 = this.n.E(boolean0.booleanValue());
                if(c0 != this.n) {
                    n1 = ((e)n1).l2(c0);
                }
            }
        }
        if(n$c0 == null) {
            n$c0 = this.g;
        }
        return n$c0 == com.fasterxml.jackson.annotation.n.c.d ? ((e)n1).F1() : n1;
    }

    protected Object a2(h h0, Object object0, H h1) throws IOException {
        h1.p3();
        com.fasterxml.jackson.core.n n0 = h1.a5();
        while(n0.m4() != r.l) {
            String s = n0.T();
            n0.m4();
            this.o1(n0, h0, object0, s);
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.w
    public void b(h h0) throws o {
        y[] arr_y;
        boolean z = true;
        com.fasterxml.jackson.databind.deser.impl.g.a g$a0 = null;
        if(this.h.h()) {
            arr_y = this.h.I(h0.g0());
            if(this.q != null || this.r != null) {
                for(int v = 0; v < arr_y.length; ++v) {
                    if(q.c(arr_y[v].getName(), this.q, this.r)) {
                        arr_y[v].L();
                    }
                }
            }
        }
        else {
            arr_y = null;
        }
        for(Object object0: this.n) {
            y y0 = (y)object0;
            if(!y0.G()) {
                n n0 = this.R1(h0, y0);
                if(n0 == null) {
                    n0 = h0.a0(y0.getType());
                }
                y y1 = y0.V(n0);
                this.A1(this.n, arr_y, y0, y1);
            }
        }
        com.fasterxml.jackson.databind.deser.impl.D d0 = null;
        for(Object object1: this.n) {
            y y2 = (y)object1;
            y y3 = this.C1(h0, y2.V(h0.r0(y2.E(), y2, y2.getType())));
            if(!(y3 instanceof com.fasterxml.jackson.databind.deser.impl.m)) {
                y3 = this.E1(h0, y3);
            }
            com.fasterxml.jackson.databind.util.x x0 = this.v1(h0, y3);
            if(x0 != null) {
                n n1 = y3.E();
                n n2 = n1.z(x0);
                if(n2 != n1 && n2 != null) {
                    y y4 = y3.V(n2);
                    if(d0 == null) {
                        d0 = new com.fasterxml.jackson.databind.deser.impl.D();
                    }
                    d0.a(y4);
                    this.n.B(y4);
                    continue;
                }
            }
            y y5 = this.B1(h0, this.D1(h0, y3, y3.getMetadata()));
            if(y5 != y2) {
                this.A1(this.n, arr_y, y2, y5);
            }
            if(y5.H()) {
                com.fasterxml.jackson.databind.jsontype.f f0 = y5.F();
                if(f0.k() == com.fasterxml.jackson.annotation.H.a.d) {
                    if(g$a0 == null) {
                        g$a0 = g.e(this.f);
                    }
                    g$a0.b(y5, f0);
                    this.n.B(y5);
                }
            }
        }
        if(this.p != null && !this.p.m()) {
            this.p = this.p.p(this.f1(h0, this.p.l(), this.p.j()));
        }
        if(this.h.l()) {
            m m0 = this.h.H(h0.g0());
            if(m0 == null) {
                Object[] arr_object = {com.fasterxml.jackson.databind.util.h.Q(this.f), com.fasterxml.jackson.databind.util.h.j(this.h)};
                h0.D(this.f, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for \'canCreateUsingDelegate()\', but null for \'getDelegateType()\'", arr_object));
            }
            this.i = this.u1(h0, m0, this.h.G());
        }
        if(this.h.j()) {
            m m1 = this.h.E(h0.g0());
            if(m1 == null) {
                Object[] arr_object1 = {com.fasterxml.jackson.databind.util.h.Q(this.f), com.fasterxml.jackson.databind.util.h.j(this.h)};
                h0.D(this.f, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for \'canCreateUsingArrayDelegate()\', but null for \'getArrayDelegateType()\'", arr_object1));
            }
            this.j = this.u1(h0, m1, this.h.D());
        }
        if(arr_y != null) {
            this.k = v.c(h0, this.h, arr_y, this.n);
        }
        if(g$a0 != null) {
            this.x = g$a0.c(this.n);
            this.l = true;
        }
        this.w = d0;
        if(d0 != null) {
            this.l = true;
        }
        if(!this.m || this.l) {
            z = false;
        }
        this.m = z;
    }

    protected void b2(com.fasterxml.jackson.core.n n0, h h0, Object object0, String s) throws IOException {
        if(q.c(s, this.q, this.r)) {
            this.X1(n0, h0, object0, s);
            return;
        }
        x x0 = this.p;
        if(x0 != null) {
            try {
                x0.g(n0, h0, object0, s);
            }
            catch(Exception exception0) {
                this.q2(exception0, object0, s, h0);
            }
            return;
        }
        this.o1(n0, h0, object0, s);
    }

    public boolean c2(String s) {
        return this.n.p(s) != null;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.util.a d() {
        return com.fasterxml.jackson.databind.util.a.a;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D, com.fasterxml.jackson.databind.deser.B$c
    public com.fasterxml.jackson.databind.deser.B e() {
        return this.h;
    }

    public boolean e2() {
        return this.t;
    }

    protected void f2(h h0, Object object0) throws IOException {
        E[] arr_e = this.o;
        for(int v = 0; v < arr_e.length; ++v) {
            arr_e[v].n(h0, object0);
        }
    }

    public boolean h2() {
        return this.n.A();
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
        if(this.y != null) {
            if(n0.v()) {
                Object object0 = n0.t2();
                if(object0 != null) {
                    return this.z1(n0, h0, f0.e(n0, h0), object0);
                }
            }
            r r0 = n0.Y();
            if(r0 != null) {
                if(r0.g()) {
                    return this.N1(n0, h0);
                }
                if(r0 == r.k) {
                    r0 = n0.m4();
                }
                if(r0 == r.o && this.y.e()) {
                    String s = n0.T();
                    return this.y.d(s, n0) ? this.N1(n0, h0) : f0.e(n0, h0);
                }
            }
        }
        return f0.e(n0, h0);
    }

    public Iterator i2() {
        com.fasterxml.jackson.databind.deser.impl.c c0 = this.n;
        if(c0 == null) {
            throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
        }
        return c0.iterator();
    }

    public void j2(y y0, y y1) {
        this.n.D(y0, y1);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public y k(String s) {
        return this.u == null ? null : ((y)this.u.get(s));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public m k1() {
        return this.f;
    }

    private Throwable k2(Throwable throwable0, h h0) throws IOException {
        while(throwable0 instanceof InvocationTargetException && throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        com.fasterxml.jackson.databind.util.h.v0(throwable0);
        boolean z = h0 == null || h0.J0(i.r);
        if(throwable0 instanceof IOException) {
            if(!z || !(throwable0 instanceof com.fasterxml.jackson.core.f)) {
                throw (IOException)throwable0;
            }
        }
        else if(!z) {
            com.fasterxml.jackson.databind.util.h.x0(throwable0);
        }
        return throwable0;
    }

    public e l2(com.fasterxml.jackson.databind.deser.impl.c c0) {
        throw new UnsupportedOperationException("Class " + this.getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.util.a m() {
        return com.fasterxml.jackson.databind.util.a.c;
    }

    public abstract e m2(Set arg1, Set arg2);

    @Deprecated
    public e n2(Set set0) {
        return this.m2(set0, this.r);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(h h0) throws o {
        try {
            return this.h.B(h0);
        }
        catch(IOException iOException0) {
            return com.fasterxml.jackson.databind.util.h.u0(h0, iOException0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    protected void o1(com.fasterxml.jackson.core.n n0, h h0, Object object0, String s) throws IOException {
        if(this.s) {
            n0.I4();
            return;
        }
        if(q.c(s, this.q, this.r)) {
            this.X1(n0, h0, object0, s);
        }
        super.o1(n0, h0, object0, s);
    }

    public abstract e o2(boolean arg1);

    @Override  // com.fasterxml.jackson.databind.n
    public Collection p() {
        Collection collection0 = new ArrayList();
        for(Object object0: this.n) {
            ((ArrayList)collection0).add(((y)object0).getName());
        }
        return collection0;
    }

    public abstract e p2(s arg1);

    public void q2(Throwable throwable0, Object object0, String s, h h0) throws IOException {
        throw o.D(this.k2(throwable0, h0), object0, s);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public s r() {
        return this.y;
    }

    protected Object r1(com.fasterxml.jackson.core.n n0, h h0, Object object0, n n1) throws IOException {
        H h1 = h0.O(n0);
        if(object0 instanceof String) {
            h1.d(((String)object0));
        }
        else if(object0 instanceof Long) {
            h1.N3(((long)(((Long)object0))));
        }
        else if(object0 instanceof Integer) {
            h1.F3(((int)(((Integer)object0))));
        }
        else {
            h1.writeObject(object0);
        }
        com.fasterxml.jackson.core.n n2 = h1.d5(n0.J4());
        n2.m4();
        return n1.g(n2, h0);
    }

    protected Object r2(Throwable throwable0, h h0) throws IOException {
        while(throwable0 instanceof InvocationTargetException && throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        com.fasterxml.jackson.databind.util.h.v0(throwable0);
        if(throwable0 instanceof IOException) {
            throw (IOException)throwable0;
        }
        if(h0 == null) {
            throw new IllegalArgumentException(throwable0.getMessage(), throwable0);
        }
        if(!h0.J0(i.r)) {
            com.fasterxml.jackson.databind.util.h.x0(throwable0);
        }
        return h0.o0(this.f.g(), null, throwable0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Class s() {
        return this.f.g();
    }

    protected final n s1() {
        return this.i == null ? this.j : this.i;
    }

    protected abstract Object t1(com.fasterxml.jackson.core.n arg1, h arg2) throws IOException;

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return true;
    }

    private n u1(h h0, m m0, p p0) throws o {
        com.fasterxml.jackson.databind.d.b d$b0;
        if(p0 == null || p0.D() != 1) {
            d$b0 = new com.fasterxml.jackson.databind.d.b(e.A, m0, null, p0, A.j);
        }
        else {
            com.fasterxml.jackson.databind.introspect.o o0 = p0.B(0);
            A a0 = this.x1(h0, o0, m0);
            d$b0 = new com.fasterxml.jackson.databind.d.b(e.A, m0, null, o0, a0);
        }
        com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m0.R();
        if(f0 == null) {
            f0 = h0.g0().e1(m0);
        }
        n n0 = (n)m0.S();
        n n1 = n0 == null ? this.f1(h0, m0, d$b0) : h0.s0(n0, d$b0, m0);
        return f0 != null ? new com.fasterxml.jackson.databind.deser.impl.B(f0.g(d$b0), n1) : n1;
    }

    protected com.fasterxml.jackson.databind.util.x v1(h h0, y y0) throws o {
        k k0 = y0.h();
        if(k0 != null) {
            com.fasterxml.jackson.databind.util.x x0 = h0.o().s0(k0);
            if(x0 != null) {
                if(y0 instanceof l) {
                    h0.D(this.k1(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", y0.getName()));
                }
                return x0;
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.d;
    }

    protected n w1(h h0, Object object0, H h1) throws IOException {
        n n0;
        synchronized(this) {
            n0 = this.v == null ? null : ((n)this.v.get(new com.fasterxml.jackson.databind.type.b(object0.getClass())));
        }
        if(n0 != null) {
            return n0;
        }
        n n1 = h0.c0(h0.R(object0.getClass()));
        if(n1 != null) {
            synchronized(this) {
                if(this.v == null) {
                    this.v = new HashMap();
                }
                this.v.put(new com.fasterxml.jackson.databind.type.b(object0.getClass()), n1);
            }
        }
        return n1;
    }

    protected A x1(h h0, k k0, m m0) {
        M m2;
        M m1;
        com.fasterxml.jackson.databind.b b0 = h0.o();
        com.fasterxml.jackson.databind.g g0 = h0.g0();
        A a0 = A.j;
        if(b0 == null) {
            m1 = null;
            m2 = null;
        }
        else {
            com.fasterxml.jackson.annotation.E.a e$a0 = b0.o0(k0);
            if(e$a0 == null) {
                m1 = null;
                m2 = null;
            }
            else {
                m1 = e$a0.m();
                m2 = e$a0.l();
            }
        }
        com.fasterxml.jackson.annotation.E.a e$a1 = g0.s(m0.g()).h();
        if(e$a1 != null) {
            if(m1 == null) {
                m1 = e$a1.m();
            }
            if(m2 == null) {
                m2 = e$a1.l();
            }
        }
        com.fasterxml.jackson.annotation.E.a e$a2 = g0.I();
        if(m1 == null) {
            m1 = e$a2.m();
        }
        if(m2 == null) {
            m2 = e$a2.l();
        }
        return m1 == null && m2 == null ? a0 : a0.r(m1, m2);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(com.fasterxml.jackson.databind.g g0) {
        return true;
    }

    protected e y1(h h0, com.fasterxml.jackson.databind.b b0, e e0, k k0) throws o {
        com.fasterxml.jackson.databind.g g0 = h0.g0();
        com.fasterxml.jackson.annotation.s.a s$a0 = b0.X(g0, k0);
        if(s$a0.p() && !this.s) {
            e0 = e0.o2(true);
        }
        Set set0 = s$a0.h();
        Set set1 = e0.q;
        if(set0.isEmpty()) {
            set0 = set1;
        }
        else if(set1 != null && !set1.isEmpty()) {
            HashSet hashSet0 = new HashSet(set1);
            hashSet0.addAll(set0);
            set0 = hashSet0;
        }
        Set set2 = q.b(e0.r, b0.a0(g0, k0).f());
        return set0 == set1 && set2 == e0.r ? e0 : e0.m2(set0, set2);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public abstract n z(com.fasterxml.jackson.databind.util.x arg1);

    protected Object z1(com.fasterxml.jackson.core.n n0, h h0, Object object0, Object object1) throws IOException {
        n n1 = this.y.b();
        Class class0 = object1.getClass();
        if(n1.s() != class0) {
            object1 = this.r1(n0, h0, object1, n1);
        }
        h0.b0(object1, this.y.c, this.y.d).b(object0);
        y y0 = this.y.f;
        return y0 == null ? object0 : y0.N(object0, object1);
    }
}

