package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.ReZ;

public final class PAGBannerSize {
    public static final PAGBannerSize BANNER_W_300_H_250;
    public static final PAGBannerSize BANNER_W_320_H_50;
    public static final PAGBannerSize BANNER_W_728_H_90;
    private int PjT;
    private int ReZ;
    private int Zh;
    private int cr;

    static {
        PAGBannerSize.BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
        PAGBannerSize.BANNER_W_300_H_250 = new PAGBannerSize(300, 0xFA);
        PAGBannerSize.BANNER_W_728_H_90 = new PAGBannerSize(728, 90);
    }

    public PAGBannerSize(int v, int v1) {
        this.ReZ = 1;
        this.PjT = v;
        this.Zh = v1;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context0, int v) {
        int v1 = ReZ.PjT(context0, v, 0);
        if(v1 == ReZ.PjT) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize0 = new PAGBannerSize(v, v1);
        pAGBannerSize0.ReZ = 2;
        return pAGBannerSize0;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context0, int v) {
        int v1 = ReZ.PjT(context0, 0);
        if(v1 == ReZ.PjT) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize0 = new PAGBannerSize(v, 0);
        pAGBannerSize0.cr = v1;
        pAGBannerSize0.ReZ = 3;
        return pAGBannerSize0;
    }

    public int getHeight() {
        return this.Zh;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int v, int v1) {
        PAGBannerSize pAGBannerSize0 = new PAGBannerSize(v, 0);
        pAGBannerSize0.cr = v1;
        pAGBannerSize0.ReZ = 3;
        return pAGBannerSize0;
    }

    public int getMaxHeight() {
        return this.cr;
    }

    public int getType() {
        return this.ReZ;
    }

    public int getWidth() {
        return this.PjT;
    }
}

