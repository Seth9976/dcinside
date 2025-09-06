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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1024:1\n155#2:1025\n155#2:1026\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n*L\n714#1:1025\n719#1:1026\n*E\n"})
final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final boolean h;

    private SizeModifier(float f, float f1, float f2, float f3, boolean z, Function1 function10) {
        super(function10);
        this.d = f;
        this.e = f1;
        this.f = f2;
        this.g = f3;
        this.h = z;
    }

    // 去混淆评级： 低(40)
    public SizeModifier(float f, float f1, float f2, float f3, boolean z, Function1 function10, int v, w w0) {
        this(((v & 1) == 0 ? f : NaNf), ((v & 2) == 0 ? f1 : NaNf), ((v & 4) == 0 ? f2 : NaNf), ((v & 8) == 0 ? f3 : NaNf), z, function10, null);
    }

    public SizeModifier(float f, float f1, float f2, float f3, boolean z, Function1 function10, w w0) {
        this(f, f1, f2, f3, z, function10);
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
        long v1 = this.j(intrinsicMeasureScope0);
        return Constraints.n(v1) ? Constraints.p(v1) : ConstraintsKt.g(v1, intrinsicMeasurable0.S0(v));
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        long v1 = this.j(intrinsicMeasureScope0);
        return Constraints.n(v1) ? Constraints.p(v1) : ConstraintsKt.g(v1, intrinsicMeasurable0.h1(v));
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof SizeModifier ? Dp.l(this.d, ((SizeModifier)object0).d) && Dp.l(this.e, ((SizeModifier)object0).e) && Dp.l(this.f, ((SizeModifier)object0).f) && Dp.l(this.g, ((SizeModifier)object0).g) && this.h == ((SizeModifier)object0).h : false;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        long v1 = this.j(intrinsicMeasureScope0);
        return Constraints.l(v1) ? Constraints.o(v1) : ConstraintsKt.f(v1, intrinsicMeasurable0.g(v));
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        long v1 = this.j(intrinsicMeasureScope0);
        return Constraints.l(v1) ? Constraints.o(v1) : ConstraintsKt.f(v1, intrinsicMeasurable0.D0(v));
    }

    // 去混淆评级： 低(28)
    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        long v1 = this.j(measureScope0);
        Placeable placeable0 = measurable0.r1((this.h ? ConstraintsKt.e(v, v1) : ConstraintsKt.a((Dp.l(this.d, NaNf) ? s.B(Constraints.r(v), Constraints.p(v1)) : Constraints.r(v1)), (Dp.l(this.f, NaNf) ? s.u(Constraints.p(v), Constraints.r(v1)) : Constraints.p(v1)), (Dp.l(this.e, NaNf) ? s.B(Constraints.q(v), Constraints.o(v1)) : Constraints.q(v1)), (Dp.l(this.g, NaNf) ? s.u(Constraints.o(v), Constraints.q(v1)) : Constraints.o(v1)))));
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
        return (((Dp.n(this.d) * 0x1F + Dp.n(this.e)) * 0x1F + Dp.n(this.f)) * 0x1F + Dp.n(this.g)) * 0x1F;
    }

    private final long j(Density density0) {
        int v3;
        int v = 0;
        int v1 = Dp.l(this.f, NaNf) ? 0x7FFFFFFF : density0.b1(((Dp)s.w(Dp.d(this.f), Dp.d(0.0f))).w());
        int v2 = Dp.l(this.g, NaNf) ? 0x7FFFFFFF : density0.b1(((Dp)s.w(Dp.d(this.g), Dp.d(0.0f))).w());
        if(Dp.l(this.d, NaNf)) {
            v3 = 0;
        }
        else {
            v3 = s.u(s.B(density0.b1(this.d), v1), 0);
            if(v3 == 0x7FFFFFFF) {
                v3 = 0;
            }
        }
        if(!Dp.l(this.e, NaNf)) {
            int v4 = s.u(s.B(density0.b1(this.e), v2), 0);
            if(v4 != 0x7FFFFFFF) {
                v = v4;
            }
        }
        return ConstraintsKt.a(v3, v1, v, v2);
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

