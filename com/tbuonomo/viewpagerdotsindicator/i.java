package com.tbuonomo.viewpagerdotsindicator;

import android.view.View.OnClickListener;
import android.view.View;

public final class i implements View.OnClickListener {
    public final WormDotsIndicator a;
    public final int b;

    public i(WormDotsIndicator wormDotsIndicator0, int v) {
        this.a = wormDotsIndicator0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        WormDotsIndicator.z(this.a, this.b, view0);
    }
}

