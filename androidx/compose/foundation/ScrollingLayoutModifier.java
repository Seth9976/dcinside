package androidx.compose.foundation;

import A3.o;
import androidx.compose.foundation.gestures.Orientation;
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
import androidx.compose.ui.unit.Constraints;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

final class ScrollingLayoutModifier implements LayoutModifier {
    @l
    private final ScrollState a;
    private final boolean b;
    private final boolean c;

    public ScrollingLayoutModifier(@l ScrollState scrollState0, boolean z, boolean z1) {
        L.p(scrollState0, "scrollerState");
        super();
        this.a = scrollState0;
        this.b = z;
        this.c = z1;
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

    @l
    public final ScrollState a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return this.c ? intrinsicMeasurable0.S0(0x7FFFFFFF) : intrinsicMeasurable0.S0(v);
    }

    public final boolean d() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return this.c ? intrinsicMeasurable0.h1(0x7FFFFFFF) : intrinsicMeasurable0.h1(v);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ScrollingLayoutModifier)) {
            return false;
        }
        if(!L.g(this.a, ((ScrollingLayoutModifier)object0).a)) {
            return false;
        }
        return this.b == ((ScrollingLayoutModifier)object0).b ? this.c == ((ScrollingLayoutModifier)object0).c : false;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return this.c ? intrinsicMeasurable0.g(v) : intrinsicMeasurable0.g(0x7FFFFFFF);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return this.c ? intrinsicMeasurable0.D0(v) : intrinsicMeasurable0.D0(0x7FFFFFFF);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        CheckScrollableContainerConstraintsKt.a(v, (this.c ? Orientation.a : Orientation.b));
        int v1 = this.c ? 0x7FFFFFFF : Constraints.o(v);
        Placeable placeable0 = measurable0.r1(Constraints.e(v, 0, (this.c ? Constraints.p(v) : 0x7FFFFFFF), 0, v1, 5, null));
        int v2 = s.B(placeable0.N1(), Constraints.p(v));
        int v3 = s.B(placeable0.K1(), Constraints.o(v));
        int v4 = placeable0.K1() - v3;
        int v5 = placeable0.N1();
        if(!this.c) {
            v4 = v5 - v2;
        }
        this.a.r(v4);
        this.a.t((this.c ? v3 : v2));
        return MeasureScope.-CC.p(measureScope0, v2, v3, null, new Function1(v4, placeable0) {
            final ScrollingLayoutModifier e;
            final int f;
            final Placeable g;

            {
                this.e = scrollingLayoutModifier0;
                this.f = v;
                this.g = placeable0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                int v = s.I(this.e.l().o(), 0, this.f);
                int v1 = this.e.m() ? v - this.f : -v;
                PlacementScope.z(placeable$PlacementScope0, this.g, (this.e.n() ? 0 : v1), (this.e.n() ? v1 : 0), 0.0f, null, 12, null);
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
        int v = this.a.hashCode();
        int v1 = this.b;
        int v2 = 1;
        if(v1) {
            v1 = 1;
        }
        if(!this.c) {
            v2 = false;
        }
        return (v * 0x1F + v1) * 0x1F + v2;
    }

    @l
    public final ScrollingLayoutModifier i(@l ScrollState scrollState0, boolean z, boolean z1) {
        L.p(scrollState0, "scrollerState");
        return new ScrollingLayoutModifier(scrollState0, z, z1);
    }

    public static ScrollingLayoutModifier j(ScrollingLayoutModifier scrollingLayoutModifier0, ScrollState scrollState0, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            scrollState0 = scrollingLayoutModifier0.a;
        }
        if((v & 2) != 0) {
            z = scrollingLayoutModifier0.b;
        }
        if((v & 4) != 0) {
            z1 = scrollingLayoutModifier0.c;
        }
        return scrollingLayoutModifier0.i(scrollState0, z, z1);
    }

    @l
    public final ScrollState l() {
        return this.a;
    }

    public final boolean m() {
        return this.b;
    }

    public final boolean n() {
        return this.c;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.a + ", isReversed=" + this.b + ", isVertical=" + this.c + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

