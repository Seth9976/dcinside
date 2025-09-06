package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import y4.l;

public final class ColorDrawableKt {
    @l
    public static final ColorDrawable a(@ColorInt int v) {
        return new ColorDrawable(v);
    }

    @RequiresApi(26)
    @l
    public static final ColorDrawable b(@l Color color0) {
        return new ColorDrawable(color0.toArgb());
    }
}

