package com.google.common.math;

import J1.c;
import com.google.common.base.H;
import java.math.BigInteger;

@c
@e
final class d {
    static final long a = 0xFFFFFFFFFFFFFL;
    static final long b = 0x7FF0000000000000L;
    static final long c = 0x8000000000000000L;
    static final int d = 52;
    static final int e = 0x3FF;
    static final long f = 0x10000000000000L;
    @J1.e
    static final long g = 0x3FF0000000000000L;

    static double a(BigInteger bigInteger0) {
        BigInteger bigInteger1 = bigInteger0.abs();
        int v = bigInteger1.bitLength();
        if(v - 1 < 0x3F) {
            return (double)bigInteger0.longValue();
        }
        if(v - 1 > 0x3FF) {
            return ((double)bigInteger0.signum()) * Infinity;
        }
        long v1 = bigInteger1.shiftRight(v - 54).longValue();
        return Double.longBitsToDouble((((long)(v + 0x3FE)) << 52) + ((v1 & 1L) == 0L || (v1 >> 1 & 1L) == 0L && bigInteger1.getLowestSetBit() >= v - 54 ? 0xFFFFFFFFFFFFFL & v1 >> 1 : (0xFFFFFFFFFFFFFL & v1 >> 1) + 1L) | ((long)bigInteger0.signum()) & 0x8000000000000000L);
    }

    static double b(double f) {
        H.d(!Double.isNaN(f));
        return Math.max(f, 0.0);
    }

    static long c(double f) {
        H.e(d.d(f), "not a normal value");
        long v = Double.doubleToRawLongBits(f);
        return Math.getExponent(f) == 0xFFFFFC01 ? (v & 0xFFFFFFFFFFFFFL) << 1 : v & 0xFFFFFFFFFFFFFL | 0x10000000000000L;
    }

    static boolean d(double f) {
        return Math.getExponent(f) <= 0x3FF;
    }

    static boolean e(double f) {
        return Math.getExponent(f) >= 0xFFFFFC02;
    }

    static double f(double f) {
        return -Math.nextUp(-f);
    }

    static double g(double f) {
        return Double.longBitsToDouble(Double.doubleToRawLongBits(f) & 0xFFFFFFFFFFFFFL | 0x3FF0000000000000L);
    }
}

