package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.I;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.exc.c;
import com.fasterxml.jackson.core.filter.b;
import com.fasterxml.jackson.core.filter.d.a;
import com.fasterxml.jackson.core.filter.d;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.z;
import com.fasterxml.jackson.databind.cfg.k;
import com.fasterxml.jackson.databind.deser.n;
import com.fasterxml.jackson.databind.type.q;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import j..util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class y extends u implements I, Serializable {
    protected final g a;
    protected final n b;
    protected final h c;
    protected final boolean d;
    private final d e;
    protected final m f;
    protected final com.fasterxml.jackson.databind.n g;
    protected final Object h;
    protected final e i;
    protected final l j;
    protected final com.fasterxml.jackson.databind.deser.m k;
    protected final ConcurrentHashMap l;
    protected transient m m;
    private static final long n = 2L;

    protected y(x x0, g g0) {
        this(x0, g0, null, null, null, null);
    }

    protected y(x x0, g g0, m m0, Object object0, e e0, l l0) {
        this.a = g0;
        this.b = x0.l;
        this.l = x0.n;
        this.c = x0.a;
        this.f = m0;
        this.h = object0;
        this.i = e0;
        this.j = l0;
        this.d = g0.g0();
        this.g = this.Q(m0);
        this.k = null;
        this.e = null;
    }

    protected y(y y0, d d0) {
        this.a = y0.a;
        this.b = y0.b;
        this.l = y0.l;
        this.c = y0.c;
        this.f = y0.f;
        this.g = y0.g;
        this.h = y0.h;
        this.i = y0.i;
        this.j = y0.j;
        this.d = y0.d;
        this.k = y0.k;
        this.e = d0;
    }

    protected y(y y0, h h0) {
        this.a = (g)y0.a.u0(t.w, false);
        this.b = y0.b;
        this.l = y0.l;
        this.c = h0;
        this.f = y0.f;
        this.g = y0.g;
        this.h = y0.h;
        this.i = y0.i;
        this.j = y0.j;
        this.d = y0.d;
        this.k = y0.k;
        this.e = y0.e;
    }

    protected y(y y0, g g0) {
        this.a = g0;
        this.b = y0.b;
        this.l = y0.l;
        this.c = y0.c;
        this.f = y0.f;
        this.g = y0.g;
        this.h = y0.h;
        this.i = y0.i;
        this.j = y0.j;
        this.d = g0.g0();
        this.k = y0.k;
        this.e = y0.e;
    }

    protected y(y y0, g g0, m m0, com.fasterxml.jackson.databind.n n0, Object object0, e e0, l l0, com.fasterxml.jackson.databind.deser.m m1) {
        this.a = g0;
        this.b = y0.b;
        this.l = y0.l;
        this.c = y0.c;
        this.f = m0;
        this.g = n0;
        this.h = object0;
        this.i = e0;
        this.j = l0;
        this.d = g0.g0();
        this.k = m1;
        this.e = y0.e;
    }

    protected com.fasterxml.jackson.core.n A(com.fasterxml.jackson.core.n n0, boolean z) {
        return this.e != null && !b.class.isInstance(n0) ? new b(n0, this.e, a.a, z) : n0;
    }

    public boolean A0(i i0) {
        return this.a.t1(i0);
    }

    public y A1(l l0) {
        return this.j == l0 ? this : this.O(this, this.a, this.f, this.g, this.h, this.i, l0, this.k);
    }

    protected Object B(com.fasterxml.jackson.databind.deser.m.b m$b0, boolean z) throws IOException {
        if(!m$b0.f()) {
            this.S(this.k, m$b0);
        }
        com.fasterxml.jackson.core.n n0 = m$b0.a();
        if(z) {
            n0.l0(com.fasterxml.jackson.core.n.a.c);
        }
        return m$b0.e().u(n0);
    }

    public boolean B0(t t0) {
        return this.a.a0(t0);
    }

    public y B1(k k0) {
        return this.V(this.a.A1(k0));
    }

    protected Object C(byte[] arr_b, int v, int v1) throws IOException {
        com.fasterxml.jackson.databind.deser.m.b m$b0 = this.k.d(arr_b, v, v1);
        if(!m$b0.f()) {
            this.S(this.k, m$b0);
        }
        return m$b0.e().u(m$b0.a());
    }

    public boolean C0(com.fasterxml.jackson.databind.cfg.l l0) {
        return this.a.b0(l0);
    }

    public y C1(com.fasterxml.jackson.databind.cfg.l l0) {
        return this.V(((g)this.a.y0(l0)));
    }

    protected p D(InputStream inputStream0) throws IOException {
        com.fasterxml.jackson.databind.deser.m.b m$b0 = this.k.b(inputStream0);
        if(!m$b0.f()) {
            this.S(this.k, m$b0);
        }
        com.fasterxml.jackson.core.n n0 = m$b0.a();
        n0.l0(com.fasterxml.jackson.core.n.a.c);
        return m$b0.e().w(n0);
    }

    public p D0() {
        return this.a.i1().q();
    }

    public y D1(com.fasterxml.jackson.databind.node.m m0) {
        return this.V(this.a.C1(m0));
    }

    protected com.fasterxml.jackson.databind.u E(com.fasterxml.jackson.databind.deser.m.b m$b0, boolean z) throws IOException {
        if(!m$b0.f()) {
            this.S(this.k, m$b0);
        }
        com.fasterxml.jackson.core.n n0 = m$b0.a();
        if(z) {
            n0.l0(com.fasterxml.jackson.core.n.a.c);
        }
        return m$b0.e().x(n0);
    }

    public p E0() {
        return this.a.i1().r();
    }

    public y E1(Locale locale0) {
        return this.V(((g)this.a.H0(locale0)));
    }

    protected com.fasterxml.jackson.databind.n F(com.fasterxml.jackson.databind.h h0) throws f {
        com.fasterxml.jackson.databind.n n0 = this.g;
        if(n0 != null) {
            return n0;
        }
        m m0 = this.f;
        if(m0 == null) {
            h0.D(null, "No value type configured for ObjectReader");
        }
        com.fasterxml.jackson.databind.n n1 = (com.fasterxml.jackson.databind.n)this.l.get(m0);
        if(n1 != null) {
            return n1;
        }
        com.fasterxml.jackson.databind.n n2 = h0.c0(m0);
        if(n2 == null) {
            h0.D(m0, "Cannot find a deserializer for type " + m0);
        }
        this.l.put(m0, n2);
        return n2;
    }

    public p F0(DataInput dataInput0) throws IOException {
        if(this.k != null) {
            this.R(dataInput0);
        }
        return this.w(this.A(this.e0(dataInput0), false));
    }

    public y F1(TimeZone timeZone0) {
        return this.V(((g)this.a.I0(timeZone0)));
    }

    protected com.fasterxml.jackson.databind.n G(com.fasterxml.jackson.databind.h h0) throws f {
        m m0 = this.L();
        com.fasterxml.jackson.databind.n n0 = (com.fasterxml.jackson.databind.n)this.l.get(m0);
        if(n0 == null) {
            n0 = h0.c0(m0);
            if(n0 == null) {
                h0.D(m0, "Cannot find a deserializer for type " + m0);
            }
            this.l.put(m0, n0);
        }
        return n0;
    }

    public p G0(InputStream inputStream0) throws IOException {
        return this.k == null ? this.w(this.A(this.g0(inputStream0), false)) : this.D(inputStream0);
    }

    public y G1(Object object0, Object object1) {
        return this.V(((g)this.a.L0(object0, object1)));
    }

    protected void H(com.fasterxml.jackson.databind.h h0, com.fasterxml.jackson.core.n n0) throws IOException {
        this.a.n1(n0, this.i);
    }

    public p H0(Reader reader0) throws IOException {
        if(this.k != null) {
            this.R(reader0);
        }
        return this.w(this.A(this.h0(reader0), false));
    }

    public y H1(Map map0) {
        return this.V(((g)this.a.M0(map0)));
    }

    protected r I(com.fasterxml.jackson.databind.h h0, com.fasterxml.jackson.core.n n0) throws IOException {
        this.a.n1(n0, this.i);
        r r0 = n0.Y();
        if(r0 == null) {
            r0 = n0.m4();
            if(r0 == null) {
                h0.Z0(this.f, "No content to map due to end-of-input", new Object[0]);
            }
        }
        return r0;
    }

    public p I0(String s) throws com.fasterxml.jackson.core.p, o {
        if(this.k != null) {
            this.R(s);
        }
        try {
            return this.w(this.A(this.i0(s), false));
        }
        catch(com.fasterxml.jackson.core.p p0) {
            throw p0;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    public y I1(com.fasterxml.jackson.core.d[] arr_d) {
        return this.V(this.a.D1(arr_d));
    }

    protected InputStream J(File file0) throws IOException {
        return new FileInputStream(file0);
    }

    public p J0(byte[] arr_b) throws IOException {
        this.r("json", arr_b);
        if(this.k != null) {
            this.R(arr_b);
        }
        return this.w(this.A(this.k0(arr_b), false));
    }

    public y J1(com.fasterxml.jackson.core.n.a[] arr_n$a) {
        return this.V(this.a.E1(arr_n$a));
    }

    protected InputStream K(URL uRL0) throws IOException {
        return FirebasePerfUrlConnection.openStream(uRL0);
    }

    public p K0(byte[] arr_b, int v, int v1) throws IOException {
        if(this.k != null) {
            this.R(arr_b);
        }
        return this.w(this.A(this.m0(arr_b, v, v1), false));
    }

    public y K1(i[] arr_i) {
        return this.V(this.a.F1(arr_i));
    }

    protected final m L() {
        m m0 = this.m;
        if(m0 == null) {
            m0 = this.w0().f0(p.class);
            this.m = m0;
        }
        return m0;
    }

    public Object L0(com.fasterxml.jackson.core.n n0) throws IOException {
        this.r("p", n0);
        return this.s(n0, this.h);
    }

    public y L1(com.fasterxml.jackson.databind.cfg.l[] arr_l) {
        return this.V(((g)this.a.N0(arr_l)));
    }

    protected y M(y y0, h h0) {
        return new y(y0, h0);
    }

    public Object M0(com.fasterxml.jackson.core.n n0, m m0) throws IOException {
        this.r("p", n0);
        return this.q0(m0).L0(n0);
    }

    public y M1(com.fasterxml.jackson.databind.deser.m m0) {
        return this.O(this, this.a, this.f, this.g, this.h, this.i, this.j, m0);
    }

    protected y N(y y0, g g0) {
        return new y(y0, g0);
    }

    public Object N0(p p0) throws IOException {
        this.r("content", p0);
        if(this.k != null) {
            this.R(p0);
        }
        return this.u(this.A(this.f(p0), false));
    }

    public y N1(y[] arr_y) {
        return this.M1(new com.fasterxml.jackson.databind.deser.m(arr_y));
    }

    protected y O(y y0, g g0, m m0, com.fasterxml.jackson.databind.n n0, Object object0, e e0, l l0, com.fasterxml.jackson.databind.deser.m m1) {
        return new y(y0, g0, m0, n0, object0, e0, l0, m1);
    }

    public Object O0(p p0, Class class0) throws IOException {
        return this.r0(class0).N0(p0);
    }

    public y O1(com.fasterxml.jackson.databind.deser.o o0) {
        return this.V(this.a.G1(o0));
    }

    protected com.fasterxml.jackson.databind.u P(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0, com.fasterxml.jackson.databind.n n1, boolean z) {
        return new com.fasterxml.jackson.databind.u(this.f, n0, h0, n1, z, this.h);
    }

    public Object P0(DataInput dataInput0) throws IOException {
        if(this.k != null) {
            this.R(dataInput0);
        }
        return this.u(this.A(this.e0(dataInput0), false));
    }

    public y P1(B b0) {
        return this.V(this.a.I1(b0));
    }

    protected com.fasterxml.jackson.databind.n Q(m m0) {
        if(m0 != null && this.a.t1(i.D)) {
            com.fasterxml.jackson.databind.n n0 = (com.fasterxml.jackson.databind.n)this.l.get(m0);
            if(n0 == null) {
                try {
                    n0 = this.a0().c0(m0);
                    if(n0 != null) {
                        this.l.put(m0, n0);
                    }
                    return n0;
                }
                catch(com.fasterxml.jackson.core.f unused_ex) {
                }
            }
            return n0;
        }
        return null;
    }

    public Object Q0(DataInput dataInput0, Class class0) throws IOException {
        return this.r0(class0).P0(dataInput0);
    }

    public y Q1(String s) {
        return this.V(((g)this.a.Q0(s)));
    }

    protected void R(Object object0) throws c {
        throw new com.fasterxml.jackson.core.m(null, "Cannot use source of type " + object0.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public Object R0(File file0) throws IOException {
        return this.k == null ? this.u(this.A(this.f0(file0), false)) : this.B(this.k.b(this.J(file0)), true);
    }

    @Deprecated
    public y R1(com.fasterxml.jackson.core.type.b b0) {
        return this.q0(this.a.S().f0(b0.b()));
    }

    protected void S(com.fasterxml.jackson.databind.deser.m m0, com.fasterxml.jackson.databind.deser.m.b m$b0) throws IOException {
        throw new com.fasterxml.jackson.core.m(null, "Cannot detect format from input, does not look like any of detectable formats " + m0.toString());
    }

    public Object S0(File file0, Class class0) throws IOException {
        return this.r0(class0).R0(file0);
    }

    @Deprecated
    public y S1(m m0) {
        return this.q0(m0);
    }

    protected final void T(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0, m m0) throws IOException {
        r r0 = n0.m4();
        if(r0 != null) {
            Class class0 = com.fasterxml.jackson.databind.util.h.r0(m0);
            if(class0 == null) {
                Object object0 = this.h;
                if(object0 != null) {
                    class0 = object0.getClass();
                }
            }
            h0.f1(class0, n0, r0);
        }
    }

    public Object T0(InputStream inputStream0) throws IOException {
        return this.k == null ? this.u(this.A(this.g0(inputStream0), false)) : this.B(this.k.b(inputStream0), false);
    }

    @Deprecated
    public y T1(Class class0) {
        return this.q0(this.a.h(class0));
    }

    protected void U(e e0) {
        if(e0 != null && !this.c.j(e0)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + e0.getClass().getName() + " for format " + "JSON");
        }
    }

    public Object U0(InputStream inputStream0, Class class0) throws IOException {
        return this.r0(class0).T0(inputStream0);
    }

    @Deprecated
    public y U1(Type type0) {
        return this.q0(this.a.S().f0(type0));
    }

    protected y V(g g0) {
        if(g0 == this.a) {
            return this;
        }
        y y0 = this.N(this, g0);
        return this.k == null ? y0 : y0.M1(this.k.e(g0));
    }

    public Object V0(Reader reader0) throws IOException {
        if(this.k != null) {
            this.R(reader0);
        }
        return this.u(this.A(this.h0(reader0), false));
    }

    public y V1(Object object0) {
        if(object0 == this.h) {
            return this;
        }
        if(object0 == null) {
            return this.O(this, this.a, this.f, this.g, null, this.i, this.j, this.k);
        }
        m m0 = this.f;
        if(m0 == null) {
            Class class0 = object0.getClass();
            m0 = this.a.h(class0);
        }
        return this.O(this, this.a, m0, this.g, object0, this.i, this.j, this.k);
    }

    public y W(com.fasterxml.jackson.core.o o0) {
        this.r("pointer", o0);
        return new y(this, new com.fasterxml.jackson.core.filter.c(o0));
    }

    public Object W0(Reader reader0, Class class0) throws IOException {
        return this.r0(class0).V0(reader0);
    }

    public y W1(Class class0) {
        return this.V(this.a.J1(class0));
    }

    public y X(String s) {
        this.r("pointerExpr", s);
        return new y(this, new com.fasterxml.jackson.core.filter.c(s));
    }

    public Object X0(String s) throws com.fasterxml.jackson.core.p, o {
        if(this.k != null) {
            this.R(s);
        }
        try {
            return this.u(this.A(this.i0(s), false));
        }
        catch(com.fasterxml.jackson.core.p p0) {
            throw p0;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    public y X1(com.fasterxml.jackson.core.d d0) {
        return this.V(this.a.K1(d0));
    }

    public p Y() {
        return this.a.i1().R();
    }

    public Object Y0(String s, Class class0) throws IOException {
        return this.r0(class0).X0(s);
    }

    public y Y1(com.fasterxml.jackson.core.n.a n$a0) {
        return this.V(this.a.L1(n$a0));
    }

    protected n Z(com.fasterxml.jackson.core.n n0) {
        return this.b.v1(this.a, n0, this.j);
    }

    public Object Z0(URL uRL0) throws IOException {
        return this.k == null ? this.u(this.A(this.j0(uRL0), false)) : this.B(this.k.b(this.K(uRL0)), true);
    }

    public y Z1(z z0) {
        return this.V(this.a.L1(z0.f()));
    }

    @Override  // com.fasterxml.jackson.core.u
    public G a() {
        return this.Y();
    }

    protected n a0() {
        return this.b.u1(this.a);
    }

    public Object a1(URL uRL0, Class class0) throws IOException {
        return this.r0(class0).Z0(uRL0);
    }

    public y a2(i i0) {
        return this.V(this.a.M1(i0));
    }

    @Override  // com.fasterxml.jackson.core.u
    public G b() {
        return this.c0();
    }

    public com.fasterxml.jackson.core.n b0() throws IOException {
        com.fasterxml.jackson.core.n n0 = this.c.q();
        return this.a.n1(n0, this.i);
    }

    public y b2(i i0, i[] arr_i) {
        return this.V(this.a.N1(i0, arr_i));
    }

    @Override  // com.fasterxml.jackson.core.F
    public G c() {
        return this.D0();
    }

    public p c0() {
        return this.a.i1().y();
    }

    public Object c1(byte[] arr_b) throws IOException {
        return this.k == null ? this.u(this.A(this.k0(arr_b), false)) : this.C(arr_b, 0, arr_b.length);
    }

    public y c2(com.fasterxml.jackson.databind.cfg.l l0) {
        return this.V(((g)this.a.S0(l0)));
    }

    @Override  // com.fasterxml.jackson.core.F
    public G d() {
        return this.E0();
    }

    public Object d1(byte[] arr_b, int v, int v1) throws IOException {
        return this.k == null ? this.u(this.A(this.m0(arr_b, v, v1), false)) : this.C(arr_b, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.u
    public G e(com.fasterxml.jackson.core.n n0) throws IOException {
        this.r("p", n0);
        return this.z(n0);
    }

    public com.fasterxml.jackson.core.n e0(DataInput dataInput0) throws IOException {
        this.r("content", dataInput0);
        com.fasterxml.jackson.core.n n0 = this.c.s(dataInput0);
        return this.a.n1(n0, this.i);
    }

    public Object e1(byte[] arr_b, int v, int v1, Class class0) throws IOException {
        return this.r0(class0).d1(arr_b, v, v1);
    }

    public y e2(Object object0) {
        return this.V(((g)this.a.U0(object0)));
    }

    @Override  // com.fasterxml.jackson.core.u
    public com.fasterxml.jackson.core.n f(G g0) {
        this.r("n", g0);
        return new com.fasterxml.jackson.databind.node.y(((p)g0), this.V1(null));
    }

    public com.fasterxml.jackson.core.n f0(File file0) throws IOException {
        this.r("src", file0);
        com.fasterxml.jackson.core.n n0 = this.c.u(file0);
        return this.a.n1(n0, this.i);
    }

    public Object f1(byte[] arr_b, Class class0) throws IOException {
        return this.r0(class0).c1(arr_b);
    }

    public y f2(com.fasterxml.jackson.core.d[] arr_d) {
        return this.V(this.a.O1(arr_d));
    }

    @Override  // com.fasterxml.jackson.core.u
    public void g(com.fasterxml.jackson.core.k k0, G g0) {
        throw new UnsupportedOperationException();
    }

    public com.fasterxml.jackson.core.n g0(InputStream inputStream0) throws IOException {
        this.r("in", inputStream0);
        com.fasterxml.jackson.core.n n0 = this.c.w(inputStream0);
        return this.a.n1(n0, this.i);
    }

    public com.fasterxml.jackson.databind.u g1(com.fasterxml.jackson.core.n n0) throws IOException {
        this.r("p", n0);
        n n1 = this.Z(n0);
        return this.P(n0, n1, this.F(n1), false);
    }

    @Override  // com.fasterxml.jackson.core.u
    public h h() {
        return this.c;
    }

    public com.fasterxml.jackson.core.n h0(Reader reader0) throws IOException {
        this.r("r", reader0);
        com.fasterxml.jackson.core.n n0 = this.c.x(reader0);
        return this.a.n1(n0, this.i);
    }

    public com.fasterxml.jackson.databind.u h1(DataInput dataInput0) throws IOException {
        if(this.k != null) {
            this.R(dataInput0);
        }
        return this.x(this.A(this.e0(dataInput0), true));
    }

    public y h2(com.fasterxml.jackson.core.n.a[] arr_n$a) {
        return this.V(this.a.P1(arr_n$a));
    }

    public com.fasterxml.jackson.core.n i0(String s) throws IOException {
        this.r("content", s);
        com.fasterxml.jackson.core.n n0 = this.c.y(s);
        return this.a.n1(n0, this.i);
    }

    public com.fasterxml.jackson.databind.u i1(File file0) throws IOException {
        return this.k == null ? this.x(this.A(this.f0(file0), true)) : this.E(this.k.b(this.J(file0)), false);
    }

    public y i2(i[] arr_i) {
        return this.V(this.a.Q1(arr_i));
    }

    @Override  // com.fasterxml.jackson.core.u
    public Object j(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.a a0) throws IOException {
        this.r("p", n0);
        return this.q0(((m)a0)).L0(n0);
    }

    public com.fasterxml.jackson.core.n j0(URL uRL0) throws IOException {
        this.r("src", uRL0);
        com.fasterxml.jackson.core.n n0 = this.c.z(uRL0);
        return this.a.n1(n0, this.i);
    }

    public com.fasterxml.jackson.databind.u j1(InputStream inputStream0) throws IOException {
        return this.k == null ? this.x(this.A(this.g0(inputStream0), true)) : this.E(this.k.b(inputStream0), false);
    }

    public y j2(com.fasterxml.jackson.databind.cfg.l[] arr_l) {
        return this.V(((g)this.a.V0(arr_l)));
    }

    @Override  // com.fasterxml.jackson.core.u
    public Object k(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.b b0) throws IOException {
        this.r("p", n0);
        return this.p0(b0).L0(n0);
    }

    public com.fasterxml.jackson.core.n k0(byte[] arr_b) throws IOException {
        this.r("content", arr_b);
        com.fasterxml.jackson.core.n n0 = this.c.A(arr_b);
        return this.a.n1(n0, this.i);
    }

    public com.fasterxml.jackson.databind.u k1(Reader reader0) throws IOException {
        if(this.k != null) {
            this.R(reader0);
        }
        com.fasterxml.jackson.core.n n0 = this.A(this.h0(reader0), true);
        n n1 = this.Z(n0);
        this.H(n1, n0);
        n0.m4();
        return this.P(n0, n1, this.F(n1), true);
    }

    public y k2() {
        return this.V(this.a.I1(B.h));
    }

    @Override  // com.fasterxml.jackson.core.u
    public Object l(com.fasterxml.jackson.core.n n0, Class class0) throws IOException {
        this.r("p", n0);
        return this.r0(class0).L0(n0);
    }

    public com.fasterxml.jackson.databind.u l1(String s) throws IOException {
        if(this.k != null) {
            this.R(s);
        }
        com.fasterxml.jackson.core.n n0 = this.A(this.i0(s), true);
        n n1 = this.Z(n0);
        this.H(n1, n0);
        n0.m4();
        return this.P(n0, n1, this.F(n1), true);
    }

    @Override  // com.fasterxml.jackson.core.u
    public Iterator m(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.a a0) throws IOException {
        this.r("p", n0);
        return this.p1(n0, ((m)a0));
    }

    public com.fasterxml.jackson.core.n m0(byte[] arr_b, int v, int v1) throws IOException {
        this.r("content", arr_b);
        com.fasterxml.jackson.core.n n0 = this.c.B(arr_b, v, v1);
        return this.a.n1(n0, this.i);
    }

    public com.fasterxml.jackson.databind.u m1(URL uRL0) throws IOException {
        return this.k == null ? this.x(this.A(this.j0(uRL0), true)) : this.E(this.k.b(this.K(uRL0)), true);
    }

    @Override  // com.fasterxml.jackson.core.u
    public Iterator n(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.b b0) throws IOException {
        this.r("p", n0);
        return this.p0(b0).g1(n0);
    }

    public com.fasterxml.jackson.core.n n0(char[] arr_c) throws IOException {
        this.r("content", arr_c);
        com.fasterxml.jackson.core.n n0 = this.c.C(arr_c);
        return this.a.n1(n0, this.i);
    }

    public final com.fasterxml.jackson.databind.u n1(byte[] arr_b) throws IOException {
        this.r("src", arr_b);
        return this.o1(arr_b, 0, arr_b.length);
    }

    @Override  // com.fasterxml.jackson.core.u
    public Iterator o(com.fasterxml.jackson.core.n n0, Class class0) throws IOException {
        this.r("p", n0);
        return this.r0(class0).g1(n0);
    }

    public com.fasterxml.jackson.core.n o0(char[] arr_c, int v, int v1) throws IOException {
        this.r("content", arr_c);
        com.fasterxml.jackson.core.n n0 = this.c.D(arr_c, v, v1);
        return this.a.n1(n0, this.i);
    }

    public com.fasterxml.jackson.databind.u o1(byte[] arr_b, int v, int v1) throws IOException {
        return this.k == null ? this.x(this.A(this.m0(arr_b, v, v1), true)) : this.E(this.k.d(arr_b, v, v1), false);
    }

    @Override  // com.fasterxml.jackson.core.u
    public Object p(G g0, Class class0) throws com.fasterxml.jackson.core.p {
        this.r("n", g0);
        try {
            return this.l(this.f(g0), class0);
        }
        catch(com.fasterxml.jackson.core.p p0) {
            throw p0;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    public y p0(com.fasterxml.jackson.core.type.b b0) {
        return this.q0(this.a.S().f0(b0.b()));
    }

    public Iterator p1(com.fasterxml.jackson.core.n n0, m m0) throws IOException {
        this.r("p", n0);
        return this.q0(m0).g1(n0);
    }

    @Override  // com.fasterxml.jackson.core.u
    public void q(com.fasterxml.jackson.core.k k0, Object object0) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public y q0(m m0) {
        if(m0 != null && m0.equals(this.f)) {
            return this;
        }
        com.fasterxml.jackson.databind.n n0 = this.Q(m0);
        com.fasterxml.jackson.databind.deser.m m1 = this.k == null ? this.k : this.k.j(m0);
        return this.O(this, this.a, m0, n0, this.h, this.i, this.j, m1);
    }

    public Object q1(G g0, m m0) throws com.fasterxml.jackson.core.p {
        this.r("n", g0);
        try {
            return this.M0(this.f(g0), m0);
        }
        catch(com.fasterxml.jackson.core.p p0) {
            throw p0;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    protected final void r(String s, Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", s));
        }
    }

    public y r0(Class class0) {
        return this.q0(this.a.h(class0));
    }

    public y r1(com.fasterxml.jackson.core.a a0) {
        return this.V(((g)this.a.s0(a0)));
    }

    protected Object s(com.fasterxml.jackson.core.n n0, Object object0) throws IOException {
        n n1 = this.Z(n0);
        r r0 = this.I(n1, n0);
        if(r0 != r.v) {
            if(r0 != r.n && r0 != r.l) {
                com.fasterxml.jackson.databind.n n2 = this.F(n1);
                object0 = n1.x1(n0, this.f, n2, this.h);
            }
        }
        else if(object0 == null) {
            object0 = this.F(n1).c(n1);
        }
        n0.L();
        if(this.a.t1(i.q)) {
            this.T(n0, n1, this.f);
        }
        return object0;
    }

    public y s0(Type type0) {
        return this.q0(this.a.S().f0(type0));
    }

    public y s1(com.fasterxml.jackson.core.d d0) {
        return this.V(this.a.v1(d0));
    }

    public k t0() {
        return this.a.o();
    }

    public y t1(e e0) {
        if(this.i == e0) {
            return this;
        }
        this.U(e0);
        return this.O(this, this.a, this.f, this.g, this.h, e0, this.j, this.k);
    }

    protected Object u(com.fasterxml.jackson.core.n n0) throws IOException {
        Object object0;
        try {
            n n1 = this.Z(n0);
            r r0 = this.I(n1, n0);
            if(r0 == r.v) {
                object0 = this.h;
                if(object0 == null) {
                    object0 = this.F(n1).c(n1);
                }
            }
            else if(r0 != r.n && r0 != r.l) {
                com.fasterxml.jackson.databind.n n2 = this.F(n1);
                object0 = n1.x1(n0, this.f, n2, this.h);
            }
            else {
                object0 = this.h;
            }
            if(this.a.t1(i.q)) {
                this.T(n0, n1, this.f);
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            if(n0 != null) {
                try {
                    n0.close();
                }
                catch(Throwable throwable2) {
                    throwable0.addSuppressed(throwable2);
                }
            }
            throw throwable1;
        }
    label_24:
        if(n0 != null) {
            n0.close();
        }
        return object0;
    }

    public g u0() {
        return this.a;
    }

    public y u1(h h0) {
        if(h0 == this.c) {
            return this;
        }
        y y0 = this.M(this, h0);
        if(h0.S0() == null) {
            h0.d1(y0);
        }
        return y0;
    }

    public l v0() {
        return this.j;
    }

    public y v1(com.fasterxml.jackson.core.n.a n$a0) {
        return this.V(this.a.w1(n$a0));
    }

    @Override  // com.fasterxml.jackson.core.u, com.fasterxml.jackson.core.I
    public H version() {
        return com.fasterxml.jackson.databind.cfg.x.a;
    }

    protected final p w(com.fasterxml.jackson.core.n n0) throws IOException {
        try(n0) {
            return this.y(n0);
        }
    }

    public q w0() {
        return this.a.S();
    }

    public y w1(z z0) {
        return this.V(this.a.w1(z0.f()));
    }

    protected com.fasterxml.jackson.databind.u x(com.fasterxml.jackson.core.n n0) throws IOException {
        n n1 = this.Z(n0);
        this.H(n1, n0);
        n0.m4();
        return this.P(n0, n1, this.F(n1), true);
    }

    public m x0() {
        return this.f;
    }

    public y x1(g g0) {
        return this.V(g0);
    }

    protected final p y(com.fasterxml.jackson.core.n n0) throws IOException {
        Object object0 = this.h;
        if(object0 != null) {
            return (p)this.s(n0, object0);
        }
        this.a.m1(n0);
        e e0 = this.i;
        if(e0 != null) {
            n0.H4(e0);
        }
        r r0 = n0.Y();
        if(r0 == null) {
            r0 = n0.m4();
            if(r0 == null) {
                return this.a.i1().q();
            }
        }
        n n1 = this.Z(n0);
        p p0 = r0 == r.v ? this.a.i1().r() : ((p)n1.x1(n0, this.L(), this.G(n1), null));
        n0.L();
        if(this.a.t1(i.q)) {
            this.T(n0, n1, this.L());
        }
        return p0;
    }

    public boolean y0(com.fasterxml.jackson.core.n.a n$a0) {
        return this.a.s1(n$a0, this.c);
    }

    public y y1(i i0) {
        return this.V(this.a.x1(i0));
    }

    protected final p z(com.fasterxml.jackson.core.n n0) throws IOException {
        Object object0 = this.h;
        if(object0 != null) {
            return (p)this.s(n0, object0);
        }
        this.a.m1(n0);
        e e0 = this.i;
        if(e0 != null) {
            n0.H4(e0);
        }
        r r0 = n0.Y();
        if(r0 == null) {
            r0 = n0.m4();
            if(r0 == null) {
                return null;
            }
        }
        n n1 = this.Z(n0);
        p p0 = r0 == r.v ? this.a.i1().r() : ((p)n1.x1(n0, this.L(), this.G(n1), null));
        n0.L();
        if(this.a.t1(i.q)) {
            this.T(n0, n1, this.L());
        }
        return p0;
    }

    public boolean z0(z z0) {
        return this.a.s1(z0.f(), this.c);
    }

    public y z1(i i0, i[] arr_i) {
        return this.V(this.a.y1(i0, arr_i));
    }
}

