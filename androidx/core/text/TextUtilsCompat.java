package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

public final class TextUtilsCompat {
    public static int a(Locale locale0) {
        return TextUtils.getLayoutDirectionFromLocale(locale0);
    }

    public static String b(String s) {
        return TextUtils.htmlEncode(s);
    }
}

