package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n405#1:437\n406#1:438\n407#1:439\n408#1:440\n*E\n"})
final class PaddingValuesModifier extends InspectorValueInfo implements LayoutModifier {
    @l
    private final PaddingValues d;

    public PaddingValuesModifier(@l PaddingValues paddingValues0, @l Function1 function10) {
        L.p(paddingValues0, "paddingValues");
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = paddingValues0;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.d(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.b(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override
    public boolean equals(@m Object object0) {
        PaddingValuesModifier paddingValuesModifier0 = object0 instanceof PaddingValuesModifier ? ((PaddingValuesModifier)object0) : null;
        return paddingValuesModifier0 == null ? false : L.g(this.d, paddingValuesModifier0.d);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.a(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.c(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
        if(Dp.f(this.d.b(layoutDirection0), 0.0f) >= 0 && Dp.f(this.d.d(), 0.0f) >= 0) {
            LayoutDirection layoutDirection1 = measureScope0.getLayoutDirection();
            if(Dp.f(this.d.c(layoutDirection1), 0.0f) >= 0 && Dp.f(this.d.a(), 0.0f) >= 0) {
                LayoutDirection layoutDirection2 = measureScope0.getLayoutDirection();
                int v1 = measureScope0.b1(this.d.b(layoutDirection2));
                LayoutDirection layoutDirection3 = measureScope0.getLayoutDirection();
                int v2 = v1 + measureScope0.b1(this.d.c(layoutDirection3));
                int v3 = measureScope0.b1(this.d.d()) + measureScope0.b1(this.d.a());
                Placeable placeable0 = measurable0.r1(ConstraintsKt.i(v, -v2, -v3));
                return MeasureScope.-CC.p(measureScope0, ConstraintsKt.g(v, placeable0.N1() + v2), ConstraintsKt.f(v, placeable0.K1() + v3), null, new Function1(measureScope0, this) {
                    final Placeable e;
                    final MeasureScope f;
                    final PaddingValuesModifier g;

                    {
                        this.e = placeable0;
                        this.f = measureScope0;
                        this.g = paddingValuesModifier0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        float f = this.g.j().b(this.f.getLayoutDirection());
                        int v = this.f.b1(f);
                        float f1 = this.g.j().d();
                        int v1 = this.f.b1(f1);
                        PlacementScope.p(placeable$PlacementScope0, this.e, v, v1, 0.0f, 4, null);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null);
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    @l
    public final PaddingValues j() {
        return this.d;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

