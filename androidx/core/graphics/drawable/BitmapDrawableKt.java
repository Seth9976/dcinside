package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import y4.l;

public final class BitmapDrawableKt {
    @l
    public static final BitmapDrawable a(@l Bitmap bitmap0, @l Resources resources0) {
        return new BitmapDrawable(resources0, bitmap0);
    }
}

