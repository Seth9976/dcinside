package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,225:1\n34#2:226\n41#2:227\n152#3:228\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:226\n61#1:227\n138#1:228\n*E\n"})
@g
public final class Size {
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
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;
    private static final long d;

    static {
        Size.b = new Companion(null);
        Size.c = 0L;
        Size.d = 0x7FC000007FC00000L;
    }

    private Size(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final long b() [...] // 潜在的解密器

    public static final Size c(long v) {
        return new Size(v);
    }

    @Stable
    public static final float d(long v) {
        return Size.t(v);
    }

    @Stable
    public static final float e(long v) {
        return Size.m(v);
    }

    @Override
    public boolean equals(Object object0) {
        return Size.j(this.a, object0);
    }

    public static long f(long v) [...] // Inlined contents

    public static final long g(long v, float f, float f1) {
        return SizeKt.a(f, f1);
    }

    public static long h(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Size.t(v);
        }
        if((v1 & 2) != 0) {
            f1 = Size.m(v);
        }
        return Size.g(v, f, f1);
    }

    @Override
    public int hashCode() {
        return Size.u(this.a);
    }

    @Stable
    public static final long i(long v, float f) {
        return SizeKt.a(Size.t(v) / f, Size.m(v) / f);
    }

    public static boolean j(long v, Object object0) {
        return object0 instanceof Size ? v == ((Size)object0).y() : false;
    }

    public static final boolean k(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static void l() {
    }

    public static final float m(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Stable
    public static void n() {
    }

    public static final float o(long v) {
        return Math.max(Math.abs(Size.t(v)), Math.abs(Size.m(v)));
    }

    @Stable
    public static void p() {
    }

    public static final float q(long v) {
        return Math.min(Math.abs(Size.t(v)), Math.abs(Size.m(v)));
    }

    @b0
    public static void r() {
    }

    @Stable
    public static void s() {
    }

    public static final float t(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Override
    @l
    public String toString() {
        return Size.x(this.a);
    }

    public static int u(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final boolean v(long v) {
        return Size.t(v) <= 0.0f || Size.m(v) <= 0.0f;
    }

    @Stable
    public static final long w(long v, float f) {
        return SizeKt.a(Size.t(v) * f, Size.m(v) * f);
    }

    // 去混淆评级： 低(20)
    @l
    public static String x(long v) {
        return v == 0x7FC000007FC00000L ? "Size.Unspecified" : "Size(" + GeometryUtilsKt.a(Size.t(v), 1) + ", " + GeometryUtilsKt.a(Size.m(v), 1) + ')';
    }

    public final long y() {
        return this.a;
    }
}

