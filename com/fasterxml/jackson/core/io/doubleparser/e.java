package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigInteger;
import java.util.Map;

class E {
    static final boolean a;

    static {
    }

    static BigInteger a(char[] arr_c, int v, int v1) {
        int v2 = v1 - v;
        h h0 = new h((((long)v2) * 3402L >>> 10) + 1L);
        int v3 = (v2 & 7) + v;
        int v4 = j.J(arr_c, v, v3);
        int v5 = v4 < 0 ? 0 : 1;
        h0.a(v4);
        while(v3 < v1) {
            int v6 = j.t(arr_c, v3);
            v5 &= (v6 < 0 ? 0 : 1);
            h0.b(100000000, v6);
            v3 += 8;
        }
        if(v5 == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        return h0.c();
    }

    static BigInteger b(char[] arr_c, int v, int v1, Map map0, int v2) {
        if(v1 - v <= v2) {
            return E.a(arr_c, v, v1);
        }
        int v3 = l.g(v, v1);
        BigInteger bigInteger0 = E.b(arr_c, v, v3, map0, v2);
        return E.b(arr_c, v3, v1, map0, v2).add(m.k(bigInteger0, ((BigInteger)map0.get(((int)(v1 - v3))))));
    }
}

