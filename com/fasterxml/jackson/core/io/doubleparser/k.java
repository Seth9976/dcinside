package com.fasterxml.jackson.core.io.doubleparser;

import androidx.collection.b;

class k {
    private static final int a = 0x7F;
    private static final int b = 24;
    private static final int c = -45;
    private static final int d = 38;
    private static final int e = 0xFFFFFF82;
    private static final int f = 0x7F;
    private static final float[] g;

    static {
        k.g = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 10000000.0f, 100000000.0f, 1000000000.0f, 10000000000.0f};
    }

    static float a(float f, int v) {
        return f * Float.intBitsToFloat(v + 0x7F << 23);
    }

    static float b(boolean z, long v, int v1, boolean z1, int v2) {
        if(v == 0L) {
            return z ? -0.0f : 0.0f;
        }
        if(z1) {
            if(-45 <= v2 && v2 <= 38) {
                float f = k.c(z, v, v2);
                return Float.isNaN(f) || k.c(z, v + 1L, v2) != f ? NaNf : f;
            }
            return NaNf;
        }
        return -45 > v1 || v1 > 38 ? NaNf : k.c(z, v, v1);
    }

    static float c(boolean z, long v, int v1) {
        if(-10 <= v1 && v1 <= 10 && b.a(v, 0xFFFFFFL) <= 0) {
            float f = v1 >= 0 ? ((float)v) * k.g[v1] : ((float)v) / k.g[-v1];
            return z ? -f : f;
        }
        long v2 = 0L;
        int v3 = Long.numberOfLeadingZeros(v);
        long v4 = l.h(v << v3, i.e[v1 + 325]);
        long v5 = v4 >>> ((int)(38L + (v4 >>> 0x3F)));
        int v6 = v3 + ((int)(v4 >>> 0x3F ^ 1L));
        if((v4 & 0x3FFFFFFFFFL) != 0x3FFFFFFFFFL && ((v4 & 0x3FFFFFFFFFL) != 0L || (3L & v5) != 1L)) {
            long v7 = v5 + 1L >>> 1;
            if(v7 >= 0x1000000L) {
                --v6;
                v7 = 0x800000L;
            }
            long v8 = (((long)v1) * 217706L >> 16) + 0xBFL - ((long)v6);
            if(v8 >= 1L && v8 <= 0xFEL) {
                if(z) {
                    v2 = 0x80000000L;
                }
                return Float.intBitsToFloat(((int)(v7 & 0xFFFFFFFFFF7FFFFFL | v8 << 23 | v2)));
            }
        }
        return NaNf;
    }

    static float d(boolean z, long v, int v1, boolean z1, int v2) {
        if(z1) {
            v1 = v2;
        }
        if(0xFFFFFF82 <= v1 && v1 <= 0x7F) {
            float f = k.a(((float)v) + (v >= 0L ? 0.0f : 18446744073709552000.0f), v1);
            return z ? -f : f;
        }
        return NaNf;
    }
}

