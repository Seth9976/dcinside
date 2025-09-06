package androidx.compose.ui.layout;

import A3.a;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n130#1:201\n25#2,3:198\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:201\n31#1:198,3\n*E\n"})
public final class ScaleFactorKt {
    @Stable
    public static final long a(float f, float f1) [...] // 潜在的解密器

    @Stable
    public static final long c(long v, long v1) {
        return SizeKt.a(Size.t(v) / ScaleFactor.m(v1), Size.m(v) / ScaleFactor.o(v1));
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
        return ScaleFactorKt.a(MathHelpersKt.a(ScaleFactor.m(v), ScaleFactor.m(v1), f), MathHelpersKt.a(ScaleFactor.o(v), ScaleFactor.o(v1), f));
    }

    private static final float i(float f) {
        int v = (int)(f * 10.0f);
        return ((float)(f * 10.0f - ((float)v) >= 0.5f ? v + 1 : ((int)(f * 10.0f)))) / 10.0f;
    }

    public static final long j(long v, @l a a0) {
        L.p(a0, "block");
        return v == 0x7FC000007FC00000L ? ((ScaleFactor)a0.invoke()).s() : v;
    }

    @Stable
    public static final long k(long v, long v1) {
        return SizeKt.a(Size.t(v) * ScaleFactor.m(v1), Size.m(v) * ScaleFactor.o(v1));
    }

    @Stable
    public static final long l(long v, long v1) {
        return ScaleFactorKt.k(v1, v);
    }
}

