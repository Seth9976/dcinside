package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import y4.l;
import y4.m;
import z3.n;

public final class UnityServices {
    public static enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL;

        private static final UnityServicesError[] $values() [...] // Inlined contents
    }

    @l
    public static final UnityServices INSTANCE;
    private static final boolean isSupported;

    static {
        UnityServices.INSTANCE = new UnityServices();
        UnityServices.isSupported = true;
    }

    // 去混淆评级： 低(20)
    public static final boolean getDebugMode() [...] // 潜在的解密器

    @n
    public static void getDebugMode$annotations() {
    }

    @l
    public static final String getVersion() [...] // 潜在的解密器

    @n
    public static void getVersion$annotations() {
    }

    @n
    public static final void initialize(@m Context context0, @m String s, boolean z, @m IUnityAdsInitializationListener iUnityAdsInitializationListener0) {
        synchronized(UnityServices.class) {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(iUnityAdsInitializationListener0);
            SdkProperties.setTestMode(z);
            SdkProperties.setDebugMode(false);
            DeviceLog.info(("Initializing Unity Services 4.14.1 (" + 41401 + ") with game id " + s + " in " + (z ? "test mode" : "production mode") + ", session " + "7a343d69-f827-47c5-82a0-765df92fccd5"));
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, null), s, null, 2, null);
        }
    }

    // 去混淆评级： 低(20)
    public static final boolean isInitialized() [...] // 潜在的解密器

    @n
    public static void isInitialized$annotations() {
    }

    public static final boolean isSupported() [...] // 潜在的解密器

    @n
    public static void isSupported$annotations() {
    }

    public static final void setDebugMode(boolean z) {
        SdkProperties.setDebugMode(z);
    }
}

