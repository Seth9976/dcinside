package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public abstract class a implements g {
    final class com.bumptech.glide.request.transition.a.a implements f {
        private final f a;
        final a b;

        com.bumptech.glide.request.transition.a.a(f f0) {
            this.a = f0;
        }

        @Override  // com.bumptech.glide.request.transition.f
        public boolean a(Object object0, com.bumptech.glide.request.transition.f.a f$a0) {
            BitmapDrawable bitmapDrawable0 = new BitmapDrawable(f$a0.getView().getResources(), a.this.b(object0));
            return this.a.a(bitmapDrawable0, f$a0);
        }
    }

    private final g a;

    public a(g g0) {
        this.a = g0;
    }

    @Override  // com.bumptech.glide.request.transition.g
    public f a(com.bumptech.glide.load.a a0, boolean z) {
        return new com.bumptech.glide.request.transition.a.a(this, this.a.a(a0, z));
    }

    protected abstract Bitmap b(Object arg1);
}

