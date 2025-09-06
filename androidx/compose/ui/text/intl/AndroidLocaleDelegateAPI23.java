package androidx.compose.ui.text.intl;

import java.util.Locale;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @l
    public LocaleList a() {
        Locale locale0 = Locale.getDefault();
        L.o(locale0, "getDefault()");
        return new LocaleList(u.k(new androidx.compose.ui.text.intl.Locale(new AndroidLocale(locale0))));
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @l
    public PlatformLocale b(@l String s) {
        L.p(s, "languageTag");
        Locale locale0 = Locale.forLanguageTag(s);
        L.o(locale0, "forLanguageTag(languageTag)");
        return new AndroidLocale(locale0);
    }
}

