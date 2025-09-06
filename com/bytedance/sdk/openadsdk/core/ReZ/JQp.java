package com.bytedance.sdk.openadsdk.core.ReZ;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;

public class JQp implements PAGBannerAdWrapperListener {
    private final PAGBannerAdInteractionListener PjT;

    public JQp(PAGBannerAdInteractionListener pAGBannerAdInteractionListener0) {
        this.PjT = pAGBannerAdInteractionListener0;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener0 = this.PjT;
        if(pAGBannerAdInteractionListener0 != null) {
            pAGBannerAdInteractionListener0.onAdClicked();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener0 = this.PjT;
        if(pAGBannerAdInteractionListener0 != null) {
            pAGBannerAdInteractionListener0.onAdDismissed();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view0, int v) {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener0 = this.PjT;
        if(pAGBannerAdInteractionListener0 != null) {
            pAGBannerAdInteractionListener0.onAdShowed();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view0, String s, int v) {
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(View view0, float f, float f1) {
    }
}

