package androidx.compose.ui.text.intl;

import java.util.Locale;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidLocale implements PlatformLocale {
    @l
    private final Locale a;

    public AndroidLocale(@l Locale locale0) {
        L.p(locale0, "javaLocale");
        super();
        this.a = locale0;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocale
    @l
    public String a() {
        String s = this.a.toLanguageTag();
        L.o(s, "javaLocale.toLanguageTag()");
        return s;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocale
    @l
    public String b() {
        String s = this.a.getScript();
        L.o(s, "javaLocale.script");
        return s;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocale
    @l
    public String c() {
        String s = this.a.getCountry();
        L.o(s, "javaLocale.country");
        return s;
    }

    @l
    public final Locale d() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocale
    @l
    public String getLanguage() {
        String s = this.a.getLanguage();
        L.o(s, "javaLocale.language");
        return s;
    }
}

