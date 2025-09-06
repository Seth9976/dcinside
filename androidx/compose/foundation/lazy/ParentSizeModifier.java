package androidx.compose.foundation.lazy;

import A3.o;
import androidx.compose.runtime.State;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class ParentSizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final float d;
    @m
    private final State e;
    @m
    private final State f;

    public ParentSizeModifier(float f, @l Function1 function10, @m State state0, @m State state1) {
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = f;
        this.e = state0;
        this.f = state1;
    }

    public ParentSizeModifier(float f, Function1 function10, State state0, State state1, int v, w w0) {
        if((v & 4) != 0) {
            state0 = null;
        }
        if((v & 8) != 0) {
            state1 = null;
        }
        this(f, function10, state0, state1);
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
        return object0 instanceof ParentSizeModifier ? L.g(this.e, ((ParentSizeModifier)object0).e) && L.g(this.f, ((ParentSizeModifier)object0).f) && this.d == ((ParentSizeModifier)object0).d : false;
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
        int v1 = this.e == null || ((Number)this.e.getValue()).intValue() == 0x7FFFFFFF ? 0x7FFFFFFF : kotlin.math.b.L0(((Number)this.e.getValue()).floatValue() * this.d);
        int v2 = this.f == null || ((Number)this.f.getValue()).intValue() == 0x7FFFFFFF ? 0x7FFFFFFF : kotlin.math.b.L0(((Number)this.f.getValue()).floatValue() * this.d);
        int v3 = v1 == 0x7FFFFFFF ? Constraints.r(v) : v1;
        int v4 = v2 == 0x7FFFFFFF ? Constraints.q(v) : v2;
        if(v1 == 0x7FFFFFFF) {
            v1 = Constraints.p(v);
        }
        if(v2 == 0x7FFFFFFF) {
            v2 = Constraints.o(v);
        }
        Placeable placeable0 = measurable0.r1(ConstraintsKt.a(v3, v1, v4, v2));
        return MeasureScope.-CC.p(measureScope0, placeable0.N1(), placeable0.K1(), null, new Function1() {
            final Placeable e;

            {
                this.e = placeable0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                PlacementScope.p(placeable$PlacementScope0, this.e, 0, 0, 0.0f, 4, null);
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
        int v = 0;
        int v1 = this.e == null ? 0 : this.e.hashCode();
        State state0 = this.f;
        if(state0 != null) {
            v = state0.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + Float.floatToIntBits(this.d);
    }

    public final float j() {
        return this.d;
    }

    @m
    public final State l() {
        return this.f;
    }

    @m
    public final State m() {
        return this.e;
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

