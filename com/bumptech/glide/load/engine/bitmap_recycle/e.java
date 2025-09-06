package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

public interface e {
    long a();

    void b(int arg1);

    void c();

    void d(float arg1);

    void e(Bitmap arg1);

    @NonNull
    Bitmap f(int arg1, int arg2, Bitmap.Config arg3);

    @NonNull
    Bitmap g(int arg1, int arg2, Bitmap.Config arg3);
}

