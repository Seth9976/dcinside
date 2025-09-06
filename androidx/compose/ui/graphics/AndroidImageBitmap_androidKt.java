package androidx.compose.ui.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidImageBitmap_androidKt {
    @l
    public static final ImageBitmap a(int v, int v1, int v2, boolean z, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        Bitmap.Config bitmap$Config0 = AndroidImageBitmap_androidKt.d(v2);
        if(Build.VERSION.SDK_INT >= 26) {
            return new AndroidImageBitmap(Api26Bitmap.c(v, v1, v2, z, colorSpace0));
        }
        Bitmap bitmap0 = Bitmap.createBitmap(null, v, v1, bitmap$Config0);
        L.o(bitmap0, "createBitmap(\n          …   bitmapConfig\n        )");
        bitmap0.setHasAlpha(z);
        return new AndroidImageBitmap(bitmap0);
    }

    @l
    public static final Bitmap b(@l ImageBitmap imageBitmap0) {
        L.p(imageBitmap0, "<this>");
        if(!(imageBitmap0 instanceof AndroidImageBitmap)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        return ((AndroidImageBitmap)imageBitmap0).f();
    }

    @l
    public static final ImageBitmap c(@l Bitmap bitmap0) {
        L.p(bitmap0, "<this>");
        return new AndroidImageBitmap(bitmap0);
    }

    @l
    public static final Bitmap.Config d(int v) {
        if(ImageBitmapConfig.i(v, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if(ImageBitmapConfig.i(v, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if(ImageBitmapConfig.i(v, 2)) {
            return Bitmap.Config.RGB_565;
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 26 && ImageBitmapConfig.i(v, 3)) {
            return Bitmap.Config.RGBA_F16;
        }
        return v1 < 26 || !ImageBitmapConfig.i(v, 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
    }

    public static final int e(@l Bitmap.Config bitmap$Config0) {
        L.p(bitmap$Config0, "<this>");
        if(bitmap$Config0 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if(bitmap$Config0 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if(bitmap$Config0 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int v = Build.VERSION.SDK_INT;
        if(v >= 26 && bitmap$Config0 == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return v < 26 || bitmap$Config0 != Bitmap.Config.HARDWARE ? 0 : 4;
    }
}

