package com.dcinside.app.view.popupmenu;

import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final j a;
    public final String b;
    public final String c;

    public d(j j0, String s, String s1) {
        this.a = j0;
        this.b = s;
        this.c = s1;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        j.w0(this.a, this.b, this.c, view0);
    }
}

