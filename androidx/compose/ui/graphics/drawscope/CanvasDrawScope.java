package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.a;
import java.util.List;
import kotlin.J;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,804:1\n1#2:805\n*E\n"})
public final class CanvasDrawScope implements DrawScope {
    @b0
    public static final class DrawParams {
        @l
        private Density a;
        @l
        private LayoutDirection b;
        @l
        private Canvas c;
        private long d;

        private DrawParams(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v) {
            this.a = density0;
            this.b = layoutDirection0;
            this.c = canvas0;
            this.d = v;
        }

        public DrawParams(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, int v1, w w0) {
            if((v1 & 1) != 0) {
                density0 = CanvasDrawScopeKt.a;
            }
            if((v1 & 2) != 0) {
                layoutDirection0 = LayoutDirection.a;
            }
            if((v1 & 4) != 0) {
                canvas0 = new EmptyCanvas();
            }
            if((v1 & 8) != 0) {
                v = 0L;
            }
            this(density0, layoutDirection0, canvas0, v, null);
        }

        public DrawParams(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, w w0) {
            this(density0, layoutDirection0, canvas0, v);
        }

        @l
        public final Density a() {
            return this.a;
        }

        @l
        public final LayoutDirection b() {
            return this.b;
        }

        @l
        public final Canvas c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        @l
        public final DrawParams e(@l Density density0, @l LayoutDirection layoutDirection0, @l Canvas canvas0, long v) {
            L.p(density0, "density");
            L.p(layoutDirection0, "layoutDirection");
            L.p(canvas0, "canvas");
            return new DrawParams(density0, layoutDirection0, canvas0, v, null);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof DrawParams)) {
                return false;
            }
            if(!L.g(this.a, ((DrawParams)object0).a)) {
                return false;
            }
            if(this.b != ((DrawParams)object0).b) {
                return false;
            }
            return L.g(this.c, ((DrawParams)object0).c) ? Size.k(this.d, ((DrawParams)object0).d) : false;
        }

        public static DrawParams f(DrawParams canvasDrawScope$DrawParams0, Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                density0 = canvasDrawScope$DrawParams0.a;
            }
            if((v1 & 2) != 0) {
                layoutDirection0 = canvasDrawScope$DrawParams0.b;
            }
            if((v1 & 4) != 0) {
                canvas0 = canvasDrawScope$DrawParams0.c;
            }
            if((v1 & 8) != 0) {
                v = canvasDrawScope$DrawParams0.d;
            }
            return canvasDrawScope$DrawParams0.e(density0, layoutDirection0, canvas0, v);
        }

        @l
        public final Canvas g() {
            return this.c;
        }

        @l
        public final Density h() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + Size.u(this.d);
        }

        @l
        public final LayoutDirection i() {
            return this.b;
        }

        public final long j() {
            return this.d;
        }

        public final void k(@l Canvas canvas0) {
            L.p(canvas0, "<set-?>");
            this.c = canvas0;
        }

        public final void l(@l Density density0) {
            L.p(density0, "<set-?>");
            this.a = density0;
        }

        public final void m(@l LayoutDirection layoutDirection0) {
            L.p(layoutDirection0, "<set-?>");
            this.b = layoutDirection0;
        }

        public final void n(long v) {
            this.d = v;
        }

        @Override
        @l
        public String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + Size.x(this.d) + ')';
        }
    }

    @l
    private final DrawParams a;
    @l
    private final DrawContext b;
    @m
    private Paint c;
    @m
    private Paint d;

    public CanvasDrawScope() {
        this.a = new DrawParams(null, null, null, 0L, 15, null);
        this.b = new DrawContext() {
            @l
            private final DrawTransform a;

            {
                this.a = CanvasDrawScopeKt.c(this);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            @l
            public Canvas a() {
                return this.b.B().g();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public long b() {
                return this.b.B().j();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public void c(long v) {
                this.b.B().n(v);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            @l
            public DrawTransform d() {
                return this.a;
            }
        };
    }

    @l
    public final DrawParams B() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void B0(long v, float f, long v1, float f1, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v2) {
        L.p(drawStyle0, "style");
        this.a.g().E(v1, f, CanvasDrawScope.e(this, v, drawStyle0, f1, colorFilter0, v2, 0, 0x20, null));
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void B1(@l List list0, int v, long v1, float f, int v2, @m PathEffect pathEffect0, float f1, @m ColorFilter colorFilter0, int v3) {
        L.p(list0, "points");
        Paint paint0 = CanvasDrawScope.k(this, v1, f, 4.0f, v2, 0, pathEffect0, f1, colorFilter0, v3, 0, 0x200, null);
        this.a.g().g(v, list0, paint0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float C(int v) {
        return a.e(this, v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void C0(long v, long v1, long v2, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v3) {
        L.p(drawStyle0, "style");
        float f1 = Offset.p(v1);
        float f2 = Offset.r(v1);
        float f3 = Offset.p(v1);
        float f4 = Size.t(v2);
        float f5 = Offset.r(v1);
        float f6 = Size.m(v2);
        Paint paint0 = CanvasDrawScope.e(this, v, drawStyle0, f, colorFilter0, v3, 0, 0x20, null);
        this.a.g().t(f1, f2, f3 + f4, f5 + f6, paint0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float D(float f) {
        return a.d(this, f);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void D1(@l Brush brush0, long v, long v1, float f, int v2, @m PathEffect pathEffect0, float f1, @m ColorFilter colorFilter0, int v3) {
        L.p(brush0, "brush");
        Paint paint0 = CanvasDrawScope.u(this, brush0, f, 4.0f, v2, 0, pathEffect0, f1, colorFilter0, v3, 0, 0x200, null);
        this.a.g().y(v, v1, paint0);
    }

    @b0
    public static void E() {
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void E0(long v, float f, float f1, boolean z, long v1, long v2, float f2, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v3) {
        L.p(drawStyle0, "style");
        float f3 = Offset.p(v1);
        float f4 = Offset.r(v1);
        float f5 = Offset.p(v1);
        float f6 = Size.t(v2);
        float f7 = Offset.r(v1);
        float f8 = Size.m(v2);
        Paint paint0 = CanvasDrawScope.e(this, v, drawStyle0, f2, colorFilter0, v3, 0, 0x20, null);
        this.a.g().l(f3, f4, f5 + f6, f7 + f8, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int E1(long v) {
        return a.a(this, v);
    }

    // 去混淆评级： 低(20)
    private final long H(long v, float f) {
        return f == 1.0f ? v : Color.w(v, Color.A(v) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect H0(DpRect dpRect0) {
        return a.i(this, dpRect0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void H1(@l Brush brush0, float f, long v, float f1, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v1) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        Paint paint0 = CanvasDrawScope.g(this, brush0, drawStyle0, f1, colorFilter0, v1, 0, 0x20, null);
        this.a.g().E(v, f, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long I() {
        return b.b(this);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void I1(@l ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v4, int v5) {
        L.p(imageBitmap0, "image");
        L.p(drawStyle0, "style");
        Paint paint0 = this.f(null, drawStyle0, f, colorFilter0, v4, v5);
        this.a.g().h(imageBitmap0, v, v1, v2, v3, paint0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long J(long v) {
        return a.j(this, v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @l
    public DrawContext J0() {
        return this.b;
    }

    private final Paint K() {
        Paint paint0 = this.c;
        if(paint0 == null) {
            paint0 = AndroidPaint_androidKt.a();
            paint0.p(0);
            this.c = paint0;
        }
        return paint0;
    }

    private final Paint L() {
        Paint paint0 = this.d;
        if(paint0 == null) {
            paint0 = AndroidPaint_androidKt.a();
            paint0.p(1);
            this.d = paint0;
        }
        return paint0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public long M(float f) {
        return a.k(this, f);
    }

    private final Paint P(DrawStyle drawStyle0) {
        if(L.g(drawStyle0, Fill.a)) {
            return this.K();
        }
        if(!(drawStyle0 instanceof Stroke)) {
            throw new J();
        }
        Paint paint0 = this.L();
        if(paint0.r() != ((Stroke)drawStyle0).g()) {
            paint0.q(((Stroke)drawStyle0).g());
        }
        if(!StrokeCap.g(paint0.e(), ((Stroke)drawStyle0).c())) {
            paint0.c(((Stroke)drawStyle0).c());
        }
        if(paint0.k() != ((Stroke)drawStyle0).e()) {
            paint0.n(((Stroke)drawStyle0).e());
        }
        if(!StrokeJoin.g(paint0.h(), ((Stroke)drawStyle0).d())) {
            paint0.f(((Stroke)drawStyle0).d());
        }
        if(!L.g(paint0.w(), ((Stroke)drawStyle0).f())) {
            paint0.v(((Stroke)drawStyle0).f());
        }
        return paint0;
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long b() {
        return b.c(this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int b1(float f) {
        return a.b(this, f);
    }

    private final Paint c(long v, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v1, int v2) {
        Paint paint0 = this.P(drawStyle0);
        long v3 = this.H(v, f);
        if(!Color.y(paint0.a(), v3)) {
            paint0.g(v3);
        }
        if(paint0.m() != null) {
            paint0.y(null);
        }
        if(!L.g(paint0.u(), colorFilter0)) {
            paint0.z(colorFilter0);
        }
        if(!BlendMode.G(paint0.x(), v1)) {
            paint0.t(v1);
        }
        if(!FilterQuality.h(paint0.A(), v2)) {
            paint0.d(v2);
        }
        return paint0;
    }

    // 去混淆评级： 低(20)
    static Paint e(CanvasDrawScope canvasDrawScope0, long v, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v1, int v2, int v3, Object object0) {
        return (v3 & 0x20) == 0 ? canvasDrawScope0.c(v, drawStyle0, f, colorFilter0, v1, v2) : canvasDrawScope0.c(v, drawStyle0, f, colorFilter0, v1, 1);
    }

    private final Paint f(Brush brush0, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v, int v1) {
        Paint paint0 = this.P(drawStyle0);
        if(brush0 != null) {
            brush0.a(this.b(), paint0, f);
        }
        else if(paint0.i() != f) {
            paint0.j(f);
        }
        if(!L.g(paint0.u(), colorFilter0)) {
            paint0.z(colorFilter0);
        }
        if(!BlendMode.G(paint0.x(), v)) {
            paint0.t(v);
        }
        if(!FilterQuality.h(paint0.A(), v1)) {
            paint0.d(v1);
        }
        return paint0;
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void f1(long v, long v1, long v2, long v3, @l DrawStyle drawStyle0, float f, @m ColorFilter colorFilter0, int v4) {
        L.p(drawStyle0, "style");
        float f1 = Offset.p(v1);
        float f2 = Offset.r(v1);
        float f3 = Offset.p(v1);
        float f4 = Size.t(v2);
        float f5 = Offset.r(v1);
        float f6 = Size.m(v2);
        Paint paint0 = CanvasDrawScope.e(this, v, drawStyle0, f, colorFilter0, v4, 0, 0x20, null);
        this.a.g().F(f1, f2, f3 + f4, f5 + f6, CornerRadius.m(v3), CornerRadius.o(v3), paint0);
    }

    static Paint g(CanvasDrawScope canvasDrawScope0, Brush brush0, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v, int v1, int v2, Object object0) {
        if((v2 & 0x20) != 0) {
            v1 = 1;
        }
        return canvasDrawScope0.f(brush0, drawStyle0, f, colorFilter0, v, v1);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float g1(long v) {
        return a.g(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.h().getDensity();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.a.i();
    }

    private final Paint h(long v, float f, float f1, int v1, int v2, PathEffect pathEffect0, float f2, ColorFilter colorFilter0, int v3, int v4) {
        Paint paint0 = this.L();
        long v5 = this.H(v, f2);
        if(!Color.y(paint0.a(), v5)) {
            paint0.g(v5);
        }
        if(paint0.m() != null) {
            paint0.y(null);
        }
        if(!L.g(paint0.u(), colorFilter0)) {
            paint0.z(colorFilter0);
        }
        if(!BlendMode.G(paint0.x(), v3)) {
            paint0.t(v3);
        }
        if(paint0.r() != f) {
            paint0.q(f);
        }
        if(paint0.k() != f1) {
            paint0.n(f1);
        }
        if(!StrokeCap.g(paint0.e(), v1)) {
            paint0.c(v1);
        }
        if(!StrokeJoin.g(paint0.h(), v2)) {
            paint0.f(v2);
        }
        if(!L.g(paint0.w(), pathEffect0)) {
            paint0.v(pathEffect0);
        }
        if(!FilterQuality.h(paint0.A(), v4)) {
            paint0.d(v4);
        }
        return paint0;
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void h0(@l List list0, int v, @l Brush brush0, float f, int v1, @m PathEffect pathEffect0, float f1, @m ColorFilter colorFilter0, int v2) {
        L.p(list0, "points");
        L.p(brush0, "brush");
        Paint paint0 = CanvasDrawScope.u(this, brush0, f, 4.0f, v1, 0, pathEffect0, f1, colorFilter0, v2, 0, 0x200, null);
        this.a.g().g(v, list0, paint0);
    }

    // 去混淆评级： 低(20)
    static Paint k(CanvasDrawScope canvasDrawScope0, long v, float f, float f1, int v1, int v2, PathEffect pathEffect0, float f2, ColorFilter colorFilter0, int v3, int v4, int v5, Object object0) {
        return (v5 & 0x200) == 0 ? canvasDrawScope0.h(v, f, f1, v1, v2, pathEffect0, f2, colorFilter0, v3, v4) : canvasDrawScope0.h(v, f, f1, v1, v2, pathEffect0, f2, colorFilter0, v3, 1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @k(level = kotlin.m.c, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @c0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public void k1(ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4) {
        L.p(imageBitmap0, "image");
        L.p(drawStyle0, "style");
        Paint paint0 = CanvasDrawScope.g(this, null, drawStyle0, f, colorFilter0, v4, 0, 0x20, null);
        this.a.g().h(imageBitmap0, v, v1, v2, v3, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void l0(@l Path path0, @l Brush brush0, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v) {
        L.p(path0, "path");
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        Paint paint0 = CanvasDrawScope.g(this, brush0, drawStyle0, f, colorFilter0, v, 0, 0x20, null);
        this.a.g().D(path0, paint0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long m(long v) {
        return a.f(this, v);
    }

    private final Paint o(Brush brush0, float f, float f1, int v, int v1, PathEffect pathEffect0, float f2, ColorFilter colorFilter0, int v2, int v3) {
        Paint paint0 = this.L();
        if(brush0 != null) {
            brush0.a(this.b(), paint0, f2);
        }
        else if(paint0.i() != f2) {
            paint0.j(f2);
        }
        if(!L.g(paint0.u(), colorFilter0)) {
            paint0.z(colorFilter0);
        }
        if(!BlendMode.G(paint0.x(), v2)) {
            paint0.t(v2);
        }
        if(paint0.r() != f) {
            paint0.q(f);
        }
        if(paint0.k() != f1) {
            paint0.n(f1);
        }
        if(!StrokeCap.g(paint0.e(), v)) {
            paint0.c(v);
        }
        if(!StrokeJoin.g(paint0.h(), v1)) {
            paint0.f(v1);
        }
        if(!L.g(paint0.w(), pathEffect0)) {
            paint0.v(pathEffect0);
        }
        if(!FilterQuality.h(paint0.A(), v3)) {
            paint0.d(v3);
        }
        return paint0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float p(long v) {
        return a.c(this, v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void p1(long v, long v1, long v2, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v3) {
        L.p(drawStyle0, "style");
        float f1 = Offset.p(v1);
        float f2 = Offset.r(v1);
        float f3 = Offset.p(v1);
        float f4 = Size.t(v2);
        float f5 = Offset.r(v1);
        float f6 = Size.m(v2);
        Paint paint0 = CanvasDrawScope.e(this, v, drawStyle0, f, colorFilter0, v3, 0, 0x20, null);
        this.a.g().s(f1, f2, f3 + f4, f5 + f6, paint0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long r(int v) {
        return a.m(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long s(float f) {
        return a.l(this, f);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void s0(@l ImageBitmap imageBitmap0, long v, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v1) {
        L.p(imageBitmap0, "image");
        L.p(drawStyle0, "style");
        Paint paint0 = CanvasDrawScope.g(this, null, drawStyle0, f, colorFilter0, v1, 0, 0x20, null);
        this.a.g().u(imageBitmap0, v, paint0);
    }

    // 去混淆评级： 低(20)
    static Paint u(CanvasDrawScope canvasDrawScope0, Brush brush0, float f, float f1, int v, int v1, PathEffect pathEffect0, float f2, ColorFilter colorFilter0, int v2, int v3, int v4, Object object0) {
        return (v4 & 0x200) == 0 ? canvasDrawScope0.o(brush0, f, f1, v, v1, pathEffect0, f2, colorFilter0, v2, v3) : canvasDrawScope0.o(brush0, f, f1, v, v1, pathEffect0, f2, colorFilter0, v2, 1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void u0(@l Brush brush0, long v, long v1, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v2) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        float f1 = Offset.p(v);
        float f2 = Offset.r(v);
        float f3 = Offset.p(v);
        float f4 = Size.t(v1);
        float f5 = Offset.r(v);
        float f6 = Size.m(v1);
        Paint paint0 = CanvasDrawScope.g(this, brush0, drawStyle0, f, colorFilter0, v2, 0, 0x20, null);
        this.a.g().s(f1, f2, f3 + f4, f5 + f6, paint0);
    }

    public final void v(@l Density density0, @l LayoutDirection layoutDirection0, @l Canvas canvas0, long v, @l Function1 function10) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        L.p(canvas0, "canvas");
        L.p(function10, "block");
        DrawParams canvasDrawScope$DrawParams0 = this.B();
        DrawParams canvasDrawScope$DrawParams1 = this.B();
        canvasDrawScope$DrawParams1.l(density0);
        canvasDrawScope$DrawParams1.m(layoutDirection0);
        canvasDrawScope$DrawParams1.k(canvas0);
        canvasDrawScope$DrawParams1.n(v);
        canvas0.f();
        function10.invoke(this);
        canvas0.v();
        DrawParams canvasDrawScope$DrawParams2 = this.B();
        canvasDrawScope$DrawParams2.l(canvasDrawScope$DrawParams0.a());
        canvasDrawScope$DrawParams2.m(canvasDrawScope$DrawParams0.b());
        canvasDrawScope$DrawParams2.k(canvasDrawScope$DrawParams0.c());
        canvasDrawScope$DrawParams2.n(canvasDrawScope$DrawParams0.d());
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void v0(long v, long v1, long v2, float f, int v3, @m PathEffect pathEffect0, float f1, @m ColorFilter colorFilter0, int v4) {
        Paint paint0 = CanvasDrawScope.k(this, v, f, 4.0f, v3, 0, pathEffect0, f1, colorFilter0, v4, 0, 0x200, null);
        this.a.g().y(v1, v2, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void v1(@l Brush brush0, long v, long v1, long v2, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v3) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        float f1 = Offset.p(v);
        float f2 = Offset.r(v);
        float f3 = Offset.p(v);
        float f4 = Size.t(v1);
        float f5 = Offset.r(v);
        float f6 = Size.m(v1);
        Paint paint0 = CanvasDrawScope.g(this, brush0, drawStyle0, f, colorFilter0, v3, 0, 0x20, null);
        this.a.g().F(f1, f2, f3 + f4, f5 + f6, CornerRadius.m(v2), CornerRadius.o(v2), paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void w0(@l Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v2) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        float f3 = Offset.p(v);
        float f4 = Offset.r(v);
        float f5 = Offset.p(v);
        float f6 = Size.t(v1);
        float f7 = Offset.r(v);
        float f8 = Size.m(v1);
        Paint paint0 = CanvasDrawScope.g(this, brush0, drawStyle0, f2, colorFilter0, v2, 0, 0x20, null);
        this.a.g().l(f3, f4, f5 + f6, f7 + f8, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.a.h().w1();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void x0(@l Path path0, long v, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v1) {
        L.p(path0, "path");
        L.p(drawStyle0, "style");
        Paint paint0 = CanvasDrawScope.e(this, v, drawStyle0, f, colorFilter0, v1, 0, 0x20, null);
        this.a.g().D(path0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void x1(@l Brush brush0, long v, long v1, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v2) {
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        float f1 = Offset.p(v);
        float f2 = Offset.r(v);
        float f3 = Offset.p(v);
        float f4 = Size.t(v1);
        float f5 = Offset.r(v);
        float f6 = Size.m(v1);
        Paint paint0 = CanvasDrawScope.g(this, brush0, drawStyle0, f, colorFilter0, v2, 0, 0x20, null);
        this.a.g().t(f1, f2, f3 + f4, f5 + f6, paint0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float y1(float f) {
        return a.h(this, f);
    }
}

