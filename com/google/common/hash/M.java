package com.google.common.hash;

import com.google.common.base.H;

@k
final class m extends e {
    static final q a = null;
    private static final long b = -6505348102511208375L;
    private static final long c = 0x8D58AC26AFE12E47L;
    private static final long d = 0xC47B6E9E3A970ED3L;
    private static final long e = 0xC6A4A7935BD1E995L;

    static {
        m.a = new m();
    }

    @Override  // com.google.common.hash.q
    public int h() {
        return 0x40;
    }

    @Override  // com.google.common.hash.e
    public p k(byte[] arr_b, int v, int v1) {
        H.f0(v, v + v1, arr_b.length);
        return p.j(m.l(arr_b, v, v1));
    }

    @J1.e
    static long l(byte[] arr_b, int v, int v1) {
        long v2;
        if(v1 <= 0x20) {
            v2 = m.p(arr_b, v, v1, 0xEC9B9EE68CF8F8DDL);
        }
        else {
            v2 = v1 > 0x40 ? m.m(arr_b, v, v1) : m.o(arr_b, v, v1);
        }
        long v3 = -6505348102511208375L;
        long v4 = v1 < 8 ? -6505348102511208375L : z.b(arr_b, v);
        if(v1 >= 9) {
            v3 = z.b(arr_b, v + v1 - 8);
        }
        long v5 = m.n(v2 + v3, v4);
        return v5 != 0L && v5 != 1L ? v5 : v5 - 2L;
    }

    private static long m(byte[] arr_b, int v, int v1) {
        long v15;
        long v14;
        long v13;
        long v2 = z.b(arr_b, v);
        int v3 = v + v1;
        long v4 = z.b(arr_b, v3 - 16);
        long v5 = z.b(arr_b, v3 - 56);
        long[] arr_v = new long[2];
        long[] arr_v1 = new long[2];
        m.r(arr_b, v3 - 0x40, ((long)v1), v4 ^ 0x8D58AC26AFE12E47L, arr_v);
        m.r(arr_b, v3 - 0x20, ((long)v1) * 0x8D58AC26AFE12E47L, -6505348102511208375L, arr_v1);
        long v6 = (v5 ^ -6505348102511208375L) + (arr_v[1] ^ arr_v[1] >>> 0x2F) * 0x8D58AC26AFE12E47L;
        long v7 = Long.rotateRight(v6 + v2, 39) * 0x8D58AC26AFE12E47L;
        long v8 = Long.rotateRight(v4 ^ 0x8D58AC26AFE12E47L, 33) * 0x8D58AC26AFE12E47L;
        int v9 = v;
        int v10 = v1 - 1 & 0xFFFFFFC0;
        while(true) {
            long v11 = Long.rotateRight(v7 + v8 + arr_v[0] + z.b(arr_b, v9 + 16), 37);
            long v12 = Long.rotateRight(v8 + arr_v[1] + z.b(arr_b, v9 + 0x30), 42);
            v13 = v11 * 0x8D58AC26AFE12E47L ^ arr_v1[1];
            v14 = v12 * 0x8D58AC26AFE12E47L ^ arr_v[0];
            v15 = Long.rotateRight(v6 ^ arr_v1[0], 33);
            m.r(arr_b, v9, arr_v[1] * 0x8D58AC26AFE12E47L, v13 + arr_v1[0], arr_v);
            m.r(arr_b, v9 + 0x20, arr_v1[1] + v15, v14, arr_v1);
            v9 += 0x40;
            v10 -= 0x40;
            if(v10 == 0) {
                break;
            }
            v7 = v15;
            v6 = v13;
            v8 = v14;
        }
        return m.n(m.n(arr_v[0], arr_v1[0]) + (v14 ^ v14 >>> 0x2F) * 0x8D58AC26AFE12E47L + v13, m.n(arr_v[1], arr_v1[1]) + v15);
    }

    @J1.e
    static long n(long v, long v1) {
        long v2 = (v1 ^ v) * 0xC6A4A7935BD1E995L;
        long v3 = (v ^ (v2 ^ v2 >>> 0x2F)) * 0xC6A4A7935BD1E995L;
        return (v3 ^ v3 >>> 0x2F) * 0xC6A4A7935BD1E995L;
    }

    private static long o(byte[] arr_b, int v, int v1) {
        long v2 = z.b(arr_b, v + 24);
        int v3 = v + v1;
        long v4 = z.b(arr_b, v) + (((long)v1) + z.b(arr_b, v3 - 16)) * -6505348102511208375L;
        long v5 = v4 + z.b(arr_b, v + 8);
        long v6 = v5 + z.b(arr_b, v + 16);
        long v7 = z.b(arr_b, v + 16) + z.b(arr_b, v3 - 0x20);
        long v8 = z.b(arr_b, v3 - 8);
        long v9 = v7 + z.b(arr_b, v3 - 24);
        long v10 = v9 + z.b(arr_b, v3 - 16);
        long v11 = Long.rotateRight(v4 + v2, 52) + Long.rotateRight(v6, 0x1F) + (Long.rotateRight(v4, 37) + Long.rotateRight(v5, 7));
        return (((v2 + v6 + (Long.rotateRight(v7 + v8, 52) + Long.rotateRight(v10, 0x1F) + (Long.rotateRight(v7, 37) + Long.rotateRight(v9, 7)))) * 0xC47B6E9E3A970ED3L + (v8 + v10 + v11) * -6505348102511208375L ^ (v2 + v6 + (Long.rotateRight(v7 + v8, 52) + Long.rotateRight(v10, 0x1F) + (Long.rotateRight(v7, 37) + Long.rotateRight(v9, 7)))) * 0xC47B6E9E3A970ED3L + (v8 + v10 + v11) * -6505348102511208375L >>> 0x2F) * -6505348102511208375L + v11 ^ ((v2 + v6 + (Long.rotateRight(v7 + v8, 52) + Long.rotateRight(v10, 0x1F) + (Long.rotateRight(v7, 37) + Long.rotateRight(v9, 7)))) * 0xC47B6E9E3A970ED3L + (v8 + v10 + v11) * -6505348102511208375L ^ (v2 + v6 + (Long.rotateRight(v7 + v8, 52) + Long.rotateRight(v10, 0x1F) + (Long.rotateRight(v7, 37) + Long.rotateRight(v9, 7)))) * 0xC47B6E9E3A970ED3L + (v8 + v10 + v11) * -6505348102511208375L >>> 0x2F) * -6505348102511208375L + v11 >>> 0x2F) * 0xC47B6E9E3A970ED3L;
    }

    @J1.e
    static long p(byte[] arr_b, int v, int v1, long v2) {
        long v3 = v2 ^ ((long)v1) * 0xC6A4A7935BD1E995L;
        for(int v4 = 0; v4 < (v1 & -8); v4 += 8) {
            v3 = (v3 ^ m.q(z.b(arr_b, v + v4) * 0xC6A4A7935BD1E995L) * 0xC6A4A7935BD1E995L) * 0xC6A4A7935BD1E995L;
        }
        if((v1 & 7) != 0) {
            v3 = (z.c(arr_b, v + (v1 & -8), v1 & 7) ^ v3) * 0xC6A4A7935BD1E995L;
        }
        return (v3 ^ v3 >>> 0x2F) * 0xC6A4A7935BD1E995L ^ (v3 ^ v3 >>> 0x2F) * 0xC6A4A7935BD1E995L >>> 0x2F;
    }

    private static long q(long v) [...] // Inlined contents

    private static void r(byte[] arr_b, int v, long v1, long v2, long[] arr_v) {
        long v3 = z.b(arr_b, v);
        long v4 = z.b(arr_b, v + 8);
        long v5 = z.b(arr_b, v + 16);
        long v6 = z.b(arr_b, v + 24);
        long v7 = v1 + v3;
        long v8 = v4 + v7 + v5;
        arr_v[0] = v8 + v6;
        arr_v[1] = Long.rotateRight(v2 + v7 + v6, 51) + Long.rotateRight(v8, 23) + v7;
    }

    @Override
    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}

