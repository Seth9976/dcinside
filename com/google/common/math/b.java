package com.google.common.math;

import J1.b;
import J1.c;
import J1.d;
import com.google.common.base.H;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@b(emulated = true)
@e
public final class com.google.common.math.b {
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
                a.a[RoundingMode.DOWN.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.FLOOR.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.UP.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.CEILING.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_UP.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    @c
    @d
    static class com.google.common.math.b.b extends p {
        static final com.google.common.math.b.b a;

        static {
            com.google.common.math.b.b.a = new com.google.common.math.b.b();
        }

        @Override  // com.google.common.math.p
        Number a(Number number0, Number number1) {
            return this.f(((BigInteger)number0), ((BigInteger)number1));
        }

        @Override  // com.google.common.math.p
        double c(Number number0) {
            return this.g(((BigInteger)number0));
        }

        @Override  // com.google.common.math.p
        int d(Number number0) {
            return this.h(((BigInteger)number0));
        }

        @Override  // com.google.common.math.p
        Number e(double f, RoundingMode roundingMode0) {
            return this.i(f, roundingMode0);
        }

        BigInteger f(BigInteger bigInteger0, BigInteger bigInteger1) {
            return bigInteger0.subtract(bigInteger1);
        }

        double g(BigInteger bigInteger0) {
            return com.google.common.math.d.a(bigInteger0);
        }

        int h(BigInteger bigInteger0) {
            return bigInteger0.signum();
        }

        BigInteger i(double f, RoundingMode roundingMode0) {
            return com.google.common.math.c.o(f, roundingMode0);
        }
    }

    @J1.e
    static final int a = 0x100;
    @J1.e
    static final BigInteger b;
    private static final double c;
    private static final double d;

    static {
        com.google.common.math.b.b = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
        com.google.common.math.b.c = 2.302585;
        com.google.common.math.b.d = 0.693147;
    }

    public static BigInteger a(int v, int v1) {
        i.e("n", v);
        i.e("k", v1);
        int v2 = 1;
        H.m(v1 <= v, "k (%s) > n (%s)", v1, v);
        if(v1 > v >> 1) {
            v1 = v - v1;
        }
        if(v1 < h.h.length && v <= h.h[v1]) {
            return BigInteger.valueOf(h.a(v, v1));
        }
        BigInteger bigInteger0 = BigInteger.ONE;
        long v3 = (long)v;
        int v4 = h.q(v3, RoundingMode.CEILING);
        long v5 = 1L;
    alab1:
        while(true) {
            int v6 = v4;
            while(true) {
                if(v2 >= v1) {
                    break alab1;
                }
                int v7 = v - v2;
                ++v2;
                v6 += v4;
                if(v6 >= 0x3F) {
                    bigInteger0 = bigInteger0.multiply(BigInteger.valueOf(v3)).divide(BigInteger.valueOf(v5));
                    v3 = (long)v7;
                    v5 = (long)v2;
                    break;
                }
                v3 *= (long)v7;
                v5 *= (long)v2;
            }
        }
        return bigInteger0.multiply(BigInteger.valueOf(v3)).divide(BigInteger.valueOf(v5));
    }

    public static BigInteger b(BigInteger bigInteger0) {
        return BigInteger.ZERO.setBit(com.google.common.math.b.k(bigInteger0, RoundingMode.CEILING));
    }

    @c
    @d
    public static BigInteger c(BigInteger bigInteger0, BigInteger bigInteger1, RoundingMode roundingMode0) {
        return new BigDecimal(bigInteger0).divide(new BigDecimal(bigInteger1), 0, roundingMode0).toBigIntegerExact();
    }

    public static BigInteger d(int v) {
        i.e("n", v);
        long[] arr_v = h.g;
        if(v < arr_v.length) {
            return BigInteger.valueOf(arr_v[v]);
        }
        RoundingMode roundingMode0 = RoundingMode.CEILING;
        ArrayList arrayList0 = new ArrayList(f.g(f.p(v, roundingMode0) * v, 0x40, roundingMode0));
        long v1 = arr_v[arr_v.length - 1];
        int v2 = Long.numberOfTrailingZeros(v1);
        long v3 = v1 >> v2;
        RoundingMode roundingMode1 = RoundingMode.FLOOR;
        int v4 = h.q(v3, roundingMode1) + 1;
        long v5 = (long)arr_v.length;
        int v6 = h.q(v5, roundingMode1);
        int v7 = v6 + 1;
        int v8 = 1 << v6;
        while(v5 <= ((long)v)) {
            if((((long)v8) & v5) != 0L) {
                v8 <<= 1;
                ++v7;
            }
            int v9 = Long.numberOfTrailingZeros(v5);
            v2 += v9;
            if(v7 - v9 + v4 >= 0x40) {
                arrayList0.add(BigInteger.valueOf(v3));
                v3 = 1L;
            }
            v3 *= v5 >> v9;
            v4 = h.q(v3, RoundingMode.FLOOR) + 1;
            ++v5;
        }
        if(v3 > 1L) {
            arrayList0.add(BigInteger.valueOf(v3));
        }
        return com.google.common.math.b.h(arrayList0).shiftLeft(v2);
    }

    @c
    @d
    static boolean e(BigInteger bigInteger0) {
        return bigInteger0.bitLength() <= 0x3F;
    }

    public static BigInteger f(BigInteger bigInteger0) {
        return BigInteger.ZERO.setBit(com.google.common.math.b.k(bigInteger0, RoundingMode.FLOOR));
    }

    public static boolean g(BigInteger bigInteger0) {
        H.E(bigInteger0);
        return bigInteger0.signum() > 0 && bigInteger0.getLowestSetBit() == bigInteger0.bitLength() - 1;
    }

    static BigInteger h(List list0) {
        return com.google.common.math.b.i(list0, 0, list0.size());
    }

    static BigInteger i(List list0, int v, int v1) {
        switch(v1 - v) {
            case 0: {
                return BigInteger.ONE;
            }
            case 1: {
                return (BigInteger)list0.get(v);
            }
            case 2: {
                return ((BigInteger)list0.get(v)).multiply(((BigInteger)list0.get(v + 1)));
            }
            case 3: {
                return ((BigInteger)list0.get(v)).multiply(((BigInteger)list0.get(v + 1))).multiply(((BigInteger)list0.get(v + 2)));
            }
            default: {
                int v2 = v1 + v >>> 1;
                return com.google.common.math.b.i(list0, v, v2).multiply(com.google.common.math.b.i(list0, v2, v1));
            }
        }
    }

    @c
    @d
    public static int j(BigInteger bigInteger0, RoundingMode roundingMode0) {
        int v3;
        int v2;
        i.j("x", bigInteger0);
        if(com.google.common.math.b.e(bigInteger0)) {
            return h.o(bigInteger0.longValue(), roundingMode0);
        }
        int v = (int)(((double)com.google.common.math.b.k(bigInteger0, RoundingMode.FLOOR)) * com.google.common.math.b.d / com.google.common.math.b.c);
        BigInteger bigInteger1 = BigInteger.TEN;
        BigInteger bigInteger2 = bigInteger1.pow(v);
        int v1 = bigInteger2.compareTo(bigInteger0);
        if(v1 > 0) {
            do {
                --v;
                bigInteger2 = bigInteger2.divide(BigInteger.TEN);
                v2 = bigInteger2.compareTo(bigInteger0);
            }
            while(v2 > 0);
            v3 = v2;
        }
        else {
            BigInteger bigInteger3 = bigInteger1.multiply(bigInteger2);
            int v4 = v1;
            for(int v5 = bigInteger3.compareTo(bigInteger0); v5 <= 0; v5 = bigInteger4.compareTo(bigInteger0)) {
                ++v;
                BigInteger bigInteger4 = BigInteger.TEN.multiply(bigInteger3);
                bigInteger2 = bigInteger3;
                bigInteger3 = bigInteger4;
                v4 = v5;
            }
            v3 = v4;
        }
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(v3 == 0);
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                return bigInteger2.equals(bigInteger0) ? v : v + 1;
            }
            case 6: 
            case 7: 
            case 8: {
                return bigInteger0.pow(2).compareTo(bigInteger2.pow(2).multiply(BigInteger.TEN)) <= 0 ? v : v + 1;
            }
            default: {
                throw new AssertionError();
            }
        }
        return v;
    }

    public static int k(BigInteger bigInteger0, RoundingMode roundingMode0) {
        i.j("x", ((BigInteger)H.E(bigInteger0)));
        int v = bigInteger0.bitLength();
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(com.google.common.math.b.g(bigInteger0));
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                return com.google.common.math.b.g(bigInteger0) ? v - 1 : v;
            }
            case 6: 
            case 7: 
            case 8: {
                if(v - 1 < 0x100) {
                    return bigInteger0.compareTo(com.google.common.math.b.b.shiftRight(0x101 - v)) > 0 ? v : v - 1;
                }
                return bigInteger0.pow(2).bitLength() - 1 >= (v - 1) * 2 + 1 ? v : v - 1;
            }
            default: {
                throw new AssertionError();
            }
        }
        return v - 1;
    }

    @c
    @d
    public static double l(BigInteger bigInteger0, RoundingMode roundingMode0) {
        return com.google.common.math.b.b.a.b(bigInteger0, roundingMode0);
    }

    @c
    @d
    public static BigInteger m(BigInteger bigInteger0, RoundingMode roundingMode0) {
        i.g("x", bigInteger0);
        if(com.google.common.math.b.e(bigInteger0)) {
            return BigInteger.valueOf(h.B(bigInteger0.longValue(), roundingMode0));
        }
        BigInteger bigInteger1 = com.google.common.math.b.o(bigInteger0);
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(bigInteger1.pow(2).equals(bigInteger0));
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                int v = bigInteger1.intValue();
                return v * v == bigInteger0.intValue() && bigInteger1.pow(2).equals(bigInteger0) ? bigInteger1 : bigInteger1.add(BigInteger.ONE);
            }
            case 6: 
            case 7: 
            case 8: {
                return bigInteger1.pow(2).add(bigInteger1).compareTo(bigInteger0) >= 0 ? bigInteger1 : bigInteger1.add(BigInteger.ONE);
            }
            default: {
                throw new AssertionError();
            }
        }
        return bigInteger1;
    }

    @c
    @d
    private static BigInteger n(BigInteger bigInteger0) {
        return com.google.common.math.c.o(Math.sqrt(com.google.common.math.d.a(bigInteger0)), RoundingMode.HALF_EVEN);
    }

    @c
    @d
    private static BigInteger o(BigInteger bigInteger0) {
        BigInteger bigInteger1;
        int v = com.google.common.math.b.k(bigInteger0, RoundingMode.FLOOR);
        if(v < 0x3FF) {
            bigInteger1 = com.google.common.math.b.n(bigInteger0);
        }
        else {
            int v1 = v - 52 & -2;
            bigInteger1 = com.google.common.math.b.n(bigInteger0.shiftRight(v1)).shiftLeft(v1 >> 1);
        }
        BigInteger bigInteger2 = bigInteger1.add(bigInteger0.divide(bigInteger1)).shiftRight(1);
        if(bigInteger1.equals(bigInteger2)) {
            return bigInteger1;
        }
        while(true) {
            BigInteger bigInteger3 = bigInteger2.add(bigInteger0.divide(bigInteger2)).shiftRight(1);
            if(bigInteger3.compareTo(bigInteger2) >= 0) {
                break;
            }
            bigInteger2 = bigInteger3;
        }
        return bigInteger2;
    }
}

