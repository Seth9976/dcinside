package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public interface MediationInterstitialAdapter extends MediationAdapter {
    void requestInterstitialAd(@NonNull Context arg1, @NonNull MediationInterstitialListener arg2, @NonNull Bundle arg3, @NonNull MediationAdRequest arg4, @Nullable Bundle arg5);

    void showInterstitial();
}

