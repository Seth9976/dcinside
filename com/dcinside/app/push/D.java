package com.dcinside.app.push;

import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final ArticlePostListActivity a;
    public final MenuItem b;

    public d(ArticlePostListActivity articlePostListActivity0, MenuItem menuItem0) {
        this.a = articlePostListActivity0;
        this.b = menuItem0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ArticlePostListActivity.Z1(this.a, this.b, view0);
    }
}

