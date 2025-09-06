package com.bytedance.sdk.openadsdk.PjT.Zh;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class XX implements cz {
    private final PAGNativeAdInteractionListener PjT;

    public XX(PAGNativeAdInteractionListener pAGNativeAdInteractionListener0) {
        this.PjT = pAGNativeAdInteractionListener0;
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.cz
    public void PjT() {
        Jo.PjT(new Runnable() {
            final XX PjT;

            @Override
            public void run() {
                if(XX.this.PjT != null) {
                    XX.this.PjT.onAdDismissed();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.cz
    public void PjT(PAGNativeAd pAGNativeAd0) {
        Jo.PjT(new Runnable() {
            final XX PjT;

            @Override
            public void run() {
                if(XX.this.PjT != null) {
                    XX.this.PjT.onAdShowed();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.cz
    public boolean Zh() {
        return this.PjT != null;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        Jo.PjT(new Runnable() {
            final XX PjT;

            @Override
            public void run() {
                if(XX.this.PjT != null) {
                    XX.this.PjT.onAdClicked();
                }
            }
        });
    }
}

