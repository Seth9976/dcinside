package com.tbuonomo.viewpagerdotsindicator;

import android.view.View.OnClickListener;
import android.view.View;

public final class h implements View.OnClickListener {
    public final SpringDotsIndicator a;
    public final int b;

    public h(SpringDotsIndicator springDotsIndicator0, int v) {
        this.a = springDotsIndicator0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SpringDotsIndicator.x(this.a, this.b, view0);
    }
}

