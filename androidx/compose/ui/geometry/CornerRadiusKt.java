package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n25#2,3:165\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:165,3\n*E\n"})
public final class CornerRadiusKt {
    @Stable
    public static final long a(float f, float f1) {
        return ((long)Float.floatToIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToIntBits(f)) << 0x20;
    }

    public static long b(float f, float f1, int v, Object object0) [...] // 潜在的解密器

    @Stable
    public static final long c(long v, long v1, float f) {
        return CornerRadiusKt.a((1.0f - f) * CornerRadius.m(v) + f * CornerRadius.m(v1), (1.0f - f) * CornerRadius.o(v) + f * CornerRadius.o(v1));
    }
}

