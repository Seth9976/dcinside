package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

public class PAGBiddingRequest {
    private PAGBannerSize PjT;
    private String ReZ;
    private String Zh;

    public PAGBiddingRequest() {
        this.PjT = null;
        this.Zh = null;
        this.ReZ = null;
    }

    public String getAdxId() {
        return this.ReZ;
    }

    public PAGBannerSize getBannerSize() {
        return this.PjT;
    }

    public String getSlotId() {
        return this.Zh;
    }

    public void setAdxId(String s) {
        this.ReZ = s;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize0) {
        this.PjT = pAGBannerSize0;
    }

    public void setSlotId(String s) {
        this.Zh = s;
    }
}

