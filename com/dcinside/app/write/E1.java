package com.dcinside.app.write;

import android.view.View.OnLayoutChangeListener;
import android.view.View;

public final class e1 implements View.OnLayoutChangeListener {
    public final h1 a;

    public e1(h1 h10) {
        this.a = h10;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        h1.t(this.a, view0, v, v1, v2, v3, v4, v5, v6, v7);
    }
}

