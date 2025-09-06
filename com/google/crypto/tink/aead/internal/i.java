package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.subtle.h;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class i {
    public static final int a = 16;
    public static final int b = 0x20;

    public static byte[] a(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != 0x20) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long v = i.c(arr_b, 0, 0);
        long v1 = i.c(arr_b, 3, 2);
        long v2 = i.c(arr_b, 6, 4);
        long v3 = i.c(arr_b, 9, 6);
        long v4 = i.c(arr_b, 12, 8);
        long v5 = (v2 & 0x3FFC0FFL) * 5L;
        long v6 = (v3 & 0x3F03FFFL) * 5L;
        long v7 = (v4 & 0xFFFFFL) * 5L;
        byte[] arr_b2 = new byte[17];
        long v8 = 0L;
        long v9 = 0L;
        long v10 = 0L;
        long v11 = 0L;
        long v12 = 0L;
        int v13 = 0;
        while(v13 < arr_b1.length) {
            i.b(arr_b2, arr_b1, v13);
            long v14 = v12 + i.c(arr_b2, 0, 0);
            long v15 = v8 + i.c(arr_b2, 3, 2);
            long v16 = v9 + i.c(arr_b2, 6, 4);
            long v17 = v10 + i.c(arr_b2, 9, 6);
            long v18 = v11 + (i.c(arr_b2, 12, 8) | ((long)(arr_b2[16] << 24)));
            long v19 = v14 * (v & 0x3FFFFFFL) + v15 * v7 + v16 * v6 + v17 * v5 + v18 * ((v1 & 0x3FFFF03L) * 5L);
            long v20 = v14 * (v1 & 0x3FFFF03L) + v15 * (v & 0x3FFFFFFL) + v16 * v7 + v17 * v6 + v18 * v5 + (v19 >> 26);
            long v21 = v14 * (v2 & 0x3FFC0FFL) + v15 * (v1 & 0x3FFFF03L) + v16 * (v & 0x3FFFFFFL) + v17 * v7 + v18 * v6 + (v20 >> 26);
            long v22 = v14 * (v3 & 0x3F03FFFL) + v15 * (v2 & 0x3FFC0FFL) + v16 * (v1 & 0x3FFFF03L) + v17 * (v & 0x3FFFFFFL) + v18 * v7 + (v21 >> 26);
            long v23 = v14 * (v4 & 0xFFFFFL) + v15 * (v3 & 0x3F03FFFL) + v16 * (v2 & 0x3FFC0FFL) + v17 * (v1 & 0x3FFFF03L) + v18 * (v & 0x3FFFFFFL) + (v22 >> 26);
            long v24 = (v19 & 0x3FFFFFFL) + (v23 >> 26) * 5L;
            v8 = (v20 & 0x3FFFFFFL) + (v24 >> 26);
            v13 += 16;
            v9 = v21 & 0x3FFFFFFL;
            v10 = v22 & 0x3FFFFFFL;
            v11 = v23 & 0x3FFFFFFL;
            v12 = v24 & 0x3FFFFFFL;
        }
        long v25 = v9 + (v8 >> 26);
        long v26 = v10 + (v25 >> 26);
        long v27 = v11 + (v26 >> 26);
        long v28 = v12 + (v27 >> 26) * 5L;
        long v29 = (v8 & 0x3FFFFFFL) + (v28 >> 26);
        long v30 = (v25 & 0x3FFFFFFL) + (v29 >> 26);
        long v31 = (v26 & 0x3FFFFFFL) + (v30 >> 26);
        long v32 = (v27 & 0x3FFFFFFL) + (v31 >> 26) - 0x4000000L;
        long v33 = v30 & 0x3FFFFFFL & ~(v32 >> 0x3F) | v25 & 0x3FFFFFFL & v32 >> 0x3F;
        long v34 = v31 & 0x3FFFFFFL & ~(v32 >> 0x3F) | v26 & 0x3FFFFFFL & v32 >> 0x3F;
        long v35 = ((v28 & 0x3FFFFFFL & v32 >> 0x3F | (v28 & 0x3FFFFFFL) + 5L & 0x3FFFFFFL & ~(v32 >> 0x3F) | v29 << 26) & 0xFFFFFFFFL) + i.d(arr_b, 16);
        long v36 = ((v29 >> 6 | v33 << 20) & 0xFFFFFFFFL) + i.d(arr_b, 20) + (v35 >> 0x20);
        long v37 = ((v33 >> 12 | v34 << 14) & 0xFFFFFFFFL) + i.d(arr_b, 24) + (v36 >> 0x20);
        long v38 = i.d(arr_b, 28);
        byte[] arr_b3 = new byte[16];
        i.e(arr_b3, v35 & 0xFFFFFFFFL, 0);
        i.e(arr_b3, v36 & 0xFFFFFFFFL, 4);
        i.e(arr_b3, v37 & 0xFFFFFFFFL, 8);
        i.e(arr_b3, ((v34 >> 18 | (v32 & ~(v32 >> 0x3F) | v27 & 0x3FFFFFFL & v32 >> 0x3F) << 8) & 0xFFFFFFFFL) + v38 + (v37 >> 0x20) & 0xFFFFFFFFL, 12);
        return arr_b3;
    }

    private static void b(byte[] arr_b, byte[] arr_b1, int v) {
        int v1 = Math.min(16, arr_b1.length - v);
        System.arraycopy(arr_b1, v, arr_b, 0, v1);
        arr_b[v1] = 1;
        if(v1 != 16) {
            Arrays.fill(arr_b, v1 + 1, arr_b.length, 0);
        }
    }

    private static long c(byte[] arr_b, int v, int v1) {
        return i.d(arr_b, v) >> v1 & 0x3FFFFFFL;
    }

    private static long d(byte[] arr_b, int v) {
        return ((long)((arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16))) & 0xFFFFFFFFL;
    }

    private static void e(byte[] arr_b, long v, int v1) {
        int v2 = 0;
        while(v2 < 4) {
            arr_b[v1 + v2] = (byte)(((int)(0xFFL & v)));
            ++v2;
            v >>= 8;
        }
    }

    public static void f(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        if(!h.e(i.a(arr_b, arr_b1), arr_b2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}

