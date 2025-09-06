package com.fasterxml.jackson.core.io.schubfach;

public final class b {
    public final int a;
    private final byte[] b;
    private int c;
    static final int d = 24;
    private static final int e = 8;
    static final int f = 0xFFFFFF6B;
    static final int g = 104;
    static final int h = -44;
    static final int i = 39;
    static final int j = 8;
    static final int k = -45;
    static final int l = 0x1F;
    static final int m = 9;
    private static final int n = 0x800000;
    private static final int o = 0xFF;
    private static final int p = 0x7FFFFF;
    private static final long q = 0xFFFFFFFFL;
    private static final int r = 0xFFFFFFF;
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = 4;
    private static final int x = 5;

    private b() {
        this.a = 15;
        this.b = new byte[15];
    }

    private void a(int v) {
        int v1 = this.c + 1;
        this.c = v1;
        this.b[v1] = (byte)v;
    }

    private void b(int v) {
        int v1 = this.p(v);
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
        int v1 = v * 103 >>> 10;
        this.c(v1);
        this.c(v - v1 * 10);
    }

    private void f() {
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

    private static int g(long v, long v1) {
        long v2 = c.f(v, v1);
        return (int)((v2 & 0xFFFFFFFFL) + 0xFFFFFFFFL >>> 0x20 | v2 >>> 0x1F);
    }

    private int h(int v, int v1) {
        int v2 = (int)(((long)(0x20 - Integer.numberOfLeadingZeros(v))) * 0x9A209A84FBL >> 41);
        v2 = ((long)v) < c.g(v2) ? ((int)(((long)(0x20 - Integer.numberOfLeadingZeros(v))) * 0x9A209A84FBL >> 41)) : v2 + 1;
        int v3 = (int)(((long)v) * c.g(9 - v2));
        int v4 = v1 + v2;
        int v5 = (int)(((long)v3) * 0x55E63B89L >>> 57);
        int v6 = v3 - 100000000 * v5;
        if(v4 > 0 && v4 <= 7) {
            return this.i(v5, v6, v4);
        }
        return -3 >= v4 || v4 > 0 ? this.k(v5, v6, v4) : this.j(v5, v6, v4);
    }

    private int i(int v, int v1, int v2) {
        this.c(v);
        int v3 = this.p(v1);
        int v4;
        for(v4 = 1; v4 < v2; ++v4) {
            this.c(v3 * 10 >>> 28);
            v3 = v3 * 10 & 0xFFFFFFF;
        }
        this.a(46);
        while(v4 <= 8) {
            this.c(v3 * 10 >>> 28);
            v3 = v3 * 10 & 0xFFFFFFF;
            ++v4;
        }
        this.f();
        return 0;
    }

    private int j(int v, int v1, int v2) {
        this.c(0);
        this.a(46);
        while(v2 < 0) {
            this.c(0);
            ++v2;
        }
        this.c(v);
        this.b(v1);
        this.f();
        return 0;
    }

    private int k(int v, int v1, int v2) {
        this.c(v);
        this.a(46);
        this.b(v1);
        this.f();
        this.e(v2 - 1);
        return 0;
    }

    private int l(float f) {
        int v = Float.floatToRawIntBits(f);
        int v1 = v >>> 23 & 0xFF;
        if(v1 < 0xFF) {
            this.c = -1;
            if(v < 0) {
                this.a(45);
            }
            int v2 = 1;
            if(v1 != 0) {
                int v3 = 0x7FFFFF & v | 0x800000;
                if(150 - v1 >= 24) {
                    v2 = 0;
                }
                if(((150 - v1 <= 0 ? 0 : 1) & v2) != 0) {
                    int v4 = v3 >> 150 - v1;
                    return v4 << 150 - v1 == v3 ? this.h(v4, 0) : this.m(-(150 - v1), v3, 0);
                }
                return this.m(-(150 - v1), v3, 0);
            }
            if((0x7FFFFF & v) != 0) {
                return (0x7FFFFF & v) >= 8 ? this.m(0xFFFFFF6B, 0x7FFFFF & v, 0) : this.m(0xFFFFFF6B, (0x7FFFFF & v) * 10, -1);
            }
            return v == 0 ? 1 : 2;
        }
        if((0x7FFFFF & v) != 0) {
            return 5;
        }
        return v <= 0 ? 4 : 3;
    }

    private int m(int v, int v1, int v2) {
        int v5;
        long v4;
        int v3 = 0;
        if(((v1 == 0x800000 ? 0 : 1) | (v == 0xFFFFFF6B ? 1 : 0)) == 0) {
            v4 = ((long)(v1 << 2)) - 1L;
            v5 = (int)(((long)v) * 0x9A209A84FBL - 0x3FF7F85779L >> 41);
        }
        else {
            v4 = ((long)(v1 << 2)) - 2L;
            v5 = (int)(((long)v) * 0x9A209A84FBL >> 41);
        }
        int v6 = v + ((int)(((long)(-v5)) * 0xD49A784BCDL >> 38)) + 33;
        long v7 = c.e(v5);
        int v8 = b.g(v7 + 1L, ((long)(v1 << 2)) << v6);
        int v9 = b.g(v7 + 1L, v4 << v6);
        int v10 = b.g(v7 + 1L, ((long)(v1 << 2)) + 2L << v6);
        int v11 = v8 >> 2;
        if(v11 >= 100) {
            int v12 = ((int)(((long)v11) * 0x66666667L >>> 34)) * 10;
            int v13 = v9 + (v1 & 1) > v12 << 2 ? 0 : 1;
            if(v13 != ((v12 + 10 << 2) + (v1 & 1) > v10 ? 0 : 1)) {
                if(v13 == 0) {
                    v12 += 10;
                }
                return this.h(v12, v5);
            }
        }
        int v14 = v9 + (v1 & 1) > v11 << 2 ? 0 : 1;
        if((v11 + 1 << 2) + (v1 & 1) <= v10) {
            v3 = 1;
        }
        if(v14 != v3) {
            if(v14 == 0) {
                ++v11;
            }
            return this.h(v11, v5 + v2);
        }
        int v15 = v8 - 2 + -4 * v11;
        if(v15 >= 0 && (v15 != 0 || (v11 & 1) != 0)) {
            ++v11;
        }
        return this.h(v11, v5 + v2);
    }

    private String n(float f) {
        switch(this.l(f)) {
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

    public static String o(float f) {
        return new b().n(f);
    }

    private int p(int v) {
        return ((int)(c.f(((long)(v + 1)) << 28, 0x2AF31DC4611873CL) >>> 20)) - 1;
    }
}

