package com.igaworks.ssp.plugin.unity;

public interface AdPopcornSSPUnityNativeListener {
    void OnNativeAdLoadFailed(int arg1, String arg2);

    void OnNativeAdLoadSuccess(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8);
}

