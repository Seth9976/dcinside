package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({Scope.c})
public final class Preconditions {
    public static void a(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static void c(boolean z, String s, Object[] arr_object) {
        if(!z) {
            throw new IllegalArgumentException(String.format(s, arr_object));
        }
    }

    public static float d(float f, String s) {
        if(Float.isNaN(f)) {
            throw new IllegalArgumentException(s + " must not be NaN");
        }
        if(Float.isInfinite(f)) {
            throw new IllegalArgumentException(s + " must not be infinite");
        }
        return f;
    }

    public static double e(double f, double f1, double f2, String s) {
        if(f < f1) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", s, f1, f2));
        }
        if(f > f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", s, f1, f2));
        }
        return f;
    }

    public static float f(float f, float f1, float f2, String s) {
        if(f < f1) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", s, f1, f2));
        }
        if(f > f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", s, f1, f2));
        }
        return f;
    }

    public static int g(int v, int v1, int v2, String s) {
        if(v < v1) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", s, v1, v2));
        }
        if(v > v2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", s, v1, v2));
        }
        return v;
    }

    public static long h(long v, long v1, long v2, String s) {
        if(v < v1) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", s, v1, v2));
        }
        if(v > v2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", s, v1, v2));
        }
        return v;
    }

    @IntRange(from = 0L)
    public static int i(int v) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        return v;
    }

    @IntRange(from = 0L)
    public static int j(int v, String s) {
        if(v < 0) {
            throw new IllegalArgumentException(s);
        }
        return v;
    }

    public static int k(int v, int v1) {
        if((v & v1) != v) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(v) + ", but only 0x" + Integer.toHexString(v1) + " are allowed");
        }
        return v;
    }

    public static Object l(Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object m(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    public static void n(boolean z) {
        Preconditions.o(z, null);
    }

    public static void o(boolean z, String s) {
        if(!z) {
            throw new IllegalStateException(s);
        }
    }

    public static CharSequence p(CharSequence charSequence0) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException();
        }
        return charSequence0;
    }

    public static CharSequence q(CharSequence charSequence0, Object object0) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return charSequence0;
    }

    public static CharSequence r(CharSequence charSequence0, String s, Object[] arr_object) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException(String.format(s, arr_object));
        }
        return charSequence0;
    }
}

