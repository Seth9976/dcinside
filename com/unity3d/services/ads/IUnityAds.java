package com.unity3d.services.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;

public interface IUnityAds {
    boolean getDebugMode();

    @Nullable
    String getToken();

    void getToken(IUnityAdsTokenListener arg1);

    String getVersion();

    void initialize(Context arg1, String arg2, boolean arg3, IUnityAdsInitializationListener arg4);

    boolean isInitialized();

    boolean isSupported();

    void load(String arg1, UnityAdsLoadOptions arg2, IUnityAdsLoadListener arg3);

    void setDebugMode(boolean arg1);

    void show(Activity arg1, String arg2, UnityAdsShowOptions arg3, IUnityAdsShowListener arg4);
}

