package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class c extends j {
    public c(ImageView imageView0) {
        super(imageView0);
    }

    @Deprecated
    public c(ImageView imageView0, boolean z) {
        super(imageView0, z);
    }

    @Override  // com.bumptech.glide.request.target.j
    protected void m(Object object0) {
        this.o(((Bitmap)object0));
    }

    protected void o(Bitmap bitmap0) {
        ((ImageView)this.b).setImageBitmap(bitmap0);
    }
}

