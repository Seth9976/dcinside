package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import kotlin.jvm.internal.L;
import y4.l;

public interface Listeners {
    public static final class DefaultImpls {
        public static void onClick(@l Listeners listeners0, @l String s) {
            L.p(s, "placementId");
        }

        public static void onComplete(@l Listeners listeners0, @l String s, @l UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
            L.p(s, "placementId");
            L.p(unityAds$UnityAdsShowCompletionState0, "state");
        }

        public static void onError(@l Listeners listeners0, @l String s, @l UnityAdsShowError unityAds$UnityAdsShowError0, @l String s1) {
            L.p(s, "placementId");
            L.p(unityAds$UnityAdsShowError0, "error");
            L.p(s1, "message");
        }

        public static void onLeftApplication(@l Listeners listeners0, @l String s) {
            L.p(s, "placementId");
        }

        public static void onStart(@l Listeners listeners0, @l String s) {
            L.p(s, "placementId");
        }
    }

    void onClick(@l String arg1);

    void onComplete(@l String arg1, @l UnityAdsShowCompletionState arg2);

    void onError(@l String arg1, @l UnityAdsShowError arg2, @l String arg3);

    void onLeftApplication(@l String arg1);

    void onStart(@l String arg1);
}

