package com.dcinside.app.image;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final e a;

    public d(e e0) {
        this.a = e0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e.u0(this.a);
    }
}

