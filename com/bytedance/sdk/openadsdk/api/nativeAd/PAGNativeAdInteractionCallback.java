package com.bytedance.sdk.openadsdk.api.nativeAd;

public abstract class PAGNativeAdInteractionCallback implements PAGNativeAdInteractionListener {
    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
    }
}

