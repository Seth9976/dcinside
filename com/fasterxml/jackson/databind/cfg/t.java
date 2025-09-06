package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.n.d;
import com.fasterxml.jackson.annotation.u.b;
import com.fasterxml.jackson.core.w;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.D;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.introspect.E;
import com.fasterxml.jackson.databind.introspect.M;
import com.fasterxml.jackson.databind.introspect.w.a;
import com.fasterxml.jackson.databind.jsontype.e;
import com.fasterxml.jackson.databind.jsontype.i;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class t implements a, Serializable {
    protected final long a;
    protected final com.fasterxml.jackson.databind.cfg.a b;
    private static final long c = 2L;
    protected static final b d;
    protected static final d e;

    static {
        t.d = b.d();
        t.e = d.c();
    }

    protected t(com.fasterxml.jackson.databind.cfg.a a0, long v) {
        this.b = a0;
        this.a = v;
    }

    protected t(t t0) {
        this.b = t0.b;
        this.a = t0.a;
    }

    protected t(t t0, long v) {
        this.b = t0.b;
        this.a = v;
    }

    protected t(t t0, com.fasterxml.jackson.databind.cfg.a a0) {
        this.b = a0;
        this.a = t0.a;
    }

    public abstract Boolean A(Class arg1);

    public abstract d B(Class arg1);

    public abstract com.fasterxml.jackson.annotation.s.a C(Class arg1);

    public abstract com.fasterxml.jackson.annotation.s.a D(Class arg1, com.fasterxml.jackson.databind.introspect.d arg2);

    public abstract b E();

    public abstract b F(Class arg1);

    public b G(Class class0, b u$b0) {
        b u$b1 = this.s(class0).d();
        return u$b1 == null ? u$b0 : u$b1;
    }

    public abstract com.fasterxml.jackson.annotation.v.a H(Class arg1, com.fasterxml.jackson.databind.introspect.d arg2);

    public abstract com.fasterxml.jackson.annotation.E.a I();

    public final i J(m m0) {
        return this.b.o();
    }

    public abstract M K();

    public abstract M L(Class arg1, com.fasterxml.jackson.databind.introspect.d arg2);

    public final q M() {
        return this.b.i();
    }

    public final Locale N() {
        return this.b.j();
    }

    public com.fasterxml.jackson.databind.jsontype.d O() {
        com.fasterxml.jackson.databind.jsontype.d d0 = this.b.k();
        return d0 == com.fasterxml.jackson.databind.jsontype.impl.m.d && this.a0(com.fasterxml.jackson.databind.t.I) ? new com.fasterxml.jackson.databind.jsontype.b() : d0;
    }

    public final D P() {
        return this.b.l();
    }

    public abstract e Q();

    public final TimeZone R() {
        return this.b.m();
    }

    public final com.fasterxml.jackson.databind.type.q S() {
        return this.b.n();
    }

    public boolean T() {
        return this.b.p();
    }

    @Deprecated
    public final boolean U(int v) {
        return (this.a & ((long)v)) == ((long)v);
    }

    public c V(m m0) {
        return this.r().b(this, m0, this);
    }

    public c W(Class class0) {
        return this.V(this.h(class0));
    }

    public final c X(m m0) {
        return this.r().g(this, m0, this);
    }

    public c Y(Class class0) {
        return this.X(this.h(class0));
    }

    public final boolean Z() {
        return this.a0(com.fasterxml.jackson.databind.t.c);
    }

    public final boolean a0(com.fasterxml.jackson.databind.t t0) {
        return t0.e(this.a);
    }

    public abstract boolean b0(l arg1);

    public final boolean c() {
        return this.a0(com.fasterxml.jackson.databind.t.p);
    }

    public final boolean c0() {
        return this.a0(com.fasterxml.jackson.databind.t.w);
    }

    public static int d(Class class0) {
        Enum[] arr_enum = (Enum[])class0.getEnumConstants();
        int v1 = 0;
        for(int v = 0; v < arr_enum.length; ++v) {
            g g0 = (g)arr_enum[v];
            if(g0.c()) {
                v1 |= g0.a();
            }
        }
        return v1;
    }

    public w e(String s) {
        return new com.fasterxml.jackson.core.io.q(s);
    }

    public com.fasterxml.jackson.databind.jsontype.g e0(com.fasterxml.jackson.databind.introspect.b b0, Class class0) {
        q q0 = this.M();
        if(q0 != null) {
            com.fasterxml.jackson.databind.jsontype.g g0 = q0.i(this, b0, class0);
            return g0 == null ? ((com.fasterxml.jackson.databind.jsontype.g)h.n(class0, this.c())) : g0;
        }
        return (com.fasterxml.jackson.databind.jsontype.g)h.n(class0, this.c());
    }

    public m f(m m0, Class class0) {
        return this.S().c0(m0, class0, true);
    }

    public i f0(com.fasterxml.jackson.databind.introspect.b b0, Class class0) {
        q q0 = this.M();
        if(q0 != null) {
            i i0 = q0.j(this, b0, class0);
            return i0 == null ? ((i)h.n(class0, this.c())) : i0;
        }
        return (i)h.n(class0, this.c());
    }

    public final m g(com.fasterxml.jackson.core.type.b b0) {
        return this.S().f0(b0.b());
    }

    public abstract boolean g0();

    public final m h(Class class0) {
        return this.S().f0(class0);
    }

    public abstract t h0(com.fasterxml.jackson.databind.t arg1, boolean arg2);

    public abstract com.fasterxml.jackson.databind.cfg.h i(Class arg1);

    public abstract t i0(com.fasterxml.jackson.databind.t[] arg1);

    public abstract B j(m arg1);

    public abstract t j0(com.fasterxml.jackson.databind.t[] arg1);

    public abstract B k(Class arg1);

    public final com.fasterxml.jackson.databind.introspect.a.b l() {
        return this.b.c();
    }

    public abstract Class m();

    public com.fasterxml.jackson.databind.b n() {
        return this.a0(com.fasterxml.jackson.databind.t.c) ? this.b.d() : E.b;
    }

    public abstract k o();

    public com.fasterxml.jackson.core.a p() {
        return this.b.e();
    }

    public com.fasterxml.jackson.databind.cfg.b q() {
        return this.b.f();
    }

    public com.fasterxml.jackson.databind.introspect.w r() {
        return this.b.g();
    }

    public abstract com.fasterxml.jackson.databind.cfg.h s(Class arg1);

    public abstract com.fasterxml.jackson.databind.cfg.m u();

    public final DateFormat w() {
        return this.b.h();
    }

    public abstract b x(Class arg1, Class arg2);

    public b y(Class class0, Class class1, b u$b0) {
        return b.k(new b[]{u$b0, this.s(class0).d(), this.s(class1).e()});
    }

    public abstract Boolean z();
}

