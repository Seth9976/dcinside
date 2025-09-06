package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class g extends OutputStream {
    protected final ByteBuffer a;

    public g(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
    }

    @Override
    public void write(int v) throws IOException {
        this.a.put(((byte)v));
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) throws IOException {
        this.a.put(arr_b, v, v1);
    }
}

