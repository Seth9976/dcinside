package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;

public class BiddingEagerManager extends BiddingBaseManager {
    public BiddingEagerManager(boolean z, IUnityAdsTokenListener iUnityAdsTokenListener0) {
        super(z, iUnityAdsTokenListener0);
    }

    @Override  // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager
    public void start() {
        this.permitSignalsUpload();
        this.fetchSignals();
    }
}

