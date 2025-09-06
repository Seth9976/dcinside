package com.dcinside.app.image.edit;

import android.view.View.OnClickListener;
import android.view.View;

public final class c implements View.OnClickListener {
    public final d a;
    public final View b;
    public final b c;

    public c(d d0, View view0, b b0) {
        this.a = d0;
        this.b = view0;
        this.c = b0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.F(this.b, this.c, view0);
    }
}

