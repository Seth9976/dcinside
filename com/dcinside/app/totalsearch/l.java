package com.dcinside.app.totalsearch;

import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;

public final class l implements View.OnClickListener {
    public final TotalSearchActivity a;
    public final MenuItem b;

    public l(TotalSearchActivity totalSearchActivity0, MenuItem menuItem0) {
        this.a = totalSearchActivity0;
        this.b = menuItem0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.p2(this.b, view0);
    }
}

