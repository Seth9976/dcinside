package com.google.android.material.timepicker;

import androidx.annotation.IntRange;
import androidx.annotation.StringRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

interface j {
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void d(int arg1);

    void e(int arg1, int arg2, @IntRange(from = 0L) int arg3);

    void f(String[] arg1, @StringRes int arg2);

    void o(float arg1);
}

