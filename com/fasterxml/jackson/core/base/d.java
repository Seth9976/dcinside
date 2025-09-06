package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.core.io.i;
import com.fasterxml.jackson.core.io.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.util.c;
import com.fasterxml.jackson.core.util.z;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class d extends n {
    protected static final int A = 57;
    protected static final int B = 45;
    protected static final int C = 43;
    protected static final int D = 46;
    protected static final int E = 101;
    protected static final int F = 69;
    protected static final char G = '\u0000';
    protected static final byte[] H = null;
    protected static final int[] I = null;
    protected static final int J = 0;
    protected static final int K = 1;
    protected static final int L = 2;
    protected static final int M = 4;
    protected static final BigDecimal M8 = null;
    protected static final int N = 8;
    protected static final BigDecimal N8 = null;
    protected static final int O = 16;
    protected static final BigDecimal O8 = null;
    protected static final int P = 0x20;
    protected static final BigDecimal P8 = null;
    protected static final BigInteger Q = null;
    protected static final long Q8 = 0xFFFFFFFF80000000L;
    protected static final long R8 = 0x7FFFFFFFL;
    protected static final double S8 = -9223372036854776000.0;
    protected static final double T8 = 9223372036854776000.0;
    protected static final double U8 = -2147483648.0;
    protected static final double V8 = 2147483647.0;
    @Deprecated
    protected static final int W8 = 0x100;
    protected static final BigInteger X = null;
    protected static final BigInteger Y = null;
    protected static final BigInteger Z = null;
    protected r h;
    protected r i;
    protected static final int j = 9;
    protected static final int k = 10;
    protected static final int l = 13;
    protected static final int m = 0x20;
    protected static final int n = 91;
    protected static final int o = 93;
    protected static final int p = 0x7B;
    protected static final int q = 0x7D;
    protected static final int r = 34;
    protected static final int s = 39;
    protected static final int t = 92;
    protected static final int u = 0x2F;
    protected static final int v = 42;
    protected static final int w = 58;
    protected static final int x = 44;
    protected static final int y = 35;
    protected static final int z = 0x30;

    static {
        d.H = new byte[0];
        d.I = new int[0];
        BigInteger bigInteger0 = BigInteger.valueOf(0xFFFFFFFF80000000L);
        d.Q = bigInteger0;
        BigInteger bigInteger1 = BigInteger.valueOf(0x7FFFFFFFL);
        d.X = bigInteger1;
        BigInteger bigInteger2 = BigInteger.valueOf(0x8000000000000000L);
        d.Y = bigInteger2;
        BigInteger bigInteger3 = BigInteger.valueOf(0x7FFFFFFFFFFFFFFFL);
        d.Z = bigInteger3;
        d.M8 = new BigDecimal(bigInteger2);
        d.N8 = new BigDecimal(bigInteger3);
        d.O8 = new BigDecimal(bigInteger0);
        d.P8 = new BigDecimal(bigInteger1);
    }

    protected d() {
    }

    protected d(int v) {
        super(v);
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract q A2();

    @Override  // com.fasterxml.jackson.core.n
    public int B3(int v) throws IOException {
        r r0 = this.h;
        if(r0 != r.r && r0 != r.s) {
            if(r0 != null) {
                int v1 = r0.d();
                if(v1 != 6) {
                    switch(v1) {
                        case 9: {
                            return 1;
                        }
                        case 10: 
                        case 11: {
                            return 0;
                        }
                        case 12: {
                            Object object0 = this.l1();
                            return object0 instanceof Number ? ((Number)object0).intValue() : v;
                        }
                        default: {
                            return v;
                        }
                    }
                }
                String s = this.R2();
                return this.Q4(s) ? 0 : l.e(s, v);
            }
            return v;
        }
        return this.Q1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public long C3() throws IOException {
        return this.h == r.r || this.h == r.s ? this.e2() : this.E3(0L);
    }

    @Override  // com.fasterxml.jackson.core.n
    public long E3(long v) throws IOException {
        r r0 = this.h;
        if(r0 != r.r && r0 != r.s) {
            if(r0 != null) {
                int v1 = r0.d();
                if(v1 != 6) {
                    switch(v1) {
                        case 9: {
                            return 1L;
                        }
                        case 10: 
                        case 11: {
                            return 0L;
                        }
                        case 12: {
                            Object object0 = this.l1();
                            return object0 instanceof Number ? ((Number)object0).longValue() : v;
                        }
                        default: {
                            return v;
                        }
                    }
                }
                String s = this.R2();
                return this.Q4(s) ? 0L : l.f(s, v);
            }
            return v;
        }
        return this.e2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public String F3() throws IOException {
        return this.N3(null);
    }

    @Override  // com.fasterxml.jackson.core.n
    public n I4() throws IOException {
        if(this.h != r.k && this.h != r.m) {
            return this;
        }
        int v = 1;
        while(true) {
            r r0 = this.m4();
            if(r0 == null) {
                this.P4();
                return this;
            }
            if(r0.i()) {
                ++v;
            }
            else {
                if(r0.h()) {
                    --v;
                    if(v != 0) {
                        continue;
                    }
                    return this;
                }
                if(r0 == r.j) {
                    this.U4("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", this.getClass().getName());
                }
            }
        }
    }

    @Deprecated
    protected static String K4(byte[] arr_b) {
        try {
            return new String(arr_b, "US-ASCII");
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public void L() {
        r r0 = this.h;
        if(r0 != null) {
            this.i = r0;
            this.h = null;
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract byte[] L0(a arg1) throws IOException;

    @Deprecated
    protected static byte[] L4(String s) {
        byte[] arr_b = new byte[s.length()];
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = (byte)s.charAt(v1);
        }
        return arr_b;
    }

    protected final m M4(String s, Throwable throwable0) {
        return new m(this, s, throwable0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public String N3(String s) throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            return this.R2();
        }
        if(r0 == r.o) {
            return this.y0();
        }
        return r0 == null || r0 == r.v || !r0.g() ? s : this.R2();
    }

    protected void N4(String s, c c0, a a0) throws IOException {
        try {
            a0.e(s, c0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            this.T4(illegalArgumentException0.getMessage());
        }
    }

    protected static final String O4(int v) {
        if(Character.isISOControl(((char)v))) {
            return "(CTRL-CHAR, code " + v + ")";
        }
        return v <= 0xFF ? "\'" + ((char)v) + "\' (code " + v + ")" : "\'" + ((char)v) + "\' (code " + v + " / 0x" + Integer.toHexString(v) + ")";
    }

    protected abstract void P4() throws m;

    protected boolean Q4(String s) {
        return "null".equals(s);
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract String R2() throws IOException;

    protected String R4(String s) {
        int v = s.length();
        if(v < 1000) {
            return s;
        }
        if(s.startsWith("-")) {
            --v;
        }
        return String.format("[Integer with %d digits]", v);
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean S3() {
        return this.h != null;
    }

    protected String S4(String s) {
        int v = s.length();
        if(v < 1000) {
            return s;
        }
        if(s.startsWith("-")) {
            --v;
        }
        return String.format("[number with %d characters]", v);
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract boolean T3();

    protected final void T4(String s) throws m {
        throw this.i(s);
    }

    protected final void U4(String s, Object object0) throws m {
        throw this.i(String.format(s, object0));
    }

    protected final void V4(String s, Object object0, Object object1) throws m {
        throw this.i(String.format(s, object0, object1));
    }

    protected void W4(String s, r r0, Class class0) throws com.fasterxml.jackson.core.exc.a {
        throw new com.fasterxml.jackson.core.exc.a(this, s, r0, class0);
    }

    protected void X4() throws m {
        this.Z4(" in " + this.h, this.h);
    }

    @Override  // com.fasterxml.jackson.core.n
    public r Y() {
        return this.h;
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract char[] Y2() throws IOException;

    @Override  // com.fasterxml.jackson.core.n
    public boolean Y3(r r0) {
        return this.h == r0;
    }

    @Deprecated
    protected void Y4(String s) throws m {
        throw new i(this, null, "Unexpected end-of-input" + s);
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean Z3(int v) {
        return this.h == null ? v == 0 : this.h.d() == v;
    }

    protected void Z4(String s, r r0) throws m {
        throw new i(this, r0, "Unexpected end-of-input" + s);
    }

    @Deprecated
    protected void a5() throws m {
        this.Y4(" in a value");
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract int b3() throws IOException;

    protected void b5(r r0) throws m {
        String s;
        if(r0 == r.q) {
            s = " in a String value";
        }
        else {
            s = r0 == r.r || r0 == r.s ? " in a Number value" : " in a value";
        }
        this.Z4(s, r0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public r c1() {
        return this.h;
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean c4() {
        return this.h == r.r;
    }

    protected void c5(int v) throws m {
        this.d5(v, "Expected space separating root-level values");
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract void close() throws IOException;

    @Override  // com.fasterxml.jackson.core.n
    public int d0() {
        return this.h == null ? 0 : this.h.d();
    }

    @Override  // com.fasterxml.jackson.core.n
    @Deprecated
    public int d1() {
        return this.h == null ? 0 : this.h.d();
    }

    @Override  // com.fasterxml.jackson.core.n
    public r d2() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean d4() {
        return this.h == r.m;
    }

    protected void d5(int v, String s) throws m {
        if(v < 0) {
            this.X4();
        }
        String s1 = String.format("Unexpected character (%s)", d.O4(v));
        if(s != null) {
            s1 = s1 + ": " + s;
        }
        this.T4(s1);
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract int e3() throws IOException;

    @Override  // com.fasterxml.jackson.core.n
    public boolean e4() {
        return this.h == r.k;
    }

    protected Object e5(int v, String s) throws m {
        String s1 = String.format("Unexpected character (%s) in numeric value", d.O4(v));
        if(s != null) {
            s1 = s1 + ": " + s;
        }
        this.T4(s1);
        return null;
    }

    protected final void f5() {
        z.f();
    }

    protected void g5(int v) throws m {
        this.T4("Illegal character (" + d.O4(((char)v)) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    protected final void h5(String s, Throwable throwable0) throws m {
        throw this.M4(s, throwable0);
    }

    protected void i5(String s) throws m {
        this.T4("Invalid numeric value: " + s);
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract boolean isClosed();

    protected void j5() throws IOException {
        this.k5(this.R2());
    }

    protected void k5(String s) throws IOException {
        this.l5(s, this.Y());
    }

    protected void l5(String s, r r0) throws IOException {
        this.W4(String.format("Numeric value (%s) out of range of int (%d - %s)", this.R4(s), 0x80000000, 0x7FFFFFFF), r0, Integer.TYPE);
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract r m4() throws IOException;

    protected void m5() throws IOException {
        this.n5(this.R2());
    }

    @Override  // com.fasterxml.jackson.core.n
    public r n4() throws IOException {
        r r0 = this.m4();
        return r0 == r.o ? this.m4() : r0;
    }

    protected void n5(String s) throws IOException {
        this.o5(s, this.Y());
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract void o4(String arg1);

    protected void o5(String s, r r0) throws IOException {
        this.W4(String.format("Numeric value (%s) out of range of long (%d - %s)", this.R4(s), 0x8000000000000000L, 0x7FFFFFFFFFFFFFFFL), r0, Long.TYPE);
    }

    @Deprecated
    protected void p5(int v, String s) throws m {
        this.e5(v, s);
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean r3(boolean z) throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 6: {
                    String s = this.R2().trim();
                    if("true".equals(s)) {
                        return true;
                    }
                    if("false".equals(s)) {
                        return false;
                    }
                    return this.Q4(s) ? false : z;
                }
                case 7: {
                    return this.Q1() != 0;
                }
                case 9: {
                    return true;
                }
                case 10: 
                case 11: {
                    return false;
                }
                case 12: {
                    Object object0 = this.l1();
                    return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : z;
                }
                default: {
                    return z;
                }
            }
        }
        return z;
    }

    @Override  // com.fasterxml.jackson.core.n
    public double v3(double f) throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 6: {
                    String s = this.R2();
                    if(this.Q4(s)) {
                        return 0.0;
                    }
                    this.J4().o(s.length());
                    return l.c(s, f);
                }
                case 7: 
                case 8: {
                    return this.j1();
                }
                case 9: {
                    return 1.0;
                }
                case 10: 
                case 11: {
                    return 0.0;
                }
                case 12: {
                    Object object0 = this.l1();
                    return object0 instanceof Number ? ((Number)object0).doubleValue() : f;
                }
                default: {
                    return f;
                }
            }
        }
        return f;
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract String y0() throws IOException;

    @Override  // com.fasterxml.jackson.core.n
    public int y3() throws IOException {
        return this.h == r.r || this.h == r.s ? this.Q1() : this.B3(0);
    }
}

