package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.s0;
import kotlin.math.b;

@s0({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n48#2:180\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n39#1:180\n*E\n"})
public final class IntOffsetKt {
    @Stable
    public static final long a(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    @Stable
    public static final long b(long v, long v1, float f) {
        return IntOffsetKt.a(MathHelpersKt.b(((int)(v >> 0x20)), ((int)(v1 >> 0x20)), f), MathHelpersKt.b(((int)(v & 0xFFFFFFFFL)), ((int)(v1 & 0xFFFFFFFFL)), f));
    }

    @Stable
    public static final long c(long v, long v1) {
        return OffsetKt.a(Offset.p(v) - ((float)(((int)(v1 >> 0x20)))), Offset.r(v) - ((float)IntOffset.o(v1)));
    }

    @Stable
    public static final long d(long v, long v1) {
        return OffsetKt.a(((float)(((int)(v >> 0x20)))) - Offset.p(v1), ((float)(((int)(v & 0xFFFFFFFFL)))) - Offset.r(v1));
    }

    @Stable
    public static final long e(long v, long v1) {
        return OffsetKt.a(Offset.p(v) + ((float)(((int)(v1 >> 0x20)))), Offset.r(v) + ((float)(((int)(v1 & 0xFFFFFFFFL)))));
    }

    @Stable
    public static final long f(long v, long v1) {
        return OffsetKt.a(((float)(((int)(v >> 0x20)))) + Offset.p(v1), ((float)(((int)(v & 0xFFFFFFFFL)))) + Offset.r(v1));
    }

    @Stable
    public static final long g(long v) {
        return IntOffsetKt.a(b.L0(Offset.p(v)), b.L0(Offset.r(v)));
    }

    @Stable
    public static final long h(long v) {
        return OffsetKt.a(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
    }
}

