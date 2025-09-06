package com.dcinside.app.totalsearch;

import android.view.View.OnClickListener;
import android.view.View;

public final class p implements View.OnClickListener {
    public final TotalSearchActivity a;

    public p(TotalSearchActivity totalSearchActivity0) {
        this.a = totalSearchActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.g2(view0);
    }
}

