package com.fasterxml.jackson.core.io.schubfach;

public final class a {
    public final int a;
    private final byte[] b;
    private int c;
    static final int d = 53;
    private static final int e = 11;
    static final int f = -1074;
    static final int g = 971;
    static final int h = -323;
    static final int i = 309;
    static final long j = 3L;
    static final int k = -324;
    static final int l = 292;
    static final int m = 17;
    private static final long n = 0x10000000000000L;
    private static final int o = 0x7FF;
    private static final long p = 0xFFFFFFFFFFFFFL;
    private static final long q = 0x7FFFFFFFFFFFFFFFL;
    private static final int r = 0xFFFFFFF;
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = 4;
    private static final int x = 5;

    private a() {
        this.a = 24;
        this.b = new byte[24];
    }

    private void a(int v) {
        int v1 = this.c + 1;
        this.c = v1;
        this.b[v1] = (byte)v;
    }

    private void b(int v) {
        int v1 = this.q(v);
        for(int v2 = 0; v2 < 8; ++v2) {
            this.c(v1 * 10 >>> 28);
            v1 = v1 * 10 & 0xFFFFFFF;
        }
    }

    private void c(int v) {
        int v1 = this.c + 1;
        this.c = v1;
        this.b[v1] = (byte)(v + 0x30);
    }

    private String d() [...] // 潜在的解密器

    private void e(int v) {
        this.a(69);
        if(v < 0) {
            this.a(45);
            v = -v;
        }
        if(v < 10) {
            this.c(v);
            return;
        }
        if(v >= 100) {
            int v1 = v * 0x51F >>> 17;
            this.c(v1);
            v -= v1 * 100;
        }
        int v2 = v * 103 >>> 10;
        this.c(v2);
        this.c(v - v2 * 10);
    }

    private void f(int v) {
        if(v != 0) {
            this.b(v);
        }
        this.g();
    }

    private void g() {
        int v;
        while(true) {
            v = this.c;
            int v1 = this.b[v];
            if(v1 != 0x30) {
                break;
            }
            this.c = v - 1;
        }
        if(v1 == 46) {
            this.c = v + 1;
        }
    }

    private static long h(long v, long v1, long v2) {
        long v3 = (v * v2 >>> 1) + c.f(v1, v2);
        return c.f(v, v2) + (v3 >>> 0x3F) | (v3 & 0x7FFFFFFFFFFFFFFFL) + 0x7FFFFFFFFFFFFFFFL >>> 0x3F;
    }

    private int i(long v, int v1) {
        int v2 = (int)(((long)(0x40 - Long.numberOfLeadingZeros(v))) * 0x9A209A84FBL >> 41);
        v2 = v < c.g(v2) ? ((int)(((long)(0x40 - Long.numberOfLeadingZeros(v))) * 0x9A209A84FBL >> 41)) : v2 + 1;
        long v3 = v * c.g(17 - v2);
        int v4 = v1 + v2;
        long v5 = c.f(v3, 0x2AF31DC4611873CL);
        int v6 = (int)(v3 - 100000000L * (v5 >>> 20));
        int v7 = (int)(0x55E63B89L * (v5 >>> 20) >>> 57);
        int v8 = (int)((v5 >>> 20) - ((long)(100000000 * v7)));
        if(v4 > 0 && v4 <= 7) {
            return this.j(v7, v8, v6, v4);
        }
        return -3 >= v4 || v4 > 0 ? this.l(v7, v8, v6, v4) : this.k(v7, v8, v6, v4);
    }

    private int j(int v, int v1, int v2, int v3) {
        this.c(v);
        int v4 = this.q(v1);
        int v5;
        for(v5 = 1; v5 < v3; ++v5) {
            this.c(v4 * 10 >>> 28);
            v4 = v4 * 10 & 0xFFFFFFF;
        }
        this.a(46);
        while(v5 <= 8) {
            this.c(v4 * 10 >>> 28);
            v4 = v4 * 10 & 0xFFFFFFF;
            ++v5;
        }
        this.f(v2);
        return 0;
    }

    private int k(int v, int v1, int v2, int v3) {
        this.c(0);
        this.a(46);
        while(v3 < 0) {
            this.c(0);
            ++v3;
        }
        this.c(v);
        this.b(v1);
        this.f(v2);
        return 0;
    }

    private int l(int v, int v1, int v2, int v3) {
        this.c(v);
        this.a(46);
        this.b(v1);
        this.f(v2);
        this.e(v3 - 1);
        return 0;
    }

    private int m(double f) {
        long v = Double.doubleToRawLongBits(f);
        int v1 = ((int)(v >>> 52)) & 0x7FF;
        if(v1 < 0x7FF) {
            this.c = -1;
            int v2 = Long.compare(v, 0L);
            if(v2 < 0) {
                this.a(45);
            }
            int v3 = 1;
            if(v1 != 0) {
                long v4 = 0xFFFFFFFFFFFFFL & v | 0x10000000000000L;
                if(1075 - v1 >= 53) {
                    v3 = 0;
                }
                if((v3 & (1075 - v1 <= 0 ? 0 : 1)) != 0) {
                    long v5 = v4 >> 1075 - v1;
                    return v5 << 1075 - v1 == v4 ? this.i(v5, 0) : this.n(-(1075 - v1), v4, 0);
                }
                return this.n(-(1075 - v1), v4, 0);
            }
            if((0xFFFFFFFFFFFFFL & v) != 0L) {
                return (0xFFFFFFFFFFFFFL & v) >= 3L ? this.n(-1074, 0xFFFFFFFFFFFFFL & v, 0) : this.n(-1074, (0xFFFFFFFFFFFFFL & v) * 10L, -1);
            }
            return v2 == 0 ? 1 : 2;
        }
        if((0xFFFFFFFFFFFFFL & v) != 0L) {
            return 5;
        }
        return v <= 0L ? 4 : 3;
    }

    private int n(int v, long v1, int v2) {
        long v13;
        int v5;
        long v4;
        int v3 = 0;
        if(((v1 == 0x10000000000000L ? 0 : 1) | (v == -1074 ? 1 : 0)) == 0) {
            v4 = (v1 << 2) - 1L;
            v5 = (int)(((long)v) * 0x9A209A84FBL - 0x3FF7F85779L >> 41);
        }
        else {
            v4 = (v1 << 2) - 2L;
            v5 = (int)(((long)v) * 0x9A209A84FBL >> 41);
        }
        int v6 = v + ((int)(((long)(-v5)) * 0xD49A784BCDL >> 38)) + 2;
        long v7 = c.e(v5);
        long v8 = c.d(v5);
        long v9 = a.h(v7, v8, v1 << 2 << v6);
        long v10 = a.h(v7, v8, v4 << v6);
        long v11 = a.h(v7, v8, (v1 << 2) + 2L << v6);
        if(v9 >> 2 >= 100L) {
            long v12 = c.f(v9 >> 2, 0x19999999999999A0L) * 10L;
            v13 = v9 >> 2;
            long v14 = (long)(((int)v1) & 1);
            int v15 = v10 + v14 > v12 << 2 ? 0 : 1;
            if(v15 != ((v12 + 10L << 2) + v14 > v11 ? 0 : 1)) {
                if(v15 == 0) {
                    v12 += 10L;
                }
                return this.i(v12, v5);
            }
        }
        else {
            v13 = v9 >> 2;
        }
        long v16 = (long)(((int)v1) & 1);
        int v17 = v10 + v16 > v13 << 2 ? 0 : 1;
        if((v13 + 1L << 2) + v16 <= v11) {
            v3 = 1;
        }
        if(v17 != v3) {
            return v17 == 0 ? this.i(v13 + 1L, v5 + v2) : this.i(v13, v5 + v2);
        }
        int v18 = Long.compare(v9 - 2 + -4 * v13, 0L);
        return v18 < 0 || v18 == 0 && (v13 & 1L) == 0L ? this.i(v13, v5 + v2) : this.i(v13 + 1L, v5 + v2);
    }

    private String o(double f) {
        switch(this.m(f)) {
            case 0: {
                return "\u0000";
            }
            case 1: {
                return "0.0";
            }
            case 2: {
                return "-0.0";
            }
            case 3: {
                return "Infinity";
            }
            case 4: {
                return "-Infinity";
            }
            default: {
                return "NaN";
            }
        }
    }

    public static String p(double f) {
        return new a().o(f);
    }

    private int q(int v) {
        return ((int)(c.f(((long)(v + 1)) << 28, 0x2AF31DC4611873CL) >>> 20)) - 1;
    }
}

