package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,97:1\n154#2:98\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n61#1:98\n*E\n"})
public final class ClipScrollableContainerKt {
    private static final float a;
    @l
    private static final Modifier b;
    @l
    private static final Modifier c;

    static {
        ClipScrollableContainerKt.a = 30.0f;
        ClipScrollableContainerKt.HorizontalScrollableClipModifier.1 clipScrollableContainerKt$HorizontalScrollableClipModifier$10 = new ClipScrollableContainerKt.HorizontalScrollableClipModifier.1();
        ClipScrollableContainerKt.b = ClipKt.a(Modifier.m0, clipScrollableContainerKt$HorizontalScrollableClipModifier$10);
        ClipScrollableContainerKt.VerticalScrollableClipModifier.1 clipScrollableContainerKt$VerticalScrollableClipModifier$10 = new ClipScrollableContainerKt.VerticalScrollableClipModifier.1();
        ClipScrollableContainerKt.c = ClipKt.a(Modifier.m0, clipScrollableContainerKt$VerticalScrollableClipModifier$10);
    }

    @l
    public static final Modifier a(@l Modifier modifier0, @l Orientation orientation0) {
        L.p(modifier0, "<this>");
        L.p(orientation0, "orientation");
        return orientation0 == Orientation.a ? modifier0.r0(ClipScrollableContainerKt.c) : modifier0.r0(ClipScrollableContainerKt.b);
    }

    public static final float b() [...] // 潜在的解密器
}

