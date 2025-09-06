package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

class h {
    private final int a;
    private final int[] b;
    private int c;
    private static final long d = 0xFFFFFFFFL;

    public h(long v) {
        if(v <= 0L || v >= 0x7FFFFFFFL) {
            throw new IllegalArgumentException("numBits=" + v);
        }
        int v1 = ((int)(v + 0x3FL >>> 6)) + 1 << 1;
        this.a = v1;
        this.b = new int[v1];
        this.c = v1;
    }

    public void a(int v) {
        if(v == 0) {
            return;
        }
        long v1 = ((long)v) & 0xFFFFFFFFL;
        int v2;
        for(v2 = this.a - 1; v1 != 0L; --v2) {
            long v3 = (((long)this.d(v2)) & 0xFFFFFFFFL) + v1;
            this.e(v2, ((int)v3));
            v1 = v3 >>> 0x20;
        }
        this.c = Math.min(this.c, v2 + 1);
    }

    public void b(int v, int v1) {
        long v2 = (long)v1;
        int v3;
        for(v3 = this.a - 1; v3 >= this.c; --v3) {
            long v4 = (((long)this.d(v3)) & 0xFFFFFFFFL) * (((long)v) & 0xFFFFFFFFL) + v2;
            this.e(v3, ((int)v4));
            v2 = v4 >>> 0x20;
        }
        if(v2 != 0L) {
            this.e(v3, ((int)v2));
            this.c = v3;
        }
    }

    public BigInteger c() {
        byte[] arr_b = new byte[this.b.length << 2];
        IntBuffer intBuffer0 = ByteBuffer.wrap(arr_b).asIntBuffer();
        for(int v = 0; true; ++v) {
            int[] arr_v = this.b;
            if(v >= arr_v.length) {
                break;
            }
            intBuffer0.put(v, arr_v[v]);
        }
        return new BigInteger(arr_b);
    }

    private int d(int v) {
        return this.b[v];
    }

    private void e(int v, int v1) {
        this.b[v] = v1;
    }
}

