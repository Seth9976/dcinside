package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;

public final class k extends InputStream {
    private final g a;
    private final InputStream b;
    private byte[] c;
    private int d;
    private final int e;

    public k(g g0, InputStream inputStream0, byte[] arr_b, int v, int v1) {
        this.a = g0;
        this.b = inputStream0;
        this.c = arr_b;
        this.d = v;
        this.e = v1;
    }

    private void a() {
        byte[] arr_b = this.c;
        if(arr_b != null) {
            this.c = null;
            g g0 = this.a;
            if(g0 != null) {
                g0.e0(arr_b);
            }
        }
    }

    @Override
    public int available() throws IOException {
        return this.c == null ? this.b.available() : this.e - this.d;
    }

    @Override
    public void close() throws IOException {
        this.a();
        this.b.close();
    }

    @Override
    public void mark(int v) {
        synchronized(this) {
            if(this.c == null) {
                this.b.mark(v);
            }
        }
    }

    @Override
    public boolean markSupported() {
        return this.c == null && this.b.markSupported();
    }

    @Override
    public int read() throws IOException {
        byte[] arr_b = this.c;
        if(arr_b != null) {
            int v = this.d;
            this.d = v + 1;
            int v1 = arr_b[v] & 0xFF;
            if(v + 1 >= this.e) {
                this.a();
            }
            return v1;
        }
        return this.b.read();
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        byte[] arr_b1 = this.c;
        if(arr_b1 != null) {
            int v2 = this.d;
            int v3 = this.e - v2;
            if(v1 > v3) {
                v1 = v3;
            }
            System.arraycopy(arr_b1, v2, arr_b, v, v1);
            int v4 = this.d + v1;
            this.d = v4;
            if(v4 >= this.e) {
                this.a();
            }
            return v1;
        }
        return this.b.read(arr_b, v, v1);
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            if(this.c == null) {
                this.b.reset();
            }
        }
    }

    @Override
    public long skip(long v) throws IOException {
        if(this.c != null) {
            int v1 = this.d;
            long v2 = (long)(this.e - v1);
            if(v2 > v) {
                this.d = v1 + ((int)v);
                return v;
            }
            this.a();
            v -= v2;
            return v <= 0L ? v2 : v2 + this.b.skip(v);
        }
        return v <= 0L ? 0L : this.b.skip(v);
    }
}

