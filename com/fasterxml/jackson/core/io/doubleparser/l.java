package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigInteger;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

class l {
    public static final BigInteger a;
    static final BigInteger b;
    static final BigInteger c;
    private static final BigInteger[] d;

    static {
        l.a = BigInteger.valueOf(5L);
        l.b = BigInteger.valueOf(10000000000000000L);
        l.c = BigInteger.valueOf(0x2386F26FC1L);
        BigInteger bigInteger0 = BigInteger.valueOf(100L);
        BigInteger bigInteger1 = BigInteger.valueOf(1000L);
        BigInteger bigInteger2 = BigInteger.valueOf(10000L);
        BigInteger bigInteger3 = BigInteger.valueOf(100000L);
        BigInteger bigInteger4 = BigInteger.valueOf(1000000L);
        BigInteger bigInteger5 = BigInteger.valueOf(10000000L);
        BigInteger bigInteger6 = BigInteger.valueOf(100000000L);
        BigInteger bigInteger7 = BigInteger.valueOf(1000000000L);
        BigInteger bigInteger8 = BigInteger.valueOf(10000000000L);
        BigInteger bigInteger9 = BigInteger.valueOf(100000000000L);
        BigInteger bigInteger10 = BigInteger.valueOf(1000000000000L);
        BigInteger bigInteger11 = BigInteger.valueOf(10000000000000L);
        BigInteger bigInteger12 = BigInteger.valueOf(100000000000000L);
        BigInteger bigInteger13 = BigInteger.valueOf(1000000000000000L);
        l.d = new BigInteger[]{BigInteger.ONE, BigInteger.TEN, bigInteger0, bigInteger1, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, bigInteger9, bigInteger10, bigInteger11, bigInteger12, bigInteger13};
    }

    static BigInteger a(NavigableMap navigableMap0, int v) {
        BigInteger[] arr_bigInteger = l.d;
        if(v < arr_bigInteger.length) {
            return arr_bigInteger[v];
        }
        if(navigableMap0 != null) {
            Map.Entry map$Entry0 = navigableMap0.floorEntry(v);
            Integer integer0 = (Integer)map$Entry0.getKey();
            return ((int)integer0) == v ? ((BigInteger)map$Entry0.getValue()) : m.k(((BigInteger)map$Entry0.getValue()), l.a(navigableMap0, v - ((int)integer0)));
        }
        return l.a.pow(v).shiftLeft(v);
    }

    static BigInteger b(NavigableMap navigableMap0, int v) {
        Map.Entry map$Entry0 = navigableMap0.floorEntry(((int)(v & -16)));
        int v1 = (int)(((Integer)map$Entry0.getKey()));
        BigInteger bigInteger0 = (BigInteger)map$Entry0.getValue();
        if(v1 == (v & -16)) {
            return bigInteger0;
        }
        int v2 = (v & -16) - v1;
        BigInteger bigInteger1 = (BigInteger)navigableMap0.get(v2);
        if(bigInteger1 == null) {
            bigInteger1 = l.b(navigableMap0, v2);
            navigableMap0.put(v2, bigInteger1);
        }
        return m.k(bigInteger0, bigInteger1);
    }

    static NavigableMap c() {
        NavigableMap navigableMap0 = new TreeMap();
        navigableMap0.put(0, BigInteger.ONE);
        navigableMap0.put(16, l.b);
        return navigableMap0;
    }

    public static long d(long v) [...] // Inlined contents

    static NavigableMap e(int v, int v1) {
        NavigableMap navigableMap0 = new TreeMap();
        navigableMap0.put(0, BigInteger.valueOf(5L));
        navigableMap0.put(16, l.c);
        l.f(navigableMap0, v, v1);
        for(Object object0: navigableMap0.entrySet()) {
            ((Map.Entry)object0).setValue(((BigInteger)((Map.Entry)object0).getValue()).shiftLeft(((int)(((Integer)((Map.Entry)object0).getKey())))));
        }
        return navigableMap0;
    }

    static void f(NavigableMap navigableMap0, int v, int v1) {
        if(v1 - v <= 18) {
            return;
        }
        int v2 = l.g(v, v1);
        int v3 = v1 - v2;
        if(!navigableMap0.containsKey(v3)) {
            l.f(navigableMap0, v, v2);
            l.f(navigableMap0, v2, v1);
            navigableMap0.put(v3, l.b(navigableMap0, v3));
        }
    }

    static int g(int v, int v1) {
        return v1 - (v1 - (v + v1 >>> 1) + 15 >> 4 << 4);
    }

    static long h(long v, long v1) {
        long v2 = (v1 >>> 0x20) * (v & 0xFFFFFFFFL);
        return (v >>> 0x20) * (v1 >>> 0x20) + ((v >>> 0x20) * (v1 & 0xFFFFFFFFL) + ((v & 0xFFFFFFFFL) * (v1 & 0xFFFFFFFFL) >>> 0x20) + (0xFFFFFFFFL & v2) >>> 0x20) + (v2 >>> 0x20);
    }
}

