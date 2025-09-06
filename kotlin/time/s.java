package kotlin.time;

import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import z3.g;

@W0(markerClass = {l.class})
@h0(version = "1.9")
public interface s {
    public static final class a {
        static final a a;

        static {
            a.a = new a();
        }
    }

    public static final class b implements c {
        @W0(markerClass = {l.class})
        @h0(version = "1.9")
        @g
        public static final class kotlin.time.s.b.a implements d {
            private final long a;

            private kotlin.time.s.b.a(long v) {
                this.a = v;
            }

            @Override  // kotlin.time.d
            public int N3(@y4.l d d0) {
                return kotlin.time.d.a.a(this, d0);
            }

            @Override  // kotlin.time.r
            public long a() {
                return kotlin.time.s.b.a.h(this.a);
            }

            @Override  // kotlin.time.r
            public boolean b() {
                return kotlin.time.s.b.a.k(this.a);
            }

            @Override  // kotlin.time.r
            public boolean c() {
                return kotlin.time.s.b.a.l(this.a);
            }

            @Override
            public int compareTo(Object object0) {
                return this.N3(((d)object0));
            }

            public static final kotlin.time.s.b.a d(long v) {
                return new kotlin.time.s.b.a(v);
            }

            // 去混淆评级： 低(20)
            public static final int e(long v, long v1) {
                return e.h(kotlin.time.s.b.a.n(v, v1), 0L);
            }

            @Override  // kotlin.time.d
            public boolean equals(Object object0) {
                return kotlin.time.s.b.a.i(this.a, object0);
            }

            public static int f(long v, @y4.l d d0) {
                L.p(d0, "other");
                return kotlin.time.s.b.a.d(v).N3(d0);
            }

            public static long g(long v) [...] // Inlined contents

            public static long h(long v) {
                return p.b.d(v);
            }

            @Override  // kotlin.time.d
            public int hashCode() {
                return kotlin.time.s.b.a.m(this.a);
            }

            public static boolean i(long v, Object object0) {
                return object0 instanceof kotlin.time.s.b.a ? v == ((kotlin.time.s.b.a)object0).w() : false;
            }

            public static final boolean j(long v, long v1) {
                return v == v1;
            }

            public static boolean k(long v) {
                return e.e0(kotlin.time.s.b.a.h(v));
            }

            public static boolean l(long v) {
                return !e.e0(kotlin.time.s.b.a.h(v));
            }

            public static int m(long v) {
                return (int)(v ^ v >>> 0x20);
            }

            public static final long n(long v, long v1) {
                return p.b.c(v, v1);
            }

            @Override  // kotlin.time.d
            public d o(long v) {
                return kotlin.time.s.b.a.d(this.t(v));
            }

            @Override  // kotlin.time.r
            public r o(long v) {
                return kotlin.time.s.b.a.d(this.t(v));
            }

            public long p(long v) {
                return kotlin.time.s.b.a.r(this.a, v);
            }

            @Override  // kotlin.time.d
            public d q(long v) {
                return kotlin.time.s.b.a.d(this.p(v));
            }

            @Override  // kotlin.time.r
            public r q(long v) {
                return kotlin.time.s.b.a.d(this.p(v));
            }

            public static long r(long v, long v1) {
                long v2 = e.z0(v1);
                return p.b.b(v, v2);
            }

            public static long s(long v, @y4.l d d0) {
                L.p(d0, "other");
                if(!(d0 instanceof kotlin.time.s.b.a)) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + kotlin.time.s.b.a.v(v) + " and " + d0);
                }
                return kotlin.time.s.b.a.n(v, ((kotlin.time.s.b.a)d0).w());
            }

            public long t(long v) {
                return kotlin.time.s.b.a.u(this.a, v);
            }

            @Override
            public String toString() {
                return kotlin.time.s.b.a.v(this.a);
            }

            public static long u(long v, long v1) {
                return p.b.b(v, v1);
            }

            public static String v(long v) {
                return "ValueTimeMark(reading=" + v + ')';
            }

            public final long w() {
                return this.a;
            }

            @Override  // kotlin.time.d
            public long x(@y4.l d d0) {
                L.p(d0, "other");
                return kotlin.time.s.b.a.s(this.a, d0);
            }
        }

        @y4.l
        public static final b b;

        static {
            b.b = new b();
        }

        // 去混淆评级： 低(20)
        @Override  // kotlin.time.s$c
        public d a() {
            return kotlin.time.s.b.a.d(3931000L);
        }

        // 去混淆评级： 低(20)
        @Override  // kotlin.time.s
        public r a() {
            return kotlin.time.s.b.a.d(0x24FB30L);
        }

        // 去混淆评级： 低(20)
        public long b() [...] // 潜在的解密器

        @Override
        @y4.l
        public String toString() {
            return "TimeSource(System.nanoTime())";
        }
    }

    @W0(markerClass = {l.class})
    @h0(version = "1.9")
    public interface c extends s {
        @y4.l
        d a();
    }

    @y4.l
    public static final a a;

    static {
        s.a = a.a;
    }

    @y4.l
    r a();
}

