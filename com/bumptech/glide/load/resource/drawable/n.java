package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.IOException;

public class n implements l {
    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((Drawable)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    @Nullable
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((Drawable)object0), v, v1, j0);
    }

    @Nullable
    public v c(@NonNull Drawable drawable0, int v, int v1, @NonNull j j0) {
        return com.bumptech.glide.load.resource.drawable.l.c(drawable0);
    }

    public boolean d(@NonNull Drawable drawable0, @NonNull j j0) {
        return true;
    }
}

