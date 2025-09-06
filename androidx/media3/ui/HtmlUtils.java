package androidx.media3.ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.media3.common.util.Util;

final class HtmlUtils {
    public static String a(String s) [...] // Inlined contents

    public static String b(@ColorInt int v) {
        return Util.S("rgba(%d,%d,%d,%.3f)", new Object[]{Color.red(v), Color.green(v), Color.blue(v), ((double)(((double)Color.alpha(v)) / 255.0))});
    }
}

