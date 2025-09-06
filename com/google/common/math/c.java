package com.google.common.math;

import J1.b;
import J1.d;
import com.google.common.base.H;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

@b(emulated = true)
@e
public final class c {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[RoundingMode.values().length];
            a.a = arr_v;
            try {
                arr_v[RoundingMode.UNNECESSARY.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.FLOOR.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.CEILING.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.DOWN.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.UP.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_UP.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final double a = -2147483648.0;
    private static final double b = 2147483647.0;
    private static final double c = -9223372036854776000.0;
    private static final double d = 9223372036854776000.0;
    private static final double e = 0.0;
    @J1.e
    static final int f = 170;
    @J1.e
    static final double[] g;

    static {
        c.e = 0.693147;
        c.g = new double[]{1.0, 20922789888000.0, 2.631308E+35, 1.241392E+61, 1.268869E+89, 7.156946E+118, 9.916779E+149, 1.974507E+182, 3.856205E+215, 5.550294E+249, 4.714724E+284};
    }

    @J1.c
    @d
    @O1.a
    private static double a(double f) {
        H.d(com.google.common.math.d.d(f));
        return f;
    }

    public static double b(int v) {
        i.e("n", v);
        if(v > 170) {
            return Infinity;
        }
        int v1 = (v & -16) + 1;
        double f = 1.0;
        while(v1 <= v) {
            f *= (double)v1;
            ++v1;
        }
        return f * c.g[v >> 4];
    }

    public static int c(double f, double f1, double f2) {
        if(c.d(f, f1, f2)) {
            return 0;
        }
        if(f < f1) {
            return -1;
        }
        return f > f1 ? 1 : com.google.common.primitives.a.d(Double.isNaN(f), Double.isNaN(f1));
    }

    public static boolean d(double f, double f1, double f2) {
        i.d("tolerance", f2);
        return Math.copySign(f - f1, 1.0) <= f2 || f == f1 || Double.isNaN(f) && Double.isNaN(f1);
    }

    @J1.c
    public static boolean e(double f) {
        return com.google.common.math.d.d(f) && (f == 0.0 || 52 - Long.numberOfTrailingZeros(com.google.common.math.d.c(f)) <= Math.getExponent(f));
    }

    @J1.c
    @d
    public static boolean f(double f) {
        if(f > 0.0 && com.google.common.math.d.d(f)) {
            long v = com.google.common.math.d.c(f);
            return (v & v - 1L) == 0L;
        }
        return false;
    }

    public static double g(double f) {
        return Math.log(f) / c.e;
    }

    @J1.c
    @d
    public static int h(double f, RoundingMode roundingMode0) {
        int v = 0;
        H.e(f > 0.0 && com.google.common.math.d.d(f), "x must be positive and finite");
        int v1 = Math.getExponent(f);
        if(!com.google.common.math.d.e(f)) {
            return c.h(f * 4503599627370496.0, roundingMode0) - 52;
        }
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(c.f(f));
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                return !c.f(f) == 0 ? v1 : v1 + 1;
            }
            case 4: {
                if(v1 < 0) {
                    v = 1;
                }
                return (v & !c.f(f)) == 0 ? v1 : v1 + 1;
            }
            case 5: {
                if(v1 >= 0) {
                    v = 1;
                }
                return (v & !c.f(f)) == 0 ? v1 : v1 + 1;
            }
            case 6: 
            case 7: 
            case 8: {
                double f1 = com.google.common.math.d.g(f);
                return f1 * f1 > 2.0 ? v1 + 1 : v1;
            }
            default: {
                throw new AssertionError();
            }
        }
        return v1;
    }

    @J1.c
    @d
    @Deprecated
    public static double i(Iterable iterable0) {
        return c.j(iterable0.iterator());
    }

    @J1.c
    @d
    @Deprecated
    public static double j(Iterator iterator0) {
        H.e(iterator0.hasNext(), "Cannot take mean of 0 values");
        Object object0 = iterator0.next();
        double f = c.a(((Number)object0).doubleValue());
        long v = 1L;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            ++v;
            f += (c.a(((Number)object1).doubleValue()) - f) / ((double)v);
        }
        return f;
    }

    @J1.c
    @d
    @Deprecated
    public static double k(double[] arr_f) {
        H.e(arr_f.length > 0, "Cannot take mean of 0 values");
        double f = c.a(arr_f[0]);
        long v1 = 1L;
        for(int v = 1; v < arr_f.length; ++v) {
            c.a(arr_f[v]);
            ++v1;
            f += (arr_f[v] - f) / ((double)v1);
        }
        return f;
    }

    @Deprecated
    public static double l(int[] arr_v) {
        H.e(arr_v.length > 0, "Cannot take mean of 0 values");
        long v1 = 0L;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += (long)arr_v[v];
        }
        return ((double)v1) / ((double)arr_v.length);
    }

    @Deprecated
    public static double m(long[] arr_v) {
        H.e(arr_v.length > 0, "Cannot take mean of 0 values");
        double f = (double)arr_v[0];
        long v1 = 1L;
        for(int v = 1; v < arr_v.length; ++v) {
            ++v1;
            f += (((double)arr_v[v]) - f) / ((double)v1);
        }
        return f;
    }

    @J1.c
    @d
    static double n(double f, RoundingMode roundingMode0) {
        if(com.google.common.math.d.d(f)) {
            switch(a.a[roundingMode0.ordinal()]) {
                case 1: {
                    i.k(c.e(f));
                    return f;
                }
                case 2: {
                    return f >= 0.0 || c.e(f) ? f : ((double)(((long)f) - 1L));
                }
                case 3: {
                    return f <= 0.0 || c.e(f) ? f : ((double)(((long)f) + 1L));
                }
                case 4: {
                    return f;
                }
                case 5: {
                    if(c.e(f)) {
                        return f;
                    }
                    return f > 0.0 ? ((double)(((long)f) + 1L)) : ((double)(((long)f) - 1L));
                }
                case 6: {
                    return Math.rint(f);
                }
                case 7: {
                    double f1 = Math.rint(f);
                    return Math.abs(f - f1) == 0.5 ? f + Math.copySign(0.5, f) : f1;
                }
                case 8: {
                    double f2 = Math.rint(f);
                    return Math.abs(f - f2) == 0.5 ? f : f2;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    @J1.c
    @d
    public static BigInteger o(double f, RoundingMode roundingMode0) {
        double f1 = c.n(f, roundingMode0);
        if(((f1 < 9223372036854776000.0 ? 1 : 0) & (-9223372036854776000.0 - f1 < 1.0 ? 1 : 0)) != 0) {
            return BigInteger.valueOf(((long)f1));
        }
        BigInteger bigInteger0 = BigInteger.valueOf(com.google.common.math.d.c(f1)).shiftLeft(Math.getExponent(f1) - 52);
        return f1 < 0.0 ? bigInteger0.negate() : bigInteger0;
    }

    @J1.c
    @d
    public static int p(double f, RoundingMode roundingMode0) {
        double f1 = c.n(f, roundingMode0);
        i.a(((boolean)((f1 > -2147483649.0 ? 1 : 0) & (f1 < 2147483648.0 ? 1 : 0))), f, roundingMode0);
        return (int)f1;
    }

    @J1.c
    @d
    public static long q(double f, RoundingMode roundingMode0) {
        double f1 = c.n(f, roundingMode0);
        i.a(((boolean)((-9223372036854776000.0 - f1 < 1.0 ? 1 : 0) & (f1 < 9223372036854776000.0 ? 1 : 0))), f, roundingMode0);
        return (long)f1;
    }
}

