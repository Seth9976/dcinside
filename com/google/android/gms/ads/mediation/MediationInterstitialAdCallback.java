package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

public interface MediationInterstitialAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@NonNull AdError arg1);

    @Deprecated
    void onAdFailedToShow(@NonNull String arg1);

    void onAdLeftApplication();
}

