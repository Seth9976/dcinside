package com.fasterxml.jackson.core.io.doubleparser;

import androidx.collection.b;

abstract class d extends c {
    abstract long h();

    abstract long i();

    private long j(byte[] arr_b, int v, int v1, int v2, boolean z, boolean z1) {
        int v16;
        int v13;
        int v12;
        int v11;
        boolean z2;
        int v3 = -1;
        int v4 = v;
        long v5 = 0L;
        int v6 = 0;
        int v7 = 0;
        while(true) {
            z2 = true;
            if(v4 >= v2) {
                break;
            }
            v6 = arr_b[v4];
            if(j.b(((byte)v6))) {
                v5 = v5 * 10L + ((long)v6) - 0x30L;
            }
            else {
                if(v6 != 46) {
                    break;
                }
                v7 |= (v3 < 0 ? 0 : 1);
                int v8;
                for(v8 = v4; v8 < v2 - 4; v8 += 4) {
                    int v9 = j.D(arr_b, v8 + 1);
                    if(v9 < 0) {
                        break;
                    }
                    v5 = v5 * 10000L + ((long)v9);
                }
                int v10 = v4;
                v4 = v8;
                v3 = v10;
            }
            ++v4;
        }
        if(v3 < 0) {
            v11 = v4 - v;
            v3 = v4;
            v12 = 0;
        }
        else {
            v12 = v3 - v4 + 1;
            v11 = v4 - v - 1;
        }
        if((v6 | 0x20) == 101) {
            v13 = v4 + 1;
            int v14 = g.a(arr_b, v13, v2);
            boolean z3 = v14 == 45;
            if(z3 || v14 == 43) {
                v13 = v4 + 2;
                v14 = g.a(arr_b, v13, v2);
            }
            boolean z4 = j.b(((byte)v14));
            int v15 = 0;
            do {
                if(v15 < 0x400) {
                    v15 = v15 * 10 + v14 - 0x30;
                }
                ++v13;
                v14 = g.a(arr_b, v13, v2);
            }
            while(j.b(((byte)v14)));
            if(z3) {
                v15 = -v15;
            }
            v12 += v15;
            v7 |= !z4;
            v6 = v14;
            v16 = v15;
        }
        else {
            v13 = v4;
            v16 = 0;
        }
        if((v6 | 34) == 102) {
            ++v13;
        }
        if(v7 != 0 || d.o(arr_b, v13, v2) < v2 || !z1 && v11 == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if(v11 > 19) {
            int v17 = v;
            int v18 = 0;
            long v19 = 0L;
            while(v17 < v4) {
                int v20 = arr_b[v17];
                if(v20 == 46) {
                    ++v18;
                }
                else {
                    if(b.a(v19, 1000000000000000000L) >= 0) {
                        break;
                    }
                    v19 = v19 * 10L + ((long)v20) - 0x30L;
                }
                ++v17;
            }
            if(v17 >= v4) {
                z2 = false;
            }
            return this.p(arr_b, v1, v2, z, v19, v12, z2, v3 - v17 + v18 + v16);
        }
        return this.p(arr_b, v1, v2, z, v5, v12, false, 0);
    }

    public long k(byte[] arr_b, int v, int v1) {
        int v2 = g.d(arr_b.length, v, v1);
        int v3 = d.o(arr_b, v, v2);
        if(v3 == v2) {
            throw new NumberFormatException("illegal syntax");
        }
        int v4 = arr_b[v3];
        boolean z = v4 == 45;
        if(z || v4 == 43) {
            ++v3;
            v4 = g.a(arr_b, v3, v2);
            if(v4 == 0) {
                throw new NumberFormatException("illegal syntax");
            }
        }
        if(v4 >= 73) {
            return this.m(arr_b, v3, v2, z);
        }
        if(v4 == 0x30) {
            return (g.a(arr_b, v3 + 1, v2) | 0x20) == 120 ? this.l(arr_b, v3 + 2, v, v2, z) : this.j(arr_b, v3 + 1, v, v2, z, true);
        }
        return this.j(arr_b, v3, v, v2, z, false);
    }

    private long l(byte[] arr_b, int v, int v1, int v2, boolean z) {
        int v15;
        int v12;
        int v11;
        int v10;
        int v8;
        int v3 = -1;
        int v4 = v;
        long v5 = 0L;
        int v6 = 0;
        int v7 = 0;
        while(true) {
            v8 = 1;
            if(v4 >= v2) {
                break;
            }
            v6 = arr_b[v4];
            int v9 = g.f(((byte)v6));
            if(v9 >= 0) {
                v5 = v5 << 4 | ((long)v9);
            }
            else {
                if(v9 != -4) {
                    break;
                }
                if(v3 < 0) {
                    v8 = 0;
                }
                v7 |= v8;
                v3 = v4;
            }
            ++v4;
        }
        if(v3 < 0) {
            v10 = v4 - v;
            v3 = v4;
            v11 = 0;
        }
        else {
            v10 = v4 - v - 1;
            v11 = Math.min(v3 - v4 + 1, 0x400) * 4;
        }
        boolean z1 = (v6 | 0x20) == 0x70;
        if(z1) {
            v12 = v4 + 1;
            int v13 = g.a(arr_b, v12, v2);
            boolean z2 = v13 == 45;
            if(z2 || v13 == 43) {
                v12 = v4 + 2;
                v13 = g.a(arr_b, v12, v2);
            }
            boolean z3 = j.b(((byte)v13));
            int v14 = 0;
            do {
                if(v14 < 0x400) {
                    v14 = v14 * 10 + v13 - 0x30;
                }
                ++v12;
                v13 = g.a(arr_b, v12, v2);
            }
            while(j.b(((byte)v13)));
            if(z2) {
                v14 = -v14;
            }
            v11 += v14;
            v7 |= !z3;
            v6 = v13;
            v15 = v14;
        }
        else {
            v12 = v4;
            v15 = 0;
        }
        if((v6 | 34) == 102) {
            ++v12;
        }
        int v16 = d.o(arr_b, v12, v2);
        if(v7 != 0 || v16 < v2 || v10 == 0 || !z1) {
            throw new NumberFormatException("illegal syntax");
        }
        if(v10 > 16) {
            int v17 = v;
            int v18 = 0;
            v5 = 0L;
            while(v17 < v4) {
                int v19 = g.f(arr_b[v17]);
                if(v19 >= 0) {
                    if(b.a(v5, 1000000000000000000L) >= 0) {
                        break;
                    }
                    v5 = v5 << 4 | ((long)v19);
                }
                else {
                    ++v18;
                }
                ++v17;
            }
            if(v17 >= v4) {
                v8 = 0;
            }
            return this.q(arr_b, v1, v2, z, v5, v11, v8, (v3 - v17 + v18) * 4 + v15);
        }
        return this.q(arr_b, v1, v2, z, v5, v11, 0, (v3 - v16) * 4 + v15);
    }

    private long m(byte[] arr_b, int v, int v1, boolean z) {
        if(arr_b[v] == 78) {
            if(v + 2 < v1 && arr_b[v + 1] == 97 && arr_b[v + 2] == 78 && d.o(arr_b, v + 3, v1) == v1) {
                return this.h();
            }
        }
        else if(v + 7 < v1 && j.q(arr_b, v) == 0x7974696E69666E49L && d.o(arr_b, v + 8, v1) == v1) {
            return z ? this.i() : this.n();
        }
        throw new NumberFormatException("illegal syntax");
    }

    abstract long n();

    private static int o(byte[] arr_b, int v, int v1) {
        while(v < v1 && (arr_b[v] & 0xFF) <= 0x20) {
            ++v;
        }
        return v;
    }

    abstract long p(byte[] arg1, int arg2, int arg3, boolean arg4, long arg5, int arg6, boolean arg7, int arg8);

    abstract long q(byte[] arg1, int arg2, int arg3, boolean arg4, long arg5, int arg6, boolean arg7, int arg8);
}

