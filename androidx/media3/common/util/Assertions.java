package androidx.media3.common.util;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import w4.d;

@UnstableApi
public final class Assertions {
    @d
    public static void a(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    @d
    public static void b(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    @d
    public static int c(int v, int v1, int v2) {
        if(v < v1 || v >= v2) {
            throw new IndexOutOfBoundsException();
        }
        return v;
    }

    @d
    public static void d() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    @h4.d({"#1"})
    @d
    public static String e(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException();
        }
        return s;
    }

    @h4.d({"#1"})
    @d
    public static String f(@Nullable String s, Object object0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return s;
    }

    @h4.d({"#1"})
    @d
    public static Object g(@Nullable Object object0) {
        object0.getClass();
        return object0;
    }

    @h4.d({"#1"})
    @d
    public static Object h(@Nullable Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    @d
    public static void i(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    @d
    public static void j(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }

    @h4.d({"#1"})
    @d
    public static Object k(@Nullable Object object0) {
        if(object0 == null) {
            throw new IllegalStateException();
        }
        return object0;
    }

    @h4.d({"#1"})
    @d
    public static Object l(@Nullable Object object0, Object object1) {
        if(object0 == null) {
            throw new IllegalStateException(String.valueOf(object1));
        }
        return object0;
    }
}

