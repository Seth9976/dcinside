package kotlin.time;

import kotlin.D;
import kotlin.E;
import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;

@W0(markerClass = {l.class})
@h0(version = "1.9")
public abstract class b implements c {
    @s0({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    static final class a implements d {
        private final long a;
        @y4.l
        private final b b;
        private final long c;

        private a(long v, b b0, long v1) {
            L.p(b0, "timeSource");
            super();
            this.a = v;
            this.b = b0;
            this.c = v1;
        }

        public a(long v, b b0, long v1, w w0) {
            this(v, b0, v1);
        }

        @Override  // kotlin.time.d
        public int N3(@y4.l d d0) {
            return kotlin.time.d.a.a(this, d0);
        }

        @Override  // kotlin.time.r
        public long a() {
            long v = this.b.c();
            h h0 = this.b.d();
            return e.g0(m.h(v, this.a, h0), this.c);
        }

        @Override  // kotlin.time.r
        public boolean b() {
            return kotlin.time.d.a.b(this);
        }

        @Override  // kotlin.time.r
        public boolean c() {
            return kotlin.time.d.a.c(this);
        }

        @Override
        public int compareTo(Object object0) {
            return this.N3(((d)object0));
        }

        // 去混淆评级： 中等(50)
        @Override  // kotlin.time.d
        public boolean equals(@y4.m Object object0) {
            return object0 instanceof a && L.g(this.b, ((a)object0).b) && e.n(this.x(((d)object0)), 0L);
        }

        @Override  // kotlin.time.d
        public int hashCode() {
            return e.Z(this.c) * 37 + ((int)(this.a ^ this.a >>> 0x20));
        }

        @Override  // kotlin.time.d
        @y4.l
        public d o(long v) {
            h h0 = this.b.d();
            if(e.d0(v)) {
                return new a(m.d(this.a, h0, v), this.b, 0L, null);
            }
            long v1 = e.y0(v, h0);
            long v2 = e.h0(e.g0(v, v1), this.c);
            long v3 = m.d(this.a, h0, v1);
            long v4 = e.y0(v2, h0);
            long v5 = m.d(v3, h0, v4);
            long v6 = e.g0(v2, v4);
            long v7 = e.N(v6);
            if(v5 != 0L && v7 != 0L && (v5 ^ v7) < 0L) {
                long v8 = g.m0(kotlin.math.b.V(v7), h0);
                v5 = m.d(v5, h0, v8);
                v6 = e.g0(v6, v8);
            }
            if((1L | v5 - 1L) == 0x7FFFFFFFFFFFFFFFL) {
                v6 = 0L;
            }
            return new a(v5, this.b, v6, null);
        }

        @Override  // kotlin.time.r
        public r o(long v) {
            return this.o(v);
        }

        @Override  // kotlin.time.d
        @y4.l
        public d q(long v) {
            return kotlin.time.d.a.d(this, v);
        }

        @Override  // kotlin.time.r
        public r q(long v) {
            return this.q(v);
        }

        @Override
        @y4.l
        public String toString() {
            return "LongTimeMark(" + this.a + k.h(this.b.d()) + " + " + e.v0(this.c) + ", " + this.b + ')';
        }

        @Override  // kotlin.time.d
        public long x(@y4.l d d0) {
            L.p(d0, "other");
            if(!(d0 instanceof a) || !L.g(this.b, ((a)d0).b)) {
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + d0);
            }
            return e.h0(m.h(this.a, ((a)d0).a, this.b.d()), e.g0(this.c, ((a)d0).c));
        }
    }

    @y4.l
    private final h b;
    @y4.l
    private final D c;

    public b(@y4.l h h0) {
        static final class kotlin.time.b.b extends N implements A3.a {
            final b e;

            kotlin.time.b.b(b b0) {
                this.e = b0;
                super(0);
            }

            public final Long invoke() {
                return this.e.f();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

        L.p(h0, "unit");
        super();
        this.b = h0;
        this.c = E.a(new kotlin.time.b.b(this));
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.time.s$c
    @y4.l
    public d a() {
        return new a(this.c(), this, 0L, null);
    }

    @Override  // kotlin.time.s
    public r a() {
        return this.a();
    }

    private final long c() {
        return this.f() - this.e();
    }

    @y4.l
    protected final h d() {
        return this.b;
    }

    private final long e() {
        return ((Number)this.c.getValue()).longValue();
    }

    protected abstract long f();
}

