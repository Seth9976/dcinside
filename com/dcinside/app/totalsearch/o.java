package com.dcinside.app.totalsearch;

import android.view.View.OnClickListener;
import android.view.View;

public final class o implements View.OnClickListener {
    public final TotalSearchActivity a;

    public o(TotalSearchActivity totalSearchActivity0) {
        this.a = totalSearchActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.m2(view0);
    }
}

