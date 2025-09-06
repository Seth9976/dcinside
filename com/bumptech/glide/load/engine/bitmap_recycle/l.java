package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;

interface l {
    String a(int arg1, int arg2, Bitmap.Config arg3);

    int b(Bitmap arg1);

    String c(Bitmap arg1);

    void e(Bitmap arg1);

    @Nullable
    Bitmap f(int arg1, int arg2, Bitmap.Config arg3);

    @Nullable
    Bitmap removeLast();
}

