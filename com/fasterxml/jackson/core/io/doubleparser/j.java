package com.fasterxml.jackson.core.io.doubleparser;

class j {
    public static long A(long v, long v1) {
        return ((v | v1) & 0xFF00FF00FF00FF00L) == 0L ? j.B((v * 0x10100L & 0xFFFF0000L) << 16 | v * 0x10100L & 0xFFFF000000000000L | (0xFFFF000000000000L & v1 * 0x10100L) >>> 0x20 | (v1 * 0x10100L & 0xFFFF0000L) >>> 16) : -1L;
    }

    public static long B(long v) {
        long v1 = 0x1F1F1F1F1F1F1F1FL + (v | 0x2020202020202020L) & 0x8080808080808080L;
        if(((v + 0x5050505050505050L & (v ^ 0x7F7F7F7F7F7F7F7FL) + 4195730024608447034L ^ (0x7F7F7F7F7F7F7F7FL ^ (v | 0x2020202020202020L)) + 7451037802321897319L & v1) & 0x8080808080808080L) != 0x8080808080808080L) {
            return -1L;
        }
        long v2 = (v1 >>> 7) * 0xFFL;
        long v3 = (v | 0x2020202020202020L) - 0x3030303030303030L;
        long v4 = v3 - (v2 & 2821266740684990247L) | ~v2 & v3;
        long v5 = (v4 | v4 >>> 4) & 0xFF00FF00FF00FFL;
        long v6 = v5 | v5 >>> 8;
        return v6 & 0xFFFFL | v6 >>> 16 & 0xFFFF0000L;
    }

    public static int C(CharSequence charSequence0, int v) {
        long v1 = ((long)charSequence0.charAt(v)) | ((long)charSequence0.charAt(v + 1)) << 16 | ((long)charSequence0.charAt(v + 2)) << 0x20;
        return j.F(((long)charSequence0.charAt(v + 3)) << 0x30 | v1);
    }

    public static int D(byte[] arr_b, int v) {
        return j.G(j.o(arr_b, v));
    }

    public static int E(char[] arr_c, int v) {
        return j.F(((long)arr_c[v + 3]) << 0x30 | (((long)arr_c[v]) | ((long)arr_c[v + 1]) << 16 | ((long)arr_c[v + 2]) << 0x20));
    }

    public static int F(long v) {
        return ((v + 0x46004600460046L | v - 0x30003000300030L) & 0xFF80FF80FF80FF80L) == 0L ? ((int)((v - 0x30003000300030L) * 0x3E80064000A0001L >>> 0x30)) : -1;
    }

    public static int G(int v) {
        if(((long)((v + 1179010630 | v - 0x30303030) & 0x80808080)) != 0L) {
            return -1;
        }
        int v1 = (v - 0x30303030) * 0xA01 >>> 8;
        return (v1 & 0xFF) * 100 + ((v1 & 0xFF0000) >> 16);
    }

    public static int H(CharSequence charSequence0, int v, int v1) {
        int v2 = 0;
        boolean z = true;
        while(v < v1) {
            int v3 = charSequence0.charAt(v);
            z &= j.c(((char)v3));
            v2 = v2 * 10 + v3 - 0x30;
            ++v;
        }
        return z ? v2 : -1;
    }

    public static int I(byte[] arr_b, int v, int v1) {
        int v2 = 0;
        boolean z = true;
        while(v < v1) {
            int v3 = arr_b[v];
            z &= j.b(((byte)v3));
            v2 = v2 * 10 + v3 - 0x30;
            ++v;
        }
        return z ? v2 : -1;
    }

    public static int J(char[] arr_c, int v, int v1) {
        int v2 = 0;
        boolean z = true;
        while(v < v1) {
            int v3 = arr_c[v];
            z &= j.c(((char)v3));
            v2 = v2 * 10 + v3 - 0x30;
            ++v;
        }
        return z ? v2 : -1;
    }

    public static void K(byte[] arr_b, int v, int v1) {
        arr_b[v] = (byte)(v1 >>> 24);
        arr_b[v + 1] = (byte)(v1 >>> 16);
        arr_b[v + 2] = (byte)(v1 >>> 8);
        arr_b[v + 3] = (byte)v1;
    }

    public static void L(byte[] arr_b, int v, long v1) {
        arr_b[v] = (byte)(((int)(v1 >>> 56)));
        arr_b[v + 1] = (byte)(((int)(v1 >>> 0x30)));
        arr_b[v + 2] = (byte)(((int)(v1 >>> 40)));
        arr_b[v + 3] = (byte)(((int)(v1 >>> 0x20)));
        arr_b[v + 4] = (byte)(((int)(v1 >>> 24)));
        arr_b[v + 5] = (byte)(((int)(v1 >>> 16)));
        arr_b[v + 6] = (byte)(((int)(v1 >>> 8)));
        arr_b[v + 7] = (byte)(((int)v1));
    }

    public static double a(double f, double f1, double f2) [...] // Inlined contents

    protected static boolean b(byte b) {
        return ((char)(b - 0x30)) < 10;
    }

    protected static boolean c(char c) {
        return ((char)(c - 0x30)) < 10;
    }

    public static boolean d(CharSequence charSequence0, int v) {
        boolean z = true;
        for(int v1 = 0; v1 < 8; ++v1) {
            z &= j.c(charSequence0.charAt(v1 + v));
        }
        return z;
    }

    public static boolean e(byte[] arr_b, int v) {
        return j.h(j.q(arr_b, v));
    }

    public static boolean f(char[] arr_c, int v) {
        return j.g(((long)arr_c[v]) | ((long)arr_c[v + 1]) << 16 | ((long)arr_c[v + 2]) << 0x20 | ((long)arr_c[v + 3]) << 0x30, ((long)arr_c[v + 7]) << 0x30 | (((long)arr_c[v + 4]) | ((long)arr_c[v + 5]) << 16 | ((long)arr_c[v + 6]) << 0x20));
    }

    public static boolean g(long v, long v1) {
        return ((v + 0x46004600460046L | v - 0x30003000300030L | (v1 + 0x46004600460046L | v1 - 0x30003000300030L)) & 0xFF80FF80FF80FF80L) == 0L;
    }

    public static boolean h(long v) {
        return ((v + 5063812098665367110L | v - 0x3030303030303030L) & 0x8080808080808080L) == 0L;
    }

    public static boolean i(CharSequence charSequence0, int v) {
        boolean z = true;
        for(int v1 = 0; v1 < 8; ++v1) {
            z &= 0x30 == charSequence0.charAt(v1 + v);
        }
        return z;
    }

    public static boolean j(byte[] arr_b, int v) {
        return j.m(j.q(arr_b, v));
    }

    public static boolean k(char[] arr_c, int v) {
        return j.l(((long)arr_c[v]) | ((long)arr_c[v + 1]) << 16 | ((long)arr_c[v + 2]) << 0x20 | ((long)arr_c[v + 3]) << 0x30, ((long)arr_c[v + 7]) << 0x30 | (((long)arr_c[v + 4]) | ((long)arr_c[v + 5]) << 16 | ((long)arr_c[v + 6]) << 0x20));
    }

    public static boolean l(long v, long v1) {
        return v == 0x30003000300030L && v1 == 0x30003000300030L;
    }

    public static boolean m(long v) {
        return v == 0x3030303030303030L;
    }

    public static int n(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }

    public static int o(byte[] arr_b, int v) {
        return arr_b[v] & 0xFF | ((arr_b[v + 3] & 0xFF) << 24 | (arr_b[v + 2] & 0xFF) << 16 | (arr_b[v + 1] & 0xFF) << 8);
    }

    public static long p(byte[] arr_b, int v) {
        return ((long)arr_b[v + 7]) & 0xFFL | ((((long)arr_b[v]) & 0xFFL) << 56 | (((long)arr_b[v + 1]) & 0xFFL) << 0x30 | (((long)arr_b[v + 2]) & 0xFFL) << 40 | (((long)arr_b[v + 3]) & 0xFFL) << 0x20 | (((long)arr_b[v + 4]) & 0xFFL) << 24 | (((long)arr_b[v + 5]) & 0xFFL) << 16 | (((long)arr_b[v + 6]) & 0xFFL) << 8);
    }

    public static long q(byte[] arr_b, int v) {
        return ((long)arr_b[v]) & 0xFFL | ((((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 1]) & 0xFFL) << 8);
    }

    public static int r(CharSequence charSequence0, int v) {
        long v1 = ((long)charSequence0.charAt(v)) | ((long)charSequence0.charAt(v + 1)) << 16 | ((long)charSequence0.charAt(v + 2)) << 0x20 | ((long)charSequence0.charAt(v + 3)) << 0x30;
        long v2 = ((long)charSequence0.charAt(v + 4)) | ((long)charSequence0.charAt(v + 5)) << 16 | ((long)charSequence0.charAt(v + 6)) << 0x20;
        return j.u(v1, ((long)charSequence0.charAt(v + 7)) << 0x30 | v2);
    }

    public static int s(byte[] arr_b, int v) {
        return j.v(j.q(arr_b, v));
    }

    public static int t(char[] arr_c, int v) {
        return j.u(((long)arr_c[v]) | ((long)arr_c[v + 1]) << 16 | ((long)arr_c[v + 2]) << 0x20 | ((long)arr_c[v + 3]) << 0x30, ((long)arr_c[v + 7]) << 0x30 | (((long)arr_c[v + 4]) | ((long)arr_c[v + 5]) << 16 | ((long)arr_c[v + 6]) << 0x20));
    }

    public static int u(long v, long v1) {
        return ((v + 0x46004600460046L | v - 0x30003000300030L | (v1 + 0x46004600460046L | v1 - 0x30003000300030L)) & 0xFF80FF80FF80FF80L) == 0L ? ((int)((v1 - 0x30003000300030L) * 0x3E80064000A0001L >>> 0x30)) + ((int)((v - 0x30003000300030L) * 0x3E80064000A0001L >>> 0x30)) * 10000 : -1;
    }

    public static int v(long v) {
        if(((v + 5063812098665367110L | v - 0x3030303030303030L) & 0x8080808080808080L) != 0L) {
            return -1;
        }
        long v1 = 10L * (v - 0x3030303030303030L) + (v - 0x3030303030303030L >>> 8);
        return (int)((v1 & 0xFF000000FFL) * 0xF424000000064L + (v1 >>> 16 & 0xFF000000FFL) * 0x271000000001L >>> 0x20);
    }

    public static int w(byte[] arr_b, int v) {
        return j.v(j.q(arr_b, v));
    }

    public static long x(CharSequence charSequence0, int v) {
        long v1 = ((long)charSequence0.charAt(v)) << 0x30 | ((long)charSequence0.charAt(v + 1)) << 0x20 | ((long)charSequence0.charAt(v + 2)) << 16 | ((long)charSequence0.charAt(v + 3));
        long v2 = ((long)charSequence0.charAt(v + 4)) << 0x30 | ((long)charSequence0.charAt(v + 5)) << 0x20 | ((long)charSequence0.charAt(v + 6)) << 16;
        return j.A(v1, ((long)charSequence0.charAt(v + 7)) | v2);
    }

    public static long y(byte[] arr_b, int v) {
        return j.B(j.p(arr_b, v));
    }

    public static long z(char[] arr_c, int v) {
        return j.A(((long)arr_c[v]) << 0x30 | ((long)arr_c[v + 1]) << 0x20 | ((long)arr_c[v + 2]) << 16 | ((long)arr_c[v + 3]), ((long)arr_c[v + 7]) | (((long)arr_c[v + 4]) << 0x30 | ((long)arr_c[v + 5]) << 0x20 | ((long)arr_c[v + 6]) << 16));
    }
}

