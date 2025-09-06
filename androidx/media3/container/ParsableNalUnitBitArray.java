package androidx.media3.container;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class ParsableNalUnitBitArray {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public ParsableNalUnitBitArray(byte[] arr_b, int v, int v1) {
        this.i(arr_b, v, v1);
    }

    private void a() {
        Assertions.i(this.c >= 0 && (this.c < this.b || this.c == this.b && this.d == 0));
    }

    public boolean b(int v) {
        int v1 = this.c;
        int v2 = v1 + v / 8;
        int v3 = this.d + v - v / 8 * 8;
        if(v3 > 7) {
            ++v2;
            v3 -= 8;
        }
        while(true) {
            ++v1;
            if(v1 > v2 || v2 >= this.b) {
                break;
            }
            if(this.j(v1)) {
                ++v2;
                v1 += 2;
            }
        }
        return v2 < this.b || v2 == this.b && v3 == 0;
    }

    public boolean c() {
        int v = this.c;
        int v1 = this.d;
        int v2;
        for(v2 = 0; this.c < this.b && !this.d(); ++v2) {
        }
        boolean z = this.c == this.b;
        this.c = v;
        this.d = v1;
        return !z && this.b(v2 * 2 + 1);
    }

    public boolean d() {
        boolean z = (this.a[this.c] & 0x80 >> this.d) != 0;
        this.k();
        return z;
    }

    public int e(int v) {
        int v3;
        int v2;
        this.d += v;
        int v1 = 0;
        while(true) {
            v2 = this.d;
            v3 = 2;
            if(v2 <= 8) {
                break;
            }
            this.d = v2 - 8;
            int v4 = this.c;
            v1 |= (this.a[v4] & 0xFF) << v2 - 8;
            if(!this.j(v4 + 1)) {
                v3 = 1;
            }
            this.c = v4 + v3;
        }
        int v5 = this.c;
        int v6 = -1 >>> 0x20 - v & (v1 | (this.a[v5] & 0xFF) >> 8 - v2);
        if(v2 == 8) {
            this.d = 0;
            if(!this.j(v5 + 1)) {
                v3 = 1;
            }
            this.c = v5 + v3;
        }
        this.a();
        return v6;
    }

    private int f() {
        int v = 0;
        int v1;
        for(v1 = 0; !this.d(); ++v1) {
        }
        if(v1 > 0) {
            v = this.e(v1);
        }
        return (1 << v1) - 1 + v;
    }

    public int g() {
        int v = this.f();
        return v % 2 == 0 ? -((v + 1) / 2) : (v + 1) / 2;
    }

    public int h() {
        return this.f();
    }

    public void i(byte[] arr_b, int v, int v1) {
        this.a = arr_b;
        this.c = v;
        this.b = v1;
        this.d = 0;
        this.a();
    }

    // 去混淆评级： 低(20)
    private boolean j(int v) {
        return 2 <= v && v < this.b && (this.a[v] == 3 && this.a[v - 2] == 0 && this.a[v - 1] == 0);
    }

    public void k() {
        int v = 1;
        int v1 = this.d + 1;
        this.d = v1;
        if(v1 == 8) {
            this.d = 0;
            int v2 = this.c;
            if(this.j(v2 + 1)) {
                v = 2;
            }
            this.c = v2 + v;
        }
        this.a();
    }

    public void l(int v) {
        int v1 = this.c;
        int v2 = v1 + v / 8;
        this.c = v2;
        int v3 = this.d + (v - v / 8 * 8);
        this.d = v3;
        if(v3 > 7) {
            this.c = v2 + 1;
            this.d = v3 - 8;
        }
        while(true) {
            ++v1;
            if(v1 > this.c) {
                break;
            }
            if(this.j(v1)) {
                ++this.c;
                v1 += 2;
            }
        }
        this.a();
    }
}

