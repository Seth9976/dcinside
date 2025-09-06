package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

public class g extends j {
    public g(ImageView imageView0) {
        super(imageView0);
    }

    @Deprecated
    public g(ImageView imageView0, boolean z) {
        super(imageView0, z);
    }

    @Override  // com.bumptech.glide.request.target.j
    protected void m(@Nullable Object object0) {
        this.o(((Drawable)object0));
    }

    protected void o(@Nullable Drawable drawable0) {
        ((ImageView)this.b).setImageDrawable(drawable0);
    }
}

