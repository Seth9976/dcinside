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
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class k extends c {
    protected final OutputStream F;
    protected byte G;
    protected byte[] H;
    protected int I;
    protected final int J;
    protected final int K;
    protected char[] L;
    protected final int M;
    private static final byte M8 = 0x7D;
    protected byte[] N;
    private static final byte N8 = 92;
    protected boolean O;
    private static final byte O8 = 44;
    private static final byte P = 0x75;
    private static final byte P8 = 58;
    private static final byte Q = 0x30;
    private static final int Q8 = 0x200;
    private static final byte[] R8 = null;
    private static final byte[] S8 = null;
    private static final byte[] T8 = null;
    private static final byte[] U8 = null;
    private static final byte[] V8 = null;
    private static final byte X = 91;
    private static final byte Y = 93;
    private static final byte Z = 0x7B;

    static {
        k.R8 = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        k.S8 = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        k.T8 = new byte[]{110, 0x75, 108, 108};
        k.U8 = new byte[]{0x74, 0x72, 0x75, 101};
        k.V8 = new byte[]{102, 97, 108, 0x73, 101};
    }

    @Deprecated
    public k(g g0, int v, u u0, OutputStream outputStream0) {
        this(g0, v, u0, outputStream0, '\"');
    }

    public k(g g0, int v, u u0, OutputStream outputStream0, char c) {
        super(g0, v, u0);
        this.F = outputStream0;
        this.G = (byte)c;
        if(c != 34) {
            this.x = com.fasterxml.jackson.core.io.c.h(c);
        }
        this.O = true;
        byte[] arr_b = g0.q();
        this.H = arr_b;
        this.J = arr_b.length;
        this.K = arr_b.length >> 3;
        char[] arr_c = g0.i();
        this.L = arr_c;
        this.M = arr_c.length;
        if(this.d1(b.h)) {
            this.N1(0x7F);
        }
    }

    public k(g g0, int v, u u0, OutputStream outputStream0, char c, byte[] arr_b, int v1, boolean z) {
        super(g0, v, u0);
        this.F = outputStream0;
        this.G = (byte)c;
        if(c != 34) {
            this.x = com.fasterxml.jackson.core.io.c.h(c);
        }
        this.O = z;
        this.I = v1;
        this.H = arr_b;
        this.J = arr_b.length;
        this.K = arr_b.length >> 3;
        char[] arr_c = g0.i();
        this.L = arr_c;
        this.M = arr_c.length;
    }

    @Deprecated
    public k(g g0, int v, u u0, OutputStream outputStream0, byte[] arr_b, int v1, boolean z) {
        this(g0, v, u0, outputStream0, '\"', arr_b, v1, z);
    }

    private final void A5(String s, int v, int v1) throws IOException {
        int v2 = v1 + v;
        int v3 = this.I;
        byte[] arr_b = this.H;
        int[] arr_v = this.x;
        while(v < v2) {
            int v4 = s.charAt(v);
            if(v4 > 0x7F || arr_v[v4] != 0) {
                break;
            }
            arr_b[v3] = (byte)v4;
            ++v;
            ++v3;
        }
        this.I = v3;
        if(v < v2) {
            if(this.z != null) {
                this.n5(s, v, v2);
                return;
            }
            if(this.y == 0) {
                this.C5(s, v, v2);
                return;
            }
            this.E5(s, v, v2);
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public final void B4(Object object0) throws IOException {
        this.X4("start an array");
        this.i = this.i.w(object0);
        this.g2().h(this.i.e());
        v v0 = this.a;
        if(v0 != null) {
            v0.f(this);
            return;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v1 = this.I;
        this.I = v1 + 1;
        this.H[v1] = 91;
    }

    private final void B5(char[] arr_c, int v, int v1) throws IOException {
        int v2 = v1 + v;
        int v3 = this.I;
        byte[] arr_b = this.H;
        int[] arr_v = this.x;
        while(v < v2) {
            int v4 = arr_c[v];
            if(v4 > 0x7F || arr_v[v4] != 0) {
                break;
            }
            arr_b[v3] = (byte)v4;
            ++v;
            ++v3;
        }
        this.I = v3;
        if(v < v2) {
            if(this.z != null) {
                this.o5(arr_c, v, v2);
                return;
            }
            if(this.y == 0) {
                this.D5(arr_c, v, v2);
                return;
            }
            this.F5(arr_c, v, v2);
        }
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public int C2(a a0, InputStream inputStream0, int v) throws IOException, j {
        this.X4("write a binary value");
        if(this.I >= this.J) {
            this.b5();
        }
        int v1 = this.I;
        this.I = v1 + 1;
        this.H[v1] = this.G;
        byte[] arr_b = this.g.e();
        try {
            if(v < 0) {
                v = this.h5(a0, inputStream0, arr_b);
            }
            else {
                int v3 = this.i5(a0, inputStream0, arr_b, v);
                if(v3 > 0) {
                    this.i("Too few bytes available: missing " + v3 + " bytes (out of " + v + ")");
                }
            }
        }
        finally {
            this.g.T(arr_b);
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v4 = this.I;
        this.I = v4 + 1;
        this.H[v4] = this.G;
        return v;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void C3(double f) throws IOException {
        if(!this.h && (!n.o(f) || !b.g.c(this.f))) {
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
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = 91;
    }

    private final void C5(String s, int v, int v1) throws IOException {
        if(this.I + (v1 - v) * 6 > this.J) {
            this.b5();
        }
        int v2 = this.I;
        byte[] arr_b = this.H;
        int[] arr_v = this.x;
        while(v < v1) {
            int v3 = s.charAt(v);
            if(v3 <= 0x7F) {
                int v4 = arr_v[v3];
                if(v4 == 0) {
                    arr_b[v2] = (byte)v3;
                    ++v;
                    ++v2;
                    continue;
                }
                else {
                    if(v4 > 0) {
                        int v5 = v2 + 1;
                        arr_b[v2] = 92;
                        v2 += 2;
                        arr_b[v5] = (byte)v4;
                    }
                    else {
                        v2 = this.p5(v3, v2);
                    }
                    goto label_29;
                }
                goto label_22;
            }
            else {
            label_22:
                if(v3 <= 0x7FF) {
                    int v6 = v2 + 1;
                    arr_b[v2] = (byte)(v3 >> 6 | 0xC0);
                    v2 += 2;
                    arr_b[v6] = (byte)(v3 & 0x3F | 0x80);
                }
                else {
                    v2 = this.d5(v3, v2);
                }
            }
        label_29:
            ++v;
        }
        this.I = v2;
    }

    @Override  // com.fasterxml.jackson.core.k
    public final void D4() throws IOException {
        this.X4("start an object");
        this.i = this.i.x();
        this.g2().h(this.i.e());
        v v0 = this.a;
        if(v0 != null) {
            v0.g(this);
            return;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v1 = this.I;
        this.I = v1 + 1;
        this.H[v1] = 0x7B;
    }

    private final void D5(char[] arr_c, int v, int v1) throws IOException {
        if(this.I + (v1 - v) * 6 > this.J) {
            this.b5();
        }
        int v2 = this.I;
        byte[] arr_b = this.H;
        int[] arr_v = this.x;
        while(v < v1) {
            int v3 = arr_c[v];
            if(v3 <= 0x7F) {
                int v4 = arr_v[v3];
                if(v4 == 0) {
                    arr_b[v2] = (byte)v3;
                    ++v;
                    ++v2;
                    continue;
                }
                else {
                    if(v4 > 0) {
                        int v5 = v2 + 1;
                        arr_b[v2] = 92;
                        v2 += 2;
                        arr_b[v5] = (byte)v4;
                    }
                    else {
                        v2 = this.p5(v3, v2);
                    }
                    goto label_29;
                }
                goto label_22;
            }
            else {
            label_22:
                if(v3 <= 0x7FF) {
                    int v6 = v2 + 1;
                    arr_b[v2] = (byte)(v3 >> 6 | 0xC0);
                    v2 += 2;
                    arr_b[v6] = (byte)(v3 & 0x3F | 0x80);
                }
                else {
                    v2 = this.d5(v3, v2);
                }
            }
        label_29:
            ++v;
        }
        this.I = v2;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void E3(float f) throws IOException {
        if(!this.h && (!n.p(f) || !b.g.c(this.f))) {
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
        this.g2().h(f0.e());
        this.i = f0;
        v v0 = this.a;
        if(v0 != null) {
            v0.g(this);
            return;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v1 = this.I;
        this.I = v1 + 1;
        this.H[v1] = 0x7B;
    }

    private final void E5(String s, int v, int v1) throws IOException {
        if(this.I + (v1 - v) * 6 > this.J) {
            this.b5();
        }
        int v2 = this.I;
        byte[] arr_b = this.H;
        int[] arr_v = this.x;
        int v3 = this.y;
        while(v < v1) {
            int v4 = s.charAt(v);
            if(v4 <= 0x7F) {
                int v5 = arr_v[v4];
                if(v5 == 0) {
                    arr_b[v2] = (byte)v4;
                    ++v;
                    ++v2;
                    continue;
                }
                else {
                    if(v5 > 0) {
                        int v6 = v2 + 1;
                        arr_b[v2] = 92;
                        v2 += 2;
                        arr_b[v6] = (byte)v5;
                    }
                    else {
                        v2 = this.p5(v4, v2);
                    }
                    goto label_33;
                }
                goto label_23;
            }
            else {
            label_23:
                if(v4 > v3) {
                    v2 = this.p5(v4, v2);
                }
                else if(v4 <= 0x7FF) {
                    int v7 = v2 + 1;
                    arr_b[v2] = (byte)(v4 >> 6 | 0xC0);
                    v2 += 2;
                    arr_b[v7] = (byte)(v4 & 0x3F | 0x80);
                }
                else {
                    v2 = this.d5(v4, v2);
                }
            }
        label_33:
            ++v;
        }
        this.I = v2;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void F3(int v) throws IOException {
        this.X4("write a number");
        if(this.I + 11 >= this.J) {
            this.b5();
        }
        if(this.h) {
            this.t5(v);
            return;
        }
        this.I = n.q(v, this.H, this.I);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void F4(Object object0, int v) throws IOException {
        this.E4(object0);
    }

    private final void F5(char[] arr_c, int v, int v1) throws IOException {
        if(this.I + (v1 - v) * 6 > this.J) {
            this.b5();
        }
        int v2 = this.I;
        byte[] arr_b = this.H;
        int[] arr_v = this.x;
        int v3 = this.y;
        while(v < v1) {
            int v4 = arr_c[v];
            if(v4 <= 0x7F) {
                int v5 = arr_v[v4];
                if(v5 == 0) {
                    arr_b[v2] = (byte)v4;
                    ++v;
                    ++v2;
                    continue;
                }
                else {
                    if(v5 > 0) {
                        int v6 = v2 + 1;
                        arr_b[v2] = 92;
                        v2 += 2;
                        arr_b[v6] = (byte)v5;
                    }
                    else {
                        v2 = this.p5(v4, v2);
                    }
                    goto label_33;
                }
                goto label_23;
            }
            else {
            label_23:
                if(v4 > v3) {
                    v2 = this.p5(v4, v2);
                }
                else if(v4 <= 0x7FF) {
                    int v7 = v2 + 1;
                    arr_b[v2] = (byte)(v4 >> 6 | 0xC0);
                    v2 += 2;
                    arr_b[v7] = (byte)(v4 & 0x3F | 0x80);
                }
                else {
                    v2 = this.d5(v4, v2);
                }
            }
        label_33:
            ++v;
        }
        this.I = v2;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public final void G4(w w0) throws IOException {
        this.X4("write a string");
        if(this.I >= this.J) {
            this.b5();
        }
        byte[] arr_b = this.H;
        int v = this.I;
        this.I = v + 1;
        arr_b[v] = this.G;
        int v1 = w0.e(arr_b, v + 1);
        if(v1 < 0) {
            this.k5(w0.d());
        }
        else {
            this.I += v1;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
    }

    private final void G5(String s, int v, int v1) throws IOException {
        do {
            int v2 = Math.min(this.K, v1);
            if(this.I + v2 > this.J) {
                this.b5();
            }
            this.A5(s, v, v2);
            v += v2;
            v1 -= v2;
        }
        while(v1 > 0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void H4(Reader reader0, int v) throws IOException {
        this.X4("write a string");
        if(reader0 == null) {
            this.i("null reader");
            return;
        }
        int v1 = v < 0 ? 0x7FFFFFFF : v;
        char[] arr_c = this.L;
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
        while(v1 > 0) {
            int v3 = reader0.read(arr_c, 0, Math.min(v1, arr_c.length));
            if(v3 <= 0) {
                break;
            }
            if(this.I + v >= this.J) {
                this.b5();
            }
            this.I5(arr_c, 0, v3);
            v1 -= v3;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v4 = this.I;
        this.I = v4 + 1;
        this.H[v4] = this.G;
        if(v1 > 0 && v >= 0) {
            this.i("Didn\'t read enough from reader");
        }
    }

    private final void H5(String s, boolean z) throws IOException {
        if(z) {
            if(this.I >= this.J) {
                this.b5();
            }
            int v = this.I;
            this.I = v + 1;
            this.H[v] = this.G;
        }
        int v1 = s.length();
        int v2 = 0;
        while(v1 > 0) {
            int v3 = Math.min(this.K, v1);
            if(this.I + v3 > this.J) {
                this.b5();
            }
            this.A5(s, v2, v3);
            v2 += v3;
            v1 -= v3;
        }
        if(z) {
            if(this.I >= this.J) {
                this.b5();
            }
            int v4 = this.I;
            this.I = v4 + 1;
            this.H[v4] = this.G;
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void I4(char[] arr_c, int v, int v1) throws IOException {
        this.X4("write a string");
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
        if(v1 <= this.K) {
            if(v2 + 1 + v1 > this.J) {
                this.b5();
            }
            this.B5(arr_c, v, v1);
        }
        else {
            this.I5(arr_c, v, v1);
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v3 = this.I;
        this.I = v3 + 1;
        this.H[v3] = this.G;
    }

    private final void I5(char[] arr_c, int v, int v1) throws IOException {
        do {
            int v2 = Math.min(this.K, v1);
            if(this.I + v2 > this.J) {
                this.b5();
            }
            this.B5(arr_c, v, v2);
            v += v2;
            v1 -= v2;
        }
        while(v1 > 0);
    }

    private final void J5(byte[] arr_b, int v, int v1) throws IOException, j {
        int[] arr_v = this.x;
        for(int v2 = v; v2 < v + v1; ++v2) {
            int v3 = arr_b[v2];
            if(v3 >= 0 && arr_v[v3] != 0) {
                this.K5(arr_b, v, v1);
                return;
            }
        }
        if(this.I + v1 > this.J) {
            this.b5();
        }
        System.arraycopy(arr_b, v, this.H, this.I, v1);
        this.I += v1;
    }

    private final void K5(byte[] arr_b, int v, int v1) throws IOException, j {
        int v2 = this.I;
        if(v1 * 6 + v2 > this.J) {
            this.b5();
            v2 = this.I;
        }
        byte[] arr_b1 = this.H;
        int[] arr_v = this.x;
        int v3 = v1 + v;
        while(v < v3) {
            byte b = arr_b[v];
            if(b >= 0) {
                int v4 = arr_v[b];
                if(v4 != 0) {
                    if(v4 > 0) {
                        int v5 = v2 + 1;
                        arr_b1[v2] = 92;
                        v2 += 2;
                        arr_b1[v5] = (byte)v4;
                    }
                    else {
                        v2 = this.p5(((int)b), v2);
                    }
                    ++v;
                    continue;
                }
            }
            arr_b1[v2] = b;
            ++v;
            ++v2;
        }
        this.I = v2;
    }

    @Override  // com.fasterxml.jackson.core.k
    public int L0() {
        return this.I;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void L2(a a0, byte[] arr_b, int v, int v1) throws IOException, j {
        this.Q4(arr_b, v, v1);
        this.X4("write a binary value");
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
        this.j5(a0, arr_b, v, v1 + v);
        if(this.I >= this.J) {
            this.b5();
        }
        int v3 = this.I;
        this.I = v3 + 1;
        this.H[v3] = this.G;
    }

    private final void L5(byte[] arr_b, int v, int v1) throws IOException, j {
        do {
            int v2 = Math.min(this.K, v1);
            this.J5(arr_b, v, v2);
            v += v2;
            v1 -= v2;
        }
        while(v1 > 0);
    }

    private final void M5(w w0) throws IOException {
        int v = w0.e(this.H, this.I);
        if(v < 0) {
            this.k5(w0.d());
            return;
        }
        this.I += v;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void N3(long v) throws IOException {
        this.X4("write a number");
        if(this.h) {
            this.u5(v);
            return;
        }
        if(this.I + 21 >= this.J) {
            this.b5();
        }
        this.I = n.s(v, this.H, this.I);
    }

    // 去混淆评级： 低(20)
    private byte[] N5() {
        return this.C ? k.R8 : k.S8;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void O4(byte[] arr_b, int v, int v1) throws IOException {
        this.Q4(arr_b, v, v1);
        this.X4("write a string");
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
        if(v1 <= this.K) {
            this.J5(arr_b, v, v1);
        }
        else {
            this.L5(arr_b, v, v1);
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v3 = this.I;
        this.I = v3 + 1;
        this.H[v3] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void S3(String s) throws IOException {
        this.X4("write a number");
        if(s == null) {
            this.q5();
            return;
        }
        if(this.h) {
            this.v5(s);
            return;
        }
        this.r4(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void T3(BigDecimal bigDecimal0) throws IOException {
        this.X4("write a number");
        if(bigDecimal0 == null) {
            this.q5();
            return;
        }
        if(this.h) {
            this.v5(this.P4(bigDecimal0));
            return;
        }
        this.r4(this.P4(bigDecimal0));
    }

    @Override  // com.fasterxml.jackson.core.base.a
    protected void W4() {
        byte[] arr_b = this.H;
        if(arr_b != null && this.O) {
            this.H = null;
            this.g.h0(arr_b);
        }
        char[] arr_c = this.L;
        if(arr_c != null) {
            this.L = null;
            this.g.Y(arr_c);
        }
    }

    @Override  // com.fasterxml.jackson.core.base.a
    protected final void X4(String s) throws IOException {
        byte b;
        int v = this.i.H();
        if(this.a != null) {
            this.Z4(s, v);
            return;
        }
        switch(v) {
            case 1: {
                b = 44;
                break;
            }
            case 2: {
                b = 58;
                break;
            }
            case 3: {
                w w0 = this.A;
                if(w0 != null) {
                    byte[] arr_b = w0.l();
                    if(arr_b.length > 0) {
                        this.k5(arr_b);
                    }
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
        if(this.I >= this.J) {
            this.b5();
        }
        int v1 = this.I;
        this.I = v1 + 1;
        this.H[v1] = b;
    }

    @Override  // com.fasterxml.jackson.core.k
    public Object Y0() {
        return this.F;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void Y3(BigInteger bigInteger0) throws IOException {
        this.X4("write a number");
        if(bigInteger0 == null) {
            this.q5();
            return;
        }
        if(this.h) {
            this.v5(bigInteger0.toString());
            return;
        }
        this.r4(bigInteger0.toString());
    }

    @Override  // com.fasterxml.jackson.core.k
    public void Z3(short v) throws IOException {
        this.X4("write a number");
        if(this.I + 6 >= this.J) {
            this.b5();
        }
        if(this.h) {
            this.x5(v);
            return;
        }
        this.I = n.q(v, this.H, this.I);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void a4(char[] arr_c, int v, int v1) throws IOException {
        this.X4("write a number");
        if(this.h) {
            this.w5(arr_c, v, v1);
            return;
        }
        this.t4(arr_c, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void b3(boolean z) throws IOException {
        this.X4("write a boolean value");
        if(this.I + 5 >= this.J) {
            this.b5();
        }
        byte[] arr_b = z ? k.U8 : k.V8;
        System.arraycopy(arr_b, 0, this.H, this.I, arr_b.length);
        this.I += arr_b.length;
    }

    protected final void b5() throws IOException {
        int v = this.I;
        if(v > 0) {
            this.I = 0;
            this.F.write(this.H, 0, v);
        }
    }

    private final int c5(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) throws IOException, j {
        if(v + arr_b1.length > v1) {
            this.I = v;
            this.b5();
            v = this.I;
            if(arr_b1.length > arr_b.length) {
                this.F.write(arr_b1, 0, arr_b1.length);
                return v;
            }
        }
        System.arraycopy(arr_b1, 0, arr_b, v, arr_b1.length);
        int v3 = v + arr_b1.length;
        if(v2 * 6 + v3 > v1) {
            this.I = v3;
            this.b5();
            return this.I;
        }
        return v3;
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
            this.b5();
            iOException0 = null;
        }
        catch(IOException iOException0) {
        }
        this.I = 0;
        if(this.F != null) {
            try {
                if(this.g.R() || this.d1(b.c)) {
                    this.F.close();
                    goto label_25;
                label_22:
                    if(iOException0 == null) {
                        throw iOException1;
                    }
                    goto label_23;
                }
                else if(this.d1(b.e)) {
                    this.F.flush();
                }
                goto label_25;
            }
            catch(IOException | RuntimeException iOException1) {
                goto label_22;
            }
        label_23:
            iOException1.addSuppressed(iOException0);
            throw iOException1;
        }
    label_25:
        this.W4();
        if(iOException0 != null) {
            throw iOException0;
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public void d(String s) throws IOException {
        this.X4("write a string");
        if(s == null) {
            this.q5();
            return;
        }
        int v = s.length();
        if(v > this.K) {
            this.H5(s, true);
            return;
        }
        if(this.I + v >= this.J) {
            this.b5();
        }
        int v1 = this.I;
        this.I = v1 + 1;
        this.H[v1] = this.G;
        this.A5(s, 0, v);
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
    }

    private final int d5(int v, int v1) throws IOException {
        byte[] arr_b = this.N5();
        byte[] arr_b1 = this.H;
        if(v >= 0xD800 && v <= 0xDFFF) {
            arr_b1[v1] = 92;
            arr_b1[v1 + 1] = 0x75;
            arr_b1[v1 + 2] = arr_b[v >> 12 & 15];
            arr_b1[v1 + 3] = arr_b[v >> 8 & 15];
            arr_b1[v1 + 4] = arr_b[v >> 4 & 15];
            arr_b1[v1 + 5] = arr_b[v & 15];
            return v1 + 6;
        }
        arr_b1[v1] = (byte)(v >> 12 | 0xE0);
        arr_b1[v1 + 1] = (byte)(v >> 6 & 0x3F | 0x80);
        arr_b1[v1 + 2] = (byte)(v & 0x3F | 0x80);
        return v1 + 3;
    }

    private final int e5(int v, char[] arr_c, int v1, int v2) throws IOException {
        if(v >= 0xD800 && v <= 0xDFFF) {
            if(v1 < v2 && arr_c != null) {
                this.f5(v, ((int)arr_c[v1]));
                return v1 + 1;
            }
            this.i(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", v));
            return v1 + 1;
        }
        byte[] arr_b = this.H;
        int v3 = this.I;
        this.I = v3 + 1;
        arr_b[v3] = (byte)(v >> 12 | 0xE0);
        this.I = v3 + 2;
        arr_b[v3 + 1] = (byte)(v >> 6 & 0x3F | 0x80);
        this.I = v3 + 3;
        arr_b[v3 + 2] = (byte)(v & 0x3F | 0x80);
        return v1;
    }

    protected final void f5(int v, int v1) throws IOException {
        int v2 = this.V4(v, v1);
        if(this.I + 4 > this.J) {
            this.b5();
        }
        byte[] arr_b = this.H;
        int v3 = this.I;
        this.I = v3 + 1;
        arr_b[v3] = (byte)(v2 >> 18 | 0xF0);
        this.I = v3 + 2;
        arr_b[v3 + 1] = (byte)(v2 >> 12 & 0x3F | 0x80);
        this.I = v3 + 3;
        arr_b[v3 + 2] = (byte)(v2 >> 6 & 0x3F | 0x80);
        this.I = v3 + 4;
        arr_b[v3 + 3] = (byte)(v2 & 0x3F | 0x80);
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public void flush() throws IOException {
        this.b5();
        if(this.F != null && this.d1(b.e)) {
            this.F.flush();
        }
    }

    private final int g5(InputStream inputStream0, byte[] arr_b, int v, int v1, int v2) throws IOException {
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

    protected final int h5(a a0, InputStream inputStream0, byte[] arr_b) throws IOException, j {
        int v = this.J - 6;
        int v1 = 2;
        int v2 = -3;
        int v3 = a0.w() >> 2;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        while(true) {
            if(v4 > v2) {
                v5 = this.g5(inputStream0, arr_b, v4, v5, arr_b.length);
                if(v5 < 3) {
                    break;
                }
                v2 = v5 - 3;
                v4 = 0;
            }
            if(this.I > v) {
                this.b5();
            }
            int v7 = v4 + 2;
            int v8 = (arr_b[v4 + 1] & 0xFF | arr_b[v4] << 8) << 8;
            v4 += 3;
            v6 += 3;
            int v9 = a0.o(v8 | arr_b[v7] & 0xFF, this.H, this.I);
            this.I = v9;
            if(v3 - 1 > 0) {
                --v3;
            }
            else {
                byte[] arr_b1 = this.H;
                this.I = v9 + 1;
                arr_b1[v9] = 92;
                this.I = v9 + 2;
                arr_b1[v9 + 1] = 110;
                v3 = a0.w() >> 2;
            }
        }
        if(v5 > 0) {
            if(this.I > v) {
                this.b5();
            }
            int v10 = arr_b[0] << 16;
            if(1 < v5) {
                v10 |= (arr_b[1] & 0xFF) << 8;
            }
            else {
                v1 = 1;
            }
            v6 += v1;
            this.I = a0.r(v10, v1, this.H, this.I);
        }
        return v6;
    }

    protected final int i5(a a0, InputStream inputStream0, byte[] arr_b, int v) throws IOException, j {
        int v1 = this.J - 6;
        int v2 = 2;
        int v3 = -3;
        int v4 = v;
        int v5 = a0.w() >> 2;
        int v6 = 0;
        int v7 = 0;
        while(v4 > 2) {
            if(v6 > v3) {
                v7 = this.g5(inputStream0, arr_b, v6, v7, v4);
                if(v7 < 3) {
                    v6 = 0;
                    break;
                }
                v3 = v7 - 3;
                v6 = 0;
            }
            if(this.I > v1) {
                this.b5();
            }
            int v8 = v6 + 2;
            int v9 = (arr_b[v6 + 1] & 0xFF | arr_b[v6] << 8) << 8;
            v6 += 3;
            v4 -= 3;
            int v10 = a0.o(v9 | arr_b[v8] & 0xFF, this.H, this.I);
            this.I = v10;
            if(v5 - 1 > 0) {
                --v5;
            }
            else {
                byte[] arr_b1 = this.H;
                this.I = v10 + 1;
                arr_b1[v10] = 92;
                this.I = v10 + 2;
                arr_b1[v10 + 1] = 110;
                v5 = a0.w() >> 2;
            }
        }
        if(v4 > 0) {
            int v11 = this.g5(inputStream0, arr_b, v6, v7, v4);
            if(v11 > 0) {
                if(this.I > v1) {
                    this.b5();
                }
                int v12 = arr_b[0] << 16;
                if(1 < v11) {
                    v12 |= (arr_b[1] & 0xFF) << 8;
                }
                else {
                    v2 = 1;
                }
                this.I = a0.r(v12, v2, this.H, this.I);
                return v4 - v2;
            }
        }
        return v4;
    }

    protected final void j5(a a0, byte[] arr_b, int v, int v1) throws IOException, j {
        int v2 = this.J - 6;
        int v3 = a0.w();
    alab1:
        while(true) {
            for(int v4 = v3 >> 2; true; --v4) {
                if(v > v1 - 3) {
                    break alab1;
                }
                if(this.I > v2) {
                    this.b5();
                }
                int v5 = v + 2;
                int v6 = (arr_b[v + 1] & 0xFF | arr_b[v] << 8) << 8;
                v += 3;
                int v7 = a0.o(v6 | arr_b[v5] & 0xFF, this.H, this.I);
                this.I = v7;
                if(v4 - 1 <= 0) {
                    byte[] arr_b1 = this.H;
                    this.I = v7 + 1;
                    arr_b1[v7] = 92;
                    this.I = v7 + 2;
                    arr_b1[v7 + 1] = 110;
                    v3 = a0.w();
                    break;
                }
            }
        }
        int v8 = v1 - v;
        if(v8 > 0) {
            if(this.I > v2) {
                this.b5();
            }
            int v9 = arr_b[v] << 16;
            if(v8 == 2) {
                v9 |= (arr_b[v + 1] & 0xFF) << 8;
            }
            this.I = a0.r(v9, v8, this.H, this.I);
        }
    }

    private final void k5(byte[] arr_b) throws IOException {
        if(this.I + arr_b.length > this.J) {
            this.b5();
            if(arr_b.length > 0x200) {
                this.F.write(arr_b, 0, arr_b.length);
                return;
            }
        }
        System.arraycopy(arr_b, 0, this.H, this.I, arr_b.length);
        this.I += arr_b.length;
    }

    private final void l5(byte[] arr_b, int v, int v1) throws IOException {
        if(this.I + v1 > this.J) {
            this.b5();
            if(v1 > 0x200) {
                this.F.write(arr_b, v, v1);
                return;
            }
        }
        System.arraycopy(arr_b, v, this.H, this.I, v1);
        this.I += v1;
    }

    private final int m5(byte[] arr_b, int v, w w0, int v1) throws IOException, j {
        byte[] arr_b1 = w0.l();
        if(arr_b1.length > 6) {
            return this.c5(arr_b, v, this.J, arr_b1, v1);
        }
        System.arraycopy(arr_b1, 0, arr_b, v, arr_b1.length);
        return v + arr_b1.length;
    }

    @Override  // com.fasterxml.jackson.core.k
    public final void n3() throws IOException {
        if(!this.i.l()) {
            this.i("Current context not Array but root");
        }
        v v0 = this.a;
        if(v0 == null) {
            if(this.I >= this.J) {
                this.b5();
            }
            int v1 = this.I;
            this.I = v1 + 1;
            this.H[v1] = 93;
        }
        else {
            v0.d(this, this.i.d());
        }
        this.i = this.i.u();
    }

    private final void n5(String s, int v, int v1) throws IOException {
        if(this.I + (v1 - v) * 6 > this.J) {
            this.b5();
        }
        int v2 = this.I;
        byte[] arr_b = this.H;
        int[] arr_v = this.x;
        int v3 = this.y > 0 ? this.y : 0xFFFF;
        d d0 = this.z;
        while(v < v1) {
            int v4 = s.charAt(v);
            if(v4 <= 0x7F) {
                int v5 = arr_v[v4];
                if(v5 == 0) {
                    arr_b[v2] = (byte)v4;
                    ++v;
                    ++v2;
                    continue;
                }
                else {
                    if(v5 > 0) {
                        int v6 = v2 + 1;
                        arr_b[v2] = 92;
                        v2 += 2;
                        arr_b[v6] = (byte)v5;
                    }
                    else if(v5 == -2) {
                        w w0 = d0.b(v4);
                        if(w0 == null) {
                            this.i("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(v4) + ", although was supposed to have one");
                        }
                        v2 = this.m5(arr_b, v2, w0, v1 - (v + 1));
                    }
                    else {
                        v2 = this.p5(v4, v2);
                    }
                    goto label_44;
                }
                goto label_30;
            }
            else {
            label_30:
                if(v4 > v3) {
                    v2 = this.p5(v4, v2);
                }
                else {
                    w w1 = d0.b(v4);
                    if(w1 != null) {
                        v2 = this.m5(arr_b, v2, w1, v1 - (v + 1));
                    }
                    else if(v4 <= 0x7FF) {
                        int v7 = v2 + 1;
                        arr_b[v2] = (byte)(v4 >> 6 | 0xC0);
                        v2 += 2;
                        arr_b[v7] = (byte)(v4 & 0x3F | 0x80);
                    }
                    else {
                        v2 = this.d5(v4, v2);
                    }
                }
            }
        label_44:
            ++v;
        }
        this.I = v2;
    }

    private final void o5(char[] arr_c, int v, int v1) throws IOException {
        if(this.I + (v1 - v) * 6 > this.J) {
            this.b5();
        }
        int v2 = this.I;
        byte[] arr_b = this.H;
        int[] arr_v = this.x;
        int v3 = this.y > 0 ? this.y : 0xFFFF;
        d d0 = this.z;
        while(v < v1) {
            int v4 = arr_c[v];
            if(v4 <= 0x7F) {
                int v5 = arr_v[v4];
                if(v5 == 0) {
                    arr_b[v2] = (byte)v4;
                    ++v;
                    ++v2;
                    continue;
                }
                else {
                    if(v5 > 0) {
                        int v6 = v2 + 1;
                        arr_b[v2] = 92;
                        v2 += 2;
                        arr_b[v6] = (byte)v5;
                    }
                    else if(v5 == -2) {
                        w w0 = d0.b(v4);
                        if(w0 == null) {
                            this.i("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(v4) + ", although was supposed to have one");
                        }
                        v2 = this.m5(arr_b, v2, w0, v1 - (v + 1));
                    }
                    else {
                        v2 = this.p5(v4, v2);
                    }
                    goto label_44;
                }
                goto label_30;
            }
            else {
            label_30:
                if(v4 > v3) {
                    v2 = this.p5(v4, v2);
                }
                else {
                    w w1 = d0.b(v4);
                    if(w1 != null) {
                        v2 = this.m5(arr_b, v2, w1, v1 - (v + 1));
                    }
                    else if(v4 <= 0x7FF) {
                        int v7 = v2 + 1;
                        arr_b[v2] = (byte)(v4 >> 6 | 0xC0);
                        v2 += 2;
                        arr_b[v7] = (byte)(v4 & 0x3F | 0x80);
                    }
                    else {
                        v2 = this.d5(v4, v2);
                    }
                }
            }
        label_44:
            ++v;
        }
        this.I = v2;
    }

    @Override  // com.fasterxml.jackson.core.k
    public final void p3() throws IOException {
        if(!this.i.m()) {
            this.i("Current context not Object but root");
        }
        v v0 = this.a;
        if(v0 == null) {
            if(this.I >= this.J) {
                this.b5();
            }
            int v1 = this.I;
            this.I = v1 + 1;
            this.H[v1] = 0x7D;
        }
        else {
            v0.k(this, this.i.d());
        }
        this.i = this.i.u();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void p4(char c) throws IOException {
        if(this.I + 3 >= this.J) {
            this.b5();
        }
        byte[] arr_b = this.H;
        if(c <= 0x7F) {
            int v = this.I;
            this.I = v + 1;
            arr_b[v] = (byte)c;
            return;
        }
        if(c < 0x800) {
            int v1 = this.I;
            this.I = v1 + 1;
            arr_b[v1] = (byte)(c >> 6 | 0xC0);
            this.I = v1 + 2;
            arr_b[v1 + 1] = (byte)(c & 0x3F | 0x80);
            return;
        }
        this.e5(((int)c), null, 0, 0);
    }

    private int p5(int v, int v1) throws IOException {
        int v2;
        byte[] arr_b = this.H;
        byte[] arr_b1 = this.N5();
        arr_b[v1] = 92;
        arr_b[v1 + 1] = 0x75;
        if(v > 0xFF) {
            arr_b[v1 + 2] = arr_b1[(v >> 8 & 0xFF) >> 4];
            v2 = v1 + 4;
            arr_b[v1 + 3] = arr_b1[v >> 8 & 15];
            v &= 0xFF;
        }
        else {
            arr_b[v1 + 2] = 0x30;
            v2 = v1 + 4;
            arr_b[v1 + 3] = 0x30;
        }
        arr_b[v2] = arr_b1[v >> 4];
        arr_b[v2 + 1] = arr_b1[v & 15];
        return v2 + 2;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void q4(w w0) throws IOException {
        int v = w0.g(this.H, this.I);
        if(v < 0) {
            this.k5(w0.l());
            return;
        }
        this.I += v;
    }

    private final void q5() throws IOException {
        if(this.I + 4 >= this.J) {
            this.b5();
        }
        System.arraycopy(k.T8, 0, this.H, this.I, 4);
        this.I += 4;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void r4(String s) throws IOException {
        int v = s.length();
        char[] arr_c = this.L;
        if(v <= arr_c.length) {
            this.t4(arr_c, 0, v);
            return;
        }
        this.s4(s, 0, v);
    }

    protected final void r5(w w0) throws IOException {
        int v = this.i.G(w0.getValue());
        if(v == 4) {
            this.i("Can not write a field name, expecting a value");
        }
        if(v == 1) {
            this.a.i(this);
        }
        else {
            this.a.c(this);
        }
        boolean z = this.B;
        if(!z) {
            if(this.I >= this.J) {
                this.b5();
            }
            int v1 = this.I;
            this.I = v1 + 1;
            this.H[v1] = this.G;
        }
        int v2 = w0.e(this.H, this.I);
        if(v2 < 0) {
            this.k5(w0.d());
        }
        else {
            this.I += v2;
        }
        if(!z) {
            if(this.I >= this.J) {
                this.b5();
            }
            int v3 = this.I;
            this.I = v3 + 1;
            this.H[v3] = this.G;
        }
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public void s3(w w0) throws IOException {
        if(this.a != null) {
            this.r5(w0);
            return;
        }
        int v = this.i.G(w0.getValue());
        if(v == 4) {
            this.i("Can not write a field name, expecting a value");
        }
        if(v == 1) {
            if(this.I >= this.J) {
                this.b5();
            }
            int v1 = this.I;
            this.I = v1 + 1;
            this.H[v1] = 44;
        }
        if(this.B) {
            this.M5(w0);
            return;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        byte[] arr_b = this.H;
        int v2 = this.I;
        this.I = v2 + 1;
        arr_b[v2] = this.G;
        int v3 = w0.e(arr_b, v2 + 1);
        if(v3 < 0) {
            this.k5(w0.d());
        }
        else {
            this.I += v3;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v4 = this.I;
        this.I = v4 + 1;
        this.H[v4] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void s4(String s, int v, int v1) throws IOException {
        this.S4(s, v, v1);
        char[] arr_c = this.L;
        if(v1 <= arr_c.length) {
            s.getChars(v, v + v1, arr_c, 0);
            this.t4(arr_c, 0, v1);
            return;
        }
        int v2 = Math.min(arr_c.length, (this.J >> 2) + (this.J >> 4));
        while(v1 > 0) {
            int v3 = Math.min(v2, v1);
            s.getChars(v, v + v3, arr_c, 0);
            if(this.I + v2 * 3 > this.J) {
                this.b5();
            }
            if(v3 > 1) {
                int v4 = arr_c[v3 - 1];
                if(v4 >= 0xD800 && v4 <= 0xDBFF) {
                    --v3;
                }
            }
            this.y5(arr_c, 0, v3);
            v += v3;
            v1 -= v3;
        }
    }

    protected final void s5(String s) throws IOException {
        int v = this.i.G(s);
        if(v == 4) {
            this.i("Can not write a field name, expecting a value");
        }
        if(v == 1) {
            this.a.i(this);
        }
        else {
            this.a.c(this);
        }
        if(this.B) {
            this.H5(s, false);
            return;
        }
        int v1 = s.length();
        if(v1 > this.M) {
            this.H5(s, true);
            return;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
        if(v1 <= this.K) {
            if(this.I + v1 > this.J) {
                this.b5();
            }
            this.B5(this.L, 0, v1);
        }
        else {
            this.I5(this.L, 0, v1);
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v3 = this.I;
        this.I = v3 + 1;
        this.H[v3] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public final void t4(char[] arr_c, int v, int v1) throws IOException {
        this.R4(arr_c, v, v1);
        int v2 = this.J;
        if(this.I + v1 * 3 > v2) {
            if(v2 < v1 * 3) {
                this.z5(arr_c, v, v1);
                return;
            }
            this.b5();
        }
        int v3 = v1 + v;
        while(v < v3) {
        label_9:
            int v4 = arr_c[v];
            if(v4 > 0x7F) {
                ++v;
                if(v4 < 0x800) {
                    byte[] arr_b = this.H;
                    int v5 = this.I;
                    this.I = v5 + 1;
                    arr_b[v5] = (byte)(v4 >> 6 | 0xC0);
                    this.I = v5 + 2;
                    arr_b[v5 + 1] = (byte)(v4 & 0x3F | 0x80);
                    continue;
                }
                v = this.e5(v4, arr_c, v, v3);
                continue;
            }
            int v6 = this.I;
            this.I = v6 + 1;
            this.H[v6] = (byte)v4;
            ++v;
            if(v >= v3) {
                break;
            }
            goto label_9;
        }
    }

    private final void t5(int v) throws IOException {
        if(this.I + 13 >= this.J) {
            this.b5();
        }
        byte[] arr_b = this.H;
        int v1 = this.I;
        this.I = v1 + 1;
        arr_b[v1] = this.G;
        int v2 = n.q(v, arr_b, v1 + 1);
        this.I = v2 + 1;
        this.H[v2] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void u4(byte[] arr_b, int v, int v1) throws IOException {
        this.Q4(arr_b, v, v1);
        this.X4("write a string");
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
        this.l5(arr_b, v, v1);
        if(this.I >= this.J) {
            this.b5();
        }
        int v3 = this.I;
        this.I = v3 + 1;
        this.H[v3] = this.G;
    }

    private final void u5(long v) throws IOException {
        if(this.I + 23 >= this.J) {
            this.b5();
        }
        byte[] arr_b = this.H;
        int v1 = this.I;
        this.I = v1 + 1;
        arr_b[v1] = this.G;
        int v2 = n.s(v, arr_b, v1 + 1);
        this.I = v2 + 1;
        this.H[v2] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void v3(String s) throws IOException {
        if(this.a != null) {
            this.s5(s);
            return;
        }
        int v = this.i.G(s);
        if(v == 4) {
            this.i("Can not write a field name, expecting a value");
        }
        if(v == 1) {
            if(this.I >= this.J) {
                this.b5();
            }
            int v1 = this.I;
            this.I = v1 + 1;
            this.H[v1] = 44;
        }
        if(this.B) {
            this.H5(s, false);
            return;
        }
        int v2 = s.length();
        if(v2 > this.M) {
            this.H5(s, true);
            return;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v3 = this.I;
        this.I = v3 + 1;
        this.H[v3] = this.G;
        if(v2 <= this.K) {
            if(v3 + 1 + v2 > this.J) {
                this.b5();
            }
            this.A5(s, 0, v2);
        }
        else {
            this.G5(s, 0, v2);
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v4 = this.I;
        this.I = v4 + 1;
        this.H[v4] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public void v4(w w0) throws IOException {
        this.X4("write a raw (unencoded) value");
        int v = w0.g(this.H, this.I);
        if(v < 0) {
            this.k5(w0.l());
            return;
        }
        this.I += v;
    }

    private final void v5(String s) throws IOException {
        if(this.I >= this.J) {
            this.b5();
        }
        int v = this.I;
        this.I = v + 1;
        this.H[v] = this.G;
        this.r4(s);
        if(this.I >= this.J) {
            this.b5();
        }
        int v1 = this.I;
        this.I = v1 + 1;
        this.H[v1] = this.G;
    }

    private void w5(char[] arr_c, int v, int v1) throws IOException {
        if(this.I >= this.J) {
            this.b5();
        }
        int v2 = this.I;
        this.I = v2 + 1;
        this.H[v2] = this.G;
        this.t4(arr_c, v, v1);
        if(this.I >= this.J) {
            this.b5();
        }
        int v3 = this.I;
        this.I = v3 + 1;
        this.H[v3] = this.G;
    }

    private final void x5(short v) throws IOException {
        if(this.I + 8 >= this.J) {
            this.b5();
        }
        byte[] arr_b = this.H;
        int v1 = this.I;
        this.I = v1 + 1;
        arr_b[v1] = this.G;
        int v2 = n.q(v, arr_b, v1 + 1);
        this.I = v2 + 1;
        this.H[v2] = this.G;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void y3() throws IOException {
        this.X4("write a null");
        this.q5();
    }

    private void y5(char[] arr_c, int v, int v1) throws IOException {
        while(v < v1) {
        label_1:
            int v2 = arr_c[v];
            if(v2 > 0x7F) {
                ++v;
                if(v2 < 0x800) {
                    byte[] arr_b = this.H;
                    int v3 = this.I;
                    this.I = v3 + 1;
                    arr_b[v3] = (byte)(v2 >> 6 | 0xC0);
                    this.I = v3 + 2;
                    arr_b[v3 + 1] = (byte)(v2 & 0x3F | 0x80);
                    continue;
                }
                v = this.e5(v2, arr_c, v, v1);
                continue;
            }
            int v4 = this.I;
            this.I = v4 + 1;
            this.H[v4] = (byte)v2;
            ++v;
            if(v >= v1) {
                break;
            }
            goto label_1;
        }
    }

    @Override  // com.fasterxml.jackson.core.k
    public final void z4() throws IOException {
        this.X4("start an array");
        this.i = this.i.v();
        this.g2().h(this.i.e());
        v v0 = this.a;
        if(v0 != null) {
            v0.f(this);
            return;
        }
        if(this.I >= this.J) {
            this.b5();
        }
        int v1 = this.I;
        this.I = v1 + 1;
        this.H[v1] = 91;
    }

    private final void z5(char[] arr_c, int v, int v1) throws IOException {
        int v2 = this.J;
        byte[] arr_b = this.H;
        int v3 = v1 + v;
        while(v < v3) {
        label_4:
            int v4 = arr_c[v];
            if(v4 >= 0x80) {
                if(this.I + 3 >= this.J) {
                    this.b5();
                }
                int v5 = arr_c[v];
                if(v5 < 0x800) {
                    int v6 = this.I;
                    this.I = v6 + 1;
                    arr_b[v6] = (byte)(v5 >> 6 | 0xC0);
                    this.I = v6 + 2;
                    arr_b[v6 + 1] = (byte)(v5 & 0x3F | 0x80);
                    ++v;
                    continue;
                }
                v = this.e5(v5, arr_c, v + 1, v3);
                continue;
            }
            if(this.I >= v2) {
                this.b5();
            }
            int v7 = this.I;
            this.I = v7 + 1;
            arr_b[v7] = (byte)v4;
            ++v;
            if(v >= v3) {
                break;
            }
            goto label_4;
        }
    }
}

