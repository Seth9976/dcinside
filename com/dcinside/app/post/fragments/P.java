package com.dcinside.app.post.fragments;

import android.view.View.OnFocusChangeListener;
import android.view.View;

public final class p implements View.OnFocusChangeListener {
    public final u a;

    public p(u u0) {
        this.a = u0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        u.x0(this.a, view0, z);
    }
}

