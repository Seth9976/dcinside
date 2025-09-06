package com.dcinside.app.view;

import android.view.View.OnClickListener;
import android.view.View;

public final class y0 implements View.OnClickListener {
    public final ShareView a;

    public y0(ShareView shareView0) {
        this.a = shareView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ShareView.P(this.a, view0);
    }
}

