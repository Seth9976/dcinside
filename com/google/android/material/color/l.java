package com.google.android.material.color;

import android.os.Build.VERSION;
import androidx.annotation.Nullable;

public final class l {
    @Nullable
    public static m a() {
        int v = Build.VERSION.SDK_INT;
        if(30 <= v && v <= 33) {
            return w.c();
        }
        return v < 34 ? null : w.c();
    }
}

