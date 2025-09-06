package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;
import z3.n;

public final class UnityAds {
    public static enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED;

        private static final UnityAdsInitializationError[] $values() [...] // Inlined contents
    }

    public static enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT;

        private static final UnityAdsLoadError[] $values() [...] // Inlined contents
    }

    public static enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED;

        private static final UnityAdsShowCompletionState[] $values() [...] // Inlined contents
    }

    public static enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT;

        private static final UnityAdsShowError[] $values() [...] // Inlined contents
    }

    @l
    public static final UnityAds INSTANCE;

    static {
        UnityAds.INSTANCE = new UnityAds();
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    @n
    public static void getDebugMode$annotations() {
    }

    @m
    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    @n
    public static final void getToken(@m IUnityAdsTokenListener iUnityAdsTokenListener0) {
        UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener0);
    }

    @n
    public static void getToken$annotations() {
    }

    @l
    public static final String getVersion() {
        String s = UnityAdsImplementation.getInstance().getVersion();
        L.o(s, "getInstance().version");
        return s;
    }

    @n
    public static void getVersion$annotations() {
    }

    @n
    public static final void initialize(@m Context context0, @m String s) {
        UnityAdsImplementation.getInstance().initialize(context0, s, false, null);
    }

    @n
    public static final void initialize(@m Context context0, @m String s, @m IUnityAdsInitializationListener iUnityAdsInitializationListener0) {
        UnityAdsImplementation.getInstance().initialize(context0, s, false, iUnityAdsInitializationListener0);
    }

    @n
    public static final void initialize(@m Context context0, @m String s, boolean z) {
        UnityAdsImplementation.getInstance().initialize(context0, s, z, null);
    }

    @n
    public static final void initialize(@m Context context0, @m String s, boolean z, @m IUnityAdsInitializationListener iUnityAdsInitializationListener0) {
        UnityAdsImplementation.getInstance().initialize(context0, s, z, iUnityAdsInitializationListener0);
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    @n
    public static void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    @n
    public static void isSupported$annotations() {
    }

    @k(message = "")
    @n
    public static final void load(@m String s) {
        UnityAds.load(s, new IUnityAdsLoadListener() {
            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(@l String s) {
                L.p(s, "placementId");
            }

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(@l String s, @l UnityAdsLoadError unityAds$UnityAdsLoadError0, @l String s1) {
                L.p(s, "placementId");
                L.p(unityAds$UnityAdsLoadError0, "error");
                L.p(s1, "message");
            }
        });
    }

    @n
    public static final void load(@m String s, @m IUnityAdsLoadListener iUnityAdsLoadListener0) {
        UnityAdsImplementation.getInstance().load(s, new UnityAdsLoadOptions(), iUnityAdsLoadListener0);
    }

    @n
    public static final void load(@m String s, @m UnityAdsLoadOptions unityAdsLoadOptions0, @m IUnityAdsLoadListener iUnityAdsLoadListener0) {
        IUnityAds iUnityAds0 = UnityAdsImplementation.getInstance();
        if(unityAdsLoadOptions0 == null) {
            unityAdsLoadOptions0 = new UnityAdsLoadOptions();
        }
        iUnityAds0.load(s, unityAdsLoadOptions0, iUnityAdsLoadListener0);
    }

    public static final void setDebugMode(boolean z) {
        UnityAdsImplementation.getInstance().setDebugMode(z);
    }

    @k(message = "")
    @n
    public static final void show(@m Activity activity0, @m String s) {
        UnityAdsImplementation.getInstance().show(activity0, s, new UnityAdsShowOptions(), null);
    }

    @n
    public static final void show(@m Activity activity0, @m String s, @m IUnityAdsShowListener iUnityAdsShowListener0) {
        UnityAdsImplementation.getInstance().show(activity0, s, new UnityAdsShowOptions(), iUnityAdsShowListener0);
    }

    @k(message = "")
    @n
    public static final void show(@m Activity activity0, @m String s, @m UnityAdsShowOptions unityAdsShowOptions0) {
        UnityAdsImplementation.getInstance().show(activity0, s, unityAdsShowOptions0, null);
    }

    @n
    public static final void show(@m Activity activity0, @m String s, @m UnityAdsShowOptions unityAdsShowOptions0, @m IUnityAdsShowListener iUnityAdsShowListener0) {
        UnityAdsImplementation.getInstance().show(activity0, s, unityAdsShowOptions0, iUnityAdsShowListener0);
    }
}

