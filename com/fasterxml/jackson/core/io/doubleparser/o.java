package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NavigableMap;

final class o extends a {
    public BigDecimal j(char[] arr_c, int v, int v1) {
        int v24;
        long v23;
        int v22;
        int v20;
        int v19;
        int v16;
        long v15;
        int v14;
        int v13;
        try {
            int v2 = v;
            int v3 = g.d(arr_c.length, v2, v1);
            if(a.i(v1)) {
                return this.k(arr_c, v, v1);
            }
            int v4 = g.c(arr_c, v2, v3);
            boolean z = v4 == 45;
            if(z || v4 == 43) {
                ++v2;
                v4 = g.c(arr_c, v2, v3);
                if(v4 == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
            }
            int v5 = v2;
            int v6 = -1;
            int v7 = v5;
            long v8 = 0L;
            int v9 = 0;
            while(v7 < v3) {
                v4 = arr_c[v7];
                if(j.c(((char)v4))) {
                    v8 = v8 * 10L + ((long)v4) - 0x30L;
                }
                else {
                    if(v4 != 46) {
                        break;
                    }
                    v9 |= (v6 < 0 ? 0 : 1);
                    int v10;
                    for(v10 = v7; v10 < v3 - 4; v10 += 4) {
                        int v11 = j.E(arr_c, v10 + 1);
                        if(v11 < 0) {
                            break;
                        }
                        v8 = v8 * 10000L + ((long)v11);
                    }
                    int v12 = v7;
                    v7 = v10;
                    v6 = v12;
                }
                ++v7;
            }
            if(v6 < 0) {
                v13 = v7 - v5;
                v14 = v7;
                v15 = 0L;
            }
            else {
                v15 = (long)(v6 - v7 + 1);
                v14 = v6;
                v13 = v7 - v5 - 1;
            }
            if((v4 | 0x20) == 101) {
                v16 = v7 + 1;
                int v17 = g.c(arr_c, v16, v3);
                boolean z1 = v17 == 45;
                if(z1 || v17 == 43) {
                    v16 = v7 + 2;
                    v17 = g.c(arr_c, v16, v3);
                }
                v9 |= !j.c(((char)v17));
                long v18 = 0L;
                while(true) {
                    if(v18 < 0x7FFFFFFFL) {
                        v19 = v5;
                        v20 = v14;
                        v18 = v18 * 10L + ((long)v17) - 0x30L;
                    }
                    else {
                        v19 = v5;
                        v20 = v14;
                    }
                    long v21 = v18;
                    v22 = 1;
                    ++v16;
                    v17 = g.c(arr_c, v16, v3);
                    if(!j.c(((char)v17))) {
                        if(z1) {
                            v21 = -v21;
                        }
                        v23 = v15 + v21;
                        v24 = v7;
                        break;
                    }
                    v18 = v21;
                    v5 = v19;
                    v14 = v20;
                }
            }
            else {
                v19 = v5;
                v20 = v14;
                v22 = 1;
                v24 = v3;
                v23 = v15;
                v16 = v7;
            }
            if(v13 != 0) {
                v22 = 0;
            }
            a.h(((boolean)(v9 | v22)), v16, v3, v13, v23);
            if(v13 < 19) {
                if(z) {
                    v8 = -v8;
                }
                return new BigDecimal(v8).scaleByPowerOfTen(((int)v23));
            }
            return this.l(arr_c, v19, v20, v20 + 1, v24, z, ((int)v23));
        }
        catch(ArithmeticException arithmeticException0) {
        }
        NumberFormatException numberFormatException0 = new NumberFormatException("value exceeds limits");
        numberFormatException0.initCause(arithmeticException0);
        throw numberFormatException0;
    }

    BigDecimal k(char[] arr_c, int v, int v1) {
        int v19;
        long v17;
        int v15;
        long v12;
        int v11;
        int v10;
        int v9;
        int v2 = v + v1;
        int v3 = g.c(arr_c, v, v2);
        boolean z = v3 == 45;
        if(z || v3 == 43) {
            ++v;
            v3 = g.c(arr_c, v, v2);
            if(v3 == 0) {
                throw new NumberFormatException("illegal syntax");
            }
        }
        int v4 = Math.min(v2 - 8, 0x40000000);
        int v5;
        for(v5 = v; v5 < v4 && j.k(arr_c, v5); v5 += 8) {
        }
        while(v5 < v2 && arr_c[v5] == 0x30) {
            ++v5;
        }
        int v6;
        for(v6 = v5; v6 < v4 && j.f(arr_c, v6); v6 += 8) {
        }
        while(v6 < v2) {
            v3 = arr_c[v6];
            if(!j.c(((char)v3))) {
                break;
            }
            ++v6;
        }
        if(v3 == 46) {
            int v7;
            for(v7 = v6 + 1; v7 < v4 && j.k(arr_c, v7); v7 += 8) {
            }
            while(v7 < v2 && arr_c[v7] == 0x30) {
                ++v7;
            }
            int v8;
            for(v8 = v7; v8 < v4 && j.f(arr_c, v8); v8 += 8) {
            }
            while(v8 < v2) {
                v3 = arr_c[v8];
                if(!j.c(((char)v3))) {
                    break;
                }
                ++v8;
            }
            v9 = v7;
            v10 = v6;
            v6 = v8;
        }
        else {
            v9 = -1;
            v10 = -1;
        }
        if(v10 < 0) {
            v11 = v6 - v5;
            v9 = v6;
            v10 = v9;
            v12 = 0L;
        }
        else {
            v12 = (long)(v10 - v6 + 1);
            v11 = v5 == v10 ? v6 - v9 : v6 - v5 - 1;
        }
        if((v3 | 0x20) == 101) {
            int v13 = v6 + 1;
            int v14 = g.c(arr_c, v13, v2);
            boolean z1 = v14 == 45;
            if(z1 || v14 == 43) {
                v13 = v6 + 2;
                v14 = g.c(arr_c, v13, v2);
            }
            v15 = !j.c(((char)v14));
            for(long v16 = 0L; true; v16 = v17) {
                if(v16 < 0x7FFFFFFFL) {
                    v16 = v16 * 10L + ((long)v14) - 0x30L;
                }
                v17 = v16;
                ++v13;
                int v18 = g.c(arr_c, v13, v2);
                if(!j.c(((char)v18))) {
                    break;
                }
                v14 = v18;
            }
            if(z1) {
                v17 = -v17;
            }
            v12 += v17;
            v19 = v13;
        }
        else {
            v19 = v6;
            v15 = 0;
            v6 = v2;
        }
        a.h(((boolean)(v15 | (v != v10 || v10 != v6 ? 0 : 1))), v19, v2, v11, v12);
        return this.l(arr_c, v5, v10, v9, v6, z, ((int)v12));
    }

    BigDecimal l(char[] arr_c, int v, int v1, int v2, int v3, boolean z, int v4) {
        BigInteger bigInteger1;
        BigInteger bigInteger0;
        int v5 = v3 - v2;
        int v6 = v1 - v;
        NavigableMap navigableMap0 = null;
        if(v6 <= 0) {
            bigInteger0 = BigInteger.ZERO;
        }
        else if(v6 > 400) {
            navigableMap0 = l.c();
            l.f(navigableMap0, v, v1);
            bigInteger0 = E.b(arr_c, v, v1, navigableMap0, 400);
        }
        else {
            bigInteger0 = E.a(arr_c, v, v1);
        }
        if(v5 > 0) {
            if(v5 > 400) {
                if(navigableMap0 == null) {
                    navigableMap0 = l.c();
                }
                l.f(navigableMap0, v1 + 1, v3);
                bigInteger1 = E.b(arr_c, v1 + 1, v3, navigableMap0, 400);
            }
            else {
                bigInteger1 = E.a(arr_c, v1 + 1, v3);
            }
            if(bigInteger0.signum() != 0) {
                bigInteger1 = m.k(bigInteger0, l.a(navigableMap0, v3 - v1 - 1)).add(bigInteger1);
            }
            bigInteger0 = bigInteger1;
        }
        if(z) {
            bigInteger0 = bigInteger0.negate();
        }
        return new BigDecimal(bigInteger0, -v4);
    }
}

