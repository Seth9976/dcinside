package com.unity3d.services.ads.operation.load;

import P2.d;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.Configuration;

public class LoadBannerOperationState extends LoadOperationState {
    private d _scarAdMetadata;
    private UnityBannerSize _size;

    public LoadBannerOperationState(String s, String s1, UnityBannerSize unityBannerSize0, IUnityAdsLoadListener iUnityAdsLoadListener0, UnityAdsLoadOptions unityAdsLoadOptions0, Configuration configuration0) {
        super(s, iUnityAdsLoadListener0, unityAdsLoadOptions0, configuration0);
        this.id = s1;
        this._size = unityBannerSize0;
    }

    public d getScarAdMetadata() {
        return this._scarAdMetadata;
    }

    public UnityBannerSize getSize() {
        return this._size;
    }

    public boolean isScarAd() {
        return this._scarAdMetadata != null;
    }

    public void setScarAdMetadata(d d0) {
        this._scarAdMetadata = d0;
    }

    public void setSize(UnityBannerSize unityBannerSize0) {
        this._size = unityBannerSize0;
    }
}

