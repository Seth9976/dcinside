package kotlin.random;

import java.io.Serializable;
import kotlin.h0;
import kotlin.internal.m;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@h0(version = "1.3")
@s0({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public abstract class f {
    public static final class a extends f implements Serializable {
        static final class kotlin.random.f.a.a implements Serializable {
            @l
            public static final kotlin.random.f.a.a a;
            private static final long b;

            static {
                kotlin.random.f.a.a.a = new kotlin.random.f.a.a();
            }

            private final Object a() {
                return f.a;
            }
        }

        private a() {
        }

        public a(w w0) {
        }

        @Override  // kotlin.random.f
        public int b(int v) {
            return f.b.b(v);
        }

        @Override  // kotlin.random.f
        public boolean c() {
            return f.b.c();
        }

        @Override  // kotlin.random.f
        @l
        public byte[] d(int v) {
            return f.b.d(v);
        }

        @Override  // kotlin.random.f
        @l
        public byte[] e(@l byte[] arr_b) {
            L.p(arr_b, "array");
            return f.b.e(arr_b);
        }

        @Override  // kotlin.random.f
        @l
        public byte[] f(@l byte[] arr_b, int v, int v1) {
            L.p(arr_b, "array");
            return f.b.f(arr_b, v, v1);
        }

        @Override  // kotlin.random.f
        public double h() {
            return f.b.h();
        }

        @Override  // kotlin.random.f
        public double i(double f) {
            return f.b.i(f);
        }

        @Override  // kotlin.random.f
        public double j(double f, double f1) {
            return f.b.j(f, f1);
        }

        @Override  // kotlin.random.f
        public float k() {
            return f.b.k();
        }

        @Override  // kotlin.random.f
        public int l() {
            return f.b.l();
        }

        @Override  // kotlin.random.f
        public int m(int v) {
            return f.b.m(v);
        }

        @Override  // kotlin.random.f
        public int n(int v, int v1) {
            return f.b.n(v, v1);
        }

        @Override  // kotlin.random.f
        public long o() {
            return f.b.o();
        }

        @Override  // kotlin.random.f
        public long p(long v) {
            return f.b.p(v);
        }

        @Override  // kotlin.random.f
        public long q(long v, long v1) {
            return f.b.q(v, v1);
        }

        private final Object r() {
            return kotlin.random.f.a.a.a;
        }
    }

    @l
    public static final a a;
    @l
    private static final f b;

    static {
        f.a = new a(null);
        f.b = m.a.b();
    }

    public abstract int b(int arg1);

    public boolean c() {
        return this.b(1) != 0;
    }

    @l
    public byte[] d(int v) {
        return this.e(new byte[v]);
    }

    @l
    public byte[] e(@l byte[] arr_b) {
        L.p(arr_b, "array");
        return this.f(arr_b, 0, arr_b.length);
    }

    @l
    public byte[] f(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "array");
        if(v < 0 || v > arr_b.length || v1 < 0 || v1 > arr_b.length) {
            throw new IllegalArgumentException(("fromIndex (" + v + ") or toIndex (" + v1 + ") are out of range: 0.." + arr_b.length + '.').toString());
        }
        if(v > v1) {
            throw new IllegalArgumentException(("fromIndex (" + v + ") must be not greater than toIndex (" + v1 + ").").toString());
        }
        int v2 = (v1 - v) / 4;
        for(int v4 = 0; v4 < v2; ++v4) {
            int v5 = this.l();
            arr_b[v] = (byte)v5;
            arr_b[v + 1] = (byte)(v5 >>> 8);
            arr_b[v + 2] = (byte)(v5 >>> 16);
            arr_b[v + 3] = (byte)(v5 >>> 24);
            v += 4;
        }
        int v6 = v1 - v;
        int v7 = this.b(v6 * 8);
        for(int v3 = 0; v3 < v6; ++v3) {
            arr_b[v + v3] = (byte)(v7 >>> v3 * 8);
        }
        return arr_b;
    }

    public static byte[] g(f f0, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return f0.f(arr_b, v, v1);
    }

    public double h() {
        return e.d(this.b(26), this.b(27));
    }

    public double i(double f) {
        return this.j(0.0, f);
    }

    public double j(double f, double f1) {
        double f4;
        g.d(f, f1);
        double f2 = f1 - f;
        if(Double.isInfinite(f2) && !Double.isInfinite(f) && !Double.isNaN(f) && !Double.isInfinite(f1) && !Double.isNaN(f1)) {
            double f3 = this.h() * (f1 / 2.0 - f / 2.0);
            f4 = f + f3 + f3;
            return f4 >= f1 ? Math.nextAfter(f1, -Infinity) : f4;
        }
        f4 = f + this.h() * f2;
        return f4 >= f1 ? Math.nextAfter(f1, -Infinity) : f4;
    }

    public float k() {
        return ((float)this.b(24)) / 16777216.0f;
    }

    public int l() {
        return this.b(0x20);
    }

    public int m(int v) {
        return this.n(0, v);
    }

    public int n(int v, int v1) {
        int v5;
        int v3;
        g.e(v, v1);
        int v2 = v1 - v;
        if(v2 <= 0 && v2 != 0x80000000) {
            do {
                v3 = this.l();
            }
            while(v > v3 || v3 >= v1);
            return v3;
        }
        if((-v2 & v2) == v2) {
            return v + this.b(g.g(v2));
        }
        do {
            int v4 = this.l();
            v5 = (v4 >>> 1) % v2;
        }
        while((v4 >>> 1) - v5 + (v2 - 1) < 0);
        return v + v5;
    }

    public long o() {
        return (((long)this.l()) << 0x20) + ((long)this.l());
    }

    public long p(long v) {
        return this.q(0L, v);
    }

    public long q(long v, long v1) {
        long v5;
        long v4;
        g.f(v, v1);
        long v2 = v1 - v;
        if(v2 > 0L) {
            if((-v2 & v2) == v2) {
                if(((int)v2) != 0) {
                    return v + (((long)this.b(g.g(((int)v2)))) & 0xFFFFFFFFL);
                }
                return ((int)(v2 >>> 0x20)) == 1 ? v + (((long)this.l()) & 0xFFFFFFFFL) : v + ((((long)this.b(g.g(((int)(v2 >>> 0x20))))) << 0x20) + (((long)this.l()) & 0xFFFFFFFFL));
            }
            do {
                long v3 = this.o();
                v4 = (v3 >>> 1) % v2;
            }
            while((v3 >>> 1) - v4 + (v2 - 1L) < 0L);
            return v + v4;
        }
        do {
            v5 = this.o();
        }
        while(v > v5 || v5 >= v1);
        return v5;
    }
}

