package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public enum AdFormat {
    @NonNull
    BANNER(0),
    @NonNull
    INTERSTITIAL(1),
    @NonNull
    REWARDED(2),
    @NonNull
    REWARDED_INTERSTITIAL(3),
    @NonNull
    NATIVE(4),
    @NonNull
    APP_OPEN_AD(6);

    private final int zzb;

    private AdFormat(int v1) {
        this.zzb = v1;
    }

    @Nullable
    public static AdFormat getAdFormat(int v) {
        AdFormat[] arr_adFormat = AdFormat.values();
        for(int v1 = 0; v1 < arr_adFormat.length; ++v1) {
            AdFormat adFormat0 = arr_adFormat[v1];
            if(adFormat0.getValue() == v) {
                return adFormat0;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zzb;
    }
}

