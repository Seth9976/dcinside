package com.fasterxml.jackson.core.io;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

public class f extends OutputStream {
    protected final DataOutput a;

    public f(DataOutput dataOutput0) {
        this.a = dataOutput0;
    }

    @Override
    public void write(int v) throws IOException {
        this.a.write(v);
    }

    @Override
    public void write(byte[] arr_b) throws IOException {
        this.a.write(arr_b, 0, arr_b.length);
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) throws IOException {
        this.a.write(arr_b, v, v1);
    }
}

