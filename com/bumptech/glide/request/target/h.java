package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class h extends q {
    public h(ImageView imageView0) {
        super(imageView0);
    }

    @Deprecated
    public h(ImageView imageView0, boolean z) {
        super(imageView0, z);
    }

    @Override  // com.bumptech.glide.request.target.q
    protected Drawable o(Object object0) {
        return this.p(((Drawable)object0));
    }

    protected Drawable p(Drawable drawable0) {
        return drawable0;
    }
}

