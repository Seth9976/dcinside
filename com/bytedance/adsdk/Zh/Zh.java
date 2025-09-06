package com.bytedance.adsdk.Zh;

class Zh {
    static final int[] PjT;
    static final Object[] ReZ;
    static final long[] Zh;

    static {
        Zh.PjT = new int[0];
        Zh.Zh = new long[0];
        Zh.ReZ = new Object[0];
    }

    static int PjT(int[] arr_v, int v, int v1) {
        int v2 = v - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = arr_v[v4];
            if(v5 < v1) {
                v3 = v4 + 1;
                continue;
            }
            if(v5 > v1) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v3;
    }
}

