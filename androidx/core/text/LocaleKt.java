package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;
import y4.l;

public final class LocaleKt {
    public static final int a(@l Locale locale0) {
        return TextUtils.getLayoutDirectionFromLocale(locale0);
    }
}

