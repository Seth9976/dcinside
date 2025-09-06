package androidx.compose.ui.graphics;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidColorFilter_androidKt {
    @l
    public static final ColorFilter a(@l float[] arr_f) {
        L.p(arr_f, "colorMatrix");
        return new ColorFilter(new ColorMatrixColorFilter(arr_f));
    }

    @l
    public static final ColorFilter b(long v, long v1) {
        return new ColorFilter(new LightingColorFilter(ColorKt.r(v), ColorKt.r(v1)));
    }

    @l
    public static final ColorFilter c(long v, int v1) {
        return Build.VERSION.SDK_INT < 29 ? new ColorFilter(new PorterDuffColorFilter(ColorKt.r(v), AndroidBlendMode_androidKt.c(v1))) : new ColorFilter(BlendModeColorFilterHelper.a.a(v, v1));
    }

    @l
    public static final android.graphics.ColorFilter d(@l ColorFilter colorFilter0) {
        L.p(colorFilter0, "<this>");
        return colorFilter0.a();
    }

    @l
    public static final ColorFilter e(@l android.graphics.ColorFilter colorFilter0) {
        L.p(colorFilter0, "<this>");
        return new ColorFilter(colorFilter0);
    }
}

