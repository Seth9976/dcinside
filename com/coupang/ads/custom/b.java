package com.coupang.ads.custom;

import android.view.View.OnClickListener;
import android.view.View;

public final class b implements View.OnClickListener {
    public final AdsProductLayout a;

    public b(AdsProductLayout adsProductLayout0) {
        this.a = adsProductLayout0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        AdsProductLayout.viewClickListener$lambda-0(this.a, view0);
    }
}

