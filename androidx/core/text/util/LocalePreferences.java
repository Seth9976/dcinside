package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat.HourCycle;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build.VERSION;
import android.text.format.DateFormat;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale.Category;
import java.util.Locale;

@RequiresApi(21)
public final class LocalePreferences {
    @RequiresApi(24)
    static class Api24Impl {
        static String a(Locale locale0) {
            return Calendar.getInstance(locale0).getType();
        }

        static Locale b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        static String a(Locale locale0) {
            return Api33Impl.b(DateTimePatternGenerator.getInstance(locale0).getDefaultHourCycle());
        }

        private static String b(DateFormat.HourCycle dateFormat$HourCycle0) {
            switch(androidx.core.text.util.LocalePreferences.1.a[dateFormat$HourCycle0.ordinal()]) {
                case 1: {
                    return "h11";
                }
                case 2: {
                    return "h12";
                }
                case 3: {
                    return "h23";
                }
                case 4: {
                    return "h24";
                }
                default: {
                    return "";
                }
            }
        }

        static String c(Locale locale0) {
            String s = ((UnlocalizedNumberFormatter)((UnlocalizedNumberFormatter)NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale0).format(1L).getOutputUnit().getIdentifier();
            return s.startsWith("fahrenhe") ? "fahrenhe" : s;
        }
    }

    public static class CalendarType {
        @RestrictTo({Scope.a})
        @Retention(RetentionPolicy.SOURCE)
        public @interface CalendarTypes {
        }

        private static final String a = "ca";
        public static final String b = "chinese";
        public static final String c = "dangi";
        public static final String d = "gregorian";
        public static final String e = "hebrew";
        public static final String f = "indian";
        public static final String g = "islamic";
        public static final String h = "islamic-civil";
        public static final String i = "islamic-rgsa";
        public static final String j = "islamic-tbla";
        public static final String k = "islamic-umalqura";
        public static final String l = "persian";
        public static final String m = "";

    }

    public static class FirstDayOfWeek {
        @RestrictTo({Scope.a})
        @Retention(RetentionPolicy.SOURCE)
        public @interface Days {
        }

        private static final String a = "fw";
        public static final String b = "sun";
        public static final String c = "mon";
        public static final String d = "tue";
        public static final String e = "wed";
        public static final String f = "thu";
        public static final String g = "fri";
        public static final String h = "sat";
        public static final String i = "";

    }

    public static class HourCycle {
        @RestrictTo({Scope.a})
        @Retention(RetentionPolicy.SOURCE)
        public @interface HourCycleTypes {
        }

        private static final String a = "hc";
        public static final String b = "h11";
        public static final String c = "h12";
        public static final String d = "h23";
        public static final String e = "h24";
        public static final String f = "";

    }

    public static class TemperatureUnit {
        @RestrictTo({Scope.a})
        @Retention(RetentionPolicy.SOURCE)
        public @interface TemperatureUnits {
        }

        private static final String a = "mu";
        public static final String b = "celsius";
        public static final String c = "fahrenhe";
        public static final String d = "kelvin";
        public static final String e = "";

    }

    private static final String a = "LocalePreferences";
    private static final String[] b;

    static {
        LocalePreferences.b = new String[]{"BS", "BZ", "KY", "PR", "PW", "US"};
    }

    private static String a(Locale locale0) {
        return LocalePreferences.p(java.util.Calendar.getInstance(locale0).getFirstDayOfWeek());
    }

    // 去混淆评级： 低(20)
    private static String b(Locale locale0) {
        return DateFormat.getBestDateTimePattern(locale0, "jm").contains("H") ? "h23" : "h12";
    }

    public static String c() {
        return LocalePreferences.f(true);
    }

    public static String d(Locale locale0) {
        return LocalePreferences.e(locale0, true);
    }

    public static String e(Locale locale0, boolean z) {
        String s = LocalePreferences.v("ca", "", locale0, z);
        if(s != null) {
            return s;
        }
        if(Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.a(locale0);
        }
        return z ? "gregorian" : "";
    }

    public static String f(boolean z) {
        return Build.VERSION.SDK_INT < 24 ? LocalePreferences.e(LocalePreferences.g(), z) : LocalePreferences.e(Api24Impl.b(), z);
    }

    private static Locale g() {
        return Locale.getDefault();
    }

    public static String h() {
        return LocalePreferences.k(true);
    }

    public static String i(Locale locale0) {
        return LocalePreferences.j(locale0, true);
    }

    public static String j(Locale locale0, boolean z) {
        String s = LocalePreferences.v("fw", "", locale0, z);
        return s == null ? LocalePreferences.a(locale0) : s;
    }

    public static String k(boolean z) {
        return Build.VERSION.SDK_INT < 24 ? LocalePreferences.j(LocalePreferences.g(), z) : LocalePreferences.j(Api24Impl.b(), z);
    }

    public static String l() {
        return LocalePreferences.o(true);
    }

    public static String m(Locale locale0) {
        return LocalePreferences.n(locale0, true);
    }

    public static String n(Locale locale0, boolean z) {
        String s = LocalePreferences.v("hc", "", locale0, z);
        if(s != null) {
            return s;
        }
        return Build.VERSION.SDK_INT < 33 ? LocalePreferences.b(locale0) : Api33Impl.a(locale0);
    }

    public static String o(boolean z) {
        return Build.VERSION.SDK_INT < 24 ? LocalePreferences.n(LocalePreferences.g(), z) : LocalePreferences.n(Api24Impl.b(), z);
    }

    private static String p(int v) {
        return v < 1 || v > 7 ? "" : new String[]{"sun", "mon", "tue", "wed", "thu", "fri", "sat"}[v - 1];
    }

    private static String q(Locale locale0) {
        String s = locale0.getCountry();
        return Arrays.binarySearch(LocalePreferences.b, s) < 0 ? "celsius" : "fahrenhe";
    }

    public static String r() {
        return LocalePreferences.u(true);
    }

    public static String s(Locale locale0) {
        return LocalePreferences.t(locale0, true);
    }

    public static String t(Locale locale0, boolean z) {
        String s = LocalePreferences.v("mu", "", locale0, z);
        if(s != null) {
            return s;
        }
        return Build.VERSION.SDK_INT < 33 ? LocalePreferences.q(locale0) : Api33Impl.c(locale0);
    }

    public static String u(boolean z) {
        return Build.VERSION.SDK_INT < 24 ? LocalePreferences.t(LocalePreferences.g(), z) : LocalePreferences.t(Api24Impl.b(), z);
    }

    private static String v(String s, String s1, Locale locale0, boolean z) {
        String s2 = locale0.getUnicodeLocaleType(s);
        if(s2 != null) {
            return s2;
        }
        return z ? null : s1;
    }

    class androidx.core.text.util.LocalePreferences.1 {
        static final int[] a;

        static {
            int[] arr_v = new int[DateFormat.HourCycle.values().length];
            androidx.core.text.util.LocalePreferences.1.a = arr_v;
            try {
                arr_v[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                androidx.core.text.util.LocalePreferences.1.a[1] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                androidx.core.text.util.LocalePreferences.1.a[2] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                androidx.core.text.util.LocalePreferences.1.a[3] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

