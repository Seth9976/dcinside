package com.facebook.common.internal;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import k1.n.a;
import k1.n;

@n(a.a)
public final class b {
    static final class com.facebook.common.internal.b.a extends ByteArrayOutputStream {
        private com.facebook.common.internal.b.a() {
        }

        com.facebook.common.internal.b.a(c c0) {
        }

        void a(byte[] arr_b, int v) {
            System.arraycopy(this.buf, 0, arr_b, v, this.count);
        }
    }

    private static final int a = 0x1000;

    public static long a(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        com.facebook.common.internal.n.i(inputStream0);
        com.facebook.common.internal.n.i(outputStream0);
        byte[] arr_b = new byte[0x1000];
        long v = 0L;
        int v1;
        while((v1 = inputStream0.read(arr_b)) != -1) {
            outputStream0.write(arr_b, 0, v1);
            v += (long)v1;
        }
        return v;
    }

    public static int b(InputStream inputStream0, byte[] arr_b, int v, int v1) throws IOException {
        com.facebook.common.internal.n.i(inputStream0);
        com.facebook.common.internal.n.i(arr_b);
        if(v1 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int v2;
        for(v2 = 0; v2 < v1; v2 += v3) {
            int v3 = inputStream0.read(arr_b, v + v2, v1 - v2);
            if(v3 == -1) {
                break;
            }
        }
        return v2;
    }

    public static void c(InputStream inputStream0, byte[] arr_b, int v, int v1) throws IOException {
        int v2 = b.b(inputStream0, arr_b, v, v1);
        if(v2 != v1) {
            throw new EOFException("reached end of stream after reading " + v2 + " bytes; " + v1 + " bytes expected");
        }
    }

    public static byte[] d(InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        b.a(inputStream0, byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }

    public static byte[] e(InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        for(int v1 = v; v1 > 0; v1 -= v3) {
            int v2 = v - v1;
            int v3 = inputStream0.read(arr_b, v2, v1);
            if(v3 == -1) {
                return Arrays.copyOf(arr_b, v2);
            }
        }
        int v4 = inputStream0.read();
        if(v4 == -1) {
            return arr_b;
        }
        com.facebook.common.internal.b.a b$a0 = new com.facebook.common.internal.b.a(null);
        b$a0.write(v4);
        b.a(inputStream0, b$a0);
        byte[] arr_b1 = new byte[b$a0.size() + v];
        System.arraycopy(arr_b, 0, arr_b1, 0, v);
        b$a0.a(arr_b1, v);
        return arr_b1;
    }
}

