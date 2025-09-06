package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;

final class l extends j {
    private l(Drawable drawable0) {
        super(drawable0);
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Class a() {
        return this.a.getClass();
    }

    @Nullable
    static v c(@Nullable Drawable drawable0) {
        return drawable0 != null ? new l(drawable0) : null;
    }

    @Override  // com.bumptech.glide.load.engine.v
    public int getSize() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    @Override  // com.bumptech.glide.load.engine.v
    public void recycle() {
    }
}

