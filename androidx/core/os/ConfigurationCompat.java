package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

public final class ConfigurationCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static LocaleList a(Configuration configuration0) {
            return configuration0.getLocales();
        }

        static void b(Configuration configuration0, LocaleListCompat localeListCompat0) {
            configuration0.setLocales(((LocaleList)localeListCompat0.n()));
        }
    }

    public static LocaleListCompat a(Configuration configuration0) {
        return Build.VERSION.SDK_INT < 24 ? LocaleListCompat.a(new Locale[]{configuration0.locale}) : LocaleListCompat.o(Api24Impl.a(configuration0));
    }

    public static void b(Configuration configuration0, LocaleListCompat localeListCompat0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.b(configuration0, localeListCompat0);
            return;
        }
        if(!localeListCompat0.j()) {
            configuration0.setLocale(localeListCompat0.d(0));
        }
    }
}

