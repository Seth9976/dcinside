package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.h.c;
import com.fasterxml.jackson.annotation.n.d;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.introspect.J;
import com.fasterxml.jackson.databind.introspect.M;
import com.fasterxml.jackson.databind.introspect.a.b;
import com.fasterxml.jackson.databind.introspect.w;
import com.fasterxml.jackson.databind.jsontype.e;
import com.fasterxml.jackson.databind.util.D;
import j..util.Objects;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public abstract class u extends t implements Serializable {
    protected final J f;
    protected final e g;
    protected final B h;
    protected final Class i;
    protected final k j;
    protected final D k;
    protected final i l;
    protected final m m;
    protected static final h n;
    private static final long o;
    private static final long p;

    static {
        u.n = h.a();
        u.o = com.fasterxml.jackson.databind.t.d();
        u.p = com.fasterxml.jackson.databind.t.g.f() | com.fasterxml.jackson.databind.t.h.f() | com.fasterxml.jackson.databind.t.i.f() | com.fasterxml.jackson.databind.t.j.f() | com.fasterxml.jackson.databind.t.f.f();
    }

    protected u(a a0, e e0, J j0, D d0, i i0, m m0) {
        super(a0, u.o);
        this.f = j0;
        this.g = e0;
        this.k = d0;
        this.h = null;
        this.i = null;
        this.j = k.b();
        this.l = i0;
        this.m = m0;
    }

    protected u(u u0) {
        super(u0);
        this.f = u0.f;
        this.g = u0.g;
        this.k = u0.k;
        this.h = u0.h;
        this.i = u0.i;
        this.j = u0.j;
        this.l = u0.l;
        this.m = u0.m;
    }

    protected u(u u0, long v) {
        super(u0, v);
        this.f = u0.f;
        this.g = u0.g;
        this.k = u0.k;
        this.h = u0.h;
        this.i = u0.i;
        this.j = u0.j;
        this.l = u0.l;
        this.m = u0.m;
    }

    protected u(u u0, B b0) {
        super(u0);
        this.f = u0.f;
        this.g = u0.g;
        this.k = u0.k;
        this.h = b0;
        this.i = u0.i;
        this.j = u0.j;
        this.l = u0.l;
        this.m = u0.m;
    }

    protected u(u u0, a a0) {
        super(u0, a0);
        this.f = u0.f;
        this.g = u0.g;
        this.k = u0.k;
        this.h = u0.h;
        this.i = u0.i;
        this.j = u0.j;
        this.l = u0.l;
        this.m = u0.m;
    }

    protected u(u u0, k k0) {
        super(u0);
        this.f = u0.f;
        this.g = u0.g;
        this.k = u0.k;
        this.h = u0.h;
        this.i = u0.i;
        this.j = k0;
        this.l = u0.l;
        this.m = u0.m;
    }

    protected u(u u0, m m0) {
        super(u0);
        this.f = u0.f;
        this.g = u0.g;
        this.k = u0.k;
        this.h = u0.h;
        this.i = u0.i;
        this.j = u0.j;
        this.l = u0.l;
        this.m = m0;
    }

    protected u(u u0, J j0) {
        super(u0);
        this.f = j0;
        this.g = u0.g;
        this.k = u0.k;
        this.h = u0.h;
        this.i = u0.i;
        this.j = u0.j;
        this.l = u0.l;
        this.m = u0.m;
    }

    protected u(u u0, e e0) {
        super(u0);
        this.f = u0.f;
        this.g = e0;
        this.k = u0.k;
        this.h = u0.h;
        this.i = u0.i;
        this.j = u0.j;
        this.l = u0.l;
        this.m = u0.m;
    }

    protected u(u u0, e e0, J j0, D d0, i i0) {
        super(u0, u0.b.b());
        this.f = j0;
        this.g = e0;
        this.k = d0;
        this.h = u0.h;
        this.i = u0.i;
        this.j = u0.j;
        this.l = i0;
        this.m = u0.m;
    }

    protected u(u u0, Class class0) {
        super(u0);
        this.f = u0.f;
        this.g = u0.g;
        this.k = u0.k;
        this.h = u0.h;
        this.i = class0;
        this.j = u0.j;
        this.l = u0.l;
        this.m = u0.m;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public Boolean A(Class class0) {
        h h0 = this.l.e(class0);
        if(h0 != null) {
            Boolean boolean0 = h0.g();
            return boolean0 == null ? this.l.h() : boolean0;
        }
        return this.l.h();
    }

    public final u A0(q q0) {
        return this.n0(this.b.C(q0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final d B(Class class0) {
        return this.l.c(class0);
    }

    public final u B0(b a$b0) {
        return this.n0(this.b.x(a$b0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final com.fasterxml.jackson.annotation.s.a C(Class class0) {
        h h0 = this.l.e(class0);
        if(h0 != null) {
            com.fasterxml.jackson.annotation.s.a s$a0 = h0.c();
            return s$a0 == null ? null : s$a0;
        }
        return null;
    }

    public final u C0(w w0) {
        return this.n0(this.b.A(w0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final com.fasterxml.jackson.annotation.s.a D(Class class0, com.fasterxml.jackson.databind.introspect.d d0) {
        com.fasterxml.jackson.databind.b b0 = this.n();
        return b0 == null ? com.fasterxml.jackson.annotation.s.a.s(null, this.C(class0)) : com.fasterxml.jackson.annotation.s.a.s(b0.X(this, d0), this.C(class0));
    }

    public abstract u D0(e arg1);

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final com.fasterxml.jackson.annotation.u.b E() {
        return this.l.f();
    }

    public final u E0(com.fasterxml.jackson.databind.jsontype.i i0) {
        return this.n0(this.b.G(i0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final com.fasterxml.jackson.annotation.u.b F(Class class0) {
        com.fasterxml.jackson.annotation.u.b u$b0 = this.s(class0).d();
        com.fasterxml.jackson.annotation.u.b u$b1 = this.E();
        return u$b1 == null ? u$b0 : u$b1.o(u$b0);
    }

    public final u F0(com.fasterxml.jackson.databind.type.q q0) {
        return this.n0(this.b.F(q0));
    }

    public u G0(DateFormat dateFormat0) {
        return this.n0(this.b.B(dateFormat0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final com.fasterxml.jackson.annotation.v.a H(Class class0, com.fasterxml.jackson.databind.introspect.d d0) {
        com.fasterxml.jackson.databind.b b0 = this.n();
        return b0 == null ? null : b0.a0(this, d0);
    }

    public final u H0(Locale locale0) {
        return this.n0(this.b.u(locale0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final com.fasterxml.jackson.annotation.E.a I() {
        return this.l.i();
    }

    public final u I0(TimeZone timeZone0) {
        return this.n0(this.b.w(timeZone0));
    }

    public final u J0(com.fasterxml.jackson.databind.t[] arr_t) {
        long v = this.a;
        for(int v1 = 0; v1 < arr_t.length; ++v1) {
            v |= arr_t[v1].f();
        }
        return v == this.a ? this : this.o0(v);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final M K() {
        M m0 = this.l.j();
        if((this.a & u.p) != u.p) {
            if(!this.a0(com.fasterxml.jackson.databind.t.g)) {
                m0 = m0.o(c.e);
            }
            if(!this.a0(com.fasterxml.jackson.databind.t.h)) {
                m0 = m0.l(c.e);
            }
            if(!this.a0(com.fasterxml.jackson.databind.t.i)) {
                m0 = m0.j(c.e);
            }
            if(!this.a0(com.fasterxml.jackson.databind.t.j)) {
                m0 = m0.s(c.e);
            }
            return this.a0(com.fasterxml.jackson.databind.t.f) ? m0 : m0.f(c.e);
        }
        return m0;
    }

    public final u K0(com.fasterxml.jackson.databind.b b0) {
        return this.n0(this.b.z(b0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final M L(Class class0, com.fasterxml.jackson.databind.introspect.d d0) {
        M m0;
        if(com.fasterxml.jackson.databind.util.h.a0(class0)) {
            m0 = com.fasterxml.jackson.databind.introspect.M.b.x();
        }
        else {
            m0 = this.K();
            if(com.fasterxml.jackson.databind.util.h.h0(class0) && this.a0(com.fasterxml.jackson.databind.t.f)) {
                m0 = m0.f(c.f);
            }
        }
        com.fasterxml.jackson.databind.b b0 = this.n();
        if(b0 != null) {
            m0 = b0.g(d0, m0);
        }
        h h0 = this.l.e(class0);
        return h0 == null ? m0 : m0.a(h0.i());
    }

    public u L0(Object object0, Object object1) {
        return this.x0(this.o().d(object0, object1));
    }

    public u M0(Map map0) {
        return this.x0(this.o().e(map0));
    }

    public final u N0(l[] arr_l) {
        return this.m0(this.k0().j(arr_l));
    }

    public final u O0(com.fasterxml.jackson.databind.b b0) {
        return this.n0(this.b.D(b0));
    }

    public abstract u P0(B arg1);

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final e Q() {
        return this.g;
    }

    public u Q0(String s) {
        return s == null ? this.P0(null) : this.P0(B.a(s));
    }

    public abstract u R0(Class arg1);

    public final u S0(l l0) {
        return this.m0(this.k0().k(l0));
    }

    public final u T0(com.fasterxml.jackson.databind.t[] arr_t) {
        long v = this.a;
        for(int v1 = 0; v1 < arr_t.length; ++v1) {
            v &= ~arr_t[v1].f();
        }
        return v == this.a ? this : this.o0(v);
    }

    public u U0(Object object0) {
        return this.x0(this.o().f(object0));
    }

    public final u V0(l[] arr_l) {
        return this.m0(this.k0().l(arr_l));
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w$a
    public com.fasterxml.jackson.databind.introspect.w.a a() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w$a
    public final Class b(Class class0) {
        return this.f.b(class0);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public t h0(com.fasterxml.jackson.databind.t t0, boolean z) {
        return this.u0(t0, z);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final h i(Class class0) {
        return this.l.e(class0);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public t i0(com.fasterxml.jackson.databind.t[] arr_t) {
        return this.J0(arr_t);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public B j(com.fasterxml.jackson.databind.m m0) {
        return this.h == null ? this.k.a(m0, this) : this.h;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public t j0(com.fasterxml.jackson.databind.t[] arr_t) {
        return this.T0(arr_t);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public B k(Class class0) {
        return this.h == null ? this.k.b(class0, this) : this.h;
    }

    protected m k0() {
        return this.m;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final Class m() {
        return this.i;
    }

    protected abstract u m0(m arg1);

    protected abstract u n0(a arg1);

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final k o() {
        return this.j;
    }

    protected abstract u o0(long arg1);

    public final B p0() {
        return this.h;
    }

    @Deprecated
    public final String q0() {
        return this.h == null ? null : this.h.d();
    }

    public final int r0() {
        return this.f.f();
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final h s(Class class0) {
        h h0 = this.l.e(class0);
        return h0 == null ? u.n : h0;
    }

    public final u s0(com.fasterxml.jackson.core.a a0) {
        return this.n0(this.b.q(a0));
    }

    public final u t0(com.fasterxml.jackson.databind.b b0) {
        return this.n0(this.b.y(b0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final m u() {
        return this.m;
    }

    public final u u0(com.fasterxml.jackson.databind.t t0, boolean z) {
        long v = z ? t0.f() | this.a : ~t0.f() & this.a;
        return v == this.a ? this : this.o0(v);
    }

    public final u v0(com.fasterxml.jackson.databind.D d0) {
        return this.n0(this.b.E(d0));
    }

    public u w0(com.fasterxml.jackson.databind.cfg.b b0) {
        Objects.requireNonNull(b0);
        return this.n0(this.b.r(b0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final com.fasterxml.jackson.annotation.u.b x(Class class0, Class class1) {
        com.fasterxml.jackson.annotation.u.b u$b0 = this.s(class1).e();
        com.fasterxml.jackson.annotation.u.b u$b1 = this.F(class0);
        return u$b1 == null ? u$b0 : u$b1.o(u$b0);
    }

    public abstract u x0(k arg1);

    public final u y0(l l0) {
        return this.m0(this.k0().i(l0));
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public Boolean z() {
        return this.l.h();
    }

    public final u z0(l l0, boolean z) {
        m m0 = this.k0();
        return z ? this.m0(m0.i(l0)) : this.m0(m0.k(l0));
    }
}

