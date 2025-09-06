package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.std.w;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.util.h;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public abstract class s extends f implements Serializable {
    protected final g a;
    protected final m b;
    protected final d c;
    protected final m d;
    protected final String e;
    protected final boolean f;
    protected final Map g;
    protected n h;
    private static final long i = 1L;

    protected s(s s0, d d0) {
        this.b = s0.b;
        this.a = s0.a;
        this.e = s0.e;
        this.f = s0.f;
        this.g = s0.g;
        this.d = s0.d;
        this.h = s0.h;
        this.c = d0;
    }

    protected s(m m0, g g0, String s, boolean z, m m1) {
        this.b = m0;
        this.a = g0;
        this.e = h.n0(s);
        this.f = z;
        this.g = new ConcurrentHashMap(16, 0.75f, 2);
        this.d = m1;
        this.c = null;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public abstract f g(d arg1);

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public Class h() {
        return h.r0(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public final String i() {
        return this.e;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public g j() {
        return this.a;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public abstract a k();

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public boolean l() {
        return this.d != null;
    }

    @Deprecated
    protected Object m(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
        return this.n(n0, h0, n0.n3());
    }

    protected Object n(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0, Object object0) throws IOException {
        if(object0 == null) {
            n n1 = this.o(h0);
            return n1 == null ? h0.Z0(this.s(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]) : n1.g(n0, h0);
        }
        return this.p(h0, (object0 instanceof String ? ((String)object0) : String.valueOf(object0))).g(n0, h0);
    }

    protected final n o(com.fasterxml.jackson.databind.h h0) throws IOException {
        m m0 = this.d;
        if(m0 == null) {
            return !h0.J0(i.j) ? w.g : null;
        }
        if(h.U(m0.g())) {
            return w.g;
        }
        synchronized(this.d) {
            if(this.h == null) {
                this.h = h0.X(this.d, this.c);
            }
            return this.h;
        }
    }

    protected final n p(com.fasterxml.jackson.databind.h h0, String s) throws IOException {
        n n0 = (n)this.g.get(s);
        if(n0 == null) {
            m m0 = this.a.c(h0, s);
            if(m0 == null) {
                n0 = this.o(h0);
                if(n0 == null) {
                    m m1 = this.r(h0, s);
                    if(m1 == null) {
                        return w.g;
                    }
                    n0 = h0.X(m1, this.c);
                }
            }
            else {
                if(this.b != null && this.b.getClass() == m0.getClass() && !m0.i()) {
                    try {
                        m0 = h0.k(this.b, m0.g());
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        throw h0.y(this.b, s, illegalArgumentException0.getMessage());
                    }
                }
                n0 = h0.X(m0, this.c);
            }
            this.g.put(s, n0);
        }
        return n0;
    }

    protected m q(com.fasterxml.jackson.databind.h h0, String s) throws IOException {
        return h0.q0(this.b, this.a, s);
    }

    protected m r(com.fasterxml.jackson.databind.h h0, String s) throws IOException {
        String s1 = this.a.b();
        String s2 = s1 == null ? "type ids are not statically known" : "known type ids = " + s1;
        d d0 = this.c;
        if(d0 != null) {
            s2 = String.format("%s (for POJO property \'%s\')", s2, d0.getName());
        }
        return h0.y0(this.b, s, this.a, s2);
    }

    public m s() {
        return this.b;
    }

    @Override
    public String toString() {
        return '[' + this.getClass().getName() + "; base-type:" + this.b + "; id-resolver: " + this.a + ']';
    }

    public String u() {
        return this.b.g().getName();
    }
}

