package com.google.android.material.snackbar;

import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final Snackbar a;
    public final View.OnClickListener b;

    public d(Snackbar snackbar0, View.OnClickListener view$OnClickListener0) {
        this.a = snackbar0;
        this.b = view$OnClickListener0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.B0(this.b, view0);
    }
}

