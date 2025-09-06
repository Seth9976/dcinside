package com.google.crypto.tink.subtle;

import L1.a;
import java.security.InvalidKeyException;
import java.util.Arrays;

@a
final class k {
    static final byte[][] a;

    static {
        k.a = new byte[][]{new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{(byte)0xE0, -21, 0x7A, 0x7C, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, (byte)0x8D, -21, -100, 50, (byte)0xB1, -3, (byte)0x86, 98, 5, 22, 0x5F, 73, -72, 0}, new byte[]{0x5F, -100, -107, -68, -93, 80, (byte)0x8C, 36, (byte)0xB1, (byte)0xD0, (byte)0xB1, 85, -100, (byte)0x83, -17, 91, 4, 68, 92, -60, 88, 28, (byte)0x8E, (byte)0x86, -40, 34, 78, -35, (byte)0xD0, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0x7F}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0x7F}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0x7F}};
    }

    static void a(long[] arr_v, long[] arr_v1, int v) {
        for(int v1 = 0; v1 < 10; ++v1) {
            long v2 = arr_v[v1];
            arr_v[v1] = (long)(((int)v2) ^ (((int)v2) ^ ((int)arr_v1[v1])) & -v);
        }
    }

    static void b(long[] arr_v, byte[] arr_b, byte[] arr_b1) throws InvalidKeyException {
        long[] arr_v1 = B.c(k.f(arr_b1));
        long[] arr_v2 = new long[19];
        long[] arr_v3 = new long[19];
        arr_v3[0] = 1L;
        long[] arr_v4 = new long[19];
        arr_v4[0] = 1L;
        long[] arr_v5 = new long[19];
        long[] arr_v6 = new long[19];
        long[] arr_v7 = new long[19];
        arr_v7[0] = 1L;
        long[] arr_v8 = new long[19];
        long[] arr_v9 = new long[19];
        arr_v9[0] = 1L;
        System.arraycopy(arr_v1, 0, arr_v2, 0, 10);
        int v = 0;
        while(v < 0x20) {
            int v1 = arr_b[0x1F - v] & 0xFF;
            long[] arr_v10 = arr_v6;
            long[] arr_v11 = arr_v8;
            long[] arr_v12 = arr_v9;
            long[] arr_v13 = arr_v3;
            long[] arr_v14 = arr_v7;
            long[] arr_v15 = arr_v2;
            long[] arr_v16 = arr_v4;
            long[] arr_v17 = arr_v5;
            int v2 = 0;
            while(v2 < 8) {
                int v3 = v1 >> 7 - v2 & 1;
                k.e(arr_v16, arr_v15, v3);
                k.e(arr_v17, arr_v13, v3);
                long[] arr_v18 = arr_v17;
                long[] arr_v19 = arr_v16;
                long[] arr_v20 = arr_v13;
                long[] arr_v21 = arr_v15;
                k.d(arr_v11, arr_v12, arr_v10, arr_v14, arr_v16, arr_v17, arr_v15, arr_v13, arr_v1);
                k.e(arr_v11, arr_v10, v3);
                k.e(arr_v12, arr_v14, v3);
                ++v2;
                arr_v13 = arr_v14;
                arr_v17 = arr_v12;
                arr_v16 = arr_v11;
                arr_v15 = arr_v10;
                arr_v12 = arr_v18;
                arr_v11 = arr_v19;
                arr_v14 = arr_v20;
                arr_v10 = arr_v21;
            }
            arr_v7 = arr_v14;
            ++v;
            arr_v9 = arr_v12;
            arr_v8 = arr_v11;
            arr_v6 = arr_v10;
            arr_v5 = arr_v17;
            arr_v4 = arr_v16;
            arr_v3 = arr_v13;
            arr_v2 = arr_v15;
        }
        long[] arr_v22 = new long[10];
        B.e(arr_v22, arr_v5);
        B.f(arr_v, arr_v4, arr_v22);
        if(!k.c(arr_v1, arr_v, arr_v2, arr_v3)) {
            throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + C.b(arr_b1));
        }
    }

    private static boolean c(long[] arr_v, long[] arr_v1, long[] arr_v2, long[] arr_v3) {
        long[] arr_v4 = new long[10];
        long[] arr_v5 = new long[10];
        long[] arr_v6 = new long[11];
        long[] arr_v7 = new long[11];
        long[] arr_v8 = new long[11];
        B.f(arr_v4, arr_v, arr_v1);
        B.q(arr_v5, arr_v, arr_v1);
        long[] arr_v9 = new long[10];
        arr_v9[0] = 0x76D06L;
        B.q(arr_v7, arr_v5, arr_v9);
        B.f(arr_v7, arr_v7, arr_v3);
        B.p(arr_v7, arr_v2);
        B.f(arr_v7, arr_v7, arr_v4);
        B.f(arr_v7, arr_v7, arr_v2);
        B.k(arr_v6, arr_v7, 4L);
        B.i(arr_v6);
        B.f(arr_v7, arr_v4, arr_v3);
        B.o(arr_v7, arr_v7, arr_v3);
        B.f(arr_v8, arr_v5, arr_v2);
        B.q(arr_v7, arr_v7, arr_v8);
        B.l(arr_v7, arr_v7);
        return h.e(B.a(arr_v6), B.a(arr_v7));
    }

    private static void d(long[] arr_v, long[] arr_v1, long[] arr_v2, long[] arr_v3, long[] arr_v4, long[] arr_v5, long[] arr_v6, long[] arr_v7, long[] arr_v8) {
        long[] arr_v9 = Arrays.copyOf(arr_v4, 10);
        long[] arr_v10 = new long[19];
        long[] arr_v11 = new long[19];
        long[] arr_v12 = new long[19];
        long[] arr_v13 = new long[19];
        long[] arr_v14 = new long[19];
        long[] arr_v15 = new long[19];
        long[] arr_v16 = new long[19];
        B.p(arr_v4, arr_v5);
        B.n(arr_v5, arr_v9);
        long[] arr_v17 = Arrays.copyOf(arr_v6, 10);
        B.p(arr_v6, arr_v7);
        B.n(arr_v7, arr_v17);
        B.g(arr_v13, arr_v6, arr_v5);
        B.g(arr_v14, arr_v4, arr_v7);
        B.j(arr_v13);
        B.i(arr_v13);
        B.j(arr_v14);
        B.i(arr_v14);
        System.arraycopy(arr_v13, 0, arr_v17, 0, 10);
        B.p(arr_v13, arr_v14);
        B.n(arr_v14, arr_v17);
        B.l(arr_v16, arr_v13);
        B.l(arr_v15, arr_v14);
        B.g(arr_v14, arr_v15, arr_v8);
        B.j(arr_v14);
        B.i(arr_v14);
        System.arraycopy(arr_v16, 0, arr_v2, 0, 10);
        System.arraycopy(arr_v14, 0, arr_v3, 0, 10);
        B.l(arr_v11, arr_v4);
        B.l(arr_v12, arr_v5);
        B.g(arr_v, arr_v11, arr_v12);
        B.j(arr_v);
        B.i(arr_v);
        B.n(arr_v12, arr_v11);
        Arrays.fill(arr_v10, 10, 18, 0L);
        B.k(arr_v10, arr_v12, 0x1DB41L);
        B.i(arr_v10);
        B.p(arr_v10, arr_v11);
        B.g(arr_v1, arr_v12, arr_v10);
        B.j(arr_v1);
        B.i(arr_v1);
    }

    static void e(long[] arr_v, long[] arr_v1, int v) {
        for(int v1 = 0; v1 < 10; ++v1) {
            long v2 = arr_v[v1];
            int v3 = (((int)v2) ^ ((int)arr_v1[v1])) & -v;
            arr_v[v1] = (long)(((int)v2) ^ v3);
            arr_v1[v1] = (long)(((int)arr_v1[v1]) ^ v3);
        }
    }

    private static byte[] f(byte[] arr_b) throws InvalidKeyException {
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        arr_b1[0x1F] = (byte)(arr_b1[0x1F] & 0x7F);
        for(int v = 0; true; ++v) {
            byte[][] arr2_b = k.a;
            if(v >= arr2_b.length) {
                break;
            }
            if(h.e(arr2_b[v], arr_b1)) {
                throw new InvalidKeyException("Banned public key: " + C.b(arr2_b[v]));
            }
        }
        return arr_b1;
    }
}

