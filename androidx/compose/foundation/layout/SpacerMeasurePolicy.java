package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class SpacerMeasurePolicy implements MeasurePolicy {
    @l
    public static final SpacerMeasurePolicy a;

    static {
        SpacerMeasurePolicy.a = new SpacerMeasurePolicy();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @l
    public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(list0, "measurables");
        int v1 = Constraints.n(v) ? Constraints.p(v) : 0;
        return Constraints.l(v) ? MeasureScope.-CC.p(measureScope0, v1, Constraints.o(v), null, androidx.compose.foundation.layout.SpacerMeasurePolicy.measure.1.1.e, 4, null) : MeasureScope.-CC.p(measureScope0, v1, 0, null, androidx.compose.foundation.layout.SpacerMeasurePolicy.measure.1.1.e, 4, null);

        final class androidx.compose.foundation.layout.SpacerMeasurePolicy.measure.1.1 extends N implements Function1 {
            public static final androidx.compose.foundation.layout.SpacerMeasurePolicy.measure.1.1 e;

            static {
                androidx.compose.foundation.layout.SpacerMeasurePolicy.measure.1.1.e = new androidx.compose.foundation.layout.SpacerMeasurePolicy.measure.1.1();
            }

            androidx.compose.foundation.layout.SpacerMeasurePolicy.measure.1.1() {
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return e.c(this, intrinsicMeasureScope0, list0, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return e.d(this, intrinsicMeasureScope0, list0, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int d(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return e.a(this, intrinsicMeasureScope0, list0, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return e.b(this, intrinsicMeasureScope0, list0, v);
    }
}

