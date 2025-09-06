package com.google.common.hash;

import com.google.common.base.H;

@k
final class l extends e {
    static final q a = null;
    private static final long b = 0xC3A5C85C97CB3127L;
    private static final long c = 0xB492B66FBE98F273L;
    private static final long d = 0x9AE16A3B2F90404FL;

    static {
        l.a = new l();
    }

    @Override  // com.google.common.hash.q
    public int h() {
        return 0x40;
    }

    @Override  // com.google.common.hash.e
    public p k(byte[] arr_b, int v, int v1) {
        H.f0(v, v + v1, arr_b.length);
        return p.j(l.l(arr_b, v, v1));
    }

    @J1.e
    static long l(byte[] arr_b, int v, int v1) {
        if(v1 <= 0x20) {
            return v1 > 16 ? l.o(arr_b, v, v1) : l.m(arr_b, v, v1);
        }
        return v1 > 0x40 ? l.q(arr_b, v, v1) : l.p(arr_b, v, v1);
    }

    private static long m(byte[] arr_b, int v, int v1) {
        if(v1 >= 8) {
            long v2 = ((long)v1) * 2L - 0x651E95C4D06FBFB1L;
            long v3 = z.b(arr_b, v);
            long v4 = z.b(arr_b, v + v1 - 8);
            return l.n(Long.rotateRight(v4, 37) * v2 + (v3 - 0x651E95C4D06FBFB1L), (Long.rotateRight(v3 - 0x651E95C4D06FBFB1L, 25) + v4) * v2, v2);
        }
        if(v1 >= 4) {
            return l.n(((long)v1) + ((((long)z.a(arr_b, v)) & 0xFFFFFFFFL) << 3), ((long)z.a(arr_b, v + v1 - 4)) & 0xFFFFFFFFL, ((long)(v1 * 2)) - 0x651E95C4D06FBFB1L);
        }
        return v1 <= 0 ? 0x9AE16A3B2F90404FL : l.r(((long)((arr_b[v] & 0xFF) + ((arr_b[(v1 >> 1) + v] & 0xFF) << 8))) * 0x9AE16A3B2F90404FL ^ ((long)(v1 + ((arr_b[v + (v1 - 1)] & 0xFF) << 2))) * 0xC3A5C85C97CB3127L) * 0x9AE16A3B2F90404FL;
    }

    private static long n(long v, long v1, long v2) {
        long v3 = (v ^ v1) * v2;
        long v4 = (v3 ^ v3 >>> 0x2F ^ v1) * v2;
        return (v4 ^ v4 >>> 0x2F) * v2;
    }

    private static long o(byte[] arr_b, int v, int v1) {
        long v2 = ((long)v1) * 2L - 0x651E95C4D06FBFB1L;
        long v3 = z.b(arr_b, v);
        long v4 = z.b(arr_b, v + 8);
        int v5 = v + v1;
        long v6 = z.b(arr_b, v5 - 8) * v2;
        return l.n(z.b(arr_b, v5 - 16) * 0x9AE16A3B2F90404FL + (Long.rotateRight(v3 * 0xB492B66FBE98F273L + v4, 43) + Long.rotateRight(v6, 30)), v6 + (v3 * 0xB492B66FBE98F273L + Long.rotateRight(v4 - 0x651E95C4D06FBFB1L, 18)), v2);
    }

    private static long p(byte[] arr_b, int v, int v1) {
        long v2 = ((long)v1) * 2L - 0x651E95C4D06FBFB1L;
        long v3 = z.b(arr_b, v);
        long v4 = z.b(arr_b, v + 8);
        int v5 = v + v1;
        long v6 = z.b(arr_b, v5 - 8) * v2;
        long v7 = Long.rotateRight(v3 * 0x9AE16A3B2F90404FL + v4, 43) + Long.rotateRight(v6, 30) + z.b(arr_b, v5 - 16) * 0x9AE16A3B2F90404FL;
        long v8 = z.b(arr_b, v + 16) * v2;
        long v9 = z.b(arr_b, v + 24);
        long v10 = (v7 + z.b(arr_b, v5 - 0x20)) * v2;
        return l.n((l.n(v7, v6 + (Long.rotateRight(v4 - 0x651E95C4D06FBFB1L, 18) + v3 * 0x9AE16A3B2F90404FL), v2) + z.b(arr_b, v5 - 24)) * v2 + (Long.rotateRight(v8 + v9, 43) + Long.rotateRight(v10, 30)), v8 + Long.rotateRight(v9 + v3 * 0x9AE16A3B2F90404FL, 18) + v10, v2);
    }

    private static long q(byte[] arr_b, int v, int v1) {
        long v13;
        long v12;
        long v11;
        long v2 = 2480279821605975764L;
        long v3 = 1390051526045402406L;
        long[] arr_v = new long[2];
        long[] arr_v1 = new long[2];
        long v4 = z.b(arr_b, v) + 0x1529CBA0CA458FFL;
        int v5 = v + (v1 - 1) / 0x40 * 0x40;
        int v6 = v1 - 1 & 0x3F;
        int v7 = v5 + v6;
        int v8 = v;
        while(true) {
            long v9 = Long.rotateRight(v4 + v2 + arr_v[0] + z.b(arr_b, v8 + 8), 37);
            long v10 = Long.rotateRight(v2 + arr_v[1] + z.b(arr_b, v8 + 0x30), 42);
            v11 = v9 * 0xB492B66FBE98F273L ^ arr_v1[1];
            v12 = v10 * 0xB492B66FBE98F273L + (arr_v[0] + z.b(arr_b, v8 + 40));
            v13 = Long.rotateRight(v3 + arr_v1[0], 33) * 0xB492B66FBE98F273L;
            l.s(arr_b, v8, arr_v[1] * 0xB492B66FBE98F273L, v11 + arr_v1[0], arr_v);
            l.s(arr_b, v8 + 0x20, v13 + arr_v1[1], v12 + z.b(arr_b, v8 + 16), arr_v1);
            if(v8 + 0x40 == v5) {
                break;
            }
            v8 += 0x40;
            v3 = v11;
            v2 = v12;
            v4 = v13;
        }
        long v14 = 0xB492B66FBE98F273L + ((v11 & 0xFFL) << 1);
        long v15 = arr_v1[0] + ((long)v6);
        arr_v1[0] = v15;
        long v16 = arr_v[0] + v15;
        arr_v[0] = v16;
        arr_v1[0] += v16;
        long v17 = Long.rotateRight(v13 + v12 + arr_v[0] + z.b(arr_b, v7 - 55), 37);
        long v18 = Long.rotateRight(v12 + arr_v[1] + z.b(arr_b, v7 - 15), 42);
        long v19 = v17 * v14 ^ arr_v1[1] * 9L;
        long v20 = v18 * v14 + (arr_v[0] * 9L + z.b(arr_b, v7 - 23));
        long v21 = Long.rotateRight(v11 + arr_v1[0], 33) * v14;
        l.s(arr_b, v7 - 0x3F, arr_v[1] * v14, v19 + arr_v1[0], arr_v);
        l.s(arr_b, v7 - 0x1F, v21 + arr_v1[1], v20 + z.b(arr_b, v7 - 0x2F), arr_v1);
        return l.n(l.n(arr_v[0], arr_v1[0], v14) + (v20 ^ v20 >>> 0x2F) * 0xC3A5C85C97CB3127L + v19, l.n(arr_v[1], arr_v1[1], v14) + v21, v14);
    }

    private static long r(long v) [...] // Inlined contents

    private static void s(byte[] arr_b, int v, long v1, long v2, long[] arr_v) {
        long v3 = z.b(arr_b, v);
        long v4 = z.b(arr_b, v + 8);
        long v5 = z.b(arr_b, v + 16);
        long v6 = z.b(arr_b, v + 24);
        long v7 = v1 + v3;
        long v8 = v4 + v7 + v5;
        arr_v[0] = v8 + v6;
        arr_v[1] = Long.rotateRight(v2 + v7 + v6, 21) + Long.rotateRight(v8, 44) + v7;
    }

    @Override
    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}

