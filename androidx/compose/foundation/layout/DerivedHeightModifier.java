package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
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
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@Stable
@s0({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,217:1\n76#2:218\n102#2,2:219\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n*L\n184#1:218\n184#1:219,2\n*E\n"})
final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    @l
    private final WindowInsets d;
    @l
    private final o e;
    @l
    private final MutableState f;

    public DerivedHeightModifier(@l WindowInsets windowInsets0, @l Function1 function10, @l o o0) {
        L.p(windowInsets0, "insets");
        L.p(function10, "inspectorInfo");
        L.p(o0, "heightCalc");
        super(function10);
        this.d = windowInsets0;
        this.e = o0;
        this.f = SnapshotStateKt__SnapshotStateKt.g(windowInsets0, null, 2, null);
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
        if(this == object0) {
            return true;
        }
        return object0 instanceof DerivedHeightModifier ? L.g(this.d, ((DerivedHeightModifier)object0).d) && L.g(this.e, ((DerivedHeightModifier)object0).e) : false;
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
        WindowInsets windowInsets0 = this.j();
        int v1 = ((Number)this.e.invoke(windowInsets0, measureScope0)).intValue();
        if(v1 == 0) {
            return MeasureScope.-CC.p(measureScope0, 0, 0, null, androidx.compose.foundation.layout.DerivedHeightModifier.measure.1.e, 4, null);
        }
        Placeable placeable0 = measurable0.r1(Constraints.e(v, 0, 0, v1, v1, 3, null));
        return MeasureScope.-CC.p(measureScope0, placeable0.N1(), v1, null, new Function1() {
            final Placeable e;

            {
                this.e = placeable0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                PlacementScope.v(placeable$PlacementScope0, this.e, 0, 0, 0.0f, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);

        final class androidx.compose.foundation.layout.DerivedHeightModifier.measure.1 extends N implements Function1 {
            public static final androidx.compose.foundation.layout.DerivedHeightModifier.measure.1 e;

            static {
                androidx.compose.foundation.layout.DerivedHeightModifier.measure.1.e = new androidx.compose.foundation.layout.DerivedHeightModifier.measure.1();
            }

            androidx.compose.foundation.layout.DerivedHeightModifier.measure.1() {
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

    @Override
    public int hashCode() {
        return this.d.hashCode() * 0x1F + this.e.hashCode();
    }

    private final WindowInsets j() {
        return (WindowInsets)this.f.getValue();
    }

    private final void l(WindowInsets windowInsets0) {
        this.f.setValue(windowInsets0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        WindowInsets windowInsets0 = (WindowInsets)modifierLocalReadScope0.a(WindowInsetsPaddingKt.e());
        this.l(WindowInsetsKt.i(this.d, windowInsets0));
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

