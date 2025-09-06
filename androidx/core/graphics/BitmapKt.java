package androidx.core.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.jvm.functions.Function1;
import y4.l;

public final class BitmapKt {
    @l
    public static final Bitmap a(@l Bitmap bitmap0, @l Function1 function10) {
        function10.invoke(new Canvas(bitmap0));
        return bitmap0;
    }

    public static final boolean b(@l Bitmap bitmap0, @l Point point0) {
        int v = bitmap0.getWidth();
        return point0.x >= 0 && point0.x < v && (point0.y >= 0 && point0.y < bitmap0.getHeight());
    }

    public static final boolean c(@l Bitmap bitmap0, @l PointF pointF0) {
        return pointF0.x >= 0.0f && pointF0.x < ((float)bitmap0.getWidth()) && (pointF0.y >= 0.0f && pointF0.y < ((float)bitmap0.getHeight()));
    }

    @l
    public static final Bitmap d(int v, int v1, @l Bitmap.Config bitmap$Config0) {
        return Bitmap.createBitmap(v, v1, bitmap$Config0);
    }

    @RequiresApi(26)
    @l
    public static final Bitmap e(int v, int v1, @l Bitmap.Config bitmap$Config0, boolean z, @l ColorSpace colorSpace0) {
        return Bitmap.createBitmap(v, v1, bitmap$Config0, z, colorSpace0);
    }

    public static Bitmap f(int v, int v1, Bitmap.Config bitmap$Config0, int v2, Object object0) {
        if((v2 & 4) != 0) {
            bitmap$Config0 = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(v, v1, bitmap$Config0);
    }

    public static Bitmap g(int v, int v1, Bitmap.Config bitmap$Config0, boolean z, ColorSpace colorSpace0, int v2, Object object0) {
        if((v2 & 4) != 0) {
            bitmap$Config0 = Bitmap.Config.ARGB_8888;
        }
        if((v2 & 8) != 0) {
            z = true;
        }
        if((v2 & 16) != 0) {
            colorSpace0 = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return Bitmap.createBitmap(v, v1, bitmap$Config0, z, colorSpace0);
    }

    public static final int h(@l Bitmap bitmap0, int v, int v1) {
        return bitmap0.getPixel(v, v1);
    }

    @l
    public static final Bitmap i(@l Bitmap bitmap0, int v, int v1, boolean z) {
        return Bitmap.createScaledBitmap(bitmap0, v, v1, z);
    }

    public static Bitmap j(Bitmap bitmap0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 4) != 0) {
            z = true;
        }
        return Bitmap.createScaledBitmap(bitmap0, v, v1, z);
    }

    public static final void k(@l Bitmap bitmap0, int v, int v1, @ColorInt int v2) {
        bitmap0.setPixel(v, v1, v2);
    }
}

