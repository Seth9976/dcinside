package com.google.common.math;

import J1.b;
import J1.c;
import J1.d;
import com.google.common.base.H;
import com.google.common.primitives.l;
import java.math.RoundingMode;

@b(emulated = true)
@e
public final class f {
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

    @J1.e
    static final int a = 0x40000000;
    @J1.e
    static final int b = 0xB504F333;
    @J1.e
    static final byte[] c = null;
    @J1.e
    static final int[] d = null;
    @J1.e
    static final int[] e = null;
    @J1.e
    static final int f = 0xB504;
    private static final int[] g;
    @J1.e
    static int[] h;

    static {
        f.c = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
        f.d = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        f.e = new int[]{3, 0x1F, 316, 0xC5A, 0x7B86, 0x4D343, 0x3040A5, 0x1E28678, 0x12D940B6, 0x7FFFFFFF};
        f.g = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 0x58980, 0x375F00, 0x2611500, 479001600};
        f.h = new int[]{0x7FFFFFFF, 0x7FFFFFFF, 0x10000, 0x929, 477, 0xC1, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    }

    public static int a(int v, int v1) {
        i.e("n", v);
        i.e("k", v1);
        int v2 = 0;
        H.m(v1 <= v, "k (%s) > n (%s)", v1, v);
        if(v1 > v >> 1) {
            v1 = v - v1;
        }
        if(v1 < f.h.length && v <= f.h[v1]) {
            switch(v1) {
                case 0: {
                    return 1;
                }
                case 1: {
                    return v;
                }
                default: {
                    long v3;
                    for(v3 = 1L; v2 < v1; v3 = v4 / ((long)v2)) {
                        long v4 = v3 * ((long)(v - v2));
                        ++v2;
                    }
                    return (int)v3;
                }
            }
        }
        return 0x7FFFFFFF;
    }

    public static int b(int v) {
        i.h("x", v);
        if(v > 0x40000000) {
            throw new ArithmeticException("ceilingPowerOfTwo(" + v + ") not representable as an int");
        }
        return 1 << -Integer.numberOfLeadingZeros(v - 1);
    }

    public static int c(int v, int v1) {
        long v2 = ((long)v) + ((long)v1);
        i.b(v2 == ((long)(((int)v2))), "checkedAdd", v, v1);
        return (int)v2;
    }

    public static int d(int v, int v1) {
        long v2 = ((long)v) * ((long)v1);
        i.b(v2 == ((long)(((int)v2))), "checkedMultiply", v, v1);
        return (int)v2;
    }

    public static int e(int v, int v1) {
        i.e("exponent", v1);
        int v2 = 0;
        switch(v) {
            case -2: {
                if(v1 < 0x20) {
                    v2 = 1;
                }
                i.b(((boolean)v2), "checkedPow", -2, v1);
                return (v1 & 1) == 0 ? 1 << v1 : -1 << v1;
            }
            case -1: {
                return (v1 & 1) == 0 ? 1 : -1;
            }
            case 0: {
                return v1 == 0 ? 1 : 0;
            }
            case 1: {
                return 1;
            }
            default: {
                if(v != 2) {
                    int v3 = 1;
                    while(true) {
                        switch(v1) {
                            case 0: {
                                return v3;
                            }
                            case 1: {
                                return f.d(v3, v);
                            label_9:
                                if((v1 & 1) != 0) {
                                    v3 = f.d(v3, v);
                                }
                                v1 >>= 1;
                                if(v1 > 0) {
                                    break;
                                }
                                continue;
                            }
                            default: {
                                goto label_9;
                            }
                        }
                        i.b(((boolean)((0xFFFF4AFC > v ? 0 : 1) & (v > 0xB504 ? 0 : 1))), "checkedPow", v, v1);
                        v *= v;
                    }
                }
                if(v1 < 0x1F) {
                    v2 = 1;
                }
                i.b(((boolean)v2), "checkedPow", 2, v1);
                return 1 << v1;
            }
        }
    }

    public static int f(int v, int v1) {
        long v2 = ((long)v) - ((long)v1);
        i.b(v2 == ((long)(((int)v2))), "checkedSubtract", v, v1);
        return (int)v2;
    }

    public static int g(int v, int v1, RoundingMode roundingMode0) {
        int v5;
        H.E(roundingMode0);
        if(v1 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int v2 = v / v1;
        int v3 = v - v1 * v2;
        if(v3 == 0) {
            return v2;
        }
        boolean z = true;
        int v4 = (v ^ v1) >> 0x1F | 1;
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(false);
                return v2;
            }
            case 2: {
                return v2;
            }
            case 3: {
                return v4 >= 0 ? v2 : v2 + v4;
            }
            case 4: {
                break;
            }
            case 5: {
                return v4 <= 0 ? v2 : v2 + v4;
            }
            case 6: 
            case 7: 
            case 8: {
                v5 = Math.abs(v3) * 2 - Math.abs(v1);
                if(v5 == 0) {
                    if(roundingMode0 != RoundingMode.HALF_UP) {
                        boolean z1 = roundingMode0 == RoundingMode.HALF_EVEN;
                        if((v2 & 1) == 0) {
                            z = false;
                        }
                        return z1 && z ? v2 + v4 : v2;
                    }
                    break;
                }
                return v5 <= 0 ? v2 : v2 + v4;
            }
            default: {
                throw new AssertionError();
            }
        }
        return v2 + v4;
    }

    public static int h(int v) {
        i.e("n", v);
        return v >= f.g.length ? 0x7FFFFFFF : f.g[v];
    }

    public static int i(int v) {
        i.h("x", v);
        return Integer.highestOneBit(v);
    }

    public static int j(int v, int v1) {
        i.e("a", v);
        i.e("b", v1);
        if(v == 0) {
            return v1;
        }
        if(v1 == 0) {
            return v;
        }
        int v2 = Integer.numberOfTrailingZeros(v);
        int v3 = v >> v2;
        int v4 = Integer.numberOfTrailingZeros(v1);
        int v5 = v1 >> v4;
        while(v3 != v5) {
            int v6 = v3 - v5;
            int v7 = v6 >> 0x1F & v6;
            int v8 = v6 - v7 * 2;
            v5 += v7;
            v3 = v8 >> Integer.numberOfTrailingZeros(v8);
        }
        return v3 << Math.min(v2, v4);
    }

    public static boolean k(int v) {
        return (v <= 0 ? 0 : 1) & ((v & v - 1) == 0 ? 1 : 0);
    }

    @c
    @d
    public static boolean l(int v) {
        return h.m(v);
    }

    @J1.e
    static int m(int v, int v1) [...] // Inlined contents

    @c
    @d
    public static int n(int v, RoundingMode roundingMode0) {
        i.h("x", v);
        int v1 = f.o(v);
        int v2 = f.d[v1];
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(v == v2);
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                return v1 + (v2 - v >>> 0x1F);
            }
            case 6: 
            case 7: 
            case 8: {
                return v1 + f.m(f.e[v1], v);
            }
            default: {
                throw new AssertionError();
            }
        }
        return v1;
    }

    private static int o(int v) {
        int v1 = f.c[Integer.numberOfLeadingZeros(v)];
        return v1 - f.m(v, f.d[v1]);
    }

    public static int p(int v, RoundingMode roundingMode0) {
        i.h("x", v);
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(f.k(v));
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                return 0x20 - Integer.numberOfLeadingZeros(v - 1);
            }
            case 6: 
            case 7: 
            case 8: {
                int v1 = Integer.numberOfLeadingZeros(v);
                return 0x1F - v1 + ((0xB504F333 >>> v1) - v >>> 0x1F);
            }
            default: {
                throw new AssertionError();
            }
        }
        return 0x1F - Integer.numberOfLeadingZeros(v);
    }

    public static int q(int v, int v1) {
        return (v & v1) + ((v ^ v1) >> 1);
    }

    public static int r(int v, int v1) {
        if(v1 <= 0) {
            throw new ArithmeticException("Modulus " + v1 + " must be > 0");
        }
        int v2 = v % v1;
        return v2 >= 0 ? v2 : v2 + v1;
    }

    @c
    @d
    public static int s(int v, int v1) {
        i.e("exponent", v1);
        if(v != -2) {
            switch(v) {
                case -1: {
                    return (v1 & 1) == 0 ? 1 : -1;
                }
                case 0: {
                    return v1 == 0 ? 1 : 0;
                }
                case 1: {
                    return 1;
                }
                default: {
                    if(v != 2) {
                        int v2 = 1;
                        while(true) {
                            switch(v1) {
                                case 0: {
                                    return v2;
                                }
                                case 1: {
                                    return v * v2;
                                }
                            }
                            v2 *= ((v1 & 1) == 0 ? 1 : v);
                            v *= v;
                            v1 >>= 1;
                        }
                    }
                    return v1 >= 0x20 ? 0 : 1 << v1;
                }
            }
        }
        if(v1 < 0x20) {
            return (v1 & 1) == 0 ? 1 << v1 : -(1 << v1);
        }
        return 0;
    }

    public static int t(int v, int v1) {
        return l.z(((long)v) + ((long)v1));
    }

    public static int u(int v, int v1) {
        return l.z(((long)v) * ((long)v1));
    }

    public static int v(int v, int v1) {
        i.e("exponent", v1);
        switch(v) {
            case -2: {
                if(v1 >= 0x20) {
                    return (v1 & 1) + 0x7FFFFFFF;
                }
                return (v1 & 1) == 0 ? 1 << v1 : -1 << v1;
            }
            case -1: {
                return (v1 & 1) == 0 ? 1 : -1;
            }
            case 0: {
                return v1 == 0 ? 1 : 0;
            }
            case 1: {
                return 1;
            }
            default: {
                if(v != 2) {
                    int v2 = (v >>> 0x1F & (v1 & 1)) + 0x7FFFFFFF;
                    int v3 = 1;
                    while(true) {
                        switch(v1) {
                            case 0: {
                                return v3;
                            }
                            case 1: {
                                return f.u(v3, v);
                            label_9:
                                if((v1 & 1) != 0) {
                                    v3 = f.u(v3, v);
                                }
                                v1 >>= 1;
                                if(v1 <= 0) {
                                    continue;
                                }
                                if(((0xFFFF4AFC <= v ? 0 : 1) | (v <= 0xB504 ? 0 : 1)) != 0) {
                                    return v2;
                                }
                                break;
                            }
                            default: {
                                goto label_9;
                            }
                        }
                        v *= v;
                    }
                }
                return v1 < 0x1F ? 1 << v1 : 0x7FFFFFFF;
            }
        }
    }

    public static int w(int v, int v1) {
        return l.z(((long)v) - ((long)v1));
    }

    @c
    public static int x(int v, RoundingMode roundingMode0) {
        i.e("x", v);
        int v1 = f.y(v);
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(v1 * v1 == v);
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                return v1 + (v1 * v1 - v >>> 0x1F);
            }
            case 6: 
            case 7: 
            case 8: {
                return v1 + (v1 * v1 + v1 - v >>> 0x1F);
            }
            default: {
                throw new AssertionError();
            }
        }
        return v1;
    }

    private static int y(int v) {
        return (int)Math.sqrt(v);
    }
}

