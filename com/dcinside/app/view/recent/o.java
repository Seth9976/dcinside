package com.dcinside.app.view.recent;

import android.view.View.OnClickListener;
import android.view.View;

public final class o implements View.OnClickListener {
    public final RecentMenuView a;

    public o(RecentMenuView recentMenuView0) {
        this.a = recentMenuView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.w(view0);
    }
}

