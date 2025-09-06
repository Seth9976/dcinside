package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsTokenListener;

public final class a implements Runnable {
    public final IUnityAdsTokenListener a;

    public a(IUnityAdsTokenListener iUnityAdsTokenListener0) {
        this.a = iUnityAdsTokenListener0;
    }

    @Override
    public final void run() {
        UnityAdsImplementation.lambda$getToken$2(this.a);
    }
}

