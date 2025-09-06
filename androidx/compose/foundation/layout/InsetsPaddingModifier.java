package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,305:1\n135#2:306\n76#3:307\n102#3,2:308\n76#3:310\n102#3,2:311\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n149#1:306\n155#1:307\n155#1:308,2\n156#1:310\n156#1:311,2\n*E\n"})
public final class InsetsPaddingModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider {
    @l
    private final WindowInsets d;
    @l
    private final MutableState e;
    @l
    private final MutableState f;

    public InsetsPaddingModifier(@l WindowInsets windowInsets0, @l Function1 function10) {
        L.p(windowInsets0, "insets");
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = windowInsets0;
        this.e = SnapshotStateKt__SnapshotStateKt.g(windowInsets0, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.g(windowInsets0, null, 2, null);
    }

    public InsetsPaddingModifier(WindowInsets windowInsets0, Function1 function10, int v, w w0) {
        if((v & 2) != 0) {
            function10 = InspectableValueKt.b();
        }
        this(windowInsets0, function10);

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n1#1,170:1\n150#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.InsetsPaddingModifier.special..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final WindowInsets e;

            public androidx.compose.foundation.layout.InsetsPaddingModifier.special..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.e = windowInsets0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("InsetsPaddingModifier");
                inspectorInfo0.b().c("insets", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

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
        return object0 instanceof InsetsPaddingModifier ? L.g(((InsetsPaddingModifier)object0).d, this.d) : false;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.a(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.c(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.e();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this.m();
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        int v1 = this.l().d(measureScope0, measureScope0.getLayoutDirection());
        int v2 = this.l().a(measureScope0);
        int v3 = this.l().b(measureScope0, measureScope0.getLayoutDirection()) + v1;
        int v4 = this.l().c(measureScope0) + v2;
        Placeable placeable0 = measurable0.r1(ConstraintsKt.i(v, -v3, -v4));
        return MeasureScope.-CC.p(measureScope0, ConstraintsKt.g(v, placeable0.N1() + v3), ConstraintsKt.f(v, placeable0.K1() + v4), null, new Function1(v1, v2) {
            final Placeable e;
            final int f;
            final int g;

            {
                this.e = placeable0;
                this.f = v;
                this.g = v1;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                PlacementScope.p(placeable$PlacementScope0, this.e, this.f, this.g, 0.0f, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    private final WindowInsets j() {
        return (WindowInsets)this.f.getValue();
    }

    private final WindowInsets l() {
        return (WindowInsets)this.e.getValue();
    }

    @l
    public WindowInsets m() {
        return this.j();
    }

    private final void n(WindowInsets windowInsets0) {
        this.f.setValue(windowInsets0);
    }

    private final void p(WindowInsets windowInsets0) {
        this.e.setValue(windowInsets0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        WindowInsets windowInsets0 = (WindowInsets)modifierLocalReadScope0.a(WindowInsetsPaddingKt.e());
        this.p(WindowInsetsKt.i(this.d, windowInsets0));
        this.n(WindowInsetsKt.k(windowInsets0, this.d));
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

