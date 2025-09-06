package com.dcinside.app.totalsearch;

import android.view.View.OnClickListener;
import android.view.View;

public final class m implements View.OnClickListener {
    public final TotalSearchActivity a;

    public m(TotalSearchActivity totalSearchActivity0) {
        this.a = totalSearchActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.l2(view0);
    }
}

