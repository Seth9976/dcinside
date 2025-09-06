package com.dcinside.app.post.fragments;

import android.view.View.OnClickListener;
import android.view.View;
import com.dcinside.app.post.d1;

public final class c4 implements View.OnClickListener {
    public final d4 a;
    public final d1 b;

    public c4(d4 d40, d1 d10) {
        this.a = d40;
        this.b = d10;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        d4.E(this.a, this.b, view0);
    }
}

