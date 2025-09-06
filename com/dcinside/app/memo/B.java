package com.dcinside.app.memo;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final d a;

    public b(d d0) {
        this.a = d0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d.v0(this.a);
    }
}

