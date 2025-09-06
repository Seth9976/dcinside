package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.deser.std.C;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.b;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.s;
import com.fasterxml.jackson.databind.type.a;
import com.fasterxml.jackson.databind.type.d;
import com.fasterxml.jackson.databind.type.e;
import com.fasterxml.jackson.databind.type.i;
import com.fasterxml.jackson.databind.type.l;
import com.fasterxml.jackson.databind.util.j;
import com.fasterxml.jackson.databind.util.t;
import com.fasterxml.jackson.databind.util.w;
import java.io.Serializable;
import java.util.HashMap;

public final class p implements Serializable {
    protected final w a;
    protected final HashMap b;
    private static final long c = 1L;
    public static final int d = 2000;

    public p() {
        this(2000);
    }

    public p(int v) {
        this(new t(Math.min(0x40, v >> 2), v));
    }

    public p(w w0) {
        this.b = new HashMap(8);
        this.a = w0;
    }

    protected n a(h h0, q q0, m m0) throws o {
        n n0;
        try {
            n0 = this.c(h0, q0, m0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            h0.D(m0, com.fasterxml.jackson.databind.util.h.q(illegalArgumentException0));
            n0 = null;
        }
        if(n0 == null) {
            return null;
        }
        boolean z = !this.h(m0) && n0.u();
        if(n0 instanceof com.fasterxml.jackson.databind.deser.w) {
            this.b.put(m0, n0);
            ((com.fasterxml.jackson.databind.deser.w)n0).b(h0);
            this.b.remove(m0);
        }
        if(z) {
            this.a.put(m0, n0);
        }
        return n0;
    }

    protected n b(h h0, q q0, m m0) throws o {
        n n2;
        synchronized(this.b) {
            n n0 = this.e(m0);
            if(n0 != null) {
                return n0;
            }
            int v1 = this.b.size();
            if(v1 > 0) {
                n n1 = (n)this.b.get(m0);
                if(n1 != null) {
                    return n1;
                }
            }
            try {
                n2 = this.a(h0, q0, m0);
            }
            catch(Throwable throwable0) {
                if(v1 == 0 && this.b.size() > 0) {
                    this.b.clear();
                }
                throw throwable0;
            }
            if(v1 == 0 && this.b.size() > 0) {
                this.b.clear();
            }
            return n2;
        }
    }

    protected n c(h h0, q q0, m m0) throws o {
        g g0 = h0.g0();
        if(m0.k() || m0.r() || m0.m()) {
            m0 = q0.o(g0, m0);
        }
        c c0 = g0.o1(m0);
        n n0 = this.n(h0, c0.A());
        if(n0 != null) {
            return n0;
        }
        m m1 = this.s(h0, c0.A(), m0);
        if(m1 != m0) {
            c0 = g0.o1(m1);
            m0 = m1;
        }
        Class class0 = c0.s();
        if(class0 != null) {
            return q0.c(h0, m0, c0, class0);
        }
        j j0 = c0.k();
        if(j0 == null) {
            return this.d(h0, q0, m0, c0);
        }
        m m2 = j0.a(h0.x());
        if(!m2.j(m0.g())) {
            c0 = g0.o1(m2);
        }
        return new C(j0, m2, this.d(h0, q0, m2, c0));
    }

    protected n d(h h0, q q0, m m0, c c0) throws o {
        g g0 = h0.g0();
        if(m0.p()) {
            return q0.f(h0, m0, c0);
        }
        if(m0.o()) {
            if(m0.l()) {
                return q0.a(h0, ((a)m0), c0);
            }
            if(m0.r() && c0.l(null).m() != com.fasterxml.jackson.annotation.n.c.e) {
                return ((i)m0) instanceof com.fasterxml.jackson.databind.type.j ? q0.h(h0, ((com.fasterxml.jackson.databind.type.j)(((i)m0))), c0) : q0.i(h0, ((i)m0), c0);
            }
            if(m0.m() && c0.l(null).m() != com.fasterxml.jackson.annotation.n.c.e) {
                return ((d)m0) instanceof e ? q0.d(h0, ((e)(((d)m0))), c0) : q0.e(h0, ((d)m0), c0);
            }
        }
        if(m0.s()) {
            return q0.j(h0, ((l)m0), c0);
        }
        return com.fasterxml.jackson.databind.p.class.isAssignableFrom(m0.g()) ? q0.k(g0, m0, c0) : q0.b(h0, m0, c0);
    }

    protected n e(m m0) {
        if(m0 == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        return this.h(m0) ? null : ((n)this.a.get(m0));
    }

    protected s f(h h0, m m0) throws o {
        return (s)h0.D(m0, "Cannot find a (Map) Key deserializer for type " + m0);
    }

    protected n g(h h0, m m0) throws o {
        return com.fasterxml.jackson.databind.util.h.W(m0.g()) ? ((n)h0.D(m0, "Cannot find a Value deserializer for type " + m0)) : ((n)h0.D(m0, "Cannot find a Value deserializer for abstract type " + m0));
    }

    private boolean h(m m0) {
        if(m0.o()) {
            m m1 = m0.E();
            return m1 == null || m1.S() == null && m1.R() == null ? m0.r() && m0.N().S() != null : true;
        }
        return false;
    }

    private Class i(Object object0, String s, Class class0) {
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector." + s + "() returned value of type " + object0.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
        }
        return ((Class)object0) == class0 || com.fasterxml.jackson.databind.util.h.U(((Class)object0)) ? null : ((Class)object0);
    }

    public int j() {
        return this.a.size();
    }

    public p k() {
        return new p(this.a.b());
    }

    protected j l(h h0, b b0) throws o {
        Object object0 = h0.o().p(b0);
        return object0 == null ? null : h0.m(b0, object0);
    }

    protected n m(h h0, b b0, n n0) throws o {
        j j0 = this.l(h0, b0);
        return j0 == null ? n0 : new C(j0, j0.a(h0.x()), n0);
    }

    protected n n(h h0, b b0) throws o {
        Object object0 = h0.o().q(b0);
        return object0 == null ? null : this.m(h0, b0, h0.S(b0, object0));
    }

    public s o(h h0, q q0, m m0) throws o {
        s s0 = q0.g(h0, m0);
        if(s0 == null) {
            return this.f(h0, m0);
        }
        if(s0 instanceof com.fasterxml.jackson.databind.deser.w) {
            ((com.fasterxml.jackson.databind.deser.w)s0).b(h0);
        }
        return s0;
    }

    public n p(h h0, q q0, m m0) throws o {
        n n0 = this.e(m0);
        if(n0 == null) {
            n0 = this.b(h0, q0, m0);
            return n0 == null ? this.g(h0, m0) : n0;
        }
        return n0;
    }

    public void q() {
        this.a.clear();
    }

    public boolean r(h h0, q q0, m m0) throws o {
        n n0 = this.e(m0);
        if(n0 == null) {
            n0 = this.b(h0, q0, m0);
        }
        return n0 != null;
    }

    private m s(h h0, b b0, m m0) throws o {
        n n0;
        com.fasterxml.jackson.databind.b b1 = h0.o();
        if(b1 == null) {
            return m0;
        }
        if(m0.r()) {
            m m1 = m0.N();
            if(m1 != null && m1.S() == null) {
                Object object0 = b1.F(b0);
                if(object0 != null) {
                    s s0 = h0.K0(b0, object0);
                    if(s0 != null) {
                        m0 = ((i)m0).y0(s0);
                    }
                }
            }
        }
        m m2 = m0.E();
        if(m2 != null && m2.S() == null) {
            Object object1 = b1.i(b0);
            if(object1 != null) {
                if(object1 instanceof n) {
                    n0 = (n)object1;
                }
                else {
                    Class class0 = this.i(object1, "findContentDeserializer", com.fasterxml.jackson.databind.n.a.class);
                    n0 = class0 == null ? null : h0.S(b0, class0);
                }
                if(n0 != null) {
                    m0 = m0.h0(n0);
                }
            }
        }
        return b1.L0(h0.g0(), b0, m0);
    }

    Object u() {
        this.b.clear();
        return this;
    }
}

