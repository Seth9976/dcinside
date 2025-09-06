package com.google.common.primitives;

import J1.b;
import com.google.common.base.H;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

@b
@f
public final class y {
    static enum a implements Comparator {
        INSTANCE;

        private static a[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((long[])object0), ((long[])object1));
        }

        public int g(long[] arr_v, long[] arr_v1) {
            int v = Math.min(arr_v.length, arr_v1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                long v2 = arr_v[v1];
                long v3 = arr_v1[v1];
                if(v2 != v3) {
                    return y.a(v2, v3);
                }
            }
            return arr_v.length - arr_v1.length;
        }

        @Override
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    static final class com.google.common.primitives.y.b {
        static final long[] a;
        static final int[] b;
        static final int[] c;

        static {
            com.google.common.primitives.y.b.a = new long[37];
            com.google.common.primitives.y.b.b = new int[37];
            com.google.common.primitives.y.b.c = new int[37];
            BigInteger bigInteger0 = new BigInteger("10000000000000000", 16);
            for(int v = 2; v <= 36; ++v) {
                com.google.common.primitives.y.b.a[v] = y.c(-1L, v);
                com.google.common.primitives.y.b.b[v] = (int)y.k(-1L, v);
                com.google.common.primitives.y.b.c[v] = bigInteger0.toString(v).length() - 1;
            }
        }

        static boolean a(long v, int v1, int v2) {
            if(v >= 0L) {
                long v3 = com.google.common.primitives.y.b.a[v2];
                if(v < v3) {
                    return false;
                }
                return v <= v3 ? v1 > com.google.common.primitives.y.b.b[v2] : true;
            }
            return true;
        }
    }

    public static final long a = -1L;

    public static int a(long v, long v1) {
        return n.e(v ^ 0x8000000000000000L, v1 ^ 0x8000000000000000L);
    }

    @O1.a
    public static long b(String s) {
        p p0 = p.a(s);
        try {
            return y.j(p0.a, p0.b);
        }
        catch(NumberFormatException numberFormatException0) {
            NumberFormatException numberFormatException1 = new NumberFormatException("Error parsing value: " + s);
            numberFormatException1.initCause(numberFormatException0);
            throw numberFormatException1;
        }
    }

    public static long c(long v, long v1) {
        if(v1 < 0L) {
            return y.a(v, v1) >= 0 ? 1L : 0L;
        }
        if(v >= 0L) {
            return v / v1;
        }
        int v2 = 1;
        long v3 = (v >>> 1) / v1 << 1;
        if(y.a(v - v3 * v1, v1) < 0) {
            v2 = 0;
        }
        return v3 + ((long)v2);
    }

    private static long d(long v) [...] // Inlined contents

    public static String e(String s, long[] arr_v) {
        H.E(s);
        if(arr_v.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_v.length * 5);
        stringBuilder0.append(y.p(arr_v[0]));
        for(int v = 1; v < arr_v.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(y.p(arr_v[v]));
        }
        return stringBuilder0.toString();
    }

    public static Comparator f() {
        return a.a;
    }

    public static long g(long[] arr_v) {
        H.d(arr_v.length > 0);
        long v1 = y.d(arr_v[0]);
        for(int v = 1; v < arr_v.length; ++v) {
            long v2 = y.d(arr_v[v]);
            if(v2 > v1) {
                v1 = v2;
            }
        }
        return v1 ^ 0x8000000000000000L;
    }

    public static long h(long[] arr_v) {
        H.d(arr_v.length > 0);
        long v1 = y.d(arr_v[0]);
        for(int v = 1; v < arr_v.length; ++v) {
            long v2 = y.d(arr_v[v]);
            if(v2 < v1) {
                v1 = v2;
            }
        }
        return v1 ^ 0x8000000000000000L;
    }

    @O1.a
    public static long i(String s) {
        return y.j(s, 10);
    }

    @O1.a
    public static long j(String s, int v) {
        H.E(s);
        if(s.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if(v < 2 || v > 36) {
            throw new NumberFormatException("illegal radix: " + v);
        }
        int v1 = com.google.common.primitives.y.b.c[v] - 1;
        long v2 = 0L;
        for(int v3 = 0; v3 < s.length(); ++v3) {
            int v4 = Character.digit(s.charAt(v3), v);
            if(v4 == -1) {
                throw new NumberFormatException(s);
            }
            if(v3 > v1 && com.google.common.primitives.y.b.a(v2, v4, v)) {
                throw new NumberFormatException("Too large for unsigned long: " + s);
            }
            v2 = v2 * ((long)v) + ((long)v4);
        }
        return v2;
    }

    public static long k(long v, long v1) {
        if(v1 < 0L) {
            return y.a(v, v1) >= 0 ? v - v1 : v;
        }
        if(v >= 0L) {
            return v % v1;
        }
        long v2 = v - ((v >>> 1) / v1 << 1) * v1;
        if(y.a(v2, v1) < 0) {
            v1 = 0L;
        }
        return v2 - v1;
    }

    public static void l(long[] arr_v) {
        H.E(arr_v);
        y.m(arr_v, 0, arr_v.length);
    }

    public static void m(long[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        for(int v2 = v; v2 < v1; ++v2) {
            arr_v[v2] = y.d(arr_v[v2]);
        }
        Arrays.sort(arr_v, v, v1);
        while(v < v1) {
            arr_v[v] = y.d(arr_v[v]);
            ++v;
        }
    }

    public static void n(long[] arr_v) {
        H.E(arr_v);
        y.o(arr_v, 0, arr_v.length);
    }

    public static void o(long[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        for(int v2 = v; v2 < v1; ++v2) {
            arr_v[v2] ^= 0x7FFFFFFFFFFFFFFFL;
        }
        Arrays.sort(arr_v, v, v1);
        while(v < v1) {
            arr_v[v] ^= 0x7FFFFFFFFFFFFFFFL;
            ++v;
        }
    }

    public static String p(long v) {
        return y.q(v, 10);
    }

    public static String q(long v, int v1) {
        H.k(v1 >= 2 && v1 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", v1);
        int v2 = Long.compare(v, 0L);
        if(v2 == 0) {
            return "0";
        }
        if(v2 > 0) {
            return Long.toString(v, v1);
        }
        int v3 = 0x40;
        char[] arr_c = new char[0x40];
        if((v1 & v1 - 1) == 0) {
            int v4 = Integer.numberOfTrailingZeros(v1);
            do {
                --v3;
                arr_c[v3] = Character.forDigit(((int)v) & v1 - 1, v1);
                v >>>= v4;
            }
            while(v != 0L);
            return new String(arr_c, v3, 0x40 - v3);
        }
        long v5 = (v1 & 1) == 0 ? (v >>> 1) / ((long)(v1 >>> 1)) : y.c(v, v1);
        int v6 = 0x3F;
        arr_c[0x3F] = Character.forDigit(((int)(v - v5 * ((long)v1))), v1);
        while(v5 > 0L) {
            --v6;
            arr_c[v6] = Character.forDigit(((int)(v5 % ((long)v1))), v1);
            v5 /= (long)v1;
        }
        return new String(arr_c, v6, 0x40 - v6);
    }
}

