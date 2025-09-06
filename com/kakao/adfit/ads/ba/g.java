package com.kakao.adfit.ads.ba;

import com.kakao.adfit.a.q.f;
import com.kakao.adfit.a.q;

public final class g implements f {
    public final q a;
    public final BannerAdView b;
    public final d c;

    public g(q q0, BannerAdView bannerAdView0, d d0) {
        this.a = q0;
        this.b = bannerAdView0;
        this.c = d0;
    }

    @Override  // com.kakao.adfit.a.q$f
    public final void a(String s) {
        BannerAdView.b(this.a, this.b, this.c, s);
    }
}

