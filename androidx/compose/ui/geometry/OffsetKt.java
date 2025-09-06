package androidx.compose.ui.geometry;

import A3.a;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n25#2,3:267\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:267,3\n*E\n"})
public final class OffsetKt {
    @Stable
    public static final long a(float f, float f1) [...] // 潜在的解密器

    public static final boolean b(long v) {
        float f = Offset.p(v);
        if(!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f1 = Offset.r(v);
            return !Float.isInfinite(f1) && !Float.isNaN(f1);
        }
        return false;
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
        return OffsetKt.a(MathHelpersKt.a(Offset.p(v), Offset.p(v1), f), MathHelpersKt.a(Offset.r(v), Offset.r(v1), f));
    }

    public static final long i(long v, @l a a0) {
        L.p(a0, "block");
        return OffsetKt.d(v) ? v : ((Offset)a0.invoke()).A();
    }
}

