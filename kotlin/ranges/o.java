package kotlin.ranges;

import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;

public final class o extends m implements g, r {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final o a() {
            return o.f;
        }
    }

    @l
    public static final a e;
    @l
    private static final o f;

    static {
        o.e = new a(null);
        o.f = new o(1L, 0L);
    }

    public o(long v, long v1) {
        super(v, v1, 1L);
    }

    @Override  // kotlin.ranges.g, kotlin.ranges.r
    public boolean a(Comparable comparable0) {
        return this.l(((Number)comparable0).longValue());
    }

    @Override  // kotlin.ranges.r
    public Comparable b() {
        return this.m();
    }

    @Override  // kotlin.ranges.g
    public Comparable d() {
        return this.p();
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.ranges.m
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof o && (this.isEmpty() && ((o)object0).isEmpty() || this.g() == ((o)object0).g() && this.h() == ((o)object0).h());
    }

    @Override  // kotlin.ranges.g, kotlin.ranges.r
    public Comparable getStart() {
        return this.q();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.ranges.m
    public int hashCode() {
        return this.isEmpty() ? -1 : ((int)(0x1FL * (this.g() ^ this.g() >>> 0x20) + (this.h() ^ this.h() >>> 0x20)));
    }

    @Override  // kotlin.ranges.m, kotlin.ranges.g, kotlin.ranges.r
    public boolean isEmpty() {
        return this.g() > this.h();
    }

    public boolean l(long v) {
        return this.g() <= v && v <= this.h();
    }

    @l
    public Long m() {
        if(this.h() == 0x7FFFFFFFFFFFFFFFL) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        }
        return (long)(this.h() + 1L);
    }

    @W0(markerClass = {kotlin.r.class})
    @h0(version = "1.9")
    @k(message = "Can throw an exception when it\'s impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It\'s recommended to use \'endInclusive\' property that doesn\'t throw.")
    public static void o() {
    }

    @l
    public Long p() {
        return this.h();
    }

    @l
    public Long q() {
        return this.g();
    }

    @Override  // kotlin.ranges.m
    @l
    public String toString() {
        return this.g() + ".." + this.h();
    }
}

