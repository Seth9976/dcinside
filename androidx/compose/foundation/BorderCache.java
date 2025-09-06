package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,459:1\n1#2:460\n558#3,17:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n207#1:461,17\n*E\n"})
final class BorderCache {
    @m
    private ImageBitmap a;
    @m
    private Canvas b;
    @m
    private CanvasDrawScope c;
    @m
    private Path d;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    public BorderCache(@m ImageBitmap imageBitmap0, @m Canvas canvas0, @m CanvasDrawScope canvasDrawScope0, @m Path path0) {
        this.a = imageBitmap0;
        this.b = canvas0;
        this.c = canvasDrawScope0;
        this.d = path0;
    }

    public BorderCache(ImageBitmap imageBitmap0, Canvas canvas0, CanvasDrawScope canvasDrawScope0, Path path0, int v, w w0) {
        if((v & 1) != 0) {
            imageBitmap0 = null;
        }
        if((v & 2) != 0) {
            canvas0 = null;
        }
        if((v & 4) != 0) {
            canvasDrawScope0 = null;
        }
        if((v & 8) != 0) {
            path0 = null;
        }
        this(imageBitmap0, canvas0, canvasDrawScope0, path0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BorderCache)) {
            return false;
        }
        if(!L.g(this.a, ((BorderCache)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((BorderCache)object0).b)) {
            return false;
        }
        return L.g(this.c, ((BorderCache)object0).c) ? L.g(this.d, ((BorderCache)object0).d) : false;
    }

    private final ImageBitmap g() {
        return this.a;
    }

    private final Canvas h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Path path0 = this.d;
        if(path0 != null) {
            v = path0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    private final CanvasDrawScope i() {
        return this.c;
    }

    private final Path j() {
        return this.d;
    }

    @l
    public final BorderCache k(@m ImageBitmap imageBitmap0, @m Canvas canvas0, @m CanvasDrawScope canvasDrawScope0, @m Path path0) {
        return new BorderCache(imageBitmap0, canvas0, canvasDrawScope0, path0);
    }

    public static BorderCache l(BorderCache borderCache0, ImageBitmap imageBitmap0, Canvas canvas0, CanvasDrawScope canvasDrawScope0, Path path0, int v, Object object0) {
        if((v & 1) != 0) {
            imageBitmap0 = borderCache0.a;
        }
        if((v & 2) != 0) {
            canvas0 = borderCache0.b;
        }
        if((v & 4) != 0) {
            canvasDrawScope0 = borderCache0.c;
        }
        if((v & 8) != 0) {
            path0 = borderCache0.d;
        }
        return borderCache0.k(imageBitmap0, canvas0, canvasDrawScope0, path0);
    }

    @l
    public final ImageBitmap m(@l CacheDrawScope cacheDrawScope0, long v, int v1, @l Function1 function10) {
        L.p(cacheDrawScope0, "$this$drawBorderCache");
        L.p(function10, "block");
        ImageBitmap imageBitmap0 = this.a;
        Canvas canvas0 = this.b;
        ImageBitmapConfig imageBitmapConfig0 = null;
        ImageBitmapConfig imageBitmapConfig1 = imageBitmap0 == null ? null : ImageBitmapConfig.f(imageBitmap0.d());
        boolean z = false;
        if((imageBitmapConfig1 == null ? false : ImageBitmapConfig.i(imageBitmapConfig1.m(), 0))) {
            z = true;
        }
        else {
            if(imageBitmap0 != null) {
                imageBitmapConfig0 = ImageBitmapConfig.f(imageBitmap0.d());
            }
            if(ImageBitmapConfig.h(v1, imageBitmapConfig0)) {
                z = true;
            }
        }
        if(imageBitmap0 == null || canvas0 == null || Size.t(cacheDrawScope0.b()) > ((float)imageBitmap0.getWidth()) || Size.m(cacheDrawScope0.b()) > ((float)imageBitmap0.getHeight()) || !z) {
            imageBitmap0 = ImageBitmapKt.b(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), v1, false, null, 24, null);
            this.a = imageBitmap0;
            canvas0 = CanvasKt.a(imageBitmap0);
            this.b = canvas0;
        }
        CanvasDrawScope canvasDrawScope0 = this.c;
        if(canvasDrawScope0 == null) {
            canvasDrawScope0 = new CanvasDrawScope();
            this.c = canvasDrawScope0;
        }
        long v2 = IntSizeKt.f(v);
        LayoutDirection layoutDirection0 = cacheDrawScope0.getLayoutDirection();
        DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.B();
        DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.B();
        canvasDrawScope$DrawParams1.l(cacheDrawScope0);
        canvasDrawScope$DrawParams1.m(layoutDirection0);
        canvasDrawScope$DrawParams1.k(canvas0);
        canvasDrawScope$DrawParams1.n(v2);
        canvas0.f();
        b.K(canvasDrawScope0, 0xFF00000000000000L, 0L, v2, 0.0f, null, null, 0, 58, null);
        function10.invoke(canvasDrawScope0);
        canvas0.v();
        DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.B();
        canvasDrawScope$DrawParams2.l(canvasDrawScope$DrawParams0.a());
        canvasDrawScope$DrawParams2.m(canvasDrawScope$DrawParams0.b());
        canvasDrawScope$DrawParams2.k(canvasDrawScope$DrawParams0.c());
        canvasDrawScope$DrawParams2.n(canvasDrawScope$DrawParams0.d());
        imageBitmap0.b();
        return imageBitmap0;
    }

    @l
    public final Path n() {
        Path path0 = this.d;
        if(path0 == null) {
            path0 = AndroidPath_androidKt.a();
            this.d = path0;
        }
        return path0;
    }

    @Override
    @l
    public String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}

