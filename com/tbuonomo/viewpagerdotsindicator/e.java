package com.tbuonomo.viewpagerdotsindicator;

import android.view.View.OnClickListener;
import android.view.View;

public final class e implements View.OnClickListener {
    public final DotsIndicator a;
    public final int b;

    public e(DotsIndicator dotsIndicator0, int v) {
        this.a = dotsIndicator0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        DotsIndicator.z(this.a, this.b, view0);
    }
}

