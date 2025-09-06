package com.google.common.math;

import J1.b;
import J1.c;
import J1.d;
import com.google.common.base.H;
import com.google.common.primitives.n;
import com.google.common.primitives.y;
import java.math.RoundingMode;

@b(emulated = true)
@e
public final class h {
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

    static abstract enum com.google.common.math.h.b {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.math.h.b.a extends com.google.common.math.h.b {
            com.google.common.math.h.b.a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.math.h$b
            long b(long v, long v1, long v2) {
                return v * v1 % v2;
            }

            @Override  // com.google.common.math.h$b
            long d(long v, long v1) {
                return v * v % v1;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.math.h.b.b extends com.google.common.math.h.b {
            com.google.common.math.h.b.b(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.math.h$b
            long b(long v, long v1, long v2) {
                long v3 = this.h((v >>> 0x20) * (v1 >>> 0x20), v2) + (v >>> 0x20) * (v1 & 0xFFFFFFFFL);
                if(v3 < 0L) {
                    v3 = y.k(v3, v2);
                }
                return this.g(this.h(v3 + (v1 >>> 0x20) * (v & 0xFFFFFFFFL), v2), y.k((v & 0xFFFFFFFFL) * (v1 & 0xFFFFFFFFL), v2), v2);
            }

            @Override  // com.google.common.math.h$b
            long d(long v, long v1) {
                long v2 = (v >>> 0x20) * (v & 0xFFFFFFFFL) * 2L;
                return this.g(this.h(this.h((v >>> 0x20) * (v >>> 0x20), v1) + (v2 >= 0L ? (v >>> 0x20) * (v & 0xFFFFFFFFL) * 2L : y.k(v2, v1)), v1), y.k((v & 0xFFFFFFFFL) * (v & 0xFFFFFFFFL), v1), v1);
            }

            private long g(long v, long v1, long v2) {
                long v3 = v + v1;
                return Long.compare(v, v2 - v1) < 0 ? v3 : v3 - v2;
            }

            private long h(long v, long v1) {
                int v2 = 0x20;
                do {
                    int v3 = Math.min(v2, Long.numberOfLeadingZeros(v));
                    v = y.k(v << v3, v1);
                    v2 -= v3;
                }
                while(v2 > 0);
                return v;
            }
        }

        SMALL /* 警告！未生成枚举子类：com.google.common.math.h$b$a */,
        LARGE /* 警告！未生成枚举子类：com.google.common.math.h$b$b */;

        private com.google.common.math.h.b() {
        }

        com.google.common.math.h.b(a h$a0) {
            this();
        }

        private static com.google.common.math.h.b[] a() [...] // Inlined contents

        abstract long b(long arg1, long arg2, long arg3);

        private long c(long v, long v1, long v2) {
            long v3 = 1L;
            while(v1 != 0L) {
                if((v1 & 1L) != 0L) {
                    v3 = this.b(v3, v, v2);
                }
                v = this.d(v, v2);
                v1 >>= 1;
            }
            return v3;
        }

        abstract long d(long arg1, long arg2);

        static boolean e(long v, long v1) {
            return v1 > 3037000499L ? com.google.common.math.h.b.b.f(v, v1) : com.google.common.math.h.b.a.f(v, v1);
        }

        private boolean f(long v, long v1) {
            int v2 = Long.numberOfTrailingZeros(v1 - 1L);
            long v3 = v % v1;
            if(v3 == 0L) {
                return true;
            }
            long v4 = this.c(v3, v1 - 1L >> v2, v1);
            if(v4 == 1L) {
                return true;
            }
            int v5 = 0;
            while(v4 != v1 - 1L) {
                ++v5;
                if(v5 == v2) {
                    return false;
                }
                v4 = this.d(v4, v1);
            }
            return true;
        }
    }

    @J1.e
    static final long a = 0x4000000000000000L;
    @J1.e
    static final long b = 0xB504F333F9DE6484L;
    @J1.e
    static final byte[] c = null;
    @c
    @d
    @J1.e
    static final long[] d = null;
    @c
    @d
    @J1.e
    static final long[] e = null;
    @J1.e
    static final long f = 3037000499L;
    static final long[] g = null;
    static final int[] h = null;
    @J1.e
    static final int[] i = null;
    private static final int j = 0xDF75D77D;
    private static final long[][] k;

    static {
        h.c = new byte[]{19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
        h.d = new long[]{1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
        h.e = new long[]{3L, 0x1FL, 316L, 0xC5AL, 0x7B86L, 0x4D343L, 0x3040A5L, 0x1E28678L, 0x12D940B6L, 3162277660L, 31622776601L, 0x49A0A4C700L, 0x2E0466FC608L, 0x1CC2C05DBC53L, 0x11F9B83A95B45L, 0xB3C13249D90BBL, 0x7058BF6E27A751L, 0x463777A4D8C892DL, 0x2BE2AAC7077D5BC3L};
        h.g = new long[]{1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 0x58980L, 0x375F00L, 0x2611500L, 479001600L, 6227020800L, 0x144C3B2800L, 1307674368000L, 0x130777758000L, 355687428096000L, 6402373705728000L, 0x1B02B9306890000L, 2432902008176640000L};
        h.h = new int[]{0x7FFFFFFF, 0x7FFFFFFF, 0x7FFFFFFF, 3810779, 0x1DC79, 0x3F2F, 0x10F1, 0x6C5, 887, 534, 361, 0x109, 206, 0xA9, 0x8F, 0x7D, 0x6F, 101, 94, 88, 83, 0x4F, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
        h.i = new int[]{0x7FFFFFFF, 0x7FFFFFFF, 0x7FFFFFFF, 0x285146, 0x150EB, 0x2DCC, 0xC92, 0x521, 684, 419, 0x11F, 0xD6, 0xA9, 0x8B, 0x77, 105, 0x5F, 87, 81, 76, 73, 70, 68, 66, 0x40, 0x3F, 62, 62, 61, 61, 61};
        h.k = new long[][]{new long[]{0x473F6L, 0x1C1111ACD0B9428L}, new long[]{0x34C91838L, 0xA10AD7D5C6610C1L, 0x318A8C12CE9C70E7L}, new long[]{0x3FC6E038E0L, 15L, 7363882082L, 992620450144556L}, new long[]{0x2B5343FD6A30L, 2L, 2570940L, 211991001L, 0xDF8286CCL}, new long[]{0x1C6B470864F682L, 2L, 4130806001517L, 0x2142E2E3F22DE5CL, 0x297105B6B7B29DDL, 0x370EB221A5F176DDL}, new long[]{0x81F23F390AFFE88L, 2L, 123635709730000L, 9233062284813009L, 0x9BBC940C751630L, 0xA90404784BFCB4DL, 0x1189B3F265C2B0C7L}, new long[]{0x7FFFFFFFFFFFFFFFL, 2L, 325L, 0x249FL, 0x6E12L, 0x6E0D7L, 9780504L, 0x6B0191FEL}};
    }

    public static long A(long v, long v1) {
        long v2 = v - v1;
        return (((v1 ^ v) < 0L ? 0 : 1) | ((v ^ v2) < 0L ? 0 : 1)) == 0 ? (v2 >>> 0x3F ^ 1L) + 0x7FFFFFFFFFFFFFFFL : v2;
    }

    @c
    @d
    public static long B(long v, RoundingMode roundingMode0) {
        i.f("x", v);
        if(h.i(v)) {
            return (long)f.x(((int)v), roundingMode0);
        }
        long v1 = (long)Math.sqrt(v);
        long v2 = v1 * v1;
        int v3 = 0;
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                if(v2 == v) {
                    v3 = 1;
                }
                i.k(((boolean)v3));
                return v1;
            }
            case 2: 
            case 3: {
                return v >= v2 ? v1 : v1 - 1L;
            }
            case 4: 
            case 5: {
                return v <= v2 ? v1 : v1 + 1L;
            }
            case 6: 
            case 7: 
            case 8: {
                if(v < v2) {
                    v3 = 1;
                }
                long v4 = v1 - ((long)v3);
                return v4 + ((long)h.n(v4 * v4 + v4, v));
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static long a(int v, int v1) {
        i.e("n", v);
        i.e("k", v1);
        H.m(v1 <= v, "k (%s) > n (%s)", v1, v);
        if(v1 > v >> 1) {
            v1 = v - v1;
        }
        long v2 = 1L;
        switch(v1) {
            case 0: {
                return 1L;
            }
            case 1: {
                return (long)v;
            }
            default: {
                long[] arr_v = h.g;
                if(v < arr_v.length) {
                    return arr_v[v] / (arr_v[v1] * arr_v[v - v1]);
                }
                if(v1 < h.h.length && v <= h.h[v1]) {
                    if(v1 < h.i.length && v <= h.i[v1]) {
                        int v4 = v - 1;
                        long v5 = (long)v;
                        for(int v3 = 2; v3 <= v1; ++v3) {
                            v5 = v5 * ((long)v4) / ((long)v3);
                            --v4;
                        }
                        return v5;
                    }
                    int v6 = h.q(v, RoundingMode.CEILING);
                    int v7 = v - 1;
                    int v8 = v6;
                    long v9 = (long)v;
                    int v10 = 2;
                    long v11 = 1L;
                    while(v10 <= v1) {
                        v8 += v6;
                        if(v8 < 0x3F) {
                            v9 *= (long)v7;
                            v11 *= (long)v10;
                        }
                        else {
                            v2 = h.u(v2, v9, v11);
                            v9 = (long)v7;
                            v11 = (long)v10;
                            v8 = v6;
                        }
                        ++v10;
                        --v7;
                    }
                    return h.u(v2, v9, v11);
                }
                return 0x7FFFFFFFFFFFFFFFL;
            }
        }
    }

    public static long b(long v) {
        i.i("x", v);
        if(v > 0x4000000000000000L) {
            throw new ArithmeticException("ceilingPowerOfTwo(" + v + ") is not representable as a long");
        }
        return 1L << -Long.numberOfLeadingZeros(v - 1L);
    }

    public static long c(long v, long v1) {
        long v2 = v + v1;
        i.c(((boolean)(((v ^ v1) >= 0L ? 0 : 1) | ((v ^ v2) < 0L ? 0 : 1))), "checkedAdd", v, v1);
        return v2;
    }

    public static long d(long v, long v1) {
        int v2 = Long.numberOfLeadingZeros(v) + Long.numberOfLeadingZeros(~v) + Long.numberOfLeadingZeros(v1) + Long.numberOfLeadingZeros(~v1);
        if(v2 > 65) {
            return v * v1;
        }
        i.c(v2 >= 0x40, "checkedMultiply", v, v1);
        int v3 = Long.compare(v, 0L);
        i.c(((boolean)((v3 < 0 ? 0 : 1) | (v1 == 0x8000000000000000L ? 0 : 1))), "checkedMultiply", v, v1);
        long v4 = v * v1;
        i.c(v3 == 0 || v4 / v == v1, "checkedMultiply", v, v1);
        return v4;
    }

    @c
    @d
    public static long e(long v, int v1) {
        i.e("exponent", v1);
        long v2 = 1L;
        if(((v < -2L ? 0 : 1) & (v > 2L ? 0 : 1)) != 0) {
            if(((int)v) != -2) {
                switch(((int)v)) {
                    case -1: {
                        return (v1 & 1) == 0 ? 1L : -1L;
                    }
                    case 0: {
                        return v1 == 0 ? 1L : 0L;
                    }
                    case 1: {
                        return 1L;
                    }
                    default: {
                        if(((int)v) != 2) {
                            throw new AssertionError();
                        }
                        i.c(v1 < 0x3F, "checkedPow", v, ((long)v1));
                        return 1L << v1;
                    }
                }
            }
            i.c(v1 < 0x40, "checkedPow", v, ((long)v1));
            return (v1 & 1) == 0 ? 1L << v1 : -1L << v1;
        }
        long v3 = v;
        int v4 = v1;
        while(true) {
            switch(v4) {
                case 0: {
                    return v2;
                }
                case 1: {
                    return h.d(v2, v3);
                label_20:
                    long v5 = (v4 & 1) == 0 ? v2 : h.d(v2, v3);
                    if(v4 >> 1 > 0) {
                        i.c(-3037000499L <= v3 && v3 <= 3037000499L, "checkedPow", v3, ((long)(v4 >> 1)));
                        v3 *= v3;
                    }
                    v2 = v5;
                    v4 >>= 1;
                    break;
                }
                default: {
                    goto label_20;
                }
            }
        }
    }

    @c
    @d
    public static long f(long v, long v1) {
        long v2 = v - v1;
        i.c(((boolean)(((v ^ v1) < 0L ? 0 : 1) | ((v ^ v2) < 0L ? 0 : 1))), "checkedSubtract", v, v1);
        return v2;
    }

    @c
    @d
    public static long g(long v, long v1, RoundingMode roundingMode0) {
        H.E(roundingMode0);
        long v2 = v / v1;
        long v3 = v - v1 * v2;
        if(Long.compare(v3, 0L) == 0) {
            return v2;
        }
        int v4 = ((int)((v ^ v1) >> 0x3F)) | 1;
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(false);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                return v4 >= 0 ? v2 : v2 + ((long)v4);
            }
            case 4: {
                return v2 + ((long)v4);
            }
            case 5: {
                return v4 <= 0 ? v2 : v2 + ((long)v4);
            }
            case 6: 
            case 7: 
            case 8: {
                long v5 = Math.abs(v3);
                int v6 = Long.compare(v5 - (Math.abs(v1) - v5), 0L);
                if(v6 == 0) {
                    return roundingMode0 != RoundingMode.HALF_UP && (roundingMode0 != RoundingMode.HALF_EVEN || (1L & v2) == 0L) ? v2 : v2 + ((long)v4);
                }
                return v6 <= 0 ? v2 : v2 + ((long)v4);
            }
            default: {
                throw new AssertionError();
            }
        }
        return v2;
    }

    @c
    @d
    public static long h(int v) {
        i.e("n", v);
        return v >= h.g.length ? 0x7FFFFFFFFFFFFFFFL : h.g[v];
    }

    static boolean i(long v) {
        return ((long)(((int)v))) == v;
    }

    public static long j(long v) {
        i.i("x", v);
        return 1L << 0x3F - Long.numberOfLeadingZeros(v);
    }

    public static long k(long v, long v1) {
        i.f("a", v);
        i.f("b", v1);
        if(v == 0L) {
            return v1;
        }
        if(v1 == 0L) {
            return v;
        }
        int v2 = Long.numberOfTrailingZeros(v);
        long v3 = v >> v2;
        int v4 = Long.numberOfTrailingZeros(v1);
        long v5 = v1 >> v4;
        while(v3 != v5) {
            long v6 = v3 - v5;
            long v7 = v6 >> 0x3F & v6;
            long v8 = v6 - v7 - v7;
            v5 += v7;
            v3 = v8 >> Long.numberOfTrailingZeros(v8);
        }
        return v3 << Math.min(v2, v4);
    }

    public static boolean l(long v) {
        return (v <= 0L ? 0 : 1) & ((v & v - 1L) == 0L ? 1 : 0);
    }

    @c
    @d
    public static boolean m(long v) {
        if(v < 2L) {
            i.f("n", v);
            return false;
        }
        if(v < 66L) {
            return (0xA08228828228A2BL >> ((int)v) - 2 & 1L) != 0L;
        }
        if((1 << ((int)(v % 30L)) & 0xDF75D77D) != 0) {
            return false;
        }
        if(v % 7L != 0L && v % 11L != 0L && v % 13L != 0L) {
            if(v < 289L) {
                return true;
            }
            long[][] arr2_v = h.k;
            for(int v1 = 0; v1 < arr2_v.length; ++v1) {
                long[] arr_v = arr2_v[v1];
                if(v <= arr_v[0]) {
                    for(int v2 = 1; v2 < arr_v.length; ++v2) {
                        if(!com.google.common.math.h.b.e(arr_v[v2], v)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            throw new AssertionError();
        }
        return false;
    }

    @J1.e
    static int n(long v, long v1) {
        return (int)(v - v1 >>> 0x3F);
    }

    @c
    @d
    public static int o(long v, RoundingMode roundingMode0) {
        i.i("x", v);
        int v1 = h.p(v);
        long v2 = h.d[v1];
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
                return v1 + h.n(v2, v);
            }
            case 6: 
            case 7: 
            case 8: {
                return v1 + h.n(h.e[v1], v);
            }
            default: {
                throw new AssertionError();
            }
        }
        return v1;
    }

    @c
    @d
    static int p(long v) {
        int v1 = h.c[Long.numberOfLeadingZeros(v)];
        return v1 - h.n(v, h.d[v1]);
    }

    public static int q(long v, RoundingMode roundingMode0) {
        i.i("x", v);
        switch(a.a[roundingMode0.ordinal()]) {
            case 1: {
                i.k(h.l(v));
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                return 0x40 - Long.numberOfLeadingZeros(v - 1L);
            }
            case 6: 
            case 7: 
            case 8: {
                int v1 = Long.numberOfLeadingZeros(v);
                return 0x3F - v1 + h.n(0xB504F333F9DE6484L >>> v1, v);
            }
            default: {
                throw new AssertionError("impossible");
            }
        }
        return 0x3F - Long.numberOfLeadingZeros(v);
    }

    public static long r(long v, long v1) {
        return (v & v1) + ((v ^ v1) >> 1);
    }

    @c
    @d
    public static int s(long v, int v1) {
        return (int)h.t(v, v1);
    }

    @c
    @d
    public static long t(long v, long v1) {
        if(v1 <= 0L) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long v2 = v % v1;
        return v2 >= 0L ? v2 : v2 + v1;
    }

    static long u(long v, long v1, long v2) {
        if(v == 1L) {
            return v1 / v2;
        }
        long v3 = h.k(v, v2);
        return v / v3 * (v1 / (v2 / v3));
    }

    @c
    @d
    public static long v(long v, int v1) {
        i.e("exponent", v1);
        if(-2L <= v && v <= 2L) {
            if(((int)v) != -2) {
                switch(((int)v)) {
                    case -1: {
                        return (v1 & 1) == 0 ? 1L : -1L;
                    }
                    case 0: {
                        return v1 == 0 ? 1L : 0L;
                    }
                    case 1: {
                        return 1L;
                    }
                    default: {
                        if(((int)v) != 2) {
                            throw new AssertionError();
                        }
                        return v1 >= 0x40 ? 0L : 1L << v1;
                    }
                }
            }
            if(v1 < 0x40) {
                return (v1 & 1) == 0 ? 1L << v1 : -(1L << v1);
            }
            return 0L;
        }
        long v2 = 1L;
        while(true) {
            switch(v1) {
                case 0: {
                    return v2;
                }
                case 1: {
                    return v2 * v;
                }
                default: {
                    v2 *= ((v1 & 1) == 0 ? 1L : v);
                    v *= v;
                    v1 >>= 1;
                    break;
                }
            }
        }
    }

    @c
    @d
    public static double w(long v, RoundingMode roundingMode0) {
        long v3;
        double f1;
        double f = (double)v;
        long v1 = (long)f;
        int v2 = v1 == 0x7FFFFFFFFFFFFFFFL ? -1 : n.e(v, v1);
        int[] arr_v = a.a;
        switch(arr_v[roundingMode0.ordinal()]) {
            case 1: {
                i.k(v2 == 0);
                return f;
            }
            case 2: {
                if(v >= 0L) {
                    return v2 >= 0 ? f : com.google.common.math.d.f(f);
                }
                return v2 <= 0 ? f : Math.nextUp(f);
            }
            case 3: {
                return v2 >= 0 ? f : com.google.common.math.d.f(f);
            }
            case 4: {
                if(v >= 0L) {
                    return v2 <= 0 ? f : Math.nextUp(f);
                }
                return v2 >= 0 ? f : com.google.common.math.d.f(f);
            }
            case 5: {
                return v2 <= 0 ? f : Math.nextUp(f);
            }
            case 6: 
            case 7: 
            case 8: {
                if(v2 >= 0) {
                    f1 = Math.nextUp(f);
                    v3 = (long)Math.ceil(f1);
                }
                else {
                    double f2 = com.google.common.math.d.f(f);
                    long v4 = v1;
                    v1 = (long)Math.floor(f2);
                    f1 = f;
                    f = f2;
                    v3 = v4;
                }
                int v5 = n.e(v - v1, (v3 == 0x7FFFFFFFFFFFFFFFL ? v3 - v + 1L : v3 - v));
                if(v5 < 0) {
                    return f;
                }
                if(v5 > 0) {
                    return f1;
                }
                switch(arr_v[roundingMode0.ordinal()]) {
                    case 6: {
                        return v >= 0L ? f : f1;
                    }
                    case 7: {
                        return v < 0L ? f : f1;
                    }
                    case 8: {
                        return (com.google.common.math.d.c(f) & 1L) == 0L ? f : f1;
                    }
                    default: {
                        throw new AssertionError("impossible");
                    }
                }
            }
            default: {
                throw new AssertionError("impossible");
            }
        }
    }

    public static long x(long v, long v1) {
        long v2 = v + v1;
        return (((v1 ^ v) >= 0L ? 0 : 1) | ((v ^ v2) < 0L ? 0 : 1)) == 0 ? (v2 >>> 0x3F ^ 1L) + 0x7FFFFFFFFFFFFFFFL : v2;
    }

    public static long y(long v, long v1) {
        int v2 = Long.numberOfLeadingZeros(v) + Long.numberOfLeadingZeros(~v) + Long.numberOfLeadingZeros(v1) + Long.numberOfLeadingZeros(~v1);
        if(v2 > 65) {
            return v * v1;
        }
        long v3 = ((v ^ v1) >>> 0x3F) + 0x7FFFFFFFFFFFFFFFL;
        int v4 = 0;
        int v5 = Long.compare(v, 0L);
        if(v1 == 0x8000000000000000L) {
            v4 = 1;
        }
        if(((v2 >= 0x40 ? 0 : 1) | v4 & (v5 >= 0 ? 0 : 1)) != 0) {
            return v3;
        }
        long v6 = v * v1;
        return v5 == 0 || v6 / v == v1 ? v6 : v3;
    }

    public static long z(long v, int v1) {
        i.e("exponent", v1);
        long v2 = 1L;
        if(((v < -2L ? 0 : 1) & (v > 2L ? 0 : 1)) != 0) {
            if(((int)v) != -2) {
                switch(((int)v)) {
                    case -1: {
                        return (v1 & 1) == 0 ? 1L : -1L;
                    }
                    case 0: {
                        return v1 == 0 ? 1L : 0L;
                    }
                    case 1: {
                        return 1L;
                    }
                    default: {
                        if(((int)v) != 2) {
                            throw new AssertionError();
                        }
                        return v1 < 0x3F ? 1L << v1 : 0x7FFFFFFFFFFFFFFFL;
                    }
                }
            }
            if(v1 >= 0x40) {
                return ((long)(v1 & 1)) + 0x7FFFFFFFFFFFFFFFL;
            }
            return (v1 & 1) == 0 ? 1L << v1 : -1L << v1;
        }
        long v3 = (v >>> 0x3F & ((long)(v1 & 1))) + 0x7FFFFFFFFFFFFFFFL;
        while(true) {
            switch(v1) {
                case 0: {
                    return v2;
                }
                case 1: {
                    return h.y(v2, v);
                label_19:
                    if((v1 & 1) != 0) {
                        v2 = h.y(v2, v);
                    }
                    v1 >>= 1;
                    if(v1 <= 0) {
                        break;
                    }
                    if(((-3037000499L <= v ? 0 : 1) | (v <= 3037000499L ? 0 : 1)) != 0) {
                        return v3;
                    }
                    v *= v;
                    break;
                }
                default: {
                    goto label_19;
                }
            }
        }
    }
}

