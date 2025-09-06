package androidx.compose.ui.text.platform.extensions;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@RequiresApi(24)
@s0({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1549#2:57\n1620#2,3:58\n37#3,2:55\n37#3,2:61\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n40#1:51\n40#1:52,3\n47#1:57\n47#1:58,3\n40#1:55,2\n47#1:61,2\n*E\n"})
public final class LocaleListHelperMethods {
    @l
    public static final LocaleListHelperMethods a;

    static {
        LocaleListHelperMethods.a = new LocaleListHelperMethods();
    }

    @DoNotInline
    @RequiresApi(24)
    @l
    public final Object a(@l LocaleList localeList0) {
        L.p(localeList0, "localeList");
        ArrayList arrayList0 = new ArrayList(u.b0(localeList0, 10));
        for(Object object0: localeList0) {
            arrayList0.add(LocaleExtensions_androidKt.a(((Locale)object0)));
        }
        java.util.Locale[] arr_locale = (java.util.Locale[])arrayList0.toArray(new java.util.Locale[0]);
        return c.a(b.a(((java.util.Locale[])Arrays.copyOf(arr_locale, arr_locale.length))));
    }

    @DoNotInline
    @RequiresApi(24)
    public final void b(@l AndroidTextPaint androidTextPaint0, @l LocaleList localeList0) {
        L.p(androidTextPaint0, "textPaint");
        L.p(localeList0, "localeList");
        ArrayList arrayList0 = new ArrayList(u.b0(localeList0, 10));
        for(Object object0: localeList0) {
            arrayList0.add(LocaleExtensions_androidKt.a(((Locale)object0)));
        }
        java.util.Locale[] arr_locale = (java.util.Locale[])arrayList0.toArray(new java.util.Locale[0]);
        androidTextPaint0.setTextLocales(b.a(((java.util.Locale[])Arrays.copyOf(arr_locale, arr_locale.length))));
    }
}

