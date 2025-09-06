package com.unity3d.services.core.properties;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds.UnityAdsInitializationError;

public final class a implements Runnable {
    public final IUnityAdsInitializationListener a;
    public final UnityAdsInitializationError b;
    public final String c;

    public a(IUnityAdsInitializationListener iUnityAdsInitializationListener0, UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
        this.a = iUnityAdsInitializationListener0;
        this.b = unityAds$UnityAdsInitializationError0;
        this.c = s;
    }

    @Override
    public final void run() {
        this.a.onInitializationFailed(this.b, this.c);
    }
}

