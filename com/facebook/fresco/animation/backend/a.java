package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import o3.h;

public interface a extends d {
    public interface com.facebook.fresco.animation.backend.a.a {
        void a();
    }

    public static final int a = -1;

    void clear();

    int d();

    int e();

    void f(Rect arg1);

    void g(@h ColorFilter arg1);

    void i(@h com.facebook.fresco.animation.backend.a.a arg1);

    void j();

    void l(@IntRange(from = 0L, to = 0xFFL) int arg1);

    boolean n(Drawable arg1, Canvas arg2, int arg3);

    int z();
}

