package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.PlatformLocale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.c;
import y4.l;

@s0({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class AndroidStringDelegate implements PlatformStringDelegate {
    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    @l
    public String a(@l String s, @l PlatformLocale platformLocale0) {
        L.p(s, "string");
        L.p(platformLocale0, "locale");
        if(s.length() > 0) {
            int v = s.charAt(0);
            String s1 = s.substring(1);
            L.o(s1, "this as java.lang.String).substring(startIndex)");
            return (Character.isLowerCase(((char)v)) ? c.v(((char)v), ((AndroidLocale)platformLocale0).d()) : String.valueOf(((char)v))) + s1;
        }
        return s;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    @l
    public String b(@l String s, @l PlatformLocale platformLocale0) {
        L.p(s, "string");
        L.p(platformLocale0, "locale");
        if(s.length() > 0) {
            String s1 = s.substring(1);
            L.o(s1, "this as java.lang.String).substring(startIndex)");
            return c.t(s.charAt(0), ((AndroidLocale)platformLocale0).d()) + s1;
        }
        return s;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    @l
    public String c(@l String s, @l PlatformLocale platformLocale0) {
        L.p(s, "string");
        L.p(platformLocale0, "locale");
        String s1 = s.toUpperCase(((AndroidLocale)platformLocale0).d());
        L.o(s1, "this as java.lang.String).toUpperCase(locale)");
        return s1;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    @l
    public String d(@l String s, @l PlatformLocale platformLocale0) {
        L.p(s, "string");
        L.p(platformLocale0, "locale");
        String s1 = s.toLowerCase(((AndroidLocale)platformLocale0).d());
        L.o(s1, "this as java.lang.String).toLowerCase(locale)");
        return s1;
    }
}

