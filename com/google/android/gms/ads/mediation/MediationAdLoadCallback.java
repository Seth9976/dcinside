package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import o3.j;

@j
public interface MediationAdLoadCallback {
    void onFailure(@NonNull AdError arg1);

    @Deprecated
    void onFailure(@NonNull String arg1);

    @NonNull
    Object onSuccess(@NonNull Object arg1);
}

