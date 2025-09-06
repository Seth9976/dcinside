package com.unity3d.services.banners;

import android.view.View;

public interface IUnityBannerListener {
    void onUnityBannerClick(String arg1);

    void onUnityBannerError(String arg1);

    void onUnityBannerHide(String arg1);

    void onUnityBannerLoaded(String arg1, View arg2);

    void onUnityBannerShow(String arg1);

    void onUnityBannerUnloaded(String arg1);
}

