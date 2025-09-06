package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.core.configuration.IExperiments;

public class BiddingManagerFactory {
    private static BiddingManagerFactory instance;

    public BiddingBaseManager createManager(IUnityAdsTokenListener iUnityAdsTokenListener0, IExperiments iExperiments0) {
        return GMA.getInstance().hasSCARBiddingSupport() ? this.getExperiment(iUnityAdsTokenListener0, iExperiments0) : new BiddingDisabledManager(iUnityAdsTokenListener0);
    }

    private BiddingBaseManager getExperiment(IUnityAdsTokenListener iUnityAdsTokenListener0, IExperiments iExperiments0) {
        return iExperiments0 == null || iExperiments0.getScarBiddingManager() == null || com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory.1.$SwitchMap$com$unity3d$services$ads$gmascar$managers$ScarBiddingManagerType[ScarBiddingManagerType.fromName(iExperiments0.getScarBiddingManager()).ordinal()] != 1 ? new BiddingDisabledManager(iUnityAdsTokenListener0) : new BiddingEagerManager(iExperiments0.isScarBannerHbEnabled(), iUnityAdsTokenListener0);
    }

    public static BiddingManagerFactory getInstance() {
        if(BiddingManagerFactory.instance == null) {
            BiddingManagerFactory.instance = new BiddingManagerFactory();
        }
        return BiddingManagerFactory.instance;
    }
}

