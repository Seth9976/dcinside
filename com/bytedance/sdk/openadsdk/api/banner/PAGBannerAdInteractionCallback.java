package com.bytedance.sdk.openadsdk.api.banner;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

public abstract class PAGBannerAdInteractionCallback implements PAGBannerAdInteractionListener {
    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    @Deprecated
    public void onAdShowFailed(@NonNull PAGErrorModel pAGErrorModel0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
    }
}

