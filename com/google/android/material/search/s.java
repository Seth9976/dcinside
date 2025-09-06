package com.google.android.material.search;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class s implements OnApplyWindowInsetsListener {
    public final SearchView a;

    public s(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
        return this.a.N(view0, windowInsetsCompat0);
    }
}

