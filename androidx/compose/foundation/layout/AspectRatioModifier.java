package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.foundation.c;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float d;
    private final boolean e;

    public AspectRatioModifier(float f, boolean z, @l Function1 function10) {
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = f;
        this.e = z;
        if(f <= 0.0f) {
            throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
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
    public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return v == 0x7FFFFFFF ? intrinsicMeasurable0.S0(0x7FFFFFFF) : kotlin.math.b.L0(((float)v) * this.d);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return v == 0x7FFFFFFF ? intrinsicMeasurable0.h1(0x7FFFFFFF) : kotlin.math.b.L0(((float)v) * this.d);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier0 = object0 instanceof AspectRatioModifier ? ((AspectRatioModifier)object0) : null;
        return aspectRatioModifier0 == null ? false : this.d == aspectRatioModifier0.d && this.e == ((AspectRatioModifier)object0).e;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return v == 0x7FFFFFFF ? intrinsicMeasurable0.g(0x7FFFFFFF) : kotlin.math.b.L0(((float)v) / this.d);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return v == 0x7FFFFFFF ? intrinsicMeasurable0.D0(0x7FFFFFFF) : kotlin.math.b.L0(((float)v) / this.d);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        long v1 = this.j(v);
        if(!IntSize.h(v1, 0L)) {
            v = Constraints.b.c(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)));
        }
        Placeable placeable0 = measurable0.r1(v);
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
        return Float.floatToIntBits(this.d) * 0x1F + c.a(this.e);
    }

    private final long j(long v) {
        if(!this.e) {
            long v1 = AspectRatioModifier.r(this, v, false, 1, null);
            if(!IntSize.h(v1, 0L)) {
                return v1;
            }
            long v2 = AspectRatioModifier.p(this, v, false, 1, null);
            if(!IntSize.h(v2, 0L)) {
                return v2;
            }
            long v3 = AspectRatioModifier.x(this, v, false, 1, null);
            if(!IntSize.h(v3, 0L)) {
                return v3;
            }
            long v4 = AspectRatioModifier.t(this, v, false, 1, null);
            if(!IntSize.h(v4, 0L)) {
                return v4;
            }
            long v5 = this.q(v, false);
            if(!IntSize.h(v5, 0L)) {
                return v5;
            }
            long v6 = this.n(v, false);
            if(!IntSize.h(v6, 0L)) {
                return v6;
            }
            long v7 = this.w(v, false);
            if(!IntSize.h(v7, 0L)) {
                return v7;
            }
            long v8 = this.s(v, false);
            return IntSize.h(v8, 0L) ? 0L : v8;
        }
        long v9 = AspectRatioModifier.p(this, v, false, 1, null);
        if(!IntSize.h(v9, 0L)) {
            return v9;
        }
        long v10 = AspectRatioModifier.r(this, v, false, 1, null);
        if(!IntSize.h(v10, 0L)) {
            return v10;
        }
        long v11 = AspectRatioModifier.t(this, v, false, 1, null);
        if(!IntSize.h(v11, 0L)) {
            return v11;
        }
        long v12 = AspectRatioModifier.x(this, v, false, 1, null);
        if(!IntSize.h(v12, 0L)) {
            return v12;
        }
        long v13 = this.n(v, false);
        if(!IntSize.h(v13, 0L)) {
            return v13;
        }
        long v14 = this.q(v, false);
        if(!IntSize.h(v14, 0L)) {
            return v14;
        }
        long v15 = this.s(v, false);
        if(!IntSize.h(v15, 0L)) {
            return v15;
        }
        long v16 = this.w(v, false);
        return IntSize.h(v16, 0L) ? 0L : v16;
    }

    public final float l() {
        return this.d;
    }

    public final boolean m() {
        return this.e;
    }

    private final long n(long v, boolean z) {
        int v1 = Constraints.o(v);
        if(v1 != 0x7FFFFFFF) {
            int v2 = kotlin.math.b.L0(((float)v1) * this.d);
            if(v2 > 0) {
                long v3 = IntSizeKt.a(v2, v1);
                return z && !ConstraintsKt.h(v, v3) ? 0L : v3;
            }
        }
        return 0L;
    }

    static long p(AspectRatioModifier aspectRatioModifier0, long v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier0.n(v, z);
    }

    private final long q(long v, boolean z) {
        int v1 = Constraints.p(v);
        if(v1 != 0x7FFFFFFF) {
            int v2 = kotlin.math.b.L0(((float)v1) / this.d);
            if(v2 > 0) {
                long v3 = IntSizeKt.a(v1, v2);
                return z && !ConstraintsKt.h(v, v3) ? 0L : v3;
            }
        }
        return 0L;
    }

    static long r(AspectRatioModifier aspectRatioModifier0, long v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier0.q(v, z);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    private final long s(long v, boolean z) {
        int v1 = Constraints.q(v);
        int v2 = kotlin.math.b.L0(((float)v1) * this.d);
        if(v2 > 0) {
            long v3 = IntSizeKt.a(v2, v1);
            return z && !ConstraintsKt.h(v, v3) ? 0L : v3;
        }
        return 0L;
    }

    static long t(AspectRatioModifier aspectRatioModifier0, long v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier0.s(v, z);
    }

    @Override
    @l
    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.d + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }

    private final long w(long v, boolean z) {
        int v1 = Constraints.r(v);
        int v2 = kotlin.math.b.L0(((float)v1) / this.d);
        if(v2 > 0) {
            long v3 = IntSizeKt.a(v1, v2);
            return z && !ConstraintsKt.h(v, v3) ? 0L : v3;
        }
        return 0L;
    }

    static long x(AspectRatioModifier aspectRatioModifier0, long v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier0.w(v, z);
    }
}

