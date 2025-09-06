package androidx.compose.ui.text.platform.extensions;

import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.PlatformLocale;
import java.util.Locale;
import kotlin.jvm.internal.L;
import y4.l;

public final class LocaleExtensions_androidKt {
    @l
    public static final Locale a(@l androidx.compose.ui.text.intl.Locale locale0) {
        L.p(locale0, "<this>");
        PlatformLocale platformLocale0 = locale0.b();
        L.n(platformLocale0, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((AndroidLocale)platformLocale0).d();
    }
}

