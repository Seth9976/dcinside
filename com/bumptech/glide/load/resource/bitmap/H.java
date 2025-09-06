package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.o;

public class h implements r, v {
    private final Bitmap a;
    private final e b;

    public h(@NonNull Bitmap bitmap0, @NonNull e e0) {
        this.a = (Bitmap)m.f(bitmap0, "Bitmap must not be null");
        this.b = (e)m.f(e0, "BitmapPool must not be null");
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Class a() {
        return Bitmap.class;
    }

    @NonNull
    public Bitmap b() {
        return this.a;
    }

    @Nullable
    public static h c(@Nullable Bitmap bitmap0, @NonNull e e0) {
        return bitmap0 == null ? null : new h(bitmap0, e0);
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Object get() {
        return this.b();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public int getSize() {
        return o.i(this.a);
    }

    @Override  // com.bumptech.glide.load.engine.r
    public void initialize() {
        this.a.prepareToDraw();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public void recycle() {
        this.b.e(this.a);
    }
}

