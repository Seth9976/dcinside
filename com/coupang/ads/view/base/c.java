package com.coupang.ads.view.base;

import androidx.lifecycle.Observer;
import kotlin.e0;

public final class c implements Observer {
    public final AdsBaseView a;

    public c(AdsBaseView adsBaseView0) {
        this.a = adsBaseView0;
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        com.coupang.ads.view.base.AdsBaseView.c.c(this.a, ((e0)object0));
    }
}

