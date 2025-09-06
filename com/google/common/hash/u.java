package com.google.common.hash;

import J1.a;
import com.google.common.base.H;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@a
@k
public final class u extends FilterInputStream {
    private final s a;

    public u(q q0, InputStream inputStream0) {
        super(((InputStream)H.E(inputStream0)));
        this.a = (s)H.E(q0.i());
    }

    public p a() {
        return this.a.n();
    }

    @Override
    public void mark(int readlimit) {
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    @O1.a
    public int read() throws IOException {
        int v = this.in.read();
        if(v != -1) {
            this.a.g(((byte)v));
        }
        return v;
    }

    @Override
    @O1.a
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.in.read(arr_b, v, v1);
        if(v2 != -1) {
            this.a.k(arr_b, v, v2);
        }
        return v2;
    }

    @Override
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }
}

