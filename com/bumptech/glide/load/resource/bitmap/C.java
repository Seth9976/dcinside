package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.resource.drawable.j;
import com.bumptech.glide.util.o;

public class c extends j implements r {
    private final e b;

    public c(BitmapDrawable bitmapDrawable0, e e0) {
        super(bitmapDrawable0);
        this.b = e0;
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Class a() {
        return BitmapDrawable.class;
    }

    @Override  // com.bumptech.glide.load.engine.v
    public int getSize() {
        return o.i(((BitmapDrawable)this.a).getBitmap());
    }

    @Override  // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.r
    public void initialize() {
        ((BitmapDrawable)this.a).getBitmap().prepareToDraw();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public void recycle() {
        Bitmap bitmap0 = ((BitmapDrawable)this.a).getBitmap();
        this.b.e(bitmap0);
    }
}

