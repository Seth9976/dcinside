package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.e;

@Deprecated
public abstract class b implements p {
    private e a;

    @Override  // com.bumptech.glide.request.target.p
    public void B(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public void D(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public void E(@Nullable e e0) {
        this.a = e0;
    }

    @Override  // com.bumptech.glide.request.target.p
    public void F(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override  // com.bumptech.glide.request.target.p
    @Nullable
    public e z() {
        return this.a;
    }
}

