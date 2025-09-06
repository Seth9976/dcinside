package androidx.core.graphics;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import y4.l;

public final class PorterDuffKt {
    @l
    public static final PorterDuffColorFilter a(@l PorterDuff.Mode porterDuff$Mode0, int v) {
        return new PorterDuffColorFilter(v, porterDuff$Mode0);
    }

    @l
    public static final PorterDuffXfermode b(@l PorterDuff.Mode porterDuff$Mode0) {
        return new PorterDuffXfermode(porterDuff$Mode0);
    }
}

