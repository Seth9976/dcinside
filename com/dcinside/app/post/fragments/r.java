package com.dcinside.app.post.fragments;

import android.view.View.OnClickListener;
import android.view.View;

public final class r implements View.OnClickListener {
    public final u a;
    public final String b;

    public r(u u0, String s) {
        this.a = u0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        u.z0(this.a, this.b, view0);
    }
}

