package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NavigableMap;

final class n extends a {
    public BigDecimal j(byte[] arr_b, int v, int v1) {
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
            int v3 = g.d(arr_b.length, v2, v1);
            if(a.i(v1)) {
                return this.k(arr_b, v, v1);
            }
            int v4 = g.a(arr_b, v2, v3);
            boolean z = v4 == 45;
            if(z || v4 == 43) {
                ++v2;
                v4 = g.a(arr_b, v2, v3);
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
                v4 = arr_b[v7];
                if(j.b(((byte)v4))) {
                    v8 = v8 * 10L + ((long)v4) - 0x30L;
                }
                else {
                    if(v4 != 46) {
                        break;
                    }
                    v9 |= (v6 < 0 ? 0 : 1);
                    int v10;
                    for(v10 = v7; v10 < v3 - 4; v10 += 4) {
                        int v11 = j.D(arr_b, v10 + 1);
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
                int v17 = g.a(arr_b, v16, v3);
                boolean z1 = v17 == 45;
                if(z1 || v17 == 43) {
                    v16 = v7 + 2;
                    v17 = g.a(arr_b, v16, v3);
                }
                v9 |= !j.b(((byte)v17));
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
                    v17 = g.a(arr_b, v16, v3);
                    if(!j.b(((byte)v17))) {
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
            return this.l(arr_b, v19, v20, v20 + 1, v24, z, ((int)v23));
        }
        catch(ArithmeticException arithmeticException0) {
        }
        NumberFormatException numberFormatException0 = new NumberFormatException("value exceeds limits");
        numberFormatException0.initCause(arithmeticException0);
        throw numberFormatException0;
    }

    BigDecimal k(byte[] arr_b, int v, int v1) {
        int v18;
        long v16;
        int v14;
        long v11;
        int v10;
        int v9;
        int v8;
        int v2 = v + v1;
        int v3 = g.a(arr_b, v, v2);
        boolean z = v3 == 45;
        if(z || v3 == 43) {
            ++v;
            v3 = g.a(arr_b, v, v2);
            if(v3 == 0) {
                throw new NumberFormatException("illegal syntax");
            }
        }
        int v4;
        for(v4 = v; v4 < v2 - 8 && j.j(arr_b, v4); v4 += 8) {
        }
        while(v4 < v2 && arr_b[v4] == 0x30) {
            ++v4;
        }
        int v5;
        for(v5 = v4; v5 < v2 - 8 && j.e(arr_b, v5); v5 += 8) {
        }
        while(v5 < v2) {
            v3 = arr_b[v5];
            if(!j.b(((byte)v3))) {
                break;
            }
            ++v5;
        }
        if(v3 == 46) {
            int v6;
            for(v6 = v5 + 1; v6 < v2 - 8 && j.j(arr_b, v6); v6 += 8) {
            }
            while(v6 < v2 && arr_b[v6] == 0x30) {
                ++v6;
            }
            int v7;
            for(v7 = v6; v7 < v2 - 8 && j.e(arr_b, v7); v7 += 8) {
            }
            while(v7 < v2) {
                v3 = arr_b[v7];
                if(!j.b(((byte)v3))) {
                    break;
                }
                ++v7;
            }
            v8 = v6;
            v9 = v5;
            v5 = v7;
        }
        else {
            v8 = -1;
            v9 = -1;
        }
        if(v9 < 0) {
            v10 = v5 - v4;
            v8 = v5;
            v9 = v8;
            v11 = 0L;
        }
        else {
            v11 = (long)(v9 - v5 + 1);
            v10 = v4 == v9 ? v5 - v8 : v5 - v4 - 1;
        }
        if((v3 | 0x20) == 101) {
            int v12 = v5 + 1;
            int v13 = g.a(arr_b, v12, v2);
            boolean z1 = v13 == 45;
            if(z1 || v13 == 43) {
                v12 = v5 + 2;
                v13 = g.a(arr_b, v12, v2);
            }
            v14 = !j.b(((byte)v13));
            for(long v15 = 0L; true; v15 = v16) {
                if(v15 < 0x7FFFFFFFL) {
                    v15 = v15 * 10L + ((long)v13) - 0x30L;
                }
                v16 = v15;
                ++v12;
                int v17 = g.a(arr_b, v12, v2);
                if(!j.b(((byte)v17))) {
                    break;
                }
                v13 = v17;
            }
            if(z1) {
                v16 = -v16;
            }
            v11 += v16;
            v18 = v12;
        }
        else {
            v18 = v5;
            v14 = 0;
            v5 = v2;
        }
        a.h(((boolean)(v14 | (v != v9 || v9 != v5 ? 0 : 1))), v18, v2, v10, v11);
        return this.l(arr_b, v4, v9, v8, v5, z, ((int)v11));
    }

    BigDecimal l(byte[] arr_b, int v, int v1, int v2, int v3, boolean z, int v4) {
        BigInteger bigInteger1;
        BigInteger bigInteger0;
        int v5 = v3 - v1 - 1;
        int v6 = v1 - v;
        NavigableMap navigableMap0 = null;
        if(v6 <= 0) {
            bigInteger0 = BigInteger.ZERO;
        }
        else if(v6 > 400) {
            navigableMap0 = l.c();
            l.f(navigableMap0, v, v1);
            bigInteger0 = D.b(arr_b, v, v1, navigableMap0, 400);
        }
        else {
            bigInteger0 = D.a(arr_b, v, v1);
        }
        if(v5 > 0) {
            if(v3 - v2 > 400) {
                if(navigableMap0 == null) {
                    navigableMap0 = l.c();
                }
                l.f(navigableMap0, v2, v3);
                bigInteger1 = D.b(arr_b, v2, v3, navigableMap0, 400);
            }
            else {
                bigInteger1 = D.a(arr_b, v2, v3);
            }
            if(bigInteger0.signum() != 0) {
                bigInteger1 = m.k(bigInteger0, l.a(navigableMap0, v5)).add(bigInteger1);
            }
            bigInteger0 = bigInteger1;
        }
        if(z) {
            bigInteger0 = bigInteger0.negate();
        }
        return new BigDecimal(bigInteger0, -v4);
    }
}

