package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocale;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class StringKt {
    @l
    private static final PlatformStringDelegate a;

    static {
        StringKt.a = AndroidStringDelegate_androidKt.a();
    }

    @l
    public static final String a(@l String s, @l Locale locale0) {
        L.p(s, "<this>");
        L.p(locale0, "locale");
        PlatformLocale platformLocale0 = locale0.b();
        return StringKt.a.a(s, platformLocale0);
    }

    @l
    public static final String b(@l String s, @l LocaleList localeList0) {
        L.p(s, "<this>");
        L.p(localeList0, "localeList");
        return localeList0.isEmpty() ? StringKt.a(s, Locale.b.a()) : StringKt.a(s, localeList0.c(0));
    }

    @l
    public static final String c(@l String s, @l Locale locale0) {
        L.p(s, "<this>");
        L.p(locale0, "locale");
        return StringKt.a.b(s, locale0.b());
    }

    @l
    public static final String d(@l String s, @l LocaleList localeList0) {
        L.p(s, "<this>");
        L.p(localeList0, "localeList");
        return localeList0.isEmpty() ? StringKt.c(s, Locale.b.a()) : StringKt.c(s, localeList0.c(0));
    }

    @l
    public static final String e(@l String s, @l Locale locale0) {
        L.p(s, "<this>");
        L.p(locale0, "locale");
        return StringKt.a.d(s, locale0.b());
    }

    @l
    public static final String f(@l String s, @l LocaleList localeList0) {
        L.p(s, "<this>");
        L.p(localeList0, "localeList");
        return localeList0.isEmpty() ? StringKt.e(s, Locale.b.a()) : StringKt.e(s, localeList0.c(0));
    }

    @l
    public static final String g(@l String s, @l Locale locale0) {
        L.p(s, "<this>");
        L.p(locale0, "locale");
        return StringKt.a.c(s, locale0.b());
    }

    @l
    public static final String h(@l String s, @l LocaleList localeList0) {
        L.p(s, "<this>");
        L.p(localeList0, "localeList");
        return localeList0.isEmpty() ? StringKt.g(s, Locale.b.a()) : StringKt.g(s, localeList0.c(0));
    }
}

