package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

public final class m {
    public static void a(boolean z) {
        m.b(z, "");
    }

    public static void b(boolean z, @NonNull String s) {
        if(!z) {
            throw new IllegalArgumentException(s);
        }
    }

    @NonNull
    public static String c(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return s;
    }

    @NonNull
    public static Collection d(@NonNull Collection collection0) {
        if(collection0.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection0;
    }

    @NonNull
    public static Object e(@Nullable Object object0) {
        return m.f(object0, "Argument must not be null");
    }

    @NonNull
    public static Object f(@Nullable Object object0, @NonNull String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }
}

