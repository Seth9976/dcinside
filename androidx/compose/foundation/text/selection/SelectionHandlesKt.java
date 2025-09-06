package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,70:1\n154#2:71\n154#2:72\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n27#1:71\n28#1:72\n*E\n"})
public final class SelectionHandlesKt {
    private static final float a;
    private static final float b;
    @l
    private static final SemanticsPropertyKey c;

    static {
        SelectionHandlesKt.a = 25.0f;
        SelectionHandlesKt.b = 25.0f;
        SelectionHandlesKt.c = new SemanticsPropertyKey("SelectionHandleInfo", null, 2, null);
    }

    public static final long a(long v) {
        return OffsetKt.a(Offset.p(v), Offset.r(v) - 1.0f);
    }

    public static final float b() [...] // 潜在的解密器

    public static final float c() [...] // 潜在的解密器

    @l
    public static final SemanticsPropertyKey d() {
        return SelectionHandlesKt.c;
    }
}

