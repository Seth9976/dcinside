package com.facebook.common.memory;

import androidx.annotation.VisibleForTesting;
import java.io.InputStream;
import k1.n.a;
import k1.n;
import p3.c;

@n(a.a)
@c
public class k extends InputStream {
    @VisibleForTesting
    final i a;
    @VisibleForTesting
    int b;
    @VisibleForTesting
    int c;

    public k(i i0) {
        com.facebook.common.internal.n.d(Boolean.valueOf(!i0.isClosed()));
        this.a = (i)com.facebook.common.internal.n.i(i0);
        this.b = 0;
        this.c = 0;
    }

    @Override
    public int available() {
        return this.a.size() - this.b;
    }

    @Override
    public void mark(int v) {
        this.c = this.b;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read() {
        if(this.available() <= 0) {
            return -1;
        }
        int v = this.b;
        this.b = v + 1;
        return this.a.G(v) & 0xFF;
    }

    @Override
    public int read(byte[] arr_b) {
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) {
        if(v < 0 || v1 < 0 || v + v1 > arr_b.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + arr_b.length + "; regionStart=" + v + "; regionLength=" + v1);
        }
        int v2 = this.available();
        if(v2 <= 0) {
            return -1;
        }
        if(v1 <= 0) {
            return 0;
        }
        int v3 = Math.min(v2, v1);
        this.a.m(this.b, arr_b, v, v3);
        this.b += v3;
        return v3;
    }

    @Override
    public void reset() {
        this.b = this.c;
    }

    @Override
    public long skip(long v) {
        com.facebook.common.internal.n.d(Boolean.valueOf(v >= 0L));
        int v1 = Math.min(((int)v), this.available());
        this.b += v1;
        return (long)v1;
    }
}

