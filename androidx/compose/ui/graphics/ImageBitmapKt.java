package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.L;
import y4.l;

public final class ImageBitmapKt {
    @l
    public static final ImageBitmap a(int v, int v1, int v2, boolean z, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        return AndroidImageBitmap_androidKt.a(v, v1, v2, z, colorSpace0);
    }

    public static ImageBitmap b(int v, int v1, int v2, boolean z, ColorSpace colorSpace0, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v2 = 0;
        }
        if((v3 & 8) != 0) {
            z = true;
        }
        if((v3 & 16) != 0) {
            colorSpace0 = ColorSpaces.a.x();
        }
        return ImageBitmapKt.a(v, v1, v2, z, colorSpace0);
    }

    @l
    public static final PixelMap c(@l ImageBitmap imageBitmap0, int v, int v1, int v2, int v3, @l int[] arr_v, int v4, int v5) {
        L.p(imageBitmap0, "<this>");
        L.p(arr_v, "buffer");
        imageBitmap0.a(arr_v, v, v1, v2, v3, v4, v5);
        return new PixelMap(arr_v, v2, v3, v4, v5);
    }

    public static PixelMap d(ImageBitmap imageBitmap0, int v, int v1, int v2, int v3, int[] arr_v, int v4, int v5, int v6, Object object0) {
        if((v6 & 1) != 0) {
            v = 0;
        }
        if((v6 & 2) != 0) {
            v1 = 0;
        }
        if((v6 & 4) != 0) {
            v2 = imageBitmap0.getWidth();
        }
        if((v6 & 8) != 0) {
            v3 = imageBitmap0.getHeight();
        }
        if((v6 & 16) != 0) {
            arr_v = new int[v2 * v3];
        }
        if((v6 & 0x20) != 0) {
            v4 = 0;
        }
        if((v6 & 0x40) != 0) {
            v5 = v2;
        }
        return ImageBitmapKt.c(imageBitmap0, v, v1, v2, v3, arr_v, v4, v5);
    }
}

