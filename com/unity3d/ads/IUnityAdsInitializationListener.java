package com.unity3d.ads;

public interface IUnityAdsInitializationListener {
    void onInitializationComplete();

    void onInitializationFailed(UnityAdsInitializationError arg1, String arg2);
}

