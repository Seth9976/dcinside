package com.vungle.ads.internal;

import android.view.ViewTreeObserver.OnPreDrawListener;

public final class n implements ViewTreeObserver.OnPreDrawListener {
    public final o a;

    public n(o o0) {
        this.a = o0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        return o._init_$lambda-0(this.a);
    }
}

