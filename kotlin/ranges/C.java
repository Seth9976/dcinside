package kotlin.ranges;

import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

public final class c extends a implements g, r {
    public static final class kotlin.ranges.c.a {
        private kotlin.ranges.c.a() {
        }

        public kotlin.ranges.c.a(w w0) {
        }

        @l
        public final c a() {
            return c.f;
        }
    }

    @l
    public static final kotlin.ranges.c.a e;
    @l
    private static final c f;

    static {
        c.e = new kotlin.ranges.c.a(null);
        c.f = new c('\u0001', '\u0000');
    }

    public c(char c, char c1) {
        super(c, c1, 1);
    }

    @Override  // kotlin.ranges.g, kotlin.ranges.r
    public boolean a(Comparable comparable0) {
        return this.l(((Character)comparable0).charValue());
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
    @Override  // kotlin.ranges.a
    public boolean equals(@m Object object0) {
        return object0 instanceof c && (this.isEmpty() && ((c)object0).isEmpty() || this.g() == ((c)object0).g() && this.h() == ((c)object0).h());
    }

    @Override  // kotlin.ranges.g, kotlin.ranges.r
    public Comparable getStart() {
        return this.q();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.ranges.a
    public int hashCode() {
        return this.isEmpty() ? -1 : this.g() * 0x1F + this.h();
    }

    @Override  // kotlin.ranges.a, kotlin.ranges.g, kotlin.ranges.r
    public boolean isEmpty() {
        return L.t(this.g(), this.h()) > 0;
    }

    public boolean l(char c) {
        return L.t(this.g(), c) <= 0 && L.t(c, this.h()) <= 0;
    }

    @l
    public Character m() {
        if(this.h() == 0xFFFF) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        }
        return Character.valueOf(((char)(this.h() + 1)));
    }

    @W0(markerClass = {kotlin.r.class})
    @h0(version = "1.9")
    @k(message = "Can throw an exception when it\'s impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It\'s recommended to use \'endInclusive\' property that doesn\'t throw.")
    public static void o() {
    }

    @l
    public Character p() {
        return Character.valueOf(this.h());
    }

    @l
    public Character q() {
        return Character.valueOf(this.g());
    }

    @Override  // kotlin.ranges.a
    @l
    public String toString() {
        return this.g() + ".." + this.h();
    }
}

