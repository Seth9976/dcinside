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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

final class WrapContentModifier extends InspectorValueInfo implements LayoutModifier {
    @l
    private final Direction d;
    private final boolean e;
    @l
    private final o f;
    @l
    private final Object g;

    public WrapContentModifier(@l Direction direction0, boolean z, @l o o0, @l Object object0, @l Function1 function10) {
        L.p(direction0, "direction");
        L.p(o0, "alignmentCallback");
        L.p(object0, "align");
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = direction0;
        this.e = z;
        this.f = o0;
        this.g = object0;
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

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof WrapContentModifier ? this.d == ((WrapContentModifier)object0).d && this.e == ((WrapContentModifier)object0).e && L.g(this.g, ((WrapContentModifier)object0).g) : false;
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
        Direction direction0 = Direction.a;
        int v1 = 0;
        int v2 = this.d == direction0 ? Constraints.r(v) : 0;
        Direction direction1 = Direction.b;
        if(this.d == direction1) {
            v1 = Constraints.q(v);
        }
        int v3 = 0x7FFFFFFF;
        int v4 = this.d == direction0 || !this.e ? Constraints.p(v) : 0x7FFFFFFF;
        if(this.d == direction1 || !this.e) {
            v3 = Constraints.o(v);
        }
        Placeable placeable0 = measurable0.r1(ConstraintsKt.a(v2, v4, v1, v3));
        int v5 = s.I(placeable0.N1(), Constraints.r(v), Constraints.p(v));
        int v6 = s.I(placeable0.K1(), Constraints.q(v), Constraints.o(v));
        return MeasureScope.-CC.p(measureScope0, v5, v6, null, new Function1(v5, placeable0, v6, measureScope0) {
            final WrapContentModifier e;
            final int f;
            final Placeable g;
            final int h;
            final MeasureScope i;

            {
                this.e = wrapContentModifier0;
                this.f = v;
                this.g = placeable0;
                this.h = v1;
                this.i = measureScope0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                long v = ((IntOffset)this.e.f.invoke(IntSize.b(IntSizeKt.a(this.f - this.g.N1(), this.h - this.g.K1())), this.i.getLayoutDirection())).w();
                PlacementScope.r(placeable$PlacementScope0, this.g, v, 0.0f, 2, null);
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
        return (this.d.hashCode() * 0x1F + androidx.compose.foundation.c.a(this.e)) * 0x1F + this.g.hashCode();
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

