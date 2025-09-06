package com.dcinside.app.util.easysnackbar;

import android.view.View.OnLayoutChangeListener;
import android.view.View;

public final class c implements View.OnLayoutChangeListener {
    public final d a;

    public c(d d0) {
        this.a = d0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        this.a.s(view0, v, v1, v2, v3, v4, v5, v6, v7);
    }
}

