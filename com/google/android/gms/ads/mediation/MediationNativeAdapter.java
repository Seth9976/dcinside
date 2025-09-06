package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public interface MediationNativeAdapter extends MediationAdapter {
    void requestNativeAd(@NonNull Context arg1, @NonNull MediationNativeListener arg2, @NonNull Bundle arg3, @NonNull NativeMediationAdRequest arg4, @Nullable Bundle arg5);
}

