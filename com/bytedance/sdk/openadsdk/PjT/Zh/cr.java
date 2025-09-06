package com.bytedance.sdk.openadsdk.PjT.Zh;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData.PAGNativeMediaType;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.Owx;

public class cr implements PAGNativeAdData {
    private final PjT PjT;

    public cr(PjT pjT0) {
        this.PjT = pjT0;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        return this.PjT == null ? null : this.PjT.qj();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        return this.PjT == null ? null : this.PjT.DWo();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        return this.PjT == null ? null : this.PjT.cz();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        return this.PjT == null ? null : this.PjT.JQp();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        return this.PjT == null ? null : this.PjT.ReZ();
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeMediaType getMediaType() {
        return Owx.JQp(this.PjT.PjT) ? PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        return this.PjT == null ? null : this.PjT.XX();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        return this.PjT == null ? null : this.PjT.cr();
    }
}

