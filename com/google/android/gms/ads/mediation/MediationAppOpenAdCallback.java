package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

public interface MediationAppOpenAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@NonNull AdError arg1);
}

