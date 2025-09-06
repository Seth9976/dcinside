package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import y4.l;
import y4.m;

final class HandleImageCache {
    @l
    public static final HandleImageCache a;
    @m
    private static ImageBitmap b;
    @m
    private static Canvas c;
    @m
    private static CanvasDrawScope d;

    static {
        HandleImageCache.a = new HandleImageCache();
    }

    @m
    public final Canvas a() {
        return HandleImageCache.c;
    }

    @m
    public final CanvasDrawScope b() {
        return HandleImageCache.d;
    }

    @m
    public final ImageBitmap c() {
        return HandleImageCache.b;
    }

    public final void d(@m Canvas canvas0) {
        HandleImageCache.c = canvas0;
    }

    public final void e(@m CanvasDrawScope canvasDrawScope0) {
        HandleImageCache.d = canvasDrawScope0;
    }

    public final void f(@m ImageBitmap imageBitmap0) {
        HandleImageCache.b = imageBitmap0;
    }
}

