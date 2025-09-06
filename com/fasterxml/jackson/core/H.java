package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.io.e;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.io.o;
import com.fasterxml.jackson.core.io.q;
import com.fasterxml.jackson.core.io.s;
import com.fasterxml.jackson.core.json.j;
import com.fasterxml.jackson.core.sym.b;
import com.fasterxml.jackson.core.util.u;
import j..util.Objects;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class h extends E implements I, Serializable {
    public static enum a implements com.fasterxml.jackson.core.util.h {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true),
        CHARSET_DETECTION(true);

        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        @Override  // com.fasterxml.jackson.core.util.h
        public int a() {
            return 1 << this.ordinal();
        }

        @Override  // com.fasterxml.jackson.core.util.h
        public boolean b(int v) {
            return (v & this.a()) != 0;
        }

        @Override  // com.fasterxml.jackson.core.util.h
        public boolean c() {
            return this.a;
        }

        public static int e() {
            a[] arr_h$a = a.values();
            int v1 = 0;
            for(int v = 0; v < arr_h$a.length; ++v) {
                a h$a0 = arr_h$a[v];
                if(h$a0.c()) {
                    v1 |= h$a0.a();
                }
            }
            return v1;
        }
    }

    protected final transient b b;
    protected final transient com.fasterxml.jackson.core.sym.a c;
    protected int d;
    protected int e;
    protected int f;
    protected u g;
    protected com.fasterxml.jackson.core.u h;
    protected d i;
    protected y j;
    protected c k;
    protected B l;
    protected com.fasterxml.jackson.core.io.h m;
    protected o n;
    protected final List o;
    protected w p;
    protected int q;
    protected final char r;
    private static final long s = 2L;
    public static final String t = "JSON";
    protected static final int u = 0;
    protected static final int v = 0;
    protected static final int w = 0;
    public static final w x = null;
    public static final char y = '\"';

    static {
        h.u = a.e();
        h.v = com.fasterxml.jackson.core.n.a.a();
        h.w = com.fasterxml.jackson.core.k.b.a();
        h.x = new q(" ");
    }

    public h() {
        this(null);
    }

    protected h(D d0, boolean z) {
        this.c = com.fasterxml.jackson.core.sym.a.y();
        this.p = h.x;
        this.g = d0.d;
        this.h = null;
        this.d = d0.a;
        this.e = d0.b;
        this.f = d0.c;
        this.m = d0.e;
        this.n = d0.f;
        this.o = h.V(d0.j);
        y y0 = d0.g;
        Objects.requireNonNull(y0);
        this.j = y0;
        B b0 = d0.h;
        Objects.requireNonNull(b0);
        this.l = b0;
        c c0 = d0.i;
        Objects.requireNonNull(c0);
        this.k = c0;
        this.i = null;
        this.p = null;
        this.q = 0;
        this.r = '\"';
        this.b = b.n(this);
    }

    protected h(h h0, com.fasterxml.jackson.core.u u0) {
        this.c = com.fasterxml.jackson.core.sym.a.y();
        this.p = h.x;
        this.g = h0.g;
        this.h = u0;
        this.d = h0.d;
        this.e = h0.e;
        this.f = h0.f;
        this.m = h0.m;
        this.n = h0.n;
        this.o = h.V(h0.o);
        y y0 = h0.j;
        Objects.requireNonNull(y0);
        this.j = y0;
        B b0 = h0.l;
        Objects.requireNonNull(b0);
        this.l = b0;
        c c0 = h0.k;
        Objects.requireNonNull(c0);
        this.k = c0;
        this.i = h0.i;
        this.p = h0.p;
        this.q = h0.q;
        this.r = h0.r;
        this.b = b.n(this);
    }

    public h(i i0) {
        this.c = com.fasterxml.jackson.core.sym.a.y();
        this.p = h.x;
        this.g = i0.d;
        this.h = null;
        this.d = i0.a;
        this.e = i0.b;
        this.f = i0.c;
        this.m = i0.e;
        this.n = i0.f;
        this.o = h.V(i0.j);
        y y0 = i0.g;
        Objects.requireNonNull(y0);
        this.j = y0;
        B b0 = i0.h;
        Objects.requireNonNull(b0);
        this.l = b0;
        c c0 = i0.i;
        Objects.requireNonNull(c0);
        this.k = c0;
        this.i = i0.n;
        this.p = i0.o;
        this.q = i0.p;
        this.r = i0.q;
        this.b = b.n(this);
    }

    public h(com.fasterxml.jackson.core.u u0) {
        this.c = com.fasterxml.jackson.core.sym.a.y();
        this.d = h.u;
        this.e = h.v;
        this.f = h.w;
        this.p = h.x;
        this.g = com.fasterxml.jackson.core.util.o.a();
        this.h = u0;
        this.r = '\"';
        this.j = y.d();
        this.l = B.d();
        this.k = c.b();
        this.o = null;
        this.b = b.n(this);
    }

    @Override  // com.fasterxml.jackson.core.E
    public n A(byte[] arr_b) throws IOException, m {
        g g0 = this.Y(this.W(arr_b), true);
        com.fasterxml.jackson.core.io.h h0 = this.m;
        if(h0 != null) {
            InputStream inputStream0 = h0.c(g0, arr_b, 0, arr_b.length);
            return inputStream0 == null ? this.g0(arr_b, 0, arr_b.length, g0) : this.e0(inputStream0, g0);
        }
        return this.g0(arr_b, 0, arr_b.length, g0);
    }

    public h A0() {
        this.U(h.class);
        return new h(this, null);
    }

    @Override  // com.fasterxml.jackson.core.E
    public n B(byte[] arr_b, int v, int v1) throws IOException, m {
        this.a(arr_b, v, v1);
        g g0 = this.Y(this.X(arr_b, v, v1), true);
        com.fasterxml.jackson.core.io.h h0 = this.m;
        if(h0 != null) {
            InputStream inputStream0 = h0.c(g0, arr_b, v, v1);
            return inputStream0 == null ? this.g0(arr_b, v, v1, g0) : this.e0(inputStream0, g0);
        }
        return this.g0(arr_b, v, v1, g0);
    }

    @Deprecated
    public k B0(OutputStream outputStream0) throws IOException {
        return this.o(outputStream0, com.fasterxml.jackson.core.g.d);
    }

    @Override  // com.fasterxml.jackson.core.E
    public n C(char[] arr_c) throws IOException {
        return this.D(arr_c, 0, arr_c.length);
    }

    @Deprecated
    public k C0(OutputStream outputStream0, com.fasterxml.jackson.core.g g0) throws IOException {
        return this.o(outputStream0, g0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public n D(char[] arr_c, int v, int v1) throws IOException {
        this.b(arr_c, v, v1);
        return this.m == null ? this.h0(arr_c, v, v1, this.Y(this.X(arr_c, v, v1), true), false) : this.x(new CharArrayReader(arr_c, v, v1));
    }

    @Deprecated
    public k D0(Writer writer0) throws IOException {
        return this.p(writer0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public final int E() {
        return this.d;
    }

    @Deprecated
    public n E0(File file0) throws IOException, m {
        return this.u(file0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public int F() {
        return 0;
    }

    @Deprecated
    public n F0(InputStream inputStream0) throws IOException, m {
        return this.w(inputStream0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public String G() [...] // 潜在的解密器

    @Deprecated
    public n G0(Reader reader0) throws IOException, m {
        return this.x(reader0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public int H() {
        return 0;
    }

    @Deprecated
    public n H0(String s) throws IOException, m {
        return this.y(s);
    }

    @Override  // com.fasterxml.jackson.core.E
    public Class I() {
        return null;
    }

    @Deprecated
    public n I0(URL uRL0) throws IOException, m {
        return this.z(uRL0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public Class J() {
        return null;
    }

    @Deprecated
    public n J0(byte[] arr_b) throws IOException, m {
        return this.A(arr_b);
    }

    @Override  // com.fasterxml.jackson.core.E
    public final int K() {
        return this.f;
    }

    @Deprecated
    public n K0(byte[] arr_b, int v, int v1) throws IOException, m {
        return this.B(arr_b, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.E
    public final int L() {
        return this.e;
    }

    @Deprecated
    public h L0(a h$a0) {
        this.d &= ~h$a0.a();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public final boolean M(a h$a0) {
        return (h$a0.a() & this.d) != 0;
    }

    public h M0(com.fasterxml.jackson.core.k.b k$b0) {
        this.f &= ~k$b0.d();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public final boolean N(com.fasterxml.jackson.core.k.b k$b0) {
        return (k$b0.d() & this.f) != 0;
    }

    public h N0(com.fasterxml.jackson.core.n.a n$a0) {
        this.e &= ~n$a0.d();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public final boolean O(com.fasterxml.jackson.core.n.a n$a0) {
        return (n$a0.d() & this.e) != 0;
    }

    @Deprecated
    public h O0(a h$a0) {
        this.d |= h$a0.a();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public final boolean P(z z0) {
        return (z0.f().d() & this.e) != 0;
    }

    public h P0(com.fasterxml.jackson.core.k.b k$b0) {
        this.f |= k$b0.d();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public final boolean Q(C c0) {
        return (c0.f().d() & this.f) != 0;
    }

    public h Q0(com.fasterxml.jackson.core.n.a n$a0) {
        this.e |= n$a0.d();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public boolean R() [...] // Inlined contents

    public d R0() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.core.E
    public y S() {
        return this.j;
    }

    public com.fasterxml.jackson.core.u S0() {
        return this.h;
    }

    @Override  // com.fasterxml.jackson.core.E
    public B T() {
        return this.l;
    }

    public com.fasterxml.jackson.core.io.h T0() {
        return this.m;
    }

    protected void U(Class class0) {
        if(this.getClass() != class0) {
            throw new IllegalStateException("Failed copy(): " + this.getClass().getName() + " (version: " + this.version() + ") does not override copy(); it has to");
        }
    }

    public o U0() {
        return this.n;
    }

    protected static List V(List list0) {
        return list0 == null ? null : new ArrayList(list0);
    }

    public String V0() {
        return this.p == null ? null : this.p.getValue();
    }

    protected e W(Object object0) {
        return e.l(((boolean)1), object0, this.k);
    }

    public com.fasterxml.jackson.core.format.d W0(com.fasterxml.jackson.core.format.c c0) throws IOException {
        return this.getClass() == h.class ? this.X0(c0) : null;
    }

    protected e X(Object object0, int v, int v1) {
        return e.k(((boolean)1), object0, v, v1, this.k);
    }

    protected com.fasterxml.jackson.core.format.d X0(com.fasterxml.jackson.core.format.c c0) throws IOException {
        return com.fasterxml.jackson.core.json.a.h(c0);
    }

    protected g Y(e e0, boolean z) {
        if(e0 == null) {
            e0 = e.y();
        }
        return new g(this.j, this.l, this.k, this.r0(), e0, z);
    }

    protected Object Y0() {
        return new h(this, this.h);
    }

    @Deprecated
    protected g Z(Object object0, boolean z) {
        return new g(this.j, this.l, this.k, this.r0(), this.W(object0), z);
    }

    public D Z0() {
        this.u0("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new i(this);
    }

    protected k a0(Writer writer0, g g0) throws IOException {
        com.fasterxml.jackson.core.json.m m0 = new com.fasterxml.jackson.core.json.m(g0, this.f, this.h, writer0, this.r);
        int v = this.q;
        if(v > 0) {
            m0.N1(v);
        }
        d d0 = this.i;
        if(d0 != null) {
            m0.l1(d0);
        }
        w w0 = this.p;
        if(w0 != h.x) {
            m0.d2(w0);
        }
        return this.k0(m0);
    }

    public boolean a1() {
        return false;
    }

    protected g b0(Object object0) {
        return new g(this.j, this.l, this.k, this.r0(), this.W(object0), false);
    }

    protected n c0(DataInput dataInput0, g g0) throws IOException {
        this.u0("InputData source not (yet?) supported for this format (%s)");
        int v = com.fasterxml.jackson.core.json.a.l(dataInput0);
        com.fasterxml.jackson.core.sym.a a0 = this.c.H(this.d);
        return new j(g0, this.e, dataInput0, this.h, a0, v);
    }

    public h c1(d d0) {
        this.i = d0;
        return this;
    }

    public h d1(com.fasterxml.jackson.core.u u0) {
        this.h = u0;
        return this;
    }

    protected n e0(InputStream inputStream0, g g0) throws IOException {
        try {
            return new com.fasterxml.jackson.core.json.a(g0, inputStream0).c(this.e, this.h, this.c, this.b, this.d);
        }
        catch(IOException | RuntimeException iOException0) {
            if(g0.R()) {
                try {
                    inputStream0.close();
                }
                catch(Exception exception0) {
                    iOException0.addSuppressed(exception0);
                }
            }
            g0.close();
            throw iOException0;
        }
    }

    public h e1(c c0) {
        Objects.requireNonNull(c0, "Cannot pass null ErrorReportConfiguration");
        this.k = c0;
        return this;
    }

    protected n f0(Reader reader0, g g0) throws IOException {
        return new com.fasterxml.jackson.core.json.i(g0, this.e, reader0, this.h, this.b.r());
    }

    @Deprecated
    public h f1(com.fasterxml.jackson.core.io.h h0) {
        this.m = h0;
        return this;
    }

    protected n g0(byte[] arr_b, int v, int v1, g g0) throws IOException {
        return new com.fasterxml.jackson.core.json.a(g0, arr_b, v, v1).c(this.e, this.h, this.c, this.b, this.d);
    }

    @Deprecated
    public h g1(o o0) {
        this.n = o0;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public boolean h() [...] // Inlined contents

    protected n h0(char[] arr_c, int v, int v1, g g0, boolean z) throws IOException {
        return new com.fasterxml.jackson.core.json.i(g0, this.e, null, this.h, this.b.r(), arr_c, v, v + v1, z);
    }

    public h h1(u u0) {
        Objects.requireNonNull(u0);
        this.g = u0;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public boolean i() {
        return this.t0();
    }

    protected k i0(OutputStream outputStream0, g g0) throws IOException {
        com.fasterxml.jackson.core.json.k k0 = new com.fasterxml.jackson.core.json.k(g0, this.f, this.h, outputStream0, this.r);
        int v = this.q;
        if(v > 0) {
            k0.N1(v);
        }
        d d0 = this.i;
        if(d0 != null) {
            k0.l1(d0);
        }
        w w0 = this.p;
        if(w0 != h.x) {
            k0.d2(w0);
        }
        return this.k0(k0);
    }

    public h i1(String s) {
        this.p = s == null ? null : new q(s);
        return this;
    }

    // 去混淆评级： 中等(80)
    @Override  // com.fasterxml.jackson.core.E
    public boolean j(com.fasterxml.jackson.core.e e0) {
        return e0 == null ? false : "JSON".equals(e0.a());
    }

    protected Writer j0(OutputStream outputStream0, com.fasterxml.jackson.core.g g0, g g1) throws IOException {
        return g0 == com.fasterxml.jackson.core.g.d ? new s(g1, outputStream0) : new OutputStreamWriter(outputStream0, g0.b());
    }

    public h j1(y y0) {
        Objects.requireNonNull(y0);
        this.j = y0;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public k k(DataOutput dataOutput0) throws IOException {
        return this.o(this.c(dataOutput0), com.fasterxml.jackson.core.g.d);
    }

    protected k k0(k k0) {
        List list0 = this.o;
        if(list0 != null) {
            for(Object object0: list0) {
                k0 = ((com.fasterxml.jackson.core.util.j)object0).a(this, k0);
            }
        }
        return k0;
    }

    public h k1(B b0) {
        Objects.requireNonNull(b0);
        this.l = b0;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.E
    public k l(DataOutput dataOutput0, com.fasterxml.jackson.core.g g0) throws IOException {
        return this.o(this.c(dataOutput0), g0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public k m(File file0, com.fasterxml.jackson.core.g g0) throws IOException {
        OutputStream outputStream0 = this.e(file0);
        g g1 = this.Y(this.W(outputStream0), true);
        g1.l0(g0);
        return g0 == com.fasterxml.jackson.core.g.d ? this.i0(this.o0(outputStream0, g1), g1) : this.a0(this.q0(this.j0(outputStream0, g0, g1), g1), g1);
    }

    protected final DataInput m0(DataInput dataInput0, g g0) throws IOException {
        com.fasterxml.jackson.core.io.h h0 = this.m;
        if(h0 != null) {
            DataInput dataInput1 = h0.a(g0, dataInput0);
            return dataInput1 == null ? dataInput0 : dataInput1;
        }
        return dataInput0;
    }

    @Override  // com.fasterxml.jackson.core.E
    public k n(OutputStream outputStream0) throws IOException {
        return this.o(outputStream0, com.fasterxml.jackson.core.g.d);
    }

    protected final InputStream n0(InputStream inputStream0, g g0) throws IOException {
        com.fasterxml.jackson.core.io.h h0 = this.m;
        if(h0 != null) {
            InputStream inputStream1 = h0.b(g0, inputStream0);
            return inputStream1 == null ? inputStream0 : inputStream1;
        }
        return inputStream0;
    }

    @Override  // com.fasterxml.jackson.core.E
    public k o(OutputStream outputStream0, com.fasterxml.jackson.core.g g0) throws IOException {
        g g1 = this.Y(this.W(outputStream0), false);
        g1.l0(g0);
        return g0 == com.fasterxml.jackson.core.g.d ? this.i0(this.o0(outputStream0, g1), g1) : this.a0(this.q0(this.j0(outputStream0, g0, g1), g1), g1);
    }

    protected final OutputStream o0(OutputStream outputStream0, g g0) throws IOException {
        o o0 = this.n;
        if(o0 != null) {
            OutputStream outputStream1 = o0.a(g0, outputStream0);
            return outputStream1 == null ? outputStream0 : outputStream1;
        }
        return outputStream0;
    }

    @Override  // com.fasterxml.jackson.core.E
    public k p(Writer writer0) throws IOException {
        g g0 = this.Y(this.W(writer0), false);
        return this.a0(this.q0(writer0, g0), g0);
    }

    protected final Reader p0(Reader reader0, g g0) throws IOException {
        com.fasterxml.jackson.core.io.h h0 = this.m;
        if(h0 != null) {
            Reader reader1 = h0.d(g0, reader0);
            return reader1 == null ? reader0 : reader1;
        }
        return reader0;
    }

    @Override  // com.fasterxml.jackson.core.E
    public n q() throws IOException {
        this.u0("Non-blocking source not (yet?) supported for this format (%s)");
        g g0 = this.b0(null);
        com.fasterxml.jackson.core.sym.a a0 = this.c.H(this.d);
        return new com.fasterxml.jackson.core.json.async.b(g0, this.e, a0);
    }

    protected final Writer q0(Writer writer0, g g0) throws IOException {
        o o0 = this.n;
        if(o0 != null) {
            Writer writer1 = o0.b(g0, writer0);
            return writer1 == null ? writer0 : writer1;
        }
        return writer0;
    }

    @Override  // com.fasterxml.jackson.core.E
    public n r() throws IOException {
        this.u0("Non-blocking source not (yet?) supported for this format (%s)");
        g g0 = this.b0(null);
        com.fasterxml.jackson.core.sym.a a0 = this.c.H(this.d);
        return new com.fasterxml.jackson.core.json.async.a(g0, this.e, a0);
    }

    public com.fasterxml.jackson.core.util.a r0() {
        return (com.fasterxml.jackson.core.util.a)this.s0().b1();
    }

    @Override  // com.fasterxml.jackson.core.E
    public n s(DataInput dataInput0) throws IOException {
        g g0 = this.Y(this.W(dataInput0), false);
        return this.c0(this.m0(dataInput0, g0), g0);
    }

    public u s0() {
        return a.e.b(this.d) ? this.g : com.fasterxml.jackson.core.util.o.e();
    }

    // 去混淆评级： 低(20)
    private final boolean t0() {
        return true;
    }

    @Override  // com.fasterxml.jackson.core.E
    public n u(File file0) throws IOException, m {
        g g0 = this.Y(this.W(file0), true);
        return this.e0(this.n0(this.d(file0), g0), g0);
    }

    private final void u0(String s) {
        if(!this.t0()) {
            throw new UnsupportedOperationException(String.format(s, "JSON"));
        }
    }

    public static D v0() {
        return new i();
    }

    @Override  // com.fasterxml.jackson.core.I
    public H version() {
        return com.fasterxml.jackson.core.json.h.a;
    }

    @Override  // com.fasterxml.jackson.core.E
    public n w(InputStream inputStream0) throws IOException, m {
        g g0 = this.Y(this.W(inputStream0), false);
        return this.e0(this.n0(inputStream0, g0), g0);
    }

    public boolean w0() [...] // Inlined contents

    @Override  // com.fasterxml.jackson.core.E
    public n x(Reader reader0) throws IOException, m {
        g g0 = this.Y(this.W(reader0), false);
        return this.f0(this.p0(reader0, g0), g0);
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public final h x0(a h$a0, boolean z) {
        return z ? this.O0(h$a0) : this.L0(h$a0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public n y(String s) throws IOException, m {
        int v = s.length();
        if(this.m == null && v <= 0x8000) {
            g g0 = this.Y(this.W(s), true);
            return this.h0(g0.p(v), 0, v, g0, true);
        }
        return this.x(new StringReader(s));
    }

    // 去混淆评级： 低(20)
    public final h y0(com.fasterxml.jackson.core.k.b k$b0, boolean z) {
        return z ? this.P0(k$b0) : this.M0(k$b0);
    }

    @Override  // com.fasterxml.jackson.core.E
    public n z(URL uRL0) throws IOException, m {
        g g0 = this.Y(this.W(uRL0), true);
        return this.e0(this.n0(this.f(uRL0), g0), g0);
    }

    // 去混淆评级： 低(20)
    public final h z0(com.fasterxml.jackson.core.n.a n$a0, boolean z) {
        return z ? this.Q0(n$a0) : this.N0(n$a0);
    }
}

