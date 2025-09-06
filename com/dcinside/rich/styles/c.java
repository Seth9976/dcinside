package com.dcinside.rich.styles;

import android.view.View.OnClickListener;
import android.view.View;

public final class c implements View.OnClickListener {
    public final d a;

    public c(d d0) {
        this.a = d0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        d.n(this.a, view0);
    }
}

