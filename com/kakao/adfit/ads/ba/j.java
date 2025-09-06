package com.kakao.adfit.ads.ba;

import com.kakao.adfit.a.q.g;
import com.kakao.adfit.a.q;

public final class j implements g {
    public final q a;
    public final BannerAdView b;
    public final d c;

    public j(q q0, BannerAdView bannerAdView0, d d0) {
        this.a = q0;
        this.b = bannerAdView0;
        this.c = d0;
    }

    @Override  // com.kakao.adfit.a.q$g
    public final void a() {
        BannerAdView.a(this.a, this.b, this.c);
    }
}

