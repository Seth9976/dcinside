package com.dcinside.app.auth;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class l implements ViewTreeObserver.OnGlobalLayoutListener {
    public final m a;

    public l(m m0) {
        this.a = m0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m.v0(this.a);
    }
}

