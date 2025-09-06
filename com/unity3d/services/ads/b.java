package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsLoadListener;

public final class b implements Runnable {
    public final IUnityAdsLoadListener a;
    public final String b;

    public b(IUnityAdsLoadListener iUnityAdsLoadListener0, String s) {
        this.a = iUnityAdsLoadListener0;
        this.b = s;
    }

    @Override
    public final void run() {
        UnityAdsImplementation.lambda$load$1(this.a, this.b);
    }
}

