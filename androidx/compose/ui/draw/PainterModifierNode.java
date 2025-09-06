package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.c;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,366:1\n152#2:367\n120#3,4:368\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n*L\n170#1:367\n345#1:368,4\n*E\n"})
final class PainterModifierNode extends Node implements DrawModifierNode, LayoutModifierNode {
    @l
    private Painter l;
    private boolean m;
    @l
    private Alignment n;
    @l
    private ContentScale o;
    private float p;
    @m
    private ColorFilter q;

    public PainterModifierNode(@l Painter painter0, boolean z, @l Alignment alignment0, @l ContentScale contentScale0, float f, @m ColorFilter colorFilter0) {
        L.p(painter0, "painter");
        L.p(alignment0, "alignment");
        L.p(contentScale0, "contentScale");
        super();
        this.l = painter0;
        this.m = z;
        this.n = alignment0;
        this.o = contentScale0;
        this.p = f;
        this.q = colorFilter0;
    }

    public PainterModifierNode(Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, w w0) {
        if((v & 4) != 0) {
            alignment0 = Alignment.a.i();
        }
        if((v & 8) != 0) {
            contentScale0 = ContentScale.a.k();
        }
        if((v & 0x20) != 0) {
            colorFilter0 = null;
        }
        this(painter0, z, alignment0, contentScale0, ((v & 16) == 0 ? f : 1.0f), colorFilter0);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return this.p0() ? Math.max(Constraints.r(this.s0(ConstraintsKt.b(0, 0, 0, v, 7, null))), intrinsicMeasurable0.S0(v)) : intrinsicMeasurable0.S0(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public void d() {
        c.a(this);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return this.p0() ? Math.max(Constraints.r(this.s0(ConstraintsKt.b(0, 0, 0, v, 7, null))), intrinsicMeasurable0.h1(v)) : intrinsicMeasurable0.h1(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int f(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return this.p0() ? Math.max(Constraints.q(this.s0(ConstraintsKt.b(0, v, 0, 0, 13, null))), intrinsicMeasurable0.g(v)) : intrinsicMeasurable0.g(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int g(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return this.p0() ? Math.max(Constraints.q(this.s0(ConstraintsKt.b(0, v, 0, 0, 13, null))), intrinsicMeasurable0.D0(v)) : intrinsicMeasurable0.D0(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        Placeable placeable0 = measurable0.r1(this.s0(v));
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

    private final long i0(long v) {
        if(this.p0()) {
            long v1 = SizeKt.a((this.r0(this.l.i()) ? Size.t(this.l.i()) : Size.t(v)), (this.q0(this.l.i()) ? Size.m(this.l.i()) : Size.m(v)));
            return Size.t(v) != 0.0f && Size.m(v) != 0.0f ? ScaleFactorKt.k(v1, this.o.a(v1, v)) : 0L;
        }
        return v;
    }

    @l
    public final Alignment j0() {
        return this.n;
    }

    public final float k0() {
        return this.p;
    }

    @m
    public final ColorFilter l0() {
        return this.q;
    }

    @l
    public final ContentScale m0() {
        return this.o;
    }

    @l
    public final Painter n0() {
        return this.l;
    }

    public final boolean o0() {
        return this.m;
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void p() {
    }

    // 去混淆评级： 低(30)
    private final boolean p0() {
        return this.m && this.l.i() != 0x7FC000007FC00000L;
    }

    private final boolean q0(long v) {
        if(!Size.k(v, 0x7FC000007FC00000L)) {
            float f = Size.m(v);
            return !Float.isInfinite(f) && !Float.isNaN(f);
        }
        return false;
    }

    private final boolean r0(long v) {
        if(!Size.k(v, 0x7FC000007FC00000L)) {
            float f = Size.t(v);
            return !Float.isInfinite(f) && !Float.isNaN(f);
        }
        return false;
    }

    private final long s0(long v) {
        boolean z = false;
        boolean z1 = Constraints.j(v) && Constraints.i(v);
        if(Constraints.n(v) && Constraints.l(v)) {
            z = true;
        }
        if(!this.p0() && z1 || z) {
            return Constraints.e(v, Constraints.p(v), 0, Constraints.o(v), 0, 10, null);
        }
        long v1 = this.l.i();
        int v2 = this.r0(v1) ? b.L0(Size.t(v1)) : Constraints.r(v);
        int v3 = this.q0(v1) ? b.L0(Size.m(v1)) : Constraints.q(v);
        long v4 = this.i0(SizeKt.a(ConstraintsKt.g(v, v2), ConstraintsKt.f(v, v3)));
        return Constraints.e(v, ConstraintsKt.g(v, b.L0(Size.t(v4))), 0, ConstraintsKt.f(v, b.L0(Size.m(v4))), 0, 10, null);
    }

    public final void t0(@l Alignment alignment0) {
        L.p(alignment0, "<set-?>");
        this.n = alignment0;
    }

    @Override
    @l
    public String toString() {
        return "PainterModifier(painter=" + this.l + ", sizeToIntrinsics=" + this.m + ", alignment=" + this.n + ", alpha=" + this.p + ", colorFilter=" + this.q + ')';
    }

    public final void u0(float f) {
        this.p = f;
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void v(@l ContentDrawScope contentDrawScope0) {
        L.p(contentDrawScope0, "<this>");
        long v = this.l.i();
        long v1 = SizeKt.a((this.r0(v) ? Size.t(v) : Size.t(contentDrawScope0.b())), (this.q0(v) ? Size.m(v) : Size.m(contentDrawScope0.b())));
        long v2 = Size.t(contentDrawScope0.b()) != 0.0f && Size.m(contentDrawScope0.b()) != 0.0f ? ScaleFactorKt.k(v1, this.o.a(v1, contentDrawScope0.b())) : 0L;
        long v3 = this.n.a(IntSizeKt.a(b.L0(Size.t(v2)), b.L0(Size.m(v2))), IntSizeKt.a(b.L0(Size.t(contentDrawScope0.b())), b.L0(Size.m(contentDrawScope0.b()))), contentDrawScope0.getLayoutDirection());
        float f = (float)(((int)(v3 >> 0x20)));
        float f1 = (float)(((int)(v3 & 0xFFFFFFFFL)));
        contentDrawScope0.J0().d().c(f, f1);
        this.l.g(contentDrawScope0, v2, this.p, this.q);
        contentDrawScope0.J0().d().c(-f, -f1);
        contentDrawScope0.Q0();
    }

    public final void v0(@m ColorFilter colorFilter0) {
        this.q = colorFilter0;
    }

    public final void w0(@l ContentScale contentScale0) {
        L.p(contentScale0, "<set-?>");
        this.o = contentScale0;
    }

    public final void x0(@l Painter painter0) {
        L.p(painter0, "<set-?>");
        this.l = painter0;
    }

    public final void y0(boolean z) {
        this.m = z;
    }
}

