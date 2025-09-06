package androidx.media3.common.util;

import O1.b;
import com.google.common.base.f;
import java.nio.charset.Charset;

@b
@UnstableApi
public final class ParsableBitArray {
    public byte[] a;
    private int b;
    private int c;
    private int d;

    public ParsableBitArray() {
        this.a = Util.f;
    }

    public ParsableBitArray(byte[] arr_b) {
        this(arr_b, arr_b.length);
    }

    public ParsableBitArray(byte[] arr_b, int v) {
        this.a = arr_b;
        this.d = v;
    }

    private void a() {
        Assertions.i(this.b >= 0 && (this.b < this.d || this.b == this.d && this.c == 0));
    }

    public int b() {
        return (this.d - this.b) * 8 - this.c;
    }

    public void c() {
        if(this.c == 0) {
            return;
        }
        this.c = 0;
        ++this.b;
        this.a();
    }

    public int d() {
        Assertions.i(this.c == 0);
        return this.b;
    }

    public int e() {
        return this.b * 8 + this.c;
    }

    public void f(int v, int v1) {
        if(v1 < 0x20) {
            v &= (1 << v1) - 1;
        }
        int v2 = Math.min(8 - this.c, v1);
        int v3 = 8 - this.c - v2;
        byte[] arr_b = this.a;
        int v4 = this.b;
        byte b = (byte)((0xFF00 >> this.c | (1 << v3) - 1) & arr_b[v4]);
        arr_b[v4] = b;
        int v5 = v1 - v2;
        arr_b[v4] = (byte)(b | v >>> v5 << v3);
        int v6;
        for(v6 = v4 + 1; v5 > 8; ++v6) {
            this.a[v6] = (byte)(v >>> v5 - 8);
            v5 -= 8;
        }
        byte[] arr_b1 = this.a;
        byte b1 = (byte)(arr_b1[v6] & (1 << 8 - v5) - 1);
        arr_b1[v6] = b1;
        arr_b1[v6] = (byte)((v & (1 << v5) - 1) << 8 - v5 | b1);
        this.s(v1);
        this.a();
    }

    public boolean g() {
        boolean z = (this.a[this.b] & 0x80 >> this.c) != 0;
        this.r();
        return z;
    }

    public int h(int v) {
        if(v == 0) {
            return 0;
        }
        this.c += v;
        int v1 = 0;
        int v2;
        while((v2 = this.c) > 8) {
            this.c = v2 - 8;
            int v3 = this.b;
            this.b = v3 + 1;
            v1 |= (this.a[v3] & 0xFF) << v2 - 8;
        }
        int v4 = this.b;
        int v5 = -1 >>> 0x20 - v & (v1 | (this.a[v4] & 0xFF) >> 8 - v2);
        if(v2 == 8) {
            this.c = 0;
            this.b = v4 + 1;
        }
        this.a();
        return v5;
    }

    public void i(byte[] arr_b, int v, int v1) {
        int v2 = (v1 >> 3) + v;
        while(v < v2) {
            byte[] arr_b1 = this.a;
            int v3 = this.b;
            this.b = v3 + 1;
            int v4 = this.c;
            byte b = (byte)(arr_b1[v3] << v4);
            arr_b[v] = b;
            arr_b[v] = (byte)((0xFF & arr_b1[v3 + 1]) >> 8 - v4 | b);
            ++v;
        }
        if((v1 & 7) == 0) {
            return;
        }
        byte b1 = (byte)(arr_b[v2] & 0xFF >> (v1 & 7));
        arr_b[v2] = b1;
        int v5 = this.c;
        if(v5 + (v1 & 7) > 8) {
            int v6 = this.b;
            this.b = v6 + 1;
            arr_b[v2] = (byte)(b1 | (this.a[v6] & 0xFF) << v5);
            this.c = v5 - 8;
        }
        int v7 = this.c + (v1 & 7);
        this.c = v7;
        int v8 = this.b;
        arr_b[v2] = (byte)(((byte)((0xFF & this.a[v8]) >> 8 - v7 << 8 - (v1 & 7))) | arr_b[v2]);
        if(v7 == 8) {
            this.c = 0;
            this.b = v8 + 1;
        }
        this.a();
    }

    public long j(int v) {
        return v > 0x20 ? Util.x2(this.h(v - 0x20), this.h(0x20)) : Util.y2(this.h(v));
    }

    public void k(byte[] arr_b, int v, int v1) {
        Assertions.i(this.c == 0);
        System.arraycopy(this.a, this.b, arr_b, v, v1);
        this.b += v1;
        this.a();
    }

    public String l(int v) {
        return this.m(v, f.c);
    }

    public String m(int v, Charset charset0) {
        byte[] arr_b = new byte[v];
        this.k(arr_b, 0, v);
        return new String(arr_b, charset0);
    }

    public void n(ParsableByteArray parsableByteArray0) {
        this.p(parsableByteArray0.e(), parsableByteArray0.g());
        this.q(parsableByteArray0.f() * 8);
    }

    public void o(byte[] arr_b) {
        this.p(arr_b, arr_b.length);
    }

    public void p(byte[] arr_b, int v) {
        this.a = arr_b;
        this.b = 0;
        this.c = 0;
        this.d = v;
    }

    public void q(int v) {
        this.b = v / 8;
        this.c = v - v / 8 * 8;
        this.a();
    }

    public void r() {
        int v = this.c + 1;
        this.c = v;
        if(v == 8) {
            this.c = 0;
            ++this.b;
        }
        this.a();
    }

    public void s(int v) {
        int v1 = this.b + v / 8;
        this.b = v1;
        int v2 = this.c + (v - v / 8 * 8);
        this.c = v2;
        if(v2 > 7) {
            this.b = v1 + 1;
            this.c = v2 - 8;
        }
        this.a();
    }

    public void t(int v) {
        Assertions.i(this.c == 0);
        this.b += v;
        this.a();
    }
}

