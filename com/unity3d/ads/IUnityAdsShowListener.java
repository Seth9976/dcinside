package com.unity3d.ads;

public interface IUnityAdsShowListener {
    void onUnityAdsShowClick(String arg1);

    void onUnityAdsShowComplete(String arg1, UnityAdsShowCompletionState arg2);

    void onUnityAdsShowFailure(String arg1, UnityAdsShowError arg2, String arg3);

    void onUnityAdsShowStart(String arg1);
}

