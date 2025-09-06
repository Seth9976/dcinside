package org.bson.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@Deprecated
public class b {
    public static void a(InputStream inputStream0, byte[] arr_b) throws IOException {
        b.b(inputStream0, arr_b, arr_b.length);
    }

    public static void b(InputStream inputStream0, byte[] arr_b, int v) throws IOException {
        b.c(inputStream0, arr_b, 0, v);
    }

    public static void c(InputStream inputStream0, byte[] arr_b, int v, int v1) throws IOException {
        if(arr_b.length < v1 + v) {
            throw new IllegalArgumentException("Buffer is too small");
        }
        while(v1 > 0) {
            int v2 = inputStream0.read(arr_b, v, v1);
            if(v2 < 0) {
                throw new EOFException();
            }
            v1 -= v2;
            v += v2;
        }
    }

    public static int d(InputStream inputStream0) throws IOException {
        return b.e(inputStream0, new byte[4]);
    }

    public static int e(InputStream inputStream0, byte[] arr_b) throws IOException {
        b.b(inputStream0, arr_b, 4);
        return b.f(arr_b);
    }

    public static int f(byte[] arr_b) {
        return b.g(arr_b, 0);
    }

    public static int g(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    public static int h(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }

    public static long i(InputStream inputStream0) throws IOException {
        return b.j(inputStream0, new byte[8]);
    }

    public static long j(InputStream inputStream0, byte[] arr_b) throws IOException {
        b.b(inputStream0, arr_b, 8);
        return b.k(arr_b);
    }

    public static long k(byte[] arr_b) {
        return b.l(arr_b, 0);
    }

    public static long l(byte[] arr_b, int v) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }
}

