package com.facebook.common.memory;

import java.io.IOException;
import java.io.InputStream;
import k1.n.a;
import k1.n;
import p3.c;

@n(a.a)
@c
public class h extends InputStream {
    private final InputStream a;
    private final byte[] b;
    private final com.facebook.common.references.h c;
    private int d;
    private int e;
    private boolean f;
    private static final String g = "PooledByteInputStream";

    public h(InputStream inputStream0, byte[] arr_b, com.facebook.common.references.h h0) {
        this.a = (InputStream)com.facebook.common.internal.n.i(inputStream0);
        this.b = (byte[])com.facebook.common.internal.n.i(arr_b);
        this.c = (com.facebook.common.references.h)com.facebook.common.internal.n.i(h0);
        this.d = 0;
        this.e = 0;
        this.f = false;
    }

    private boolean a() throws IOException {
        if(this.e < this.d) {
            return true;
        }
        int v = this.a.read(this.b);
        if(v <= 0) {
            return false;
        }
        this.d = v;
        this.e = 0;
        return true;
    }

    @Override
    public int available() throws IOException {
        com.facebook.common.internal.n.o(this.e <= this.d);
        this.b();
        return this.d - this.e + this.a.available();
    }

    private void b() throws IOException {
        if(this.f) {
            throw new IOException("stream already closed");
        }
    }

    @Override
    public void close() throws IOException {
        if(!this.f) {
            this.f = true;
            this.c.a(this.b);
            super.close();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        if(!this.f) {
            x0.a.u("PooledByteInputStream", "Finalized without closing");
            this.close();
        }
        super.finalize();
    }

    @Override
    public int read() throws IOException {
        com.facebook.common.internal.n.o(this.e <= this.d);
        this.b();
        if(!this.a()) {
            return -1;
        }
        int v = this.e;
        this.e = v + 1;
        return this.b[v] & 0xFF;
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        com.facebook.common.internal.n.o(this.e <= this.d);
        this.b();
        if(!this.a()) {
            return -1;
        }
        int v2 = Math.min(this.d - this.e, v1);
        System.arraycopy(this.b, this.e, arr_b, v, v2);
        this.e += v2;
        return v2;
    }

    @Override
    public long skip(long v) throws IOException {
        com.facebook.common.internal.n.o(this.e <= this.d);
        this.b();
        int v1 = this.d;
        int v2 = this.e;
        long v3 = (long)(v1 - v2);
        if(v3 >= v) {
            this.e = (int)(((long)v2) + v);
            return v;
        }
        this.e = v1;
        return v3 + this.a.skip(v - v3);
    }
}

