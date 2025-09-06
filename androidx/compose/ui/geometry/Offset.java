package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n34#2:267\n41#2:268\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n70#1:267\n80#1:268\n*E\n"})
@g
public final class Offset {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器

        @Stable
        public static void b() {
        }

        // 去混淆评级： 低(20)
        public final long c() [...] // 潜在的解密器

        @Stable
        public static void d() {
        }

        // 去混淆评级： 低(20)
        public final long e() [...] // 潜在的解密器

        @Stable
        public static void f() {
        }
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;
    private static final long d;
    private static final long e;

    static {
        Offset.b = new Companion(null);
        Offset.c = 0L;
        Offset.d = 0x7F8000007F800000L;
        Offset.e = 0x7FC000007FC00000L;
    }

    private Offset(long v) {
        this.a = v;
    }

    public final long A() {
        return this.a;
    }

    public static final long a() [...] // 潜在的解密器

    public static final long b() [...] // 潜在的解密器

    public static final long c() [...] // 潜在的解密器

    public static final Offset d(long v) {
        return new Offset(v);
    }

    @Stable
    public static final float e(long v) {
        return Offset.p(v);
    }

    @Override
    public boolean equals(Object object0) {
        return Offset.k(this.a, object0);
    }

    @Stable
    public static final float f(long v) {
        return Offset.r(v);
    }

    public static long g(long v) [...] // Inlined contents

    public static final long h(long v, float f, float f1) {
        return OffsetKt.a(f, f1);
    }

    @Override
    public int hashCode() {
        return Offset.s(this.a);
    }

    public static long i(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Offset.p(v);
        }
        if((v1 & 2) != 0) {
            f1 = Offset.r(v);
        }
        return Offset.h(v, f, f1);
    }

    @Stable
    public static final long j(long v, float f) {
        return OffsetKt.a(Offset.p(v) / f, Offset.r(v) / f);
    }

    public static boolean k(long v, Object object0) {
        return object0 instanceof Offset ? v == ((Offset)object0).A() : false;
    }

    public static final boolean l(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static final float m(long v) {
        return (float)Math.sqrt(Offset.p(v) * Offset.p(v) + Offset.r(v) * Offset.r(v));
    }

    @Stable
    public static final float n(long v) {
        return Offset.p(v) * Offset.p(v) + Offset.r(v) * Offset.r(v);
    }

    @Stable
    public static void o() {
    }

    public static final float p(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Offset is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void q() {
    }

    public static final float r(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Offset is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int s(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final boolean t(long v) {
        if(Float.isNaN(Offset.p(v)) || Float.isNaN(Offset.r(v))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    @Override
    @l
    public String toString() {
        return Offset.y(this.a);
    }

    @Stable
    public static final long u(long v, long v1) {
        return OffsetKt.a(Offset.p(v) - Offset.p(v1), Offset.r(v) - Offset.r(v1));
    }

    @Stable
    public static final long v(long v, long v1) {
        return OffsetKt.a(Offset.p(v) + Offset.p(v1), Offset.r(v) + Offset.r(v1));
    }

    @Stable
    public static final long w(long v, float f) {
        return OffsetKt.a(Offset.p(v) % f, Offset.r(v) % f);
    }

    @Stable
    public static final long x(long v, float f) {
        return OffsetKt.a(Offset.p(v) * f, Offset.r(v) * f);
    }

    // 去混淆评级： 低(20)
    @l
    public static String y(long v) {
        return OffsetKt.d(v) ? "Offset(" + GeometryUtilsKt.a(Offset.p(v), 1) + ", " + GeometryUtilsKt.a(Offset.r(v), 1) + ')' : "Offset.Unspecified";
    }

    @Stable
    public static final long z(long v) {
        return OffsetKt.a(-Offset.p(v), -Offset.r(v));
    }
}

