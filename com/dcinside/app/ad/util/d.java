package com.dcinside.app.ad.util;

import android.content.Context;
import android.view.ViewGroup;
import com.kakao.adfit.ads.AdListener;
import com.kakao.adfit.ads.ba.BannerAdView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class d extends a {
    @l
    private final String c;
    @m
    private WeakReference d;
    @l
    private WeakReference e;
    private boolean f;

    public d(@l ViewGroup viewGroup0, @l String s) {
        L.p(viewGroup0, "parent");
        L.p(s, "id");
        super();
        this.c = s;
        this.e = new WeakReference(viewGroup0);
    }

    @Override  // com.dcinside.app.ad.util.a
    public boolean a() {
        return this.f;
    }

    @Override  // com.dcinside.app.ad.util.a
    public void e() {
        this.i(true);
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            BannerAdView bannerAdView0 = (BannerAdView)weakReference0.get();
            if(bannerAdView0 != null) {
                bannerAdView0.destroy();
            }
        }
        WeakReference weakReference1 = this.d;
        if(weakReference1 != null) {
            weakReference1.clear();
        }
        this.d = null;
        this.e.clear();
    }

    @Override  // com.dcinside.app.ad.util.a
    public void f() {
        public static final class com.dcinside.app.ad.util.d.a implements AdListener {
            final d a;

            com.dcinside.app.ad.util.d.a(d d0) {
                this.a = d0;
                super();
            }

            @Override  // com.kakao.adfit.ads.AdListener
            public void onAdClicked() {
            }

            @Override  // com.kakao.adfit.ads.AdListener
            public void onAdFailed(int v) {
                if(this.a.a()) {
                    return;
                }
                this.a.c("AdFit ads failed: " + v);
            }

            @Override  // com.kakao.adfit.ads.AdListener
            public void onAdLoaded() {
            }
        }

        if(this.a()) {
            return;
        }
        ViewGroup viewGroup0 = (ViewGroup)this.e.get();
        if(viewGroup0 == null) {
            return;
        }
        if(viewGroup0.getId() == 0x7F0B007D) {  // id:ad_container_view
            viewGroup0.setVisibility(0);
        }
        s.c(viewGroup0);
        Context context0 = viewGroup0.getContext();
        L.o(context0, "getContext(...)");
        BannerAdView bannerAdView0 = new BannerAdView(context0, null, 0, 6, null);
        bannerAdView0.setAdListener(new com.dcinside.app.ad.util.d.a(this));
        bannerAdView0.setClientId(this.c);
        bannerAdView0.loadAd();
        viewGroup0.addView(bannerAdView0);
        this.d = new WeakReference(bannerAdView0);
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            BannerAdView bannerAdView0 = (BannerAdView)weakReference0.get();
            if(bannerAdView0 != null) {
                bannerAdView0.pause();
            }
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            BannerAdView bannerAdView0 = (BannerAdView)weakReference0.get();
            if(bannerAdView0 != null) {
                bannerAdView0.resume();
            }
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void i(boolean z) {
        this.f = z;
    }

    @l
    public final String j() {
        return this.c;
    }
}

