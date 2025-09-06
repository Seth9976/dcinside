package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class BitmapPainterKt {
    @l
    public static final BitmapPainter a(@l ImageBitmap imageBitmap0, long v, long v1, int v2) {
        L.p(imageBitmap0, "image");
        BitmapPainter bitmapPainter0 = new BitmapPainter(imageBitmap0, v, v1, null);
        bitmapPainter0.m(v2);
        return bitmapPainter0;
    }

    public static BitmapPainter b(ImageBitmap imageBitmap0, long v, long v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0L;
        }
        if((v3 & 4) != 0) {
            v1 = IntSizeKt.a(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        }
        if((v3 & 8) != 0) {
            v2 = 1;
        }
        return BitmapPainterKt.a(imageBitmap0, v, v1, v2);
    }
}

