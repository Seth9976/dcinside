package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;

@Deprecated
public interface CustomEventInterstitial extends CustomEvent {
    void requestInterstitialAd(@NonNull Context arg1, @NonNull CustomEventInterstitialListener arg2, @Nullable String arg3, @NonNull MediationAdRequest arg4, @Nullable Bundle arg5);

    void showInterstitial();
}

