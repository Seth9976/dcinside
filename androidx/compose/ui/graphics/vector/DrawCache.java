package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,106:1\n558#2,17:107\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n76#1:107,17\n*E\n"})
public final class DrawCache {
    @m
    private ImageBitmap a;
    @m
    private Canvas b;
    @m
    private Density c;
    @l
    private LayoutDirection d;
    private long e;
    @l
    private final CanvasDrawScope f;

    public DrawCache() {
        this.d = LayoutDirection.a;
        this.e = 0L;
        this.f = new CanvasDrawScope();
    }

    // 去混淆评级： 低(20)
    private final void a(DrawScope drawScope0) {
        b.K(drawScope0, 0xFF00000000000000L, 0L, 0L, 0.0f, null, null, 0, 62, null);
    }

    public final void b(long v, @l Density density0, @l LayoutDirection layoutDirection0, @l Function1 function10) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        L.p(function10, "block");
        this.c = density0;
        this.d = layoutDirection0;
        ImageBitmap imageBitmap0 = this.a;
        Canvas canvas0 = this.b;
        if(imageBitmap0 == null || canvas0 == null || ((int)(v >> 0x20)) > imageBitmap0.getWidth() || ((int)(v & 0xFFFFFFFFL)) > imageBitmap0.getHeight()) {
            imageBitmap0 = ImageBitmapKt.b(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), 0, false, null, 28, null);
            canvas0 = CanvasKt.a(imageBitmap0);
            this.a = imageBitmap0;
            this.b = canvas0;
        }
        this.e = v;
        DrawParams canvasDrawScope$DrawParams0 = this.f.B();
        DrawParams canvasDrawScope$DrawParams1 = this.f.B();
        canvasDrawScope$DrawParams1.l(density0);
        canvasDrawScope$DrawParams1.m(layoutDirection0);
        canvasDrawScope$DrawParams1.k(canvas0);
        canvasDrawScope$DrawParams1.n(IntSizeKt.f(v));
        canvas0.f();
        this.a(this.f);
        function10.invoke(this.f);
        canvas0.v();
        DrawParams canvasDrawScope$DrawParams2 = this.f.B();
        canvasDrawScope$DrawParams2.l(canvasDrawScope$DrawParams0.a());
        canvasDrawScope$DrawParams2.m(canvasDrawScope$DrawParams0.b());
        canvasDrawScope$DrawParams2.k(canvasDrawScope$DrawParams0.c());
        canvasDrawScope$DrawParams2.n(canvasDrawScope$DrawParams0.d());
        imageBitmap0.b();
    }

    public final void c(@l DrawScope drawScope0, float f, @m ColorFilter colorFilter0) {
        L.p(drawScope0, "target");
        ImageBitmap imageBitmap0 = this.a;
        if(imageBitmap0 == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        b.z(drawScope0, imageBitmap0, 0L, this.e, 0L, 0L, f, null, colorFilter0, 0, 0, 858, null);
    }

    public static void d(DrawCache drawCache0, DrawScope drawScope0, float f, ColorFilter colorFilter0, int v, Object object0) {
        if((v & 2) != 0) {
            f = 1.0f;
        }
        if((v & 4) != 0) {
            colorFilter0 = null;
        }
        drawCache0.c(drawScope0, f, colorFilter0);
    }

    @m
    public final ImageBitmap e() {
        return this.a;
    }

    @b0
    public static void f() {
    }

    public final void g(@m ImageBitmap imageBitmap0) {
        this.a = imageBitmap0;
    }
}

