package org.mp4parser.tools;

public class Mp4Math {
    public static int gcd(int v, int v1) {
        int v2;
        while(true) {
            v2 = v;
            v = v1;
            if(v <= 0) {
                break;
            }
            v1 = v2 % v;
        }
        return v2;
    }

    public static long gcd(long v, long v1) {
        long v3;
        while(true) {
            long v2 = v;
            v = v1;
            v3 = v2;
            if(v <= 0L) {
                break;
            }
            v1 = v3 % v;
        }
        return v3;
    }

    public static int lcm(int v, int v1) {
        return v * (v1 / Mp4Math.gcd(v, v1));
    }

    public static long lcm(long v, long v1) {
        return v * (v1 / Mp4Math.gcd(v, v1));
    }

    public static long lcm(long[] arr_v) {
        long v = arr_v[0];
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            v = Mp4Math.lcm(v, arr_v[v1]);
        }
        return v;
    }
}

