package com.dcinside.app.view.popupmenu;

import android.view.View.OnClickListener;
import android.view.View;

public final class g implements View.OnClickListener {
    public final j a;
    public final String b;

    public g(j j0, String s) {
        this.a = j0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        j.z0(this.a, this.b, view0);
    }
}

