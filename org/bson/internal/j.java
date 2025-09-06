package org.bson.internal;

import java.math.BigInteger;

public final class j {
    private static final long a = -1L;
    private static final long[] b;
    private static final int[] c;
    private static final int[] d;

    static {
        j.b = new long[37];
        j.c = new int[37];
        j.d = new int[37];
        BigInteger bigInteger0 = new BigInteger("10000000000000000", 16);
        for(int v = 2; v <= 36; ++v) {
            j.b[v] = j.c(-1L, v);
            j.c[v] = (int)j.f(-1L, v);
            j.d[v] = bigInteger0.toString(v).length() - 1;
        }
    }

    public static int a(long v, long v1) {
        return j.b(v ^ 0x8000000000000000L, v1 ^ 0x8000000000000000L);
    }

    private static int b(long v, long v1) {
        int v2 = Long.compare(v, v1);
        if(v2 < 0) {
            return -1;
        }
        return v2 == 0 ? 0 : 1;
    }

    private static long c(long v, long v1) {
        if(v1 < 0L) {
            return j.a(v, v1) >= 0 ? 1L : 0L;
        }
        if(v >= 0L) {
            return v / v1;
        }
        int v2 = 1;
        long v3 = (v >>> 1) / v1 << 1;
        if(j.a(v - v3 * v1, v1) < 0) {
            v2 = 0;
        }
        return v3 + ((long)v2);
    }

    private static boolean d(long v, int v1, int v2) {
        if(v >= 0L) {
            long v3 = j.b[v2];
            if(v < v3) {
                return false;
            }
            return v <= v3 ? v1 > j.c[v2] : true;
        }
        return true;
    }

    public static long e(String s) {
        if(s.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        int v = j.d[10] - 1;
        long v1 = 0L;
        for(int v2 = 0; v2 < s.length(); ++v2) {
            int v3 = Character.digit(s.charAt(v2), 10);
            if(v3 == -1) {
                throw new NumberFormatException(s);
            }
            if(v2 > v && j.d(v1, v3, 10)) {
                throw new NumberFormatException("Too large for unsigned long: " + s);
            }
            v1 = v1 * 10L + ((long)v3);
        }
        return v1;
    }

    private static long f(long v, long v1) {
        if(v1 < 0L) {
            return j.a(v, v1) >= 0 ? v - v1 : v;
        }
        if(v >= 0L) {
            return v % v1;
        }
        long v2 = v - ((v >>> 1) / v1 << 1) * v1;
        if(j.a(v2, v1) < 0) {
            v1 = 0L;
        }
        return v2 - v1;
    }

    public static String g(long v) {
        if(v >= 0L) {
            return Long.toString(v);
        }
        long v1 = (v >>> 1) / 5L;
        return Long.toString(v1) + (v - 10L * v1);
    }
}

