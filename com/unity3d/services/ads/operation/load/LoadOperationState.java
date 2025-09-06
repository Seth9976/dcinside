package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.ads.operation.OperationState;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;

public class LoadOperationState extends OperationState {
    public IUnityAdsLoadListener listener;
    public UnityAdsLoadOptions loadOptions;

    public LoadOperationState(String s, IUnityAdsLoadListener iUnityAdsLoadListener0, UnityAdsLoadOptions unityAdsLoadOptions0, Configuration configuration0) {
        super(s, configuration0);
        this.listener = iUnityAdsLoadListener0;
        this.loadOptions = unityAdsLoadOptions0;
    }

    public boolean isBanner() [...] // 潜在的解密器

    public boolean isHeaderBidding() {
        return this.loadOptions == null || this.loadOptions.getData() == null ? false : this.loadOptions.getData().has("adMarkup");
    }

    // 检测为 Lambda 实现
    private void lambda$onUnityAdsAdLoaded$1() [...]

    // 检测为 Lambda 实现
    private void lambda$onUnityAdsFailedToLoad$0(UnityAdsLoadError unityAds$UnityAdsLoadError0, String s) [...]

    public void onUnityAdsAdLoaded() {
        if(this.listener != null) {
            Utilities.wrapCustomerListener(() -> this.listener.onUnityAdsAdLoaded(this.placementId));
        }
    }

    public void onUnityAdsFailedToLoad(UnityAdsLoadError unityAds$UnityAdsLoadError0, String s) {
        if(this.listener != null) {
            Utilities.wrapCustomerListener(() -> this.listener.onUnityAdsFailedToLoad(this.placementId, unityAds$UnityAdsLoadError0, s));
        }
    }
}

