package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.o;

public abstract class e implements p {
    private final int a;
    private final int b;
    @Nullable
    private com.bumptech.glide.request.e c;

    public e() {
        this(0x80000000, 0x80000000);
    }

    public e(int v, int v1) {
        if(!o.x(v, v1)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + v + " and height: " + v1);
        }
        this.a = v;
        this.b = v1;
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void A(@NonNull com.bumptech.glide.request.target.o o0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public void D(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void E(@Nullable com.bumptech.glide.request.e e0) {
        this.c = e0;
    }

    @Override  // com.bumptech.glide.request.target.p
    public void F(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void G(@NonNull com.bumptech.glide.request.target.o o0) {
        o0.d(this.a, this.b);
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
    public final com.bumptech.glide.request.e z() {
        return this.c;
    }
}

