package com.dcinside.app.memo;

import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public final class a implements View.OnApplyWindowInsetsListener {
    public final d a;

    public a(d d0) {
        this.a = d0;
    }

    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        return d.s0(this.a, view0, windowInsets0);
    }
}

