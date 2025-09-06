package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.core.j;
import com.fasterxml.jackson.core.k.b;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.v;
import com.fasterxml.jackson.core.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class m extends c {
    protected final Writer F;
    protected char G;
    protected char[] H;
    protected int I;
    protected int J;
    protected int K;
    protected char[] L;
    protected w M;
    protected char[] N;
    protected static final int O = 0x20;
    protected static final char[] P;
    protected static final char[] Q;

    static {
        m.P = com.fasterxml.jackson.core.io.c.f(true);
        m.Q = com.fasterxml.jackson.core.io.c.f(false);
    }

    @Deprecated
    public m(g g0, int v, u u0, Writer writer0) {
        this(g0, v, u0, writer0, '\"');
    }

    public m(g g0, int v, u u0, Writer writer0, char c) {
        super(g0, v, u0);
        this.F = writer0;
        char[] arr_c = g0.i();
        this.H = arr_c;
        this.K = arr_c.length;
        this.G = c;
        if(c != 34) {
            this.x = com.fasterxml.jackson.core.io.c.h(c);
        }
    }

    private void A5(String s) throws IOException {
        int v = s.length();
        int v1 = this.K;
        if(v > v1) {
            this.o5(s);
            return;
        }
        if(this.J + v > v1) {
            this.e5();
        }
        if(this.z != null) {
            this.G5(v);
            return;
        }
        int v2 = this.y;
        if(v2 != 0) {
            this.E5(v, v2);
            return;
        }
        this.C5(v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void B4(Object object0) throws IOException {
        this.X4("start an array");
        this.i = this.i.w(object0);
        this.g2().h(this.i.e());
        v v0 = this.a;
        if(v0 != null) {
            v0.f(this);
            return;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = '[';
    }

    private void B5(char[] arr_c, int v, int v1) throws IOException {
        if(this.z != null) {
            this.H5(arr_c, v, v1);
            return;
        }
        int v2 = this.y;
        if(v2 != 0) {
            this.F5(arr_c, v, v1, v2);
            return;
        }
        int v3 = v1 + v;
        int[] arr_v = this.x;
        while(v < v3) {
            int v4 = v;
            do {
                int v5 = arr_c[v4];
                if(v5 < arr_v.length && arr_v[v5] != 0) {
                    break;
                }
                ++v4;
            }
            while(v4 < v3);
            int v6 = v4 - v;
            if(v6 < 0x20) {
                if(this.J + v6 > this.K) {
                    this.e5();
                }
                if(v6 > 0) {
                    System.arraycopy(arr_c, v, this.H, this.J, v6);
                    this.J += v6;
                }
            }
            else {
                this.e5();
                this.F.write(arr_c, v, v6);
            }
            if(v4 >= v3) {
                break;
            }
            v = v4 + 1;
            int v7 = arr_c[v4];
            this.d5(((char)v7), arr_v[v7]);
        }
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public int C2(a a0, InputStream inputStream0, int v) throws IOException, j {
        this.X4("write a binary value");
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = this.G;
        byte[] arr_b = this.g.e();
        try {
            if(v < 0) {
                v = this.i5(a0, inputStream0, arr_b);
            }
            else {
                int v3 = this.j5(a0, inputStream0, arr_b, v);
                if(v3 > 0) {
                    this.i("Too few bytes available: missing " + v3 + " bytes (out of " + v + ")");
                }
            }
        }
        finally {
            this.g.T(arr_b);
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v4 = this.J;
        this.J = v4 + 1;
        this.H[v4] = this.G;
        return v;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void C3(double f) throws IOException {
        if(!this.h && (!n.o(f) || !this.d1(b.g))) {
            this.X4("write a number");
            this.r4(n.v(f, this.d1(b.m)));
            return;
        }
        this.d(n.v(f, this.d1(b.m)));
    }

    @Override  // com.fasterxml.jackson.core.k
    public void C4(Object object0, int v) throws IOException {
        this.X4("start an array");
        this.i = this.i.w(object0);
        this.g2().h(this.i.e());
        v v1 = this.a;
        if(v1 != null) {
            v1.f(this);
            return;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v2 = this.J;
        this.J = v2 + 1;
        this.H[v2] = '[';
    }

    private void C5(int v) throws IOException {
        int v1 = this.J + v;
        int[] arr_v = this.x;
        while(this.J < v1) {
        label_3:
            char[] arr_c = this.H;
            int v2 = this.J;
            int v3 = arr_c[v2];
            if(v3 < arr_v.length && arr_v[v3] != 0) {
                int v4 = this.I;
                int v5 = v2 - v4;
                if(v5 > 0) {
                    this.F.write(arr_c, v4, v5);
                }
                int v6 = this.J;
                this.J = v6 + 1;
                int v7 = this.H[v6];
                this.g5(((char)v7), arr_v[v7]);
                continue;
            }
            this.J = v2 + 1;
            if(v2 + 1 >= v1) {
                break;
            }
            goto label_3;
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void D4() throws IOException {
        this.X4("start an object");
        this.i = this.i.x();
        this.g2().h(this.i.e());
        v v0 = this.a;
        if(v0 != null) {
            v0.g(this);
            return;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = '{';
    }

    private void D5(w w0) throws IOException {
        char[] arr_c = w0.c();
        if(arr_c.length < 0x20) {
            if(arr_c.length > this.K - this.J) {
                this.e5();
            }
            System.arraycopy(arr_c, 0, this.H, this.J, arr_c.length);
            this.J += arr_c.length;
        }
        else {
            this.e5();
            this.F.write(arr_c, 0, arr_c.length);
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v = this.J;
        this.J = v + 1;
        this.H[v] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void E3(float f) throws IOException {
        if(!this.h && (!n.p(f) || !this.d1(b.g))) {
            this.X4("write a number");
            this.r4(n.x(f, this.d1(b.m)));
            return;
        }
        this.d(n.x(f, this.d1(b.m)));
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public void E4(Object object0) throws IOException {
        this.X4("start an object");
        f f0 = this.i.y(object0);
        this.g2().h(this.i.e());
        this.i = f0;
        v v0 = this.a;
        if(v0 != null) {
            v0.g(this);
            return;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = '{';
    }

    private void E5(int v, int v1) throws IOException, j {
        int v6;
        int v2 = this.J + v;
        int[] arr_v = this.x;
        int v3 = Math.min(arr_v.length, v1 + 1);
        while(this.J < v2) {
        label_4:
            char[] arr_c = this.H;
            int v4 = this.J;
            int v5 = arr_c[v4];
            if(v5 < v3) {
                v6 = arr_v[v5];
                if(v6 == 0) {
                    goto label_20;
                }
                else {
                    goto label_13;
                }
                goto label_11;
            }
            else {
            label_11:
                if(v5 > v1) {
                    v6 = -1;
                }
                else {
                    goto label_20;
                }
            }
        label_13:
            int v7 = this.I;
            int v8 = v4 - v7;
            if(v8 > 0) {
                this.F.write(arr_c, v7, v8);
            }
            ++this.J;
            this.g5(((char)v5), v6);
            continue;
        label_20:
            this.J = v4 + 1;
            if(v4 + 1 >= v2) {
                break;
            }
            goto label_4;
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void F3(int v) throws IOException {
        this.X4("write a number");
        if(this.h) {
            this.s5(v);
            return;
        }
        if(this.J + 11 >= this.K) {
            this.e5();
        }
        this.J = n.r(v, this.H, this.J);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void F4(Object object0, int v) throws IOException {
        this.E4(object0);
    }

    private void F5(char[] arr_c, int v, int v1, int v2) throws IOException, j {
        int v7;
        int v3 = v1 + v;
        int[] arr_v = this.x;
        int v4 = Math.min(arr_v.length, v2 + 1);
        int v5 = 0;
        while(v < v3) {
            int v6 = v;
            do {
                v7 = arr_c[v6];
                if(v7 < v4) {
                    v5 = arr_v[v7];
                    if(v5 != 0) {
                        break;
                    }
                }
                else if(v7 > v2) {
                    v5 = -1;
                    break;
                }
                ++v6;
            }
            while(v6 < v3);
            int v8 = v6 - v;
            if(v8 < 0x20) {
                if(this.J + v8 > this.K) {
                    this.e5();
                }
                if(v8 > 0) {
                    System.arraycopy(arr_c, v, this.H, this.J, v8);
                    this.J += v8;
                }
            }
            else {
                this.e5();
                this.F.write(arr_c, v, v8);
            }
            if(v6 >= v3) {
                break;
            }
            v = v6 + 1;
            this.d5(((char)v7), v5);
        }
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public void G4(w w0) throws IOException {
        this.X4("write a string");
        if(this.J >= this.K) {
            this.e5();
        }
        char[] arr_c = this.H;
        int v = this.J;
        this.J = v + 1;
        arr_c[v] = this.G;
        int v1 = w0.i(arr_c, v + 1);
        if(v1 < 0) {
            this.D5(w0);
            return;
        }
        int v2 = this.J + v1;
        this.J = v2;
        if(v2 >= this.K) {
            this.e5();
        }
        int v3 = this.J;
        this.J = v3 + 1;
        this.H[v3] = this.G;
    }

    private void G5(int v) throws IOException, j {
        int v5;
        int v1 = this.J + v;
        int[] arr_v = this.x;
        int v2 = this.y >= 1 ? this.y : 0xFFFF;
        int v3 = Math.min(arr_v.length, v2 + 1);
        d d0 = this.z;
        while(this.J < v1) {
        label_6:
            int v4 = this.H[this.J];
            if(v4 < v3) {
                v5 = arr_v[v4];
                if(v5 == 0) {
                    goto label_25;
                }
                else {
                    goto label_18;
                }
                goto label_11;
            }
            else {
            label_11:
                if(v4 > v2) {
                    v5 = -1;
                }
                else {
                    w w0 = d0.b(v4);
                    this.M = w0;
                    if(w0 == null) {
                        goto label_25;
                    }
                    else {
                        v5 = -2;
                    }
                }
            }
        label_18:
            int v6 = this.I;
            int v7 = this.J - v6;
            if(v7 > 0) {
                this.F.write(this.H, v6, v7);
            }
            ++this.J;
            this.g5(((char)v4), v5);
            continue;
        label_25:
            int v8 = this.J + 1;
            this.J = v8;
            if(v8 >= v1) {
                break;
            }
            goto label_6;
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void H4(Reader reader0, int v) throws IOException {
        this.X4("write a string");
        if(reader0 == null) {
            this.i("null reader");
            return;
        }
        int v1 = v < 0 ? 0x7FFFFFFF : v;
        if(this.J >= this.K) {
            this.e5();
        }
        int v2 = this.J;
        this.J = v2 + 1;
        this.H[v2] = this.G;
        char[] arr_c = this.b5();
        while(v1 > 0) {
            int v3 = reader0.read(arr_c, 0, Math.min(v1, arr_c.length));
            if(v3 <= 0) {
                break;
            }
            this.B5(arr_c, 0, v3);
            v1 -= v3;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v4 = this.J;
        this.J = v4 + 1;
        this.H[v4] = this.G;
        if(v1 > 0 && v >= 0) {
            this.i("Didn\'t read enough from reader");
        }
    }

    private void H5(char[] arr_c, int v, int v1) throws IOException, j {
        int v7;
        int v2 = v1 + v;
        int[] arr_v = this.x;
        int v3 = this.y >= 1 ? this.y : 0xFFFF;
        int v4 = Math.min(arr_v.length, v3 + 1);
        d d0 = this.z;
        int v5 = 0;
        while(v < v2) {
            int v6 = v;
            do {
                v7 = arr_c[v6];
                if(v7 < v4) {
                    v5 = arr_v[v7];
                    if(v5 != 0) {
                        break;
                    }
                }
                else if(v7 > v3) {
                    v5 = -1;
                    break;
                }
                else {
                    w w0 = d0.b(v7);
                    this.M = w0;
                    if(w0 != null) {
                        v5 = -2;
                        break;
                    }
                }
                ++v6;
            }
            while(v6 < v2);
            int v8 = v6 - v;
            if(v8 < 0x20) {
                if(this.J + v8 > this.K) {
                    this.e5();
                }
                if(v8 > 0) {
                    System.arraycopy(arr_c, v, this.H, this.J, v8);
                    this.J += v8;
                }
            }
            else {
                this.e5();
                this.F.write(arr_c, v, v8);
            }
            if(v6 >= v2) {
                break;
            }
            v = v6 + 1;
            this.d5(((char)v7), v5);
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void I4(char[] arr_c, int v, int v1) throws IOException {
        this.X4("write a string");
        if(this.J >= this.K) {
            this.e5();
        }
        int v2 = this.J;
        this.J = v2 + 1;
        this.H[v2] = this.G;
        this.B5(arr_c, v, v1);
        if(this.J >= this.K) {
            this.e5();
        }
        int v3 = this.J;
        this.J = v3 + 1;
        this.H[v3] = this.G;
    }

    // 去混淆评级： 低(20)
    private char[] I5() {
        return this.C ? m.P : m.Q;
    }

    private void J5(String s) throws IOException {
        int v = this.K - this.J;
        s.getChars(0, v, this.H, this.J);
        this.J += v;
        this.e5();
        int v1 = s.length() - v;
        while(true) {
            int v2 = this.K;
            if(v1 <= v2) {
                break;
            }
            this.I = 0;
            this.J = v2;
            this.e5();
            v1 -= v2;
            v += v2;
        }
        this.I = 0;
        this.J = v1;
    }

    @Override  // com.fasterxml.jackson.core.k
    public int L0() {
        return Math.max(0, this.J - this.I);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void L2(a a0, byte[] arr_b, int v, int v1) throws IOException, j {
        this.Q4(arr_b, v, v1);
        this.X4("write a binary value");
        if(this.J >= this.K) {
            this.e5();
        }
        int v2 = this.J;
        this.J = v2 + 1;
        this.H[v2] = this.G;
        this.k5(a0, arr_b, v, v1 + v);
        if(this.J >= this.K) {
            this.e5();
        }
        int v3 = this.J;
        this.J = v3 + 1;
        this.H[v3] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void N3(long v) throws IOException {
        this.X4("write a number");
        if(this.h) {
            this.t5(v);
            return;
        }
        if(this.J + 21 >= this.K) {
            this.e5();
        }
        this.J = n.t(v, this.H, this.J);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void O4(byte[] arr_b, int v, int v1) throws IOException {
        this.j();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void S3(String s) throws IOException {
        this.X4("write a number");
        if(s == null) {
            this.p5();
            return;
        }
        if(this.h) {
            this.u5(s);
            return;
        }
        this.r4(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void T3(BigDecimal bigDecimal0) throws IOException {
        this.X4("write a number");
        if(bigDecimal0 == null) {
            this.p5();
            return;
        }
        if(this.h) {
            this.u5(this.P4(bigDecimal0));
            return;
        }
        this.r4(this.P4(bigDecimal0));
    }

    @Override  // com.fasterxml.jackson.core.base.a
    protected void W4() {
        char[] arr_c = this.H;
        if(arr_c != null) {
            this.H = null;
            this.g.Y(arr_c);
        }
        char[] arr_c1 = this.N;
        if(arr_c1 != null) {
            this.N = null;
            this.g.d0(arr_c1);
        }
    }

    @Override  // com.fasterxml.jackson.core.base.a
    protected final void X4(String s) throws IOException {
        char c;
        int v = this.i.H();
        if(this.a != null) {
            this.Z4(s, v);
            return;
        }
        switch(v) {
            case 1: {
                c = ',';
                break;
            }
            case 2: {
                c = ':';
                break;
            }
            case 3: {
                w w0 = this.A;
                if(w0 != null) {
                    this.r4(w0.getValue());
                }
                return;
            }
            case 5: {
                this.Y4(s);
                return;
            }
            default: {
                return;
            }
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = c;
    }

    @Override  // com.fasterxml.jackson.core.k
    public Object Y0() {
        return this.F;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void Y3(BigInteger bigInteger0) throws IOException {
        this.X4("write a number");
        if(bigInteger0 == null) {
            this.p5();
            return;
        }
        if(this.h) {
            this.u5(bigInteger0.toString());
            return;
        }
        this.r4(bigInteger0.toString());
    }

    @Override  // com.fasterxml.jackson.core.k
    public void Z3(short v) throws IOException {
        this.X4("write a number");
        if(this.h) {
            this.w5(v);
            return;
        }
        if(this.J + 6 >= this.K) {
            this.e5();
        }
        this.J = n.r(v, this.H, this.J);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void a4(char[] arr_c, int v, int v1) throws IOException {
        this.X4("write a number");
        if(this.h) {
            this.v5(arr_c, v, v1);
            return;
        }
        this.t4(arr_c, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void b3(boolean z) throws IOException {
        int v1;
        this.X4("write a boolean value");
        if(this.J + 5 >= this.K) {
            this.e5();
        }
        int v = this.J;
        char[] arr_c = this.H;
        if(z) {
            arr_c[v] = 't';
            arr_c[v + 1] = 'r';
            arr_c[v + 2] = 'u';
            v1 = v + 3;
        }
        else {
            arr_c[v] = 'f';
            arr_c[v + 1] = 'a';
            arr_c[v + 2] = 'l';
            arr_c[v + 3] = 's';
            v1 = v + 4;
        }
        arr_c[v1] = 'e';
        this.J = v1 + 1;
    }

    private char[] b5() {
        if(this.N == null) {
            this.N = this.g.j(2000);
        }
        return this.N;
    }

    private char[] c5() {
        char[] arr_c = {'\\', '\u0000', '\\', 'u', '0', '0', '\u0000', '\u0000', '\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        this.L = arr_c;
        return arr_c;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public void close() throws IOException {
        super.close();
        try {
            if(this.H != null && this.d1(b.d)) {
                while(true) {
                    q q0 = this.T0();
                    if(q0.l()) {
                        this.n3();
                    }
                    else {
                        if(!q0.m()) {
                            break;
                        }
                        this.p3();
                    }
                }
            }
            this.e5();
            iOException0 = null;
        }
        catch(IOException iOException0) {
        }
        this.I = 0;
        this.J = 0;
        if(this.F != null) {
            try {
                if(this.g.R() || this.d1(b.c)) {
                    this.F.close();
                    goto label_26;
                label_23:
                    if(iOException0 == null) {
                        throw iOException1;
                    }
                    goto label_24;
                }
                else if(this.d1(b.e)) {
                    this.F.flush();
                }
                goto label_26;
            }
            catch(IOException | RuntimeException iOException1) {
                goto label_23;
            }
        label_24:
            iOException1.addSuppressed(iOException0);
            throw iOException1;
        }
    label_26:
        this.W4();
        if(iOException0 != null) {
            throw iOException0;
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void d(String s) throws IOException {
        this.X4("write a string");
        if(s == null) {
            this.p5();
            return;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v = this.J;
        this.J = v + 1;
        this.H[v] = this.G;
        this.A5(s);
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = this.G;
    }

    private void d5(char c, int v) throws IOException, j {
        String s;
        int v3;
        if(v >= 0) {
            if(this.J + 2 > this.K) {
                this.e5();
            }
            char[] arr_c = this.H;
            int v1 = this.J;
            this.J = v1 + 1;
            arr_c[v1] = '\\';
            this.J = v1 + 2;
            arr_c[v1 + 1] = (char)v;
            return;
        }
        if(v != -2) {
            if(this.J + 5 >= this.K) {
                this.e5();
            }
            int v2 = this.J;
            char[] arr_c1 = this.H;
            char[] arr_c2 = this.I5();
            arr_c1[v2] = '\\';
            arr_c1[v2 + 1] = 'u';
            if(c > 0xFF) {
                arr_c1[v2 + 2] = arr_c2[(c >> 8 & 0xFF) >> 4];
                v3 = v2 + 4;
                arr_c1[v2 + 3] = arr_c2[c >> 8 & 15];
                c = (char)(c & 0xFF);
            }
            else {
                arr_c1[v2 + 2] = '0';
                v3 = v2 + 4;
                arr_c1[v2 + 3] = '0';
            }
            arr_c1[v3] = arr_c2[c >> 4];
            arr_c1[v3 + 1] = arr_c2[c & 15];
            this.J = v3 + 2;
            return;
        }
        w w0 = this.M;
        if(w0 == null) {
            s = this.z.b(((int)c)).getValue();
        }
        else {
            s = w0.getValue();
            this.M = null;
        }
        int v4 = s.length();
        if(this.J + v4 > this.K) {
            this.e5();
            if(v4 > this.K) {
                this.F.write(s);
                return;
            }
        }
        this.J += v4;
    }

    protected void e5() throws IOException {
        int v = this.I;
        int v1 = this.J - v;
        if(v1 > 0) {
            this.I = 0;
            this.J = 0;
            this.F.write(this.H, v, v1);
        }
    }

    private int f5(char[] arr_c, int v, int v1, char c, int v2) throws IOException, j {
        String s;
        int v3;
        if(v2 >= 0) {
            if(v > 1 && v < v1) {
                arr_c[v - 2] = '\\';
                arr_c[v - 1] = (char)v2;
                return v - 2;
            }
            char[] arr_c1 = this.L == null ? this.c5() : this.L;
            arr_c1[1] = (char)v2;
            this.F.write(arr_c1, 0, 2);
            return v;
        }
        if(v2 != -2) {
            char[] arr_c2 = this.I5();
            if(v > 5 && v < v1) {
                arr_c[v - 6] = '\\';
                arr_c[v - 5] = 'u';
                if(c > 0xFF) {
                    arr_c[v - 4] = arr_c2[(c >> 8 & 0xFF) >> 4];
                    v3 = v - 2;
                    arr_c[v - 3] = arr_c2[c >> 8 & 15];
                    c = (char)(c & 0xFF);
                }
                else {
                    arr_c[v - 4] = '0';
                    v3 = v - 2;
                    arr_c[v - 3] = '0';
                }
                arr_c[v3] = arr_c2[c >> 4];
                arr_c[v3 + 1] = arr_c2[c & 15];
                return v3 - 4;
            }
            char[] arr_c3 = this.L == null ? this.c5() : this.L;
            this.I = this.J;
            if(c > 0xFF) {
                arr_c3[10] = arr_c2[(c >> 8 & 0xFF) >> 4];
                arr_c3[11] = arr_c2[c >> 8 & 15];
                arr_c3[12] = arr_c2[(c & 0xFF) >> 4];
                arr_c3[13] = arr_c2[c & 15];
                this.F.write(arr_c3, 8, 6);
                return v;
            }
            arr_c3[6] = arr_c2[c >> 4];
            arr_c3[7] = arr_c2[c & 15];
            this.F.write(arr_c3, 2, 6);
            return v;
        }
        w w0 = this.M;
        if(w0 == null) {
            s = this.z.b(((int)c)).getValue();
        }
        else {
            s = w0.getValue();
            this.M = null;
        }
        int v4 = s.length();
        if(v >= v4 && v < v1) {
            return v - v4;
        }
        this.F.write(s);
        return v;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public void flush() throws IOException {
        this.e5();
        if(this.F != null && this.d1(b.e)) {
            this.F.flush();
        }
    }

    private void g5(char c, int v) throws IOException, j {
        String s;
        int v3;
        if(v >= 0) {
            int v1 = this.J;
            if(v1 >= 2) {
                this.I = v1 - 2;
                char[] arr_c = this.H;
                arr_c[v1 - 2] = '\\';
                arr_c[v1 - 1] = (char)v;
                return;
            }
            char[] arr_c1 = this.L == null ? this.c5() : this.L;
            this.I = this.J;
            arr_c1[1] = (char)v;
            this.F.write(arr_c1, 0, 2);
            return;
        }
        if(v != -2) {
            char[] arr_c2 = this.I5();
            int v2 = this.J;
            if(v2 >= 6) {
                char[] arr_c3 = this.H;
                this.I = v2 - 6;
                arr_c3[v2 - 6] = '\\';
                arr_c3[v2 - 5] = 'u';
                if(c > 0xFF) {
                    arr_c3[v2 - 4] = arr_c2[(c >> 8 & 0xFF) >> 4];
                    v3 = v2 - 3;
                    arr_c3[v3] = arr_c2[c >> 8 & 15];
                    c = (char)(c & 0xFF);
                }
                else {
                    arr_c3[v2 - 4] = '0';
                    v3 = v2 - 3;
                    arr_c3[v3] = '0';
                }
                arr_c3[v3 + 1] = arr_c2[c >> 4];
                arr_c3[v3 + 2] = arr_c2[c & 15];
                return;
            }
            char[] arr_c4 = this.L == null ? this.c5() : this.L;
            this.I = this.J;
            if(c > 0xFF) {
                arr_c4[10] = arr_c2[(c >> 8 & 0xFF) >> 4];
                arr_c4[11] = arr_c2[c >> 8 & 15];
                arr_c4[12] = arr_c2[(c & 0xFF) >> 4];
                arr_c4[13] = arr_c2[c & 15];
                this.F.write(arr_c4, 8, 6);
                return;
            }
            arr_c4[6] = arr_c2[c >> 4];
            arr_c4[7] = arr_c2[c & 15];
            this.F.write(arr_c4, 2, 6);
            return;
        }
        w w0 = this.M;
        if(w0 == null) {
            s = this.z.b(((int)c)).getValue();
        }
        else {
            s = w0.getValue();
            this.M = null;
        }
        int v4 = s.length();
        int v5 = this.J;
        if(v5 >= v4) {
            this.I = v5 - v4;
            return;
        }
        this.I = v5;
        this.F.write(s);
    }

    private int h5(InputStream inputStream0, byte[] arr_b, int v, int v1, int v2) throws IOException {
        int v3 = 0;
        while(v < v1) {
            arr_b[v3] = arr_b[v];
            ++v3;
            ++v;
        }
        int v4 = Math.min(v2, arr_b.length);
        do {
            int v5 = v4 - v3;
            if(v5 == 0) {
                break;
            }
            int v6 = inputStream0.read(arr_b, v3, v5);
            if(v6 < 0) {
                return v3;
            }
            v3 += v6;
        }
        while(v3 < 3);
        return v3;
    }

    protected final int i5(a a0, InputStream inputStream0, byte[] arr_b) throws IOException, j {
        int v = this.K - 6;
        int v1 = 2;
        int v2 = -3;
        int v3 = a0.w() >> 2;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        while(true) {
            if(v4 > v2) {
                v5 = this.h5(inputStream0, arr_b, v4, v5, arr_b.length);
                if(v5 < 3) {
                    break;
                }
                v2 = v5 - 3;
                v4 = 0;
            }
            if(this.J > v) {
                this.e5();
            }
            int v7 = v4 + 2;
            int v8 = (arr_b[v4 + 1] & 0xFF | arr_b[v4] << 8) << 8;
            v4 += 3;
            v6 += 3;
            int v9 = a0.p(v8 | arr_b[v7] & 0xFF, this.H, this.J);
            this.J = v9;
            if(v3 - 1 > 0) {
                --v3;
            }
            else {
                char[] arr_c = this.H;
                this.J = v9 + 1;
                arr_c[v9] = '\\';
                this.J = v9 + 2;
                arr_c[v9 + 1] = 'n';
                v3 = a0.w() >> 2;
            }
        }
        if(v5 > 0) {
            if(this.J > v) {
                this.e5();
            }
            int v10 = arr_b[0] << 16;
            if(1 < v5) {
                v10 |= (arr_b[1] & 0xFF) << 8;
            }
            else {
                v1 = 1;
            }
            v6 += v1;
            this.J = a0.s(v10, v1, this.H, this.J);
        }
        return v6;
    }

    protected final int j5(a a0, InputStream inputStream0, byte[] arr_b, int v) throws IOException, j {
        int v1 = this.K - 6;
        int v2 = 2;
        int v3 = -3;
        int v4 = v;
        int v5 = a0.w() >> 2;
        int v6 = 0;
        int v7 = 0;
        while(v4 > 2) {
            if(v6 > v3) {
                v7 = this.h5(inputStream0, arr_b, v6, v7, v4);
                if(v7 < 3) {
                    v6 = 0;
                    break;
                }
                v3 = v7 - 3;
                v6 = 0;
            }
            if(this.J > v1) {
                this.e5();
            }
            int v8 = v6 + 2;
            int v9 = (arr_b[v6 + 1] & 0xFF | arr_b[v6] << 8) << 8;
            v6 += 3;
            v4 -= 3;
            int v10 = a0.p(v9 | arr_b[v8] & 0xFF, this.H, this.J);
            this.J = v10;
            if(v5 - 1 > 0) {
                --v5;
            }
            else {
                char[] arr_c = this.H;
                this.J = v10 + 1;
                arr_c[v10] = '\\';
                this.J = v10 + 2;
                arr_c[v10 + 1] = 'n';
                v5 = a0.w() >> 2;
            }
        }
        if(v4 > 0) {
            int v11 = this.h5(inputStream0, arr_b, v6, v7, v4);
            if(v11 > 0) {
                if(this.J > v1) {
                    this.e5();
                }
                int v12 = arr_b[0] << 16;
                if(1 < v11) {
                    v12 |= (arr_b[1] & 0xFF) << 8;
                }
                else {
                    v2 = 1;
                }
                this.J = a0.s(v12, v2, this.H, this.J);
                return v4 - v2;
            }
        }
        return v4;
    }

    protected final void k5(a a0, byte[] arr_b, int v, int v1) throws IOException, j {
        int v2 = this.K - 6;
        int v3 = a0.w();
    alab1:
        while(true) {
            for(int v4 = v3 >> 2; true; --v4) {
                if(v > v1 - 3) {
                    break alab1;
                }
                if(this.J > v2) {
                    this.e5();
                }
                int v5 = v + 2;
                int v6 = (arr_b[v + 1] & 0xFF | arr_b[v] << 8) << 8;
                v += 3;
                int v7 = a0.p(v6 | arr_b[v5] & 0xFF, this.H, this.J);
                this.J = v7;
                if(v4 - 1 <= 0) {
                    char[] arr_c = this.H;
                    this.J = v7 + 1;
                    arr_c[v7] = '\\';
                    this.J = v7 + 2;
                    arr_c[v7 + 1] = 'n';
                    v3 = a0.w();
                    break;
                }
            }
        }
        int v8 = v1 - v;
        if(v8 > 0) {
            if(this.J > v2) {
                this.e5();
            }
            int v9 = arr_b[v] << 16;
            if(v8 == 2) {
                v9 |= (arr_b[v + 1] & 0xFF) << 8;
            }
            this.J = a0.s(v9, v8, this.H, this.J);
        }
    }

    protected final void l5(w w0, boolean z) throws IOException {
        if(this.a != null) {
            this.q5(w0, z);
            return;
        }
        if(this.J + 1 >= this.K) {
            this.e5();
        }
        if(z) {
            int v = this.J;
            this.J = v + 1;
            this.H[v] = ',';
        }
        if(this.B) {
            char[] arr_c = w0.c();
            this.t4(arr_c, 0, arr_c.length);
            return;
        }
        char[] arr_c1 = this.H;
        int v1 = this.J;
        this.J = v1 + 1;
        arr_c1[v1] = this.G;
        int v2 = w0.i(arr_c1, v1 + 1);
        if(v2 < 0) {
            this.n5(w0);
            return;
        }
        int v3 = this.J + v2;
        this.J = v3;
        if(v3 >= this.K) {
            this.e5();
        }
        int v4 = this.J;
        this.J = v4 + 1;
        this.H[v4] = this.G;
    }

    protected final void m5(String s, boolean z) throws IOException {
        if(this.a != null) {
            this.r5(s, z);
            return;
        }
        if(this.J + 1 >= this.K) {
            this.e5();
        }
        if(z) {
            int v = this.J;
            this.J = v + 1;
            this.H[v] = ',';
        }
        if(this.B) {
            this.A5(s);
            return;
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = this.G;
        this.A5(s);
        if(this.J >= this.K) {
            this.e5();
        }
        int v2 = this.J;
        this.J = v2 + 1;
        this.H[v2] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void n3() throws IOException {
        if(!this.i.l()) {
            this.i("Current context not Array but root");
        }
        v v0 = this.a;
        if(v0 == null) {
            if(this.J >= this.K) {
                this.e5();
            }
            int v1 = this.J;
            this.J = v1 + 1;
            this.H[v1] = ']';
        }
        else {
            v0.d(this, this.i.d());
        }
        this.i = this.i.u();
    }

    private final void n5(w w0) throws IOException {
        char[] arr_c = w0.c();
        this.t4(arr_c, 0, arr_c.length);
        if(this.J >= this.K) {
            this.e5();
        }
        int v = this.J;
        this.J = v + 1;
        this.H[v] = this.G;
    }

    private void o5(String s) throws IOException {
        this.e5();
        int v = s.length();
        for(int v1 = 0; true; v1 = v3) {
            int v2 = v1 + this.K <= v ? this.K : v - v1;
            int v3 = v1 + v2;
            if(this.z == null) {
                int v4 = this.y;
                if(v4 == 0) {
                    this.x5(v2);
                }
                else {
                    this.y5(v2, v4);
                }
            }
            else {
                this.z5(v2);
            }
            if(v3 >= v) {
                break;
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void p3() throws IOException {
        if(!this.i.m()) {
            this.i("Current context not Object but root");
        }
        v v0 = this.a;
        if(v0 == null) {
            if(this.J >= this.K) {
                this.e5();
            }
            int v1 = this.J;
            this.J = v1 + 1;
            this.H[v1] = '}';
        }
        else {
            v0.k(this, this.i.d());
        }
        this.i = this.i.u();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void p4(char c) throws IOException {
        if(this.J >= this.K) {
            this.e5();
        }
        int v = this.J;
        this.J = v + 1;
        this.H[v] = c;
    }

    private final void p5() throws IOException {
        if(this.J + 4 >= this.K) {
            this.e5();
        }
        int v = this.J;
        char[] arr_c = this.H;
        arr_c[v] = 'n';
        arr_c[v + 1] = 'u';
        arr_c[v + 2] = 'l';
        arr_c[v + 3] = 'l';
        this.J = v + 4;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void q4(w w0) throws IOException {
        int v = w0.f(this.H, this.J);
        if(v < 0) {
            this.r4(w0.getValue());
            return;
        }
        this.J += v;
    }

    protected final void q5(w w0, boolean z) throws IOException {
        if(z) {
            this.a.i(this);
        }
        else {
            this.a.c(this);
        }
        char[] arr_c = w0.c();
        if(this.B) {
            this.t4(arr_c, 0, arr_c.length);
            return;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v = this.J;
        this.J = v + 1;
        this.H[v] = this.G;
        this.t4(arr_c, 0, arr_c.length);
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void r4(String s) throws IOException {
        int v = s.length();
        int v1 = this.K - this.J;
        if(v1 == 0) {
            this.e5();
            v1 = this.K - this.J;
        }
        if(v1 >= v) {
            this.J += v;
            return;
        }
        this.J5(s);
    }

    protected final void r5(String s, boolean z) throws IOException {
        if(z) {
            this.a.i(this);
        }
        else {
            this.a.c(this);
        }
        if(this.B) {
            this.A5(s);
            return;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v = this.J;
        this.J = v + 1;
        this.H[v] = this.G;
        this.A5(s);
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public void s3(w w0) throws IOException {
        int v = this.i.G(w0.getValue());
        if(v == 4) {
            this.i("Can not write a field name, expecting a value");
        }
        this.l5(w0, v == 1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void s4(String s, int v, int v1) throws IOException {
        this.S4(s, v, v1);
        int v2 = this.K - this.J;
        if(v2 < v1) {
            this.e5();
            v2 = this.K - this.J;
        }
        if(v2 >= v1) {
            s.getChars(v, v + v1, this.H, this.J);
            this.J += v1;
            return;
        }
        this.J5(s.substring(v, v1 + v));
    }

    private void s5(int v) throws IOException {
        if(this.J + 13 >= this.K) {
            this.e5();
        }
        char[] arr_c = this.H;
        int v1 = this.J;
        this.J = v1 + 1;
        arr_c[v1] = this.G;
        int v2 = n.r(v, arr_c, v1 + 1);
        this.J = v2 + 1;
        this.H[v2] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void t4(char[] arr_c, int v, int v1) throws IOException {
        this.R4(arr_c, v, v1);
        if(v1 < 0x20) {
            if(v1 > this.K - this.J) {
                this.e5();
            }
            System.arraycopy(arr_c, v, this.H, this.J, v1);
            this.J += v1;
            return;
        }
        this.e5();
        this.F.write(arr_c, v, v1);
    }

    private void t5(long v) throws IOException {
        if(this.J + 23 >= this.K) {
            this.e5();
        }
        char[] arr_c = this.H;
        int v1 = this.J;
        this.J = v1 + 1;
        arr_c[v1] = this.G;
        int v2 = n.t(v, arr_c, v1 + 1);
        this.J = v2 + 1;
        this.H[v2] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void u4(byte[] arr_b, int v, int v1) throws IOException {
        this.j();
    }

    private void u5(String s) throws IOException {
        if(this.J >= this.K) {
            this.e5();
        }
        int v = this.J;
        this.J = v + 1;
        this.H[v] = this.G;
        this.r4(s);
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean v() {
        return true;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void v3(String s) throws IOException {
        int v = this.i.G(s);
        if(v == 4) {
            this.i("Can not write a field name, expecting a value");
        }
        this.m5(s, v == 1);
    }

    private void v5(char[] arr_c, int v, int v1) throws IOException {
        if(this.J >= this.K) {
            this.e5();
        }
        int v2 = this.J;
        this.J = v2 + 1;
        this.H[v2] = this.G;
        this.t4(arr_c, v, v1);
        if(this.J >= this.K) {
            this.e5();
        }
        int v3 = this.J;
        this.J = v3 + 1;
        this.H[v3] = this.G;
    }

    private void w5(short v) throws IOException {
        if(this.J + 8 >= this.K) {
            this.e5();
        }
        char[] arr_c = this.H;
        int v1 = this.J;
        this.J = v1 + 1;
        arr_c[v1] = this.G;
        int v2 = n.r(v, arr_c, v1 + 1);
        this.J = v2 + 1;
        this.H[v2] = this.G;
    }

    private void x5(int v) throws IOException {
        int v3;
        char[] arr_c;
        int[] arr_v = this.x;
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            do {
                arr_c = this.H;
                v3 = arr_c[v1];
                if(v3 < arr_v.length && arr_v[v3] != 0) {
                    break;
                }
                ++v1;
            }
            while(v1 < v);
            int v4 = v1 - v2;
            if(v4 > 0) {
                this.F.write(arr_c, v2, v4);
                if(v1 < v) {
                    goto label_13;
                }
                break;
            }
        label_13:
            ++v1;
            v2 = this.f5(this.H, v1, v, ((char)v3), arr_v[v3]);
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void y3() throws IOException {
        this.X4("write a null");
        this.p5();
    }

    private void y5(int v, int v1) throws IOException, j {
        int v6;
        char[] arr_c;
        int[] arr_v = this.x;
        int v2 = Math.min(arr_v.length, v1 + 1);
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(v3 < v) {
            do {
                arr_c = this.H;
                v6 = arr_c[v3];
                if(v6 < v2) {
                    v5 = arr_v[v6];
                    if(v5 != 0) {
                        break;
                    }
                }
                else if(v6 > v1) {
                    v5 = -1;
                    break;
                }
                ++v3;
            }
            while(v3 < v);
            int v7 = v3 - v4;
            if(v7 > 0) {
                this.F.write(arr_c, v4, v7);
                if(v3 < v) {
                    goto label_21;
                }
                break;
            }
        label_21:
            ++v3;
            v4 = this.f5(this.H, v3, v, ((char)v6), v5);
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void z4() throws IOException {
        this.X4("start an array");
        this.i = this.i.v();
        this.g2().h(this.i.e());
        v v0 = this.a;
        if(v0 != null) {
            v0.f(this);
            return;
        }
        if(this.J >= this.K) {
            this.e5();
        }
        int v1 = this.J;
        this.J = v1 + 1;
        this.H[v1] = '[';
    }

    private void z5(int v) throws IOException, j {
        int v6;
        int[] arr_v = this.x;
        int v1 = this.y >= 1 ? this.y : 0xFFFF;
        int v2 = Math.min(arr_v.length, v1 + 1);
        d d0 = this.z;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(v3 < v) {
            do {
                v6 = this.H[v3];
                if(v6 < v2) {
                    v5 = arr_v[v6];
                    if(v5 != 0) {
                        break;
                    }
                }
                else if(v6 > v1) {
                    v5 = -1;
                    break;
                }
                else {
                    w w0 = d0.b(v6);
                    this.M = w0;
                    if(w0 != null) {
                        v5 = -2;
                        break;
                    }
                }
                ++v3;
            }
            while(v3 < v);
            int v7 = v3 - v4;
            if(v7 > 0) {
                this.F.write(this.H, v4, v7);
                if(v3 < v) {
                    goto label_27;
                }
                break;
            }
        label_27:
            ++v3;
            v4 = this.f5(this.H, v3, v, ((char)v6), v5);
        }
    }
}

