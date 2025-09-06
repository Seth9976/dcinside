package com.unity3d.services.banners.api;

import P2.d;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.ads.operation.load.ILoadOperation;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.properties.BannerRefreshInfo;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Banner {
    static enum BannerViewType {
        WEB_PLAYER,
        UNKNOWN;

        private static BannerViewType[] $values() [...] // Inlined contents

        public static BannerViewType fromString(String s) {
            try {
                return BannerViewType.valueOf(s);
            }
            catch(IllegalArgumentException unused_ex) {
                return BannerViewType.UNKNOWN;
            }
        }
    }

    private static LoadBannerOperationState getBannerOperationState(String s) {
        ILoadOperation iLoadOperation0 = (ILoadOperation)LoadBannerModule.getInstance().get(s);
        if(iLoadOperation0 != null && iLoadOperation0.getLoadOperationState() != null) {
            LoadOperationState loadOperationState0 = iLoadOperation0.getLoadOperationState();
            if(loadOperationState0 instanceof LoadBannerOperationState) {
                return (LoadBannerOperationState)loadOperationState0;
            }
            LoadBannerModule.getInstance().onUnityAdsFailedToLoad(s, UnityAdsLoadError.INTERNAL_ERROR, "Operation state found is not for banner ad");
            return null;
        }
        LoadBannerModule.getInstance().onUnityAdsFailedToLoad(s, UnityAdsLoadError.INTERNAL_ERROR, "No operation found for requested banner");
        return null;
    }

    @WebViewExposed
    public static void load(String s, Integer integer0, Integer integer1, String s1, WebViewCallback webViewCallback0) {
        switch(BannerViewType.fromString(s)) {
            case 1: {
                LoadBannerOperationState loadBannerOperationState0 = Banner.getBannerOperationState(s1);
                if(loadBannerOperationState0 != null) {
                    loadBannerOperationState0.setSize(new UnityBannerSize(((int)integer0), ((int)integer1)));
                    BannerViewCache.getInstance().loadBanner(loadBannerOperationState0);
                }
                break;
            }
            case 2: {
                LoadBannerModule.getInstance().onUnityAdsFailedToLoad(s1, UnityAdsLoadError.INTERNAL_ERROR, "Unknown banner type");
            }
        }
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void loadScar(String s, String s1, String s2, String s3, String s4, Integer integer0, Integer integer1, WebViewCallback webViewCallback0) {
        LoadBannerOperationState loadBannerOperationState0 = Banner.getBannerOperationState(s);
        if(loadBannerOperationState0 == null) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        loadBannerOperationState0.setSize(new UnityBannerSize(((int)integer0), ((int)integer1)));
        loadBannerOperationState0.setScarAdMetadata(new d(s1, s2, s3, s4, 0));
        BannerViewCache.getInstance().loadBanner(loadBannerOperationState0);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setRefreshRate(String s, Integer integer0, WebViewCallback webViewCallback0) {
        if(s != null && integer0 != null) {
            BannerRefreshInfo.getInstance().setRefreshRate(s, integer0);
        }
        webViewCallback0.invoke(new Object[0]);
    }
}

