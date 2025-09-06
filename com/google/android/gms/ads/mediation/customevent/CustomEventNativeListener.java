package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

@Deprecated
public interface CustomEventNativeListener extends CustomEventListener {
    void onAdImpression();

    void onAdLoaded(@NonNull UnifiedNativeAdMapper arg1);
}

