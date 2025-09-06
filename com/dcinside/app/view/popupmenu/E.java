package com.dcinside.app.view.popupmenu;

import android.view.View.OnClickListener;
import android.view.View;

public final class e implements View.OnClickListener {
    public final j a;
    public final String b;

    public e(j j0, String s) {
        this.a = j0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        j.x0(this.a, this.b, view0);
    }
}

