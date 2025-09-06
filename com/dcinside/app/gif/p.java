package com.dcinside.app.gif;

import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;

public final class p implements View.OnClickListener {
    public final e a;
    public final MenuItem b;

    public p(e o$e0, MenuItem menuItem0) {
        this.a = o$e0;
        this.b = menuItem0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        e.f(this.a, this.b, view0);
    }
}

