package com.google.common.io;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@c
@d
@q
public final class p extends FilterOutputStream {
    private long a;

    public p(OutputStream outputStream0) {
        super(((OutputStream)H.E(outputStream0)));
    }

    public long a() {
        return this.a;
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }

    @Override
    public void write(int v) throws IOException {
        this.out.write(v);
        ++this.a;
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) throws IOException {
        this.out.write(arr_b, v, v1);
        this.a += (long)v1;
    }
}

