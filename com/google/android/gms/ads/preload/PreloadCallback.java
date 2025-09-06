package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;

public interface PreloadCallback {
    void onAdsAvailable(@NonNull PreloadConfiguration arg1);

    void onAdsExhausted(@NonNull PreloadConfiguration arg1);
}

