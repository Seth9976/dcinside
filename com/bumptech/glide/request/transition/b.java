package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

public class b extends a {
    public b(@NonNull g g0) {
        super(g0);
    }

    @Override  // com.bumptech.glide.request.transition.a
    @NonNull
    protected Bitmap b(@NonNull Object object0) {
        return this.c(((Bitmap)object0));
    }

    @NonNull
    protected Bitmap c(@NonNull Bitmap bitmap0) {
        return bitmap0;
    }
}

