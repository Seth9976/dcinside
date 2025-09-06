package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class Rect {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Rect a() {
            return Rect.g;
        }

        @Stable
        public static void b() {
        }
    }

    private final float a;
    private final float b;
    private final float c;
    private final float d;
    @l
    public static final Companion e;
    public static final int f;
    @l
    private static final Rect g;

    static {
        Rect.e = new Companion(null);
        Rect.g = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Rect(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Stable
    public static void A() {
    }

    public final float B() {
        return this.b;
    }

    @Stable
    public static void C() {
    }

    public final long D() {
        return OffsetKt.a(this.a + this.G() / 2.0f, this.b);
    }

    public final long E() {
        return OffsetKt.a(this.a, this.b);
    }

    public final long F() {
        return OffsetKt.a(this.c, this.b);
    }

    public final float G() {
        return this.c - this.a;
    }

    @Stable
    public static void H() {
    }

    @Stable
    @l
    public final Rect I(float f) {
        return new Rect(this.a - f, this.b - f, this.c + f, this.d + f);
    }

    @Stable
    @l
    public final Rect J(@l Rect rect0) {
        L.p(rect0, "other");
        return new Rect(Math.max(this.a, rect0.a), Math.max(this.b, rect0.b), Math.min(this.c, rect0.c), Math.min(this.d, rect0.d));
    }

    public final boolean K() {
        return this.a >= this.c || this.b >= this.d;
    }

    @Stable
    public static void L() {
    }

    // 去混淆评级： 中等(80)
    public final boolean M() {
        return !Float.isInfinite(this.a) && !Float.isNaN(this.a) && (!Float.isInfinite(this.b) && !Float.isNaN(this.b)) && (!Float.isInfinite(this.c) && !Float.isNaN(this.c)) && (!Float.isInfinite(this.d) && !Float.isNaN(this.d));
    }

    @Stable
    public static void N() {
    }

    public final boolean O() {
        return this.a >= Infinityf || this.b >= Infinityf || this.c >= Infinityf || this.d >= Infinityf;
    }

    @Stable
    public static void P() {
    }

    public final boolean Q(@l Rect rect0) {
        L.p(rect0, "other");
        return this.c > rect0.a && rect0.c > this.a && this.d > rect0.b && rect0.d > this.b;
    }

    @Stable
    @l
    public final Rect R(float f, float f1) {
        return new Rect(this.a + f, this.b + f1, this.c + f, this.d + f1);
    }

    @Stable
    @l
    public final Rect S(long v) {
        float f = Offset.p(v);
        float f1 = Offset.r(v);
        float f2 = Offset.p(v);
        float f3 = Offset.r(v);
        return new Rect(this.a + f, this.b + f1, this.c + f2, this.d + f3);
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }

    public final float e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Rect)) {
            return false;
        }
        if(Float.compare(this.a, ((Rect)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((Rect)object0).b) != 0) {
            return false;
        }
        return Float.compare(this.c, ((Rect)object0).c) == 0 ? Float.compare(this.d, ((Rect)object0).d) == 0 : false;
    }

    public final boolean f(long v) {
        return Offset.p(v) >= this.a && Offset.p(v) < this.c && Offset.r(v) >= this.b && Offset.r(v) < this.d;
    }

    @l
    public final Rect g(float f, float f1, float f2, float f3) {
        return new Rect(f, f1, f2, f3);
    }

    public static Rect h(Rect rect0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = rect0.a;
        }
        if((v & 2) != 0) {
            f1 = rect0.b;
        }
        if((v & 4) != 0) {
            f2 = rect0.c;
        }
        if((v & 8) != 0) {
            f3 = rect0.d;
        }
        return rect0.g(f, f1, f2, f3);
    }

    @Override
    public int hashCode() {
        return ((Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d);
    }

    @Stable
    @l
    public final Rect i(float f) {
        return this.I(-f);
    }

    public final float j() {
        return this.d;
    }

    @Stable
    public static void k() {
    }

    public final long l() {
        return OffsetKt.a(this.a + this.G() / 2.0f, this.d);
    }

    public final long m() {
        return OffsetKt.a(this.a, this.d);
    }

    public final long n() {
        return OffsetKt.a(this.c, this.d);
    }

    public final long o() {
        return OffsetKt.a(this.a + this.G() / 2.0f, this.b + this.r() / 2.0f);
    }

    public final long p() {
        return OffsetKt.a(this.a, this.b + this.r() / 2.0f);
    }

    public final long q() {
        return OffsetKt.a(this.c, this.b + this.r() / 2.0f);
    }

    public final float r() {
        return this.d - this.b;
    }

    @Stable
    public static void s() {
    }

    public final float t() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.a(this.a, 1) + ", " + GeometryUtilsKt.a(this.b, 1) + ", " + GeometryUtilsKt.a(this.c, 1) + ", " + GeometryUtilsKt.a(this.d, 1) + ')';
    }

    @Stable
    public static void u() {
    }

    public final float v() {
        return Math.max(Math.abs(this.G()), Math.abs(this.r()));
    }

    public final float w() {
        return Math.min(Math.abs(this.G()), Math.abs(this.r()));
    }

    public final float x() {
        return this.c;
    }

    @Stable
    public static void y() {
    }

    public final long z() {
        return SizeKt.a(this.G(), this.r());
    }
}

