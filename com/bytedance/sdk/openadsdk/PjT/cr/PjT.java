package com.bytedance.sdk.openadsdk.PjT.cr;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class PjT implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener PjT;

    public PjT(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener0) {
        this.PjT = pAGAppOpenAdLoadListener0;
    }

    public void PjT(PAGAppOpenAd pAGAppOpenAd0) {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final PjT Zh;

            @Override
            public void run() {
                if(PjT.this.PjT != null) {
                    PjT.this.PjT.onAdLoaded(pAGAppOpenAd0);
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onAdLoaded(Object object0) {
        this.PjT(((PAGAppOpenAd)object0));
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

