package com.bytedance.sdk.openadsdk.component.ReZ;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class Zh implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener PjT;

    public Zh(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0) {
        this.PjT = pAGInterstitialAdLoadListener0;
    }

    public void PjT(PAGInterstitialAd pAGInterstitialAd0) {
        if(this.PjT != null) {
            Jo.PjT(new Runnable() {
                final Zh Zh;

                @Override
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0 = Zh.this.PjT;
                    if(pAGInterstitialAdLoadListener0 != null) {
                        pAGInterstitialAdLoadListener0.onAdLoaded(pAGInterstitialAd0);
                    }
                }
            });
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onAdLoaded(Object object0) {
        this.PjT(((PAGInterstitialAd)object0));
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onError(int v, String s) {
        if(this.PjT != null) {
            Jo.PjT(new Runnable() {
                final Zh ReZ;

                @Override
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0 = Zh.this.PjT;
                    if(pAGInterstitialAdLoadListener0 != null) {
                        pAGInterstitialAdLoadListener0.onError(v, s);
                    }
                }
            });
        }
    }
}

