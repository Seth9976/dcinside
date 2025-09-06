package androidx.compose.ui.geometry;

import A3.a;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,225:1\n152#1:229\n25#2,3:226\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n166#1:229\n33#1:226,3\n*E\n"})
public final class SizeKt {
    @Stable
    public static final long a(float f, float f1) [...] // 潜在的解密器

    public static final long b(long v) {
        return OffsetKt.a(Size.t(v) / 2.0f, Size.m(v) / 2.0f);
    }

    @Stable
    public static void c(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean d(long v) {
        return v != 0x7FC000007FC00000L;
    }

    @Stable
    public static void e(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean f(long v) {
        return v == 0x7FC000007FC00000L;
    }

    @Stable
    public static void g(long v) {
    }

    @Stable
    public static final long h(long v, long v1, float f) {
        return SizeKt.a(MathHelpersKt.a(Size.t(v), Size.t(v1), f), MathHelpersKt.a(Size.m(v), Size.m(v1), f));
    }

    public static final long i(long v, @l a a0) {
        L.p(a0, "block");
        return v == 0x7FC000007FC00000L ? ((Size)a0.invoke()).y() : v;
    }

    @Stable
    public static final long j(double f, long v) {
        return Size.w(v, ((float)f));
    }

    @Stable
    public static final long k(float f, long v) {
        return Size.w(v, f);
    }

    @Stable
    public static final long l(int v, long v1) {
        return Size.w(v1, ((float)v));
    }

    // 去混淆评级： 低(20)
    @Stable
    @l
    public static final Rect m(long v) {
        return RectKt.c(0L, v);
    }
}

