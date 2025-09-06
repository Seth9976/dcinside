package org.bson;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.bson.io.b;

public class k implements f {
    @Override  // org.bson.f
    public i a(InputStream inputStream0) throws IOException {
        return this.c(this.e(inputStream0));
    }

    @Override  // org.bson.f
    public int b(byte[] arr_b, d d0) {
        try(p p0 = new p(new org.bson.io.f(new d0(ByteBuffer.wrap(arr_b))))) {
            new e(new b0(), d0).a1(p0);
            return p0.g2().getPosition();
        }
    }

    @Override  // org.bson.f
    public i c(byte[] arr_b) {
        j j0 = new j();
        this.b(arr_b, j0);
        return (i)j0.get();
    }

    @Override  // org.bson.f
    public int d(InputStream inputStream0, d d0) throws IOException {
        return this.b(this.e(inputStream0), d0);
    }

    private byte[] e(InputStream inputStream0) throws IOException {
        byte[] arr_b = new byte[4];
        b.a(inputStream0, arr_b);
        int v = b.f(arr_b);
        byte[] arr_b1 = new byte[v];
        System.arraycopy(arr_b, 0, arr_b1, 0, 4);
        b.c(inputStream0, arr_b1, 4, v - 4);
        return arr_b1;
    }
}

