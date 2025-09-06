package com.google.common.math;

import J1.b;
import O1.a;
import java.math.BigInteger;
import java.math.RoundingMode;

@b
@e
final class i {
    static void a(boolean z, double f, RoundingMode roundingMode0) {
        if(!z) {
            throw new ArithmeticException("rounded value is out of range for input " + f + " and rounding mode " + roundingMode0);
        }
    }

    static void b(boolean z, String s, int v, int v1) {
        if(!z) {
            throw new ArithmeticException("overflow: " + s + "(" + v + ", " + v1 + ")");
        }
    }

    static void c(boolean z, String s, long v, long v1) {
        if(!z) {
            throw new ArithmeticException("overflow: " + s + "(" + v + ", " + v1 + ")");
        }
    }

    @a
    static double d(String s, double f) {
        if(f < 0.0) {
            throw new IllegalArgumentException(s + " (" + f + ") must be >= 0");
        }
        return f;
    }

    @a
    static int e(String s, int v) {
        if(v < 0) {
            throw new IllegalArgumentException(s + " (" + v + ") must be >= 0");
        }
        return v;
    }

    @a
    static long f(String s, long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(s + " (" + v + ") must be >= 0");
        }
        return v;
    }

    @a
    static BigInteger g(String s, BigInteger bigInteger0) {
        if(bigInteger0.signum() < 0) {
            throw new IllegalArgumentException(s + " (" + bigInteger0 + ") must be >= 0");
        }
        return bigInteger0;
    }

    @a
    static int h(String s, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(s + " (" + v + ") must be > 0");
        }
        return v;
    }

    @a
    static long i(String s, long v) {
        if(v <= 0L) {
            throw new IllegalArgumentException(s + " (" + v + ") must be > 0");
        }
        return v;
    }

    @a
    static BigInteger j(String s, BigInteger bigInteger0) {
        if(bigInteger0.signum() <= 0) {
            throw new IllegalArgumentException(s + " (" + bigInteger0 + ") must be > 0");
        }
        return bigInteger0;
    }

    static void k(boolean z) {
        if(!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}

