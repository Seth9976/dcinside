package com.bumptech.glide.load.resource.transcode;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.resource.bitmap.h;

public final class c implements e {
    private final com.bumptech.glide.load.engine.bitmap_recycle.e a;
    private final e b;
    private final e c;

    public c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e e0, @NonNull e e1, @NonNull e e2) {
        this.a = e0;
        this.b = e1;
        this.c = e2;
    }

    @Override  // com.bumptech.glide.load.resource.transcode.e
    @Nullable
    public v a(@NonNull v v0, @NonNull j j0) {
        Drawable drawable0 = (Drawable)v0.get();
        if(drawable0 instanceof BitmapDrawable) {
            h h0 = h.c(((BitmapDrawable)drawable0).getBitmap(), this.a);
            return this.b.a(h0, j0);
        }
        return drawable0 instanceof com.bumptech.glide.load.resource.gif.c ? this.c.a(v0, j0) : null;
    }

    @NonNull
    private static v b(@NonNull v v0) [...] // Inlined contents
}

