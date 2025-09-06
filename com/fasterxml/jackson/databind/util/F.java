package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class f extends InputStream {
    protected final ByteBuffer a;

    public f(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
    }

    @Override
    public int available() {
        return this.a.remaining();
    }

    // 去混淆评级： 低(20)
    @Override
    public int read() throws IOException {
        return this.a.hasRemaining() ? this.a.get() & 0xFF : -1;
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        if(!this.a.hasRemaining()) {
            return -1;
        }
        int v2 = Math.min(v1, this.a.remaining());
        this.a.get(arr_b, v, v2);
        return v2;
    }
}

