package androidx.compose.ui.node;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,114:1\n245#2:115\n71#3:116\n71#3:117\n558#4,17:118\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:115\n59#1:116\n71#1:117\n85#1:118,17\n*E\n"})
public final class LayoutNodeDrawScope implements ContentDrawScope, DrawScope {
    @l
    private final CanvasDrawScope a;
    @m
    private DrawModifierNode b;

    public LayoutNodeDrawScope() {
        this(null, 1, null);
    }

    public LayoutNodeDrawScope(@l CanvasDrawScope canvasDrawScope0) {
        L.p(canvasDrawScope0, "canvasDrawScope");
        super();
        this.a = canvasDrawScope0;
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope0, int v, w w0) {
        if((v & 1) != 0) {
            canvasDrawScope0 = new CanvasDrawScope();
        }
        this(canvasDrawScope0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void B0(long v, float f, long v1, float f1, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v2) {
        L.p(drawStyle0, "style");
        this.a.B0(v, f, v1, f1, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void B1(@l List list0, int v, long v1, float f, int v2, @m PathEffect pathEffect0, float f1, @m ColorFilter colorFilter0, int v3) {
        L.p(list0, "points");
        this.a.B1(list0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float C(int v) {
        return this.a.C(v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void C0(long v, long v1, long v2, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v3) {
        L.p(drawStyle0, "style");
        this.a.C0(v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float D(float f) {
        return this.a.D(f);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void D1(@l Brush brush0, long v, long v1, float f, int v2, @m PathEffect pathEffect0, float f1, @m ColorFilter colorFilter0, int v3) {
        L.p(brush0, "brush");
        this.a.D1(brush0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void E0(long v, float f, float f1, boolean z, long v1, long v2, float f2, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v3) {
        L.p(drawStyle0, "style");
        this.a.E0(v, f, f1, z, v1, v2, f2, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int E1(long v) {
        return this.a.E1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect H0(@l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return this.a.H0(dpRect0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void H1(@l Brush brush0, float f, long v, float f1, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v1) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        this.a.H1(brush0, f, v, f1, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long I() {
        return this.a.I();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void I1(@l ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v4, int v5) {
        L.p(imageBitmap0, "image");
        L.p(drawStyle0, "style");
        this.a.I1(imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long J(long v) {
        return this.a.J(v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @l
    public DrawContext J0() {
        return this.a.J0();
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long M(float f) {
        return this.a.M(f);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void Q0() {
        Canvas canvas0 = this.J0().a();
        DrawModifierNode drawModifierNode0 = this.b;
        L.m(drawModifierNode0);
        DrawModifierNode drawModifierNode1 = LayoutNodeDrawScopeKt.b(drawModifierNode0);
        if(drawModifierNode1 != null) {
            this.e(drawModifierNode1, canvas0);
            return;
        }
        NodeCoordinator nodeCoordinator0 = DelegatableNodeKt.o(drawModifierNode0, 4);
        if(nodeCoordinator0.M2() == drawModifierNode0) {
            nodeCoordinator0 = nodeCoordinator0.N2();
            L.m(nodeCoordinator0);
        }
        nodeCoordinator0.l3(canvas0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long b() {
        return this.a.b();
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int b1(float f) {
        return this.a.b1(f);
    }

    public final void c(@l Canvas canvas0, long v, @l NodeCoordinator nodeCoordinator0, @l DrawModifierNode drawModifierNode0) {
        L.p(canvas0, "canvas");
        L.p(nodeCoordinator0, "coordinator");
        L.p(drawModifierNode0, "drawNode");
        DrawModifierNode drawModifierNode1 = this.b;
        this.b = drawModifierNode0;
        LayoutDirection layoutDirection0 = nodeCoordinator0.getLayoutDirection();
        DrawParams canvasDrawScope$DrawParams0 = this.a.B();
        DrawParams canvasDrawScope$DrawParams1 = this.a.B();
        canvasDrawScope$DrawParams1.l(nodeCoordinator0);
        canvasDrawScope$DrawParams1.m(layoutDirection0);
        canvasDrawScope$DrawParams1.k(canvas0);
        canvasDrawScope$DrawParams1.n(v);
        canvas0.f();
        drawModifierNode0.v(this);
        canvas0.v();
        DrawParams canvasDrawScope$DrawParams2 = this.a.B();
        canvasDrawScope$DrawParams2.l(canvasDrawScope$DrawParams0.a());
        canvasDrawScope$DrawParams2.m(canvasDrawScope$DrawParams0.b());
        canvasDrawScope$DrawParams2.k(canvasDrawScope$DrawParams0.c());
        canvasDrawScope$DrawParams2.n(canvasDrawScope$DrawParams0.d());
        this.b = drawModifierNode1;
    }

    public final void e(@l DrawModifierNode drawModifierNode0, @l Canvas canvas0) {
        L.p(drawModifierNode0, "<this>");
        L.p(canvas0, "canvas");
        NodeCoordinator nodeCoordinator0 = DelegatableNodeKt.o(drawModifierNode0, 4);
        long v = IntSizeKt.f(nodeCoordinator0.a());
        nodeCoordinator0.M0().q0().c(canvas0, v, nodeCoordinator0, drawModifierNode0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void f1(long v, long v1, long v2, long v3, @l DrawStyle drawStyle0, float f, @m ColorFilter colorFilter0, int v4) {
        L.p(drawStyle0, "style");
        this.a.f1(v, v1, v2, v3, drawStyle0, f, colorFilter0, v4);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float g1(long v) {
        return this.a.g1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void h0(@l List list0, int v, @l Brush brush0, float f, int v1, @m PathEffect pathEffect0, float f1, @m ColorFilter colorFilter0, int v2) {
        L.p(list0, "points");
        L.p(brush0, "brush");
        this.a.h0(list0, v, brush0, f, v1, pathEffect0, f1, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @k(level = kotlin.m.c, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @c0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public void k1(ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4) {
        L.p(imageBitmap0, "image");
        L.p(drawStyle0, "style");
        this.a.k1(imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void l0(@l Path path0, @l Brush brush0, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v) {
        L.p(path0, "path");
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        this.a.l0(path0, brush0, f, drawStyle0, colorFilter0, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long m(long v) {
        return this.a.m(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float p(long v) {
        return this.a.p(v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void p1(long v, long v1, long v2, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v3) {
        L.p(drawStyle0, "style");
        this.a.p1(v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long r(int v) {
        return this.a.r(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long s(float f) {
        return this.a.s(f);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void s0(@l ImageBitmap imageBitmap0, long v, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v1) {
        L.p(imageBitmap0, "image");
        L.p(drawStyle0, "style");
        this.a.s0(imageBitmap0, v, f, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void u0(@l Brush brush0, long v, long v1, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v2) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        this.a.u0(brush0, v, v1, f, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void v0(long v, long v1, long v2, float f, int v3, @m PathEffect pathEffect0, float f1, @m ColorFilter colorFilter0, int v4) {
        this.a.v0(v, v1, v2, f, v3, pathEffect0, f1, colorFilter0, v4);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void v1(@l Brush brush0, long v, long v1, long v2, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v3) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        this.a.v1(brush0, v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void w0(@l Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v2) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        this.a.w0(brush0, f, f1, z, v, v1, f2, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.a.w1();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void x0(@l Path path0, long v, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v1) {
        L.p(path0, "path");
        L.p(drawStyle0, "style");
        this.a.x0(path0, v, f, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void x1(@l Brush brush0, long v, long v1, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v2) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        this.a.x1(brush0, v, v1, f, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float y1(float f) {
        return this.a.y1(f);
    }
}

