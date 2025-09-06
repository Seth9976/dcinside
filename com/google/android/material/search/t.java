package com.google.android.material.search;

import android.view.View.OnClickListener;
import android.view.View;

public final class t implements View.OnClickListener {
    public final SearchView a;

    public t(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.P(view0);
    }
}

