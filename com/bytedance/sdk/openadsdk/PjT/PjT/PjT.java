package com.bytedance.sdk.openadsdk.PjT.PjT;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class PjT implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener PjT;

    public PjT(PAGBannerAdLoadListener pAGBannerAdLoadListener0) {
        this.PjT = pAGBannerAdLoadListener0;
    }

    public void PjT(PAGBannerAd pAGBannerAd0) {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final PjT Zh;

            @Override
            public void run() {
                PjT.this.PjT.onAdLoaded(pAGBannerAd0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onAdLoaded(Object object0) {
        this.PjT(((PAGBannerAd)object0));
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
                PjT.this.PjT.onError(v, s);
            }
        });
    }
}

