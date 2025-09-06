package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.motion.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

interface c extends b {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.sidesheet.c.b {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.sidesheet.c.c {
    }

    public static final int u2 = 1;
    public static final int v2 = 2;
    public static final int w2 = 3;
    public static final int x2 = 5;
    public static final int y2 = 0;
    public static final int z2 = 1;

    void a(d arg1);

    void e(d arg1);

    void g(int arg1);

    int getState();
}

