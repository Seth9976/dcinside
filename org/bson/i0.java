package org.bson;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bson.io.b;

public class i0 implements f {
    private static final int a = 4;

    @Override  // org.bson.f
    public i a(InputStream inputStream0) throws IOException {
        h0 h00 = new h0();
        this.d(inputStream0, h00);
        return (i)h00.get();
    }

    @Override  // org.bson.f
    public int b(byte[] arr_b, d d0) {
        try {
            return this.d(new ByteArrayInputStream(arr_b), d0);
        }
        catch(IOException iOException0) {
            throw new h("Invalid bytes received", iOException0);
        }
    }

    @Override  // org.bson.f
    public i c(byte[] arr_b) {
        h0 h00 = new h0();
        this.b(arr_b, h00);
        return (i)h00.get();
    }

    @Override  // org.bson.f
    public int d(InputStream inputStream0, d d0) throws IOException {
        byte[] arr_b = new byte[4];
        int v = b.e(inputStream0, arr_b);
        byte[] arr_b1 = Arrays.copyOf(arr_b, v);
        b.c(inputStream0, arr_b1, 4, v - 4);
        d0.g(null, 0, arr_b1);
        return v;
    }
}

