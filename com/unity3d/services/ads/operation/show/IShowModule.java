package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.services.ads.operation.IAdModule;

public interface IShowModule extends IAdModule {
    void onUnityAdsShowClick(String arg1);

    void onUnityAdsShowComplete(String arg1, UnityAdsShowCompletionState arg2);

    void onUnityAdsShowConsent(String arg1);

    void onUnityAdsShowFailure(String arg1, UnityAdsShowError arg2, String arg3);

    void onUnityAdsShowStart(String arg1);
}

