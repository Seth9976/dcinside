package org.bson.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import org.bson.c0;
import org.bson.d0;

public class a extends g {
    private byte[] a;
    private int b;

    public a() {
        this(0x400);
    }

    public a(int v) {
        this.a = new byte[v];
    }

    @Override  // org.bson.io.g
    public List a() {
        this.n();
        return Arrays.asList(new c0[]{new d0(ByteBuffer.wrap(this.a, 0, this.b).duplicate().order(ByteOrder.LITTLE_ENDIAN))});
    }

    @Override  // org.bson.io.g
    public int b(OutputStream outputStream0) throws IOException {
        this.n();
        outputStream0.write(this.a, 0, this.b);
        return this.b;
    }

    @Override  // org.bson.io.g
    public void close() {
        this.a = null;
    }

    @Override  // org.bson.io.g
    protected void e(int v, int v1) {
        this.n();
        if(v < 0) {
            throw new IllegalArgumentException(String.format("position must be >= 0 but was %d", v));
        }
        if(v > this.b - 1) {
            throw new IllegalArgumentException(String.format("position must be <= %d but was %d", ((int)(this.b - 1)), v));
        }
        this.a[v] = (byte)(v1 & 0xFF);
    }

    @Override  // org.bson.io.g
    public void e1(int v) {
        this.n();
        if(v > this.b || v < 0) {
            throw new IllegalArgumentException();
        }
        this.b = v;
    }

    @Override  // org.bson.io.e
    public int getPosition() {
        this.n();
        return this.b;
    }

    @Override  // org.bson.io.e
    public int getSize() {
        this.n();
        return this.b;
    }

    @Override  // org.bson.io.e
    public void h3(byte[] arr_b, int v, int v1) {
        this.n();
        this.k(v1);
        System.arraycopy(arr_b, v, this.a, this.b, v1);
        this.b += v1;
    }

    private void k(int v) {
        int v1 = this.b;
        int v2 = v + v1;
        byte[] arr_b = this.a;
        if(v2 <= arr_b.length) {
            return;
        }
        byte[] arr_b1 = new byte[(arr_b.length * 2 >= v2 ? arr_b.length * 2 : v2 + 0x80)];
        System.arraycopy(arr_b, 0, arr_b1, 0, v1);
        this.a = arr_b1;
    }

    private void n() {
        if(this.a == null) {
            throw new IllegalStateException("The output is closed");
        }
    }

    public byte[] o() [...] // 潜在的解密器

    @Override  // org.bson.io.g
    public void write(byte[] arr_b) {
        this.n();
        this.write(arr_b, 0, arr_b.length);
    }

    @Override  // org.bson.io.e
    public void writeByte(int v) {
        this.n();
        this.k(1);
        int v1 = this.b;
        this.b = v1 + 1;
        this.a[v1] = (byte)(v & 0xFF);
    }
}

