package com.unity3d.services.banners;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;

public class BannerErrorInfo {
    public BannerErrorCode errorCode;
    public String errorMessage;

    public BannerErrorInfo(String s, BannerErrorCode bannerErrorCode0) {
        this.errorCode = bannerErrorCode0;
        this.errorMessage = s;
    }

    public static BannerErrorInfo fromLoadError(UnityAdsLoadError unityAds$UnityAdsLoadError0, String s) {
        switch(com.unity3d.services.banners.BannerErrorInfo.1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAds$UnityAdsLoadError0.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                return new BannerErrorInfo(s, BannerErrorCode.NATIVE_ERROR);
            }
            case 4: {
                return new BannerErrorInfo(s, BannerErrorCode.WEBVIEW_ERROR);
            }
            case 5: {
                return new BannerErrorInfo(s, BannerErrorCode.NO_FILL);
            }
            default: {
                return new BannerErrorInfo(s, BannerErrorCode.UNKNOWN);
            }
        }
    }

    public UnityAdsLoadError toLoadError() {
        switch(this.errorCode) {
            case 1: {
                return UnityAdsLoadError.INVALID_ARGUMENT;
            }
            case 2: {
                return UnityAdsLoadError.NO_FILL;
            }
            case 3: {
                return UnityAdsLoadError.INTERNAL_ERROR;
            }
            default: {
                return UnityAdsLoadError.INTERNAL_ERROR;
            }
        }
    }
}

