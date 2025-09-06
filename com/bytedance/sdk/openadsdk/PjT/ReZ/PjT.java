package com.bytedance.sdk.openadsdk.PjT.ReZ;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class PjT implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener PjT;

    public PjT(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0) {
        this.PjT = pAGInterstitialAdLoadListener0;
    }

    public void PjT(PAGInterstitialAd pAGInterstitialAd0) {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final PjT Zh;

            @Override
            public void run() {
                if(PjT.this.PjT != null) {
                    PjT.this.PjT.onAdLoaded(pAGInterstitialAd0);
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onAdLoaded(Object object0) {
        this.PjT(((PAGInterstitialAd)object0));
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onError(int v, String s) {
        if(this.PjT == null) {
            return;
        }
        if(s == null) {
            s = "Unknown exception.";
        }
        Jo.PjT(new Runnable() {
            final PjT ReZ;

            @Override
            public void run() {
                if(PjT.this.PjT != null) {
                    PjT.this.PjT.onError(v, s);
                }
            }
        });
    }
}

