package com.dcinside.app.bookmark;

import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final BookmarkSettingActivity a;
    public final MenuItem b;

    public d(BookmarkSettingActivity bookmarkSettingActivity0, MenuItem menuItem0) {
        this.a = bookmarkSettingActivity0;
        this.b = menuItem0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        BookmarkSettingActivity.m2(this.a, this.b, view0);
    }
}

