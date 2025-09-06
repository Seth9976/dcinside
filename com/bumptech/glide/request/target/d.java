package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class d extends q {
    public d(ImageView imageView0) {
        super(imageView0);
    }

    @Deprecated
    public d(ImageView imageView0, boolean z) {
        super(imageView0, z);
    }

    @Override  // com.bumptech.glide.request.target.q
    protected Drawable o(Object object0) {
        return this.p(((Bitmap)object0));
    }

    protected Drawable p(Bitmap bitmap0) {
        return new BitmapDrawable(((ImageView)this.b).getResources(), bitmap0);
    }
}

