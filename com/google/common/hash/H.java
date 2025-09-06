package com.google.common.hash;

import com.google.common.base.H;
import com.google.common.primitives.l;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

@k
abstract enum h implements c {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a extends h {
        a(String s, int v) {
            super(null);
        }

        @Override  // com.google.common.hash.g$c
        public boolean d2(@I Object object0, n n0, int v, com.google.common.hash.h.c h$c0) {
            long v1 = h$c0.b();
            long v2 = t.x().d(object0, n0).c();
            boolean z = false;
            for(int v3 = 1; v3 <= v; ++v3) {
                int v4 = v3 * ((int)(v2 >>> 0x20)) + ((int)v2);
                z |= h$c0.h(((long)(v4 >= 0 ? v3 * ((int)(v2 >>> 0x20)) + ((int)v2) : ~v4)) % v1);
            }
            return z;
        }

        @Override  // com.google.common.hash.g$c
        public boolean t(@I Object object0, n n0, int v, com.google.common.hash.h.c h$c0) {
            long v1 = h$c0.b();
            long v2 = t.x().d(object0, n0).c();
            for(int v3 = 1; v3 <= v; ++v3) {
                int v4 = v3 * ((int)(v2 >>> 0x20)) + ((int)v2);
                if(!h$c0.e(((long)(v4 >= 0 ? v3 * ((int)(v2 >>> 0x20)) + ((int)v2) : ~v4)) % v1)) {
                    return false;
                }
            }
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class b extends h {
        b(String s, int v) {
            super(null);
        }

        private long b(byte[] arr_b) {
            return com.google.common.primitives.n.k(arr_b[7], arr_b[6], arr_b[5], arr_b[4], arr_b[3], arr_b[2], arr_b[1], arr_b[0]);
        }

        private long c(byte[] arr_b) {
            return com.google.common.primitives.n.k(arr_b[15], arr_b[14], arr_b[13], arr_b[12], arr_b[11], arr_b[10], arr_b[9], arr_b[8]);
        }

        @Override  // com.google.common.hash.g$c
        public boolean d2(@I Object object0, n n0, int v, com.google.common.hash.h.c h$c0) {
            long v1 = h$c0.b();
            byte[] arr_b = t.x().d(object0, n0).l();
            long v2 = this.b(arr_b);
            long v3 = this.c(arr_b);
            boolean z = false;
            for(int v4 = 0; v4 < v; ++v4) {
                z |= h$c0.h((0x7FFFFFFFFFFFFFFFL & v2) % v1);
                v2 += v3;
            }
            return z;
        }

        @Override  // com.google.common.hash.g$c
        public boolean t(@I Object object0, n n0, int v, com.google.common.hash.h.c h$c0) {
            long v1 = h$c0.b();
            byte[] arr_b = t.x().d(object0, n0).l();
            long v2 = this.b(arr_b);
            long v3 = this.c(arr_b);
            for(int v4 = 0; v4 < v; ++v4) {
                if(!h$c0.e((0x7FFFFFFFFFFFFFFFL & v2) % v1)) {
                    return false;
                }
                v2 += v3;
            }
            return true;
        }
    }

    static final class com.google.common.hash.h.c {
        final AtomicLongArray a;
        private final B b;
        private static final int c = 6;

        com.google.common.hash.h.c(long v) {
            H.e(v > 0L, "data length is zero!");
            this.a = new AtomicLongArray(l.d(com.google.common.math.h.g(v, 0x40L, RoundingMode.CEILING)));
            this.b = C.a();
        }

        com.google.common.hash.h.c(long[] arr_v) {
            H.e(arr_v.length > 0, "data length is zero!");
            this.a = new AtomicLongArray(arr_v);
            this.b = C.a();
            long v1 = 0L;
            for(int v = 0; v < arr_v.length; ++v) {
                v1 += (long)Long.bitCount(arr_v[v]);
            }
            this.b.a(v1);
        }

        long a() {
            return this.b.sum();
        }

        long b() {
            return ((long)this.a.length()) * 0x40L;
        }

        com.google.common.hash.h.c c() {
            return new com.google.common.hash.h.c(com.google.common.hash.h.c.i(this.a));
        }

        int d() {
            return this.a.length();
        }

        boolean e(long v) {
            return (1L << ((int)v) & this.a.get(((int)(v >>> 6)))) != 0L;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof com.google.common.hash.h.c ? Arrays.equals(com.google.common.hash.h.c.i(this.a), com.google.common.hash.h.c.i(((com.google.common.hash.h.c)object0).a)) : false;
        }

        void f(com.google.common.hash.h.c h$c0) {
            H.m(this.a.length() == h$c0.a.length(), "BitArrays must be of equal length (%s != %s)", this.a.length(), h$c0.a.length());
            for(int v = 0; v < this.a.length(); ++v) {
                this.g(v, h$c0.a.get(v));
            }
        }

        void g(int v, long v1) {
            while(true) {
                long v2 = this.a.get(v);
                long v3 = v2 | v1;
                if(v2 == v3) {
                    break;
                }
                if(this.a.compareAndSet(v, v2, v3)) {
                    this.b.a(((long)(Long.bitCount(v3) - Long.bitCount(v2))));
                    return;
                }
            }
        }

        boolean h(long v) {
            if(this.e(v)) {
                return false;
            }
            do {
                long v1 = this.a.get(((int)(v >>> 6)));
                long v2 = v1 | 1L << ((int)v);
                if(v1 == v2) {
                    return false;
                }
            }
            while(!this.a.compareAndSet(((int)(v >>> 6)), v1, v2));
            this.b.b();
            return true;
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(com.google.common.hash.h.c.i(this.a));
        }

        public static long[] i(AtomicLongArray atomicLongArray0) {
            int v = atomicLongArray0.length();
            long[] arr_v = new long[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_v[v1] = atomicLongArray0.get(v1);
            }
            return arr_v;
        }
    }

    MURMUR128_MITZ_32 /* 警告！未生成枚举子类：com.google.common.hash.h$a */,
    MURMUR128_MITZ_64 /* 警告！未生成枚举子类：com.google.common.hash.h$b */;

    private h() {
    }

    private static h[] a() [...] // Inlined contents
}

