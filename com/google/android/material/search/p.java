package com.google.android.material.search;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class p implements OnApplyWindowInsetsListener {
    public final ViewGroup.MarginLayoutParams a;
    public final int b;
    public final int c;

    public p(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1) {
        this.a = viewGroup$MarginLayoutParams0;
        this.b = v;
        this.c = v1;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
        return SearchView.L(this.a, this.b, this.c, view0, windowInsetsCompat0);
    }
}

