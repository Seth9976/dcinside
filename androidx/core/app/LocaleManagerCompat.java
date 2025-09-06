package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.LocaleListCompat;
import java.util.Locale;

public final class LocaleManagerCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static String a(Locale locale0) {
            return locale0.toLanguageTag();
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static LocaleListCompat a(Configuration configuration0) {
            return LocaleListCompat.c(configuration0.getLocales().toLanguageTags());
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        static LocaleList a(Object object0) {
            return ((LocaleManager)object0).getApplicationLocales();
        }

        static LocaleList b(Object object0) {
            return ((LocaleManager)object0).getSystemLocales();
        }
    }

    @AnyThread
    public static LocaleListCompat a(Context context0) {
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = LocaleManagerCompat.c(context0);
            return object0 == null ? LocaleListCompat.g() : LocaleListCompat.o(Api33Impl.a(object0));
        }
        return LocaleListCompat.c(AppLocalesStorageHelper.b(context0));
    }

    @VisibleForTesting
    static LocaleListCompat b(Configuration configuration0) {
        return Build.VERSION.SDK_INT < 24 ? LocaleListCompat.c(Api21Impl.a(configuration0.locale)) : Api24Impl.a(configuration0);
    }

    @RequiresApi(33)
    private static Object c(Context context0) {
        return context0.getSystemService("locale");
    }

    @AnyThread
    public static LocaleListCompat d(Context context0) {
        LocaleListCompat localeListCompat0 = LocaleListCompat.g();
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = LocaleManagerCompat.c(context0);
            return object0 == null ? localeListCompat0 : LocaleListCompat.o(Api33Impl.b(object0));
        }
        return LocaleManagerCompat.b(Resources.getSystem().getConfiguration());
    }
}

