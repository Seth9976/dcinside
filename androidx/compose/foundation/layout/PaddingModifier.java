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
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingModifier\n*L\n338#1:437\n339#1:438\n340#1:439\n341#1:440\n*E\n"})
final class PaddingModifier extends InspectorValueInfo implements LayoutModifier {
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final boolean h;

    private PaddingModifier(float f, float f1, float f2, float f3, boolean z, Function1 function10) {
        super(function10);
        this.d = f;
        this.e = f1;
        this.f = f2;
        this.g = f3;
        this.h = z;
        if(f < 0.0f && !Dp.l(f, NaNf) || f1 < 0.0f && !Dp.l(f1, NaNf) || f2 < 0.0f && !Dp.l(f2, NaNf) || f3 < 0.0f && !Dp.l(f3, NaNf)) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public PaddingModifier(float f, float f1, float f2, float f3, boolean z, Function1 function10, int v, w w0) {
        this(((v & 1) == 0 ? f : 0.0f), ((v & 2) == 0 ? f1 : 0.0f), ((v & 4) == 0 ? f2 : 0.0f), ((v & 8) == 0 ? f3 : 0.0f), z, function10, null);
    }

    public PaddingModifier(float f, float f1, float f2, float f3, boolean z, Function1 function10, w w0) {
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
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.d(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.b(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    // 去混淆评级： 低(35)
    @Override
    public boolean equals(@m Object object0) {
        PaddingModifier paddingModifier0 = object0 instanceof PaddingModifier ? ((PaddingModifier)object0) : null;
        return paddingModifier0 == null ? false : Dp.l(this.d, paddingModifier0.d) && Dp.l(this.e, paddingModifier0.e) && Dp.l(this.f, paddingModifier0.f) && Dp.l(this.g, paddingModifier0.g) && this.h == paddingModifier0.h;
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
        int v1 = measureScope0.b1(this.d) + measureScope0.b1(this.f);
        int v2 = measureScope0.b1(this.e) + measureScope0.b1(this.g);
        Placeable placeable0 = measurable0.r1(ConstraintsKt.i(v, -v1, -v2));
        return MeasureScope.-CC.p(measureScope0, ConstraintsKt.g(v, placeable0.N1() + v1), ConstraintsKt.f(v, placeable0.K1() + v2), null, new Function1(placeable0, measureScope0) {
            final PaddingModifier e;
            final Placeable f;
            final MeasureScope g;

            {
                this.e = paddingModifier0;
                this.f = placeable0;
                this.g = measureScope0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                if(this.e.m()) {
                    int v = this.g.b1(this.e.n());
                    int v1 = this.g.b1(this.e.p());
                    PlacementScope.v(placeable$PlacementScope0, this.f, v, v1, 0.0f, 4, null);
                    return;
                }
                int v2 = this.g.b1(this.e.n());
                int v3 = this.g.b1(this.e.p());
                PlacementScope.p(placeable$PlacementScope0, this.f, v2, v3, 0.0f, 4, null);
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
        return (((Dp.n(this.d) * 0x1F + Dp.n(this.e)) * 0x1F + Dp.n(this.f)) * 0x1F + Dp.n(this.g)) * 0x1F + androidx.compose.foundation.c.a(this.h);
    }

    public final float j() {
        return this.g;
    }

    public final float l() {
        return this.f;
    }

    public final boolean m() {
        return this.h;
    }

    public final float n() {
        return this.d;
    }

    public final float p() {
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

