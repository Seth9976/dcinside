package kotlin.time;

import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.m;

@h0(version = "1.3")
@k(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@l
public abstract class a implements c {
    static final class kotlin.time.a.a implements d {
        private final double a;
        @y4.l
        private final a b;
        private final long c;

        private kotlin.time.a.a(double f, a a0, long v) {
            L.p(a0, "timeSource");
            super();
            this.a = f;
            this.b = a0;
            this.c = v;
        }

        public kotlin.time.a.a(double f, a a0, long v, w w0) {
            this(f, a0, v);
        }

        @Override  // kotlin.time.d
        public int N3(@y4.l d d0) {
            return kotlin.time.d.a.a(this, d0);
        }

        @Override  // kotlin.time.r
        public long a() {
            double f = this.b.c();
            h h0 = this.b.b();
            return e.g0(g.l0(f - this.a, h0), this.c);
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
        public boolean equals(@m Object object0) {
            return object0 instanceof kotlin.time.a.a && L.g(this.b, ((kotlin.time.a.a)object0).b) && e.n(this.x(((d)object0)), 0L);
        }

        @Override  // kotlin.time.d
        public int hashCode() {
            return e.Z(e.h0(g.l0(this.a, this.b.b()), this.c));
        }

        @Override  // kotlin.time.d
        @y4.l
        public d o(long v) {
            long v1 = e.h0(this.c, v);
            return new kotlin.time.a.a(this.a, this.b, v1, null);
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
            return "DoubleTimeMark(" + this.a + kotlin.time.k.h(this.b.b()) + " + " + e.v0(this.c) + ", " + this.b + ')';
        }

        @Override  // kotlin.time.d
        public long x(@y4.l d d0) {
            L.p(d0, "other");
            if(!(d0 instanceof kotlin.time.a.a) || !L.g(this.b, ((kotlin.time.a.a)d0).b)) {
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + d0);
            }
            if(e.n(this.c, ((kotlin.time.a.a)d0).c) && e.d0(this.c)) {
                return 0L;
            }
            long v = e.g0(this.c, ((kotlin.time.a.a)d0).c);
            long v1 = g.l0(this.a - ((kotlin.time.a.a)d0).a, this.b.b());
            return e.n(v1, e.z0(v)) ? 0L : e.h0(v1, v);
        }
    }

    @y4.l
    private final h b;

    public a(@y4.l h h0) {
        L.p(h0, "unit");
        super();
        this.b = h0;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.time.s$c
    @y4.l
    public d a() {
        return new kotlin.time.a.a(this.c(), this, 0L, null);
    }

    @Override  // kotlin.time.s
    public r a() {
        return this.a();
    }

    @y4.l
    protected final h b() {
        return this.b;
    }

    protected abstract double c();
}

