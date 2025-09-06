package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.json.f;
import com.fasterxml.jackson.core.json.h;
import com.fasterxml.jackson.core.k.b;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.util.e;
import com.fasterxml.jackson.core.v;
import com.fasterxml.jackson.core.w;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public abstract class a extends k {
    protected u e;
    protected int f;
    protected final g g;
    protected boolean h;
    protected f i;
    protected boolean j;
    public static final int k = 0xD800;
    public static final int l = 0xDBFF;
    public static final int m = 0xDC00;
    public static final int n = 0xDFFF;
    protected static final int o = 0;
    protected static final String p = "write a binary value";
    protected static final String q = "write a boolean value";
    protected static final String r = "write a null";
    protected static final String s = "write a number";
    protected static final String t = "write a raw (unencoded) value";
    protected static final String u = "write a string";
    protected static final int v = 0x270F;

    static {
        a.o = b.i.d() | b.h.d() | b.k.d();
    }

    @Deprecated
    protected a(int v, u u0) {
        this(v, u0, null);
    }

    protected a(int v, u u0, g g0) {
        this.f = v;
        this.e = u0;
        this.g = g0;
        this.i = f.A((b.k.c(v) ? com.fasterxml.jackson.core.json.b.f(this) : null));
        this.h = b.i.c(v);
    }

    protected a(int v, u u0, g g0, f f0) {
        this.f = v;
        this.e = u0;
        this.g = g0;
        this.i = f0;
        this.h = b.i.c(v);
    }

    @Deprecated
    protected a(int v, u u0, f f0) {
        this(v, u0, null, f0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public int C2(com.fasterxml.jackson.core.a a0, InputStream inputStream0, int v) throws IOException {
        this.j();
        return 0;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void E4(Object object0) throws IOException {
        this.D4();
        if(object0 != null) {
            this.u1(object0);
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void G4(w w0) throws IOException {
        this.d(w0.getValue());
    }

    @Override  // com.fasterxml.jackson.core.k
    @Deprecated
    public k J1(int v) {
        int v1 = this.f ^ v;
        this.f = v;
        if(v1 != 0) {
            this.T4(v, v1);
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void K4(G g0) throws IOException {
        if(g0 == null) {
            this.y3();
            return;
        }
        u u0 = this.e;
        if(u0 == null) {
            throw new IllegalStateException("No ObjectCodec defined");
        }
        u0.q(this, g0);
    }

    protected String P4(BigDecimal bigDecimal0) throws IOException {
        if(b.j.c(this.f)) {
            int v = bigDecimal0.scale();
            if(v < 0xFFFFD8F1 || v > 0x270F) {
                this.i(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", v, 0x270F, 0x270F));
            }
            return bigDecimal0.toPlainString();
        }
        return bigDecimal0.toString();
    }

    protected void Q4(byte[] arr_b, int v, int v1) throws IOException {
        if(arr_b == null) {
            this.i("Invalid `byte[]` argument: `null`");
        }
        if((arr_b.length - (v + v1) | (v | v1 | v + v1)) < 0) {
            this.i(String.format("Invalid \'offset\' (%d) and/or \'len\' (%d) arguments for `byte[]` of length %d", v, v1, ((int)arr_b.length)));
        }
    }

    protected void R4(char[] arr_c, int v, int v1) throws IOException {
        if(arr_c == null) {
            this.i("Invalid `char[]` argument: `null`");
        }
        if((arr_c.length - (v + v1) | (v | v1 | v + v1)) < 0) {
            this.i(String.format("Invalid \'offset\' (%d) and/or \'len\' (%d) arguments for `char[]` of length %d", v, v1, ((int)arr_c.length)));
        }
    }

    protected void S4(String s, int v, int v1) throws IOException {
        if(s == null) {
            this.i("Invalid `String` argument: `null`");
        }
        int v2 = s.length();
        if((v2 - (v + v1) | (v | v1 | v + v1)) < 0) {
            this.i(String.format("Invalid \'offset\' (%d) and/or \'len\' (%d) arguments for `String` of length %d", v, v1, v2));
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public q T0() {
        return this.i;
    }

    protected void T4(int v, int v1) {
        if((a.o & v1) == 0) {
            return;
        }
        this.h = b.i.c(v);
        b k$b0 = b.h;
        if(k$b0.c(v1)) {
            if(k$b0.c(v)) {
                this.N1(0x7F);
            }
            else {
                this.N1(0);
            }
        }
        b k$b1 = b.k;
        if(k$b1.c(v1)) {
            if(!k$b1.c(v)) {
                this.i = this.i.F(null);
            }
            else if(this.i.B() == null) {
                this.i = this.i.F(com.fasterxml.jackson.core.json.b.f(this));
            }
        }
    }

    protected v U4() {
        return new e();
    }

    protected final int V4(int v, int v1) throws IOException {
        if(v1 < 0xDC00 || v1 > 0xDFFF) {
            this.i(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", v, v1));
        }
        return 0xFCA02400 + 0x400 * v + v1;
    }

    protected abstract void W4();

    protected abstract void X4(String arg1) throws IOException;

    @Override  // com.fasterxml.jackson.core.k
    public void close() throws IOException {
        if(!this.j) {
            g g0 = this.g;
            if(g0 != null) {
                g0.close();
            }
            this.j = true;
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public k d0(b k$b0) {
        int v = k$b0.d();
        this.f &= ~v;
        if((v & a.o) != 0) {
            if(k$b0 == b.i) {
                this.h = false;
                return this;
            }
            if(k$b0 == b.h) {
                this.N1(0);
                return this;
            }
            if(k$b0 == b.k) {
                this.i = this.i.F(null);
            }
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public final boolean d1(b k$b0) {
        return (k$b0.d() & this.f) != 0;
    }

    @Override  // com.fasterxml.jackson.core.k
    public k e0(b k$b0) {
        int v = k$b0.d();
        this.f |= v;
        if((v & a.o) != 0) {
            if(k$b0 == b.i) {
                this.h = true;
                return this;
            }
            if(k$b0 == b.h) {
                this.N1(0x7F);
                return this;
            }
            if(k$b0 == b.k && this.i.B() == null) {
                this.i = this.i.F(com.fasterxml.jackson.core.json.b.f(this));
            }
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public abstract void flush() throws IOException;

    @Override  // com.fasterxml.jackson.core.k
    public u h0() {
        return this.e;
    }

    @Override  // com.fasterxml.jackson.core.k
    public k i2() {
        return this.a1() != null ? this : this.Q1(this.U4());
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean isClosed() {
        return this.j;
    }

    @Override  // com.fasterxml.jackson.core.k
    public k j1(int v, int v1) {
        int v2 = v & v1 | ~v1 & this.f;
        int v3 = this.f ^ v2;
        if(v3 != 0) {
            this.f = v2;
            this.T4(v2, v3);
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public Object l0() {
        return this.i.c();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void s3(w w0) throws IOException {
        this.v3(w0.getValue());
    }

    @Override  // com.fasterxml.jackson.core.k
    public k t1(u u0) {
        this.e = u0;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public int u0() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void u1(Object object0) {
        f f0 = this.i;
        if(f0 != null) {
            f0.q(object0);
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void v4(w w0) throws IOException {
        this.X4("write raw value");
        this.q4(w0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public H version() {
        return h.a;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void w4(String s) throws IOException {
        this.X4("write raw value");
        this.r4(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void writeObject(Object object0) throws IOException {
        if(object0 == null) {
            this.y3();
            return;
        }
        u u0 = this.e;
        if(u0 != null) {
            u0.q(this, object0);
            return;
        }
        this.o(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void x4(String s, int v, int v1) throws IOException {
        this.X4("write raw value");
        this.s4(s, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void y4(char[] arr_c, int v, int v1) throws IOException {
        this.X4("write raw value");
        this.t4(arr_c, v, v1);
    }
}

