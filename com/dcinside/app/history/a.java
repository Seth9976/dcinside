package com.dcinside.app.history;

import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;

public final class a implements View.OnClickListener {
    public final PostHistoryActivity a;
    public final MenuItem b;

    public a(PostHistoryActivity postHistoryActivity0, MenuItem menuItem0) {
        this.a = postHistoryActivity0;
        this.b = menuItem0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        PostHistoryActivity.q2(this.a, this.b, view0);
    }
}

