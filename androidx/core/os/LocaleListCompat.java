package androidx.core.os;

import android.os.Build.VERSION;
import android.os.LocaleList;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.core.text.ICUCompat;
import java.util.Locale;

public final class LocaleListCompat {
    @RequiresApi(21)
    static class Api21Impl {
        private static final Locale[] a;

        static {
            Api21Impl.a = new Locale[]{new Locale("en", "XA"), new Locale("ar", "XB")};
        }

        static Locale a(String s) {
            return Locale.forLanguageTag(s);
        }

        private static boolean b(Locale locale0) {
            Locale[] arr_locale = Api21Impl.a;
            for(int v = 0; v < arr_locale.length; ++v) {
                if(arr_locale[v].equals(locale0)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale0, Locale locale1) {
            if(locale0.equals(locale1)) {
                return true;
            }
            if(!locale0.getLanguage().equals(locale1.getLanguage())) {
                return false;
            }
            if(!Api21Impl.b(locale0) && !Api21Impl.b(locale1)) {
                String s = ICUCompat.c(locale0);
                if(s.isEmpty()) {
                    String s1 = locale0.getCountry();
                    return s1.isEmpty() || s1.equals(locale1.getCountry());
                }
                return s.equals(ICUCompat.c(locale1));
            }
            return false;
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static LocaleList a(Locale[] arr_locale) {
            return new LocaleList(arr_locale);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private final LocaleListInterface a;
    private static final LocaleListCompat b;

    static {
        LocaleListCompat.b = LocaleListCompat.a(new Locale[0]);
    }

    private LocaleListCompat(LocaleListInterface localeListInterface0) {
        this.a = localeListInterface0;
    }

    public static LocaleListCompat a(Locale[] arr_locale) {
        return Build.VERSION.SDK_INT < 24 ? new LocaleListCompat(new LocaleListCompatWrapper(arr_locale)) : LocaleListCompat.o(Api24Impl.a(arr_locale));
    }

    static Locale b(String s) {
        if(s.contains("-")) {
            String[] arr_s = s.split("-", -1);
            if(arr_s.length > 2) {
                return new Locale(arr_s[0], arr_s[1], arr_s[2]);
            }
            if(arr_s.length > 1) {
                return new Locale(arr_s[0], arr_s[1]);
            }
            if(arr_s.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [" + s + "]");
            }
            return new Locale(arr_s[0]);
        }
        if(s.contains("_")) {
            String[] arr_s1 = s.split("_", -1);
            if(arr_s1.length > 2) {
                return new Locale(arr_s1[0], arr_s1[1], arr_s1[2]);
            }
            if(arr_s1.length > 1) {
                return new Locale(arr_s1[0], arr_s1[1]);
            }
            if(arr_s1.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [" + s + "]");
            }
            return new Locale(arr_s1[0]);
        }
        return new Locale(s);
    }

    public static LocaleListCompat c(String s) {
        if(s != null && !s.isEmpty()) {
            String[] arr_s = s.split(",", -1);
            Locale[] arr_locale = new Locale[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_locale[v] = Api21Impl.a(arr_s[v]);
            }
            return LocaleListCompat.a(arr_locale);
        }
        return LocaleListCompat.g();
    }

    public Locale d(int v) {
        return this.a.get(v);
    }

    @Size(min = 1L)
    public static LocaleListCompat e() {
        return Build.VERSION.SDK_INT < 24 ? LocaleListCompat.a(new Locale[]{Locale.getDefault()}) : LocaleListCompat.o(Api24Impl.b());
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof LocaleListCompat && this.a.equals(((LocaleListCompat)object0).a);
    }

    @Size(min = 1L)
    public static LocaleListCompat f() {
        return Build.VERSION.SDK_INT < 24 ? LocaleListCompat.a(new Locale[]{Locale.getDefault()}) : LocaleListCompat.o(Api24Impl.c());
    }

    public static LocaleListCompat g() {
        return LocaleListCompat.b;
    }

    public Locale h(String[] arr_s) {
        return this.a.b(arr_s);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @IntRange(from = -1L)
    public int i(Locale locale0) {
        return this.a.c(locale0);
    }

    public boolean j() {
        return this.a.isEmpty();
    }

    @RequiresApi(21)
    public static boolean k(Locale locale0, Locale locale1) {
        return Build.VERSION.SDK_INT < 33 ? Api21Impl.c(locale0, locale1) : LocaleList.matchesLanguageAndScript(locale0, locale1);
    }

    @IntRange(from = 0L)
    public int l() {
        return this.a.size();
    }

    public String m() {
        return this.a.a();
    }

    public Object n() {
        return this.a.getLocaleList();
    }

    @RequiresApi(24)
    public static LocaleListCompat o(LocaleList localeList0) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList0));
    }

    @RequiresApi(24)
    @Deprecated
    public static LocaleListCompat p(Object object0) {
        return LocaleListCompat.o(((LocaleList)object0));
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

