package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.ads.operation.IAdModule;

public interface ILoadModule extends IAdModule {
    void onUnityAdsAdLoaded(String arg1);

    void onUnityAdsFailedToLoad(String arg1, UnityAdsLoadError arg2, String arg3);
}

