package androidx.compose.foundation;

import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter.Companion;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 5 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n135#2:460\n1#3:461\n1#3:487\n181#4,25:462\n206#4,4:488\n215#4,6:501\n221#4:528\n222#4,2:537\n558#5,9:492\n567#5,8:529\n120#6,2:507\n173#6,6:509\n261#6,11:515\n122#6,2:526\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n149#1:460\n290#1:487\n290#1:462,25\n290#1:488,4\n290#1:501,6\n290#1:528\n290#1:537,2\n290#1:492,9\n290#1:529,8\n296#1:507,2\n304#1:509,6\n304#1:515,11\n296#1:526,2\n*E\n"})
public final class BorderKt {
    @l
    public static final Modifier f(@l Modifier modifier0, @l BorderStroke borderStroke0, @l Shape shape0) {
        L.p(modifier0, "<this>");
        L.p(borderStroke0, "border");
        L.p(shape0, "shape");
        return BorderKt.j(modifier0, borderStroke0.d(), borderStroke0.c(), shape0);
    }

    public static Modifier g(Modifier modifier0, BorderStroke borderStroke0, Shape shape0, int v, Object object0) {
        if((v & 2) != 0) {
            shape0 = RectangleShapeKt.a();
        }
        return BorderKt.f(modifier0, borderStroke0, shape0);
    }

    @l
    public static final Modifier h(@l Modifier modifier0, float f, long v, @l Shape shape0) {
        L.p(modifier0, "$this$border");
        L.p(shape0, "shape");
        return BorderKt.j(modifier0, f, new SolidColor(v, null), shape0);
    }

    public static Modifier i(Modifier modifier0, float f, long v, Shape shape0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            shape0 = RectangleShapeKt.a();
        }
        return BorderKt.h(modifier0, f, v, shape0);
    }

    @l
    public static final Modifier j(@l Modifier modifier0, float f, @l Brush brush0, @l Shape shape0) {
        L.p(modifier0, "$this$border");
        L.p(brush0, "brush");
        L.p(shape0, "shape");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(f, shape0, brush0) {
            final float e;
            final Shape f;
            final Brush g;

            {
                this.e = f;
                this.f = shape0;
                this.g = brush0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xA6B4FA6F);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xA6B4FA6F, v, -1, "androidx.compose.foundation.border.<anonymous> (Border.kt:93)");
                }
                composer0.V(0xE2A708A4);
                Ref ref0 = composer0.W();
                if(ref0 == Composer.a.a()) {
                    ref0 = new Ref();
                    composer0.O(ref0);
                }
                composer0.g0();
                androidx.compose.foundation.BorderKt.border.2.1 borderKt$border$2$10 = new Function1(this.f, ref0, this.g) {
                    final float e;
                    final Shape f;
                    final Ref g;
                    final Brush h;

                    {
                        this.e = f;
                        this.f = shape0;
                        this.g = ref0;
                        this.h = brush0;
                        super(1);
                    }

                    @l
                    public final DrawResult a(@l CacheDrawScope cacheDrawScope0) {
                        L.p(cacheDrawScope0, "$this$drawWithCache");
                        if(cacheDrawScope0.y1(this.e) >= 0.0f && Size.q(cacheDrawScope0.b()) > 0.0f) {
                            float f = Math.min((Dp.l(this.e, 0.0f) ? 1.0f : ((float)Math.ceil(cacheDrawScope0.y1(this.e)))), ((float)Math.ceil(Size.q(cacheDrawScope0.b()) / 2.0f)));
                            long v = OffsetKt.a(f / 2.0f, f / 2.0f);
                            long v1 = SizeKt.a(Size.t(cacheDrawScope0.b()) - f, Size.m(cacheDrawScope0.b()) - f);
                            boolean z = 2.0f * f > Size.q(cacheDrawScope0.b());
                            long v2 = cacheDrawScope0.b();
                            LayoutDirection layoutDirection0 = cacheDrawScope0.getLayoutDirection();
                            Outline outline0 = this.f.a(v2, layoutDirection0, cacheDrawScope0);
                            if(outline0 instanceof Generic) {
                                return BorderKt.n(cacheDrawScope0, this.g, this.h, ((Generic)outline0), z, f);
                            }
                            if(outline0 instanceof Rounded) {
                                return BorderKt.p(cacheDrawScope0, this.g, this.h, ((Rounded)outline0), v, v1, z, f);
                            }
                            if(!(outline0 instanceof Rectangle)) {
                                throw new J();
                            }
                            return BorderKt.o(cacheDrawScope0, this.h, v, v1, z, f);
                        }
                        return BorderKt.m(cacheDrawScope0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((CacheDrawScope)object0));
                    }
                };
                Modifier modifier1 = modifier0.r0(DrawModifierKt.b(Modifier.m0, borderKt$border$2$10));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n1#1,170:1\n150#2,10:171\n*E\n"})
        public final class androidx.compose.foundation.BorderKt.border-ziNgDLE..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final Brush f;
            final Shape g;

            public androidx.compose.foundation.BorderKt.border-ziNgDLE..inlined.debugInspectorInfo.1(float f, Brush brush0, Shape shape0) {
                this.e = f;
                this.f = brush0;
                this.g = shape0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("border");
                inspectorInfo0.b().c("width", Dp.d(this.e));
                if(this.f instanceof SolidColor) {
                    inspectorInfo0.b().c("color", Color.n(((SolidColor)this.f).c()));
                    inspectorInfo0.e(Color.n(((SolidColor)this.f).c()));
                }
                else {
                    inspectorInfo0.b().c("brush", this.f);
                }
                inspectorInfo0.b().c("shape", this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    private static final RoundRect k(float f, RoundRect roundRect0) {
        return new RoundRect(f, f, roundRect0.v() - f, roundRect0.p() - f, BorderKt.r(roundRect0.t(), f), BorderKt.r(roundRect0.u(), f), BorderKt.r(roundRect0.o(), f), BorderKt.r(roundRect0.n(), f), null);
    }

    private static final Path l(Path path0, RoundRect roundRect0, float f, boolean z) {
        path0.reset();
        path0.j(roundRect0);
        if(!z) {
            Path path1 = AndroidPath_androidKt.a();
            path1.j(BorderKt.k(f, roundRect0));
            path0.t(path0, path1, 0);
        }
        return path0;
    }

    private static final DrawResult m(CacheDrawScope cacheDrawScope0) {
        return cacheDrawScope0.g(androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1.e);

        final class androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1 extends N implements Function1 {
            public static final androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1 e;

            static {
                androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1.e = new androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1();
            }

            androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1() {
                super(1);
            }

            public final void a(@l ContentDrawScope contentDrawScope0) {
                L.p(contentDrawScope0, "$this$onDrawWithContent");
                contentDrawScope0.Q0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ContentDrawScope)object0));
                return S0.a;
            }
        }

    }

    private static final DrawResult n(CacheDrawScope cacheDrawScope0, Ref ref0, Brush brush0, Generic outline$Generic0, boolean z, float f) {
        Canvas canvas1;
        ImageBitmap imageBitmap1;
        ColorFilter colorFilter0;
        int v1;
        ImageBitmapConfig imageBitmapConfig0 = null;
        if(z) {
            return cacheDrawScope0.g(new Function1(outline$Generic0, brush0) {
                final Generic e;
                final Brush f;

                {
                    this.e = outline$Generic0;
                    this.f = brush0;
                    super(1);
                }

                public final void a(@l ContentDrawScope contentDrawScope0) {
                    L.p(contentDrawScope0, "$this$onDrawWithContent");
                    contentDrawScope0.Q0();
                    b.F(contentDrawScope0, this.e.b(), this.f, 0.0f, null, null, 0, 60, null);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((ContentDrawScope)object0));
                    return S0.a;
                }
            });
        }
        if(brush0 instanceof SolidColor) {
            long v = ((SolidColor)brush0).c();
            v1 = 1;
            colorFilter0 = Companion.d(ColorFilter.b, v, 0, 2, null);
        }
        else {
            v1 = 0;
            colorFilter0 = null;
        }
        Rect rect0 = outline$Generic0.b().getBounds();
        BorderCache borderCache0 = BorderKt.q(ref0);
        Path path0 = borderCache0.n();
        path0.reset();
        path0.r(rect0);
        path0.t(path0, outline$Generic0.b(), 0);
        h l0$h0 = new h();
        long v2 = IntSizeKt.a(((int)(((float)Math.ceil(rect0.G())))), ((int)(((float)Math.ceil(rect0.r())))));
        ImageBitmap imageBitmap0 = borderCache0.a;
        Canvas canvas0 = borderCache0.b;
        ImageBitmapConfig imageBitmapConfig1 = imageBitmap0 == null ? null : ImageBitmapConfig.f(imageBitmap0.d());
        boolean z1 = false;
        if((imageBitmapConfig1 == null ? false : ImageBitmapConfig.i(imageBitmapConfig1.m(), 0))) {
            z1 = true;
        }
        else {
            if(imageBitmap0 != null) {
                imageBitmapConfig0 = ImageBitmapConfig.f(imageBitmap0.d());
            }
            if(ImageBitmapConfig.h(v1, imageBitmapConfig0)) {
                z1 = true;
            }
        }
        if(imageBitmap0 == null || canvas0 == null || Size.t(cacheDrawScope0.b()) > ((float)imageBitmap0.getWidth()) || Size.m(cacheDrawScope0.b()) > ((float)imageBitmap0.getHeight()) || !z1) {
            ImageBitmap imageBitmap2 = ImageBitmapKt.b(((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)), v1, false, null, 24, null);
            borderCache0.a = imageBitmap2;
            Canvas canvas2 = CanvasKt.a(imageBitmap2);
            borderCache0.b = canvas2;
            imageBitmap1 = imageBitmap2;
            canvas1 = canvas2;
        }
        else {
            imageBitmap1 = imageBitmap0;
            canvas1 = canvas0;
        }
        CanvasDrawScope canvasDrawScope0 = borderCache0.c;
        if(canvasDrawScope0 == null) {
            canvasDrawScope0 = new CanvasDrawScope();
            borderCache0.c = canvasDrawScope0;
        }
        long v3 = IntSizeKt.f(v2);
        LayoutDirection layoutDirection0 = cacheDrawScope0.getLayoutDirection();
        DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.B();
        DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.B();
        canvasDrawScope$DrawParams1.l(cacheDrawScope0);
        canvasDrawScope$DrawParams1.m(layoutDirection0);
        canvasDrawScope$DrawParams1.k(canvas1);
        canvasDrawScope$DrawParams1.n(v3);
        canvas1.f();
        b.K(canvasDrawScope0, 0xFF00000000000000L, 0L, v3, 0.0f, null, null, 0, 58, null);
        float f1 = rect0.t();
        float f2 = rect0.B();
        canvasDrawScope0.J0().d().c(-f1, -f2);
        b.F(canvasDrawScope0, outline$Generic0.b(), brush0, 0.0f, new Stroke(f * 2.0f, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f3 = Size.t(canvasDrawScope0.b());
        float f4 = Size.t(canvasDrawScope0.b());
        float f5 = Size.m(canvasDrawScope0.b());
        float f6 = Size.m(canvasDrawScope0.b());
        long v4 = canvasDrawScope0.I();
        DrawContext drawContext0 = canvasDrawScope0.J0();
        long v5 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().f((f3 + 1.0f) / f4, (f5 + 1.0f) / f6, v4);
        b.F(canvasDrawScope0, path0, brush0, 0.0f, null, null, 0, 28, null);
        drawContext0.a().v();
        drawContext0.c(v5);
        canvasDrawScope0.J0().d().c(--f1, --f2);
        canvas1.v();
        DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.B();
        canvasDrawScope$DrawParams2.l(canvasDrawScope$DrawParams0.a());
        canvasDrawScope$DrawParams2.m(canvasDrawScope$DrawParams0.b());
        canvasDrawScope$DrawParams2.k(canvasDrawScope$DrawParams0.c());
        canvasDrawScope$DrawParams2.n(canvasDrawScope$DrawParams0.d());
        imageBitmap1.b();
        l0$h0.a = imageBitmap1;
        return cacheDrawScope0.g(new Function1(rect0, l0$h0, v2, colorFilter0) {
            final Rect e;
            final h f;
            final long g;
            final ColorFilter h;

            {
                this.e = rect0;
                this.f = l0$h0;
                this.g = v;
                this.h = colorFilter0;
                super(1);
            }

            public final void a(@l ContentDrawScope contentDrawScope0) {
                L.p(contentDrawScope0, "$this$onDrawWithContent");
                contentDrawScope0.Q0();
                float f = this.e.t();
                float f1 = this.e.B();
                contentDrawScope0.J0().d().c(f, f1);
                b.z(contentDrawScope0, ((ImageBitmap)this.f.a), 0L, this.g, 0L, 0L, 0.0f, null, this.h, 0, 0, 890, null);
                contentDrawScope0.J0().d().c(-f, -f1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ContentDrawScope)object0));
                return S0.a;
            }
        });
    }

    // 去混淆评级： 低(26)
    private static final DrawResult o(CacheDrawScope cacheDrawScope0, Brush brush0, long v, long v1, boolean z, float f) {
        long v2 = z ? 0L : v;
        long v3 = z ? cacheDrawScope0.b() : v1;
        return z ? cacheDrawScope0.g(new Function1(brush0, v2, v3, Fill.a) {
            final Brush e;
            final long f;
            final long g;
            final DrawStyle h;

            {
                this.e = brush0;
                this.f = v;
                this.g = v1;
                this.h = drawStyle0;
                super(1);
            }

            public final void a(@l ContentDrawScope contentDrawScope0) {
                L.p(contentDrawScope0, "$this$onDrawWithContent");
                contentDrawScope0.Q0();
                b.J(contentDrawScope0, this.e, this.f, this.g, 0.0f, this.h, null, 0, 104, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ContentDrawScope)object0));
                return S0.a;
            }
        }) : cacheDrawScope0.g(new Function1(brush0, v2, v3, new Stroke(f, 0.0f, 0, 0, null, 30, null)) {
            final Brush e;
            final long f;
            final long g;
            final DrawStyle h;

            {
                this.e = brush0;
                this.f = v;
                this.g = v1;
                this.h = drawStyle0;
                super(1);
            }

            public final void a(@l ContentDrawScope contentDrawScope0) {
                L.p(contentDrawScope0, "$this$onDrawWithContent");
                contentDrawScope0.Q0();
                b.J(contentDrawScope0, this.e, this.f, this.g, 0.0f, this.h, null, 0, 104, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ContentDrawScope)object0));
                return S0.a;
            }
        });
    }

    // 去混淆评级： 低(20)
    private static final DrawResult p(CacheDrawScope cacheDrawScope0, Ref ref0, Brush brush0, Rounded outline$Rounded0, long v, long v1, boolean z, float f) {
        return RoundRectKt.q(outline$Rounded0.b()) ? cacheDrawScope0.g(new Function1(z, brush0, outline$Rounded0.b().t(), f / 2.0f, f, v, v1, new Stroke(f, 0.0f, 0, 0, null, 30, null)) {
            final boolean e;
            final Brush f;
            final long g;
            final float h;
            final float i;
            final long j;
            final long k;
            final Stroke l;

            {
                this.e = z;
                this.f = brush0;
                this.g = v;
                this.h = f;
                this.i = f1;
                this.j = v1;
                this.k = v2;
                this.l = stroke0;
                super(1);
            }

            public final void a(@l ContentDrawScope contentDrawScope0) {
                L.p(contentDrawScope0, "$this$onDrawWithContent");
                contentDrawScope0.Q0();
                if(this.e) {
                    b.L(contentDrawScope0, this.f, 0L, 0L, this.g, 0.0f, null, null, 0, 0xF6, null);
                    return;
                }
                float f = this.h;
                if(CornerRadius.m(this.g) < f) {
                    float f1 = Size.t(contentDrawScope0.b());
                    float f2 = Size.m(contentDrawScope0.b());
                    DrawContext drawContext0 = contentDrawScope0.J0();
                    long v = drawContext0.b();
                    drawContext0.a().f();
                    drawContext0.d().a(this.i, this.i, f1 - this.i, f2 - this.i, 0);
                    b.L(contentDrawScope0, this.f, 0L, 0L, this.g, 0.0f, null, null, 0, 0xF6, null);
                    drawContext0.a().v();
                    drawContext0.c(v);
                    return;
                }
                long v1 = BorderKt.r(this.g, f);
                b.L(contentDrawScope0, this.f, this.j, this.k, v1, 0.0f, this.l, null, 0, 0xD0, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ContentDrawScope)object0));
                return S0.a;
            }
        }) : cacheDrawScope0.g(new Function1(BorderKt.l(BorderKt.q(ref0).n(), outline$Rounded0.b(), f, z), brush0) {
            final Path e;
            final Brush f;

            {
                this.e = path0;
                this.f = brush0;
                super(1);
            }

            public final void a(@l ContentDrawScope contentDrawScope0) {
                L.p(contentDrawScope0, "$this$onDrawWithContent");
                contentDrawScope0.Q0();
                b.F(contentDrawScope0, this.e, this.f, 0.0f, null, null, 0, 60, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ContentDrawScope)object0));
                return S0.a;
            }
        });
    }

    private static final BorderCache q(Ref ref0) {
        BorderCache borderCache0 = (BorderCache)ref0.a();
        if(borderCache0 == null) {
            borderCache0 = new BorderCache(null, null, null, null, 15, null);
            ref0.b(borderCache0);
        }
        return borderCache0;
    }

    private static final long r(long v, float f) {
        return CornerRadiusKt.a(Math.max(0.0f, CornerRadius.m(v) - f), Math.max(0.0f, CornerRadius.o(v) - f));
    }
}

