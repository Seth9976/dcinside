package com.bytedance.sdk.openadsdk.PjT.Zh;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class JQp implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener PjT;

    public JQp(PAGNativeAdLoadListener pAGNativeAdLoadListener0) {
        this.PjT = pAGNativeAdLoadListener0;
    }

    public void PjT(PAGNativeAd pAGNativeAd0) {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final JQp Zh;

            @Override
            public void run() {
                if(JQp.this.PjT != null) {
                    JQp.this.PjT.onAdLoaded(pAGNativeAd0);
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public void onAdLoaded(Object object0) {
        this.PjT(((PAGNativeAd)object0));
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
            final JQp ReZ;

            @Override
            public void run() {
                if(JQp.this.PjT != null) {
                    JQp.this.PjT.onError(v, s);
                }
            }
        });
    }
}

