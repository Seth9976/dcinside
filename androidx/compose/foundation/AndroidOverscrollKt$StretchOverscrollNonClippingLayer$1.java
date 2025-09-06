package androidx.compose.foundation;

import A3.p;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,589:1\n92#2:590\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n*L\n563#1:590\n*E\n"})
final class AndroidOverscrollKt.StretchOverscrollNonClippingLayer.1 extends N implements p {
    public static final AndroidOverscrollKt.StretchOverscrollNonClippingLayer.1 e;

    static {
        AndroidOverscrollKt.StretchOverscrollNonClippingLayer.1.e = new AndroidOverscrollKt.StretchOverscrollNonClippingLayer.1();
    }

    AndroidOverscrollKt.StretchOverscrollNonClippingLayer.1() {
        super(3);
    }

    @l
    public final MeasureResult a(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$layout");
        L.p(measurable0, "measurable");
        Placeable placeable0 = measurable0.r1(v);
        int v1 = measureScope0.b1(60.0f);
        return MeasureScope.-CC.p(measureScope0, placeable0.getMeasuredWidth() - v1, placeable0.getMeasuredHeight() - v1, null, new Function1(v1) {
            final Placeable e;
            final int f;

            {
                this.e = placeable0;
                this.f = v;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                int v = this.e.getMeasuredWidth();
                int v1 = this.e.getMeasuredHeight();
                PlacementScope.D(placeable$PlacementScope0, this.e, -this.f / 2 - (this.e.N1() - v) / 2, -this.f / 2 - (this.e.K1() - v1) / 2, 0.0f, null, 12, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.a(((MeasureScope)object0), ((Measurable)object1), ((Constraints)object2).x());
    }
}

