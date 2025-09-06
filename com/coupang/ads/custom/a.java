package com.coupang.ads.custom;

import android.view.View.OnClickListener;
import android.view.View;

public final class a implements View.OnClickListener {
    public final AdsPlacementLayout a;

    public a(AdsPlacementLayout adsPlacementLayout0) {
        this.a = adsPlacementLayout0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        AdsPlacementLayout.viewClickListener$lambda-0(this.a, view0);
    }
}

