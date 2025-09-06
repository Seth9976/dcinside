package com.dcinside.app.ad.mediation;

import android.content.Context;
import android.os.Bundle;
import com.fsn.cauly.CaulyAdInfo;
import com.fsn.cauly.CaulyAdInfoBuilder;
import com.fsn.cauly.CaulyAdView;
import com.fsn.cauly.CaulyAdViewListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventBanner;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdmobMediationCaulyBanner implements CaulyAdViewListener, CustomEventBanner {
    @l
    private final String a;
    @m
    private CaulyAdView b;
    @m
    private CustomEventBannerListener c;

    public AdmobMediationCaulyBanner() {
        this.a = "com.fsn.cauly";
    }

    private final CaulyAdInfo a(String s) {
        return new CaulyAdInfoBuilder(s).tagForChildDirectedTreatment(false).effect("None").bannerHeight("Fixed_50").build();
    }

    @Override  // com.fsn.cauly.CaulyAdViewListener
    public void onCloseLandingScreen(@m CaulyAdView caulyAdView0) {
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        CaulyAdView caulyAdView0 = this.b;
        if(caulyAdView0 != null) {
            caulyAdView0.destroy();
        }
        this.b = null;
        this.c = null;
    }

    @Override  // com.fsn.cauly.CaulyAdViewListener
    public void onFailedToReceiveAd(@m CaulyAdView caulyAdView0, int v, @m String s) {
        CustomEventBannerListener customEventBannerListener0 = this.c;
        if(customEventBannerListener0 == null) {
            return;
        }
        switch(v) {
            case -200: {
                if(s == null) {
                    s = "no_fill";
                }
                customEventBannerListener0.onAdFailedToLoad(new AdError(3, s, this.a));
                return;
            }
            case -100: {
                if(s == null) {
                    s = "internal_error";
                }
                customEventBannerListener0.onAdFailedToLoad(new AdError(0, s, this.a));
                return;
            }
            case 200: {
                if(s == null) {
                    s = "no_fill";
                }
                customEventBannerListener0.onAdFailedToLoad(new AdError(3, s, this.a));
                return;
            }
            case 400: {
                if(s == null) {
                    s = "invalid_request";
                }
                customEventBannerListener0.onAdFailedToLoad(new AdError(1, s, this.a));
                return;
            }
            case 500: {
                if(s == null) {
                    s = "network_error";
                }
                customEventBannerListener0.onAdFailedToLoad(new AdError(2, s, this.a));
                return;
            }
            default: {
                if(s == null) {
                    s = "unknown_error";
                }
                customEventBannerListener0.onAdFailedToLoad(new AdError(0, s, this.a));
            }
        }
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
        CaulyAdView caulyAdView0 = this.b;
        if(caulyAdView0 != null) {
            caulyAdView0.pause();
        }
    }

    @Override  // com.fsn.cauly.CaulyAdViewListener
    public void onReceiveAd(@m CaulyAdView caulyAdView0, boolean z) {
        if(!z) {
            CustomEventBannerListener customEventBannerListener0 = this.c;
            if(customEventBannerListener0 != null) {
                customEventBannerListener0.onAdFailedToLoad(new AdError(0, "no_chargeable", this.a));
            }
        }
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
        CaulyAdView caulyAdView0 = this.b;
        if(caulyAdView0 != null) {
            caulyAdView0.resume();
        }
    }

    @Override  // com.fsn.cauly.CaulyAdViewListener
    public void onShowLandingScreen(@m CaulyAdView caulyAdView0) {
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
        CaulyAdView caulyAdView0 = new CaulyAdView(context0);
        caulyAdView0.setAdInfo(this.a(s));
        caulyAdView0.setAdViewListener(this);
        this.b = caulyAdView0;
        customEventBannerListener0.onAdLoaded(caulyAdView0);
    }
}

