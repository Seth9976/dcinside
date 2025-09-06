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
import androidx.compose.ui.unit.IntOffset;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class OffsetPxModifier extends InspectorValueInfo implements LayoutModifier {
    @l
    private final Function1 d;
    private final boolean e;

    public OffsetPxModifier(@l Function1 function10, boolean z, @l Function1 function11) {
        L.p(function10, "offset");
        L.p(function11, "inspectorInfo");
        super(function11);
        this.d = function10;
        this.e = z;
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
        OffsetPxModifier offsetPxModifier0 = object0 instanceof OffsetPxModifier ? ((OffsetPxModifier)object0) : null;
        return offsetPxModifier0 == null ? false : L.g(this.d, offsetPxModifier0.d) && this.e == offsetPxModifier0.e;
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
        Placeable placeable0 = measurable0.r1(v);
        return MeasureScope.-CC.p(measureScope0, placeable0.N1(), placeable0.K1(), null, new Function1(measureScope0, placeable0) {
            final OffsetPxModifier e;
            final MeasureScope f;
            final Placeable g;

            {
                this.e = offsetPxModifier0;
                this.f = measureScope0;
                this.g = placeable0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                long v = ((IntOffset)this.e.j().invoke(this.f)).w();
                if(this.e.l()) {
                    PlacementScope.z(placeable$PlacementScope0, this.g, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), 0.0f, null, 12, null);
                    return;
                }
                PlacementScope.D(placeable$PlacementScope0, this.g, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), 0.0f, null, 12, null);
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
        return this.d.hashCode() * 0x1F + androidx.compose.foundation.c.a(this.e);
    }

    @l
    public final Function1 j() {
        return this.d;
    }

    public final boolean l() {
        return this.e;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "OffsetPxModifier(offset=" + this.d + ", rtlAware=" + this.e + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

