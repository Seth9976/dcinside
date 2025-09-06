package com.kakao.adfit.ads.ba;

import com.kakao.adfit.a.q.d;
import com.kakao.adfit.a.q;

public final class i implements d {
    public final q a;
    public final BannerAdView b;
    public final com.kakao.adfit.ads.ba.d c;

    public i(q q0, BannerAdView bannerAdView0, com.kakao.adfit.ads.ba.d d0) {
        this.a = q0;
        this.b = bannerAdView0;
        this.c = d0;
    }

    @Override  // com.kakao.adfit.a.q$d
    public final void a(String s) {
        BannerAdView.a(this.a, this.b, this.c, s);
    }
}

