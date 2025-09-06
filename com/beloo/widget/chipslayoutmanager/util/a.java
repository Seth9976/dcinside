package com.beloo.widget.chipslayoutmanager.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class a {
    public static void a(@NonNull Object object0, @NonNull Class class0, @NonNull String s) throws AssertionError {
        a.e(!class0.isInstance(object0), s + " is not instance of " + class0.getName() + ".");
    }

    public static void b(String s, String s1) throws AssertionError {
        a.e(TextUtils.isEmpty(s) || TextUtils.isEmpty(s.trim()), s1 + " can\'t be empty.");
    }

    public static void c(@NonNull Object object0, @NonNull Object object1, @NonNull String s) throws AssertionError {
        a.e(object0 == object1 || object0.equals(object1), s + " can\'t be equal to " + object1 + ".");
    }

    public static void d(@Nullable Object object0, @NonNull String s) throws AssertionError {
        if(object0 == null) {
            throw new AssertionError(s + " can\'t be null.");
        }
    }

    public static void e(boolean z, @NonNull String s) {
        if(z) {
            throw new AssertionError(s);
        }
    }
}

