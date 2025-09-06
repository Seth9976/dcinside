package com.google.common.hash;

import J1.a;
import com.google.common.base.H;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@a
@k
public final class v extends FilterOutputStream {
    private final s a;

    public v(q q0, OutputStream outputStream0) {
        super(((OutputStream)H.E(outputStream0)));
        this.a = (s)H.E(q0.i());
    }

    public p a() {
        return this.a.n();
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }

    @Override
    public void write(int v) throws IOException {
        this.a.g(((byte)v));
        this.out.write(v);
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) throws IOException {
        this.a.k(arr_b, v, v1);
        this.out.write(arr_b, v, v1);
    }
}

