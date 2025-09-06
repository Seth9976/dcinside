package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.async.c;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.core.util.v;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

public abstract class n implements I, Closeable {
    public static enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        @Deprecated
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        @Deprecated
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        @Deprecated
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        @Deprecated
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        @Deprecated
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        @Deprecated
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        @Deprecated
        ALLOW_NON_NUMERIC_NUMBERS(false),
        @Deprecated
        ALLOW_MISSING_VALUES(false),
        @Deprecated
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(false),
        USE_FAST_DOUBLE_PARSER(false),
        USE_FAST_BIG_NUMBER_PARSER(false);

        private final boolean a;
        private final int b;

        private a(boolean z) {
            this.b = 1 << this.ordinal();
            this.a = z;
        }

        public static int a() {
            a[] arr_n$a = a.values();
            int v1 = 0;
            for(int v = 0; v < arr_n$a.length; ++v) {
                a n$a0 = arr_n$a[v];
                if(n$a0.b()) {
                    v1 |= n$a0.d();
                }
            }
            return v1;
        }

        public boolean b() {
            return this.a;
        }

        public boolean c(int v) {
            return (v & this.b) != 0;
        }

        public int d() {
            return this.b;
        }
    }

    public static enum b {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL;

    }

    protected int a;
    protected transient v b;
    private static final int c = 0xFFFFFF80;
    private static final int d = 0xFF;
    private static final int e = 0xFFFF8000;
    private static final int f = 0x7FFF;
    protected static final i g;

    static {
        n.g = i.c(x.values());
    }

    protected n() {
        this.a = h.v;
    }

    protected n(int v) {
        this.a = v;
    }

    public abstract q A2();

    public boolean A4() {
        return false;
    }

    public int B3(int v) throws IOException {
        return v;
    }

    public abstract void B4(u arg1);

    public i C2() {
        return n.g;
    }

    public long C3() throws IOException {
        return this.E3(0L);
    }

    public void C4(Object object0) {
        q q0 = this.A2();
        if(q0 != null) {
            q0.q(object0);
        }
    }

    @Deprecated
    public n D4(int v) {
        this.a = v;
        return this;
    }

    public byte[] E0() throws IOException {
        return this.L0(com.fasterxml.jackson.core.b.a());
    }

    public long E3(long v) throws IOException {
        return v;
    }

    public void E4(v v0) {
        this.b = v0;
    }

    public String F3() throws IOException {
        return this.N3(null);
    }

    public void F4(String s) {
        this.b = s == null ? null : new v(s);
    }

    public void G4(byte[] arr_b, String s) {
        this.b = arr_b == null ? null : new v(arr_b, s);
    }

    public void H4(e e0) {
        throw new UnsupportedOperationException("Parser of type " + this.getClass().getName() + " does not support schema of type \'" + e0.a() + "\'");
    }

    public e I2() {
        return null;
    }

    public abstract n I4() throws IOException;

    public int J1() {
        return 0;
    }

    public y J4() {
        return y.d();
    }

    public abstract void L();

    public abstract byte[] L0(com.fasterxml.jackson.core.a arg1) throws IOException;

    public short L2() throws IOException {
        int v = this.Q1();
        if(v < 0xFFFF8000 || v > 0x7FFF) {
            throw new com.fasterxml.jackson.core.exc.a(this, String.format("Numeric value (%s) out of range of Java short", this.R2()), r.r, Short.TYPE);
        }
        return (short)v;
    }

    public Object N1() {
        return null;
    }

    public abstract String N3(String arg1) throws IOException;

    public int P2(Writer writer0) throws IOException, UnsupportedOperationException {
        String s = this.R2();
        if(s == null) {
            return 0;
        }
        writer0.write(s);
        return s.length();
    }

    public n Q(a n$a0, boolean z) {
        if(z) {
            this.l0(n$a0);
            return this;
        }
        this.h0(n$a0);
        return this;
    }

    public abstract int Q1() throws IOException;

    public l R() {
        return this.b1();
    }

    public abstract String R2() throws IOException;

    public abstract boolean S3();

    public String T() throws IOException {
        return this.y0();
    }

    public boolean T0() throws IOException {
        r r0 = this.Y();
        if(r0 == r.t) {
            return true;
        }
        if(r0 != r.u) {
            throw new m(this, String.format("Current token (%s) not of boolean type", r0)).l(this.b);
        }
        return false;
    }

    public abstract boolean T3();

    public r Y() {
        return this.c1();
    }

    public byte Y0() throws IOException {
        int v = this.Q1();
        if(v < 0xFFFFFF80 || v > 0xFF) {
            throw new com.fasterxml.jackson.core.exc.a(this, String.format("Numeric value (%s) out of range of Java byte", this.R2()), r.r, Byte.TYPE);
        }
        return (byte)v;
    }

    public abstract char[] Y2() throws IOException;

    public abstract boolean Y3(r arg1);

    public abstract boolean Z3(int arg1);

    public abstract u a1();

    public boolean a4(a n$a0) {
        return n$a0.c(this.a);
    }

    public abstract l b1();

    public abstract int b3() throws IOException;

    public boolean b4(z z0) {
        return z0.f().c(this.a);
    }

    public abstract r c1();

    public boolean c4() {
        return this.Y() == r.r;
    }

    @Override
    public abstract void close() throws IOException;

    public int d0() {
        return this.d1();
    }

    @Deprecated
    public abstract int d1();

    public abstract r d2();

    public boolean d4() {
        return this.Y() == r.m;
    }

    public l e0() {
        return this.i3();
    }

    public abstract long e2() throws IOException;

    public abstract int e3() throws IOException;

    public boolean e4() {
        return this.Y() == r.k;
    }

    protected u f() {
        u u0 = this.a1();
        if(u0 == null) {
            throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
        }
        return u0;
    }

    public Object f0() {
        return this.h1();
    }

    public boolean f4() throws IOException {
        return false;
    }

    public c g2() {
        return null;
    }

    public Boolean g4() throws IOException {
        r r0 = this.m4();
        if(r0 == r.t) {
            return true;
        }
        return r0 == r.u ? false : null;
    }

    public n h0(a n$a0) {
        this.a &= ~n$a0.d();
        return this;
    }

    public Object h1() {
        q q0 = this.A2();
        return q0 == null ? null : q0.c();
    }

    public String h4() throws IOException {
        return this.m4() == r.o ? this.y0() : null;
    }

    protected m i(String s) {
        return new m(this, s).l(this.b);
    }

    public abstract BigDecimal i1() throws IOException;

    public abstract b i2() throws IOException;

    public abstract l i3();

    public boolean i4(w w0) throws IOException {
        return this.m4() == r.o && w0.getValue().equals(this.y0());
    }

    public abstract boolean isClosed();

    protected m j(String s) {
        return this.i(s);
    }

    public abstract double j1() throws IOException;

    public abstract Number j2() throws IOException;

    public int j4(int v) throws IOException {
        return this.m4() == r.r ? this.Q1() : v;
    }

    protected m k(String s, Object object0) {
        return this.j(String.format(s, object0));
    }

    public long k4(long v) throws IOException {
        return this.m4() == r.r ? this.e2() : v;
    }

    public n l0(a n$a0) {
        this.a |= n$a0.d();
        return this;
    }

    public Object l1() throws IOException {
        return null;
    }

    public String l4() throws IOException {
        return this.m4() == r.q ? this.R2() : null;
    }

    public abstract r m4() throws IOException;

    protected m n(String s, Object object0, Object object1) {
        return this.j(String.format(s, object0, object1));
    }

    public Object n3() throws IOException {
        return null;
    }

    public abstract r n4() throws IOException;

    protected m o(String s, Object object0, Object object1, Object object2) {
        return this.j(String.format(s, object0, object1, object2));
    }

    public Object o2() throws IOException {
        return this.j2();
    }

    public abstract void o4(String arg1);

    protected m p(String s, Throwable throwable0) {
        m m0 = new m(this, s, throwable0);
        return this.b == null ? m0 : m0.l(this.b);
    }

    public Number p2() throws IOException {
        return this.j2();
    }

    public boolean p3() throws IOException {
        return this.r3(false);
    }

    public n p4(int v, int v1) {
        return this;
    }

    protected void q() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + this.getClass().getName());
    }

    public n q4(int v, int v1) {
        return this.D4(v & v1 | this.a & ~v1);
    }

    public boolean r3(boolean z) throws IOException {
        return z;
    }

    public int r4(com.fasterxml.jackson.core.a a0, OutputStream outputStream0) throws IOException {
        this.q();
        return 0;
    }

    public void s(Object object0) {
        this.C4(object0);
    }

    public double s3() throws IOException {
        return this.v3(0.0);
    }

    public int s4(OutputStream outputStream0) throws IOException {
        return this.r4(com.fasterxml.jackson.core.b.a(), outputStream0);
    }

    public boolean t() {
        return false;
    }

    public int t1() {
        return this.a;
    }

    public Object t2() throws IOException {
        return null;
    }

    public Object t4(com.fasterxml.jackson.core.type.b b0) throws IOException {
        return this.f().k(this, b0);
    }

    public void u0() throws IOException {
    }

    public abstract float u1() throws IOException;

    public Object u4(Class class0) throws IOException {
        return this.f().l(this, class0);
    }

    public boolean v() {
        return false;
    }

    public double v3(double f) throws IOException {
        return f;
    }

    public G v4() throws IOException {
        return this.f().e(this);
    }

    @Override  // com.fasterxml.jackson.core.I
    public abstract H version();

    public boolean w() {
        return false;
    }

    public Iterator w4(com.fasterxml.jackson.core.type.b b0) throws IOException {
        return this.f().n(this, b0);
    }

    public boolean x(e e0) {
        return false;
    }

    public abstract BigInteger x0() throws IOException;

    public Iterator x4(Class class0) throws IOException {
        return this.f().o(this, class0);
    }

    public abstract String y0() throws IOException;

    public int y3() throws IOException {
        return this.B3(0);
    }

    public int y4(OutputStream outputStream0) throws IOException {
        return -1;
    }

    public int z4(Writer writer0) throws IOException {
        return -1;
    }
}

