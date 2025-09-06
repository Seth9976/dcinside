package com.unity3d.ads;

public interface IUnityAdsLoadListener {
    void onUnityAdsAdLoaded(String arg1);

    void onUnityAdsFailedToLoad(String arg1, UnityAdsLoadError arg2, String arg3);
}

