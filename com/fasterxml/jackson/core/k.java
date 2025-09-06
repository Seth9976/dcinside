package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.core.util.z;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class k implements I, Closeable, Flushable {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.core.type.c.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.fasterxml.jackson.core.type.c.a.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.core.type.c.a.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.core.type.c.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.core.type.c.a.b.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.core.type.c.a.a.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        @Deprecated
        QUOTE_FIELD_NAMES(true),
        @Deprecated
        QUOTE_NON_NUMERIC_NUMBERS(true),
        @Deprecated
        ESCAPE_NON_ASCII(false),
        @Deprecated
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        @Deprecated
        USE_FAST_DOUBLE_WRITER(false),
        @Deprecated
        WRITE_HEX_UPPER_CASE(true);

        private final boolean a;
        private final int b;

        private b(boolean z) {
            this.a = z;
            this.b = 1 << this.ordinal();
        }

        public static int a() {
            b[] arr_k$b = b.values();
            int v1 = 0;
            for(int v = 0; v < arr_k$b.length; ++v) {
                b k$b0 = arr_k$b[v];
                if(k$b0.b()) {
                    v1 |= k$b0.d();
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

    protected v a;
    protected static final i b;
    protected static final i c;
    protected static final i d;

    static {
        i i0 = i.c(A.values());
        k.b = i0;
        k.c = i0.e(A.d);
        k.d = i0.e(A.c);
    }

    public void A2(String s) throws IOException {
        this.v3(s);
        this.z4();
    }

    @Deprecated
    public void A4(int v) throws IOException {
        this.z4();
    }

    public void B3(String s) throws IOException {
        this.v3(s);
        this.y3();
    }

    public void B4(Object object0) throws IOException {
        this.z4();
        this.u1(object0);
    }

    public abstract int C2(com.fasterxml.jackson.core.a arg1, InputStream arg2, int arg3) throws IOException;

    public abstract void C3(double arg1) throws IOException;

    public void C4(Object object0, int v) throws IOException {
        this.A4(v);
        this.u1(object0);
    }

    public abstract void D4() throws IOException;

    public int E0() {
        return 0;
    }

    public abstract void E3(float arg1) throws IOException;

    public void E4(Object object0) throws IOException {
        this.D4();
        this.u1(object0);
    }

    public abstract void F3(int arg1) throws IOException;

    public void F4(Object object0, int v) throws IOException {
        this.E4(object0);
    }

    public abstract void G4(w arg1) throws IOException;

    public void H4(Reader reader0, int v) throws IOException {
        this.j();
    }

    public int I2(InputStream inputStream0, int v) throws IOException {
        return this.C2(com.fasterxml.jackson.core.b.a(), inputStream0, v);
    }

    public abstract void I4(char[] arg1, int arg2, int arg3) throws IOException;

    @Deprecated
    public abstract k J1(int arg1);

    public void J4(String s, String s1) throws IOException {
        this.v3(s);
        this.d(s1);
    }

    public abstract void K4(G arg1) throws IOException;

    public final k L(b k$b0, boolean z) {
        if(z) {
            this.e0(k$b0);
            return this;
        }
        this.d0(k$b0);
        return this;
    }

    public int L0() {
        return -1;
    }

    public abstract void L2(com.fasterxml.jackson.core.a arg1, byte[] arg2, int arg3, int arg4) throws IOException;

    public void L4(Object object0) throws IOException {
        throw new j("No native support for writing Type Ids", this);
    }

    public c M4(c c0) throws IOException {
        Object object0 = c0.c;
        r r0 = c0.f;
        if(this.x()) {
            c0.g = false;
            this.L4(object0);
        }
        else {
            String s = object0 instanceof String ? ((String)object0) : String.valueOf(object0);
            c0.g = true;
            switch(a.a[c0.e.ordinal()]) {
                case 1: 
                case 2: {
                    break;
                }
                case 3: {
                    this.E4(c0.a);
                    this.J4(c0.d, s);
                    return c0;
                }
                case 4: {
                    this.D4();
                    this.v3(s);
                    break;
                }
                default: {
                    this.z4();
                    this.d(s);
                    break;
                }
            }
        }
        if(r0 == r.k) {
            this.E4(c0.a);
            return c0;
        }
        if(r0 == r.m) {
            this.z4();
        }
        return c0;
    }

    public k N1(int v) {
        return this;
    }

    public abstract void N3(long arg1) throws IOException;

    public c N4(c c0) throws IOException {
        r r0 = c0.f;
        if(r0 == r.k) {
            this.p3();
        }
        else if(r0 == r.m) {
            this.n3();
        }
        if(c0.g) {
            switch(c0.e) {
                case 1: {
                    this.J4(c0.d, (c0.c instanceof String ? ((String)c0.c) : String.valueOf(c0.c)));
                    break;
                }
                case 2: 
                case 3: {
                    break;
                }
                case 5: {
                    this.n3();
                    return c0;
                }
                default: {
                    this.p3();
                    return c0;
                }
            }
        }
        return c0;
    }

    public abstract void O4(byte[] arg1, int arg2, int arg3) throws IOException;

    public void P2(byte[] arr_b) throws IOException {
        this.L2(com.fasterxml.jackson.core.b.a(), arr_b, 0, arr_b.length);
    }

    public void Q(n n0) throws IOException {
        r r0 = n0.Y();
        switch((r0 == null ? -1 : r0.d())) {
            case -1: {
                this.i("No current event to copy");
                return;
            }
            case 1: {
                this.D4();
                return;
            }
            case 2: {
                this.p3();
                return;
            }
            case 3: {
                this.z4();
                return;
            }
            case 4: {
                this.n3();
                return;
            }
            case 5: {
                this.v3(n0.y0());
                return;
            }
            case 6: {
                this.f(n0);
                return;
            }
            case 7: {
                this.e(n0);
                return;
            }
            case 8: {
                this.b(n0);
                return;
            }
            case 9: {
                this.b3(true);
                return;
            }
            case 10: {
                this.b3(false);
                return;
            }
            case 11: {
                this.y3();
                return;
            }
            case 12: {
                this.writeObject(n0.l1());
                return;
            }
            default: {
                throw new IllegalStateException("Internal error: unknown current token, " + r0);
            }
        }
    }

    public k Q1(v v0) {
        this.a = v0;
        return this;
    }

    public void R(n n0) throws IOException {
        r r0 = n0.Y();
        switch((r0 == null ? -1 : r0.d())) {
            case -1: {
                this.i("No current event to copy");
                return;
            }
            case 1: {
                this.D4();
                return;
            }
            case 2: {
                this.p3();
                return;
            }
            case 3: {
                this.z4();
                return;
            }
            case 4: {
                this.n3();
                return;
            }
            case 5: {
                this.v3(n0.y0());
                return;
            }
            case 6: {
                this.f(n0);
                return;
            }
            case 7: {
                this.e(n0);
                return;
            }
            case 8: {
                this.c(n0);
                return;
            }
            case 9: {
                this.b3(true);
                return;
            }
            case 10: {
                this.b3(false);
                return;
            }
            case 11: {
                this.y3();
                return;
            }
            case 12: {
                this.writeObject(n0.l1());
                return;
            }
            default: {
                throw new IllegalStateException("Internal error: unknown current token, " + r0);
            }
        }
    }

    public void R2(byte[] arr_b, int v, int v1) throws IOException {
        this.L2(com.fasterxml.jackson.core.b.a(), arr_b, v, v1);
    }

    public abstract void S3(String arg1) throws IOException;

    public void T(n n0) throws IOException {
        r r0 = n0.Y();
        int v = -1;
        int v1 = r0 == null ? -1 : r0.d();
        if(v1 == 5) {
            this.v3(n0.y0());
            r r1 = n0.m4();
            if(r1 != null) {
                v = r1.d();
            }
            v1 = v;
        }
        switch(v1) {
            case 1: {
                this.D4();
                this.a(n0);
                return;
            }
            case 3: {
                this.z4();
                this.a(n0);
                return;
            }
            default: {
                this.Q(n0);
            }
        }
    }

    public abstract q T0();

    public abstract void T3(BigDecimal arg1) throws IOException;

    public Object Y() {
        return this.l0();
    }

    public Object Y0() {
        return null;
    }

    public void Y2(String s, byte[] arr_b) throws IOException {
        this.v3(s);
        this.P2(arr_b);
    }

    public abstract void Y3(BigInteger arg1) throws IOException;

    public void Z3(short v) throws IOException {
        this.F3(((int)v));
    }

    protected void a(n n0) throws IOException {
        int v = 1;
        r r0;
        while((r0 = n0.m4()) != null) {
            switch(r0.d()) {
                case 1: {
                    this.D4();
                    ++v;
                    break;
                }
                case 2: {
                    this.p3();
                    --v;
                    if(v != 0) {
                        break;
                    }
                    return;
                }
                case 3: {
                    this.z4();
                    ++v;
                    break;
                }
                case 4: {
                    this.n3();
                    --v;
                    if(v != 0) {
                        break;
                    }
                    return;
                }
                case 5: {
                    this.v3(n0.y0());
                    break;
                }
                case 6: {
                    this.f(n0);
                    break;
                }
                case 7: {
                    this.e(n0);
                    break;
                }
                case 8: {
                    this.b(n0);
                    break;
                }
                case 9: {
                    this.b3(true);
                    break;
                }
                case 10: {
                    this.b3(false);
                    break;
                }
                case 11: {
                    this.y3();
                    break;
                }
                case 12: {
                    this.writeObject(n0.l1());
                    break;
                }
                default: {
                    throw new IllegalStateException("Internal error: unknown current token, " + r0);
                }
            }
        }
    }

    public v a1() {
        return this.a;
    }

    public void a4(char[] arr_c, int v, int v1) throws IOException {
        this.S3(new String(arr_c, v, v1));
    }

    protected void b(n n0) throws IOException {
        com.fasterxml.jackson.core.n.b n$b0 = n0.i2();
        if(n$b0 == com.fasterxml.jackson.core.n.b.f) {
            this.T3(n0.i1());
            return;
        }
        if(n$b0 == com.fasterxml.jackson.core.n.b.d) {
            this.E3(n0.u1());
            return;
        }
        this.C3(n0.j1());
    }

    public e b1() {
        return null;
    }

    public abstract void b3(boolean arg1) throws IOException;

    public void b4(String s, double f) throws IOException {
        this.v3(s);
        this.C3(f);
    }

    protected void c(n n0) throws IOException {
        Number number0 = n0.p2();
        if(number0 instanceof BigDecimal) {
            this.T3(((BigDecimal)number0));
            return;
        }
        if(number0 instanceof Double) {
            this.C3(number0.doubleValue());
            return;
        }
        this.E3(number0.floatValue());
    }

    public i c1() {
        return k.b;
    }

    public void c4(String s, float f) throws IOException {
        this.v3(s);
        this.E3(f);
    }

    @Override
    public abstract void close() throws IOException;

    public abstract void d(String arg1) throws IOException;

    public abstract k d0(b arg1);

    public abstract boolean d1(b arg1);

    public k d2(w w0) {
        throw new UnsupportedOperationException();
    }

    public void d4(String s, int v) throws IOException {
        this.v3(s);
        this.F3(v);
    }

    protected void e(n n0) throws IOException {
        com.fasterxml.jackson.core.n.b n$b0 = n0.i2();
        if(n$b0 == com.fasterxml.jackson.core.n.b.a) {
            this.F3(n0.Q1());
            return;
        }
        if(n$b0 == com.fasterxml.jackson.core.n.b.b) {
            this.N3(n0.e2());
            return;
        }
        this.Y3(n0.x0());
    }

    public abstract k e0(b arg1);

    public void e2(e e0) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type \'%s\'", this.getClass().getName(), e0.a()));
    }

    public void e3(String s, boolean z) throws IOException {
        this.v3(s);
        this.b3(z);
    }

    public void e4(String s, long v) throws IOException {
        this.v3(s);
        this.N3(v);
    }

    protected void f(n n0) throws IOException {
        if(n0.T3()) {
            this.I4(n0.Y2(), n0.e3(), n0.b3());
            return;
        }
        this.d(n0.R2());
    }

    public d f0() {
        return null;
    }

    public void f4(String s, BigDecimal bigDecimal0) throws IOException {
        this.v3(s);
        this.T3(bigDecimal0);
    }

    @Override
    public abstract void flush() throws IOException;

    public B g2() {
        return B.d();
    }

    public void g4(String s, BigInteger bigInteger0) throws IOException {
        this.v3(s);
        this.Y3(bigInteger0);
    }

    public abstract u h0();

    public boolean h1(C c0) {
        return this.d1(c0.f());
    }

    public void h4(String s, short v) throws IOException {
        this.v3(s);
        this.Z3(v);
    }

    protected void i(String s) throws j {
        throw new j(s, this);
    }

    public k i1(int v, int v1) {
        return this;
    }

    public abstract k i2();

    public void i3(Object object0) throws IOException {
        if(object0 == null) {
            this.y3();
            return;
        }
        if(!(object0 instanceof byte[])) {
            throw new j("No native support for writing embedded objects of type " + object0.getClass().getName(), this);
        }
        this.P2(((byte[])object0));
    }

    public void i4(String s, Object object0) throws IOException {
        this.v3(s);
        this.writeObject(object0);
    }

    public abstract boolean isClosed();

    protected void j() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + this.getClass().getName());
    }

    public k j1(int v, int v1) {
        return this.J1(v & v1 | this.u0() & ~v1);
    }

    public void j2(double[] arr_f, int v, int v1) throws IOException {
        if(arr_f == null) {
            throw new IllegalArgumentException("null array");
        }
        this.n(arr_f.length, v, v1);
        this.C4(arr_f, v1);
        int v2 = v1 + v;
        while(v < v2) {
            this.C3(arr_f[v]);
            ++v;
        }
        this.n3();
    }

    public void j4(String s) throws IOException {
        this.v3(s);
        this.D4();
    }

    protected final void k() {
        z.f();
    }

    public void k4(Object object0) throws IOException {
        throw new j("No native support for writing Object Ids", this);
    }

    public Object l0() {
        q q0 = this.T0();
        return q0 == null ? null : q0.c();
    }

    public k l1(d d0) {
        return this;
    }

    public void l4(Object object0) throws IOException {
        throw new j("No native support for writing Object Ids", this);
    }

    public void m4(String s) throws IOException {
    }

    protected final void n(int v, int v1, int v2) {
        if(v1 < 0 || v1 + v2 > v) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", v1, v2, v));
        }
    }

    public abstract void n3() throws IOException;

    public void n4(Object object0) throws IOException {
        this.writeObject(object0);
    }

    protected void o(Object object0) throws IOException {
        if(object0 == null) {
            this.y3();
            return;
        }
        if(object0 instanceof String) {
            this.d(((String)object0));
            return;
        }
        if(object0 instanceof Number) {
            Number number0 = (Number)object0;
            if(number0 instanceof Integer) {
                this.F3(number0.intValue());
                return;
            }
            if(number0 instanceof Long) {
                this.N3(number0.longValue());
                return;
            }
            if(number0 instanceof Double) {
                this.C3(number0.doubleValue());
                return;
            }
            if(number0 instanceof Float) {
                this.E3(number0.floatValue());
                return;
            }
            if(number0 instanceof Short) {
                this.Z3(number0.shortValue());
                return;
            }
            if(number0 instanceof Byte) {
                this.Z3(((short)number0.byteValue()));
                return;
            }
            if(number0 instanceof BigInteger) {
                this.Y3(((BigInteger)number0));
                return;
            }
            if(number0 instanceof BigDecimal) {
                this.T3(((BigDecimal)number0));
                return;
            }
            if(number0 instanceof AtomicInteger) {
                this.F3(((AtomicInteger)number0).get());
                return;
            }
            if(number0 instanceof AtomicLong) {
                this.N3(((AtomicLong)number0).get());
                return;
            }
        }
        else {
            if(object0 instanceof byte[]) {
                this.P2(((byte[])object0));
                return;
            }
            if(object0 instanceof Boolean) {
                this.b3(((Boolean)object0).booleanValue());
                return;
            }
            if(object0 instanceof AtomicBoolean) {
                this.b3(((AtomicBoolean)object0).get());
                return;
            }
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + object0.getClass().getName() + ")");
    }

    public void o2(int[] arr_v, int v, int v1) throws IOException {
        if(arr_v == null) {
            throw new IllegalArgumentException("null array");
        }
        this.n(arr_v.length, v, v1);
        this.C4(arr_v, v1);
        int v2 = v1 + v;
        while(v < v2) {
            this.F3(arr_v[v]);
            ++v;
        }
        this.n3();
    }

    public void o4(String s, Object object0) throws IOException {
        this.i4(s, object0);
    }

    public void p(Object object0) {
        this.u1(object0);
    }

    public void p2(long[] arr_v, int v, int v1) throws IOException {
        if(arr_v == null) {
            throw new IllegalArgumentException("null array");
        }
        this.n(arr_v.length, v, v1);
        this.C4(arr_v, v1);
        int v2 = v1 + v;
        while(v < v2) {
            this.N3(arr_v[v]);
            ++v;
        }
        this.n3();
    }

    public abstract void p3() throws IOException;

    public abstract void p4(char arg1) throws IOException;

    public boolean q() {
        return true;
    }

    public void q4(w w0) throws IOException {
        this.r4(w0.getValue());
    }

    public void r3(long v) throws IOException {
        this.v3(Long.toString(v));
    }

    public abstract void r4(String arg1) throws IOException;

    public boolean s(e e0) {
        return false;
    }

    public abstract void s3(w arg1) throws IOException;

    public abstract void s4(String arg1, int arg2, int arg3) throws IOException;

    public boolean t() {
        return false;
    }

    public abstract k t1(u arg1);

    public void t2(String[] arr_s, int v, int v1) throws IOException {
        if(arr_s == null) {
            throw new IllegalArgumentException("null array");
        }
        this.n(arr_s.length, v, v1);
        this.C4(arr_s, v1);
        int v2 = v1 + v;
        while(v < v2) {
            this.d(arr_s[v]);
            ++v;
        }
        this.n3();
    }

    public abstract void t4(char[] arg1, int arg2, int arg3) throws IOException;

    public abstract int u0();

    public void u1(Object object0) {
        q q0 = this.T0();
        if(q0 != null) {
            q0.q(object0);
        }
    }

    public abstract void u4(byte[] arg1, int arg2, int arg3) throws IOException;

    public boolean v() {
        return false;
    }

    public abstract void v3(String arg1) throws IOException;

    public void v4(w w0) throws IOException {
        this.w4(w0.getValue());
    }

    @Override  // com.fasterxml.jackson.core.I
    public abstract H version();

    public boolean w() {
        return false;
    }

    public abstract void w4(String arg1) throws IOException;

    public abstract void writeObject(Object arg1) throws IOException;

    public boolean x() {
        return false;
    }

    public int x0() {
        return 0;
    }

    public abstract void x4(String arg1, int arg2, int arg3) throws IOException;

    public abstract void y3() throws IOException;

    public abstract void y4(char[] arg1, int arg2, int arg3) throws IOException;

    public abstract void z4() throws IOException;
}

