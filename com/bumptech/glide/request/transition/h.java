package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class h implements g {
    static class a implements com.bumptech.glide.request.transition.k.a {
        private final Animation a;

        a(Animation animation0) {
            this.a = animation0;
        }

        @Override  // com.bumptech.glide.request.transition.k$a
        public Animation a(Context context0) {
            return this.a;
        }
    }

    static class b implements com.bumptech.glide.request.transition.k.a {
        private final int a;

        b(int v) {
            this.a = v;
        }

        @Override  // com.bumptech.glide.request.transition.k$a
        public Animation a(Context context0) {
            return AnimationUtils.loadAnimation(context0, this.a);
        }
    }

    private final com.bumptech.glide.request.transition.k.a a;
    private f b;

    public h(int v) {
        this(new b(v));
    }

    public h(Animation animation0) {
        this(new a(animation0));
    }

    h(com.bumptech.glide.request.transition.k.a k$a0) {
        this.a = k$a0;
    }

    @Override  // com.bumptech.glide.request.transition.g
    public f a(com.bumptech.glide.load.a a0, boolean z) {
        if(a0 != com.bumptech.glide.load.a.e && z) {
            if(this.b == null) {
                this.b = new k(this.a);
            }
            return this.b;
        }
        return e.b();
    }
}

