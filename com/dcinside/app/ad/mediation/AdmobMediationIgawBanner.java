package com.dcinside.app.ad.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventBanner;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdmobMediationIgawBanner implements CustomEventBanner, IBannerEventCallbackListener {
    @l
    private final String a;
    @m
    private AdPopcornSSPBannerAd b;
    @m
    private CustomEventBannerListener c;

    public AdmobMediationIgawBanner() {
        this.a = "com.igaworks.ssp";
    }

    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
    public void OnBannerAdClicked() {
        CustomEventBannerListener customEventBannerListener0 = this.c;
        if(customEventBannerListener0 != null) {
            customEventBannerListener0.onAdClicked();
        }
    }

    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
    public void OnBannerAdReceiveFailed(@m SSPErrorCode sSPErrorCode0) {
        String s = null;
        Integer integer0 = sSPErrorCode0 == null ? null : sSPErrorCode0.getErrorCode();
        if(integer0 != null && ((int)integer0) == 5002 || integer0 != null && ((int)integer0) == 5001) {
            CustomEventBannerListener customEventBannerListener0 = this.c;
            if(customEventBannerListener0 != null) {
                customEventBannerListener0.onAdFailedToLoad(new AdError(3, sSPErrorCode0.getErrorMessage(), this.a));
            }
        }
        else if(integer0 != null && ((int)integer0) == 0x270F || integer0 != null && ((int)integer0) == 5000) {
            CustomEventBannerListener customEventBannerListener1 = this.c;
            if(customEventBannerListener1 != null) {
                customEventBannerListener1.onAdFailedToLoad(new AdError(2, sSPErrorCode0.getErrorMessage(), this.a));
            }
        }
        else if(integer0 != null && ((int)integer0) == 2030 || integer0 != null && ((int)integer0) == 2000) {
            CustomEventBannerListener customEventBannerListener2 = this.c;
            if(customEventBannerListener2 != null) {
                customEventBannerListener2.onAdFailedToLoad(new AdError(8, sSPErrorCode0.getErrorMessage(), this.a));
            }
        }
        else {
            CustomEventBannerListener customEventBannerListener3 = this.c;
            if(customEventBannerListener3 != null) {
                if(sSPErrorCode0 != null) {
                    s = sSPErrorCode0.getErrorMessage();
                }
                if(s == null) {
                    s = "unknown_error";
                }
                customEventBannerListener3.onAdFailedToLoad(new AdError(0, s, this.a));
            }
        }
    }

    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
    public void OnBannerAdReceiveSuccess() {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.b;
        if(adPopcornSSPBannerAd0 == null) {
            CustomEventBannerListener customEventBannerListener0 = this.c;
            if(customEventBannerListener0 != null) {
                customEventBannerListener0.onAdFailedToLoad(new AdError(1, "view_gone", this.a));
            }
        }
        else {
            CustomEventBannerListener customEventBannerListener1 = this.c;
            if(customEventBannerListener1 != null) {
                customEventBannerListener1.onAdLoaded(adPopcornSSPBannerAd0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.b;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.stopAd();
        }
        this.b = null;
        this.c = null;
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.b;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.onPause();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.b;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.onResume();
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
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = new AdPopcornSSPBannerAd(context0);
        adPopcornSSPBannerAd0.setBannerEventCallbackListener(this);
        adPopcornSSPBannerAd0.setPlacementId(s);
        adPopcornSSPBannerAd0.setRefreshTime(-1);
        if(adSize0.getWidth() != 300 || adSize0.getHeight() != 0xFA) {
            adPopcornSSPBannerAd0.setAdSize(com.igaworks.ssp.AdSize.BANNER_320x50);
        }
        else {
            adPopcornSSPBannerAd0.setAdSize(com.igaworks.ssp.AdSize.BANNER_300x250);
        }
        this.b = adPopcornSSPBannerAd0;
        adPopcornSSPBannerAd0.loadAd();
    }
}

