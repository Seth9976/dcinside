package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigInteger;

class s extends b {
    public BigInteger k(char[] arr_c, int v, int v1, int v2) throws NumberFormatException {
        int v5;
        try {
            int v3 = g.d(arr_c.length, v, v1);
            int v4 = arr_c[v];
            if(v4 != 45 && v4 != 43) {
                v5 = v;
                goto label_7;
            }
            v5 = v + 1;
            if(g.c(arr_c, v5, v3) != 0) {
            label_7:
                switch(v2) {
                    case 10: {
                        return this.l(arr_c, v5, v3, v4 == 45);
                    }
                    case 16: {
                        return this.m(arr_c, v5, v3, v4 == 45);
                    }
                    default: {
                        return new BigInteger(new String(arr_c, v, v1), v2);
                    }
                }
            }
            throw new NumberFormatException("illegal syntax");
        }
        catch(ArithmeticException arithmeticException0) {
        }
        NumberFormatException numberFormatException0 = new NumberFormatException("value exceeds limits");
        numberFormatException0.initCause(arithmeticException0);
        throw numberFormatException0;
    }

    private BigInteger l(char[] arr_c, int v, int v1, boolean z) {
        int v2 = v1 - v;
        if(b.j(v2)) {
            return this.n(arr_c, v, v1, z);
        }
        int v3 = (v2 & 7) + v;
        long v4 = (long)j.J(arr_c, v, v3);
        int v5 = v4 < 0L ? 0 : 1;
        while(v3 < v1) {
            int v6 = j.t(arr_c, v3);
            v5 &= (v6 < 0 ? 0 : 1);
            v4 = v4 * 100000000L + ((long)v6);
            v3 += 8;
        }
        if(v5 == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if(z) {
            v4 = -v4;
        }
        return BigInteger.valueOf(v4);
    }

    private BigInteger m(char[] arr_c, int v, int v1, boolean z) {
        int v6;
        int v5;
        int v2 = this.o(arr_c, v, v1);
        int v3 = v1 - v2;
        if(v3 <= 0) {
            return BigInteger.ZERO;
        }
        b.i(v3);
        byte[] arr_b = new byte[(v3 + 1 >> 1) + 1];
        if((v3 & 1) == 0) {
            v6 = 0;
            v5 = 1;
        }
        else {
            int v4 = g.g(arr_c[v2]);
            arr_b[1] = (byte)v4;
            v5 = 2;
            v6 = v4 >= 0 ? 0 : 1;
            ++v2;
        }
        int v7 = (v1 - v2 & 7) + v2;
        while(v2 < v7) {
            int v8 = arr_c[v2];
            int v9 = arr_c[v2 + 1];
            int v10 = g.g(((char)v8));
            int v11 = g.g(((char)v9));
            arr_b[v5] = (byte)(v10 << 4 | v11);
            v6 |= (v10 < 0 || v11 < 0 ? 1 : 0);
            v2 += 2;
            ++v5;
        }
        while(v2 < v1) {
            long v12 = j.z(arr_c, v2);
            j.K(arr_b, v5, ((int)v12));
            v6 |= (v12 >= 0L ? 0 : 1);
            v2 += 8;
            v5 += 4;
        }
        if(v6 != 0) {
            throw new NumberFormatException("illegal syntax");
        }
        BigInteger bigInteger0 = new BigInteger(arr_b);
        return z ? bigInteger0.negate() : bigInteger0;
    }

    private BigInteger n(char[] arr_c, int v, int v1, boolean z) {
        int v2 = this.o(arr_c, v, v1);
        b.h(v1 - v2);
        BigInteger bigInteger0 = E.b(arr_c, v2, v1, l.e(v2, v1), 400);
        return z ? bigInteger0.negate() : bigInteger0;
    }

    private int o(char[] arr_c, int v, int v1) {
        while(v < v1 - 8 && j.k(arr_c, v)) {
            v += 8;
        }
        while(v < v1 && arr_c[v] == 0x30) {
            ++v;
        }
        return v;
    }
}

