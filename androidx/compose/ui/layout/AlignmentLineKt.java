package androidx.compose.ui.layout;

import kotlin.jvm.internal.L;
import y4.l;

public final class AlignmentLineKt {
    @l
    private static final HorizontalAlignmentLine a;
    @l
    private static final HorizontalAlignmentLine b;

    static {
        AlignmentLineKt.a = new HorizontalAlignmentLine(AlignmentLineKt.FirstBaseline.1.a);
        AlignmentLineKt.b = new HorizontalAlignmentLine(AlignmentLineKt.LastBaseline.1.a);
    }

    @l
    public static final HorizontalAlignmentLine a() {
        return AlignmentLineKt.a;
    }

    @l
    public static final HorizontalAlignmentLine b() {
        return AlignmentLineKt.b;
    }

    public static final int c(@l AlignmentLine alignmentLine0, int v, int v1) {
        L.p(alignmentLine0, "<this>");
        return ((Number)alignmentLine0.a().invoke(v, v1)).intValue();
    }
}

