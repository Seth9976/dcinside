package com.facebook.common.internal;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public class e extends FilterOutputStream {
    private long a;

    public e(OutputStream outputStream0) {
        super(outputStream0);
        this.a = 0L;
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

