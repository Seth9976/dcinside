package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;

public interface f {
    public interface a {
        void a(Drawable arg1);

        @Nullable
        Drawable b();

        View getView();
    }

    boolean a(Object arg1, a arg2);
}

