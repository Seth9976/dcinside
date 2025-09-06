package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsInitializationListener;

public final class c implements Runnable {
    public final IUnityAdsInitializationListener a;

    public c(IUnityAdsInitializationListener iUnityAdsInitializationListener0) {
        this.a = iUnityAdsInitializationListener0;
    }

    @Override
    public final void run() {
        UnityAdsImplementation.lambda$initialize$0(this.a);
    }
}

