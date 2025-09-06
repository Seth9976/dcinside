package com.google.common.collect;

import J1.c;
import com.google.common.base.B;
import java.util.Arrays;
import o3.a;

@c
@C1
final class g1 {
    static final byte a = 0;
    private static final int b = 5;
    static final int c = 0x20;
    static final int d = 0x1F;
    static final int e = 0x3FFFFFFF;
    static final int f = 3;
    private static final int g = 4;
    private static final int h = 0x100;
    private static final int i = 0xFF;
    private static final int j = 0x10000;
    private static final int k = 0xFFFF;

    static Object a(int v) {
        if(v < 2 || v > 0x40000000 || Integer.highestOneBit(v) != v) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + v);
        }
        if(v <= 0x100) {
            return new byte[v];
        }
        return v <= 0x10000 ? new short[v] : new int[v];
    }

    static int b(int v, int v1) [...] // Inlined contents

    static int c(int v, int v1) [...] // Inlined contents

    static int d(int v, int v1, int v2) [...] // Inlined contents

    static int e(int v) {
        return v >= 0x20 ? 2 * (v + 1) : 4 * (v + 1);
    }

    static int f(@a Object object0, @a Object object1, int v, Object object2, int[] arr_v, Object[] arr_object, @a Object[] arr_object1) {
        int v1 = F2.d(object0);
        int v2 = v1 & v;
        int v3 = g1.h(object2, v2);
        if(v3 == 0) {
            return -1;
        }
        int v4 = -1;
        while(true) {
            int v5 = arr_v[v3 - 1];
            if((v5 & ~v) == (v1 & ~v) && B.a(object0, arr_object[v3 - 1]) && (arr_object1 == null || B.a(object1, arr_object1[v3 - 1]))) {
                int v6 = v5 & v;
                if(v4 == -1) {
                    g1.i(object2, v2, v6);
                    return v3 - 1;
                }
                arr_v[v4] = g1.d(arr_v[v4], v6, v);
                return v3 - 1;
            }
            int v7 = v5 & v;
            if(v7 == 0) {
                return -1;
            }
            v4 = v3 - 1;
            v3 = v7;
        }
    }

    static void g(Object object0) {
        if(object0 instanceof byte[]) {
            Arrays.fill(((byte[])object0), 0);
            return;
        }
        if(object0 instanceof short[]) {
            Arrays.fill(((short[])object0), 0);
            return;
        }
        Arrays.fill(((int[])object0), 0);
    }

    static int h(Object object0, int v) {
        if(object0 instanceof byte[]) {
            return ((byte[])object0)[v] & 0xFF;
        }
        return object0 instanceof short[] ? ((short[])object0)[v] & 0xFFFF : ((int[])object0)[v];
    }

    static void i(Object object0, int v, int v1) {
        if(object0 instanceof byte[]) {
            ((byte[])object0)[v] = (byte)v1;
            return;
        }
        if(object0 instanceof short[]) {
            ((short[])object0)[v] = (short)v1;
            return;
        }
        ((int[])object0)[v] = v1;
    }

    static int j(int v) {
        return Math.max(4, F2.a(v + 1, 1.0));
    }
}

