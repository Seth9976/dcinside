package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;

abstract class h {
    public static class a {
        @FloatRange(from = 0.0, to = 1.0)
        float a;
        @FloatRange(from = 0.0, to = 1.0)
        float b;
        @ColorInt
        int c;
        @Px
        int d;

    }

    c a;

    public h(c c0) {
        this.a = c0;
    }

    abstract void a(@NonNull Canvas arg1, @NonNull Rect arg2, @FloatRange(from = -1.0, to = 1.0) float arg3, boolean arg4, boolean arg5);

    abstract void b(@NonNull Canvas arg1, @NonNull Paint arg2, @ColorInt int arg3, @IntRange(from = 0L, to = 0xFFL) int arg4);

    abstract void c(@NonNull Canvas arg1, @NonNull Paint arg2, @NonNull a arg3, @IntRange(from = 0L, to = 0xFFL) int arg4);

    abstract void d(@NonNull Canvas arg1, @NonNull Paint arg2, @FloatRange(from = 0.0, to = 1.0) float arg3, @FloatRange(from = 0.0, to = 1.0) float arg4, @ColorInt int arg5, @IntRange(from = 0L, to = 0xFFL) int arg6, @Px int arg7);

    abstract int e();

    abstract int f();

    void g(@NonNull Canvas canvas0, @NonNull Rect rect0, @FloatRange(from = 0.0, to = 1.0) float f, boolean z, boolean z1) {
        this.a.e();
        this.a(canvas0, rect0, f, z, z1);
    }
}

