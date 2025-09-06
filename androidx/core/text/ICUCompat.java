package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ICUCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static String a(Locale locale0) {
            return locale0.getScript();
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static ULocale a(Object object0) {
            return ULocale.addLikelySubtags(((ULocale)object0));
        }

        static ULocale b(Locale locale0) {
            return ULocale.forLocale(locale0);
        }

        static String c(Object object0) {
            return ((ULocale)object0).getScript();
        }
    }

    private static final String a = "ICUCompat";
    private static Method b;
    private static Method c;

    static {
        if(Build.VERSION.SDK_INT < 24) {
            try {
                ICUCompat.c = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            }
            catch(Exception exception0) {
                throw new IllegalStateException(exception0);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String a(Locale locale0) {
        String s = locale0.toString();
        Method method0 = ICUCompat.c;
        if(method0 != null) {
            try {
                return (String)method0.invoke(null, s);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.w("ICUCompat", illegalAccessException0);
                return s;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.w("ICUCompat", invocationTargetException0);
                return s;
            }
        }
        return s;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String b(String s) {
        Method method0 = ICUCompat.b;
        if(method0 != null) {
            try {
                return (String)method0.invoke(null, s);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.w("ICUCompat", illegalAccessException0);
                return null;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.w("ICUCompat", invocationTargetException0);
                return null;
            }
        }
        return null;
    }

    public static String c(Locale locale0) {
        if(Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.c(Api24Impl.a(Api24Impl.b(locale0)));
        }
        try {
            return Api21Impl.a(((Locale)ICUCompat.c.invoke(null, locale0)));
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w("ICUCompat", invocationTargetException0);
            return Api21Impl.a(locale0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("ICUCompat", illegalAccessException0);
            return Api21Impl.a(locale0);
        }
    }
}

