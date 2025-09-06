package com.dcinside.app.ad.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventBanner;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import com.kakao.adfit.ads.AdListener;
import com.kakao.adfit.ads.ba.BannerAdView;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdmobMediationAdfitBanner implements CustomEventBanner, AdListener {
    @l
    private final String a;
    @m
    private BannerAdView b;
    @m
    private CustomEventBannerListener c;

    public AdmobMediationAdfitBanner() {
        this.a = "com.kakao.adfit";
    }

    @Override  // com.kakao.adfit.ads.AdListener
    public void onAdClicked() {
        CustomEventBannerListener customEventBannerListener0 = this.c;
        if(customEventBannerListener0 != null) {
            customEventBannerListener0.onAdClicked();
        }
    }

    @Override  // com.kakao.adfit.ads.AdListener
    public void onAdFailed(int v) {
        CustomEventBannerListener customEventBannerListener0 = this.c;
        if(customEventBannerListener0 == null) {
            return;
        }
        switch(v) {
            case 202: {
                customEventBannerListener0.onAdFailedToLoad(new AdError(2, "network_error", this.a));
                return;
            }
            case 301: {
                customEventBannerListener0.onAdFailedToLoad(new AdError(1, "invalid_request", this.a));
                return;
            }
            case 302: {
                customEventBannerListener0.onAdFailedToLoad(new AdError(3, "no_fill", this.a));
                return;
            }
            case 501: {
                customEventBannerListener0.onAdFailedToLoad(new AdError(2, "load_failed", this.a));
                return;
            }
            case 601: {
                customEventBannerListener0.onAdFailedToLoad(new AdError(0, "internal_error", this.a));
                return;
            }
            default: {
                customEventBannerListener0.onAdFailedToLoad(new AdError(0, "unknown_error", this.a));
            }
        }
    }

    @Override  // com.kakao.adfit.ads.AdListener
    public void onAdLoaded() {
        BannerAdView bannerAdView0 = this.b;
        if(bannerAdView0 == null) {
            return;
        }
        CustomEventBannerListener customEventBannerListener0 = this.c;
        if(customEventBannerListener0 != null) {
            customEventBannerListener0.onAdLoaded(bannerAdView0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        BannerAdView bannerAdView0 = this.b;
        if(bannerAdView0 != null) {
            bannerAdView0.destroy();
        }
        this.b = null;
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
        BannerAdView bannerAdView0 = this.b;
        if(bannerAdView0 != null) {
            bannerAdView0.pause();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
        BannerAdView bannerAdView0 = this.b;
        if(bannerAdView0 != null) {
            bannerAdView0.resume();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventBanner
    public void requestBannerAd(@l Context context0, @l CustomEventBannerListener customEventBannerListener0, @m String s, @l AdSize adSize0, @l MediationAdRequest mediationAdRequest0, @m Bundle bundle0) {
        L.p(context0, "context");
        L.p(customEventBannerListener0, "listener");
        L.p(adSize0, "size");
        L.p(mediationAdRequest0, "mediationAdRequest");
        this.c = customEventBannerListener0;
        if(s == null) {
            customEventBannerListener0.onAdFailedToLoad(new AdError(8, "server_parameter_null", this.a));
            return;
        }
        BannerAdView bannerAdView0 = new BannerAdView(context0, null, 0, 6, null);
        bannerAdView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bannerAdView0.setAdListener(this);
        bannerAdView0.setClientId(s);
        bannerAdView0.loadAd();
        this.b = bannerAdView0;
    }
}

