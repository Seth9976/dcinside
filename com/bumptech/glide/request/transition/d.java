package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public class d implements f {
    private final int a;
    private final boolean b;

    public d(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override  // com.bumptech.glide.request.transition.f
    public boolean a(Object object0, a f$a0) {
        return this.b(((Drawable)object0), f$a0);
    }

    public boolean b(Drawable drawable0, a f$a0) {
        Drawable drawable1 = f$a0.b();
        if(drawable1 == null) {
            drawable1 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable0 = new TransitionDrawable(new Drawable[]{drawable1, drawable0});
        transitionDrawable0.setCrossFadeEnabled(this.b);
        transitionDrawable0.startTransition(this.a);
        f$a0.a(transitionDrawable0);
        return true;
    }
}

