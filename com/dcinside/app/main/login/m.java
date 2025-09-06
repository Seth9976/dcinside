package com.dcinside.app.main.login;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final o a;

    public m(o o0) {
        this.a = o0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        o.X0(this.a);
    }
}

