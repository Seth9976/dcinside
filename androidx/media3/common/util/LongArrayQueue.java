package androidx.media3.common.util;

import androidx.annotation.VisibleForTesting;
import java.util.NoSuchElementException;

@UnstableApi
public final class LongArrayQueue {
    private int a;
    private int b;
    private int c;
    private long[] d;
    private int e;
    public static final int f = 16;

    public LongArrayQueue() {
        this(16);
    }

    public LongArrayQueue(int v) {
        Assertions.a(v >= 0 && v <= 0x40000000);
        if(v == 0) {
            v = 1;
        }
        if(Integer.bitCount(v) != 1) {
            v = Integer.highestOneBit(v - 1) << 1;
        }
        this.a = 0;
        this.b = -1;
        this.c = 0;
        long[] arr_v = new long[v];
        this.d = arr_v;
        this.e = arr_v.length - 1;
    }

    public void a(long v) {
        if(this.c == this.d.length) {
            this.d();
        }
        int v1 = this.b + 1 & this.e;
        this.b = v1;
        this.d[v1] = v;
        ++this.c;
    }

    @VisibleForTesting
    int b() {
        return this.d.length;
    }

    public void c() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    private void d() {
        long[] arr_v = this.d;
        int v = arr_v.length << 1;
        if(v < 0) {
            throw new IllegalStateException();
        }
        long[] arr_v1 = new long[v];
        int v1 = this.a;
        int v2 = arr_v.length - v1;
        System.arraycopy(arr_v, v1, arr_v1, 0, v2);
        System.arraycopy(this.d, 0, arr_v1, v2, v1);
        this.a = 0;
        this.b = this.c - 1;
        this.d = arr_v1;
        this.e = arr_v1.length - 1;
    }

    public long e() {
        if(this.c == 0) {
            throw new NoSuchElementException();
        }
        return this.d[this.a];
    }

    public boolean f() {
        return this.c == 0;
    }

    public long g() {
        int v = this.c;
        if(v == 0) {
            throw new NoSuchElementException();
        }
        int v1 = this.a;
        this.a = this.e & v1 + 1;
        this.c = v - 1;
        return this.d[v1];
    }

    public int h() {
        return this.c;
    }
}

