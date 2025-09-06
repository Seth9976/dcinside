package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

public class f implements e {
    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long a() {
        return 0L;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b(int v) {
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void c() {
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void d(float f) {
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void e(Bitmap bitmap0) {
        bitmap0.recycle();
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    @NonNull
    public Bitmap f(int v, int v1, Bitmap.Config bitmap$Config0) {
        return Bitmap.createBitmap(v, v1, bitmap$Config0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    @NonNull
    public Bitmap g(int v, int v1, Bitmap.Config bitmap$Config0) {
        return this.f(v, v1, bitmap$Config0);
    }
}

