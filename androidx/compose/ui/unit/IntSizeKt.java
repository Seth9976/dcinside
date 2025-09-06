package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,111:1\n48#2:112\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n32#1:112\n*E\n"})
public final class IntSizeKt {
    @Stable
    public static final long a(int v, int v1) [...] // 潜在的解密器

    public static final long b(long v) {
        return IntOffsetKt.a(((int)(v >> 0x20)) / 2, ((int)(v & 0xFFFFFFFFL)) / 2);
    }

    @Stable
    public static void c(long v) {
    }

    @Stable
    public static final long d(int v, long v1) {
        return IntSize.o(v1, v);
    }

    // 去混淆评级： 低(20)
    @Stable
    @l
    public static final IntRect e(long v) {
        return IntRectKt.b(0L, v);
    }

    @Stable
    public static final long f(long v) {
        return SizeKt.a(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
    }
}

