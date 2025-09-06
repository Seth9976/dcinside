package com.google.common.math;

import J1.c;
import J1.d;
import com.google.common.base.H;
import com.google.common.primitives.l;
import j..util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@c
@d
@e
public final class m {
    static class a {
    }

    public static final class b {
        private final int a;

        private b(int v) {
            H.e(v > 0, "Quantile scale must be positive");
            this.a = v;
        }

        b(int v, a m$a0) {
            this(v);
        }

        public com.google.common.math.m.c a(int v) {
            return new com.google.common.math.m.c(this.a, v, null);
        }

        public com.google.common.math.m.d b(Collection collection0) {
            int[] arr_v = l.D(collection0);
            return new com.google.common.math.m.d(this.a, arr_v, null);
        }

        public com.google.common.math.m.d c(int[] arr_v) {
            int[] arr_v1 = (int[])arr_v.clone();
            return new com.google.common.math.m.d(this.a, arr_v1, null);
        }
    }

    public static final class com.google.common.math.m.c {
        private final int a;
        private final int b;

        private com.google.common.math.m.c(int v, int v1) {
            m.h(v1, v);
            this.a = v;
            this.b = v1;
        }

        com.google.common.math.m.c(int v, int v1, a m$a0) {
            this(v, v1);
        }

        public double a(Collection collection0) {
            return this.e(com.google.common.primitives.d.B(collection0));
        }

        public double b(double[] arr_f) {
            return this.e(((double[])arr_f.clone()));
        }

        public double c(int[] arr_v) {
            return this.e(m.l(arr_v));
        }

        public double d(long[] arr_v) {
            return this.e(m.m(arr_v));
        }

        public double e(double[] arr_f) {
            H.e(arr_f.length > 0, "Cannot calculate quantiles of an empty dataset");
            if(m.j(arr_f)) {
                return NaN;
            }
            long v = ((long)this.b) * ((long)(arr_f.length - 1));
            int v1 = (int)h.g(v, this.a, RoundingMode.DOWN);
            int v2 = (int)(v - ((long)v1) * ((long)this.a));
            m.u(v1, arr_f, 0, arr_f.length - 1);
            if(v2 == 0) {
                return arr_f[v1];
            }
            m.u(v1 + 1, arr_f, v1 + 1, arr_f.length - 1);
            return m.k(arr_f[v1], arr_f[v1 + 1], v2, this.a);
        }
    }

    public static final class com.google.common.math.m.d {
        private final int a;
        private final int[] b;

        private com.google.common.math.m.d(int v, int[] arr_v) {
            boolean z = false;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                m.h(arr_v[v1], v);
            }
            if(arr_v.length > 0) {
                z = true;
            }
            H.e(z, "Indexes must be a non empty array");
            this.a = v;
            this.b = arr_v;
        }

        com.google.common.math.m.d(int v, int[] arr_v, a m$a0) {
            this(v, arr_v);
        }

        public Map a(Collection collection0) {
            return this.e(com.google.common.primitives.d.B(collection0));
        }

        public Map b(double[] arr_f) {
            return this.e(((double[])arr_f.clone()));
        }

        public Map c(int[] arr_v) {
            return this.e(m.l(arr_v));
        }

        public Map d(long[] arr_v) {
            return this.e(m.m(arr_v));
        }

        public Map e(double[] arr_f) {
            int v = 0;
            H.e(arr_f.length > 0, "Cannot calculate quantiles of an empty dataset");
            if(m.j(arr_f)) {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                int[] arr_v = this.b;
                while(v < arr_v.length) {
                    linkedHashMap0.put(((int)arr_v[v]), NaN);
                    ++v;
                }
                return DesugarCollections.unmodifiableMap(linkedHashMap0);
            }
            int[] arr_v1 = new int[this.b.length];
            int[] arr_v2 = new int[this.b.length];
            int[] arr_v3 = new int[this.b.length * 2];
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                int[] arr_v4 = this.b;
                if(v1 >= arr_v4.length) {
                    break;
                }
                long v3 = ((long)arr_v4[v1]) * ((long)(arr_f.length - 1));
                int v4 = (int)h.g(v3, this.a, RoundingMode.DOWN);
                int v5 = (int)(v3 - ((long)v4) * ((long)this.a));
                arr_v1[v1] = v4;
                arr_v2[v1] = v5;
                arr_v3[v2] = v4;
                if(v5 == 0) {
                    ++v2;
                }
                else {
                    arr_v3[v2 + 1] = v4 + 1;
                    v2 += 2;
                }
            }
            Arrays.sort(arr_v3, 0, v2);
            m.t(arr_v3, 0, v2 - 1, arr_f, 0, arr_f.length - 1);
            LinkedHashMap linkedHashMap1 = new LinkedHashMap();
            while(true) {
                int[] arr_v5 = this.b;
                if(v >= arr_v5.length) {
                    break;
                }
                int v6 = arr_v1[v];
                int v7 = arr_v2[v];
                if(v7 == 0) {
                    linkedHashMap1.put(((int)arr_v5[v]), ((double)arr_f[v6]));
                }
                else {
                    linkedHashMap1.put(((int)arr_v5[v]), m.k(arr_f[v6], arr_f[v6 + 1], v7, this.a));
                }
                ++v;
            }
            return DesugarCollections.unmodifiableMap(linkedHashMap1);
        }
    }

    private static void h(int v, int v1) {
        if(v < 0 || v > v1) {
            throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + v1);
        }
    }

    private static int i(int[] arr_v, int v, int v1, int v2, int v3) {
        if(v == v1) {
            return v;
        }
        int v4 = v2 + v3;
        while(v1 > v + 1) {
            int v5 = v + v1 >>> 1;
            int v6 = arr_v[v5];
            if(v6 > v4 >>> 1) {
                v1 = v5;
                continue;
            }
            if(v6 < v4 >>> 1) {
                v = v5;
                continue;
            }
            return v5;
        }
        return v4 - arr_v[v] - arr_v[v1] <= 0 ? v : v1;
    }

    private static boolean j(double[] arr_f) {
        for(int v = 0; v < arr_f.length; ++v) {
            if(Double.isNaN(arr_f[v])) {
                return true;
            }
        }
        return false;
    }

    private static double k(double f, double f1, double f2, double f3) {
        if(f == -Infinity) {
            return f1 == Infinity ? NaN : -Infinity;
        }
        return f1 == Infinity ? Infinity : f + (f1 - f) * f2 / f3;
    }

    private static double[] l(int[] arr_v) {
        double[] arr_f = new double[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_f[v] = (double)arr_v[v];
        }
        return arr_f;
    }

    private static double[] m(long[] arr_v) {
        double[] arr_f = new double[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_f[v] = (double)arr_v[v];
        }
        return arr_f;
    }

    public static com.google.common.math.m.c n() {
        return m.s(2).a(1);
    }

    private static void o(double[] arr_f, int v, int v1) {
        int v2 = 1;
        int v3 = v + v1 >>> 1;
        double f = arr_f[v1];
        double f1 = arr_f[v3];
        int v4 = f < f1 ? 1 : 0;
        double f2 = arr_f[v];
        if(f >= f2) {
            v2 = 0;
        }
        if(v4 == (f1 < f2 ? 1 : 0)) {
            m.v(arr_f, v3, v);
            return;
        }
        if(v4 != v2) {
            m.v(arr_f, v, v1);
        }
    }

    private static int p(double[] arr_f, int v, int v1) {
        m.o(arr_f, v, v1);
        double f = arr_f[v];
        int v2 = v1;
        while(v1 > v) {
            if(arr_f[v1] > f) {
                m.v(arr_f, v2, v1);
                --v2;
            }
            --v1;
        }
        m.v(arr_f, v, v2);
        return v2;
    }

    public static b q() {
        return m.s(100);
    }

    public static b r() {
        return m.s(4);
    }

    public static b s(int v) {
        return new b(v, null);
    }

    private static void t(int[] arr_v, int v, int v1, double[] arr_f, int v2, int v3) {
        int v4 = m.i(arr_v, v, v1, v2, v3);
        int v5 = arr_v[v4];
        m.u(v5, arr_f, v2, v3);
        int v6;
        for(v6 = v4 - 1; v6 >= v && arr_v[v6] == v5; --v6) {
        }
        if(v6 >= v) {
            m.t(arr_v, v, v6, arr_f, v2, v5 - 1);
        }
        int v7;
        for(v7 = v4 + 1; v7 <= v1 && arr_v[v7] == v5; ++v7) {
        }
        if(v7 <= v1) {
            m.t(arr_v, v7, v1, arr_f, v5 + 1, v3);
        }
    }

    private static void u(int v, double[] arr_f, int v1, int v2) {
        if(v == v1) {
            int v3 = v1 + 1;
            int v4 = v1;
            while(v3 <= v2) {
                if(arr_f[v4] > arr_f[v3]) {
                    v4 = v3;
                }
                ++v3;
            }
            if(v4 != v1) {
                m.v(arr_f, v4, v1);
            }
            return;
        }
        while(v2 > v1) {
            int v5 = m.p(arr_f, v1, v2);
            if(v5 >= v) {
                v2 = v5 - 1;
            }
            if(v5 <= v) {
                v1 = v5 + 1;
            }
        }
    }

    private static void v(double[] arr_f, int v, int v1) {
        double f = arr_f[v];
        arr_f[v] = arr_f[v1];
        arr_f[v1] = f;
    }
}

