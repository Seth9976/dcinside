package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;

@RequiresApi(24)
final class LocaleOverlayHelper {
    private static LocaleListCompat a(LocaleListCompat localeListCompat0, LocaleListCompat localeListCompat1) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(int v = 0; v < localeListCompat0.l() + localeListCompat1.l(); ++v) {
            Locale locale0 = v >= localeListCompat0.l() ? localeListCompat1.d(v - localeListCompat0.l()) : localeListCompat0.d(v);
            if(locale0 != null) {
                linkedHashSet0.add(locale0);
            }
        }
        return LocaleListCompat.a(((Locale[])linkedHashSet0.toArray(new Locale[linkedHashSet0.size()])));
    }

    static LocaleListCompat b(LocaleList localeList0, LocaleList localeList1) {
        return localeList0 == null || localeList0.isEmpty() ? LocaleListCompat.g() : LocaleOverlayHelper.a(LocaleListCompat.o(localeList0), LocaleListCompat.o(localeList1));
    }

    static LocaleListCompat c(LocaleListCompat localeListCompat0, LocaleListCompat localeListCompat1) {
        return localeListCompat0 == null || localeListCompat0.j() ? LocaleListCompat.g() : LocaleOverlayHelper.a(localeListCompat0, localeListCompat1);
    }
}

