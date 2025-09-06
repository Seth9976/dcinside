package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class IntRect {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final IntRect a() {
            return IntRect.g;
        }

        @Stable
        public static void b() {
        }
    }

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    @l
    public static final Companion e;
    public static final int f;
    @l
    private static final IntRect g;

    static {
        IntRect.e = new Companion(null);
        IntRect.g = new IntRect(0, 0, 0, 0);
    }

    public IntRect(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Stable
    public static void A() {
    }

    public final int B() {
        return this.b;
    }

    @Stable
    public static void C() {
    }

    public final long D() {
        return IntOffsetKt.a(this.a + this.G() / 2, this.b);
    }

    public final long E() {
        return IntOffsetKt.a(this.a, this.b);
    }

    public final long F() {
        return IntOffsetKt.a(this.c, this.b);
    }

    public final int G() {
        return this.c - this.a;
    }

    @Stable
    public static void H() {
    }

    @Stable
    @l
    public final IntRect I(int v) {
        return new IntRect(this.a - v, this.b - v, this.c + v, this.d + v);
    }

    @Stable
    @l
    public final IntRect J(@l IntRect intRect0) {
        L.p(intRect0, "other");
        return new IntRect(Math.max(this.a, intRect0.a), Math.max(this.b, intRect0.b), Math.min(this.c, intRect0.c), Math.min(this.d, intRect0.d));
    }

    public final boolean K() {
        return this.a >= this.c || this.b >= this.d;
    }

    @Stable
    public static void L() {
    }

    public final boolean M(@l IntRect intRect0) {
        L.p(intRect0, "other");
        return this.c > intRect0.a && intRect0.c > this.a && this.d > intRect0.b && intRect0.d > this.b;
    }

    @Stable
    @l
    public final IntRect N(int v, int v1) {
        return new IntRect(this.a + v, this.b + v1, this.c + v, this.d + v1);
    }

    @Stable
    @l
    public final IntRect O(long v) {
        return new IntRect(this.a + ((int)(v >> 0x20)), this.b + ((int)(v & 0xFFFFFFFFL)), this.c + ((int)(v >> 0x20)), this.d + ((int)(v & 0xFFFFFFFFL)));
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof IntRect)) {
            return false;
        }
        if(this.a != ((IntRect)object0).a) {
            return false;
        }
        if(this.b != ((IntRect)object0).b) {
            return false;
        }
        return this.c == ((IntRect)object0).c ? this.d == ((IntRect)object0).d : false;
    }

    public final boolean f(long v) {
        return ((int)(v >> 0x20)) >= this.a && ((int)(v >> 0x20)) < this.c && ((int)(v & 0xFFFFFFFFL)) >= this.b && ((int)(v & 0xFFFFFFFFL)) < this.d;
    }

    @l
    public final IntRect g(int v, int v1, int v2, int v3) {
        return new IntRect(v, v1, v2, v3);
    }

    public static IntRect h(IntRect intRect0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = intRect0.a;
        }
        if((v4 & 2) != 0) {
            v1 = intRect0.b;
        }
        if((v4 & 4) != 0) {
            v2 = intRect0.c;
        }
        if((v4 & 8) != 0) {
            v3 = intRect0.d;
        }
        return intRect0.g(v, v1, v2, v3);
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Stable
    @l
    public final IntRect i(int v) {
        return this.I(-v);
    }

    public final int j() {
        return this.d;
    }

    @Stable
    public static void k() {
    }

    public final long l() {
        return IntOffsetKt.a(this.a + this.G() / 2, this.d);
    }

    public final long m() {
        return IntOffsetKt.a(this.a, this.d);
    }

    public final long n() {
        return IntOffsetKt.a(this.c, this.d);
    }

    public final long o() {
        return IntOffsetKt.a(this.a + this.G() / 2, this.b + this.r() / 2);
    }

    public final long p() {
        return IntOffsetKt.a(this.a, this.b + this.r() / 2);
    }

    public final long q() {
        return IntOffsetKt.a(this.c, this.b + this.r() / 2);
    }

    public final int r() {
        return this.d - this.b;
    }

    @Stable
    public static void s() {
    }

    public final int t() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "IntRect.fromLTRB(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ')';
    }

    @Stable
    public static void u() {
    }

    public final int v() {
        return Math.max(Math.abs(this.G()), Math.abs(this.r()));
    }

    public final int w() {
        return Math.min(Math.abs(this.G()), Math.abs(this.r()));
    }

    public final int x() {
        return this.c;
    }

    @Stable
    public static void y() {
    }

    public final long z() {
        return IntSizeKt.a(this.G(), this.r());
    }
}

