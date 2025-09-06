package kotlin.ranges;

import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.m;

public final class l extends j implements g, r {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @y4.l
        public final l a() {
            return l.f;
        }
    }

    @y4.l
    public static final a e;
    @y4.l
    private static final l f;

    static {
        l.e = new a(null);
        l.f = new l(1, 0);
    }

    public l(int v, int v1) {
        super(v, v1, 1);
    }

    @Override  // kotlin.ranges.g, kotlin.ranges.r
    public boolean a(Comparable comparable0) {
        return this.l(((Number)comparable0).intValue());
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
    @Override  // kotlin.ranges.j
    public boolean equals(@m Object object0) {
        return object0 instanceof l && (this.isEmpty() && ((l)object0).isEmpty() || this.g() == ((l)object0).g() && this.h() == ((l)object0).h());
    }

    @Override  // kotlin.ranges.g, kotlin.ranges.r
    public Comparable getStart() {
        return this.q();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.ranges.j
    public int hashCode() {
        return this.isEmpty() ? -1 : this.g() * 0x1F + this.h();
    }

    @Override  // kotlin.ranges.j, kotlin.ranges.g, kotlin.ranges.r
    public boolean isEmpty() {
        return this.g() > this.h();
    }

    public boolean l(int v) {
        return this.g() <= v && v <= this.h();
    }

    @y4.l
    public Integer m() {
        if(this.h() == 0x7FFFFFFF) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        }
        return (int)(this.h() + 1);
    }

    @W0(markerClass = {kotlin.r.class})
    @h0(version = "1.9")
    @k(message = "Can throw an exception when it\'s impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It\'s recommended to use \'endInclusive\' property that doesn\'t throw.")
    public static void o() {
    }

    @y4.l
    public Integer p() {
        return this.h();
    }

    @y4.l
    public Integer q() {
        return this.g();
    }

    @Override  // kotlin.ranges.j
    @y4.l
    public String toString() {
        return this.g() + ".." + this.h();
    }
}

