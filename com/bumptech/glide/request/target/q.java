package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import androidx.annotation.Nullable;

public abstract class q extends j {
    public q(ImageView imageView0) {
        super(imageView0);
    }

    @Deprecated
    public q(ImageView imageView0, boolean z) {
        super(imageView0, z);
    }

    @Override  // com.bumptech.glide.request.target.j
    protected void m(@Nullable Object object0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((ImageView)this.b).getLayoutParams();
        Drawable drawable0 = this.o(object0);
        if(viewGroup$LayoutParams0 != null && viewGroup$LayoutParams0.width > 0 && viewGroup$LayoutParams0.height > 0) {
            drawable0 = new i(drawable0, viewGroup$LayoutParams0.width, viewGroup$LayoutParams0.height);
        }
        ((ImageView)this.b).setImageDrawable(drawable0);
    }

    protected abstract Drawable o(Object arg1);
}

