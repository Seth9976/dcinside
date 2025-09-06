package com.coupang.ads.view.banner.auto;

import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final BannerItemView a;

    public d(BannerItemView bannerItemView0) {
        this.a = bannerItemView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        BannerItemView.h(this.a, view0);
    }
}

