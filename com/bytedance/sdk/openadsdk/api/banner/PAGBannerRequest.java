package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize PjT;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize0) {
        this.PjT = pAGBannerSize0;
    }

    public PAGBannerSize getAdSize() {
        return this.PjT;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize0) {
        this.PjT = pAGBannerSize0;
    }
}

