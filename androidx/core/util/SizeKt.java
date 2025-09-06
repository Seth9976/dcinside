package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import y4.l;

public final class SizeKt {
    @RequiresApi(21)
    public static final float a(@l SizeF sizeF0) {
        return sizeF0.getWidth();
    }

    public static final float b(@l SizeFCompat sizeFCompat0) {
        return sizeFCompat0.b();
    }

    @RequiresApi(21)
    public static final int c(@l Size size0) {
        return size0.getWidth();
    }

    @RequiresApi(21)
    public static final float d(@l SizeF sizeF0) {
        return sizeF0.getHeight();
    }

    public static final float e(@l SizeFCompat sizeFCompat0) {
        return sizeFCompat0.a();
    }

    @RequiresApi(21)
    public static final int f(@l Size size0) {
        return size0.getHeight();
    }
}

