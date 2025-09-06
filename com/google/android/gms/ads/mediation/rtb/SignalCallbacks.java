package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import o3.j;

@j
public interface SignalCallbacks {
    void onFailure(@NonNull AdError arg1);

    @Deprecated
    void onFailure(@NonNull String arg1);

    void onSuccess(@NonNull String arg1);
}

