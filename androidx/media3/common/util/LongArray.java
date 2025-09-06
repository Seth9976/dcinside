package androidx.media3.common.util;

import java.util.Arrays;

@UnstableApi
public final class LongArray {
    private int a;
    private long[] b;
    private static final int c = 0x20;

    public LongArray() {
        this(0x20);
    }

    public LongArray(int v) {
        this.b = new long[v];
    }

    public void a(long v) {
        int v1 = this.a;
        long[] arr_v = this.b;
        if(v1 == arr_v.length) {
            this.b = Arrays.copyOf(arr_v, v1 * 2);
        }
        int v2 = this.a;
        this.a = v2 + 1;
        this.b[v2] = v;
    }

    public long b(int v) {
        if(v < 0 || v >= this.a) {
            throw new IndexOutOfBoundsException("Invalid index " + v + ", size is " + this.a);
        }
        return this.b[v];
    }

    public int c() {
        return this.a;
    }

    public long[] d() {
        return Arrays.copyOf(this.b, this.a);
    }
}

