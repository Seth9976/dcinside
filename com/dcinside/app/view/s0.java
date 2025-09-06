package com.dcinside.app.view;

import android.view.View.OnClickListener;
import android.view.View;

public final class s0 implements View.OnClickListener {
    public final ShareView a;

    public s0(ShareView shareView0) {
        this.a = shareView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ShareView.J(this.a, view0);
    }
}

