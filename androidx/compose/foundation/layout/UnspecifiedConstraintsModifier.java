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
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

final class UnspecifiedConstraintsModifier extends InspectorValueInfo implements LayoutModifier {
    private final float d;
    private final float e;

    private UnspecifiedConstraintsModifier(float f, float f1, Function1 function10) {
        super(function10);
        this.d = f;
        this.e = f1;
    }

    public UnspecifiedConstraintsModifier(float f, float f1, Function1 function10, int v, w w0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        this(f, f1, function10, null);
    }

    public UnspecifiedConstraintsModifier(float f, float f1, Function1 function10, w w0) {
        this(f, f1, function10);
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
    public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        int v1 = intrinsicMeasurable0.S0(v);
        return Dp.l(this.d, NaNf) ? s.u(v1, 0) : s.u(v1, intrinsicMeasureScope0.b1(this.d));
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        int v1 = intrinsicMeasurable0.h1(v);
        return Dp.l(this.d, NaNf) ? s.u(v1, 0) : s.u(v1, intrinsicMeasureScope0.b1(this.d));
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof UnspecifiedConstraintsModifier ? Dp.l(this.d, ((UnspecifiedConstraintsModifier)object0).d) && Dp.l(this.e, ((UnspecifiedConstraintsModifier)object0).e) : false;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        int v1 = intrinsicMeasurable0.g(v);
        return Dp.l(this.e, NaNf) ? s.u(v1, 0) : s.u(v1, intrinsicMeasureScope0.b1(this.e));
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        int v1 = intrinsicMeasurable0.D0(v);
        return Dp.l(this.e, NaNf) ? s.u(v1, 0) : s.u(v1, intrinsicMeasureScope0.b1(this.e));
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        Placeable placeable0 = measurable0.r1(ConstraintsKt.a((Dp.l(this.d, NaNf) || Constraints.r(v) != 0 ? Constraints.r(v) : s.u(s.B(measureScope0.b1(this.d), Constraints.p(v)), 0)), Constraints.p(v), (Dp.l(this.e, NaNf) || Constraints.q(v) != 0 ? Constraints.q(v) : s.u(s.B(measureScope0.b1(this.e), Constraints.o(v)), 0)), Constraints.o(v)));
        return MeasureScope.-CC.p(measureScope0, placeable0.N1(), placeable0.K1(), null, new Function1() {
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
    }

    @Override
    public int hashCode() {
        return Dp.n(this.d) * 0x1F + Dp.n(this.e);
    }

    public final float j() {
        return this.e;
    }

    public final float l() {
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

