package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class XX implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener PjT;

    public XX(PAGRewardedAdLoadListener pAGRewardedAdLoadListener0) {
        this.PjT = pAGRewardedAdLoadListener0;
    }

    public void PjT(PAGRewardedAd pAGRewardedAd0) {
        if(this.PjT != null) {
            Jo.PjT(new Runnable() {
                final XX Zh;

                @Override
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener0 = XX.this.PjT;
                    if(pAGRewardedAdLoadListener0 != null) {
                        pAGRewardedAdLoadListener0.onAdLoaded(pAGRewardedAd0);
                    }
                }
            });
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onAdLoaded(Object object0) {
        this.PjT(((PAGRewardedAd)object0));
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onError(int v, String s) {
        if(this.PjT != null) {
            Jo.PjT(new Runnable() {
                final XX ReZ;

                @Override
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener0 = XX.this.PjT;
                    if(pAGRewardedAdLoadListener0 != null) {
                        pAGRewardedAdLoadListener0.onError(v, s);
                    }
                }
            });
        }
    }
}

