package com.google.firebase.perf.util;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final d a;
    public final View b;

    public c(d d0, View view0) {
        this.a = d0;
        this.b = view0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.d(this.b);
    }
}

