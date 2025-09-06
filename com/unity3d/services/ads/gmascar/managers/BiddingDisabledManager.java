package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;

public class BiddingDisabledManager extends BiddingBaseManager {
    public BiddingDisabledManager(IUnityAdsTokenListener iUnityAdsTokenListener0) {
        super(false, iUnityAdsTokenListener0);
    }

    @Override  // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager
    public String getTokenIdentifier() {
        return null;
    }

    @Override  // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager
    public void start() {
    }
}

