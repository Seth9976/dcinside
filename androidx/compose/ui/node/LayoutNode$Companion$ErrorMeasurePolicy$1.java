package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class LayoutNode.Companion.ErrorMeasurePolicy.1 extends NoIntrinsicsMeasurePolicy {
    LayoutNode.Companion.ErrorMeasurePolicy.1() {
        super("Undefined intrinsics block and it is required");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public MeasureResult a(MeasureScope measureScope0, List list0, long v) {
        return (MeasureResult)this.j(measureScope0, list0, v);
    }

    @l
    public Void j(@l MeasureScope measureScope0, @l List list0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(list0, "measurables");
        throw new IllegalStateException("Undefined measure and it is required");
    }
}

