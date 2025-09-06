package com.unity3d.services.core.properties;

import com.unity3d.ads.IUnityAdsInitializationListener;

public final class b implements Runnable {
    public final IUnityAdsInitializationListener a;

    public b(IUnityAdsInitializationListener iUnityAdsInitializationListener0) {
        this.a = iUnityAdsInitializationListener0;
    }

    @Override
    public final void run() {
        this.a.onInitializationComplete();
    }
}

