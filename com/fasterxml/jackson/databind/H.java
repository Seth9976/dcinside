package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.P;
import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.core.x;
import com.fasterxml.jackson.databind.cfg.k;
import com.fasterxml.jackson.databind.deser.impl.B;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.deser.o;
import com.fasterxml.jackson.databind.deser.p;
import com.fasterxml.jackson.databind.deser.q;
import com.fasterxml.jackson.databind.deser.z;
import com.fasterxml.jackson.databind.exc.b;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.node.y;
import com.fasterxml.jackson.databind.util.A;
import com.fasterxml.jackson.databind.util.H;
import com.fasterxml.jackson.databind.util.c;
import com.fasterxml.jackson.databind.util.u;
import j..util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class h extends e implements Serializable {
    protected final p b;
    protected final q c;
    protected final g d;
    protected final int e;
    protected final i f;
    protected final Class g;
    protected transient n h;
    protected final l i;
    protected transient c j;
    protected transient A k;
    protected transient DateFormat l;
    protected transient k m;
    protected u n;
    private static final long o = 1L;

    protected h(q q0, p p0) {
        Objects.requireNonNull(q0);
        this.c = q0;
        if(p0 == null) {
            p0 = new p();
        }
        this.b = p0;
        this.e = 0;
        this.f = null;
        this.d = null;
        this.i = null;
        this.g = null;
        this.m = null;
    }

    protected h(h h0) {
        this.b = h0.b.k();
        this.c = h0.c;
        this.d = h0.d;
        this.e = h0.e;
        this.f = h0.f;
        this.g = h0.g;
        this.i = h0.i;
        this.m = null;
    }

    protected h(h h0, p p0) {
        this.b = p0;
        this.c = h0.c;
        this.d = h0.d;
        this.e = h0.e;
        this.f = h0.f;
        this.g = h0.g;
        this.h = h0.h;
        this.i = h0.i;
        this.m = h0.m;
    }

    protected h(h h0, q q0) {
        this.b = h0.b;
        this.c = q0;
        this.d = h0.d;
        this.e = h0.e;
        this.f = h0.f;
        this.g = h0.g;
        this.h = h0.h;
        this.i = h0.i;
        this.m = h0.m;
    }

    protected h(h h0, g g0) {
        this.b = h0.b;
        this.c = h0.c;
        this.f = null;
        this.d = g0;
        this.e = g0.h1();
        this.g = null;
        this.h = null;
        this.i = null;
        this.m = null;
    }

    protected h(h h0, g g0, n n0, l l0) {
        this.b = h0.b;
        this.c = h0.c;
        this.f = n0 == null ? null : n0.C2();
        this.d = g0;
        this.e = g0.h1();
        this.g = g0.m();
        this.h = n0;
        this.i = l0;
        this.m = g0.o();
    }

    @Override  // com.fasterxml.jackson.databind.e
    public final boolean A(com.fasterxml.jackson.databind.cfg.l l0) {
        return this.d.b0(l0);
    }

    public Object A0(m m0, Object object0, n n0) throws IOException {
        u u0 = this.d.j1();
        Class class0 = m0.g();
        while(u0 != null) {
            Object object1 = ((o)u0.d()).j(this, m0, object0, n0);
            if(object1 != o.a) {
                if(object1 != null && !class0.isInstance(object1)) {
                    throw com.fasterxml.jackson.databind.o.n(n0, this.c("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", new Object[]{com.fasterxml.jackson.databind.util.h.D(m0), com.fasterxml.jackson.databind.util.h.D(object1)}));
                }
                return object1;
            }
            u0 = u0.c();
        }
        throw this.n1(object0, class0);
    }

    public Object B0(Class class0, Number number0, String s, Object[] arr_object) throws IOException {
        String s1 = this.c(s, arr_object);
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            Object object0 = ((o)u0.d()).k(this, class0, number0, s1);
            if(object0 != o.a) {
                if(!this.J(class0, object0)) {
                    throw this.o1(number0, class0, this.c("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", new Object[]{com.fasterxml.jackson.databind.util.h.D(class0), com.fasterxml.jackson.databind.util.h.D(object0)}));
                }
                return object0;
            }
        }
        throw this.o1(number0, class0, s1);
    }

    public Object C0(Class class0, String s, String s1, Object[] arr_object) throws IOException {
        String s2 = this.c(s1, arr_object);
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            Object object0 = ((o)u0.d()).l(this, class0, s, s2);
            if(object0 != o.a) {
                if(!this.J(class0, object0)) {
                    throw this.p1(s, class0, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", com.fasterxml.jackson.databind.util.h.D(class0), com.fasterxml.jackson.databind.util.h.D(object0)));
                }
                return object0;
            }
        }
        throw this.p1(s, class0, s2);
    }

    @Override  // com.fasterxml.jackson.databind.e
    public Object D(m m0, String s) throws com.fasterxml.jackson.databind.o {
        throw b.H(this.h, s, m0);
    }

    public final boolean D0(int v) {
        return (this.e & v) == v;
    }

    public final boolean E0(int v) {
        return (v & this.e) != 0;
    }

    public boolean F0(m m0, AtomicReference atomicReference0) {
        try {
            return this.b.r(this, this.c, m0);
        }
        catch(f f0) {
            if(atomicReference0 != null) {
                atomicReference0.set(f0);
            }
            return false;
        }
        catch(RuntimeException runtimeException0) {
            if(atomicReference0 == null) {
                throw runtimeException0;
            }
            atomicReference0.set(runtimeException0);
            return false;
        }
    }

    public com.fasterxml.jackson.databind.o G0(Class class0, String s) {
        return com.fasterxml.jackson.databind.exc.i.E(this.h, String.format("Cannot construct instance of %s: %s", com.fasterxml.jackson.databind.util.h.l0(class0), s), this.R(class0));
    }

    @Override  // com.fasterxml.jackson.databind.e
    public e H(Object object0, Object object1) {
        return this.l1(object0, object1);
    }

    public com.fasterxml.jackson.databind.o H0(Class class0, Throwable throwable0) {
        String s;
        if(throwable0 == null) {
            s = "N/A";
        }
        else {
            s = com.fasterxml.jackson.databind.util.h.q(throwable0);
            if(s == null) {
                s = com.fasterxml.jackson.databind.util.h.l0(throwable0.getClass());
            }
        }
        Object[] arr_object = {com.fasterxml.jackson.databind.util.h.l0(class0), s};
        return com.fasterxml.jackson.databind.exc.i.F(this.h, String.format("Cannot construct instance of %s, problem: %s", arr_object), this.R(class0), throwable0);
    }

    protected DateFormat I() {
        DateFormat dateFormat0 = this.l;
        if(dateFormat0 != null) {
            return dateFormat0;
        }
        DateFormat dateFormat1 = (DateFormat)this.d.w().clone();
        this.l = dateFormat1;
        return dateFormat1;
    }

    public final boolean I0(x x0) {
        return this.f.d(x0);
    }

    // 去混淆评级： 低(30)
    protected boolean J(Class class0, Object object0) {
        return object0 == null || class0.isInstance(object0) || class0.isPrimitive() && com.fasterxml.jackson.databind.util.h.C0(class0).isInstance(object0);
    }

    public final boolean J0(com.fasterxml.jackson.databind.i i0) {
        return (i0.a() & this.e) != 0;
    }

    protected String K(r r0) {
        return r.j(r0);
    }

    public abstract s K0(com.fasterxml.jackson.databind.introspect.b arg1, Object arg2) throws com.fasterxml.jackson.databind.o;

    private y L(com.fasterxml.jackson.databind.p p0) throws IOException {
        y y0 = new y(p0, (this.h == null ? null : this.h.a1()));
        y0.m4();
        return y0;
    }

    public final A L0() {
        A a0 = this.k;
        if(a0 == null) {
            return new A();
        }
        this.k = null;
        return a0;
    }

    public H M(n n0) throws IOException {
        H h0 = this.O(n0);
        h0.T(n0);
        return h0;
    }

    public com.fasterxml.jackson.databind.o M0(m m0, String s) {
        return com.fasterxml.jackson.databind.exc.e.J(this.h, this.a(String.format("Could not resolve subtype of %s", m0), s), m0, null);
    }

    public final H N() {
        return this.O(this.m0());
    }

    public Date N0(String s) throws IllegalArgumentException {
        try {
            return this.I().parse(s);
        }
        catch(ParseException parseException0) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value \'%s\': %s", s, com.fasterxml.jackson.databind.util.h.q(parseException0)));
        }
    }

    public H O(n n0) {
        return new H(n0, this);
    }

    public Object O0(n n0, d d0, m m0) throws IOException {
        com.fasterxml.jackson.databind.n n1 = this.X(m0, d0);
        return n1 == null ? this.D(m0, String.format("Could not find JsonDeserializer for type %s (via property %s)", com.fasterxml.jackson.databind.util.h.Q(m0), com.fasterxml.jackson.databind.util.h.k0(d0))) : n1.g(n0, this);
    }

    public abstract void P() throws z;

    public Object P0(n n0, d d0, Class class0) throws IOException {
        return this.O0(n0, d0, this.x().f0(class0));
    }

    public Calendar Q(Date date0) {
        Calendar calendar0 = Calendar.getInstance(this.w());
        calendar0.setTime(date0);
        return calendar0;
    }

    public com.fasterxml.jackson.databind.p Q0(n n0) throws IOException {
        r r0 = n0.Y();
        if(r0 == null) {
            r0 = n0.m4();
            if(r0 == null) {
                return this.k0().q();
            }
        }
        return r0 == r.v ? this.k0().r() : ((com.fasterxml.jackson.databind.p)this.c0(this.d.h(com.fasterxml.jackson.databind.p.class)).g(n0, this));
    }

    public final m R(Class class0) {
        return class0 == null ? null : this.d.h(class0);
    }

    public Object R0(com.fasterxml.jackson.databind.p p0, m m0) throws IOException {
        if(p0 == null) {
            return null;
        }
        try(y y0 = this.L(p0)) {
            return this.T0(y0, m0);
        }
    }

    public abstract com.fasterxml.jackson.databind.n S(com.fasterxml.jackson.databind.introspect.b arg1, Object arg2) throws com.fasterxml.jackson.databind.o;

    public Object S0(com.fasterxml.jackson.databind.p p0, Class class0) throws IOException {
        if(p0 == null) {
            return null;
        }
        try(y y0 = this.L(p0)) {
            return this.U0(y0, class0);
        }
    }

    public String T(n n0, com.fasterxml.jackson.databind.n n1, Class class0) throws IOException {
        return (String)this.v0(class0, n0);
    }

    public Object T0(n n0, m m0) throws IOException {
        com.fasterxml.jackson.databind.n n1 = this.c0(m0);
        return n1 == null ? this.D(m0, "Could not find JsonDeserializer for type " + com.fasterxml.jackson.databind.util.h.Q(m0)) : n1.g(n0, this);
    }

    public Class U(String s) throws ClassNotFoundException {
        return this.x().k0(s);
    }

    public Object U0(n n0, Class class0) throws IOException {
        return this.T0(n0, this.x().f0(class0));
    }

    public com.fasterxml.jackson.databind.cfg.c V(com.fasterxml.jackson.databind.type.h h0, Class class0, com.fasterxml.jackson.databind.cfg.f f0) {
        return this.d.c1(h0, class0, f0);
    }

    public Object V0(com.fasterxml.jackson.databind.n n0, Class class0, Object object0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        throw com.fasterxml.jackson.databind.exc.c.J(this.m0(), this.c(s, arr_object), object0, class0);
    }

    public com.fasterxml.jackson.databind.cfg.c W(com.fasterxml.jackson.databind.type.h h0, Class class0, com.fasterxml.jackson.databind.cfg.c c0) {
        return this.d.d1(h0, class0, c0);
    }

    public Object W0(com.fasterxml.jackson.databind.c c0, v v0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        Object[] arr_object1 = {com.fasterxml.jackson.databind.util.h.k0(v0), com.fasterxml.jackson.databind.util.h.l0(c0.y()), this.c(s, arr_object)};
        throw b.G(this.h, String.format("Invalid definition for property %s (of type %s): %s", arr_object1), c0, v0);
    }

    public final com.fasterxml.jackson.databind.n X(m m0, d d0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.n n0 = this.b.p(this, this.c, m0);
        return n0 == null ? null : this.s0(n0, d0, m0);
    }

    public Object X0(com.fasterxml.jackson.databind.c c0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        Object[] arr_object1 = {com.fasterxml.jackson.databind.util.h.l0(c0.y()), this.c(s, arr_object)};
        throw b.G(this.h, String.format("Invalid type definition for type %s: %s", arr_object1), c0, null);
    }

    public final Object Y(Object object0, d d0, Object object1) throws com.fasterxml.jackson.databind.o {
        return this.i == null ? this.E(com.fasterxml.jackson.databind.util.h.k(object0), String.format("No \'injectableValues\' configured, cannot inject value with id [%s]", object0)) : this.i.a(object0, this, d0, object1);
    }

    public Object Y0(d d0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.exc.f f0 = com.fasterxml.jackson.databind.exc.f.E(this.m0(), (d0 == null ? null : d0.getType()), this.c(s, arr_object));
        if(d0 != null) {
            com.fasterxml.jackson.databind.introspect.k k0 = d0.h();
            if(k0 != null) {
                f0.g(k0.m(), d0.getName());
            }
        }
        throw f0;
    }

    public final s Z(m m0, d d0) throws com.fasterxml.jackson.databind.o {
        try {
            s s0 = this.b.o(this, this.c, m0);
            return s0 instanceof com.fasterxml.jackson.databind.deser.k ? ((com.fasterxml.jackson.databind.deser.k)s0).a(this, d0) : s0;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            this.D(m0, com.fasterxml.jackson.databind.util.h.q(illegalArgumentException0));
            throw new NullPointerException();
        }
    }

    public Object Z0(m m0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        throw com.fasterxml.jackson.databind.exc.f.E(this.m0(), m0, this.c(s, arr_object));
    }

    public final com.fasterxml.jackson.databind.n a0(m m0) throws com.fasterxml.jackson.databind.o {
        return this.b.p(this, this.c, m0);
    }

    public Object a1(com.fasterxml.jackson.databind.n n0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        throw com.fasterxml.jackson.databind.exc.f.F(this.m0(), n0.s(), this.c(s, arr_object));
    }

    public abstract com.fasterxml.jackson.databind.deser.impl.z b0(Object arg1, N arg2, P arg3);

    public final com.fasterxml.jackson.databind.n c0(m m0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.n n0 = this.b.p(this, this.c, m0);
        if(n0 == null) {
            return null;
        }
        com.fasterxml.jackson.databind.n n1 = this.s0(n0, null, m0);
        com.fasterxml.jackson.databind.jsontype.f f0 = this.c.l(this.d, m0);
        return f0 != null ? new B(f0.g(null), n1) : n1;
    }

    public Object c1(Class class0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        throw com.fasterxml.jackson.databind.exc.f.F(this.m0(), class0, this.c(s, arr_object));
    }

    public Object d1(m m0, String s, String s1, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        return this.e1(m0.g(), s, s1, arr_object);
    }

    public final c e0() {
        if(this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    public Object e1(Class class0, String s, String s1, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.exc.f f0 = com.fasterxml.jackson.databind.exc.f.F(this.m0(), class0, this.c(s1, arr_object));
        if(s != null) {
            f0.g(class0, s);
        }
        throw f0;
    }

    public final a f0() {
        return this.d.p();
    }

    public Object f1(Class class0, n n0, r r0) throws com.fasterxml.jackson.databind.o {
        throw com.fasterxml.jackson.databind.exc.f.F(n0, class0, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", r0, com.fasterxml.jackson.databind.util.h.l0(class0)));
    }

    public g g0() {
        return this.d;
    }

    public Object g1(com.fasterxml.jackson.databind.deser.impl.s s0, Object object0) throws com.fasterxml.jackson.databind.o {
        Object[] arr_object = {com.fasterxml.jackson.databind.util.h.j(object0), s0.b};
        return this.Y0(s0.f, String.format("No Object Id found for an instance of %s, to assign to property \'%s\'", arr_object), new Object[0]);
    }

    public m h0() {
        return this.n == null ? null : ((m)this.n.d());
    }

    public void h1(m m0, r r0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        throw this.q1(this.m0(), m0, r0, this.c(s, arr_object));
    }

    public final int i0() {
        return this.e;
    }

    public void i1(com.fasterxml.jackson.databind.n n0, r r0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        throw this.r1(this.m0(), n0.s(), r0, this.c(s, arr_object));
    }

    @Override  // com.fasterxml.jackson.databind.e
    public final boolean j() {
        return this.d.c();
    }

    public q j0() {
        return this.c;
    }

    public void j1(Class class0, r r0, String s, Object[] arr_object) throws com.fasterxml.jackson.databind.o {
        throw this.r1(this.m0(), class0, r0, this.c(s, arr_object));
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.e
    public m k(m m0, Class class0) throws IllegalArgumentException {
        return m0.j(class0) ? m0 : this.g0().S().c0(m0, class0, false);
    }

    public final com.fasterxml.jackson.databind.node.m k0() {
        return this.d.i1();
    }

    public final void k1(A a0) {
        if(this.k == null || a0.h() >= this.k.h()) {
            this.k = a0;
        }
    }

    public h l1(Object object0, Object object1) {
        this.m = this.m.c(object0, object1);
        return this;
    }

    public final n m0() {
        return this.h;
    }

    public com.fasterxml.jackson.databind.o m1(Class class0, String s, String s1) {
        return com.fasterxml.jackson.databind.exc.c.J(this.h, String.format("Cannot deserialize Map key of type %s from String %s: %s", com.fasterxml.jackson.databind.util.h.l0(class0), this.d(s), s1), s, class0);
    }

    @Override  // com.fasterxml.jackson.databind.e
    public final Class n() {
        return this.g;
    }

    public void n0(com.fasterxml.jackson.databind.n n0) throws com.fasterxml.jackson.databind.o {
        if(this.z(t.H)) {
            return;
        }
        m m0 = this.R(n0.s());
        throw b.H(this.m0(), String.format("Invalid configuration: values of type %s cannot be merged", com.fasterxml.jackson.databind.util.h.Q(m0)), m0);
    }

    public com.fasterxml.jackson.databind.o n1(Object object0, Class class0) {
        return com.fasterxml.jackson.databind.exc.c.J(this.h, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", com.fasterxml.jackson.databind.util.h.l0(class0), com.fasterxml.jackson.databind.util.h.j(object0)), object0, class0);
    }

    @Override  // com.fasterxml.jackson.databind.e
    public final com.fasterxml.jackson.databind.b o() {
        return this.d.n();
    }

    public Object o0(Class class0, Object object0, Throwable throwable0) throws IOException {
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            Object object1 = ((o)u0.d()).a(this, class0, object0, throwable0);
            if(object1 != o.a) {
                if(this.J(class0, object1)) {
                    return object1;
                }
                this.D(this.R(class0), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", com.fasterxml.jackson.databind.util.h.D(class0), com.fasterxml.jackson.databind.util.h.j(object1)));
            }
        }
        com.fasterxml.jackson.databind.util.h.w0(throwable0);
        if(!this.J0(com.fasterxml.jackson.databind.i.r)) {
            com.fasterxml.jackson.databind.util.h.x0(throwable0);
        }
        throw this.H0(class0, throwable0);
    }

    public com.fasterxml.jackson.databind.o o1(Number number0, Class class0, String s) {
        return com.fasterxml.jackson.databind.exc.c.J(this.h, String.format("Cannot deserialize value of type %s from number %s: %s", com.fasterxml.jackson.databind.util.h.l0(class0), String.valueOf(number0), s), number0, class0);
    }

    @Override  // com.fasterxml.jackson.databind.e
    public Object p(Object object0) {
        return this.m.a(object0);
    }

    public Object p0(Class class0, com.fasterxml.jackson.databind.deser.B b0, n n0, String s, Object[] arr_object) throws IOException {
        if(n0 == null) {
            n0 = this.m0();
        }
        String s1 = this.c(s, arr_object);
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            Object object0 = ((o)u0.d()).c(this, class0, b0, n0, s1);
            if(object0 != o.a) {
                if(this.J(class0, object0)) {
                    return object0;
                }
                this.D(this.R(class0), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", com.fasterxml.jackson.databind.util.h.D(class0), com.fasterxml.jackson.databind.util.h.D(object0)));
            }
        }
        if(b0 == null) {
            return this.E(class0, String.format("Cannot construct instance of %s: %s", com.fasterxml.jackson.databind.util.h.l0(class0), s1));
        }
        return b0.m() ? this.c1(class0, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", com.fasterxml.jackson.databind.util.h.l0(class0), s1), new Object[0]) : this.E(class0, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", com.fasterxml.jackson.databind.util.h.l0(class0), s1));
    }

    public com.fasterxml.jackson.databind.o p1(String s, Class class0, String s1) {
        Object[] arr_object = {com.fasterxml.jackson.databind.util.h.l0(class0), this.d(s), s1};
        return com.fasterxml.jackson.databind.exc.c.J(this.h, String.format("Cannot deserialize value of type %s from String %s: %s", arr_object), s, class0);
    }

    @Override  // com.fasterxml.jackson.databind.e
    public com.fasterxml.jackson.databind.cfg.t q() {
        return this.g0();
    }

    public m q0(m m0, com.fasterxml.jackson.databind.jsontype.g g0, String s) throws IOException {
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            m m1 = ((o)u0.d()).d(this, m0, g0, s);
            if(m1 != null) {
                if(m1.j(Void.class)) {
                    return null;
                }
                if(!m1.a0(m0.g())) {
                    throw this.y(m0, null, "problem handler tried to resolve into non-subtype: " + com.fasterxml.jackson.databind.util.h.Q(m1));
                }
                return m1;
            }
        }
        throw this.M0(m0, s);
    }

    public com.fasterxml.jackson.databind.o q1(n n0, m m0, r r0, String s) {
        return com.fasterxml.jackson.databind.exc.f.E(n0, m0, this.a(String.format("Unexpected token (%s), expected %s", n0.Y(), r0), s));
    }

    @Override  // com.fasterxml.jackson.databind.e
    public final com.fasterxml.jackson.databind.cfg.m r() {
        return this.d.u();
    }

    public com.fasterxml.jackson.databind.n r0(com.fasterxml.jackson.databind.n n0, d d0, m m0) throws com.fasterxml.jackson.databind.o {
        if(n0 instanceof j) {
            this.n = new u(m0, this.n);
            try {
                return ((j)n0).a(this, d0);
            }
            finally {
                this.n = this.n.c();
            }
        }
        return n0;
    }

    public com.fasterxml.jackson.databind.o r1(n n0, Class class0, r r0, String s) {
        return com.fasterxml.jackson.databind.exc.f.F(n0, class0, this.a(String.format("Unexpected token (%s), expected %s", n0.Y(), r0), s));
    }

    @Override  // com.fasterxml.jackson.databind.e
    public final com.fasterxml.jackson.annotation.n.d s(Class class0) {
        return this.d.B(class0);
    }

    public com.fasterxml.jackson.databind.n s0(com.fasterxml.jackson.databind.n n0, d d0, m m0) throws com.fasterxml.jackson.databind.o {
        if(n0 instanceof j) {
            this.n = new u(m0, this.n);
            try {
                return ((j)n0).a(this, d0);
            }
            finally {
                this.n = this.n.c();
            }
        }
        return n0;
    }

    public Object t0(m m0, n n0) throws IOException {
        return this.u0(m0, n0.Y(), n0, null, new Object[0]);
    }

    @Override  // com.fasterxml.jackson.databind.e
    public Locale u() {
        return this.d.N();
    }

    public Object u0(m m0, r r0, n n0, String s, Object[] arr_object) throws IOException {
        String s1 = this.c(s, arr_object);
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            Object object0 = ((o)u0.d()).e(this, m0, r0, n0, s1);
            if(object0 != o.a) {
                if(this.J(m0.g(), object0)) {
                    return object0;
                }
                this.D(m0, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", com.fasterxml.jackson.databind.util.h.Q(m0), com.fasterxml.jackson.databind.util.h.j(object0)));
            }
        }
        if(s1 == null) {
            String s2 = com.fasterxml.jackson.databind.util.h.Q(m0);
            s1 = r0 == null ? String.format("Unexpected end-of-input when trying read value of type %s", s2) : String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", s2, this.K(r0), r0);
        }
        if(r0 != null && r0.g()) {
            n0.R2();
        }
        this.Z0(m0, s1, new Object[0]);
        return null;
    }

    public Object v0(Class class0, n n0) throws IOException {
        return this.u0(this.R(class0), n0.Y(), n0, null, new Object[0]);
    }

    @Override  // com.fasterxml.jackson.databind.e
    public TimeZone w() {
        return this.d.R();
    }

    public Object w0(Class class0, r r0, n n0, String s, Object[] arr_object) throws IOException {
        return this.u0(this.R(class0), r0, n0, s, arr_object);
    }

    @Override  // com.fasterxml.jackson.databind.e
    public final com.fasterxml.jackson.databind.type.q x() {
        return this.d.S();
    }

    public boolean x0(n n0, com.fasterxml.jackson.databind.n n1, Object object0, String s) throws IOException {
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            if(((o)u0.d()).g(this, n0, n1, object0, s)) {
                return true;
            }
        }
        if(this.J0(com.fasterxml.jackson.databind.i.g)) {
            throw com.fasterxml.jackson.databind.exc.h.M(this.h, object0, s, (n1 == null ? null : n1.p()));
        }
        n0.I4();
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.e
    public com.fasterxml.jackson.databind.o y(m m0, String s, String s1) {
        Object[] arr_object = {s, com.fasterxml.jackson.databind.util.h.Q(m0)};
        return com.fasterxml.jackson.databind.exc.e.J(this.h, this.a(String.format("Could not resolve type id \'%s\' as a subtype of %s", arr_object), s1), m0, s);
    }

    public m y0(m m0, String s, com.fasterxml.jackson.databind.jsontype.g g0, String s1) throws IOException {
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            m m1 = ((o)u0.d()).h(this, m0, s, g0, s1);
            if(m1 != null) {
                if(m1.j(Void.class)) {
                    return null;
                }
                if(!m1.a0(m0.g())) {
                    throw this.y(m0, s, "problem handler tried to resolve into non-subtype: " + com.fasterxml.jackson.databind.util.h.Q(m1));
                }
                return m1;
            }
        }
        if(this.J0(com.fasterxml.jackson.databind.i.j)) {
            throw this.y(m0, s, s1);
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.e
    public final boolean z(t t0) {
        return this.d.a0(t0);
    }

    public Object z0(Class class0, String s, String s1, Object[] arr_object) throws IOException {
        String s2 = this.c(s1, arr_object);
        for(u u0 = this.d.j1(); u0 != null; u0 = u0.c()) {
            Object object0 = ((o)u0.d()).i(this, class0, s, s2);
            if(object0 != o.a) {
                if(object0 != null && !class0.isInstance(object0)) {
                    throw this.p1(s, class0, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", com.fasterxml.jackson.databind.util.h.D(class0), com.fasterxml.jackson.databind.util.h.D(object0)));
                }
                return object0;
            }
        }
        throw this.m1(class0, s, s2);
    }
}

