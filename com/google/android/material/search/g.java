package com.google.android.material.search;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public final class g implements Runnable {
    public final j a;
    public final SearchBar b;
    public final View c;
    public final AppBarLayout d;
    public final boolean e;

    public g(j j0, SearchBar searchBar0, View view0, AppBarLayout appBarLayout0, boolean z) {
        this.a = j0;
        this.b = searchBar0;
        this.c = view0;
        this.d = appBarLayout0;
        this.e = z;
    }

    @Override
    public final void run() {
        this.a.C(this.b, this.c, this.d, this.e);
    }
}

