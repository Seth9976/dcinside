package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

public class k implements f {
    interface a {
        Animation a(Context arg1);
    }

    private final a a;

    k(a k$a0) {
        this.a = k$a0;
    }

    @Override  // com.bumptech.glide.request.transition.f
    public boolean a(Object object0, com.bumptech.glide.request.transition.f.a f$a0) {
        View view0 = f$a0.getView();
        if(view0 != null) {
            view0.clearAnimation();
            Context context0 = view0.getContext();
            view0.startAnimation(this.a.a(context0));
        }
        return false;
    }
}

