package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class VorbisBitArray {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;

    public VorbisBitArray(byte[] arr_b) {
        this.a = arr_b;
        this.b = arr_b.length;
    }

    private void a() {
        Assertions.i(this.c >= 0 && (this.c < this.b || this.c == this.b && this.d == 0));
    }

    public int b() {
        return (this.b - this.c) * 8 - this.d;
    }

    public int c() {
        return this.c * 8 + this.d;
    }

    public boolean d() {
        boolean z = ((this.a[this.c] & 0xFF) >> this.d & 1) == 1;
        this.h(1);
        return z;
    }

    public int e(int v) {
        int v1 = Math.min(v, 8 - this.d);
        int v2 = this.c + 1;
        int v3 = (this.a[this.c] & 0xFF) >> this.d & 0xFF >> 8 - v1;
        while(v1 < v) {
            v3 |= (this.a[v2] & 0xFF) << v1;
            v1 += 8;
            ++v2;
        }
        this.h(v);
        return v3 & -1 >>> 0x20 - v;
    }

    public void f() {
        this.c = 0;
        this.d = 0;
    }

    public void g(int v) {
        this.c = v / 8;
        this.d = v - v / 8 * 8;
        this.a();
    }

    public void h(int v) {
        int v1 = this.c + v / 8;
        this.c = v1;
        int v2 = this.d + (v - v / 8 * 8);
        this.d = v2;
        if(v2 > 7) {
            this.c = v1 + 1;
            this.d = v2 - 8;
        }
        this.a();
    }
}

