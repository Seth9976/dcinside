package com.dcinside.app;

import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;

public final class c implements View.OnClickListener {
    public final GuestInfoActivity a;
    public final MenuItem b;

    public c(GuestInfoActivity guestInfoActivity0, MenuItem menuItem0) {
        this.a = guestInfoActivity0;
        this.b = menuItem0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        GuestInfoActivity.J1(this.a, this.b, view0);
    }
}

