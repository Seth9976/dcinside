package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.c;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,661:1\n69#2:662\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n625#1:662\n*E\n"})
final class SimpleGraphicsLayerModifier extends Node implements LayoutModifierNode {
    private long A;
    private int B;
    @l
    private Function1 C;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private long v;
    @l
    private Shape w;
    private boolean x;
    @m
    private RenderEffect y;
    private long z;

    private SimpleGraphicsLayerModifier(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3) {
        this.l = f;
        this.m = f1;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = f5;
        this.r = f6;
        this.s = f7;
        this.t = f8;
        this.u = f9;
        this.v = v;
        this.w = shape0;
        this.x = z;
        this.y = renderEffect0;
        this.z = v1;
        this.A = v2;
        this.B = v3;
        this.C = new Function1() {
            final SimpleGraphicsLayerModifier e;

            {
                this.e = simpleGraphicsLayerModifier0;
                super(1);
            }

            public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
                L.p(graphicsLayerScope0, "$this$null");
                graphicsLayerScope0.R(this.e.s0());
                graphicsLayerScope0.W(this.e.t0());
                graphicsLayerScope0.j(this.e.j0());
                graphicsLayerScope0.a0(this.e.y0());
                graphicsLayerScope0.n(this.e.z0());
                graphicsLayerScope0.q0(this.e.u0());
                graphicsLayerScope0.x(this.e.p0());
                graphicsLayerScope0.y(this.e.q0());
                graphicsLayerScope0.A(this.e.r0());
                graphicsLayerScope0.w(this.e.l0());
                graphicsLayerScope0.p0(this.e.x0());
                graphicsLayerScope0.I0(this.e.v0());
                graphicsLayerScope0.o0(this.e.m0());
                graphicsLayerScope0.T(this.e.o0());
                graphicsLayerScope0.Z0(this.e.k0());
                graphicsLayerScope0.c1(this.e.w0());
                graphicsLayerScope0.q(this.e.n0());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((GraphicsLayerScope)object0));
                return S0.a;
            }
        };
    }

    public SimpleGraphicsLayerModifier(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3, int v4, w w0) {
        this(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, v1, v2, ((v4 & 0x10000) == 0 ? v3 : 0), null);
    }

    public SimpleGraphicsLayerModifier(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3, w w0) {
        this(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, v1, v2, v3);
    }

    public final void A0() {
        NodeCoordinator nodeCoordinator0 = DelegatableNodeKt.o(this, 2).N2();
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.D3(this.C, true);
        }
    }

    public final void B0(float f) {
        this.n = f;
    }

    public final void C0(long v) {
        this.z = v;
    }

    public final void D0(float f) {
        this.u = f;
    }

    public final void E0(boolean z) {
        this.x = z;
    }

    public final void F0(int v) {
        this.B = v;
    }

    public final void G0(@m RenderEffect renderEffect0) {
        this.y = renderEffect0;
    }

    public final void H0(float f) {
        this.r = f;
    }

    public final void I0(float f) {
        this.s = f;
    }

    public final void J0(float f) {
        this.t = f;
    }

    public final void K0(float f) {
        this.l = f;
    }

    public final void L0(float f) {
        this.m = f;
    }

    public final void M0(float f) {
        this.q = f;
    }

    public final void N0(@l Shape shape0) {
        L.p(shape0, "<set-?>");
        this.w = shape0;
    }

    public final void O0(long v) {
        this.A = v;
    }

    public final void P0(long v) {
        this.v = v;
    }

    public final void Q0(float f) {
        this.o = f;
    }

    public final void R0(float f) {
        this.p = f;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.e(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public void d() {
        c.a(this);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.c(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int f(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.b(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int g(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.d(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        Placeable placeable0 = measurable0.r1(v);
        return MeasureScope.-CC.p(measureScope0, placeable0.N1(), placeable0.K1(), null, new Function1(this) {
            final Placeable e;
            final SimpleGraphicsLayerModifier f;

            {
                this.e = placeable0;
                this.f = simpleGraphicsLayerModifier0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                Function1 function10 = this.f.C;
                PlacementScope.D(placeable$PlacementScope0, this.e, 0, 0, 0.0f, function10, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    public final float j0() {
        return this.n;
    }

    public final long k0() {
        return this.z;
    }

    public final float l0() {
        return this.u;
    }

    public final boolean m0() {
        return this.x;
    }

    public final int n0() {
        return this.B;
    }

    @m
    public final RenderEffect o0() {
        return this.y;
    }

    public final float p0() {
        return this.r;
    }

    public final float q0() {
        return this.s;
    }

    public final float r0() {
        return this.t;
    }

    public final float s0() {
        return this.l;
    }

    public final float t0() {
        return this.m;
    }

    @Override
    @l
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.l + ", scaleY=" + this.m + ", alpha = " + this.n + ", translationX=" + this.o + ", translationY=" + this.p + ", shadowElevation=" + this.q + ", rotationX=" + this.r + ", rotationY=" + this.s + ", rotationZ=" + this.t + ", cameraDistance=" + this.u + ", transformOrigin=" + TransformOrigin.n(this.v) + ", shape=" + this.w + ", clip=" + this.x + ", renderEffect=" + this.y + ", ambientShadowColor=" + Color.L(this.z) + ", spotShadowColor=" + Color.L(this.A) + ", compositingStrategy=" + ("CompositingStrategy(value=" + this.B + ')') + ')';
    }

    public final float u0() {
        return this.q;
    }

    @l
    public final Shape v0() {
        return this.w;
    }

    public final long w0() {
        return this.A;
    }

    public final long x0() {
        return this.v;
    }

    public final float y0() {
        return this.o;
    }

    public final float z0() {
        return this.p;
    }
}

