package androidx.media3.common.util;

import O1.b;
import androidx.annotation.Nullable;
import com.google.common.base.f;
import com.google.common.collect.a3;
import com.google.common.primitives.c;
import com.google.common.primitives.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

@b
@UnstableApi
public final class ParsableByteArray {
    private byte[] a;
    private int b;
    private int c;
    private static final char[] d;
    private static final char[] e;
    private static final a3 f;

    static {
        ParsableByteArray.d = new char[]{'\r', '\n'};
        ParsableByteArray.e = new char[]{'\n'};
        ParsableByteArray.f = a3.G(f.a, f.c, f.f, f.d, f.e);
    }

    public ParsableByteArray() {
        this.a = Util.f;
    }

    public ParsableByteArray(int v) {
        this.a = new byte[v];
        this.c = v;
    }

    public ParsableByteArray(byte[] arr_b) {
        this.a = arr_b;
        this.c = arr_b.length;
    }

    public ParsableByteArray(byte[] arr_b, int v) {
        this.a = arr_b;
        this.c = v;
    }

    public long A() {
        int v = this.b;
        this.b = v + 4;
        return (((long)this.a[v + 3]) & 0xFFL) << 24 | (((long)this.a[v]) & 0xFFL | (((long)this.a[v + 1]) & 0xFFL) << 8 | (((long)this.a[v + 2]) & 0xFFL) << 16);
    }

    public int B() {
        int v = this.b;
        this.b = v + 3;
        return (this.a[v + 2] & 0xFF) << 16 | ((this.a[v + 1] & 0xFF) << 8 | this.a[v] & 0xFF);
    }

    public int C() {
        int v = this.w();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public int D() {
        int v = this.b;
        this.b = v + 2;
        return (this.a[v + 1] & 0xFF) << 8 | this.a[v] & 0xFF;
    }

    public long E() {
        int v = this.b;
        this.b = v + 8;
        return ((long)this.a[v + 7]) & 0xFFL | ((((long)this.a[v]) & 0xFFL) << 56 | (((long)this.a[v + 1]) & 0xFFL) << 0x30 | (((long)this.a[v + 2]) & 0xFFL) << 40 | (((long)this.a[v + 3]) & 0xFFL) << 0x20 | (((long)this.a[v + 4]) & 0xFFL) << 24 | (((long)this.a[v + 5]) & 0xFFL) << 16 | (((long)this.a[v + 6]) & 0xFFL) << 8);
    }

    @Nullable
    public String F() {
        return this.p('\u0000');
    }

    public String G(int v) {
        if(v == 0) {
            return "";
        }
        int v1 = this.b + v - 1;
        String s = Util.U(this.a, this.b, (v1 >= this.c || this.a[v1] != 0 ? v : v - 1));
        this.b += v;
        return s;
    }

    public short H() {
        int v = this.b;
        this.b = v + 2;
        return (short)(this.a[v + 1] & 0xFF | (this.a[v] & 0xFF) << 8);
    }

    public String I(int v) {
        return this.J(v, f.c);
    }

    public String J(int v, Charset charset0) {
        String s = new String(this.a, this.b, v, charset0);
        this.b += v;
        return s;
    }

    public int K() {
        return this.L() << 21 | this.L() << 14 | this.L() << 7 | this.L();
    }

    public int L() {
        int v = this.b;
        this.b = v + 1;
        return this.a[v] & 0xFF;
    }

    public int M() {
        int v = this.b;
        this.b = v + 4;
        return this.a[v + 1] & 0xFF | (this.a[v] & 0xFF) << 8;
    }

    public long N() {
        int v = this.b;
        this.b = v + 4;
        return ((long)this.a[v + 3]) & 0xFFL | ((((long)this.a[v]) & 0xFFL) << 24 | (((long)this.a[v + 1]) & 0xFFL) << 16 | (((long)this.a[v + 2]) & 0xFFL) << 8);
    }

    public int O() {
        int v = this.b;
        this.b = v + 3;
        return this.a[v + 2] & 0xFF | ((this.a[v + 1] & 0xFF) << 8 | (this.a[v] & 0xFF) << 16);
    }

    public int P() {
        int v = this.s();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public long Q() {
        long v = this.E();
        if(v < 0L) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public int R() {
        int v = this.b;
        this.b = v + 2;
        return this.a[v + 1] & 0xFF | (this.a[v] & 0xFF) << 8;
    }

    public long S() {
        int v3;
        int v2;
        long v = (long)this.a[this.b];
        int v1 = 7;
        while(true) {
            v2 = 1;
            if(v1 >= 0) {
                if((((long)(1 << v1)) & v) == 0L) {
                    if(v1 < 6) {
                        v &= (long)((1 << v1) - 1);
                        v3 = 7 - v1;
                        break;
                    }
                    if(v1 == 7) {
                        v3 = 1;
                        break;
                    }
                }
                else {
                    --v1;
                    continue;
                }
            }
            v3 = 0;
            break;
        }
        if(v3 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + v);
        }
        while(v2 < v3) {
            int v4 = this.a[this.b + v2];
            if((v4 & 0xC0) != 0x80) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + v);
            }
            v = v << 6 | ((long)(v4 & 0x3F));
            ++v2;
        }
        this.b += v3;
        return v;
    }

    @Nullable
    public Charset T() {
        if(this.a() >= 3) {
            int v = this.b;
            if(this.a[v] == -17 && this.a[v + 1] == -69 && this.a[v + 2] == -65) {
                this.b = v + 3;
                return f.c;
            }
        }
        if(this.a() >= 2) {
            byte[] arr_b = this.a;
            int v1 = this.b;
            int v2 = arr_b[v1];
            if(v2 == -2 && arr_b[v1 + 1] == -1) {
                this.b = v1 + 2;
                return f.d;
            }
            if(v2 == -1 && arr_b[v1 + 1] == -2) {
                this.b = v1 + 2;
                return f.e;
            }
        }
        return null;
    }

    public void U(int v) {
        this.W((this.b() >= v ? this.a : new byte[v]), v);
    }

    public void V(byte[] arr_b) {
        this.W(arr_b, arr_b.length);
    }

    public void W(byte[] arr_b, int v) {
        this.a = arr_b;
        this.c = v;
        this.b = 0;
    }

    public void X(int v) {
        Assertions.a(v >= 0 && v <= this.a.length);
        this.c = v;
    }

    public void Y(int v) {
        Assertions.a(v >= 0 && v <= this.c);
        this.b = v;
    }

    public void Z(int v) {
        this.Y(this.b + v);
    }

    public int a() {
        return this.c - this.b;
    }

    private void a0(Charset charset0) {
        if(this.o(charset0, ParsableByteArray.d) == 13) {
            this.o(charset0, ParsableByteArray.e);
        }
    }

    public int b() {
        return this.a.length;
    }

    public void c(int v) {
        if(v > this.b()) {
            this.a = Arrays.copyOf(this.a, v);
        }
    }

    private int d(Charset charset0) {
        int v2;
        int v;
        if(charset0.equals(f.c) || charset0.equals(f.a)) {
            v = 1;
        }
        else {
            if(!charset0.equals(f.f) && !charset0.equals(f.e) && !charset0.equals(f.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset0);
            }
            v = 2;
        }
        for(int v1 = this.b; true; v1 += v) {
            v2 = this.c;
            if(v1 >= v2 - (v - 1)) {
                break;
            }
            if((charset0.equals(f.c) || charset0.equals(f.a)) && Util.h1(this.a[v1])) {
                return v1;
            }
            if((charset0.equals(f.f) || charset0.equals(f.d)) && (this.a[v1] == 0 && Util.h1(this.a[v1 + 1]))) {
                return v1;
            }
            if(charset0.equals(f.e) && (this.a[v1 + 1] == 0 && Util.h1(this.a[v1]))) {
                return v1;
            }
        }
        return v2;
    }

    public byte[] e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public char h() {
        return (char)(this.a[this.b + 1] & 0xFF | (this.a[this.b] & 0xFF) << 8);
    }

    public char i(Charset charset0) {
        Assertions.b(ParsableByteArray.f.contains(charset0), "Unsupported charset: " + charset0);
        return (char)(this.j(charset0) >> 16);
    }

    private int j(Charset charset0) {
        if((charset0.equals(f.c) || charset0.equals(f.a)) && this.a() >= 1) {
            return (c.d(((byte)c.d(u.p(this.a[this.b])))) << 16) + 1;
        }
        if((charset0.equals(f.f) || charset0.equals(f.d)) && this.a() >= 2) {
            return (c.d(((byte)c.k(this.a[this.b], this.a[this.b + 1]))) << 16) + 2;
        }
        return !charset0.equals(f.e) || this.a() < 2 ? 0 : (c.d(((byte)c.k(this.a[this.b + 1], this.a[this.b]))) << 16) + 2;
    }

    public int k() {
        return this.a[this.b] & 0xFF;
    }

    public void l(ParsableBitArray parsableBitArray0, int v) {
        this.n(parsableBitArray0.a, 0, v);
        parsableBitArray0.q(0);
    }

    public void m(ByteBuffer byteBuffer0, int v) {
        byteBuffer0.put(this.a, this.b, v);
        this.b += v;
    }

    public void n(byte[] arr_b, int v, int v1) {
        System.arraycopy(this.a, this.b, arr_b, v, v1);
        this.b += v1;
    }

    private char o(Charset charset0, char[] arr_c) {
        int v = this.j(charset0);
        if(v != 0 && c.h(arr_c, ((char)(v >> 16)))) {
            this.b += v & 0xFFFF;
            return (char)(v >> 16);
        }
        return '\u0000';
    }

    @Nullable
    public String p(char c) {
        if(this.a() == 0) {
            return null;
        }
        int v;
        for(v = this.b; v < this.c && this.a[v] != c; ++v) {
        }
        String s = Util.U(this.a, this.b, v - this.b);
        this.b = v;
        if(v < this.c) {
            this.b = v + 1;
        }
        return s;
    }

    public double q() {
        return Double.longBitsToDouble(this.E());
    }

    public float r() {
        return Float.intBitsToFloat(this.s());
    }

    public int s() {
        int v = this.b;
        this.b = v + 4;
        return this.a[v + 3] & 0xFF | ((this.a[v + 1] & 0xFF) << 16 | (this.a[v] & 0xFF) << 24 | (this.a[v + 2] & 0xFF) << 8);
    }

    public int t() {
        int v = this.b;
        this.b = v + 3;
        return this.a[v + 2] & 0xFF | ((this.a[v + 1] & 0xFF) << 8 | (this.a[v] & 0xFF) << 24 >> 8);
    }

    @Nullable
    public String u() {
        return this.v(f.c);
    }

    @Nullable
    public String v(Charset charset0) {
        Assertions.b(ParsableByteArray.f.contains(charset0), "Unsupported charset: " + charset0);
        if(this.a() == 0) {
            return null;
        }
        if(!charset0.equals(f.a)) {
            this.T();
        }
        String s = this.J(this.d(charset0) - this.b, charset0);
        if(this.b == this.c) {
            return s;
        }
        this.a0(charset0);
        return s;
    }

    public int w() {
        int v = this.b;
        this.b = v + 4;
        return (this.a[v + 3] & 0xFF) << 24 | ((this.a[v + 1] & 0xFF) << 8 | this.a[v] & 0xFF | (this.a[v + 2] & 0xFF) << 16);
    }

    public int x() {
        int v = this.b;
        this.b = v + 3;
        return (this.a[v + 2] & 0xFF) << 16 | ((this.a[v + 1] & 0xFF) << 8 | this.a[v] & 0xFF);
    }

    public long y() {
        int v = this.b;
        this.b = v + 8;
        return (((long)this.a[v + 7]) & 0xFFL) << 56 | (((long)this.a[v]) & 0xFFL | (((long)this.a[v + 1]) & 0xFFL) << 8 | (((long)this.a[v + 2]) & 0xFFL) << 16 | (((long)this.a[v + 3]) & 0xFFL) << 24 | (((long)this.a[v + 4]) & 0xFFL) << 0x20 | (((long)this.a[v + 5]) & 0xFFL) << 40 | (((long)this.a[v + 6]) & 0xFFL) << 0x30);
    }

    public short z() {
        int v = this.b;
        this.b = v + 2;
        return (short)((this.a[v + 1] & 0xFF) << 8 | this.a[v] & 0xFF);
    }
}

