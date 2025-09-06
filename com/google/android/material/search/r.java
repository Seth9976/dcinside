package com.google.android.material.search;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.M.d;
import com.google.android.material.internal.M.e;

public final class r implements d {
    public final SearchView a;

    public r(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // com.google.android.material.internal.M$d
    public final WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0, e m$e0) {
        return this.a.O(view0, windowInsetsCompat0, m$e0);
    }
}

