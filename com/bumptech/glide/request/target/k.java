package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

public class k {
    @NonNull
    public r a(@NonNull ImageView imageView0, @NonNull Class class0) {
        if(Bitmap.class.equals(class0)) {
            return new c(imageView0);
        }
        if(!Drawable.class.isAssignableFrom(class0)) {
            throw new IllegalArgumentException("Unhandled class: " + class0 + ", try .as*(Class).transcode(ResourceTranscoder)");
        }
        return new g(imageView0);
    }
}

