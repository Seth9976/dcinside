package com.coupang.ads.view.banner.auto;

import e3.g;

public final class b implements g {
    public final AutoScrollBannerView a;

    public b(AutoScrollBannerView autoScrollBannerView0) {
        this.a = autoScrollBannerView0;
    }

    @Override  // e3.g
    public final void accept(Object object0) {
        AutoScrollBannerView.o(this.a, ((Long)object0));
    }
}

