package kotlin.ranges;

import kotlin.D0;
import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.t;
import kotlin.y0;
import y4.l;
import y4.m;

@W0(markerClass = {t.class})
@h0(version = "1.5")
public final class x extends v implements g, r {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final x a() {
            return x.f;
        }
    }

    @l
    public static final a e;
    @l
    private static final x f;

    static {
        x.e = new a(null);
        x.f = new x(-1, 0, null);
    }

    private x(int v, int v1) {
        super(v, v1, 1, null);
    }

    public x(int v, int v1, w w0) {
        this(v, v1);
    }

    @Override  // kotlin.ranges.g, kotlin.ranges.r
    public boolean a(Comparable comparable0) {
        return this.k(((D0)comparable0).l0());
    }

    @Override  // kotlin.ranges.r
    public Comparable b() {
        return D0.b(this.l());
    }

    @Override  // kotlin.ranges.g
    public Comparable d() {
        return D0.b(this.o());
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.ranges.v
    public boolean equals(@m Object object0) {
        return object0 instanceof x && (this.isEmpty() && ((x)object0).isEmpty() || this.g() == ((x)object0).g() && this.h() == ((x)object0).h());
    }

    @Override  // kotlin.ranges.g, kotlin.ranges.r
    public Comparable getStart() {
        return D0.b(this.p());
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.ranges.v
    public int hashCode() {
        return this.isEmpty() ? -1 : this.g() * 0x1F + this.h();
    }

    @Override  // kotlin.ranges.v, kotlin.ranges.g, kotlin.ranges.r
    public boolean isEmpty() {
        return y0.a(this.g(), this.h()) > 0;
    }

    public boolean k(int v) {
        return y0.a(this.g(), v) <= 0 && y0.a(v, this.h()) <= 0;
    }

    public int l() {
        if(this.h() == -1) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        }
        return this.h() + 1;
    }

    @W0(markerClass = {kotlin.r.class})
    @h0(version = "1.9")
    @k(message = "Can throw an exception when it\'s impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It\'s recommended to use \'endInclusive\' property that doesn\'t throw.")
    public static void m() {
    }

    public int o() {
        return this.h();
    }

    public int p() {
        return this.g();
    }

    @Override  // kotlin.ranges.v
    @l
    public String toString() {
        return D0.g0(this.g()) + ".." + D0.g0(this.h());
    }
}

