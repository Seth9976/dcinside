package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.C;
import com.fasterxml.jackson.core.I;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.io.q;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.core.util.c;
import com.fasterxml.jackson.core.util.f;
import com.fasterxml.jackson.core.v;
import com.fasterxml.jackson.core.w;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.ser.l;
import com.fasterxml.jackson.databind.ser.s;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public class z implements I, Serializable {
    public static final class a implements Serializable {
        public final v a;
        public final e b;
        public final d c;
        public final w d;
        private static final long e = 1L;
        public static final a f;

        static {
            a.f = new a(null, null, null, null);
        }

        public a(v v0, e e0, d d0, w w0) {
            this.a = v0;
            this.b = e0;
            this.c = d0;
            this.d = w0;
        }

        private final String a() {
            return this.d == null ? null : this.d.getValue();
        }

        public void b(k k0) {
            v v0 = this.a;
            if(v0 != null) {
                if(v0 == z.h) {
                    k0.Q1(null);
                }
                else {
                    if(v0 instanceof f) {
                        v0 = (v)((f)v0).j();
                    }
                    k0.Q1(v0);
                }
            }
            d d0 = this.c;
            if(d0 != null) {
                k0.l1(d0);
            }
            e e0 = this.b;
            if(e0 != null) {
                k0.e2(e0);
            }
            w w0 = this.d;
            if(w0 != null) {
                k0.d2(w0);
            }
        }

        public a c(e e0) {
            return this.b == e0 ? this : new a(this.a, e0, this.c, this.d);
        }

        public a d(v v0) {
            if(v0 == null) {
                v0 = z.h;
            }
            return v0 == this.a ? this : new a(v0, this.b, this.c, this.d);
        }

        public a e(d d0) {
            return this.c == d0 ? this : new a(this.a, this.b, d0, this.d);
        }

        public a f(w w0) {
            if(w0 == null) {
                return this.d == null ? this : new a(this.a, this.b, this.c, null);
            }
            return w0.equals(this.d) ? this : new a(this.a, this.b, this.c, w0);
        }

        public a g(String s) {
            if(s == null) {
                return this.d == null ? this : new a(this.a, this.b, this.c, null);
            }
            if(s.equals(this.a())) {
                return this;
            }
            q q0 = new q(s);
            return new a(this.a, this.b, this.c, q0);
        }
    }

    public static final class b implements Serializable {
        private final m a;
        private final r b;
        private final j c;
        private static final long d = 1L;
        public static final b e;

        static {
            b.e = new b(null, null, null);
        }

        private b(m m0, r r0, j j0) {
            this.a = m0;
            this.b = r0;
            this.c = j0;
        }

        public b a(z z0, m m0) {
            if(m0 == null) {
                return this.a == null || this.b == null ? this : new b(null, null, null);
            }
            if(m0.equals(this.a)) {
                return this;
            }
            if(m0.Y()) {
                l l0 = z0.g();
                try {
                    return new b(null, null, l0.j0(m0));
                }
                catch(o o0) {
                    throw new E(o0);
                }
            }
            if(z0.H(H.A)) {
                l l1 = z0.g();
                try {
                    r r0 = l1.k0(m0, true, null);
                    return r0 instanceof com.fasterxml.jackson.databind.ser.impl.r ? new b(m0, null, ((com.fasterxml.jackson.databind.ser.impl.r)r0).s()) : new b(m0, r0, null);
                }
                catch(com.fasterxml.jackson.databind.f unused_ex) {
                }
            }
            return new b(m0, null, this.c);
        }

        public final j b() {
            return this.c;
        }

        public final r c() {
            return this.b;
        }

        public boolean d() {
            return this.b != null || this.c != null;
        }

        public void e(k k0, Object object0, l l0) throws IOException {
            j j0 = this.c;
            if(j0 != null) {
                l0.f1(k0, object0, this.a, this.b, j0);
                return;
            }
            r r0 = this.b;
            if(r0 != null) {
                l0.i1(k0, object0, this.a, r0);
                return;
            }
            m m0 = this.a;
            if(m0 != null) {
                l0.h1(k0, object0, m0);
                return;
            }
            l0.g1(k0, object0);
        }
    }

    protected final G a;
    protected final l b;
    protected final s c;
    protected final h d;
    protected final a e;
    protected final b f;
    private static final long g = 1L;
    protected static final v h;

    static {
        z.h = new com.fasterxml.jackson.core.util.r();
    }

    protected z(x x0, G g0) {
        this.a = g0;
        this.b = x0.i;
        this.c = x0.j;
        this.d = x0.a;
        this.e = a.f;
        this.f = b.e;
    }

    protected z(x x0, G g0, e e0) {
        this.a = g0;
        this.b = x0.i;
        this.c = x0.j;
        this.d = x0.a;
        this.e = e0 == null ? a.f : new a(null, e0, null, null);
        this.f = b.e;
    }

    protected z(x x0, G g0, m m0, v v0) {
        this.a = g0;
        this.b = x0.i;
        this.c = x0.j;
        this.d = x0.a;
        this.e = v0 == null ? a.f : new a(v0, null, null, null);
        if(m0 == null) {
            this.f = b.e;
            return;
        }
        if(m0.j(Object.class)) {
            this.f = b.e.a(this, m0);
            return;
        }
        m m1 = m0.j0();
        this.f = b.e.a(this, m1);
    }

    protected z(z z0, h h0) {
        this.a = (G)z0.a.u0(t.w, false);
        this.b = z0.b;
        this.c = z0.c;
        this.d = h0;
        this.e = z0.e;
        this.f = z0.f;
    }

    protected z(z z0, G g0) {
        this.a = g0;
        this.b = z0.b;
        this.c = z0.c;
        this.d = z0.d;
        this.e = z0.e;
        this.f = z0.f;
    }

    protected z(z z0, G g0, a z$a0, b z$b0) {
        this.a = g0;
        this.b = z0.b;
        this.c = z0.c;
        this.d = z0.d;
        this.e = z$a0;
        this.f = z$b0;
    }

    public h A() {
        return this.d;
    }

    public z A0(H[] arr_h) {
        return this.e(this, this.a.H1(arr_h));
    }

    public com.fasterxml.jackson.databind.type.q B() {
        return this.a.S();
    }

    public z B0(com.fasterxml.jackson.databind.cfg.l[] arr_l) {
        return this.e(this, ((G)this.a.V0(arr_l)));
    }

    public boolean C() {
        return this.f.d();
    }

    public z C0() {
        return this.e(this, this.a.z1(B.h));
    }

    public boolean D(com.fasterxml.jackson.core.k.b k$b0) {
        return this.d.N(k$b0);
    }

    public void D0(k k0, Object object0) throws IOException {
        this.a("g", k0);
        this.b(k0);
        if(this.a.l1(H.j) && object0 instanceof Closeable) {
            try {
                l l0 = this.g();
                this.f.e(k0, object0, l0);
                if(this.a.l1(H.k)) {
                    k0.flush();
                }
            }
            catch(Exception exception0) {
                com.fasterxml.jackson.databind.util.h.l(null, ((Closeable)object0), exception0);
                return;
            }
            ((Closeable)object0).close();
            return;
        }
        l l1 = this.g();
        this.f.e(k0, object0, l1);
        if(this.a.l1(H.k)) {
            k0.flush();
        }
    }

    @Deprecated
    public boolean E(com.fasterxml.jackson.core.n.a n$a0) {
        return this.d.O(n$a0);
    }

    public void E0(DataOutput dataOutput0, Object object0) throws IOException, com.fasterxml.jackson.core.exc.d, com.fasterxml.jackson.databind.f {
        this.j(this.o(dataOutput0), object0);
    }

    public boolean F(C c0) {
        return this.d.Q(c0);
    }

    public void F0(File file0, Object object0) throws IOException, com.fasterxml.jackson.core.exc.d, com.fasterxml.jackson.databind.f {
        this.j(this.p(file0, g.d), object0);
    }

    public boolean G(t t0) {
        return this.a.a0(t0);
    }

    public void G0(OutputStream outputStream0, Object object0) throws IOException, com.fasterxml.jackson.core.exc.d, com.fasterxml.jackson.databind.f {
        this.j(this.r(outputStream0, g.d), object0);
    }

    public boolean H(H h0) {
        return this.a.l1(h0);
    }

    public void H0(Writer writer0, Object object0) throws IOException, com.fasterxml.jackson.core.exc.d, com.fasterxml.jackson.databind.f {
        this.j(this.s(writer0), object0);
    }

    public boolean I(com.fasterxml.jackson.databind.cfg.l l0) {
        return this.a.b0(l0);
    }

    public byte[] I0(Object object0) throws p {
        try {
            c c0 = new c(this.d.r0());
            this.j(this.r(c0, g.d), object0);
            c0.release();
            return new byte[0];
        }
        catch(p p0) {
            throw p0;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    public z J(com.fasterxml.jackson.core.a a0) {
        return this.e(this, ((G)this.a.s0(a0)));
    }

    public String J0(Object object0) throws p {
        com.fasterxml.jackson.core.io.p p0 = new com.fasterxml.jackson.core.io.p(this.d.r0());
        try {
            this.j(this.s(p0), object0);
            return p0.a();
        }
        catch(p p1) {
            throw p1;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    public z K(com.fasterxml.jackson.core.d d0) {
        return this.e(this, this.a.m1(d0));
    }

    public F K0(k k0) throws IOException {
        this.a("g", k0);
        return this.f(false, this.b(k0), false);
    }

    public z L(e e0) {
        this.h(e0);
        return this.c(this.e.c(e0), this.f);
    }

    public F L0(DataOutput dataOutput0) throws IOException {
        return this.f(false, this.o(dataOutput0), true);
    }

    public z M(h h0) {
        return h0 == this.d ? this : this.d(this, h0);
    }

    public F M0(File file0) throws IOException {
        return this.f(false, this.p(file0, g.d), true);
    }

    public z N(com.fasterxml.jackson.core.k.b k$b0) {
        return this.e(this, this.a.n1(k$b0));
    }

    public F N0(OutputStream outputStream0) throws IOException {
        return this.f(false, this.r(outputStream0, g.d), true);
    }

    public z O(v v0) {
        return this.c(this.e.d(v0), this.f);
    }

    public F O0(Writer writer0) throws IOException {
        return this.f(false, this.s(writer0), true);
    }

    public z P(C c0) {
        return this.e(this, this.a.n1(c0.f()));
    }

    public F P0(k k0) throws IOException {
        this.a("gen", k0);
        return this.f(true, k0, false);
    }

    public z Q(d d0) {
        return this.c(this.e.e(d0), this.f);
    }

    public F Q0(DataOutput dataOutput0) throws IOException {
        return this.f(true, this.o(dataOutput0), true);
    }

    public z R(H h0) {
        return this.e(this, this.a.o1(h0));
    }

    public F R0(File file0) throws IOException {
        return this.f(true, this.p(file0, g.d), true);
    }

    public z S(H h0, H[] arr_h) {
        return this.e(this, this.a.p1(h0, arr_h));
    }

    public F S0(OutputStream outputStream0) throws IOException {
        return this.f(true, this.r(outputStream0, g.d), true);
    }

    public z T(com.fasterxml.jackson.databind.cfg.k k0) {
        return this.e(this, this.a.q1(k0));
    }

    public F T0(Writer writer0) throws IOException {
        return this.f(true, this.s(writer0), true);
    }

    public z U(com.fasterxml.jackson.databind.cfg.l l0) {
        return this.e(this, ((G)this.a.y0(l0)));
    }

    public z V(com.fasterxml.jackson.databind.ser.m m0) {
        return m0 == this.a.e1() ? this : this.e(this, this.a.x1(m0));
    }

    public z W(DateFormat dateFormat0) {
        return this.e(this, this.a.s1(dateFormat0));
    }

    public z X(Locale locale0) {
        return this.e(this, ((G)this.a.H0(locale0)));
    }

    public z Y(TimeZone timeZone0) {
        return this.e(this, ((G)this.a.I0(timeZone0)));
    }

    public z Z(Object object0, Object object1) {
        return this.e(this, ((G)this.a.L0(object0, object1)));
    }

    protected final void a(String s, Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", s));
        }
    }

    public z a0(Map map0) {
        return this.e(this, ((G)this.a.M0(map0)));
    }

    protected final k b(k k0) {
        this.a.i1(k0);
        this.e.b(k0);
        return k0;
    }

    public z b0() {
        return this.O(this.a.d1());
    }

    protected z c(a z$a0, b z$b0) {
        return this.e != z$a0 || this.f != z$b0 ? new z(this, this.a, z$a0, z$b0) : this;
    }

    public z c0(com.fasterxml.jackson.core.d[] arr_d) {
        return this.e(this, this.a.u1(arr_d));
    }

    protected z d(z z0, h h0) {
        return new z(z0, h0);
    }

    protected z e(z z0, G g0) {
        return g0 == this.a ? this : new z(z0, g0);
    }

    public z e0(com.fasterxml.jackson.core.k.b[] arr_k$b) {
        return this.e(this, this.a.v1(arr_k$b));
    }

    protected F f(boolean z, k k0, boolean z1) throws IOException {
        return new F(this.g(), this.b(k0), z1, this.f).f(z);
    }

    public z f0(H[] arr_h) {
        return this.e(this, this.a.w1(arr_h));
    }

    protected l g() {
        return this.b.a1(this.a, this.c);
    }

    public z g0(com.fasterxml.jackson.databind.cfg.l[] arr_l) {
        return this.e(this, ((G)this.a.N0(arr_l)));
    }

    protected void h(e e0) {
        if(e0 != null && !this.d.j(e0)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + e0.getClass().getName() + " for format " + "JSON");
        }
    }

    public z h0(B b0) {
        return this.e(this, this.a.z1(b0));
    }

    private final void i(k k0, Object object0) throws IOException {
        Closeable closeable0 = (Closeable)object0;
        try {
            l l0 = this.g();
            this.f.e(k0, object0, l0);
        }
        catch(Exception exception0) {
            com.fasterxml.jackson.databind.util.h.l(k0, closeable0, exception0);
            return;
        }
        try {
            closeable0.close();
        }
        catch(Exception exception0) {
            closeable0 = null;
            com.fasterxml.jackson.databind.util.h.l(k0, closeable0, exception0);
            return;
        }
        k0.close();
    }

    public z i0(String s) {
        return this.e(this, ((G)this.a.Q0(s)));
    }

    protected final void j(k k0, Object object0) throws IOException {
        if(this.a.l1(H.j) && object0 instanceof Closeable) {
            this.i(k0, object0);
            return;
        }
        try {
            l l0 = this.g();
            this.f.e(k0, object0, l0);
        }
        catch(Exception exception0) {
            com.fasterxml.jackson.databind.util.h.m(k0, exception0);
            return;
        }
        k0.close();
    }

    public z j0(w w0) {
        return this.c(this.e.f(w0), this.f);
    }

    public void k(m m0, com.fasterxml.jackson.databind.jsonFormatVisitors.g g0) throws o {
        this.a("type", m0);
        this.a("visitor", g0);
        this.g().X0(m0, g0);
    }

    public z k0(String s) {
        return this.c(this.e.g(s), this.f);
    }

    public void l(Class class0, com.fasterxml.jackson.databind.jsonFormatVisitors.g g0) throws o {
        this.a("type", class0);
        this.a("visitor", g0);
        this.k(this.a.h(class0), g0);
    }

    public boolean m(Class class0) {
        this.a("type", class0);
        return this.g().e1(class0, null);
    }

    @Deprecated
    public z m0(e e0) {
        return this.L(e0);
    }

    public boolean n(Class class0, AtomicReference atomicReference0) {
        this.a("type", class0);
        return this.g().e1(class0, atomicReference0);
    }

    @Deprecated
    public z n0(com.fasterxml.jackson.core.type.b b0) {
        return this.u(b0);
    }

    public k o(DataOutput dataOutput0) throws IOException {
        this.a("out", dataOutput0);
        return this.b(this.d.k(dataOutput0));
    }

    @Deprecated
    public z o0(m m0) {
        return this.w(m0);
    }

    public k p(File file0, g g0) throws IOException {
        this.a("outputFile", file0);
        return this.b(this.d.m(file0, g0));
    }

    @Deprecated
    public z p0(Class class0) {
        return this.x(class0);
    }

    public k q(OutputStream outputStream0) throws IOException {
        this.a("out", outputStream0);
        return this.b(this.d.o(outputStream0, g.d));
    }

    public z q0(Class class0) {
        return this.e(this, this.a.A1(class0));
    }

    public k r(OutputStream outputStream0, g g0) throws IOException {
        this.a("out", outputStream0);
        return this.b(this.d.o(outputStream0, g0));
    }

    public z r0(com.fasterxml.jackson.core.d d0) {
        return this.e(this, this.a.B1(d0));
    }

    public k s(Writer writer0) throws IOException {
        this.a("w", writer0);
        return this.b(this.d.p(writer0));
    }

    public z s0(com.fasterxml.jackson.core.k.b k$b0) {
        return this.e(this, this.a.C1(k$b0));
    }

    public z t0(C c0) {
        return this.e(this, this.a.C1(c0.f()));
    }

    public z u(com.fasterxml.jackson.core.type.b b0) {
        return this.w(this.a.S().f0(b0.b()));
    }

    public z u0(H h0) {
        return this.e(this, this.a.D1(h0));
    }

    public z v0(H h0, H[] arr_h) {
        return this.e(this, this.a.E1(h0, arr_h));
    }

    @Override  // com.fasterxml.jackson.core.I
    public com.fasterxml.jackson.core.H version() {
        return com.fasterxml.jackson.databind.cfg.x.a;
    }

    public z w(m m0) {
        b z$b0 = this.f.a(this, m0);
        return this.c(this.e, z$b0);
    }

    public z w0(com.fasterxml.jackson.databind.cfg.l l0) {
        return this.e(this, ((G)this.a.S0(l0)));
    }

    public z x(Class class0) {
        return this.w(this.a.h(class0));
    }

    public z x0(Object object0) {
        return this.e(this, ((G)this.a.U0(object0)));
    }

    public com.fasterxml.jackson.databind.cfg.k y() {
        return this.a.o();
    }

    public z y0(com.fasterxml.jackson.core.d[] arr_d) {
        return this.e(this, this.a.F1(arr_d));
    }

    public G z() {
        return this.a;
    }

    public z z0(com.fasterxml.jackson.core.k.b[] arr_k$b) {
        return this.e(this, this.a.G1(arr_k$b));
    }
}

