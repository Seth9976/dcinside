package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.io.e;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.io.l;
import com.fasterxml.jackson.core.json.b;
import com.fasterxml.jackson.core.json.h;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n.a;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.core.util.x;
import com.fasterxml.jackson.core.y;
import com.fasterxml.jackson.core.z;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public abstract class c extends d {
    protected int A9;
    protected static final i B9;
    protected final g X8;
    protected final y Y8;
    protected boolean Z8;
    protected int a9;
    protected int b9;
    protected long c9;
    protected int d9;
    protected int e9;
    protected long f9;
    protected int g9;
    protected int h9;
    protected com.fasterxml.jackson.core.json.d i9;
    protected r j9;
    protected final x k9;
    protected char[] l9;
    protected boolean m9;
    protected com.fasterxml.jackson.core.util.c n9;
    protected byte[] o9;
    protected int p9;
    protected int q9;
    protected long r9;
    protected float s9;
    protected double t9;
    protected BigInteger u9;
    protected BigDecimal v9;
    protected String w9;
    protected boolean x9;
    protected int y9;
    protected int z9;

    static {
        c.B9 = n.g;
    }

    protected c(g g0, int v) {
        super(v);
        this.d9 = 1;
        this.g9 = 1;
        this.p9 = 0;
        this.X8 = g0;
        y y0 = g0.u0();
        if(y0 == null) {
            y0 = y.d();
        }
        this.Y8 = y0;
        this.k9 = g0.t();
        this.i9 = com.fasterxml.jackson.core.json.d.y((a.q.c(v) ? b.g(this) : null));
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public q A2() {
        return this.b6();
    }

    protected BigDecimal A5() throws m {
        BigDecimal bigDecimal0 = this.v9;
        if(bigDecimal0 != null) {
            return bigDecimal0;
        }
        String s = this.w9;
        if(s == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        try {
            this.v9 = l.h(s, this.b4(z.i));
        }
        catch(NumberFormatException numberFormatException0) {
            this.h5("Malformed numeric value (" + this.S4(this.w9) + ")", numberFormatException0);
        }
        this.w9 = null;
        return this.v9;
    }

    protected BigInteger B5() throws m {
        BigInteger bigInteger0 = this.u9;
        if(bigInteger0 != null) {
            return bigInteger0;
        }
        String s = this.w9;
        if(s == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        try {
            this.u9 = l.n(s, this.b4(z.i));
        }
        catch(NumberFormatException numberFormatException0) {
            this.h5("Malformed numeric value (" + this.S4(this.w9) + ")", numberFormatException0);
        }
        this.w9 = null;
        return this.u9;
    }

    @Override  // com.fasterxml.jackson.core.n
    public void C4(Object object0) {
        this.i9.q(object0);
    }

    public com.fasterxml.jackson.core.util.c C5() {
        com.fasterxml.jackson.core.util.c c0 = this.n9;
        if(c0 == null) {
            this.n9 = new com.fasterxml.jackson.core.util.c();
            return this.n9;
        }
        c0.reset();
        return this.n9;
    }

    @Override  // com.fasterxml.jackson.core.n
    @Deprecated
    public n D4(int v) {
        int v1 = this.a ^ v;
        if(v1 != 0) {
            this.a = v;
            this.q5(v, v1);
        }
        return this;
    }

    protected double D5() throws m {
        String s = this.w9;
        if(s != null) {
            try {
                this.t9 = l.q(s, this.b4(z.h));
            }
            catch(NumberFormatException numberFormatException0) {
                this.h5("Malformed numeric value (" + this.S4(this.w9) + ")", numberFormatException0);
            }
            this.w9 = null;
        }
        return this.t9;
    }

    protected float E5() throws m {
        String s = this.w9;
        if(s != null) {
            try {
                this.s9 = l.s(s, this.b4(z.h));
            }
            catch(NumberFormatException numberFormatException0) {
                this.h5("Malformed numeric value (" + this.S4(this.w9) + ")", numberFormatException0);
            }
            this.w9 = null;
        }
        return this.s9;
    }

    // 去混淆评级： 低(20)
    @Deprecated
    protected Object F5() {
        return a.s.c(this.a) ? this.X8.w().o() : null;
    }

    protected int[] G5(int[] arr_v, int v) throws com.fasterxml.jackson.core.exc.b {
        this.Y8.q(arr_v.length << 2);
        return c.f6(arr_v, v);
    }

    protected void H5(com.fasterxml.jackson.core.a a0) throws IOException {
        this.T4(a0.z());
    }

    protected char I5(char c) throws p {
        if(this.a4(a.i)) {
            return c;
        }
        if(c == 39 && this.a4(a.g)) {
            return 39;
        }
        this.T4("Unrecognized character escape " + d.O4(c));
        return c;
    }

    @Override  // com.fasterxml.jackson.core.n
    public y J4() {
        return this.Y8;
    }

    protected int J5() throws IOException {
        if(this.Z8) {
            this.T4("Internal error: _parseNumericValue called when parser instance closed");
        }
        if(this.h == r.r && this.y9 <= 9) {
            int v = this.k9.o(this.x9);
            this.q9 = v;
            this.p9 = 1;
            return v;
        }
        this.K5(1);
        if((this.p9 & 1) == 0) {
            this.X5();
        }
        return this.q9;
    }

    protected void K5(int v) throws IOException {
        if(this.Z8) {
            this.T4("Internal error: _parseNumericValue called when parser instance closed");
        }
        r r0 = this.h;
        if(r0 == r.r) {
            int v1 = this.y9;
            if(v1 <= 9) {
                this.q9 = this.k9.o(this.x9);
                this.p9 = 1;
                return;
            }
            if(v1 <= 18) {
                long v2 = this.k9.p(this.x9);
                if(v1 == 10) {
                    if(this.x9) {
                        if(v2 >= 0xFFFFFFFF80000000L) {
                            this.q9 = (int)v2;
                            this.p9 = 1;
                            return;
                        }
                    }
                    else if(v2 <= 0x7FFFFFFFL) {
                        this.q9 = (int)v2;
                        this.p9 = 1;
                        return;
                    }
                }
                this.r9 = v2;
                this.p9 = 2;
                return;
            }
            if(v1 == 19) {
                char[] arr_c = this.k9.D();
                int v3 = this.k9.E();
                boolean z = this.x9;
                if(z) {
                    ++v3;
                }
                if(l.b(arr_c, v3, 19, z)) {
                    this.r9 = l.x(arr_c, v3, this.x9);
                    this.p9 = 2;
                    return;
                }
            }
            this.M5(v);
            return;
        }
        if(r0 == r.s) {
            this.L5(v);
            return;
        }
        this.U4("Current token (%s) not numeric, can not use numeric value accessors", r0);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public byte[] L0(com.fasterxml.jackson.core.a a0) throws IOException {
        if(this.o9 == null) {
            if(this.h != r.q) {
                this.T4("Current token (" + this.h + ") not VALUE_STRING, can not access as binary");
            }
            com.fasterxml.jackson.core.util.c c0 = this.C5();
            this.N4(this.R2(), c0, a0);
            this.o9 = new byte[0];
        }
        return this.o9;
    }

    private void L5(int v) throws IOException {
        switch(v) {
            case 16: {
                this.v9 = null;
                this.w9 = this.k9.q();
                this.p9 = 16;
                return;
            }
            case 0x20: {
                this.s9 = 0.0f;
                this.w9 = this.k9.q();
                this.p9 = 0x20;
                return;
            }
            default: {
                this.t9 = 0.0;
                this.w9 = this.k9.q();
                this.p9 = 8;
            }
        }
    }

    private void M5(int v) throws IOException {
        String s = this.k9.q();
        if(v == 1 || v == 2) {
            this.P5(v, s);
        }
        if(v != 8 && v != 0x20) {
            this.u9 = null;
            this.w9 = s;
            this.p9 = 4;
            return;
        }
        this.w9 = s;
        this.p9 = 8;
    }

    protected void N5() throws IOException {
        this.k9.G();
        char[] arr_c = this.l9;
        if(arr_c != null) {
            this.l9 = null;
            this.X8.d0(arr_c);
        }
    }

    protected void O5(int v, char c) throws m {
        this.T4(String.format("Unexpected close marker \'%s\': expected \'%c\' (for %s starting at %s)", Character.valueOf(((char)v)), Character.valueOf(c), "root", this.b6().r(this.s5())));
    }

    @Override  // com.fasterxml.jackson.core.base.d
    protected void P4() throws m {
        if(!this.i9.n()) {
            this.Z4(String.format(": expected close marker for %s (start marker at %s)", (this.i9.l() ? "Array" : "Object"), this.i9.r(this.s5())), null);
        }
    }

    protected void P5(int v, String s) throws IOException {
        if(v == 1) {
            this.k5(s);
            return;
        }
        this.n5(s);
    }

    @Override  // com.fasterxml.jackson.core.n
    public int Q1() throws IOException {
        int v = this.p9;
        if((v & 1) == 0) {
            if(v == 0) {
                return this.J5();
            }
            if((v & 1) == 0) {
                this.X5();
            }
        }
        return this.q9;
    }

    protected void Q5(int v, String s) throws m {
        if(!this.a4(a.h) || v > 0x20) {
            this.T4("Illegal unquoted character (" + d.O4(((char)v)) + "): has to be escaped using backslash to be included in " + s);
        }
    }

    protected String R5() throws IOException {
        return this.S5();
    }

    // 去混淆评级： 低(20)
    protected String S5() throws IOException {
        return this.a4(a.n) ? "(JSON String, Number (or \'NaN\'/\'+INF\'/\'-INF\'), Array, Object or token \'null\', \'true\' or \'false\')" : "(JSON String, Number, Array, Object or token \'null\', \'true\' or \'false\')";
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public boolean T3() {
        r r0 = this.h;
        if(r0 == r.q) {
            return true;
        }
        return r0 == r.o ? this.m9 : false;
    }

    protected void T5() throws IOException {
        int v = this.p9;
        if((v & 8) != 0) {
            this.v9 = l.h((this.w9 == null ? this.R2() : this.w9), this.b4(z.i));
        }
        else if((v & 4) != 0) {
            this.v9 = new BigDecimal(this.B5());
        }
        else if((v & 2) != 0) {
            this.v9 = BigDecimal.valueOf(this.r9);
        }
        else if((v & 1) == 0) {
            this.f5();
        }
        else {
            this.v9 = BigDecimal.valueOf(this.q9);
        }
        this.p9 |= 16;
    }

    protected void U5() throws IOException {
        int v = this.p9;
        if((v & 16) != 0) {
            this.u9 = this.u5(this.A5());
        }
        else if((v & 2) != 0) {
            this.u9 = BigInteger.valueOf(this.r9);
        }
        else if((v & 1) != 0) {
            this.u9 = BigInteger.valueOf(this.q9);
        }
        else if((v & 8) == 0) {
            this.f5();
        }
        else if(this.w9 != null) {
            this.u9 = this.u5(this.A5());
        }
        else {
            this.u9 = this.u5(BigDecimal.valueOf(this.D5()));
        }
        this.p9 |= 4;
    }

    protected void V5() throws IOException {
        int v = this.p9;
        if((v & 16) == 0) {
            if((v & 4) == 0) {
                if((v & 2) != 0) {
                    this.t9 = (double)this.r9;
                }
                else if((v & 1) != 0) {
                    this.t9 = (double)this.q9;
                }
                else if((v & 0x20) == 0) {
                    this.f5();
                }
                else if(this.w9 != null) {
                    this.t9 = this.D5();
                }
                else {
                    this.t9 = (double)this.E5();
                }
            }
            else if(this.w9 != null) {
                this.t9 = this.D5();
            }
            else {
                this.t9 = this.B5().doubleValue();
            }
        }
        else if(this.w9 != null) {
            this.t9 = this.D5();
        }
        else {
            this.t9 = this.A5().doubleValue();
        }
        this.p9 |= 8;
    }

    protected void W5() throws IOException {
        int v = this.p9;
        if((v & 16) == 0) {
            if((v & 4) == 0) {
                if((v & 2) != 0) {
                    this.s9 = (float)this.r9;
                }
                else if((v & 1) != 0) {
                    this.s9 = (float)this.q9;
                }
                else if((v & 8) == 0) {
                    this.f5();
                }
                else if(this.w9 != null) {
                    this.s9 = this.E5();
                }
                else {
                    this.s9 = (float)this.D5();
                }
            }
            else if(this.w9 != null) {
                this.s9 = this.E5();
            }
            else {
                this.s9 = this.B5().floatValue();
            }
        }
        else if(this.w9 != null) {
            this.s9 = this.E5();
        }
        else {
            this.s9 = this.A5().floatValue();
        }
        this.p9 |= 0x20;
    }

    protected void X5() throws IOException {
        int v = this.p9;
        if((v & 2) != 0) {
            int v1 = (int)this.r9;
            if(((long)v1) != this.r9) {
                this.l5(this.R2(), this.Y());
            }
            this.q9 = v1;
        }
        else if((v & 4) != 0) {
            BigInteger bigInteger0 = this.B5();
            if(d.Q.compareTo(bigInteger0) > 0 || d.X.compareTo(bigInteger0) < 0) {
                this.j5();
            }
            this.q9 = bigInteger0.intValue();
        }
        else if((v & 8) != 0) {
            double f = this.D5();
            if(f < -2147483648.0 || f > 2147483647.0) {
                this.j5();
            }
            this.q9 = (int)f;
        }
        else if((v & 16) == 0) {
            this.f5();
        }
        else {
            BigDecimal bigDecimal0 = this.A5();
            if(d.O8.compareTo(bigDecimal0) > 0 || d.P8.compareTo(bigDecimal0) < 0) {
                this.j5();
            }
            this.q9 = bigDecimal0.intValue();
        }
        this.p9 |= 1;
    }

    protected void Y5() throws IOException {
        int v = this.p9;
        if((v & 1) != 0) {
            this.r9 = (long)this.q9;
        }
        else if((v & 4) != 0) {
            BigInteger bigInteger0 = this.B5();
            if(d.Y.compareTo(bigInteger0) > 0 || d.Z.compareTo(bigInteger0) < 0) {
                this.m5();
            }
            this.r9 = bigInteger0.longValue();
        }
        else if((v & 8) != 0) {
            double f = this.D5();
            if(f < -9223372036854776000.0 || f > 9223372036854776000.0) {
                this.m5();
            }
            this.r9 = (long)f;
        }
        else if((v & 16) == 0) {
            this.f5();
        }
        else {
            BigDecimal bigDecimal0 = this.A5();
            if(d.M8.compareTo(bigDecimal0) > 0 || d.N8.compareTo(bigDecimal0) < 0) {
                this.m5();
            }
            this.r9 = bigDecimal0.longValue();
        }
        this.p9 |= 2;
    }

    protected void Z5(int v, int v1) throws IOException {
        com.fasterxml.jackson.core.json.d d0 = this.i9.v(v, v1);
        this.i9 = d0;
        int v2 = d0.e();
        this.Y8.r(v2);
    }

    protected void a6(int v, int v1) throws IOException {
        com.fasterxml.jackson.core.json.d d0 = this.i9.w(v, v1);
        this.i9 = d0;
        this.Y8.r(d0.e());
    }

    @Override  // com.fasterxml.jackson.core.n
    public com.fasterxml.jackson.core.l b1() {
        return new com.fasterxml.jackson.core.l(this.s5(), -1L, ((long)this.a9) + this.c9, this.d9, this.a9 - this.e9 + 1);
    }

    public com.fasterxml.jackson.core.json.d b6() {
        return this.i9;
    }

    public long c6() {
        return this.f9;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public void close() throws IOException {
        if(!this.Z8) {
            try {
                this.a9 = Math.max(this.a9, this.b9);
                this.Z8 = true;
                this.r5();
            }
            finally {
                this.N5();
                this.X8.close();
            }
        }
    }

    public int d6() {
        return this.h9 < 0 ? this.h9 : this.h9 + 1;
    }

    @Override  // com.fasterxml.jackson.core.n
    public long e2() throws IOException {
        int v = this.p9;
        if((v & 2) == 0) {
            if(v == 0) {
                this.K5(2);
            }
            if((this.p9 & 2) == 0) {
                this.Y5();
            }
        }
        return this.r9;
    }

    public int e6() {
        return this.g9;
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean f4() throws IOException {
        return this.h != r.s || (this.p9 & 8) == 0 ? false : !com.fasterxml.jackson.core.base.b.a(this.D5());
    }

    protected static int[] f6(int[] arr_v, int v) throws IllegalArgumentException {
        if(arr_v == null) {
            return new int[v];
        }
        int v1 = arr_v.length + v;
        if(v1 < 0) {
            throw new IllegalArgumentException("Unable to grow array to longer than `Integer.MAX_VALUE`");
        }
        return Arrays.copyOf(arr_v, v1);
    }

    @Deprecated
    protected boolean g6() throws IOException [...] // Inlined contents

    @Override  // com.fasterxml.jackson.core.n
    public n h0(a n$a0) {
        this.a &= ~n$a0.d();
        if(n$a0 == a.q) {
            this.i9 = this.i9.E(null);
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object h1() {
        return this.i9.c();
    }

    @Deprecated
    protected void h6() throws IOException {
        this.X4();
    }

    @Override  // com.fasterxml.jackson.core.n
    public BigDecimal i1() throws IOException {
        int v = this.p9;
        if((v & 16) == 0) {
            if(v == 0) {
                this.K5(16);
            }
            if((this.p9 & 16) == 0) {
                this.T5();
            }
        }
        return this.A5();
    }

    @Override  // com.fasterxml.jackson.core.n
    public com.fasterxml.jackson.core.n.b i2() throws IOException {
        if(this.p9 == 0) {
            this.K5(0);
        }
        if(this.h == r.r) {
            int v = this.p9;
            if((v & 1) != 0) {
                return com.fasterxml.jackson.core.n.b.a;
            }
            return (v & 2) == 0 ? com.fasterxml.jackson.core.n.b.c : com.fasterxml.jackson.core.n.b.b;
        }
        int v1 = this.p9;
        if((v1 & 16) != 0) {
            return com.fasterxml.jackson.core.n.b.f;
        }
        return (v1 & 0x20) == 0 ? com.fasterxml.jackson.core.n.b.e : com.fasterxml.jackson.core.n.b.d;
    }

    @Override  // com.fasterxml.jackson.core.n
    public com.fasterxml.jackson.core.l i3() {
        return new com.fasterxml.jackson.core.l(this.s5(), -1L, this.c6(), this.e6(), this.d6());
    }

    protected IllegalArgumentException i6(com.fasterxml.jackson.core.a a0, int v, int v1) throws IllegalArgumentException {
        return this.j6(a0, v, v1, null);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public boolean isClosed() {
        return this.Z8;
    }

    @Override  // com.fasterxml.jackson.core.n
    public double j1() throws IOException {
        int v = this.p9;
        if((v & 8) == 0) {
            if(v == 0) {
                this.K5(8);
            }
            if((this.p9 & 8) == 0) {
                this.V5();
            }
        }
        return this.D5();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Number j2() throws IOException {
        if(this.p9 == 0) {
            this.K5(0);
        }
        if(this.h == r.r) {
            int v = this.p9;
            if((v & 1) != 0) {
                return this.q9;
            }
            if((v & 2) != 0) {
                return this.r9;
            }
            if((v & 4) != 0) {
                return this.B5();
            }
            this.f5();
        }
        int v1 = this.p9;
        if((v1 & 16) != 0) {
            return this.A5();
        }
        if((v1 & 0x20) != 0) {
            return this.E5();
        }
        if((v1 & 8) == 0) {
            this.f5();
        }
        return this.D5();
    }

    protected IllegalArgumentException j6(com.fasterxml.jackson.core.a a0, int v, int v1, String s) throws IllegalArgumentException {
        String s1;
        if(v <= 0x20) {
            s1 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(v), ((int)(v1 + 1)));
        }
        else if(a0.G(v)) {
            s1 = "Unexpected padding character (\'" + a0.y() + "\') as character #" + (v1 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        }
        else {
            s1 = !Character.isDefined(v) || Character.isISOControl(v) ? "Illegal character (code 0x" + Integer.toHexString(v) + ") in base64 content" : "Illegal character \'" + ((char)v) + "\' (code 0x" + Integer.toHexString(v) + ") in base64 content";
        }
        if(s != null) {
            s1 = s1 + ": " + s;
        }
        return new IllegalArgumentException(s1);
    }

    protected final r k6(boolean z, int v, int v1, int v2) throws IOException {
        return v1 >= 1 || v2 >= 1 ? this.m6(z, v, v1, v2) : this.n6(z, v);
    }

    @Override  // com.fasterxml.jackson.core.n
    public n l0(a n$a0) {
        this.a |= n$a0.d();
        if(n$a0 == a.q && this.i9.A() == null) {
            this.i9 = this.i9.E(b.g(this));
        }
        return this;
    }

    protected final r l6(String s, double f) throws IOException {
        this.k9.M(s);
        this.t9 = f;
        this.p9 = 8;
        return r.s;
    }

    protected final r m6(boolean z, int v, int v1, int v2) throws IOException {
        this.Y8.o(v + v1 + v2);
        this.x9 = z;
        this.y9 = v;
        this.z9 = v1;
        this.A9 = v2;
        this.p9 = 0;
        return r.s;
    }

    protected final r n6(boolean z, int v) throws IOException {
        this.Y8.p(v);
        this.x9 = z;
        this.y9 = v;
        this.z9 = 0;
        this.A9 = 0;
        this.p9 = 0;
        return r.r;
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object o2() throws IOException {
        if(this.h == r.r) {
            if(this.p9 == 0) {
                this.K5(0);
            }
            int v = this.p9;
            if((v & 1) != 0) {
                return this.q9;
            }
            if((v & 2) != 0) {
                return this.r9;
            }
            if((v & 4) != 0) {
                BigInteger bigInteger0 = this.u9;
                if(bigInteger0 != null) {
                    return bigInteger0;
                }
                String s = this.w9;
                return s != null ? s : this.B5();
            }
            this.f5();
        }
        if(this.h == r.s) {
            int v1 = this.p9;
            if((v1 & 16) != 0) {
                return this.A5();
            }
            if((v1 & 8) != 0) {
                return this.D5();
            }
            return (v1 & 0x20) != 0 ? this.E5() : this.k9.q();
        }
        return this.j2();
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public void o4(String s) {
        com.fasterxml.jackson.core.json.d d0 = this.h != r.k && this.h != r.m ? this.i9 : this.i9.B();
        try {
            d0.D(s);
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public Number p2() throws IOException {
        if(this.h == r.r) {
            if(this.p9 == 0) {
                this.K5(0);
            }
            int v = this.p9;
            if((v & 1) != 0) {
                return this.q9;
            }
            if((v & 2) != 0) {
                return this.r9;
            }
            if((v & 4) != 0) {
                return this.B5();
            }
            this.f5();
        }
        if(this.p9 == 0) {
            this.K5(16);
        }
        int v1 = this.p9;
        if((v1 & 16) != 0) {
            return this.A5();
        }
        if((v1 & 0x20) != 0) {
            return this.E5();
        }
        if((v1 & 8) == 0) {
            this.f5();
        }
        return this.D5();
    }

    @Override  // com.fasterxml.jackson.core.n
    public n q4(int v, int v1) {
        int v2 = v & v1 | ~v1 & this.a;
        int v3 = this.a ^ v2;
        if(v3 != 0) {
            this.a = v2;
            this.q5(v2, v3);
        }
        return this;
    }

    protected void q5(int v, int v1) {
        int v2 = a.q.d();
        if((v1 & v2) != 0 && (v & v2) != 0) {
            if(this.i9.A() == null) {
                this.i9 = this.i9.E(b.g(this));
                return;
            }
            this.i9 = this.i9.E(null);
        }
    }

    protected abstract void r5() throws IOException;

    // 去混淆评级： 低(20)
    protected e s5() {
        return a.s.c(this.a) ? this.X8.w() : this.t5();
    }

    protected e t5() {
        return e.x();
    }

    @Override  // com.fasterxml.jackson.core.n
    public float u1() throws IOException {
        int v = this.p9;
        if((v & 0x20) == 0) {
            if(v == 0) {
                this.K5(0x20);
            }
            if((this.p9 & 0x20) == 0) {
                this.W5();
            }
        }
        return this.E5();
    }

    protected BigInteger u5(BigDecimal bigDecimal0) throws IOException {
        int v = bigDecimal0.scale();
        this.Y8.m(v);
        return bigDecimal0.toBigInteger();
    }

    protected final int v5(com.fasterxml.jackson.core.a a0, char c, int v) throws IOException {
        if(c != 92) {
            throw this.i6(a0, ((int)c), v);
        }
        int v1 = this.x5();
        if(v1 <= 0x20 && v == 0) {
            return -1;
        }
        int v2 = a0.h(((char)v1));
        if(v2 < 0 && (v2 != -2 || v < 2)) {
            throw this.i6(a0, v1, v);
        }
        return v2;
    }

    @Override  // com.fasterxml.jackson.core.n
    public H version() {
        return h.a;
    }

    protected final int w5(com.fasterxml.jackson.core.a a0, int v, int v1) throws IOException {
        if(v != 92) {
            throw this.i6(a0, v, v1);
        }
        int v2 = this.x5();
        if(v2 <= 0x20 && v1 == 0) {
            return -1;
        }
        int v3 = a0.i(v2);
        if(v3 < 0 && v3 != -2) {
            throw this.i6(a0, v2, v1);
        }
        return v3;
    }

    @Override  // com.fasterxml.jackson.core.n
    public BigInteger x0() throws IOException {
        int v = this.p9;
        if((v & 4) == 0) {
            if(v == 0) {
                this.K5(4);
            }
            if((this.p9 & 4) == 0) {
                this.U5();
            }
        }
        return this.B5();
    }

    protected char x5() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String y0() throws IOException {
        if(this.h == r.k || this.h == r.m) {
            com.fasterxml.jackson.core.json.d d0 = this.i9.B();
            return d0 == null ? this.i9.b() : d0.b();
        }
        return this.i9.b();
    }

    protected final int y5() throws m {
        this.P4();
        return -1;
    }

    protected void z5() throws IOException {
    }
}

