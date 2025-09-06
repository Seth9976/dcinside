package com.unity3d.ads.core.extensions;

import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.L;
import y4.l;

public final class ShowStatusExtensionsKt {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ShowStatus.values().length];
            try {
                arr_v[ShowStatus.COMPLETED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShowStatus.SKIPPED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    public static final UnityAdsShowCompletionState toUnityAdsShowCompletionState(@l ShowStatus showStatus0) {
        L.p(showStatus0, "<this>");
        switch(showStatus0) {
            case 1: {
                return UnityAdsShowCompletionState.COMPLETED;
            }
            case 2: {
                return UnityAdsShowCompletionState.SKIPPED;
            }
            default: {
                throw new IllegalStateException("Unexpected show status: " + showStatus0);
            }
        }
    }
}

