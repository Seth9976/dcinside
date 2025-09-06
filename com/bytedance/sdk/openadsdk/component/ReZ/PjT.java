package com.bytedance.sdk.openadsdk.component.ReZ;

import com.bytedance.sdk.openadsdk.PjT.ReZ.Zh;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

public class PjT implements Zh {
    private final PAGInterstitialAdInteractionListener PjT;

    public PjT(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener0) {
        this.PjT = pAGInterstitialAdInteractionListener0;
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.ReZ.Zh
    public void PjT() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener0 = this.PjT;
        if(pAGInterstitialAdInteractionListener0 != null) {
            pAGInterstitialAdInteractionListener0.onAdShowed();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.ReZ.Zh
    public void Zh() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener0 = this.PjT;
        if(pAGInterstitialAdInteractionListener0 != null) {
            pAGInterstitialAdInteractionListener0.onAdDismissed();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener0 = this.PjT;
        if(pAGInterstitialAdInteractionListener0 != null) {
            pAGInterstitialAdInteractionListener0.onAdClicked();
        }
    }
}

