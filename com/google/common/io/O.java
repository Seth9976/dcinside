package com.google.common.io;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@c
@d
@q
public final class o extends FilterInputStream {
    private long a;
    private long b;

    public o(InputStream inputStream0) {
        super(((InputStream)H.E(inputStream0)));
        this.b = -1L;
    }

    public long a() {
        return this.a;
    }

    @Override
    public void mark(int v) {
        synchronized(this) {
            this.in.mark(v);
            this.b = this.a;
        }
    }

    @Override
    public int read() throws IOException {
        int v = this.in.read();
        if(v != -1) {
            ++this.a;
        }
        return v;
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.in.read(arr_b, v, v1);
        if(v2 != -1) {
            this.a += (long)v2;
        }
        return v2;
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            if(this.in.markSupported()) {
                if(this.b == -1L) {
                    throw new IOException("Mark not set");
                }
                this.in.reset();
                this.a = this.b;
                return;
            }
        }
        throw new IOException("Mark not supported");
    }

    @Override
    public long skip(long v) throws IOException {
        long v1 = this.in.skip(v);
        this.a += v1;
        return v1;
    }
}

