package com.coupang.ads.view.base;

import android.view.View.OnClickListener;
import android.view.View;

public final class b implements View.OnClickListener {
    public final AdsBaseView a;

    public b(AdsBaseView adsBaseView0) {
        this.a = adsBaseView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        AdsBaseView.c(this.a, view0);
    }
}

