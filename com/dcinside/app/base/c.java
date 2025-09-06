package com.dcinside.app.base;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class c implements OnApplyWindowInsetsListener {
    public final d a;

    public c(d d0) {
        this.a = d0;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
        return d.w1(this.a, view0, windowInsetsCompat0);
    }
}

