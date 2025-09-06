package com.unity3d.services.ads.gmascar.models;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import y4.m;

public class BiddingSignals {
    private final String bannerSignal;
    private final String interstitialSignal;
    private final String rvSignal;

    public BiddingSignals(String s, String s1) {
        this.rvSignal = s;
        this.interstitialSignal = s1;
        this.bannerSignal = "";
    }

    public BiddingSignals(String s, String s1, String s2) {
        this.rvSignal = s;
        this.interstitialSignal = s1;
        this.bannerSignal = s2;
    }

    @m
    public String getBannerSignal() {
        return this.bannerSignal;
    }

    @m
    public String getInterstitialSignal() {
        return this.interstitialSignal;
    }

    public Map getMap() {
        Map map0 = new HashMap();
        if(!TextUtils.isEmpty(this.getRvSignal())) {
            map0.put("rv", this.getRvSignal());
        }
        if(!TextUtils.isEmpty(this.getInterstitialSignal())) {
            map0.put("in", this.getInterstitialSignal());
        }
        if(!TextUtils.isEmpty(this.getBannerSignal())) {
            map0.put("bn", this.getBannerSignal());
        }
        return map0;
    }

    @m
    public String getRvSignal() {
        return this.rvSignal;
    }

    // 去混淆评级： 低(30)
    public boolean isEmpty() {
        return TextUtils.isEmpty(this.getRvSignal()) && TextUtils.isEmpty(this.getInterstitialSignal()) && TextUtils.isEmpty(this.getBannerSignal());
    }
}

