package com.dcinside.app.gif;

import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;

public final class n implements View.OnClickListener {
    public final d a;
    public final MenuItem b;

    public n(d m$d0, MenuItem menuItem0) {
        this.a = m$d0;
        this.b = menuItem0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        d.f(this.a, this.b, view0);
    }
}

