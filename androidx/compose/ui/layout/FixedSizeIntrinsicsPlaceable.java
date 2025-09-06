package androidx.compose.ui.layout;

import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int v, int v1) {
        this.Q1(IntSizeKt.a(v, v1));
    }

    @Override  // androidx.compose.ui.layout.Placeable
    protected void O1(long v, float f, @m Function1 function10) {
    }

    @Override  // androidx.compose.ui.layout.Measured
    public int v(@l AlignmentLine alignmentLine0) {
        L.p(alignmentLine0, "alignmentLine");
        return 0x80000000;
    }
}

