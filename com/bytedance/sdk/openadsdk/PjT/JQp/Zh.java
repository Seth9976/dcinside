package com.bytedance.sdk.openadsdk.PjT.JQp;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class Zh implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener PjT;

    public Zh(PAGRewardedAdLoadListener pAGRewardedAdLoadListener0) {
        this.PjT = pAGRewardedAdLoadListener0;
    }

    public void PjT(PAGRewardedAd pAGRewardedAd0) {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final Zh Zh;

            @Override
            public void run() {
                if(Zh.this.PjT != null) {
                    Zh.this.PjT.onAdLoaded(pAGRewardedAd0);
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onAdLoaded(Object object0) {
        this.PjT(((PAGRewardedAd)object0));
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
            final Zh ReZ;

            @Override
            public void run() {
                if(Zh.this.PjT != null) {
                    Zh.this.PjT.onError(v, s);
                }
            }
        });
    }
}

